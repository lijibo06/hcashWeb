package com.maolian.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HsrBlockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HsrBlockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andHashIsNull() {
            addCriterion("hash is null");
            return (Criteria) this;
        }

        public Criteria andHashIsNotNull() {
            addCriterion("hash is not null");
            return (Criteria) this;
        }

        public Criteria andHashEqualTo(String value) {
            addCriterion("hash =", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotEqualTo(String value) {
            addCriterion("hash <>", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashGreaterThan(String value) {
            addCriterion("hash >", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashGreaterThanOrEqualTo(String value) {
            addCriterion("hash >=", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashLessThan(String value) {
            addCriterion("hash <", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashLessThanOrEqualTo(String value) {
            addCriterion("hash <=", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashLike(String value) {
            addCriterion("hash like", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotLike(String value) {
            addCriterion("hash not like", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashIn(List<String> values) {
            addCriterion("hash in", values, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotIn(List<String> values) {
            addCriterion("hash not in", values, "hash");
            return (Criteria) this;
        }

        public Criteria andHashBetween(String value1, String value2) {
            addCriterion("hash between", value1, value2, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotBetween(String value1, String value2) {
            addCriterion("hash not between", value1, value2, "hash");
            return (Criteria) this;
        }

        public Criteria andConfirmationsIsNull() {
            addCriterion("confirmations is null");
            return (Criteria) this;
        }

        public Criteria andConfirmationsIsNotNull() {
            addCriterion("confirmations is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmationsEqualTo(Long value) {
            addCriterion("confirmations =", value, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsNotEqualTo(Long value) {
            addCriterion("confirmations <>", value, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsGreaterThan(Long value) {
            addCriterion("confirmations >", value, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsGreaterThanOrEqualTo(Long value) {
            addCriterion("confirmations >=", value, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsLessThan(Long value) {
            addCriterion("confirmations <", value, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsLessThanOrEqualTo(Long value) {
            addCriterion("confirmations <=", value, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsIn(List<Long> values) {
            addCriterion("confirmations in", values, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsNotIn(List<Long> values) {
            addCriterion("confirmations not in", values, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsBetween(Long value1, Long value2) {
            addCriterion("confirmations between", value1, value2, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsNotBetween(Long value1, Long value2) {
            addCriterion("confirmations not between", value1, value2, "confirmations");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Long value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Long value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Long value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Long value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Long value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Long> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Long> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Long value1, Long value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Long value1, Long value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Long value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Long value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Long value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Long value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Long value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Long value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Long> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Long> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Long value1, Long value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Long value1, Long value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andMerklerootIsNull() {
            addCriterion("merkleroot is null");
            return (Criteria) this;
        }

        public Criteria andMerklerootIsNotNull() {
            addCriterion("merkleroot is not null");
            return (Criteria) this;
        }

        public Criteria andMerklerootEqualTo(String value) {
            addCriterion("merkleroot =", value, "merkleroot");
            return (Criteria) this;
        }

        public Criteria andMerklerootNotEqualTo(String value) {
            addCriterion("merkleroot <>", value, "merkleroot");
            return (Criteria) this;
        }

        public Criteria andMerklerootGreaterThan(String value) {
            addCriterion("merkleroot >", value, "merkleroot");
            return (Criteria) this;
        }

        public Criteria andMerklerootGreaterThanOrEqualTo(String value) {
            addCriterion("merkleroot >=", value, "merkleroot");
            return (Criteria) this;
        }

        public Criteria andMerklerootLessThan(String value) {
            addCriterion("merkleroot <", value, "merkleroot");
            return (Criteria) this;
        }

        public Criteria andMerklerootLessThanOrEqualTo(String value) {
            addCriterion("merkleroot <=", value, "merkleroot");
            return (Criteria) this;
        }

        public Criteria andMerklerootLike(String value) {
            addCriterion("merkleroot like", value, "merkleroot");
            return (Criteria) this;
        }

        public Criteria andMerklerootNotLike(String value) {
            addCriterion("merkleroot not like", value, "merkleroot");
            return (Criteria) this;
        }

        public Criteria andMerklerootIn(List<String> values) {
            addCriterion("merkleroot in", values, "merkleroot");
            return (Criteria) this;
        }

        public Criteria andMerklerootNotIn(List<String> values) {
            addCriterion("merkleroot not in", values, "merkleroot");
            return (Criteria) this;
        }

        public Criteria andMerklerootBetween(String value1, String value2) {
            addCriterion("merkleroot between", value1, value2, "merkleroot");
            return (Criteria) this;
        }

        public Criteria andMerklerootNotBetween(String value1, String value2) {
            addCriterion("merkleroot not between", value1, value2, "merkleroot");
            return (Criteria) this;
        }

        public Criteria andMintIsNull() {
            addCriterion("mint is null");
            return (Criteria) this;
        }

        public Criteria andMintIsNotNull() {
            addCriterion("mint is not null");
            return (Criteria) this;
        }

        public Criteria andMintEqualTo(BigDecimal value) {
            addCriterion("mint =", value, "mint");
            return (Criteria) this;
        }

        public Criteria andMintNotEqualTo(BigDecimal value) {
            addCriterion("mint <>", value, "mint");
            return (Criteria) this;
        }

        public Criteria andMintGreaterThan(BigDecimal value) {
            addCriterion("mint >", value, "mint");
            return (Criteria) this;
        }

        public Criteria andMintGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mint >=", value, "mint");
            return (Criteria) this;
        }

        public Criteria andMintLessThan(BigDecimal value) {
            addCriterion("mint <", value, "mint");
            return (Criteria) this;
        }

        public Criteria andMintLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mint <=", value, "mint");
            return (Criteria) this;
        }

        public Criteria andMintIn(List<BigDecimal> values) {
            addCriterion("mint in", values, "mint");
            return (Criteria) this;
        }

        public Criteria andMintNotIn(List<BigDecimal> values) {
            addCriterion("mint not in", values, "mint");
            return (Criteria) this;
        }

        public Criteria andMintBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mint between", value1, value2, "mint");
            return (Criteria) this;
        }

        public Criteria andMintNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mint not between", value1, value2, "mint");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andNonceIsNull() {
            addCriterion("nonce is null");
            return (Criteria) this;
        }

        public Criteria andNonceIsNotNull() {
            addCriterion("nonce is not null");
            return (Criteria) this;
        }

        public Criteria andNonceEqualTo(Long value) {
            addCriterion("nonce =", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceNotEqualTo(Long value) {
            addCriterion("nonce <>", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceGreaterThan(Long value) {
            addCriterion("nonce >", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceGreaterThanOrEqualTo(Long value) {
            addCriterion("nonce >=", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceLessThan(Long value) {
            addCriterion("nonce <", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceLessThanOrEqualTo(Long value) {
            addCriterion("nonce <=", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceIn(List<Long> values) {
            addCriterion("nonce in", values, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceNotIn(List<Long> values) {
            addCriterion("nonce not in", values, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceBetween(Long value1, Long value2) {
            addCriterion("nonce between", value1, value2, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceNotBetween(Long value1, Long value2) {
            addCriterion("nonce not between", value1, value2, "nonce");
            return (Criteria) this;
        }

        public Criteria andBitsIsNull() {
            addCriterion("bits is null");
            return (Criteria) this;
        }

        public Criteria andBitsIsNotNull() {
            addCriterion("bits is not null");
            return (Criteria) this;
        }

        public Criteria andBitsEqualTo(String value) {
            addCriterion("bits =", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsNotEqualTo(String value) {
            addCriterion("bits <>", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsGreaterThan(String value) {
            addCriterion("bits >", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsGreaterThanOrEqualTo(String value) {
            addCriterion("bits >=", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsLessThan(String value) {
            addCriterion("bits <", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsLessThanOrEqualTo(String value) {
            addCriterion("bits <=", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsLike(String value) {
            addCriterion("bits like", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsNotLike(String value) {
            addCriterion("bits not like", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsIn(List<String> values) {
            addCriterion("bits in", values, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsNotIn(List<String> values) {
            addCriterion("bits not in", values, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsBetween(String value1, String value2) {
            addCriterion("bits between", value1, value2, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsNotBetween(String value1, String value2) {
            addCriterion("bits not between", value1, value2, "bits");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNull() {
            addCriterion("difficulty is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNotNull() {
            addCriterion("difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyEqualTo(BigDecimal value) {
            addCriterion("difficulty =", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotEqualTo(BigDecimal value) {
            addCriterion("difficulty <>", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThan(BigDecimal value) {
            addCriterion("difficulty >", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("difficulty >=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThan(BigDecimal value) {
            addCriterion("difficulty <", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("difficulty <=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyIn(List<BigDecimal> values) {
            addCriterion("difficulty in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotIn(List<BigDecimal> values) {
            addCriterion("difficulty not in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difficulty between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difficulty not between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andBlocktrustIsNull() {
            addCriterion("blocktrust is null");
            return (Criteria) this;
        }

        public Criteria andBlocktrustIsNotNull() {
            addCriterion("blocktrust is not null");
            return (Criteria) this;
        }

        public Criteria andBlocktrustEqualTo(String value) {
            addCriterion("blocktrust =", value, "blocktrust");
            return (Criteria) this;
        }

        public Criteria andBlocktrustNotEqualTo(String value) {
            addCriterion("blocktrust <>", value, "blocktrust");
            return (Criteria) this;
        }

        public Criteria andBlocktrustGreaterThan(String value) {
            addCriterion("blocktrust >", value, "blocktrust");
            return (Criteria) this;
        }

        public Criteria andBlocktrustGreaterThanOrEqualTo(String value) {
            addCriterion("blocktrust >=", value, "blocktrust");
            return (Criteria) this;
        }

        public Criteria andBlocktrustLessThan(String value) {
            addCriterion("blocktrust <", value, "blocktrust");
            return (Criteria) this;
        }

        public Criteria andBlocktrustLessThanOrEqualTo(String value) {
            addCriterion("blocktrust <=", value, "blocktrust");
            return (Criteria) this;
        }

        public Criteria andBlocktrustLike(String value) {
            addCriterion("blocktrust like", value, "blocktrust");
            return (Criteria) this;
        }

        public Criteria andBlocktrustNotLike(String value) {
            addCriterion("blocktrust not like", value, "blocktrust");
            return (Criteria) this;
        }

        public Criteria andBlocktrustIn(List<String> values) {
            addCriterion("blocktrust in", values, "blocktrust");
            return (Criteria) this;
        }

        public Criteria andBlocktrustNotIn(List<String> values) {
            addCriterion("blocktrust not in", values, "blocktrust");
            return (Criteria) this;
        }

        public Criteria andBlocktrustBetween(String value1, String value2) {
            addCriterion("blocktrust between", value1, value2, "blocktrust");
            return (Criteria) this;
        }

        public Criteria andBlocktrustNotBetween(String value1, String value2) {
            addCriterion("blocktrust not between", value1, value2, "blocktrust");
            return (Criteria) this;
        }

        public Criteria andChaintrustIsNull() {
            addCriterion("chaintrust is null");
            return (Criteria) this;
        }

        public Criteria andChaintrustIsNotNull() {
            addCriterion("chaintrust is not null");
            return (Criteria) this;
        }

        public Criteria andChaintrustEqualTo(String value) {
            addCriterion("chaintrust =", value, "chaintrust");
            return (Criteria) this;
        }

        public Criteria andChaintrustNotEqualTo(String value) {
            addCriterion("chaintrust <>", value, "chaintrust");
            return (Criteria) this;
        }

        public Criteria andChaintrustGreaterThan(String value) {
            addCriterion("chaintrust >", value, "chaintrust");
            return (Criteria) this;
        }

        public Criteria andChaintrustGreaterThanOrEqualTo(String value) {
            addCriterion("chaintrust >=", value, "chaintrust");
            return (Criteria) this;
        }

        public Criteria andChaintrustLessThan(String value) {
            addCriterion("chaintrust <", value, "chaintrust");
            return (Criteria) this;
        }

        public Criteria andChaintrustLessThanOrEqualTo(String value) {
            addCriterion("chaintrust <=", value, "chaintrust");
            return (Criteria) this;
        }

        public Criteria andChaintrustLike(String value) {
            addCriterion("chaintrust like", value, "chaintrust");
            return (Criteria) this;
        }

        public Criteria andChaintrustNotLike(String value) {
            addCriterion("chaintrust not like", value, "chaintrust");
            return (Criteria) this;
        }

        public Criteria andChaintrustIn(List<String> values) {
            addCriterion("chaintrust in", values, "chaintrust");
            return (Criteria) this;
        }

        public Criteria andChaintrustNotIn(List<String> values) {
            addCriterion("chaintrust not in", values, "chaintrust");
            return (Criteria) this;
        }

        public Criteria andChaintrustBetween(String value1, String value2) {
            addCriterion("chaintrust between", value1, value2, "chaintrust");
            return (Criteria) this;
        }

        public Criteria andChaintrustNotBetween(String value1, String value2) {
            addCriterion("chaintrust not between", value1, value2, "chaintrust");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashIsNull() {
            addCriterion("previousblockhash is null");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashIsNotNull() {
            addCriterion("previousblockhash is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashEqualTo(String value) {
            addCriterion("previousblockhash =", value, "previousblockhash");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashNotEqualTo(String value) {
            addCriterion("previousblockhash <>", value, "previousblockhash");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashGreaterThan(String value) {
            addCriterion("previousblockhash >", value, "previousblockhash");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashGreaterThanOrEqualTo(String value) {
            addCriterion("previousblockhash >=", value, "previousblockhash");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashLessThan(String value) {
            addCriterion("previousblockhash <", value, "previousblockhash");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashLessThanOrEqualTo(String value) {
            addCriterion("previousblockhash <=", value, "previousblockhash");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashLike(String value) {
            addCriterion("previousblockhash like", value, "previousblockhash");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashNotLike(String value) {
            addCriterion("previousblockhash not like", value, "previousblockhash");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashIn(List<String> values) {
            addCriterion("previousblockhash in", values, "previousblockhash");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashNotIn(List<String> values) {
            addCriterion("previousblockhash not in", values, "previousblockhash");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashBetween(String value1, String value2) {
            addCriterion("previousblockhash between", value1, value2, "previousblockhash");
            return (Criteria) this;
        }

        public Criteria andPreviousblockhashNotBetween(String value1, String value2) {
            addCriterion("previousblockhash not between", value1, value2, "previousblockhash");
            return (Criteria) this;
        }

        public Criteria andNextblockhashIsNull() {
            addCriterion("nextblockhash is null");
            return (Criteria) this;
        }

        public Criteria andNextblockhashIsNotNull() {
            addCriterion("nextblockhash is not null");
            return (Criteria) this;
        }

        public Criteria andNextblockhashEqualTo(String value) {
            addCriterion("nextblockhash =", value, "nextblockhash");
            return (Criteria) this;
        }

        public Criteria andNextblockhashNotEqualTo(String value) {
            addCriterion("nextblockhash <>", value, "nextblockhash");
            return (Criteria) this;
        }

        public Criteria andNextblockhashGreaterThan(String value) {
            addCriterion("nextblockhash >", value, "nextblockhash");
            return (Criteria) this;
        }

        public Criteria andNextblockhashGreaterThanOrEqualTo(String value) {
            addCriterion("nextblockhash >=", value, "nextblockhash");
            return (Criteria) this;
        }

        public Criteria andNextblockhashLessThan(String value) {
            addCriterion("nextblockhash <", value, "nextblockhash");
            return (Criteria) this;
        }

        public Criteria andNextblockhashLessThanOrEqualTo(String value) {
            addCriterion("nextblockhash <=", value, "nextblockhash");
            return (Criteria) this;
        }

        public Criteria andNextblockhashLike(String value) {
            addCriterion("nextblockhash like", value, "nextblockhash");
            return (Criteria) this;
        }

        public Criteria andNextblockhashNotLike(String value) {
            addCriterion("nextblockhash not like", value, "nextblockhash");
            return (Criteria) this;
        }

        public Criteria andNextblockhashIn(List<String> values) {
            addCriterion("nextblockhash in", values, "nextblockhash");
            return (Criteria) this;
        }

        public Criteria andNextblockhashNotIn(List<String> values) {
            addCriterion("nextblockhash not in", values, "nextblockhash");
            return (Criteria) this;
        }

        public Criteria andNextblockhashBetween(String value1, String value2) {
            addCriterion("nextblockhash between", value1, value2, "nextblockhash");
            return (Criteria) this;
        }

        public Criteria andNextblockhashNotBetween(String value1, String value2) {
            addCriterion("nextblockhash not between", value1, value2, "nextblockhash");
            return (Criteria) this;
        }

        public Criteria andFlagsIsNull() {
            addCriterion("flags is null");
            return (Criteria) this;
        }

        public Criteria andFlagsIsNotNull() {
            addCriterion("flags is not null");
            return (Criteria) this;
        }

        public Criteria andFlagsEqualTo(String value) {
            addCriterion("flags =", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotEqualTo(String value) {
            addCriterion("flags <>", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsGreaterThan(String value) {
            addCriterion("flags >", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsGreaterThanOrEqualTo(String value) {
            addCriterion("flags >=", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsLessThan(String value) {
            addCriterion("flags <", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsLessThanOrEqualTo(String value) {
            addCriterion("flags <=", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsLike(String value) {
            addCriterion("flags like", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotLike(String value) {
            addCriterion("flags not like", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsIn(List<String> values) {
            addCriterion("flags in", values, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotIn(List<String> values) {
            addCriterion("flags not in", values, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsBetween(String value1, String value2) {
            addCriterion("flags between", value1, value2, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotBetween(String value1, String value2) {
            addCriterion("flags not between", value1, value2, "flags");
            return (Criteria) this;
        }

        public Criteria andProofhashIsNull() {
            addCriterion("proofhash is null");
            return (Criteria) this;
        }

        public Criteria andProofhashIsNotNull() {
            addCriterion("proofhash is not null");
            return (Criteria) this;
        }

        public Criteria andProofhashEqualTo(String value) {
            addCriterion("proofhash =", value, "proofhash");
            return (Criteria) this;
        }

        public Criteria andProofhashNotEqualTo(String value) {
            addCriterion("proofhash <>", value, "proofhash");
            return (Criteria) this;
        }

        public Criteria andProofhashGreaterThan(String value) {
            addCriterion("proofhash >", value, "proofhash");
            return (Criteria) this;
        }

        public Criteria andProofhashGreaterThanOrEqualTo(String value) {
            addCriterion("proofhash >=", value, "proofhash");
            return (Criteria) this;
        }

        public Criteria andProofhashLessThan(String value) {
            addCriterion("proofhash <", value, "proofhash");
            return (Criteria) this;
        }

        public Criteria andProofhashLessThanOrEqualTo(String value) {
            addCriterion("proofhash <=", value, "proofhash");
            return (Criteria) this;
        }

        public Criteria andProofhashLike(String value) {
            addCriterion("proofhash like", value, "proofhash");
            return (Criteria) this;
        }

        public Criteria andProofhashNotLike(String value) {
            addCriterion("proofhash not like", value, "proofhash");
            return (Criteria) this;
        }

        public Criteria andProofhashIn(List<String> values) {
            addCriterion("proofhash in", values, "proofhash");
            return (Criteria) this;
        }

        public Criteria andProofhashNotIn(List<String> values) {
            addCriterion("proofhash not in", values, "proofhash");
            return (Criteria) this;
        }

        public Criteria andProofhashBetween(String value1, String value2) {
            addCriterion("proofhash between", value1, value2, "proofhash");
            return (Criteria) this;
        }

        public Criteria andProofhashNotBetween(String value1, String value2) {
            addCriterion("proofhash not between", value1, value2, "proofhash");
            return (Criteria) this;
        }

        public Criteria andEntropybitIsNull() {
            addCriterion("entropybit is null");
            return (Criteria) this;
        }

        public Criteria andEntropybitIsNotNull() {
            addCriterion("entropybit is not null");
            return (Criteria) this;
        }

        public Criteria andEntropybitEqualTo(Long value) {
            addCriterion("entropybit =", value, "entropybit");
            return (Criteria) this;
        }

        public Criteria andEntropybitNotEqualTo(Long value) {
            addCriterion("entropybit <>", value, "entropybit");
            return (Criteria) this;
        }

        public Criteria andEntropybitGreaterThan(Long value) {
            addCriterion("entropybit >", value, "entropybit");
            return (Criteria) this;
        }

        public Criteria andEntropybitGreaterThanOrEqualTo(Long value) {
            addCriterion("entropybit >=", value, "entropybit");
            return (Criteria) this;
        }

        public Criteria andEntropybitLessThan(Long value) {
            addCriterion("entropybit <", value, "entropybit");
            return (Criteria) this;
        }

        public Criteria andEntropybitLessThanOrEqualTo(Long value) {
            addCriterion("entropybit <=", value, "entropybit");
            return (Criteria) this;
        }

        public Criteria andEntropybitIn(List<Long> values) {
            addCriterion("entropybit in", values, "entropybit");
            return (Criteria) this;
        }

        public Criteria andEntropybitNotIn(List<Long> values) {
            addCriterion("entropybit not in", values, "entropybit");
            return (Criteria) this;
        }

        public Criteria andEntropybitBetween(Long value1, Long value2) {
            addCriterion("entropybit between", value1, value2, "entropybit");
            return (Criteria) this;
        }

        public Criteria andEntropybitNotBetween(Long value1, Long value2) {
            addCriterion("entropybit not between", value1, value2, "entropybit");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierv2IsNull() {
            addCriterion("modifierv2 is null");
            return (Criteria) this;
        }

        public Criteria andModifierv2IsNotNull() {
            addCriterion("modifierv2 is not null");
            return (Criteria) this;
        }

        public Criteria andModifierv2EqualTo(String value) {
            addCriterion("modifierv2 =", value, "modifierv2");
            return (Criteria) this;
        }

        public Criteria andModifierv2NotEqualTo(String value) {
            addCriterion("modifierv2 <>", value, "modifierv2");
            return (Criteria) this;
        }

        public Criteria andModifierv2GreaterThan(String value) {
            addCriterion("modifierv2 >", value, "modifierv2");
            return (Criteria) this;
        }

        public Criteria andModifierv2GreaterThanOrEqualTo(String value) {
            addCriterion("modifierv2 >=", value, "modifierv2");
            return (Criteria) this;
        }

        public Criteria andModifierv2LessThan(String value) {
            addCriterion("modifierv2 <", value, "modifierv2");
            return (Criteria) this;
        }

        public Criteria andModifierv2LessThanOrEqualTo(String value) {
            addCriterion("modifierv2 <=", value, "modifierv2");
            return (Criteria) this;
        }

        public Criteria andModifierv2Like(String value) {
            addCriterion("modifierv2 like", value, "modifierv2");
            return (Criteria) this;
        }

        public Criteria andModifierv2NotLike(String value) {
            addCriterion("modifierv2 not like", value, "modifierv2");
            return (Criteria) this;
        }

        public Criteria andModifierv2In(List<String> values) {
            addCriterion("modifierv2 in", values, "modifierv2");
            return (Criteria) this;
        }

        public Criteria andModifierv2NotIn(List<String> values) {
            addCriterion("modifierv2 not in", values, "modifierv2");
            return (Criteria) this;
        }

        public Criteria andModifierv2Between(String value1, String value2) {
            addCriterion("modifierv2 between", value1, value2, "modifierv2");
            return (Criteria) this;
        }

        public Criteria andModifierv2NotBetween(String value1, String value2) {
            addCriterion("modifierv2 not between", value1, value2, "modifierv2");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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