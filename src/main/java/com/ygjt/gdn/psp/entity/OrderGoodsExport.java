package com.ygjt.gdn.psp.entity;

import com.ygjt.gdn.psp.utils.Excel;

/**
 * Created by Administrator on 2016/12/20.
 */
public class OrderGoodsExport {
    @Excel(exportName = "商户")
    private String merchantName;
    @Excel(exportName = "订单号")
    private String orderCode;
    @Excel(exportName = "商品名称")
    private String goodsName;
    @Excel(exportName = "规格")
    private String spec;
    @Excel(exportName = "单位")
    private String unit;
    @Excel(exportName = "单价（元)")
    private String unitPrice;
    @Excel(exportName = "数量")
    private String num;
    @Excel(exportName = "商品总价")
    private String totalSum;
    @Excel(exportName = "条形码")
    private String barcode;

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(String totalSum) {
        this.totalSum = totalSum;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
