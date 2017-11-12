package com.example.android.cryptoinfo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by GOZMAN VICTOR on 11/10/2017.
 */

public class BTC {

    @SerializedName("USD")
    @Expose
    private Double uSD;
    @SerializedName("EUR")
    @Expose
    private Double eUR;
    @SerializedName("NGN")
    @Expose
    private Double nGN;
    @SerializedName("ETH")
    @Expose
    private Double eTH;
    @SerializedName("JPY")
    @Expose
    private Double jPY;
    @SerializedName("AUD")
    @Expose
    private Double aUD;
    @SerializedName("CAD")
    @Expose
    private Double cAD;
    @SerializedName("HKD")
    @Expose
    private Double hKD;
    @SerializedName("CHF")
    @Expose
    private Double cHF;
    @SerializedName("ZAR")
    @Expose
    private Double zAR;
    @SerializedName("CNY")
    @Expose
    private Integer cNY;
    @SerializedName("INR")
    @Expose
    private Double iNR;
    @SerializedName("SGD")
    @Expose
    private Double sGD;
    @SerializedName("TWD")
    @Expose
    private Double tWD;
    @SerializedName("RUB")
    @Expose
    private Double rUB;
    @SerializedName("MXN")
    @Expose
    private Double mXN;
    @SerializedName("ILS")
    @Expose
    private Double iLS;
    @SerializedName("MYR")
    @Expose
    private Double mYR;
    @SerializedName("TRY")
    @Expose
    private Integer tRY;
    @SerializedName("BRL")
    @Expose
    private Integer bRL;
    @SerializedName("SEK")
    @Expose
    private Double sEK;



    public Double getUSD() {
        return uSD;
    }

    public void setUSD(Double uSD) {
        this.uSD = uSD;
    }

    public Double getEUR() {
        return eUR;
    }

    public void setEUR(Double eUR) {
        this.eUR = eUR;
    }

    public Double getNGN() {
        return nGN;
    }

    public void setNGN(Double nGN) {
        this.nGN = nGN;
    }

    public Double getETH() {
        return eTH;
    }

    public void setETH(Double eTH) {
        this.eTH = eTH;
    }

    public Double getJPY() {
        return jPY;
    }

    public void setJPY(Double jPY) {
        this.jPY = jPY;
    }

    public Double getAUD() {
        return aUD;
    }

    public void setAUD(Double aUD) {
        this.aUD = aUD;
    }

    public Double getCAD() {
        return cAD;
    }

    public void setCAD(Double cAD) {
        this.cAD = cAD;
    }

    public Double getHKD() {
        return hKD;
    }

    public void setHKD(Double hKD) {
        this.hKD = hKD;
    }

    public Double getCHF() {
        return cHF;
    }

    public void setCHF(Double cHF) {
        this.cHF = cHF;
    }

    public Double getZAR() {
        return zAR;
    }

    public void setZAR(Double zAR) {
        this.zAR = zAR;
    }

    public Integer getCNY() {
        return cNY;
    }

    public void setCNY(Integer cNY) {
        this.cNY = cNY;
    }

    public Double getINR() {
        return iNR;
    }

    public void setINR(Double iNR) {
        this.iNR = iNR;
    }

    public Double getSGD() {
        return sGD;
    }

    public void setSGD(Double sGD) {
        this.sGD = sGD;
    }

    public Double getTWD() {
        return tWD;
    }

    public void setTWD(Double tWD) {
        this.tWD = tWD;
    }

    public Double getRUB() {
        return rUB;
    }

    public void setRUB(Double rUB) {
        this.rUB = rUB;
    }

    public Double getMXN() {
        return mXN;
    }

    public void setMXN(Double mXN) {
        this.mXN = mXN;
    }

    public Double getILS() {
        return iLS;
    }

    public void setILS(Double iLS) {
        this.iLS = iLS;
    }

    public Double getMYR() {
        return mYR;
    }

    public void setMYR(Double mYR) {
        this.mYR = mYR;
    }

    public Integer getTRY() {
        return tRY;
    }

    public void setTRY(Integer tRY) {
        this.tRY = tRY;
    }

    public Integer getBRL() {
        return bRL;
    }

    public void setBRL(Integer bRL) {
        this.bRL = bRL;
    }

    public Double getSEK() {return sEK;}

    public void setSEK(Double sEK) {this.sEK = sEK;}


//    public Double getBTCC(getCurrency currency){
//        switch (currency){
//            case currency.AUD:
//        }
//    }

}