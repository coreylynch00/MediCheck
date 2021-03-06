package com.example.medicheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MediPredict extends AppCompatActivity {

    Button buttonDiabetes, buttonDiabetesResult, buttonHeartDisease, buttonHeartDiseaseResult, buttonBCancer, buttonBCancerResult;
    TextView moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medi_predict);

        ImageView logo = findViewById(R.id.imageViewLogo);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MediPredict.this, MainMenu.class));
            }
        });

        buttonDiabetes = findViewById(R.id.buttonDiabetesPredict);
        buttonDiabetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MediPredict.this, diabetesPredict.class));
            }
        });

        buttonDiabetesResult = findViewById(R.id.buttonDiabetesPredictResult);
        buttonDiabetesResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MediPredict.this, diabetesResult.class));
            }
        });

        buttonHeartDisease = findViewById(R.id.buttonHeartDiseasePredict);
        buttonHeartDisease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MediPredict.this, heartDiseasePredict.class));
            }
        });

        buttonHeartDiseaseResult = findViewById(R.id.buttonHeartDiseasePredictResult);
        buttonHeartDiseaseResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MediPredict.this, heartDiseaseResult.class));
            }
        });

        moreInfo = findViewById(R.id.textViewMoreInfo);
        moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MediPredict.this, MediPredictInfo.class));
            }
        });

        buttonBCancer = findViewById(R.id.buttonBCancerPredict);
        buttonBCancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MediPredict.this, bCancerPredict.class));
            }
        });

        buttonBCancerResult = findViewById(R.id.buttonBCancerPredictResult);
        buttonBCancerResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MediPredict.this, bCancerResult.class));
            }
        });
    }
}