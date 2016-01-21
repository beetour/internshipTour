package com.internshipTour.bean;

import java.util.ArrayList;
import java.util.List;

public class OcenterCpsTripExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OcenterCpsTripExample() {
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

        public Criteria andTripIdIsNull() {
            addCriterion("trip_id is null");
            return (Criteria) this;
        }

        public Criteria andTripIdIsNotNull() {
            addCriterion("trip_id is not null");
            return (Criteria) this;
        }

        public Criteria andTripIdEqualTo(Integer value) {
            addCriterion("trip_id =", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdNotEqualTo(Integer value) {
            addCriterion("trip_id <>", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdGreaterThan(Integer value) {
            addCriterion("trip_id >", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trip_id >=", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdLessThan(Integer value) {
            addCriterion("trip_id <", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdLessThanOrEqualTo(Integer value) {
            addCriterion("trip_id <=", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdIn(List<Integer> values) {
            addCriterion("trip_id in", values, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdNotIn(List<Integer> values) {
            addCriterion("trip_id not in", values, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdBetween(Integer value1, Integer value2) {
            addCriterion("trip_id between", value1, value2, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trip_id not between", value1, value2, "tripId");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnIsNull() {
            addCriterion("pic_info_en is null");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnIsNotNull() {
            addCriterion("pic_info_en is not null");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnEqualTo(String value) {
            addCriterion("pic_info_en =", value, "picInfoEn");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnNotEqualTo(String value) {
            addCriterion("pic_info_en <>", value, "picInfoEn");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnGreaterThan(String value) {
            addCriterion("pic_info_en >", value, "picInfoEn");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnGreaterThanOrEqualTo(String value) {
            addCriterion("pic_info_en >=", value, "picInfoEn");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnLessThan(String value) {
            addCriterion("pic_info_en <", value, "picInfoEn");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnLessThanOrEqualTo(String value) {
            addCriterion("pic_info_en <=", value, "picInfoEn");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnLike(String value) {
            addCriterion("pic_info_en like", value, "picInfoEn");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnNotLike(String value) {
            addCriterion("pic_info_en not like", value, "picInfoEn");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnIn(List<String> values) {
            addCriterion("pic_info_en in", values, "picInfoEn");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnNotIn(List<String> values) {
            addCriterion("pic_info_en not in", values, "picInfoEn");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnBetween(String value1, String value2) {
            addCriterion("pic_info_en between", value1, value2, "picInfoEn");
            return (Criteria) this;
        }

        public Criteria andPicInfoEnNotBetween(String value1, String value2) {
            addCriterion("pic_info_en not between", value1, value2, "picInfoEn");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkIsNull() {
            addCriterion("photo_mark is null");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkIsNotNull() {
            addCriterion("photo_mark is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkEqualTo(String value) {
            addCriterion("photo_mark =", value, "photoMark");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkNotEqualTo(String value) {
            addCriterion("photo_mark <>", value, "photoMark");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkGreaterThan(String value) {
            addCriterion("photo_mark >", value, "photoMark");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkGreaterThanOrEqualTo(String value) {
            addCriterion("photo_mark >=", value, "photoMark");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkLessThan(String value) {
            addCriterion("photo_mark <", value, "photoMark");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkLessThanOrEqualTo(String value) {
            addCriterion("photo_mark <=", value, "photoMark");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkLike(String value) {
            addCriterion("photo_mark like", value, "photoMark");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkNotLike(String value) {
            addCriterion("photo_mark not like", value, "photoMark");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkIn(List<String> values) {
            addCriterion("photo_mark in", values, "photoMark");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkNotIn(List<String> values) {
            addCriterion("photo_mark not in", values, "photoMark");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkBetween(String value1, String value2) {
            addCriterion("photo_mark between", value1, value2, "photoMark");
            return (Criteria) this;
        }

        public Criteria andPhotoMarkNotBetween(String value1, String value2) {
            addCriterion("photo_mark not between", value1, value2, "photoMark");
            return (Criteria) this;
        }

        public Criteria andPhotoSubidIsNull() {
            addCriterion("photo_subid is null");
            return (Criteria) this;
        }

        public Criteria andPhotoSubidIsNotNull() {
            addCriterion("photo_subid is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoSubidEqualTo(Integer value) {
            addCriterion("photo_subid =", value, "photoSubid");
            return (Criteria) this;
        }

        public Criteria andPhotoSubidNotEqualTo(Integer value) {
            addCriterion("photo_subid <>", value, "photoSubid");
            return (Criteria) this;
        }

        public Criteria andPhotoSubidGreaterThan(Integer value) {
            addCriterion("photo_subid >", value, "photoSubid");
            return (Criteria) this;
        }

        public Criteria andPhotoSubidGreaterThanOrEqualTo(Integer value) {
            addCriterion("photo_subid >=", value, "photoSubid");
            return (Criteria) this;
        }

        public Criteria andPhotoSubidLessThan(Integer value) {
            addCriterion("photo_subid <", value, "photoSubid");
            return (Criteria) this;
        }

        public Criteria andPhotoSubidLessThanOrEqualTo(Integer value) {
            addCriterion("photo_subid <=", value, "photoSubid");
            return (Criteria) this;
        }

        public Criteria andPhotoSubidIn(List<Integer> values) {
            addCriterion("photo_subid in", values, "photoSubid");
            return (Criteria) this;
        }

        public Criteria andPhotoSubidNotIn(List<Integer> values) {
            addCriterion("photo_subid not in", values, "photoSubid");
            return (Criteria) this;
        }

        public Criteria andPhotoSubidBetween(Integer value1, Integer value2) {
            addCriterion("photo_subid between", value1, value2, "photoSubid");
            return (Criteria) this;
        }

        public Criteria andPhotoSubidNotBetween(Integer value1, Integer value2) {
            addCriterion("photo_subid not between", value1, value2, "photoSubid");
            return (Criteria) this;
        }

        public Criteria andTrTimeIsNull() {
            addCriterion("tr_time is null");
            return (Criteria) this;
        }

        public Criteria andTrTimeIsNotNull() {
            addCriterion("tr_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrTimeEqualTo(Integer value) {
            addCriterion("tr_time =", value, "trTime");
            return (Criteria) this;
        }

        public Criteria andTrTimeNotEqualTo(Integer value) {
            addCriterion("tr_time <>", value, "trTime");
            return (Criteria) this;
        }

        public Criteria andTrTimeGreaterThan(Integer value) {
            addCriterion("tr_time >", value, "trTime");
            return (Criteria) this;
        }

        public Criteria andTrTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tr_time >=", value, "trTime");
            return (Criteria) this;
        }

        public Criteria andTrTimeLessThan(Integer value) {
            addCriterion("tr_time <", value, "trTime");
            return (Criteria) this;
        }

        public Criteria andTrTimeLessThanOrEqualTo(Integer value) {
            addCriterion("tr_time <=", value, "trTime");
            return (Criteria) this;
        }

        public Criteria andTrTimeIn(List<Integer> values) {
            addCriterion("tr_time in", values, "trTime");
            return (Criteria) this;
        }

        public Criteria andTrTimeNotIn(List<Integer> values) {
            addCriterion("tr_time not in", values, "trTime");
            return (Criteria) this;
        }

        public Criteria andTrTimeBetween(Integer value1, Integer value2) {
            addCriterion("tr_time between", value1, value2, "trTime");
            return (Criteria) this;
        }

        public Criteria andTrTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tr_time not between", value1, value2, "trTime");
            return (Criteria) this;
        }

        public Criteria andTrEndtimeIsNull() {
            addCriterion("tr_endtime is null");
            return (Criteria) this;
        }

        public Criteria andTrEndtimeIsNotNull() {
            addCriterion("tr_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andTrEndtimeEqualTo(Integer value) {
            addCriterion("tr_endtime =", value, "trEndtime");
            return (Criteria) this;
        }

        public Criteria andTrEndtimeNotEqualTo(Integer value) {
            addCriterion("tr_endtime <>", value, "trEndtime");
            return (Criteria) this;
        }

        public Criteria andTrEndtimeGreaterThan(Integer value) {
            addCriterion("tr_endtime >", value, "trEndtime");
            return (Criteria) this;
        }

        public Criteria andTrEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tr_endtime >=", value, "trEndtime");
            return (Criteria) this;
        }

        public Criteria andTrEndtimeLessThan(Integer value) {
            addCriterion("tr_endtime <", value, "trEndtime");
            return (Criteria) this;
        }

        public Criteria andTrEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("tr_endtime <=", value, "trEndtime");
            return (Criteria) this;
        }

        public Criteria andTrEndtimeIn(List<Integer> values) {
            addCriterion("tr_endtime in", values, "trEndtime");
            return (Criteria) this;
        }

        public Criteria andTrEndtimeNotIn(List<Integer> values) {
            addCriterion("tr_endtime not in", values, "trEndtime");
            return (Criteria) this;
        }

        public Criteria andTrEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("tr_endtime between", value1, value2, "trEndtime");
            return (Criteria) this;
        }

        public Criteria andTrEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tr_endtime not between", value1, value2, "trEndtime");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andCUrlIsNull() {
            addCriterion("c_url is null");
            return (Criteria) this;
        }

        public Criteria andCUrlIsNotNull() {
            addCriterion("c_url is not null");
            return (Criteria) this;
        }

        public Criteria andCUrlEqualTo(String value) {
            addCriterion("c_url =", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlNotEqualTo(String value) {
            addCriterion("c_url <>", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlGreaterThan(String value) {
            addCriterion("c_url >", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlGreaterThanOrEqualTo(String value) {
            addCriterion("c_url >=", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlLessThan(String value) {
            addCriterion("c_url <", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlLessThanOrEqualTo(String value) {
            addCriterion("c_url <=", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlLike(String value) {
            addCriterion("c_url like", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlNotLike(String value) {
            addCriterion("c_url not like", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlIn(List<String> values) {
            addCriterion("c_url in", values, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlNotIn(List<String> values) {
            addCriterion("c_url not in", values, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlBetween(String value1, String value2) {
            addCriterion("c_url between", value1, value2, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlNotBetween(String value1, String value2) {
            addCriterion("c_url not between", value1, value2, "cUrl");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNull() {
            addCriterion("requirement is null");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNotNull() {
            addCriterion("requirement is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementEqualTo(String value) {
            addCriterion("requirement =", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotEqualTo(String value) {
            addCriterion("requirement <>", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThan(String value) {
            addCriterion("requirement >", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("requirement >=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThan(String value) {
            addCriterion("requirement <", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThanOrEqualTo(String value) {
            addCriterion("requirement <=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLike(String value) {
            addCriterion("requirement like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotLike(String value) {
            addCriterion("requirement not like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementIn(List<String> values) {
            addCriterion("requirement in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotIn(List<String> values) {
            addCriterion("requirement not in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementBetween(String value1, String value2) {
            addCriterion("requirement between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotBetween(String value1, String value2) {
            addCriterion("requirement not between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(String value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(String value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(String value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(String value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(String value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(String value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLike(String value) {
            addCriterion("job_id like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotLike(String value) {
            addCriterion("job_id not like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<String> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<String> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(String value1, String value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(String value1, String value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(String value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(String value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(String value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(String value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(String value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(String value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLike(String value) {
            addCriterion("school_id like", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotLike(String value) {
            addCriterion("school_id not like", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<String> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<String> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(String value1, String value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(String value1, String value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Integer value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Integer value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Integer value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Integer value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Integer value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Integer> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Integer> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Integer value1, Integer value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
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