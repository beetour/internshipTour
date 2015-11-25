package com.internshipTour.bean;

import java.util.Date;

public class OcenterMember {
    private Integer uid;

    private String nickname;

    private Byte sex;

    private Date birthday;

    private String qq;

    private Integer login;

    private Long regIp;

    private Integer regTime;

    private Long lastLoginIp;

    private Integer lastLoginTime;

    private Byte status;

    private Integer lastLoginRole;

    private Integer showRole;

    private Integer posProvince;

    private Integer posCity;

    private Integer posDistrict;

    private Integer posCommunity;

    private Float score1;

    private Float score2;

    private Float score3;

    private Float score4;

    private Integer conCheck;

    private Integer totalCheck;

    private String signature;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Integer getLogin() {
        return login;
    }

    public void setLogin(Integer login) {
        this.login = login;
    }

    public Long getRegIp() {
        return regIp;
    }

    public void setRegIp(Long regIp) {
        this.regIp = regIp;
    }

    public Integer getRegTime() {
        return regTime;
    }

    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    public Long getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(Long lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Integer lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getLastLoginRole() {
        return lastLoginRole;
    }

    public void setLastLoginRole(Integer lastLoginRole) {
        this.lastLoginRole = lastLoginRole;
    }

    public Integer getShowRole() {
        return showRole;
    }

    public void setShowRole(Integer showRole) {
        this.showRole = showRole;
    }

    public Integer getPosProvince() {
        return posProvince;
    }

    public void setPosProvince(Integer posProvince) {
        this.posProvince = posProvince;
    }

    public Integer getPosCity() {
        return posCity;
    }

    public void setPosCity(Integer posCity) {
        this.posCity = posCity;
    }

    public Integer getPosDistrict() {
        return posDistrict;
    }

    public void setPosDistrict(Integer posDistrict) {
        this.posDistrict = posDistrict;
    }

    public Integer getPosCommunity() {
        return posCommunity;
    }

    public void setPosCommunity(Integer posCommunity) {
        this.posCommunity = posCommunity;
    }

    public Float getScore1() {
        return score1;
    }

    public void setScore1(Float score1) {
        this.score1 = score1;
    }

    public Float getScore2() {
        return score2;
    }

    public void setScore2(Float score2) {
        this.score2 = score2;
    }

    public Float getScore3() {
        return score3;
    }

    public void setScore3(Float score3) {
        this.score3 = score3;
    }

    public Float getScore4() {
        return score4;
    }

    public void setScore4(Float score4) {
        this.score4 = score4;
    }

    public Integer getConCheck() {
        return conCheck;
    }

    public void setConCheck(Integer conCheck) {
        this.conCheck = conCheck;
    }

    public Integer getTotalCheck() {
        return totalCheck;
    }

    public void setTotalCheck(Integer totalCheck) {
        this.totalCheck = totalCheck;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }
}