package com.keja.keja.Models;

public class HomeImagesModel {
    private String img;
    private String desc;

    public HomeImagesModel(String img, String desc) {
        this.img = img;
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
