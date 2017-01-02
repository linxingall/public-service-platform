package com.ygjt.gdn.psp.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_goods
 */
public class GoodsDo extends BaseBean implements Serializable {
    /**
     * ID
     * tb_goods.ID
     */
    private Integer id;

    /**
     * 创建时间
     * tb_goods.CREATED_DT
     */
    private Date createdDt;

    /**
     * 创建人
     * tb_goods.CREATED_BY
     */
    private Integer createdBy;

    /**
     * 最后更新时间
     * tb_goods.LASTUPDATE_DT
     */
    private Date lastupdateDt;

    /**
     * 最后更新人
     * tb_goods.LASTUPDATE_BY
     */
    private Integer lastupdateBy;

    /**
     * 状态
     * tb_goods.sts
     */
    private String sts;

    /**
     * 商品名称
     * tb_goods.NAME
     */
    private String name;

    /**
     * 商品编号
     * tb_goods.CODE
     */
    private String code;

    /**
     * 优先级 
     * tb_goods.GOODS_SORT
     */
    private Integer goodsSort;

    /**
     * tb_goods
     */
    private static final long serialVersionUID = 1L;

    /**
     * tb_goods.ID
     * @return the value of tb_goods.ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * tb_goods.ID
     * @param id the value for tb_goods.ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * tb_goods.CREATED_DT
     * @return the value of tb_goods.CREATED_DT
     */
    public Date getCreatedDt() {
        return createdDt;
    }

    /**
     * tb_goods.CREATED_DT
     * @param createdDt the value for tb_goods.CREATED_DT
     */
    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    /**
     * tb_goods.CREATED_BY
     * @return the value of tb_goods.CREATED_BY
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * tb_goods.CREATED_BY
     * @param createdBy the value for tb_goods.CREATED_BY
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * tb_goods.LASTUPDATE_DT
     * @return the value of tb_goods.LASTUPDATE_DT
     */
    public Date getLastupdateDt() {
        return lastupdateDt;
    }

    /**
     * tb_goods.LASTUPDATE_DT
     * @param lastupdateDt the value for tb_goods.LASTUPDATE_DT
     */
    public void setLastupdateDt(Date lastupdateDt) {
        this.lastupdateDt = lastupdateDt;
    }

    /**
     * tb_goods.LASTUPDATE_BY
     * @return the value of tb_goods.LASTUPDATE_BY
     */
    public Integer getLastupdateBy() {
        return lastupdateBy;
    }

    /**
     * tb_goods.LASTUPDATE_BY
     * @param lastupdateBy the value for tb_goods.LASTUPDATE_BY
     */
    public void setLastupdateBy(Integer lastupdateBy) {
        this.lastupdateBy = lastupdateBy;
    }

    /**
     * tb_goods.sts
     * @return the value of tb_goods.sts
     */
    public String getSts() {
        return sts;
    }

    /**
     * tb_goods.sts
     * @param sts the value for tb_goods.sts
     */
    public void setSts(String sts) {
        this.sts = sts == null ? null : sts.trim();
    }

    /**
     * tb_goods.NAME
     * @return the value of tb_goods.NAME
     */
    public String getName() {
        return name;
    }

    /**
     * tb_goods.NAME
     * @param name the value for tb_goods.NAME
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * tb_goods.CODE
     * @return the value of tb_goods.CODE
     */
    public String getCode() {
        return code;
    }

    /**
     * tb_goods.CODE
     * @param code the value for tb_goods.CODE
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * tb_goods.GOODS_SORT
     * @return the value of tb_goods.GOODS_SORT
     */
    public Integer getGoodsSort() {
        return goodsSort;
    }

    /**
     * tb_goods.GOODS_SORT
     * @param goodsSort the value for tb_goods.GOODS_SORT
     */
    public void setGoodsSort(Integer goodsSort) {
        this.goodsSort = goodsSort;
    }

    /**
     * tb_goods
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
        GoodsDo other = (GoodsDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreatedDt() == null ? other.getCreatedDt() == null : this.getCreatedDt().equals(other.getCreatedDt()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getLastupdateDt() == null ? other.getLastupdateDt() == null : this.getLastupdateDt().equals(other.getLastupdateDt()))
            && (this.getLastupdateBy() == null ? other.getLastupdateBy() == null : this.getLastupdateBy().equals(other.getLastupdateBy()))
            && (this.getSts() == null ? other.getSts() == null : this.getSts().equals(other.getSts()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getGoodsSort() == null ? other.getGoodsSort() == null : this.getGoodsSort().equals(other.getGoodsSort()));
    }

    /**
     * tb_goods
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
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getGoodsSort() == null) ? 0 : getGoodsSort().hashCode());
        return result;
    }
}