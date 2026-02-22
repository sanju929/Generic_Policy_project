package com.example.zen.engine.pa.dto;

public class PaQuotation {

    public String getSpouseCover() {
        return spouseCover;
    }

    public void setSpouseCover(String spouseCover) {
        this.spouseCover = spouseCover;
    }

    public int getNoOfChild() {
        return noOfChild;
    }

    public void setNoOfChild(int noOfChild) {
        this.noOfChild = noOfChild;
    }

    private String spouseCover;

    public String getChildCover() {
        return childCover;
    }

    public void setChildCover(String childCover) {
        this.childCover = childCover;
    }

    private String childCover;
    private int noOfChild;

}
