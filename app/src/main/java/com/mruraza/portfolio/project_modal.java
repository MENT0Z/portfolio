package com.mruraza.portfolio;

public class project_modal {
    int img1,img2;
    String proj_name, proj_info;

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public String getProj_name() {
        return proj_name;
    }

    public void setProj_name(String proj_name) {
        this.proj_name = proj_name;
    }

    public String getProj_info() {
        return proj_info;
    }

    public void setProj_info(String proj_info) {
        this.proj_info = proj_info;
    }

    public project_modal(int img1, int img2, String proj_name, String proj_info) {
        this.img1 = img1;
        this.img2 = img2;
        this.proj_name = proj_name;
        this.proj_info = proj_info;
    }
}
