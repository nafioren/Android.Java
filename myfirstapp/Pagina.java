package com.example.myfirstapp;

public class Pagina {
    private  int mImageId;
    private String mText;
    private Opcion mOpcion1;
    private Opcion mOpcion2;
    private boolean mIsFinal = false;

    public Pagina(int ImageId, Opcion Opcion1, String Text, Opcion Opcion2) {
        mImageId = mImageId;
        mOpcion1 = mOpcion1;
        mText = mText;
        mOpcion2 = mOpcion2;
    }


    public boolean ismIsFinal() {
        return mIsFinal;
    }


    public void setmIsFinal(boolean mIsFinal) {
        this.mIsFinal = mIsFinal;
    }

    public Pagina(String Text, int ImageId, Opcion opcion1, Opcion opcion2) {
        mText = Text;
        mImageId = ImageId;
        mOpcion1 = null;
        mOpcion2 = null;
        mIsFinal = true;

    }





    public Opcion getOpcion2() {
        return Opcion2;
    }

    public void setOpcion2(Opcion Opcion2) {
        this.Opcion2 = Opcion2;
    }

    public Opcion getOpcion1() {
        return Opcion1;
    }

    public void setOpcion1(Opcion Opcion1) {
        this.Opcion1 = Opcion1;
    }

    public String getText() {
        return Text;
    }

    public void setText(String mText) {
        this.Text = mText;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setImageId(int mImageId) {
        this.ImageId = ImageId;
    }
}
