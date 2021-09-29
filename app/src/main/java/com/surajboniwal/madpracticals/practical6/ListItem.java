package com.surajboniwal.madpracticals.practical6;

public class ListItem{
    private String description;
    private String imgId;
    public ListItem(String description, String imgId) {
        this.description = description;
        this.imgId = imgId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImgId() {
        return imgId;
    }
    public void setImgId(String imgId) {
        this.imgId = imgId;
    }
}