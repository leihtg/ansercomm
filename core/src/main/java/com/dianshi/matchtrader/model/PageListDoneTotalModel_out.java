package com.dianshi.matchtrader.model;

import java.util.List;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class PageListDoneTotalModel_out  extends  PageListBaseModel_out{


    private double BuyAllMoney;
    private double SellAllMoney;
    private int BuyCount;
    private int SellCount;
    private double BuyCharge;
    private double SellCharge;
    private List<DoneTotalModel_out> EntityCollection ;

    public double getBuyAllMoney() {
        return BuyAllMoney;
    }

    public void setBuyAllMoney(double buyAllMoney) {
        BuyAllMoney = buyAllMoney;
    }

    public double getBuyCharge() {
        return BuyCharge;
    }

    public void setBuyCharge(double buyCharge) {
        BuyCharge = buyCharge;
    }

    public int getBuyCount() {
        return BuyCount;
    }

    public void setBuyCount(int buyCount) {
        BuyCount = buyCount;
    }

    public List<DoneTotalModel_out> getEntityCollection() {
        return EntityCollection;
    }

    public void setEntityCollection(List<DoneTotalModel_out> entityCollection) {
        EntityCollection = entityCollection;
    }

    public double getSellAllMoney() {
        return SellAllMoney;
    }

    public void setSellAllMoney(double sellAllMoney) {
        SellAllMoney = sellAllMoney;
    }

    public double getSellCharge() {
        return SellCharge;
    }

    public void setSellCharge(double sellCharge) {
        SellCharge = sellCharge;
    }

    public int getSellCount() {
        return SellCount;
    }

    public void setSellCount(int sellCount) {
        SellCount = sellCount;
    }
}
