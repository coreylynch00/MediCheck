package com.example.medicheck;

public class Diabetes {

    public String age, pregnancies, glucose, bp, skinThickness, insulin, bmi, dpf, ts;

    public Diabetes(){

    }

    public Diabetes(String age, String pregnancies, String glucose, String bp, String skinThickness, String  insulin, String bmi, String dpf, String ts){
        this.age = age;
        this.pregnancies = pregnancies;
        this.glucose = glucose;
        this.bp = bp;
        this.skinThickness = skinThickness;
        this.insulin = insulin;
        this.bmi = bmi;
        this.dpf = dpf;
        this.ts = ts;
    }

}
