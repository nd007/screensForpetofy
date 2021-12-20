package com.example.screensforpetofy;

public class AddTocartResponse {

    private String desc;
    private String img_url;
    private int qty;

    public AddTocartResponse(String desc, String img_url, int qty) {
        this.desc = desc;
        this.img_url = img_url;
        this.qty = qty;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
