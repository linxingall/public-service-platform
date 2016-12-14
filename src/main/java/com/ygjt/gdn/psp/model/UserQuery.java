package com.ygjt.gdn.psp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserQuery {
    /**
     * tb_user
     */
    protected String orderByClause;

    /**
     * tb_user
     */
    protected boolean distinct;

    /**
     * tb_user
     */
    protected List<Criteria> oredCriteria;

    /**
     * tb_user
     */
    public UserQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * tb_user
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * tb_user
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * tb_user
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * tb_user
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * tb_user
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * tb_user
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * tb_user
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * tb_user
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * tb_user
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * tb_user
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class corresponds to the database table tb_user
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatedDtIsNull() {
            addCriterion("CREATED_DT is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDtIsNotNull() {
            addCriterion("CREATED_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDtEqualTo(Date value) {
            addCriterion("CREATED_DT =", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtNotEqualTo(Date value) {
            addCriterion("CREATED_DT <>", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtGreaterThan(Date value) {
            addCriterion("CREATED_DT >", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DT >=", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtLessThan(Date value) {
            addCriterion("CREATED_DT <", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DT <=", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtIn(List<Date> values) {
            addCriterion("CREATED_DT in", values, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtNotIn(List<Date> values) {
            addCriterion("CREATED_DT not in", values, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtBetween(Date value1, Date value2) {
            addCriterion("CREATED_DT between", value1, value2, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DT not between", value1, value2, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Integer> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Integer> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andLastupdateDtIsNull() {
            addCriterion("LASTUPDATE_DT is null");
            return (Criteria) this;
        }

        public Criteria andLastupdateDtIsNotNull() {
            addCriterion("LASTUPDATE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdateDtEqualTo(Date value) {
            addCriterion("LASTUPDATE_DT =", value, "lastupdateDt");
            return (Criteria) this;
        }

        public Criteria andLastupdateDtNotEqualTo(Date value) {
            addCriterion("LASTUPDATE_DT <>", value, "lastupdateDt");
            return (Criteria) this;
        }

        public Criteria andLastupdateDtGreaterThan(Date value) {
            addCriterion("LASTUPDATE_DT >", value, "lastupdateDt");
            return (Criteria) this;
        }

        public Criteria andLastupdateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTUPDATE_DT >=", value, "lastupdateDt");
            return (Criteria) this;
        }

        public Criteria andLastupdateDtLessThan(Date value) {
            addCriterion("LASTUPDATE_DT <", value, "lastupdateDt");
            return (Criteria) this;
        }

        public Criteria andLastupdateDtLessThanOrEqualTo(Date value) {
            addCriterion("LASTUPDATE_DT <=", value, "lastupdateDt");
            return (Criteria) this;
        }

        public Criteria andLastupdateDtIn(List<Date> values) {
            addCriterion("LASTUPDATE_DT in", values, "lastupdateDt");
            return (Criteria) this;
        }

        public Criteria andLastupdateDtNotIn(List<Date> values) {
            addCriterion("LASTUPDATE_DT not in", values, "lastupdateDt");
            return (Criteria) this;
        }

        public Criteria andLastupdateDtBetween(Date value1, Date value2) {
            addCriterion("LASTUPDATE_DT between", value1, value2, "lastupdateDt");
            return (Criteria) this;
        }

        public Criteria andLastupdateDtNotBetween(Date value1, Date value2) {
            addCriterion("LASTUPDATE_DT not between", value1, value2, "lastupdateDt");
            return (Criteria) this;
        }

        public Criteria andLastupdateByIsNull() {
            addCriterion("LASTUPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastupdateByIsNotNull() {
            addCriterion("LASTUPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdateByEqualTo(Integer value) {
            addCriterion("LASTUPDATE_BY =", value, "lastupdateBy");
            return (Criteria) this;
        }

        public Criteria andLastupdateByNotEqualTo(Integer value) {
            addCriterion("LASTUPDATE_BY <>", value, "lastupdateBy");
            return (Criteria) this;
        }

        public Criteria andLastupdateByGreaterThan(Integer value) {
            addCriterion("LASTUPDATE_BY >", value, "lastupdateBy");
            return (Criteria) this;
        }

        public Criteria andLastupdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("LASTUPDATE_BY >=", value, "lastupdateBy");
            return (Criteria) this;
        }

        public Criteria andLastupdateByLessThan(Integer value) {
            addCriterion("LASTUPDATE_BY <", value, "lastupdateBy");
            return (Criteria) this;
        }

        public Criteria andLastupdateByLessThanOrEqualTo(Integer value) {
            addCriterion("LASTUPDATE_BY <=", value, "lastupdateBy");
            return (Criteria) this;
        }

        public Criteria andLastupdateByIn(List<Integer> values) {
            addCriterion("LASTUPDATE_BY in", values, "lastupdateBy");
            return (Criteria) this;
        }

        public Criteria andLastupdateByNotIn(List<Integer> values) {
            addCriterion("LASTUPDATE_BY not in", values, "lastupdateBy");
            return (Criteria) this;
        }

        public Criteria andLastupdateByBetween(Integer value1, Integer value2) {
            addCriterion("LASTUPDATE_BY between", value1, value2, "lastupdateBy");
            return (Criteria) this;
        }

        public Criteria andLastupdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("LASTUPDATE_BY not between", value1, value2, "lastupdateBy");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("PWD is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("PWD is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("PWD =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("PWD <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("PWD >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("PWD >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("PWD <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("PWD <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("PWD like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("PWD not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("PWD in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("PWD not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("PWD between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("PWD not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNull() {
            addCriterion("TRUE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNotNull() {
            addCriterion("TRUE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTrueNameEqualTo(String value) {
            addCriterion("TRUE_NAME =", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotEqualTo(String value) {
            addCriterion("TRUE_NAME <>", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThan(String value) {
            addCriterion("TRUE_NAME >", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRUE_NAME >=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThan(String value) {
            addCriterion("TRUE_NAME <", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThanOrEqualTo(String value) {
            addCriterion("TRUE_NAME <=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLike(String value) {
            addCriterion("TRUE_NAME like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotLike(String value) {
            addCriterion("TRUE_NAME not like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameIn(List<String> values) {
            addCriterion("TRUE_NAME in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotIn(List<String> values) {
            addCriterion("TRUE_NAME not in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameBetween(String value1, String value2) {
            addCriterion("TRUE_NAME between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotBetween(String value1, String value2) {
            addCriterion("TRUE_NAME not between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("ADDR =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("ADDR <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("ADDR >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("ADDR <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("ADDR <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("ADDR like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("ADDR not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("ADDR in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("ADDR not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("ADDR between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("ADDR not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("CARD is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("CARD is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("CARD =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("CARD <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("CARD >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("CARD >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("CARD <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("CARD <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("CARD like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("CARD not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("CARD in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("CARD not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("CARD between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("CARD not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andStatIsNull() {
            addCriterion("STAT is null");
            return (Criteria) this;
        }

        public Criteria andStatIsNotNull() {
            addCriterion("STAT is not null");
            return (Criteria) this;
        }

        public Criteria andStatEqualTo(String value) {
            addCriterion("STAT =", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotEqualTo(String value) {
            addCriterion("STAT <>", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThan(String value) {
            addCriterion("STAT >", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThanOrEqualTo(String value) {
            addCriterion("STAT >=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThan(String value) {
            addCriterion("STAT <", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThanOrEqualTo(String value) {
            addCriterion("STAT <=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLike(String value) {
            addCriterion("STAT like", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotLike(String value) {
            addCriterion("STAT not like", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatIn(List<String> values) {
            addCriterion("STAT in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotIn(List<String> values) {
            addCriterion("STAT not in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatBetween(String value1, String value2) {
            addCriterion("STAT between", value1, value2, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotBetween(String value1, String value2) {
            addCriterion("STAT not between", value1, value2, "stat");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("SALT is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("SALT is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("SALT =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("SALT <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("SALT >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("SALT >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("SALT <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("SALT <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("SALT like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("SALT not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("SALT in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("SALT not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("SALT between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("SALT not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andPwd2IsNull() {
            addCriterion("PWD2 is null");
            return (Criteria) this;
        }

        public Criteria andPwd2IsNotNull() {
            addCriterion("PWD2 is not null");
            return (Criteria) this;
        }

        public Criteria andPwd2EqualTo(String value) {
            addCriterion("PWD2 =", value, "pwd2");
            return (Criteria) this;
        }

        public Criteria andPwd2NotEqualTo(String value) {
            addCriterion("PWD2 <>", value, "pwd2");
            return (Criteria) this;
        }

        public Criteria andPwd2GreaterThan(String value) {
            addCriterion("PWD2 >", value, "pwd2");
            return (Criteria) this;
        }

        public Criteria andPwd2GreaterThanOrEqualTo(String value) {
            addCriterion("PWD2 >=", value, "pwd2");
            return (Criteria) this;
        }

        public Criteria andPwd2LessThan(String value) {
            addCriterion("PWD2 <", value, "pwd2");
            return (Criteria) this;
        }

        public Criteria andPwd2LessThanOrEqualTo(String value) {
            addCriterion("PWD2 <=", value, "pwd2");
            return (Criteria) this;
        }

        public Criteria andPwd2Like(String value) {
            addCriterion("PWD2 like", value, "pwd2");
            return (Criteria) this;
        }

        public Criteria andPwd2NotLike(String value) {
            addCriterion("PWD2 not like", value, "pwd2");
            return (Criteria) this;
        }

        public Criteria andPwd2In(List<String> values) {
            addCriterion("PWD2 in", values, "pwd2");
            return (Criteria) this;
        }

        public Criteria andPwd2NotIn(List<String> values) {
            addCriterion("PWD2 not in", values, "pwd2");
            return (Criteria) this;
        }

        public Criteria andPwd2Between(String value1, String value2) {
            addCriterion("PWD2 between", value1, value2, "pwd2");
            return (Criteria) this;
        }

        public Criteria andPwd2NotBetween(String value1, String value2) {
            addCriterion("PWD2 not between", value1, value2, "pwd2");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(NAME) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andPwdLikeInsensitive(String value) {
            addCriterion("upper(PWD) like", value.toUpperCase(), "pwd");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(TYPE) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }

        public Criteria andTrueNameLikeInsensitive(String value) {
            addCriterion("upper(TRUE_NAME) like", value.toUpperCase(), "trueName");
            return (Criteria) this;
        }

        public Criteria andAddrLikeInsensitive(String value) {
            addCriterion("upper(ADDR) like", value.toUpperCase(), "addr");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(MOBILE) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(EMAIL) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andCardLikeInsensitive(String value) {
            addCriterion("upper(CARD) like", value.toUpperCase(), "card");
            return (Criteria) this;
        }

        public Criteria andStatLikeInsensitive(String value) {
            addCriterion("upper(STAT) like", value.toUpperCase(), "stat");
            return (Criteria) this;
        }

        public Criteria andSaltLikeInsensitive(String value) {
            addCriterion("upper(SALT) like", value.toUpperCase(), "salt");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(MEMO) like", value.toUpperCase(), "memo");
            return (Criteria) this;
        }

        public Criteria andPwd2LikeInsensitive(String value) {
            addCriterion("upper(PWD2) like", value.toUpperCase(), "pwd2");
            return (Criteria) this;
        }
    }

    /**
     * tb_user
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table tb_user
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}