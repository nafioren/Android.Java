package com.example.myfirstapp;

public class Opcion {
    private String mText;
    private int mNextPage;

    public Opcion(String Text,int NextPage) {
        mText = mText;
        mNextPage = mNextPage;
    }

    public int getmNextPage() {
        return mNextPage;
    }

    public void setmNextPage(int mNextPage) {
        this.mNextPage = mNextPage;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }
}
