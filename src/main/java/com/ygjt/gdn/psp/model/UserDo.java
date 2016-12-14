package com.ygjt.gdn.psp.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_user
 */
public class UserDo extends BaseBean implements Serializable {
    /**
     * ID
     * tb_user.ID
     */
    private Integer id;

    /**
     * 创建时间
     * tb_user.CREATED_DT
     */
    private Date createdDt;

    /**
     * 创建人
     * tb_user.CREATED_BY
     */
    private Integer createdBy;

    /**
     * 最后更新时间
     * tb_user.LASTUPDATE_DT
     */
    private Date lastupdateDt;

    /**
     * 最后更新人
     * tb_user.LASTUPDATE_BY
     */
    private Integer lastupdateBy;

    /**
     * 父账号id
     * tb_user.PARENT_ID
     */
    private Integer parentId;

    /**
     * 用户名
     * tb_user.NAME
     */
    private String name;

    /**
     * 密码
     * tb_user.PWD
     */
    private String pwd;

    /**
     * 1：企业  2：后台管理人员 
     * tb_user.TYPE
     */
    private String type;

    /**
     * 真实姓名
     * tb_user.TRUE_NAME
     */
    private String trueName;

    /**
     * 联系地址
     * tb_user.ADDR
     */
    private String addr;

    /**
     * 联系电话
     * tb_user.MOBILE
     */
    private String mobile;

    /**
     * 邮箱
     * tb_user.EMAIL
     */
    private String email;

    /**
     * 身份证号码
     * tb_user.CARD
     */
    private String card;

    /**
     * 1.有效 0.失效
     * tb_user.STAT
     */
    private String stat;

    /**
     * 盐
     * tb_user.SALT
     */
    private String salt;

    /**
     * 备注
     * tb_user.MEMO
     */
    private String memo;

    /**
     * 密码2
     * tb_user.PWD2
     */
    private String pwd2;

    /**
     * tb_user
     */
    private static final long serialVersionUID = 1L;

    /**
     * tb_user.ID
     * @return the value of tb_user.ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * tb_user.ID
     * @param id the value for tb_user.ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * tb_user.CREATED_DT
     * @return the value of tb_user.CREATED_DT
     */
    public Date getCreatedDt() {
        return createdDt;
    }

    /**
     * tb_user.CREATED_DT
     * @param createdDt the value for tb_user.CREATED_DT
     */
    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    /**
     * tb_user.CREATED_BY
     * @return the value of tb_user.CREATED_BY
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * tb_user.CREATED_BY
     * @param createdBy the value for tb_user.CREATED_BY
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * tb_user.LASTUPDATE_DT
     * @return the value of tb_user.LASTUPDATE_DT
     */
    public Date getLastupdateDt() {
        return lastupdateDt;
    }

    /**
     * tb_user.LASTUPDATE_DT
     * @param lastupdateDt the value for tb_user.LASTUPDATE_DT
     */
    public void setLastupdateDt(Date lastupdateDt) {
        this.lastupdateDt = lastupdateDt;
    }

    /**
     * tb_user.LASTUPDATE_BY
     * @return the value of tb_user.LASTUPDATE_BY
     */
    public Integer getLastupdateBy() {
        return lastupdateBy;
    }

    /**
     * tb_user.LASTUPDATE_BY
     * @param lastupdateBy the value for tb_user.LASTUPDATE_BY
     */
    public void setLastupdateBy(Integer lastupdateBy) {
        this.lastupdateBy = lastupdateBy;
    }

    /**
     * tb_user.PARENT_ID
     * @return the value of tb_user.PARENT_ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * tb_user.PARENT_ID
     * @param parentId the value for tb_user.PARENT_ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * tb_user.NAME
     * @return the value of tb_user.NAME
     */
    public String getName() {
        return name;
    }

    /**
     * tb_user.NAME
     * @param name the value for tb_user.NAME
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * tb_user.PWD
     * @return the value of tb_user.PWD
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * tb_user.PWD
     * @param pwd the value for tb_user.PWD
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * tb_user.TYPE
     * @return the value of tb_user.TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * tb_user.TYPE
     * @param type the value for tb_user.TYPE
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * tb_user.TRUE_NAME
     * @return the value of tb_user.TRUE_NAME
     */
    public String getTrueName() {
        return trueName;
    }

    /**
     * tb_user.TRUE_NAME
     * @param trueName the value for tb_user.TRUE_NAME
     */
    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    /**
     * tb_user.ADDR
     * @return the value of tb_user.ADDR
     */
    public String getAddr() {
        return addr;
    }

    /**
     * tb_user.ADDR
     * @param addr the value for tb_user.ADDR
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    /**
     * tb_user.MOBILE
     * @return the value of tb_user.MOBILE
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * tb_user.MOBILE
     * @param mobile the value for tb_user.MOBILE
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * tb_user.EMAIL
     * @return the value of tb_user.EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * tb_user.EMAIL
     * @param email the value for tb_user.EMAIL
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * tb_user.CARD
     * @return the value of tb_user.CARD
     */
    public String getCard() {
        return card;
    }

    /**
     * tb_user.CARD
     * @param card the value for tb_user.CARD
     */
    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    /**
     * tb_user.STAT
     * @return the value of tb_user.STAT
     */
    public String getStat() {
        return stat;
    }

    /**
     * tb_user.STAT
     * @param stat the value for tb_user.STAT
     */
    public void setStat(String stat) {
        this.stat = stat == null ? null : stat.trim();
    }

    /**
     * tb_user.SALT
     * @return the value of tb_user.SALT
     */
    public String getSalt() {
        return salt;
    }

    /**
     * tb_user.SALT
     * @param salt the value for tb_user.SALT
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * tb_user.MEMO
     * @return the value of tb_user.MEMO
     */
    public String getMemo() {
        return memo;
    }

    /**
     * tb_user.MEMO
     * @param memo the value for tb_user.MEMO
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * tb_user.PWD2
     * @return the value of tb_user.PWD2
     */
    public String getPwd2() {
        return pwd2;
    }

    /**
     * tb_user.PWD2
     * @param pwd2 the value for tb_user.PWD2
     */
    public void setPwd2(String pwd2) {
        this.pwd2 = pwd2 == null ? null : pwd2.trim();
    }

    /**
     * tb_user
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
        UserDo other = (UserDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreatedDt() == null ? other.getCreatedDt() == null : this.getCreatedDt().equals(other.getCreatedDt()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getLastupdateDt() == null ? other.getLastupdateDt() == null : this.getLastupdateDt().equals(other.getLastupdateDt()))
            && (this.getLastupdateBy() == null ? other.getLastupdateBy() == null : this.getLastupdateBy().equals(other.getLastupdateBy()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTrueName() == null ? other.getTrueName() == null : this.getTrueName().equals(other.getTrueName()))
            && (this.getAddr() == null ? other.getAddr() == null : this.getAddr().equals(other.getAddr()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCard() == null ? other.getCard() == null : this.getCard().equals(other.getCard()))
            && (this.getStat() == null ? other.getStat() == null : this.getStat().equals(other.getStat()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getPwd2() == null ? other.getPwd2() == null : this.getPwd2().equals(other.getPwd2()));
    }

    /**
     * tb_user
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
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTrueName() == null) ? 0 : getTrueName().hashCode());
        result = prime * result + ((getAddr() == null) ? 0 : getAddr().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCard() == null) ? 0 : getCard().hashCode());
        result = prime * result + ((getStat() == null) ? 0 : getStat().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getPwd2() == null) ? 0 : getPwd2().hashCode());
        return result;
    }
}