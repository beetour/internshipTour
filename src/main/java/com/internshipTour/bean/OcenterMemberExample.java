package com.internshipTour.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OcenterMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OcenterMemberExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andLoginIsNull() {
            addCriterion("login is null");
            return (Criteria) this;
        }

        public Criteria andLoginIsNotNull() {
            addCriterion("login is not null");
            return (Criteria) this;
        }

        public Criteria andLoginEqualTo(Integer value) {
            addCriterion("login =", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotEqualTo(Integer value) {
            addCriterion("login <>", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginGreaterThan(Integer value) {
            addCriterion("login >", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("login >=", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLessThan(Integer value) {
            addCriterion("login <", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLessThanOrEqualTo(Integer value) {
            addCriterion("login <=", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginIn(List<Integer> values) {
            addCriterion("login in", values, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotIn(List<Integer> values) {
            addCriterion("login not in", values, "login");
            return (Criteria) this;
        }

        public Criteria andLoginBetween(Integer value1, Integer value2) {
            addCriterion("login between", value1, value2, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("login not between", value1, value2, "login");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNull() {
            addCriterion("reg_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNotNull() {
            addCriterion("reg_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegIpEqualTo(Long value) {
            addCriterion("reg_ip =", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotEqualTo(Long value) {
            addCriterion("reg_ip <>", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThan(Long value) {
            addCriterion("reg_ip >", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThanOrEqualTo(Long value) {
            addCriterion("reg_ip >=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThan(Long value) {
            addCriterion("reg_ip <", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThanOrEqualTo(Long value) {
            addCriterion("reg_ip <=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpIn(List<Long> values) {
            addCriterion("reg_ip in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotIn(List<Long> values) {
            addCriterion("reg_ip not in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpBetween(Long value1, Long value2) {
            addCriterion("reg_ip between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotBetween(Long value1, Long value2) {
            addCriterion("reg_ip not between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Integer value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Integer value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Integer value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Integer value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Integer value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Integer> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Integer> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Integer value1, Integer value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(Long value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(Long value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(Long value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(Long value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(Long value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(Long value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<Long> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<Long> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(Long value1, Long value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(Long value1, Long value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Integer value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Integer value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Integer value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Integer value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Integer> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Integer> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLastLoginRoleIsNull() {
            addCriterion("last_login_role is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginRoleIsNotNull() {
            addCriterion("last_login_role is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginRoleEqualTo(Integer value) {
            addCriterion("last_login_role =", value, "lastLoginRole");
            return (Criteria) this;
        }

        public Criteria andLastLoginRoleNotEqualTo(Integer value) {
            addCriterion("last_login_role <>", value, "lastLoginRole");
            return (Criteria) this;
        }

        public Criteria andLastLoginRoleGreaterThan(Integer value) {
            addCriterion("last_login_role >", value, "lastLoginRole");
            return (Criteria) this;
        }

        public Criteria andLastLoginRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_login_role >=", value, "lastLoginRole");
            return (Criteria) this;
        }

        public Criteria andLastLoginRoleLessThan(Integer value) {
            addCriterion("last_login_role <", value, "lastLoginRole");
            return (Criteria) this;
        }

        public Criteria andLastLoginRoleLessThanOrEqualTo(Integer value) {
            addCriterion("last_login_role <=", value, "lastLoginRole");
            return (Criteria) this;
        }

        public Criteria andLastLoginRoleIn(List<Integer> values) {
            addCriterion("last_login_role in", values, "lastLoginRole");
            return (Criteria) this;
        }

        public Criteria andLastLoginRoleNotIn(List<Integer> values) {
            addCriterion("last_login_role not in", values, "lastLoginRole");
            return (Criteria) this;
        }

        public Criteria andLastLoginRoleBetween(Integer value1, Integer value2) {
            addCriterion("last_login_role between", value1, value2, "lastLoginRole");
            return (Criteria) this;
        }

        public Criteria andLastLoginRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("last_login_role not between", value1, value2, "lastLoginRole");
            return (Criteria) this;
        }

        public Criteria andShowRoleIsNull() {
            addCriterion("show_role is null");
            return (Criteria) this;
        }

        public Criteria andShowRoleIsNotNull() {
            addCriterion("show_role is not null");
            return (Criteria) this;
        }

        public Criteria andShowRoleEqualTo(Integer value) {
            addCriterion("show_role =", value, "showRole");
            return (Criteria) this;
        }

        public Criteria andShowRoleNotEqualTo(Integer value) {
            addCriterion("show_role <>", value, "showRole");
            return (Criteria) this;
        }

        public Criteria andShowRoleGreaterThan(Integer value) {
            addCriterion("show_role >", value, "showRole");
            return (Criteria) this;
        }

        public Criteria andShowRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_role >=", value, "showRole");
            return (Criteria) this;
        }

        public Criteria andShowRoleLessThan(Integer value) {
            addCriterion("show_role <", value, "showRole");
            return (Criteria) this;
        }

        public Criteria andShowRoleLessThanOrEqualTo(Integer value) {
            addCriterion("show_role <=", value, "showRole");
            return (Criteria) this;
        }

        public Criteria andShowRoleIn(List<Integer> values) {
            addCriterion("show_role in", values, "showRole");
            return (Criteria) this;
        }

        public Criteria andShowRoleNotIn(List<Integer> values) {
            addCriterion("show_role not in", values, "showRole");
            return (Criteria) this;
        }

        public Criteria andShowRoleBetween(Integer value1, Integer value2) {
            addCriterion("show_role between", value1, value2, "showRole");
            return (Criteria) this;
        }

        public Criteria andShowRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("show_role not between", value1, value2, "showRole");
            return (Criteria) this;
        }

        public Criteria andPosCountryIsNull() {
            addCriterion("pos_country is null");
            return (Criteria) this;
        }

        public Criteria andPosCountryIsNotNull() {
            addCriterion("pos_country is not null");
            return (Criteria) this;
        }

        public Criteria andPosCountryEqualTo(String value) {
            addCriterion("pos_country =", value, "posCountry");
            return (Criteria) this;
        }

        public Criteria andPosCountryNotEqualTo(String value) {
            addCriterion("pos_country <>", value, "posCountry");
            return (Criteria) this;
        }

        public Criteria andPosCountryGreaterThan(String value) {
            addCriterion("pos_country >", value, "posCountry");
            return (Criteria) this;
        }

        public Criteria andPosCountryGreaterThanOrEqualTo(String value) {
            addCriterion("pos_country >=", value, "posCountry");
            return (Criteria) this;
        }

        public Criteria andPosCountryLessThan(String value) {
            addCriterion("pos_country <", value, "posCountry");
            return (Criteria) this;
        }

        public Criteria andPosCountryLessThanOrEqualTo(String value) {
            addCriterion("pos_country <=", value, "posCountry");
            return (Criteria) this;
        }

        public Criteria andPosCountryLike(String value) {
            addCriterion("pos_country like", value, "posCountry");
            return (Criteria) this;
        }

        public Criteria andPosCountryNotLike(String value) {
            addCriterion("pos_country not like", value, "posCountry");
            return (Criteria) this;
        }

        public Criteria andPosCountryIn(List<String> values) {
            addCriterion("pos_country in", values, "posCountry");
            return (Criteria) this;
        }

        public Criteria andPosCountryNotIn(List<String> values) {
            addCriterion("pos_country not in", values, "posCountry");
            return (Criteria) this;
        }

        public Criteria andPosCountryBetween(String value1, String value2) {
            addCriterion("pos_country between", value1, value2, "posCountry");
            return (Criteria) this;
        }

        public Criteria andPosCountryNotBetween(String value1, String value2) {
            addCriterion("pos_country not between", value1, value2, "posCountry");
            return (Criteria) this;
        }

        public Criteria andPosProvinceIsNull() {
            addCriterion("pos_province is null");
            return (Criteria) this;
        }

        public Criteria andPosProvinceIsNotNull() {
            addCriterion("pos_province is not null");
            return (Criteria) this;
        }

        public Criteria andPosProvinceEqualTo(Integer value) {
            addCriterion("pos_province =", value, "posProvince");
            return (Criteria) this;
        }

        public Criteria andPosProvinceNotEqualTo(Integer value) {
            addCriterion("pos_province <>", value, "posProvince");
            return (Criteria) this;
        }

        public Criteria andPosProvinceGreaterThan(Integer value) {
            addCriterion("pos_province >", value, "posProvince");
            return (Criteria) this;
        }

        public Criteria andPosProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("pos_province >=", value, "posProvince");
            return (Criteria) this;
        }

        public Criteria andPosProvinceLessThan(Integer value) {
            addCriterion("pos_province <", value, "posProvince");
            return (Criteria) this;
        }

        public Criteria andPosProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("pos_province <=", value, "posProvince");
            return (Criteria) this;
        }

        public Criteria andPosProvinceIn(List<Integer> values) {
            addCriterion("pos_province in", values, "posProvince");
            return (Criteria) this;
        }

        public Criteria andPosProvinceNotIn(List<Integer> values) {
            addCriterion("pos_province not in", values, "posProvince");
            return (Criteria) this;
        }

        public Criteria andPosProvinceBetween(Integer value1, Integer value2) {
            addCriterion("pos_province between", value1, value2, "posProvince");
            return (Criteria) this;
        }

        public Criteria andPosProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("pos_province not between", value1, value2, "posProvince");
            return (Criteria) this;
        }

        public Criteria andPosCityIsNull() {
            addCriterion("pos_city is null");
            return (Criteria) this;
        }

        public Criteria andPosCityIsNotNull() {
            addCriterion("pos_city is not null");
            return (Criteria) this;
        }

        public Criteria andPosCityEqualTo(Integer value) {
            addCriterion("pos_city =", value, "posCity");
            return (Criteria) this;
        }

        public Criteria andPosCityNotEqualTo(Integer value) {
            addCriterion("pos_city <>", value, "posCity");
            return (Criteria) this;
        }

        public Criteria andPosCityGreaterThan(Integer value) {
            addCriterion("pos_city >", value, "posCity");
            return (Criteria) this;
        }

        public Criteria andPosCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("pos_city >=", value, "posCity");
            return (Criteria) this;
        }

        public Criteria andPosCityLessThan(Integer value) {
            addCriterion("pos_city <", value, "posCity");
            return (Criteria) this;
        }

        public Criteria andPosCityLessThanOrEqualTo(Integer value) {
            addCriterion("pos_city <=", value, "posCity");
            return (Criteria) this;
        }

        public Criteria andPosCityIn(List<Integer> values) {
            addCriterion("pos_city in", values, "posCity");
            return (Criteria) this;
        }

        public Criteria andPosCityNotIn(List<Integer> values) {
            addCriterion("pos_city not in", values, "posCity");
            return (Criteria) this;
        }

        public Criteria andPosCityBetween(Integer value1, Integer value2) {
            addCriterion("pos_city between", value1, value2, "posCity");
            return (Criteria) this;
        }

        public Criteria andPosCityNotBetween(Integer value1, Integer value2) {
            addCriterion("pos_city not between", value1, value2, "posCity");
            return (Criteria) this;
        }

        public Criteria andPosDistrictIsNull() {
            addCriterion("pos_district is null");
            return (Criteria) this;
        }

        public Criteria andPosDistrictIsNotNull() {
            addCriterion("pos_district is not null");
            return (Criteria) this;
        }

        public Criteria andPosDistrictEqualTo(Integer value) {
            addCriterion("pos_district =", value, "posDistrict");
            return (Criteria) this;
        }

        public Criteria andPosDistrictNotEqualTo(Integer value) {
            addCriterion("pos_district <>", value, "posDistrict");
            return (Criteria) this;
        }

        public Criteria andPosDistrictGreaterThan(Integer value) {
            addCriterion("pos_district >", value, "posDistrict");
            return (Criteria) this;
        }

        public Criteria andPosDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("pos_district >=", value, "posDistrict");
            return (Criteria) this;
        }

        public Criteria andPosDistrictLessThan(Integer value) {
            addCriterion("pos_district <", value, "posDistrict");
            return (Criteria) this;
        }

        public Criteria andPosDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("pos_district <=", value, "posDistrict");
            return (Criteria) this;
        }

        public Criteria andPosDistrictIn(List<Integer> values) {
            addCriterion("pos_district in", values, "posDistrict");
            return (Criteria) this;
        }

        public Criteria andPosDistrictNotIn(List<Integer> values) {
            addCriterion("pos_district not in", values, "posDistrict");
            return (Criteria) this;
        }

        public Criteria andPosDistrictBetween(Integer value1, Integer value2) {
            addCriterion("pos_district between", value1, value2, "posDistrict");
            return (Criteria) this;
        }

        public Criteria andPosDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("pos_district not between", value1, value2, "posDistrict");
            return (Criteria) this;
        }

        public Criteria andPosCommunityIsNull() {
            addCriterion("pos_community is null");
            return (Criteria) this;
        }

        public Criteria andPosCommunityIsNotNull() {
            addCriterion("pos_community is not null");
            return (Criteria) this;
        }

        public Criteria andPosCommunityEqualTo(Integer value) {
            addCriterion("pos_community =", value, "posCommunity");
            return (Criteria) this;
        }

        public Criteria andPosCommunityNotEqualTo(Integer value) {
            addCriterion("pos_community <>", value, "posCommunity");
            return (Criteria) this;
        }

        public Criteria andPosCommunityGreaterThan(Integer value) {
            addCriterion("pos_community >", value, "posCommunity");
            return (Criteria) this;
        }

        public Criteria andPosCommunityGreaterThanOrEqualTo(Integer value) {
            addCriterion("pos_community >=", value, "posCommunity");
            return (Criteria) this;
        }

        public Criteria andPosCommunityLessThan(Integer value) {
            addCriterion("pos_community <", value, "posCommunity");
            return (Criteria) this;
        }

        public Criteria andPosCommunityLessThanOrEqualTo(Integer value) {
            addCriterion("pos_community <=", value, "posCommunity");
            return (Criteria) this;
        }

        public Criteria andPosCommunityIn(List<Integer> values) {
            addCriterion("pos_community in", values, "posCommunity");
            return (Criteria) this;
        }

        public Criteria andPosCommunityNotIn(List<Integer> values) {
            addCriterion("pos_community not in", values, "posCommunity");
            return (Criteria) this;
        }

        public Criteria andPosCommunityBetween(Integer value1, Integer value2) {
            addCriterion("pos_community between", value1, value2, "posCommunity");
            return (Criteria) this;
        }

        public Criteria andPosCommunityNotBetween(Integer value1, Integer value2) {
            addCriterion("pos_community not between", value1, value2, "posCommunity");
            return (Criteria) this;
        }

        public Criteria andScore1IsNull() {
            addCriterion("score1 is null");
            return (Criteria) this;
        }

        public Criteria andScore1IsNotNull() {
            addCriterion("score1 is not null");
            return (Criteria) this;
        }

        public Criteria andScore1EqualTo(Float value) {
            addCriterion("score1 =", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotEqualTo(Float value) {
            addCriterion("score1 <>", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThan(Float value) {
            addCriterion("score1 >", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThanOrEqualTo(Float value) {
            addCriterion("score1 >=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThan(Float value) {
            addCriterion("score1 <", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThanOrEqualTo(Float value) {
            addCriterion("score1 <=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1In(List<Float> values) {
            addCriterion("score1 in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotIn(List<Float> values) {
            addCriterion("score1 not in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1Between(Float value1, Float value2) {
            addCriterion("score1 between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotBetween(Float value1, Float value2) {
            addCriterion("score1 not between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore2IsNull() {
            addCriterion("score2 is null");
            return (Criteria) this;
        }

        public Criteria andScore2IsNotNull() {
            addCriterion("score2 is not null");
            return (Criteria) this;
        }

        public Criteria andScore2EqualTo(Float value) {
            addCriterion("score2 =", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotEqualTo(Float value) {
            addCriterion("score2 <>", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThan(Float value) {
            addCriterion("score2 >", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThanOrEqualTo(Float value) {
            addCriterion("score2 >=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThan(Float value) {
            addCriterion("score2 <", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThanOrEqualTo(Float value) {
            addCriterion("score2 <=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2In(List<Float> values) {
            addCriterion("score2 in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotIn(List<Float> values) {
            addCriterion("score2 not in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2Between(Float value1, Float value2) {
            addCriterion("score2 between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotBetween(Float value1, Float value2) {
            addCriterion("score2 not between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore3IsNull() {
            addCriterion("score3 is null");
            return (Criteria) this;
        }

        public Criteria andScore3IsNotNull() {
            addCriterion("score3 is not null");
            return (Criteria) this;
        }

        public Criteria andScore3EqualTo(Float value) {
            addCriterion("score3 =", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotEqualTo(Float value) {
            addCriterion("score3 <>", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThan(Float value) {
            addCriterion("score3 >", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThanOrEqualTo(Float value) {
            addCriterion("score3 >=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThan(Float value) {
            addCriterion("score3 <", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThanOrEqualTo(Float value) {
            addCriterion("score3 <=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3In(List<Float> values) {
            addCriterion("score3 in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotIn(List<Float> values) {
            addCriterion("score3 not in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3Between(Float value1, Float value2) {
            addCriterion("score3 between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotBetween(Float value1, Float value2) {
            addCriterion("score3 not between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andScore4IsNull() {
            addCriterion("score4 is null");
            return (Criteria) this;
        }

        public Criteria andScore4IsNotNull() {
            addCriterion("score4 is not null");
            return (Criteria) this;
        }

        public Criteria andScore4EqualTo(Float value) {
            addCriterion("score4 =", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotEqualTo(Float value) {
            addCriterion("score4 <>", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4GreaterThan(Float value) {
            addCriterion("score4 >", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4GreaterThanOrEqualTo(Float value) {
            addCriterion("score4 >=", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4LessThan(Float value) {
            addCriterion("score4 <", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4LessThanOrEqualTo(Float value) {
            addCriterion("score4 <=", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4In(List<Float> values) {
            addCriterion("score4 in", values, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotIn(List<Float> values) {
            addCriterion("score4 not in", values, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4Between(Float value1, Float value2) {
            addCriterion("score4 between", value1, value2, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotBetween(Float value1, Float value2) {
            addCriterion("score4 not between", value1, value2, "score4");
            return (Criteria) this;
        }

        public Criteria andConCheckIsNull() {
            addCriterion("con_check is null");
            return (Criteria) this;
        }

        public Criteria andConCheckIsNotNull() {
            addCriterion("con_check is not null");
            return (Criteria) this;
        }

        public Criteria andConCheckEqualTo(Integer value) {
            addCriterion("con_check =", value, "conCheck");
            return (Criteria) this;
        }

        public Criteria andConCheckNotEqualTo(Integer value) {
            addCriterion("con_check <>", value, "conCheck");
            return (Criteria) this;
        }

        public Criteria andConCheckGreaterThan(Integer value) {
            addCriterion("con_check >", value, "conCheck");
            return (Criteria) this;
        }

        public Criteria andConCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("con_check >=", value, "conCheck");
            return (Criteria) this;
        }

        public Criteria andConCheckLessThan(Integer value) {
            addCriterion("con_check <", value, "conCheck");
            return (Criteria) this;
        }

        public Criteria andConCheckLessThanOrEqualTo(Integer value) {
            addCriterion("con_check <=", value, "conCheck");
            return (Criteria) this;
        }

        public Criteria andConCheckIn(List<Integer> values) {
            addCriterion("con_check in", values, "conCheck");
            return (Criteria) this;
        }

        public Criteria andConCheckNotIn(List<Integer> values) {
            addCriterion("con_check not in", values, "conCheck");
            return (Criteria) this;
        }

        public Criteria andConCheckBetween(Integer value1, Integer value2) {
            addCriterion("con_check between", value1, value2, "conCheck");
            return (Criteria) this;
        }

        public Criteria andConCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("con_check not between", value1, value2, "conCheck");
            return (Criteria) this;
        }

        public Criteria andTotalCheckIsNull() {
            addCriterion("total_check is null");
            return (Criteria) this;
        }

        public Criteria andTotalCheckIsNotNull() {
            addCriterion("total_check is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCheckEqualTo(Integer value) {
            addCriterion("total_check =", value, "totalCheck");
            return (Criteria) this;
        }

        public Criteria andTotalCheckNotEqualTo(Integer value) {
            addCriterion("total_check <>", value, "totalCheck");
            return (Criteria) this;
        }

        public Criteria andTotalCheckGreaterThan(Integer value) {
            addCriterion("total_check >", value, "totalCheck");
            return (Criteria) this;
        }

        public Criteria andTotalCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_check >=", value, "totalCheck");
            return (Criteria) this;
        }

        public Criteria andTotalCheckLessThan(Integer value) {
            addCriterion("total_check <", value, "totalCheck");
            return (Criteria) this;
        }

        public Criteria andTotalCheckLessThanOrEqualTo(Integer value) {
            addCriterion("total_check <=", value, "totalCheck");
            return (Criteria) this;
        }

        public Criteria andTotalCheckIn(List<Integer> values) {
            addCriterion("total_check in", values, "totalCheck");
            return (Criteria) this;
        }

        public Criteria andTotalCheckNotIn(List<Integer> values) {
            addCriterion("total_check not in", values, "totalCheck");
            return (Criteria) this;
        }

        public Criteria andTotalCheckBetween(Integer value1, Integer value2) {
            addCriterion("total_check between", value1, value2, "totalCheck");
            return (Criteria) this;
        }

        public Criteria andTotalCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("total_check not between", value1, value2, "totalCheck");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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