package com.earth.station.model;

import java.util.ArrayList;
import java.util.List;

public class StationCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer offset;

    private Integer limit;

    public StationCriteria() {
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
        this.offset = null;
        this.limit = null;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public StationCriteria page(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
        return this;
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

        public Criteria andStationNoIsNull() {
            addCriterion("station_no is null");
            return (Criteria) this;
        }

        public Criteria andStationNoIsNotNull() {
            addCriterion("station_no is not null");
            return (Criteria) this;
        }

        public Criteria andStationNoEqualTo(String value) {
            addCriterion("station_no =", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotEqualTo(String value) {
            addCriterion("station_no <>", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoGreaterThan(String value) {
            addCriterion("station_no >", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoGreaterThanOrEqualTo(String value) {
            addCriterion("station_no >=", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLessThan(String value) {
            addCriterion("station_no <", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLessThanOrEqualTo(String value) {
            addCriterion("station_no <=", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLike(String value) {
            addCriterion("station_no like", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotLike(String value) {
            addCriterion("station_no not like", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoIn(List<String> values) {
            addCriterion("station_no in", values, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotIn(List<String> values) {
            addCriterion("station_no not in", values, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoBetween(String value1, String value2) {
            addCriterion("station_no between", value1, value2, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotBetween(String value1, String value2) {
            addCriterion("station_no not between", value1, value2, "stationNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andHasWatchIsNull() {
            addCriterion("has_watch is null");
            return (Criteria) this;
        }

        public Criteria andHasWatchIsNotNull() {
            addCriterion("has_watch is not null");
            return (Criteria) this;
        }

        public Criteria andHasWatchEqualTo(String value) {
            addCriterion("has_watch =", value, "hasWatch");
            return (Criteria) this;
        }

        public Criteria andHasWatchNotEqualTo(String value) {
            addCriterion("has_watch <>", value, "hasWatch");
            return (Criteria) this;
        }

        public Criteria andHasWatchGreaterThan(String value) {
            addCriterion("has_watch >", value, "hasWatch");
            return (Criteria) this;
        }

        public Criteria andHasWatchGreaterThanOrEqualTo(String value) {
            addCriterion("has_watch >=", value, "hasWatch");
            return (Criteria) this;
        }

        public Criteria andHasWatchLessThan(String value) {
            addCriterion("has_watch <", value, "hasWatch");
            return (Criteria) this;
        }

        public Criteria andHasWatchLessThanOrEqualTo(String value) {
            addCriterion("has_watch <=", value, "hasWatch");
            return (Criteria) this;
        }

        public Criteria andHasWatchLike(String value) {
            addCriterion("has_watch like", value, "hasWatch");
            return (Criteria) this;
        }

        public Criteria andHasWatchNotLike(String value) {
            addCriterion("has_watch not like", value, "hasWatch");
            return (Criteria) this;
        }

        public Criteria andHasWatchIn(List<String> values) {
            addCriterion("has_watch in", values, "hasWatch");
            return (Criteria) this;
        }

        public Criteria andHasWatchNotIn(List<String> values) {
            addCriterion("has_watch not in", values, "hasWatch");
            return (Criteria) this;
        }

        public Criteria andHasWatchBetween(String value1, String value2) {
            addCriterion("has_watch between", value1, value2, "hasWatch");
            return (Criteria) this;
        }

        public Criteria andHasWatchNotBetween(String value1, String value2) {
            addCriterion("has_watch not between", value1, value2, "hasWatch");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(String value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(String value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(String value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(String value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(String value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(String value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLike(String value) {
            addCriterion("lng like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotLike(String value) {
            addCriterion("lng not like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<String> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<String> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(String value1, String value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(String value1, String value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andElevationIsNull() {
            addCriterion("elevation is null");
            return (Criteria) this;
        }

        public Criteria andElevationIsNotNull() {
            addCriterion("elevation is not null");
            return (Criteria) this;
        }

        public Criteria andElevationEqualTo(String value) {
            addCriterion("elevation =", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationNotEqualTo(String value) {
            addCriterion("elevation <>", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationGreaterThan(String value) {
            addCriterion("elevation >", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationGreaterThanOrEqualTo(String value) {
            addCriterion("elevation >=", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationLessThan(String value) {
            addCriterion("elevation <", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationLessThanOrEqualTo(String value) {
            addCriterion("elevation <=", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationLike(String value) {
            addCriterion("elevation like", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationNotLike(String value) {
            addCriterion("elevation not like", value, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationIn(List<String> values) {
            addCriterion("elevation in", values, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationNotIn(List<String> values) {
            addCriterion("elevation not in", values, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationBetween(String value1, String value2) {
            addCriterion("elevation between", value1, value2, "elevation");
            return (Criteria) this;
        }

        public Criteria andElevationNotBetween(String value1, String value2) {
            addCriterion("elevation not between", value1, value2, "elevation");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIsNull() {
            addCriterion("build_time is null");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIsNotNull() {
            addCriterion("build_time is not null");
            return (Criteria) this;
        }

        public Criteria andBuildTimeEqualTo(String value) {
            addCriterion("build_time =", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotEqualTo(String value) {
            addCriterion("build_time <>", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeGreaterThan(String value) {
            addCriterion("build_time >", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeGreaterThanOrEqualTo(String value) {
            addCriterion("build_time >=", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeLessThan(String value) {
            addCriterion("build_time <", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeLessThanOrEqualTo(String value) {
            addCriterion("build_time <=", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeLike(String value) {
            addCriterion("build_time like", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotLike(String value) {
            addCriterion("build_time not like", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIn(List<String> values) {
            addCriterion("build_time in", values, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotIn(List<String> values) {
            addCriterion("build_time not in", values, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeBetween(String value1, String value2) {
            addCriterion("build_time between", value1, value2, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotBetween(String value1, String value2) {
            addCriterion("build_time not between", value1, value2, "buildTime");
            return (Criteria) this;
        }

        public Criteria andTestEqIsNull() {
            addCriterion("test_eq is null");
            return (Criteria) this;
        }

        public Criteria andTestEqIsNotNull() {
            addCriterion("test_eq is not null");
            return (Criteria) this;
        }

        public Criteria andTestEqEqualTo(Integer value) {
            addCriterion("test_eq =", value, "testEq");
            return (Criteria) this;
        }

        public Criteria andTestEqNotEqualTo(Integer value) {
            addCriterion("test_eq <>", value, "testEq");
            return (Criteria) this;
        }

        public Criteria andTestEqGreaterThan(Integer value) {
            addCriterion("test_eq >", value, "testEq");
            return (Criteria) this;
        }

        public Criteria andTestEqGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_eq >=", value, "testEq");
            return (Criteria) this;
        }

        public Criteria andTestEqLessThan(Integer value) {
            addCriterion("test_eq <", value, "testEq");
            return (Criteria) this;
        }

        public Criteria andTestEqLessThanOrEqualTo(Integer value) {
            addCriterion("test_eq <=", value, "testEq");
            return (Criteria) this;
        }

        public Criteria andTestEqIn(List<Integer> values) {
            addCriterion("test_eq in", values, "testEq");
            return (Criteria) this;
        }

        public Criteria andTestEqNotIn(List<Integer> values) {
            addCriterion("test_eq not in", values, "testEq");
            return (Criteria) this;
        }

        public Criteria andTestEqBetween(Integer value1, Integer value2) {
            addCriterion("test_eq between", value1, value2, "testEq");
            return (Criteria) this;
        }

        public Criteria andTestEqNotBetween(Integer value1, Integer value2) {
            addCriterion("test_eq not between", value1, value2, "testEq");
            return (Criteria) this;
        }

        public Criteria andStrongEqIsNull() {
            addCriterion("strong_eq is null");
            return (Criteria) this;
        }

        public Criteria andStrongEqIsNotNull() {
            addCriterion("strong_eq is not null");
            return (Criteria) this;
        }

        public Criteria andStrongEqEqualTo(Integer value) {
            addCriterion("strong_eq =", value, "strongEq");
            return (Criteria) this;
        }

        public Criteria andStrongEqNotEqualTo(Integer value) {
            addCriterion("strong_eq <>", value, "strongEq");
            return (Criteria) this;
        }

        public Criteria andStrongEqGreaterThan(Integer value) {
            addCriterion("strong_eq >", value, "strongEq");
            return (Criteria) this;
        }

        public Criteria andStrongEqGreaterThanOrEqualTo(Integer value) {
            addCriterion("strong_eq >=", value, "strongEq");
            return (Criteria) this;
        }

        public Criteria andStrongEqLessThan(Integer value) {
            addCriterion("strong_eq <", value, "strongEq");
            return (Criteria) this;
        }

        public Criteria andStrongEqLessThanOrEqualTo(Integer value) {
            addCriterion("strong_eq <=", value, "strongEq");
            return (Criteria) this;
        }

        public Criteria andStrongEqIn(List<Integer> values) {
            addCriterion("strong_eq in", values, "strongEq");
            return (Criteria) this;
        }

        public Criteria andStrongEqNotIn(List<Integer> values) {
            addCriterion("strong_eq not in", values, "strongEq");
            return (Criteria) this;
        }

        public Criteria andStrongEqBetween(Integer value1, Integer value2) {
            addCriterion("strong_eq between", value1, value2, "strongEq");
            return (Criteria) this;
        }

        public Criteria andStrongEqNotBetween(Integer value1, Integer value2) {
            addCriterion("strong_eq not between", value1, value2, "strongEq");
            return (Criteria) this;
        }

        public Criteria andTmIsNull() {
            addCriterion("tm is null");
            return (Criteria) this;
        }

        public Criteria andTmIsNotNull() {
            addCriterion("tm is not null");
            return (Criteria) this;
        }

        public Criteria andTmEqualTo(Integer value) {
            addCriterion("tm =", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotEqualTo(Integer value) {
            addCriterion("tm <>", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmGreaterThan(Integer value) {
            addCriterion("tm >", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("tm >=", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLessThan(Integer value) {
            addCriterion("tm <", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLessThanOrEqualTo(Integer value) {
            addCriterion("tm <=", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmIn(List<Integer> values) {
            addCriterion("tm in", values, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotIn(List<Integer> values) {
            addCriterion("tm not in", values, "tm");
            return (Criteria) this;
        }

        public Criteria andTmBetween(Integer value1, Integer value2) {
            addCriterion("tm between", value1, value2, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotBetween(Integer value1, Integer value2) {
            addCriterion("tm not between", value1, value2, "tm");
            return (Criteria) this;
        }

        public Criteria andLiquidIsNull() {
            addCriterion("liquid is null");
            return (Criteria) this;
        }

        public Criteria andLiquidIsNotNull() {
            addCriterion("liquid is not null");
            return (Criteria) this;
        }

        public Criteria andLiquidEqualTo(Integer value) {
            addCriterion("liquid =", value, "liquid");
            return (Criteria) this;
        }

        public Criteria andLiquidNotEqualTo(Integer value) {
            addCriterion("liquid <>", value, "liquid");
            return (Criteria) this;
        }

        public Criteria andLiquidGreaterThan(Integer value) {
            addCriterion("liquid >", value, "liquid");
            return (Criteria) this;
        }

        public Criteria andLiquidGreaterThanOrEqualTo(Integer value) {
            addCriterion("liquid >=", value, "liquid");
            return (Criteria) this;
        }

        public Criteria andLiquidLessThan(Integer value) {
            addCriterion("liquid <", value, "liquid");
            return (Criteria) this;
        }

        public Criteria andLiquidLessThanOrEqualTo(Integer value) {
            addCriterion("liquid <=", value, "liquid");
            return (Criteria) this;
        }

        public Criteria andLiquidIn(List<Integer> values) {
            addCriterion("liquid in", values, "liquid");
            return (Criteria) this;
        }

        public Criteria andLiquidNotIn(List<Integer> values) {
            addCriterion("liquid not in", values, "liquid");
            return (Criteria) this;
        }

        public Criteria andLiquidBetween(Integer value1, Integer value2) {
            addCriterion("liquid between", value1, value2, "liquid");
            return (Criteria) this;
        }

        public Criteria andLiquidNotBetween(Integer value1, Integer value2) {
            addCriterion("liquid not between", value1, value2, "liquid");
            return (Criteria) this;
        }

        public Criteria andGnssIsNull() {
            addCriterion("gnss is null");
            return (Criteria) this;
        }

        public Criteria andGnssIsNotNull() {
            addCriterion("gnss is not null");
            return (Criteria) this;
        }

        public Criteria andGnssEqualTo(Integer value) {
            addCriterion("gnss =", value, "gnss");
            return (Criteria) this;
        }

        public Criteria andGnssNotEqualTo(Integer value) {
            addCriterion("gnss <>", value, "gnss");
            return (Criteria) this;
        }

        public Criteria andGnssGreaterThan(Integer value) {
            addCriterion("gnss >", value, "gnss");
            return (Criteria) this;
        }

        public Criteria andGnssGreaterThanOrEqualTo(Integer value) {
            addCriterion("gnss >=", value, "gnss");
            return (Criteria) this;
        }

        public Criteria andGnssLessThan(Integer value) {
            addCriterion("gnss <", value, "gnss");
            return (Criteria) this;
        }

        public Criteria andGnssLessThanOrEqualTo(Integer value) {
            addCriterion("gnss <=", value, "gnss");
            return (Criteria) this;
        }

        public Criteria andGnssIn(List<Integer> values) {
            addCriterion("gnss in", values, "gnss");
            return (Criteria) this;
        }

        public Criteria andGnssNotIn(List<Integer> values) {
            addCriterion("gnss not in", values, "gnss");
            return (Criteria) this;
        }

        public Criteria andGnssBetween(Integer value1, Integer value2) {
            addCriterion("gnss between", value1, value2, "gnss");
            return (Criteria) this;
        }

        public Criteria andGnssNotBetween(Integer value1, Integer value2) {
            addCriterion("gnss not between", value1, value2, "gnss");
            return (Criteria) this;
        }

        public Criteria andGravityIsNull() {
            addCriterion("gravity is null");
            return (Criteria) this;
        }

        public Criteria andGravityIsNotNull() {
            addCriterion("gravity is not null");
            return (Criteria) this;
        }

        public Criteria andGravityEqualTo(Integer value) {
            addCriterion("gravity =", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityNotEqualTo(Integer value) {
            addCriterion("gravity <>", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityGreaterThan(Integer value) {
            addCriterion("gravity >", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityGreaterThanOrEqualTo(Integer value) {
            addCriterion("gravity >=", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityLessThan(Integer value) {
            addCriterion("gravity <", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityLessThanOrEqualTo(Integer value) {
            addCriterion("gravity <=", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityIn(List<Integer> values) {
            addCriterion("gravity in", values, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityNotIn(List<Integer> values) {
            addCriterion("gravity not in", values, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityBetween(Integer value1, Integer value2) {
            addCriterion("gravity between", value1, value2, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityNotBetween(Integer value1, Integer value2) {
            addCriterion("gravity not between", value1, value2, "gravity");
            return (Criteria) this;
        }

        public Criteria andDeformationIsNull() {
            addCriterion("deformation is null");
            return (Criteria) this;
        }

        public Criteria andDeformationIsNotNull() {
            addCriterion("deformation is not null");
            return (Criteria) this;
        }

        public Criteria andDeformationEqualTo(Integer value) {
            addCriterion("deformation =", value, "deformation");
            return (Criteria) this;
        }

        public Criteria andDeformationNotEqualTo(Integer value) {
            addCriterion("deformation <>", value, "deformation");
            return (Criteria) this;
        }

        public Criteria andDeformationGreaterThan(Integer value) {
            addCriterion("deformation >", value, "deformation");
            return (Criteria) this;
        }

        public Criteria andDeformationGreaterThanOrEqualTo(Integer value) {
            addCriterion("deformation >=", value, "deformation");
            return (Criteria) this;
        }

        public Criteria andDeformationLessThan(Integer value) {
            addCriterion("deformation <", value, "deformation");
            return (Criteria) this;
        }

        public Criteria andDeformationLessThanOrEqualTo(Integer value) {
            addCriterion("deformation <=", value, "deformation");
            return (Criteria) this;
        }

        public Criteria andDeformationIn(List<Integer> values) {
            addCriterion("deformation in", values, "deformation");
            return (Criteria) this;
        }

        public Criteria andDeformationNotIn(List<Integer> values) {
            addCriterion("deformation not in", values, "deformation");
            return (Criteria) this;
        }

        public Criteria andDeformationBetween(Integer value1, Integer value2) {
            addCriterion("deformation between", value1, value2, "deformation");
            return (Criteria) this;
        }

        public Criteria andDeformationNotBetween(Integer value1, Integer value2) {
            addCriterion("deformation not between", value1, value2, "deformation");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
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