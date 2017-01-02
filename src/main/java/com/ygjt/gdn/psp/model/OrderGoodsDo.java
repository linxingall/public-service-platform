package com.ygjt.gdn.psp.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_order_goods
 */
public class OrderGoodsDo extends BaseBean implements Serializable {
    /**
     * ID
     * tb_order_goods.ID
     */
    private Integer id;

    /**
     * 创建时间
     * tb_order_goods.CREATED_DT
     */
    private Date createdDt;

    /**
     * 创建人
     * tb_order_goods.CREATED_BY
     */
    private Integer createdBy;

    /**
     * 最后更新时间
     * tb_order_goods.LASTUPDATE_DT
     */
    private Date lastupdateDt;

    /**
     * 最后更新人
     * tb_order_goods.LASTUPDATE_BY
     */
    private Integer lastupdateBy;

    /**
     * 状态
     * tb_order_goods.sts
     */
    private String sts;

    /**
     * 订单ID 
     * tb_order_goods.ORDER_ID
     */
    private Integer orderId;

    /**
     * 商品名称
     * tb_order_goods.NAME
     */
    private String name;

    /**
     * 商品编号
     * tb_order_goods.CODE
     */
    private String code;

    /**
     * 规格 
     * tb_order_goods.SPEC
     */
    private String spec;

    /**
     * 单位 
     * tb_order_goods.UNIT
     */
    private String unit;

    /**
     * 数量
     * tb_order_goods.NUM
     */
    private Double num;

    /**
     * 单价
     * tb_order_goods.UNIT_PRICE
     */
    private Double unitPrice;

    /**
     * 总额
     * tb_order_goods.TOTAL_AMOUNT
     */
    private Double totalAmount;

    /**
     * tb_order_goods
     */
    private static final long serialVersionUID = 1L;

    /**
     * tb_order_goods.ID
     * @return the value of tb_order_goods.ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * tb_order_goods.ID
     * @param id the value for tb_order_goods.ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * tb_order_goods.CREATED_DT
     * @return the value of tb_order_goods.CREATED_DT
     */
    public Date getCreatedDt() {
        return createdDt;
    }

    /**
     * tb_order_goods.CREATED_DT
     * @param createdDt the value for tb_order_goods.CREATED_DT
     */
    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    /**
     * tb_order_goods.CREATED_BY
     * @return the value of tb_order_goods.CREATED_BY
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * tb_order_goods.CREATED_BY
     * @param createdBy the value for tb_order_goods.CREATED_BY
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * tb_order_goods.LASTUPDATE_DT
     * @return the value of tb_order_goods.LASTUPDATE_DT
     */
    public Date getLastupdateDt() {
        return lastupdateDt;
    }

    /**
     * tb_order_goods.LASTUPDATE_DT
     * @param lastupdateDt the value for tb_order_goods.LASTUPDATE_DT
     */
    public void setLastupdateDt(Date lastupdateDt) {
        this.lastupdateDt = lastupdateDt;
    }

    /**
     * tb_order_goods.LASTUPDATE_BY
     * @return the value of tb_order_goods.LASTUPDATE_BY
     */
    public Integer getLastupdateBy() {
        return lastupdateBy;
    }

    /**
     * tb_order_goods.LASTUPDATE_BY
     * @param lastupdateBy the value for tb_order_goods.LASTUPDATE_BY
     */
    public void setLastupdateBy(Integer lastupdateBy) {
        this.lastupdateBy = lastupdateBy;
    }

    /**
     * tb_order_goods.sts
     * @return the value of tb_order_goods.sts
     */
    public String getSts() {
        return sts;
    }

    /**
     * tb_order_goods.sts
     * @param sts the value for tb_order_goods.sts
     */
    public void setSts(String sts) {
        this.sts = sts == null ? null : sts.trim();
    }

    /**
     * tb_order_goods.ORDER_ID
     * @return the value of tb_order_goods.ORDER_ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * tb_order_goods.ORDER_ID
     * @param orderId the value for tb_order_goods.ORDER_ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * tb_order_goods.NAME
     * @return the value of tb_order_goods.NAME
     */
    public String getName() {
        return name;
    }

    /**
     * tb_order_goods.NAME
     * @param name the value for tb_order_goods.NAME
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * tb_order_goods.CODE
     * @return the value of tb_order_goods.CODE
     */
    public String getCode() {
        return code;
    }

    /**
     * tb_order_goods.CODE
     * @param code the value for tb_order_goods.CODE
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * tb_order_goods.SPEC
     * @return the value of tb_order_goods.SPEC
     */
    public String getSpec() {
        return spec;
    }

    /**
     * tb_order_goods.SPEC
     * @param spec the value for tb_order_goods.SPEC
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    /**
     * tb_order_goods.UNIT
     * @return the value of tb_order_goods.UNIT
     */
    public String getUnit() {
        return unit;
    }

    /**
     * tb_order_goods.UNIT
     * @param unit the value for tb_order_goods.UNIT
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * tb_order_goods.NUM
     * @return the value of tb_order_goods.NUM
     */
    public Double getNum() {
        return num;
    }

    /**
     * tb_order_goods.NUM
     * @param num the value for tb_order_goods.NUM
     */
    public void setNum(Double num) {
        this.num = num;
    }

    /**
     * tb_order_goods.UNIT_PRICE
     * @return the value of tb_order_goods.UNIT_PRICE
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * tb_order_goods.UNIT_PRICE
     * @param unitPrice the value for tb_order_goods.UNIT_PRICE
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * tb_order_goods.TOTAL_AMOUNT
     * @return the value of tb_order_goods.TOTAL_AMOUNT
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * tb_order_goods.TOTAL_AMOUNT
     * @param totalAmount the value for tb_order_goods.TOTAL_AMOUNT
     */
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * tb_order_goods
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
        OrderGoodsDo other = (OrderGoodsDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreatedDt() == null ? other.getCreatedDt() == null : this.getCreatedDt().equals(other.getCreatedDt()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getLastupdateDt() == null ? other.getLastupdateDt() == null : this.getLastupdateDt().equals(other.getLastupdateDt()))
            && (this.getLastupdateBy() == null ? other.getLastupdateBy() == null : this.getLastupdateBy().equals(other.getLastupdateBy()))
            && (this.getSts() == null ? other.getSts() == null : this.getSts().equals(other.getSts()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getSpec() == null ? other.getSpec() == null : this.getSpec().equals(other.getSpec()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getUnitPrice() == null ? other.getUnitPrice() == null : this.getUnitPrice().equals(other.getUnitPrice()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()));
    }

    /**
     * tb_order_goods
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
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getSpec() == null) ? 0 : getSpec().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getUnitPrice() == null) ? 0 : getUnitPrice().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
        return result;
    }
}