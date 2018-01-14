package com.example.android.reportcard;

import android.view.View;

/**
 * Created by Mateusz on 14.01.2018.
 */

public class Padawan {

    private String mPadawanName;

    private String mPadawanRace;

    private int mJediHistoryGrade;

    private int mJediForceGrade;

    private int mPhysicalEducation;

    public Padawan(String padawanName, String padawanRace, int jediHistoryGrade, int jediForceGrade, int physicalEducation){
        mPadawanName = padawanName;
        mPadawanRace = padawanRace;
        mJediHistoryGrade = jediHistoryGrade;
        mJediForceGrade = jediForceGrade;
        mPhysicalEducation = physicalEducation;

    }

    public String getPadawanName(){
        return mPadawanName;
    }

    public String getPadawanRace(){
        return mPadawanRace;
    }

    public String getJediHistoryGrade(){
        return String.valueOf(mJediHistoryGrade);
    }

    public String getJediForceGrade(){
        return String.valueOf(mJediForceGrade);
    }

    public String getPhysicalEducation(){
        return String.valueOf(mPhysicalEducation);
    }

    public void setPadawanName(String newName){
        mPadawanName = newName;
    }

    public void setPadawanRace(String newRace){
        mPadawanRace = newRace;
    }

    public void setJediHistoryGrade(int newGrade){
        mJediHistoryGrade = newGrade;
    }

    public void setJediForceGrade(int newGrade){
        mJediForceGrade = newGrade;
    }

    public void setPhysicalEducation(int newGrade){
        mPhysicalEducation = newGrade;
    }

    @Override
    public String toString() {
        return "Padawan's name: " + mPadawanName + ", Padawan's race: " + mPadawanRace +
                ", History of the Jedi Lesson: " + mJediHistoryGrade + ", Force Lesson: " +
                mJediForceGrade + "PE: " + mPhysicalEducation;
    }
}
