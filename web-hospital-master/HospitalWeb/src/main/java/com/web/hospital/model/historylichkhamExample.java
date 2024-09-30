package com.web.hospital.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class historylichkhamExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    public historylichkhamExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
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
     * This method corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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
            List<java.sql.Date> dateList = new ArrayList<>();
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

        public Criteria andSttIsNull() {
            addCriterion("Stt is null");
            return (Criteria) this;
        }

        public Criteria andSttIsNotNull() {
            addCriterion("Stt is not null");
            return (Criteria) this;
        }

        public Criteria andSttEqualTo(Integer value) {
            addCriterion("Stt =", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttNotEqualTo(Integer value) {
            addCriterion("Stt <>", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttGreaterThan(Integer value) {
            addCriterion("Stt >", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stt >=", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttLessThan(Integer value) {
            addCriterion("Stt <", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttLessThanOrEqualTo(Integer value) {
            addCriterion("Stt <=", value, "stt");
            return (Criteria) this;
        }

        public Criteria andSttIn(List<Integer> values) {
            addCriterion("Stt in", values, "stt");
            return (Criteria) this;
        }

        public Criteria andSttNotIn(List<Integer> values) {
            addCriterion("Stt not in", values, "stt");
            return (Criteria) this;
        }

        public Criteria andSttBetween(Integer value1, Integer value2) {
            addCriterion("Stt between", value1, value2, "stt");
            return (Criteria) this;
        }

        public Criteria andSttNotBetween(Integer value1, Integer value2) {
            addCriterion("Stt not between", value1, value2, "stt");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanIsNull() {
            addCriterion("hoTenBenhNhan is null");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanIsNotNull() {
            addCriterion("hoTenBenhNhan is not null");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanEqualTo(String value) {
            addCriterion("hoTenBenhNhan =", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanNotEqualTo(String value) {
            addCriterion("hoTenBenhNhan <>", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanGreaterThan(String value) {
            addCriterion("hoTenBenhNhan >", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanGreaterThanOrEqualTo(String value) {
            addCriterion("hoTenBenhNhan >=", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanLessThan(String value) {
            addCriterion("hoTenBenhNhan <", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanLessThanOrEqualTo(String value) {
            addCriterion("hoTenBenhNhan <=", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanLike(String value) {
            addCriterion("hoTenBenhNhan like", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanNotLike(String value) {
            addCriterion("hoTenBenhNhan not like", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanIn(List<String> values) {
            addCriterion("hoTenBenhNhan in", values, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanNotIn(List<String> values) {
            addCriterion("hoTenBenhNhan not in", values, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanBetween(String value1, String value2) {
            addCriterion("hoTenBenhNhan between", value1, value2, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanNotBetween(String value1, String value2) {
            addCriterion("hoTenBenhNhan not between", value1, value2, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andNamsinhIsNull() {
            addCriterion("namSinh is null");
            return (Criteria) this;
        }

        public Criteria andNamsinhIsNotNull() {
            addCriterion("namSinh is not null");
            return (Criteria) this;
        }

        public Criteria andNamsinhEqualTo(String value) {
            addCriterion("namSinh =", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhNotEqualTo(String value) {
            addCriterion("namSinh <>", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhGreaterThan(String value) {
            addCriterion("namSinh >", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhGreaterThanOrEqualTo(String value) {
            addCriterion("namSinh >=", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhLessThan(String value) {
            addCriterion("namSinh <", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhLessThanOrEqualTo(String value) {
            addCriterion("namSinh <=", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhLike(String value) {
            addCriterion("namSinh like", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhNotLike(String value) {
            addCriterion("namSinh not like", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhIn(List<String> values) {
            addCriterion("namSinh in", values, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhNotIn(List<String> values) {
            addCriterion("namSinh not in", values, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhBetween(String value1, String value2) {
            addCriterion("namSinh between", value1, value2, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhNotBetween(String value1, String value2) {
            addCriterion("namSinh not between", value1, value2, "namsinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhIsNull() {
            addCriterion("gioiTinh is null");
            return (Criteria) this;
        }

        public Criteria andGioitinhIsNotNull() {
            addCriterion("gioiTinh is not null");
            return (Criteria) this;
        }

        public Criteria andGioitinhEqualTo(String value) {
            addCriterion("gioiTinh =", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhNotEqualTo(String value) {
            addCriterion("gioiTinh <>", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhGreaterThan(String value) {
            addCriterion("gioiTinh >", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhGreaterThanOrEqualTo(String value) {
            addCriterion("gioiTinh >=", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhLessThan(String value) {
            addCriterion("gioiTinh <", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhLessThanOrEqualTo(String value) {
            addCriterion("gioiTinh <=", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhLike(String value) {
            addCriterion("gioiTinh like", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhNotLike(String value) {
            addCriterion("gioiTinh not like", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhIn(List<String> values) {
            addCriterion("gioiTinh in", values, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhNotIn(List<String> values) {
            addCriterion("gioiTinh not in", values, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhBetween(String value1, String value2) {
            addCriterion("gioiTinh between", value1, value2, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhNotBetween(String value1, String value2) {
            addCriterion("gioiTinh not between", value1, value2, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andSdtIsNull() {
            addCriterion("SDT is null");
            return (Criteria) this;
        }

        public Criteria andSdtIsNotNull() {
            addCriterion("SDT is not null");
            return (Criteria) this;
        }

        public Criteria andSdtEqualTo(String value) {
            addCriterion("SDT =", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtNotEqualTo(String value) {
            addCriterion("SDT <>", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtGreaterThan(String value) {
            addCriterion("SDT >", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtGreaterThanOrEqualTo(String value) {
            addCriterion("SDT >=", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtLessThan(String value) {
            addCriterion("SDT <", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtLessThanOrEqualTo(String value) {
            addCriterion("SDT <=", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtLike(String value) {
            addCriterion("SDT like", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtNotLike(String value) {
            addCriterion("SDT not like", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtIn(List<String> values) {
            addCriterion("SDT in", values, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtNotIn(List<String> values) {
            addCriterion("SDT not in", values, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtBetween(String value1, String value2) {
            addCriterion("SDT between", value1, value2, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtNotBetween(String value1, String value2) {
            addCriterion("SDT not between", value1, value2, "sdt");
            return (Criteria) this;
        }

        public Criteria andDiachiIsNull() {
            addCriterion("diaChi is null");
            return (Criteria) this;
        }

        public Criteria andDiachiIsNotNull() {
            addCriterion("diaChi is not null");
            return (Criteria) this;
        }

        public Criteria andDiachiEqualTo(String value) {
            addCriterion("diaChi =", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotEqualTo(String value) {
            addCriterion("diaChi <>", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiGreaterThan(String value) {
            addCriterion("diaChi >", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiGreaterThanOrEqualTo(String value) {
            addCriterion("diaChi >=", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiLessThan(String value) {
            addCriterion("diaChi <", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiLessThanOrEqualTo(String value) {
            addCriterion("diaChi <=", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiLike(String value) {
            addCriterion("diaChi like", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotLike(String value) {
            addCriterion("diaChi not like", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiIn(List<String> values) {
            addCriterion("diaChi in", values, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotIn(List<String> values) {
            addCriterion("diaChi not in", values, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiBetween(String value1, String value2) {
            addCriterion("diaChi between", value1, value2, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotBetween(String value1, String value2) {
            addCriterion("diaChi not between", value1, value2, "diachi");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiIsNull() {
            addCriterion("hoTenBacSi is null");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiIsNotNull() {
            addCriterion("hoTenBacSi is not null");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiEqualTo(String value) {
            addCriterion("hoTenBacSi =", value, "hotenbacsi");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiNotEqualTo(String value) {
            addCriterion("hoTenBacSi <>", value, "hotenbacsi");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiGreaterThan(String value) {
            addCriterion("hoTenBacSi >", value, "hotenbacsi");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiGreaterThanOrEqualTo(String value) {
            addCriterion("hoTenBacSi >=", value, "hotenbacsi");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiLessThan(String value) {
            addCriterion("hoTenBacSi <", value, "hotenbacsi");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiLessThanOrEqualTo(String value) {
            addCriterion("hoTenBacSi <=", value, "hotenbacsi");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiLike(String value) {
            addCriterion("hoTenBacSi like", value, "hotenbacsi");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiNotLike(String value) {
            addCriterion("hoTenBacSi not like", value, "hotenbacsi");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiIn(List<String> values) {
            addCriterion("hoTenBacSi in", values, "hotenbacsi");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiNotIn(List<String> values) {
            addCriterion("hoTenBacSi not in", values, "hotenbacsi");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiBetween(String value1, String value2) {
            addCriterion("hoTenBacSi between", value1, value2, "hotenbacsi");
            return (Criteria) this;
        }

        public Criteria andHotenbacsiNotBetween(String value1, String value2) {
            addCriterion("hoTenBacSi not between", value1, value2, "hotenbacsi");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Date value) {
            addCriterionForJDBCDate("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Date value) {
            addCriterionForJDBCDate("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Date value) {
            addCriterionForJDBCDate("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Date value) {
            addCriterionForJDBCDate("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Date> values) {
            addCriterionForJDBCDate("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Date> values) {
            addCriterionForJDBCDate("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andMountIsNull() {
            addCriterion("mount is null");
            return (Criteria) this;
        }

        public Criteria andMountIsNotNull() {
            addCriterion("mount is not null");
            return (Criteria) this;
        }

        public Criteria andMountEqualTo(Integer value) {
            addCriterion("mount =", value, "mount");
            return (Criteria) this;
        }

        public Criteria andMountNotEqualTo(Integer value) {
            addCriterion("mount <>", value, "mount");
            return (Criteria) this;
        }

        public Criteria andMountGreaterThan(Integer value) {
            addCriterion("mount >", value, "mount");
            return (Criteria) this;
        }

        public Criteria andMountGreaterThanOrEqualTo(Integer value) {
            addCriterion("mount >=", value, "mount");
            return (Criteria) this;
        }

        public Criteria andMountLessThan(Integer value) {
            addCriterion("mount <", value, "mount");
            return (Criteria) this;
        }

        public Criteria andMountLessThanOrEqualTo(Integer value) {
            addCriterion("mount <=", value, "mount");
            return (Criteria) this;
        }

        public Criteria andMountIn(List<Integer> values) {
            addCriterion("mount in", values, "mount");
            return (Criteria) this;
        }

        public Criteria andMountNotIn(List<Integer> values) {
            addCriterion("mount not in", values, "mount");
            return (Criteria) this;
        }

        public Criteria andMountBetween(Integer value1, Integer value2) {
            addCriterion("mount between", value1, value2, "mount");
            return (Criteria) this;
        }

        public Criteria andMountNotBetween(Integer value1, Integer value2) {
            addCriterion("mount not between", value1, value2, "mount");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated do_not_delete_during_merge Sat Jun 15 17:20:55 ICT 2024
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dbo.historylichkham
     *
     * @mbg.generated Sat Jun 15 17:20:55 ICT 2024
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