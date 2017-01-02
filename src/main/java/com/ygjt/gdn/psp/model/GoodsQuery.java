package com.ygjt.gdn.psp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsQuery {
    /**
     * tb_goods
     */
    protected String orderByClause;

    /**
     * tb_goods
     */
    protected boolean distinct;

    /**
     * tb_goods
     */
    protected List<Criteria> oredCriteria;

    /**
     * tb_goods
     */
    public GoodsQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * tb_goods
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * tb_goods
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * tb_goods
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * tb_goods
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * tb_goods
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * tb_goods
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * tb_goods
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * tb_goods
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * tb_goods
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * tb_goods
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class corresponds to the database table tb_goods
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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIsNull() {
            addCriterion("GOODS_SORT is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIsNotNull() {
            addCriterion("GOODS_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortEqualTo(Integer value) {
            addCriterion("GOODS_SORT =", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotEqualTo(Integer value) {
            addCriterion("GOODS_SORT <>", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortGreaterThan(Integer value) {
            addCriterion("GOODS_SORT >", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_SORT >=", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortLessThan(Integer value) {
            addCriterion("GOODS_SORT <", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_SORT <=", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIn(List<Integer> values) {
            addCriterion("GOODS_SORT in", values, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotIn(List<Integer> values) {
            addCriterion("GOODS_SORT not in", values, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_SORT between", value1, value2, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_SORT not between", value1, value2, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andStsLikeInsensitive(String value) {
            addCriterion("upper(sts) like", value.toUpperCase(), "sts");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(NAME) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(CODE) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }
    }

    /**
     * tb_goods
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table tb_goods
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