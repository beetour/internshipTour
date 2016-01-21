package com.internshipTour.bean;

import java.util.ArrayList;
import java.util.List;

public class OcenterCpsCatalogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OcenterCpsCatalogExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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

        public Criteria andComTitlenameIsNull() {
            addCriterion("com_titlename is null");
            return (Criteria) this;
        }

        public Criteria andComTitlenameIsNotNull() {
            addCriterion("com_titlename is not null");
            return (Criteria) this;
        }

        public Criteria andComTitlenameEqualTo(String value) {
            addCriterion("com_titlename =", value, "comTitlename");
            return (Criteria) this;
        }

        public Criteria andComTitlenameNotEqualTo(String value) {
            addCriterion("com_titlename <>", value, "comTitlename");
            return (Criteria) this;
        }

        public Criteria andComTitlenameGreaterThan(String value) {
            addCriterion("com_titlename >", value, "comTitlename");
            return (Criteria) this;
        }

        public Criteria andComTitlenameGreaterThanOrEqualTo(String value) {
            addCriterion("com_titlename >=", value, "comTitlename");
            return (Criteria) this;
        }

        public Criteria andComTitlenameLessThan(String value) {
            addCriterion("com_titlename <", value, "comTitlename");
            return (Criteria) this;
        }

        public Criteria andComTitlenameLessThanOrEqualTo(String value) {
            addCriterion("com_titlename <=", value, "comTitlename");
            return (Criteria) this;
        }

        public Criteria andComTitlenameLike(String value) {
            addCriterion("com_titlename like", value, "comTitlename");
            return (Criteria) this;
        }

        public Criteria andComTitlenameNotLike(String value) {
            addCriterion("com_titlename not like", value, "comTitlename");
            return (Criteria) this;
        }

        public Criteria andComTitlenameIn(List<String> values) {
            addCriterion("com_titlename in", values, "comTitlename");
            return (Criteria) this;
        }

        public Criteria andComTitlenameNotIn(List<String> values) {
            addCriterion("com_titlename not in", values, "comTitlename");
            return (Criteria) this;
        }

        public Criteria andComTitlenameBetween(String value1, String value2) {
            addCriterion("com_titlename between", value1, value2, "comTitlename");
            return (Criteria) this;
        }

        public Criteria andComTitlenameNotBetween(String value1, String value2) {
            addCriterion("com_titlename not between", value1, value2, "comTitlename");
            return (Criteria) this;
        }

        public Criteria andComColumnidIsNull() {
            addCriterion("com_columnid is null");
            return (Criteria) this;
        }

        public Criteria andComColumnidIsNotNull() {
            addCriterion("com_columnid is not null");
            return (Criteria) this;
        }

        public Criteria andComColumnidEqualTo(Integer value) {
            addCriterion("com_columnid =", value, "comColumnid");
            return (Criteria) this;
        }

        public Criteria andComColumnidNotEqualTo(Integer value) {
            addCriterion("com_columnid <>", value, "comColumnid");
            return (Criteria) this;
        }

        public Criteria andComColumnidGreaterThan(Integer value) {
            addCriterion("com_columnid >", value, "comColumnid");
            return (Criteria) this;
        }

        public Criteria andComColumnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_columnid >=", value, "comColumnid");
            return (Criteria) this;
        }

        public Criteria andComColumnidLessThan(Integer value) {
            addCriterion("com_columnid <", value, "comColumnid");
            return (Criteria) this;
        }

        public Criteria andComColumnidLessThanOrEqualTo(Integer value) {
            addCriterion("com_columnid <=", value, "comColumnid");
            return (Criteria) this;
        }

        public Criteria andComColumnidIn(List<Integer> values) {
            addCriterion("com_columnid in", values, "comColumnid");
            return (Criteria) this;
        }

        public Criteria andComColumnidNotIn(List<Integer> values) {
            addCriterion("com_columnid not in", values, "comColumnid");
            return (Criteria) this;
        }

        public Criteria andComColumnidBetween(Integer value1, Integer value2) {
            addCriterion("com_columnid between", value1, value2, "comColumnid");
            return (Criteria) this;
        }

        public Criteria andComColumnidNotBetween(Integer value1, Integer value2) {
            addCriterion("com_columnid not between", value1, value2, "comColumnid");
            return (Criteria) this;
        }

        public Criteria andComLinkIsNull() {
            addCriterion("com_link is null");
            return (Criteria) this;
        }

        public Criteria andComLinkIsNotNull() {
            addCriterion("com_link is not null");
            return (Criteria) this;
        }

        public Criteria andComLinkEqualTo(String value) {
            addCriterion("com_link =", value, "comLink");
            return (Criteria) this;
        }

        public Criteria andComLinkNotEqualTo(String value) {
            addCriterion("com_link <>", value, "comLink");
            return (Criteria) this;
        }

        public Criteria andComLinkGreaterThan(String value) {
            addCriterion("com_link >", value, "comLink");
            return (Criteria) this;
        }

        public Criteria andComLinkGreaterThanOrEqualTo(String value) {
            addCriterion("com_link >=", value, "comLink");
            return (Criteria) this;
        }

        public Criteria andComLinkLessThan(String value) {
            addCriterion("com_link <", value, "comLink");
            return (Criteria) this;
        }

        public Criteria andComLinkLessThanOrEqualTo(String value) {
            addCriterion("com_link <=", value, "comLink");
            return (Criteria) this;
        }

        public Criteria andComLinkLike(String value) {
            addCriterion("com_link like", value, "comLink");
            return (Criteria) this;
        }

        public Criteria andComLinkNotLike(String value) {
            addCriterion("com_link not like", value, "comLink");
            return (Criteria) this;
        }

        public Criteria andComLinkIn(List<String> values) {
            addCriterion("com_link in", values, "comLink");
            return (Criteria) this;
        }

        public Criteria andComLinkNotIn(List<String> values) {
            addCriterion("com_link not in", values, "comLink");
            return (Criteria) this;
        }

        public Criteria andComLinkBetween(String value1, String value2) {
            addCriterion("com_link between", value1, value2, "comLink");
            return (Criteria) this;
        }

        public Criteria andComLinkNotBetween(String value1, String value2) {
            addCriterion("com_link not between", value1, value2, "comLink");
            return (Criteria) this;
        }

        public Criteria andComListIsNull() {
            addCriterion("com_list is null");
            return (Criteria) this;
        }

        public Criteria andComListIsNotNull() {
            addCriterion("com_list is not null");
            return (Criteria) this;
        }

        public Criteria andComListEqualTo(Integer value) {
            addCriterion("com_list =", value, "comList");
            return (Criteria) this;
        }

        public Criteria andComListNotEqualTo(Integer value) {
            addCriterion("com_list <>", value, "comList");
            return (Criteria) this;
        }

        public Criteria andComListGreaterThan(Integer value) {
            addCriterion("com_list >", value, "comList");
            return (Criteria) this;
        }

        public Criteria andComListGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_list >=", value, "comList");
            return (Criteria) this;
        }

        public Criteria andComListLessThan(Integer value) {
            addCriterion("com_list <", value, "comList");
            return (Criteria) this;
        }

        public Criteria andComListLessThanOrEqualTo(Integer value) {
            addCriterion("com_list <=", value, "comList");
            return (Criteria) this;
        }

        public Criteria andComListIn(List<Integer> values) {
            addCriterion("com_list in", values, "comList");
            return (Criteria) this;
        }

        public Criteria andComListNotIn(List<Integer> values) {
            addCriterion("com_list not in", values, "comList");
            return (Criteria) this;
        }

        public Criteria andComListBetween(Integer value1, Integer value2) {
            addCriterion("com_list between", value1, value2, "comList");
            return (Criteria) this;
        }

        public Criteria andComListNotBetween(Integer value1, Integer value2) {
            addCriterion("com_list not between", value1, value2, "comList");
            return (Criteria) this;
        }

        public Criteria andClassUrlIsNull() {
            addCriterion("class_url is null");
            return (Criteria) this;
        }

        public Criteria andClassUrlIsNotNull() {
            addCriterion("class_url is not null");
            return (Criteria) this;
        }

        public Criteria andClassUrlEqualTo(String value) {
            addCriterion("class_url =", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlNotEqualTo(String value) {
            addCriterion("class_url <>", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlGreaterThan(String value) {
            addCriterion("class_url >", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlGreaterThanOrEqualTo(String value) {
            addCriterion("class_url >=", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlLessThan(String value) {
            addCriterion("class_url <", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlLessThanOrEqualTo(String value) {
            addCriterion("class_url <=", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlLike(String value) {
            addCriterion("class_url like", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlNotLike(String value) {
            addCriterion("class_url not like", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlIn(List<String> values) {
            addCriterion("class_url in", values, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlNotIn(List<String> values) {
            addCriterion("class_url not in", values, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlBetween(String value1, String value2) {
            addCriterion("class_url between", value1, value2, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlNotBetween(String value1, String value2) {
            addCriterion("class_url not between", value1, value2, "classUrl");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Boolean value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Boolean value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Boolean value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Boolean value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Boolean value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Boolean> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Boolean> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andTempIdIsNull() {
            addCriterion("temp_id is null");
            return (Criteria) this;
        }

        public Criteria andTempIdIsNotNull() {
            addCriterion("temp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTempIdEqualTo(Short value) {
            addCriterion("temp_id =", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotEqualTo(Short value) {
            addCriterion("temp_id <>", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdGreaterThan(Short value) {
            addCriterion("temp_id >", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdGreaterThanOrEqualTo(Short value) {
            addCriterion("temp_id >=", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdLessThan(Short value) {
            addCriterion("temp_id <", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdLessThanOrEqualTo(Short value) {
            addCriterion("temp_id <=", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdIn(List<Short> values) {
            addCriterion("temp_id in", values, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotIn(List<Short> values) {
            addCriterion("temp_id not in", values, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdBetween(Short value1, Short value2) {
            addCriterion("temp_id between", value1, value2, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotBetween(Short value1, Short value2) {
            addCriterion("temp_id not between", value1, value2, "tempId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIsNull() {
            addCriterion("category_type is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIsNotNull() {
            addCriterion("category_type is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeEqualTo(Boolean value) {
            addCriterion("category_type =", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotEqualTo(Boolean value) {
            addCriterion("category_type <>", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeGreaterThan(Boolean value) {
            addCriterion("category_type >", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("category_type >=", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeLessThan(Boolean value) {
            addCriterion("category_type <", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("category_type <=", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIn(List<Boolean> values) {
            addCriterion("category_type in", values, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotIn(List<Boolean> values) {
            addCriterion("category_type not in", values, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("category_type between", value1, value2, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("category_type not between", value1, value2, "categoryType");
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