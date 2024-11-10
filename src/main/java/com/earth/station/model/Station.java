package com.earth.station.model;

import java.io.Serializable;

public class Station implements Serializable {
    private Integer id;

    private String stationNo;

    private String name;

    private String level;

    private String hasWatch;

    private String lat;

    private String lng;

    private String elevation;

    private String buildTime;

    private Integer testEq;

    private Integer strongEq;

    private Integer tm;

    private Integer liquid;

    private Integer gnss;

    private Integer gravity;

    private Integer deformation;

    private Integer aid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStationNo() {
        return stationNo;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo == null ? null : stationNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getHasWatch() {
        return hasWatch;
    }

    public void setHasWatch(String hasWatch) {
        this.hasWatch = hasWatch == null ? null : hasWatch.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation == null ? null : elevation.trim();
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime == null ? null : buildTime.trim();
    }

    public Integer getTestEq() {
        return testEq;
    }

    public void setTestEq(Integer testEq) {
        this.testEq = testEq;
    }

    public Integer getStrongEq() {
        return strongEq;
    }

    public void setStrongEq(Integer strongEq) {
        this.strongEq = strongEq;
    }

    public Integer getTm() {
        return tm;
    }

    public void setTm(Integer tm) {
        this.tm = tm;
    }

    public Integer getLiquid() {
        return liquid;
    }

    public void setLiquid(Integer liquid) {
        this.liquid = liquid;
    }

    public Integer getGnss() {
        return gnss;
    }

    public void setGnss(Integer gnss) {
        this.gnss = gnss;
    }

    public Integer getGravity() {
        return gravity;
    }

    public void setGravity(Integer gravity) {
        this.gravity = gravity;
    }

    public Integer getDeformation() {
        return deformation;
    }

    public void setDeformation(Integer deformation) {
        this.deformation = deformation;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Station other = (Station) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStationNo() == null ? other.getStationNo() == null : this.getStationNo().equals(other.getStationNo()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getHasWatch() == null ? other.getHasWatch() == null : this.getHasWatch().equals(other.getHasWatch()))
            && (this.getLat() == null ? other.getLat() == null : this.getLat().equals(other.getLat()))
            && (this.getLng() == null ? other.getLng() == null : this.getLng().equals(other.getLng()))
            && (this.getElevation() == null ? other.getElevation() == null : this.getElevation().equals(other.getElevation()))
            && (this.getBuildTime() == null ? other.getBuildTime() == null : this.getBuildTime().equals(other.getBuildTime()))
            && (this.getTestEq() == null ? other.getTestEq() == null : this.getTestEq().equals(other.getTestEq()))
            && (this.getStrongEq() == null ? other.getStrongEq() == null : this.getStrongEq().equals(other.getStrongEq()))
            && (this.getTm() == null ? other.getTm() == null : this.getTm().equals(other.getTm()))
            && (this.getLiquid() == null ? other.getLiquid() == null : this.getLiquid().equals(other.getLiquid()))
            && (this.getGnss() == null ? other.getGnss() == null : this.getGnss().equals(other.getGnss()))
            && (this.getGravity() == null ? other.getGravity() == null : this.getGravity().equals(other.getGravity()))
            && (this.getDeformation() == null ? other.getDeformation() == null : this.getDeformation().equals(other.getDeformation()))
            && (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStationNo() == null) ? 0 : getStationNo().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getHasWatch() == null) ? 0 : getHasWatch().hashCode());
        result = prime * result + ((getLat() == null) ? 0 : getLat().hashCode());
        result = prime * result + ((getLng() == null) ? 0 : getLng().hashCode());
        result = prime * result + ((getElevation() == null) ? 0 : getElevation().hashCode());
        result = prime * result + ((getBuildTime() == null) ? 0 : getBuildTime().hashCode());
        result = prime * result + ((getTestEq() == null) ? 0 : getTestEq().hashCode());
        result = prime * result + ((getStrongEq() == null) ? 0 : getStrongEq().hashCode());
        result = prime * result + ((getTm() == null) ? 0 : getTm().hashCode());
        result = prime * result + ((getLiquid() == null) ? 0 : getLiquid().hashCode());
        result = prime * result + ((getGnss() == null) ? 0 : getGnss().hashCode());
        result = prime * result + ((getGravity() == null) ? 0 : getGravity().hashCode());
        result = prime * result + ((getDeformation() == null) ? 0 : getDeformation().hashCode());
        result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stationNo=").append(stationNo);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", hasWatch=").append(hasWatch);
        sb.append(", lat=").append(lat);
        sb.append(", lng=").append(lng);
        sb.append(", elevation=").append(elevation);
        sb.append(", buildTime=").append(buildTime);
        sb.append(", testEq=").append(testEq);
        sb.append(", strongEq=").append(strongEq);
        sb.append(", tm=").append(tm);
        sb.append(", liquid=").append(liquid);
        sb.append(", gnss=").append(gnss);
        sb.append(", gravity=").append(gravity);
        sb.append(", deformation=").append(deformation);
        sb.append(", aid=").append(aid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}