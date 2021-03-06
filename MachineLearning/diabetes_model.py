from sklearn.linear_model import LogisticRegression
import pandas as pd
from sklearn.metrics import accuracy_score
import pyrebase

# CONNECTING FIREBASE TO PYTHON
firebaseConfig = {
    "apiKey": "AIzaSyDvcv6TG1E-IxUJWtcEDHRy0vDomFYd_YI",
    "authDomain": "medicheckv3.firebaseapp.com",
    "databaseURL": "https://medicheckv3-default-rtdb.firebaseio.com",
    "projectId": "medicheckv3",
    "storageBucket": "medicheckv3.appspot.com",
    "messagingSenderId": "797392677036",
    "appId": "1:797392677036:web:807322344187de73c75709",
    "measurementId": "G-QP4JH83Z7C",
}

# Connect to Firebase
firebase = pyrebase.initialize_app(firebaseConfig)

# Create reference to Firebase
db = firebase.database()

df = pd.read_csv('diabetes-training-set.csv')

"""
print("Diabetes data set dimensions : {}".format(df.shape))
print(df.groupby('outcome').size())
# Checking data where value is equal to 0
print("Total : ", df[df.bp == 0].shape[0])
print("Total : ", df[df.glucose == 0].shape[0])
print("Total : ", df[df.skinThickness == 0].shape[0])
print("Total : ", df[df.bmi == 0].shape[0])
print("Total : ", df[df.insulin == 0].shape[0])
"""

# Data Cleansing
df_clean = df[(df.bp != 0) & (df.bmi != 0) & (df.glucose != 0) & (df.skinThickness != 0) & (df.insulin != 0)]
# print(df_clean.shape)

# Define features
feature_names = ['pregnancies', 'glucose', 'bp', 'skinThickness', 'insulin', 'bmi', 'dpf', 'age']

# Create Input and Output
X = df_clean[feature_names]
y = df_clean.outcome

# Define Model
model = LogisticRegression(solver='lbfgs', max_iter=1000)

# Fit Model
model.fit(X, y)

# Make Predictions
y_pred = model.predict(X)

# Print Accuracy of Model
acc = accuracy_score(y, y_pred)
db.child("DiabetesResultAccuracy").child().set(f"{acc * 100:.2f}% Accurate")
