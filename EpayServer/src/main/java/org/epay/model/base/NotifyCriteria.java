package org.epay.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotifyCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table notify
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table notify
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table notify
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table notify
     *
     * @mbg.generated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table notify
     *
     * @mbg.generated
     */
    protected int pageSize = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public NotifyCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify
     *
     * @mbg.generated
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table notify
     *
     * @mbg.generated
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

        public Criteria andNotifyIdIsNull() {
            addCriterion("notify_id is null");
            return (Criteria) this;
        }

        public Criteria andNotifyIdIsNotNull() {
            addCriterion("notify_id is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyIdEqualTo(String value) {
            addCriterion("notify_id =", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdNotEqualTo(String value) {
            addCriterion("notify_id <>", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdGreaterThan(String value) {
            addCriterion("notify_id >", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("notify_id >=", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdLessThan(String value) {
            addCriterion("notify_id <", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdLessThanOrEqualTo(String value) {
            addCriterion("notify_id <=", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdLike(String value) {
            addCriterion("notify_id like", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdNotLike(String value) {
            addCriterion("notify_id not like", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdIn(List<String> values) {
            addCriterion("notify_id in", values, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdNotIn(List<String> values) {
            addCriterion("notify_id not in", values, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdBetween(String value1, String value2) {
            addCriterion("notify_id between", value1, value2, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdNotBetween(String value1, String value2) {
            addCriterion("notify_id not between", value1, value2, "notifyId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdIsNull() {
            addCriterion("order_record_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdIsNotNull() {
            addCriterion("order_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdEqualTo(String value) {
            addCriterion("order_record_id =", value, "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdNotEqualTo(String value) {
            addCriterion("order_record_id <>", value, "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdGreaterThan(String value) {
            addCriterion("order_record_id >", value, "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_record_id >=", value, "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdLessThan(String value) {
            addCriterion("order_record_id <", value, "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdLessThanOrEqualTo(String value) {
            addCriterion("order_record_id <=", value, "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdLike(String value) {
            addCriterion("order_record_id like", value, "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdNotLike(String value) {
            addCriterion("order_record_id not like", value, "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdIn(List<String> values) {
            addCriterion("order_record_id in", values, "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdNotIn(List<String> values) {
            addCriterion("order_record_id not in", values, "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdBetween(String value1, String value2) {
            addCriterion("order_record_id between", value1, value2, "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdNotBetween(String value1, String value2) {
            addCriterion("order_record_id not between", value1, value2, "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andNotifyCreateTimeIsNull() {
            addCriterion("notify_create_time is null");
            return (Criteria) this;
        }

        public Criteria andNotifyCreateTimeIsNotNull() {
            addCriterion("notify_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyCreateTimeEqualTo(Date value) {
            addCriterion("notify_create_time =", value, "notifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andNotifyCreateTimeNotEqualTo(Date value) {
            addCriterion("notify_create_time <>", value, "notifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andNotifyCreateTimeGreaterThan(Date value) {
            addCriterion("notify_create_time >", value, "notifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andNotifyCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notify_create_time >=", value, "notifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andNotifyCreateTimeLessThan(Date value) {
            addCriterion("notify_create_time <", value, "notifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andNotifyCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("notify_create_time <=", value, "notifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andNotifyCreateTimeIn(List<Date> values) {
            addCriterion("notify_create_time in", values, "notifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andNotifyCreateTimeNotIn(List<Date> values) {
            addCriterion("notify_create_time not in", values, "notifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andNotifyCreateTimeBetween(Date value1, Date value2) {
            addCriterion("notify_create_time between", value1, value2, "notifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andNotifyCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("notify_create_time not between", value1, value2, "notifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andNotifyExpireTimeIsNull() {
            addCriterion("notify_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andNotifyExpireTimeIsNotNull() {
            addCriterion("notify_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyExpireTimeEqualTo(Date value) {
            addCriterion("notify_expire_time =", value, "notifyExpireTime");
            return (Criteria) this;
        }

        public Criteria andNotifyExpireTimeNotEqualTo(Date value) {
            addCriterion("notify_expire_time <>", value, "notifyExpireTime");
            return (Criteria) this;
        }

        public Criteria andNotifyExpireTimeGreaterThan(Date value) {
            addCriterion("notify_expire_time >", value, "notifyExpireTime");
            return (Criteria) this;
        }

        public Criteria andNotifyExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notify_expire_time >=", value, "notifyExpireTime");
            return (Criteria) this;
        }

        public Criteria andNotifyExpireTimeLessThan(Date value) {
            addCriterion("notify_expire_time <", value, "notifyExpireTime");
            return (Criteria) this;
        }

        public Criteria andNotifyExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("notify_expire_time <=", value, "notifyExpireTime");
            return (Criteria) this;
        }

        public Criteria andNotifyExpireTimeIn(List<Date> values) {
            addCriterion("notify_expire_time in", values, "notifyExpireTime");
            return (Criteria) this;
        }

        public Criteria andNotifyExpireTimeNotIn(List<Date> values) {
            addCriterion("notify_expire_time not in", values, "notifyExpireTime");
            return (Criteria) this;
        }

        public Criteria andNotifyExpireTimeBetween(Date value1, Date value2) {
            addCriterion("notify_expire_time between", value1, value2, "notifyExpireTime");
            return (Criteria) this;
        }

        public Criteria andNotifyExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("notify_expire_time not between", value1, value2, "notifyExpireTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIsNull() {
            addCriterion("notify_type is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIsNotNull() {
            addCriterion("notify_type is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeEqualTo(Byte value) {
            addCriterion("notify_type =", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotEqualTo(Byte value) {
            addCriterion("notify_type <>", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeGreaterThan(Byte value) {
            addCriterion("notify_type >", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("notify_type >=", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeLessThan(Byte value) {
            addCriterion("notify_type <", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeLessThanOrEqualTo(Byte value) {
            addCriterion("notify_type <=", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIn(List<Byte> values) {
            addCriterion("notify_type in", values, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotIn(List<Byte> values) {
            addCriterion("notify_type not in", values, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeBetween(Byte value1, Byte value2) {
            addCriterion("notify_type between", value1, value2, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("notify_type not between", value1, value2, "notifyType");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andNotifyResultIsNull() {
            addCriterion("notify_result is null");
            return (Criteria) this;
        }

        public Criteria andNotifyResultIsNotNull() {
            addCriterion("notify_result is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyResultEqualTo(String value) {
            addCriterion("notify_result =", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultNotEqualTo(String value) {
            addCriterion("notify_result <>", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultGreaterThan(String value) {
            addCriterion("notify_result >", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultGreaterThanOrEqualTo(String value) {
            addCriterion("notify_result >=", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultLessThan(String value) {
            addCriterion("notify_result <", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultLessThanOrEqualTo(String value) {
            addCriterion("notify_result <=", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultLike(String value) {
            addCriterion("notify_result like", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultNotLike(String value) {
            addCriterion("notify_result not like", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultIn(List<String> values) {
            addCriterion("notify_result in", values, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultNotIn(List<String> values) {
            addCriterion("notify_result not in", values, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultBetween(String value1, String value2) {
            addCriterion("notify_result between", value1, value2, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultNotBetween(String value1, String value2) {
            addCriterion("notify_result not between", value1, value2, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyIdLikeInsensitive(String value) {
            addCriterion("upper(notify_id) like", value.toUpperCase(), "notifyId");
            return (Criteria) this;
        }

        public Criteria andOrderRecordIdLikeInsensitive(String value) {
            addCriterion("upper(order_record_id) like", value.toUpperCase(), "orderRecordId");
            return (Criteria) this;
        }

        public Criteria andAppIdLikeInsensitive(String value) {
            addCriterion("upper(app_id) like", value.toUpperCase(), "appId");
            return (Criteria) this;
        }

        public Criteria andNotifyResultLikeInsensitive(String value) {
            addCriterion("upper(notify_result) like", value.toUpperCase(), "notifyResult");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table notify
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table notify
     *
     * @mbg.generated
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