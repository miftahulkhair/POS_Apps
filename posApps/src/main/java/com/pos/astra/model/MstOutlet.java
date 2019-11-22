package com.pos.astra.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pos_mst_outlet")
public class MstOutlet {
    @Id
    private int id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "phone", length = 16)
    private String phone;

    @Column(name = "email", length = 50)
    private String email;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "province_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstProvince provinceId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstRegion regionId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "district_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstDistrict districtId;

    @Column(name = "postal_code")
    private String postalCode;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MstProvince getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(MstProvince provinceId) {
        this.provinceId = provinceId;
    }

    public MstRegion getRegionId() {
        return regionId;
    }

    public void setRegionId(MstRegion regionId) {
        this.regionId = regionId;
    }

    public MstDistrict getDistrictId() {
        return districtId;
    }

    public void setDistrictId(MstDistrict districtId) {
        this.districtId = districtId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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
        return "MstOutlet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", provinceId=" + provinceId +
                ", regionId=" + regionId +
                ", districtId=" + districtId +
                ", postalCode='" + postalCode + '\'' +
                ", createBy=" + createBy +
                ", createOn=" + createOn +
                ", modifiedBy=" + modifiedBy +
                ", modifiedOn=" + modifiedOn +
                ", active=" + active +
                '}';
    }
}
