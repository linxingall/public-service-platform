package com.ygjt.gdn.psp.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_order
 */
public class OrderDo extends BaseBean implements Serializable {
    /**
     * ID
     * tb_order.ID
     */
    private Integer id;

    /**
     * 创建时间
     * tb_order.CREATED_DT
     */
    private Date createdDt;

    /**
     * 创建人
     * tb_order.CREATED_BY
     */
    private Integer createdBy;

    /**
     * 最后更新时间
     * tb_order.LASTUPDATE_DT
     */
    private Date lastupdateDt;

    /**
     * 最后更新人
     * tb_order.LASTUPDATE_BY
     */
    private Integer lastupdateBy;

    /**
     * 状态
     * tb_order.sts
     */
    private String sts;

    /**
     * 商户名称
     * tb_order.MERCHANT_NAME
     */
    private String merchantName;

    /**
     * 订单号
     * tb_order.ORDER_NO
     */
    private String orderNo;

    /**
     * 订单总额
     * tb_order.AMOUNT
     */
    private Double amount;

    /**
     * 打印状态 Y已打印 N 未打印
     * tb_order.IS_PRINT
     */
    private String isPrint;

    /**
     * 订单状态
     * tb_order.ORDER_STS
     */
    private String orderSts;

    /**
     * tb_order
     */
    private static final long serialVersionUID = 1L;

    /**
     * tb_order.ID
     * @return the value of tb_order.ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * tb_order.ID
     * @param id the value for tb_order.ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * tb_order.CREATED_DT
     * @return the value of tb_order.CREATED_DT
     */
    public Date getCreatedDt() {
        return createdDt;
    }

    /**
     * tb_order.CREATED_DT
     * @param createdDt the value for tb_order.CREATED_DT
     */
    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    /**
     * tb_order.CREATED_BY
     * @return the value of tb_order.CREATED_BY
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * tb_order.CREATED_BY
     * @param createdBy the value for tb_order.CREATED_BY
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * tb_order.LASTUPDATE_DT
     * @return the value of tb_order.LASTUPDATE_DT
     */
    public Date getLastupdateDt() {
        return lastupdateDt;
    }

    /**
     * tb_order.LASTUPDATE_DT
     * @param lastupdateDt the value for tb_order.LASTUPDATE_DT
     */
    public void setLastupdateDt(Date lastupdateDt) {
        this.lastupdateDt = lastupdateDt;
    }

    /**
     * tb_order.LASTUPDATE_BY
     * @return the value of tb_order.LASTUPDATE_BY
     */
    public Integer getLastupdateBy() {
        return lastupdateBy;
    }

    /**
     * tb_order.LASTUPDATE_BY
     * @param lastupdateBy the value for tb_order.LASTUPDATE_BY
     */
    public void setLastupdateBy(Integer lastupdateBy) {
        this.lastupdateBy = lastupdateBy;
    }

    /**
     * tb_order.sts
     * @return the value of tb_order.sts
     */
    public String getSts() {
        return sts;
    }

    /**
     * tb_order.sts
     * @param sts the value for tb_order.sts
     */
    public void setSts(String sts) {
        this.sts = sts == null ? null : sts.trim();
    }

    /**
     * tb_order.MERCHANT_NAME
     * @return the value of tb_order.MERCHANT_NAME
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * tb_order.MERCHANT_NAME
     * @param merchantName the value for tb_order.MERCHANT_NAME
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    /**
     * tb_order.ORDER_NO
     * @return the value of tb_order.ORDER_NO
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * tb_order.ORDER_NO
     * @param orderNo the value for tb_order.ORDER_NO
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * tb_order.AMOUNT
     * @return the value of tb_order.AMOUNT
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * tb_order.AMOUNT
     * @param amount the value for tb_order.AMOUNT
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * tb_order.IS_PRINT
     * @return the value of tb_order.IS_PRINT
     */
    public String getIsPrint() {
        return isPrint;
    }

    /**
     * tb_order.IS_PRINT
     * @param isPrint the value for tb_order.IS_PRINT
     */
    public void setIsPrint(String isPrint) {
        this.isPrint = isPrint == null ? null : isPrint.trim();
    }

    /**
     * tb_order.ORDER_STS
     * @return the value of tb_order.ORDER_STS
     */
    public String getOrderSts() {
        return orderSts;
    }

    /**
     * tb_order.ORDER_STS
     * @param orderSts the value for tb_order.ORDER_STS
     */
    public void setOrderSts(String orderSts) {
        this.orderSts = orderSts == null ? null : orderSts.trim();
    }

    /**
     * tb_order
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderDo other = (OrderDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreatedDt() == null ? other.getCreatedDt() == null : this.getCreatedDt().equals(other.getCreatedDt()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getLastupdateDt() == null ? other.getLastupdateDt() == null : this.getLastupdateDt().equals(other.getLastupdateDt()))
            && (this.getLastupdateBy() == null ? other.getLastupdateBy() == null : this.getLastupdateBy().equals(other.getLastupdateBy()))
            && (this.getSts() == null ? other.getSts() == null : this.getSts().equals(other.getSts()))
            && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getIsPrint() == null ? other.getIsPrint() == null : this.getIsPrint().equals(other.getIsPrint()))
            && (this.getOrderSts() == null ? other.getOrderSts() == null : this.getOrderSts().equals(other.getOrderSts()));
    }

    /**
     * tb_order
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreatedDt() == null) ? 0 : getCreatedDt().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getLastupdateDt() == null) ? 0 : getLastupdateDt().hashCode());
        result = prime * result + ((getLastupdateBy() == null) ? 0 : getLastupdateBy().hashCode());
        result = prime * result + ((getSts() == null) ? 0 : getSts().hashCode());
        result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getIsPrint() == null) ? 0 : getIsPrint().hashCode());
        result = prime * result + ((getOrderSts() == null) ? 0 : getOrderSts().hashCode());
        return result;
    }
}