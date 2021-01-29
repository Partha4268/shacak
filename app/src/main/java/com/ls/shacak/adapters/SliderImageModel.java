package com.ls.shacak.adapters;

public class SliderImageModel {
    public String url ="";
    public int drawableUrl = 0;

    public SliderImageModel(String url, int drawableUrl) {
        this.url = url;
        this.drawableUrl = drawableUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDrawableUrl() {
        return drawableUrl;
    }

    public void setDrawableUrl(int drawableUrl) {
        this.drawableUrl = drawableUrl;
    }
}
