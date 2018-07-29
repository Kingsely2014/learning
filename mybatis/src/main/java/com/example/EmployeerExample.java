package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeerExample() {
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

        public Criteria andEmployeerIdIsNull() {
            addCriterion("employeer_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeerIdIsNotNull() {
            addCriterion("employeer_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeerIdEqualTo(Integer value) {
            addCriterion("employeer_id =", value, "employeerId");
            return (Criteria) this;
        }

        public Criteria andEmployeerIdNotEqualTo(Integer value) {
            addCriterion("employeer_id <>", value, "employeerId");
            return (Criteria) this;
        }

        public Criteria andEmployeerIdGreaterThan(Integer value) {
            addCriterion("employeer_id >", value, "employeerId");
            return (Criteria) this;
        }

        public Criteria andEmployeerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeer_id >=", value, "employeerId");
            return (Criteria) this;
        }

        public Criteria andEmployeerIdLessThan(Integer value) {
            addCriterion("employeer_id <", value, "employeerId");
            return (Criteria) this;
        }

        public Criteria andEmployeerIdLessThanOrEqualTo(Integer value) {
            addCriterion("employeer_id <=", value, "employeerId");
            return (Criteria) this;
        }

        public Criteria andEmployeerIdIn(List<Integer> values) {
            addCriterion("employeer_id in", values, "employeerId");
            return (Criteria) this;
        }

        public Criteria andEmployeerIdNotIn(List<Integer> values) {
            addCriterion("employeer_id not in", values, "employeerId");
            return (Criteria) this;
        }

        public Criteria andEmployeerIdBetween(Integer value1, Integer value2) {
            addCriterion("employeer_id between", value1, value2, "employeerId");
            return (Criteria) this;
        }

        public Criteria andEmployeerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employeer_id not between", value1, value2, "employeerId");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameIsNull() {
            addCriterion("employeer_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameIsNotNull() {
            addCriterion("employeer_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameEqualTo(String value) {
            addCriterion("employeer_name =", value, "employeerName");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameNotEqualTo(String value) {
            addCriterion("employeer_name <>", value, "employeerName");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameGreaterThan(String value) {
            addCriterion("employeer_name >", value, "employeerName");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameGreaterThanOrEqualTo(String value) {
            addCriterion("employeer_name >=", value, "employeerName");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameLessThan(String value) {
            addCriterion("employeer_name <", value, "employeerName");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameLessThanOrEqualTo(String value) {
            addCriterion("employeer_name <=", value, "employeerName");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameLike(String value) {
            addCriterion("employeer_name like", value, "employeerName");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameNotLike(String value) {
            addCriterion("employeer_name not like", value, "employeerName");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameIn(List<String> values) {
            addCriterion("employeer_name in", values, "employeerName");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameNotIn(List<String> values) {
            addCriterion("employeer_name not in", values, "employeerName");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameBetween(String value1, String value2) {
            addCriterion("employeer_name between", value1, value2, "employeerName");
            return (Criteria) this;
        }

        public Criteria andEmployeerNameNotBetween(String value1, String value2) {
            addCriterion("employeer_name not between", value1, value2, "employeerName");
            return (Criteria) this;
        }

        public Criteria andEmployeerAgeIsNull() {
            addCriterion("employeer_age is null");
            return (Criteria) this;
        }

        public Criteria andEmployeerAgeIsNotNull() {
            addCriterion("employeer_age is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeerAgeEqualTo(Integer value) {
            addCriterion("employeer_age =", value, "employeerAge");
            return (Criteria) this;
        }

        public Criteria andEmployeerAgeNotEqualTo(Integer value) {
            addCriterion("employeer_age <>", value, "employeerAge");
            return (Criteria) this;
        }

        public Criteria andEmployeerAgeGreaterThan(Integer value) {
            addCriterion("employeer_age >", value, "employeerAge");
            return (Criteria) this;
        }

        public Criteria andEmployeerAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeer_age >=", value, "employeerAge");
            return (Criteria) this;
        }

        public Criteria andEmployeerAgeLessThan(Integer value) {
            addCriterion("employeer_age <", value, "employeerAge");
            return (Criteria) this;
        }

        public Criteria andEmployeerAgeLessThanOrEqualTo(Integer value) {
            addCriterion("employeer_age <=", value, "employeerAge");
            return (Criteria) this;
        }

        public Criteria andEmployeerAgeIn(List<Integer> values) {
            addCriterion("employeer_age in", values, "employeerAge");
            return (Criteria) this;
        }

        public Criteria andEmployeerAgeNotIn(List<Integer> values) {
            addCriterion("employeer_age not in", values, "employeerAge");
            return (Criteria) this;
        }

        public Criteria andEmployeerAgeBetween(Integer value1, Integer value2) {
            addCriterion("employeer_age between", value1, value2, "employeerAge");
            return (Criteria) this;
        }

        public Criteria andEmployeerAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("employeer_age not between", value1, value2, "employeerAge");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentIsNull() {
            addCriterion("employeer_department is null");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentIsNotNull() {
            addCriterion("employeer_department is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentEqualTo(String value) {
            addCriterion("employeer_department =", value, "employeerDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentNotEqualTo(String value) {
            addCriterion("employeer_department <>", value, "employeerDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentGreaterThan(String value) {
            addCriterion("employeer_department >", value, "employeerDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("employeer_department >=", value, "employeerDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentLessThan(String value) {
            addCriterion("employeer_department <", value, "employeerDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentLessThanOrEqualTo(String value) {
            addCriterion("employeer_department <=", value, "employeerDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentLike(String value) {
            addCriterion("employeer_department like", value, "employeerDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentNotLike(String value) {
            addCriterion("employeer_department not like", value, "employeerDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentIn(List<String> values) {
            addCriterion("employeer_department in", values, "employeerDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentNotIn(List<String> values) {
            addCriterion("employeer_department not in", values, "employeerDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentBetween(String value1, String value2) {
            addCriterion("employeer_department between", value1, value2, "employeerDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeerDepartmentNotBetween(String value1, String value2) {
            addCriterion("employeer_department not between", value1, value2, "employeerDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeIsNull() {
            addCriterion("employeer_worktype is null");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeIsNotNull() {
            addCriterion("employeer_worktype is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeEqualTo(String value) {
            addCriterion("employeer_worktype =", value, "employeerWorktype");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeNotEqualTo(String value) {
            addCriterion("employeer_worktype <>", value, "employeerWorktype");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeGreaterThan(String value) {
            addCriterion("employeer_worktype >", value, "employeerWorktype");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeGreaterThanOrEqualTo(String value) {
            addCriterion("employeer_worktype >=", value, "employeerWorktype");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeLessThan(String value) {
            addCriterion("employeer_worktype <", value, "employeerWorktype");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeLessThanOrEqualTo(String value) {
            addCriterion("employeer_worktype <=", value, "employeerWorktype");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeLike(String value) {
            addCriterion("employeer_worktype like", value, "employeerWorktype");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeNotLike(String value) {
            addCriterion("employeer_worktype not like", value, "employeerWorktype");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeIn(List<String> values) {
            addCriterion("employeer_worktype in", values, "employeerWorktype");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeNotIn(List<String> values) {
            addCriterion("employeer_worktype not in", values, "employeerWorktype");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeBetween(String value1, String value2) {
            addCriterion("employeer_worktype between", value1, value2, "employeerWorktype");
            return (Criteria) this;
        }

        public Criteria andEmployeerWorktypeNotBetween(String value1, String value2) {
            addCriterion("employeer_worktype not between", value1, value2, "employeerWorktype");
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