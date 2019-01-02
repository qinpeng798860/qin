package com.zking.qinpeng.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Menu implements Serializable {
    private Integer fid;

    private String fpid;

    private String fname;

    private String furl;

    private String ficon;

    private String fremark2;

    private String fremark3;

    public Menu(Integer fid, String fpid, String fname, String furl, String ficon, String fremark2, String fremark3) {
        this.fid = fid;
        this.fpid = fpid;
        this.fname = fname;
        this.furl = furl;
        this.ficon = ficon;
        this.fremark2 = fremark2;
        this.fremark3 = fremark3;
    }

    public Menu() {
        super();
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFpid() {
        return fpid;
    }

    public void setFpid(String fpid) {
        this.fpid = fpid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFurl() {
        return furl;
    }

    public void setFurl(String furl) {
        this.furl = furl;
    }

    public String getFicon() {
        return ficon;
    }

    public void setFicon(String ficon) {
        this.ficon = ficon;
    }

    public String getFremark2() {
        return fremark2;
    }

    public void setFremark2(String fremark2) {
        this.fremark2 = fremark2;
    }

    public String getFremark3() {
        return fremark3;
    }

    public void setFremark3(String fremark3) {
        this.fremark3 = fremark3;
    }
}