package com.pos.astra.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post_mst_region")
public class MstRegion {
    @Id
    private int id;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = MstProvince.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "province_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstProvince provinceId;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "create_by")
    private int createBy;

    @Column(name = "create_on")
    private Date createOn;

    @Column(name = "modified_by")
    private int modifiedBy;

    @Column(name = "modified_on")
    private Date modifiedOn;

    @Column(name = "active", nullable = false)
    private boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MstProvince getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(MstProvince provinceId) {
        this.provinceId = provinceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "MstRegion{" +
                "id=" + id +
                ", provinceId=" + provinceId +
                ", name='" + name + '\'' +
                ", createBy=" + createBy +
                ", createOn=" + createOn +
                ", modifiedBy=" + modifiedBy +
                ", modifiedOn=" + modifiedOn +
                ", active=" + active +
                '}';
    }
}
