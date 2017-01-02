package com.ygjt.gdn.psp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderQuery {
    /**
     * tb_order
     */
    protected String orderByClause;

    /**
     * tb_order
     */
    protected boolean distinct;

    /**
     * tb_order
     */
    protected List<Criteria> oredCriteria;

    /**
     * tb_order
     */
    public OrderQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * tb_order
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * tb_order
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * tb_order
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * tb_order
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * tb_order
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * tb_order
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * tb_order
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * tb_order
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * tb_order
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * tb_order
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class corresponds to the database table tb_order
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

        public Criteria andStsIsNull() {
            addCriterion("sts is null");
            return (Criteria) this;
        }

        public Criteria andStsIsNotNull() {
            addCriterion("sts is not null");
            return (Criteria) this;
        }

        public Criteria andStsEqualTo(String value) {
            addCriterion("sts =", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsNotEqualTo(String value) {
            addCriterion("sts <>", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsGreaterThan(String value) {
            addCriterion("sts >", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsGreaterThanOrEqualTo(String value) {
            addCriterion("sts >=", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsLessThan(String value) {
            addCriterion("sts <", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsLessThanOrEqualTo(String value) {
            addCriterion("sts <=", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsLike(String value) {
            addCriterion("sts like", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsNotLike(String value) {
            addCriterion("sts not like", value, "sts");
            return (Criteria) this;
        }

        public Criteria andStsIn(List<String> values) {
            addCriterion("sts in", values, "sts");
            return (Criteria) this;
        }

        public Criteria andStsNotIn(List<String> values) {
            addCriterion("sts not in", values, "sts");
            return (Criteria) this;
        }

        public Criteria andStsBetween(String value1, String value2) {
            addCriterion("sts between", value1, value2, "sts");
            return (Criteria) this;
        }

        public Criteria andStsNotBetween(String value1, String value2) {
            addCriterion("sts not between", value1, value2, "sts");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("MERCHANT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("MERCHANT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("MERCHANT_NAME =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("MERCHANT_NAME <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("MERCHANT_NAME >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NAME >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("MERCHANT_NAME <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NAME <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("MERCHANT_NAME like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("MERCHANT_NAME not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("MERCHANT_NAME in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("MERCHANT_NAME not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("MERCHANT_NAME between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_NAME not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("ORDER_NO like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("ORDER_NO not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andIsPrintIsNull() {
            addCriterion("IS_PRINT is null");
            return (Criteria) this;
        }

        public Criteria andIsPrintIsNotNull() {
            addCriterion("IS_PRINT is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrintEqualTo(String value) {
            addCriterion("IS_PRINT =", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotEqualTo(String value) {
            addCriterion("IS_PRINT <>", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintGreaterThan(String value) {
            addCriterion("IS_PRINT >", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PRINT >=", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLessThan(String value) {
            addCriterion("IS_PRINT <", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLessThanOrEqualTo(String value) {
            addCriterion("IS_PRINT <=", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLike(String value) {
            addCriterion("IS_PRINT like", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotLike(String value) {
            addCriterion("IS_PRINT not like", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintIn(List<String> values) {
            addCriterion("IS_PRINT in", values, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotIn(List<String> values) {
            addCriterion("IS_PRINT not in", values, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintBetween(String value1, String value2) {
            addCriterion("IS_PRINT between", value1, value2, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotBetween(String value1, String value2) {
            addCriterion("IS_PRINT not between", value1, value2, "isPrint");
            return (Criteria) this;
        }

        public Criteria andOrderStsIsNull() {
            addCriterion("ORDER_STS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStsIsNotNull() {
            addCriterion("ORDER_STS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStsEqualTo(String value) {
            addCriterion("ORDER_STS =", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotEqualTo(String value) {
            addCriterion("ORDER_STS <>", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsGreaterThan(String value) {
            addCriterion("ORDER_STS >", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STS >=", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsLessThan(String value) {
            addCriterion("ORDER_STS <", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STS <=", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsLike(String value) {
            addCriterion("ORDER_STS like", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotLike(String value) {
            addCriterion("ORDER_STS not like", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsIn(List<String> values) {
            addCriterion("ORDER_STS in", values, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotIn(List<String> values) {
            addCriterion("ORDER_STS not in", values, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsBetween(String value1, String value2) {
            addCriterion("ORDER_STS between", value1, value2, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotBetween(String value1, String value2) {
            addCriterion("ORDER_STS not between", value1, value2, "orderSts");
            return (Criteria) this;
        }

        public Criteria andStsLikeInsensitive(String value) {
            addCriterion("upper(sts) like", value.toUpperCase(), "sts");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLikeInsensitive(String value) {
            addCriterion("upper(MERCHANT_NAME) like", value.toUpperCase(), "merchantName");
            return (Criteria) this;
        }

        public Criteria andOrderNoLikeInsensitive(String value) {
            addCriterion("upper(ORDER_NO) like", value.toUpperCase(), "orderNo");
            return (Criteria) this;
        }

        public Criteria andIsPrintLikeInsensitive(String value) {
            addCriterion("upper(IS_PRINT) like", value.toUpperCase(), "isPrint");
            return (Criteria) this;
        }

        public Criteria andOrderStsLikeInsensitive(String value) {
            addCriterion("upper(ORDER_STS) like", value.toUpperCase(), "orderSts");
            return (Criteria) this;
        }
    }

    /**
     * tb_order
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table tb_order
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