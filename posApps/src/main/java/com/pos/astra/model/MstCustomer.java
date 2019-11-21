package com.pos.astra.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pos_mst_customer")
public class MstCustomer {
    @Id
    private int id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "phone", length = 16)
    private String phone;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "address", length = 255)
    private String address;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = MstProvince.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "province_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstProvince provinceId;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = MstRegion.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstRegion regionId;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = MstDistrict.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "district_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstDistrict districtId;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return "MstCustomer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", provinceId=" + provinceId +
                ", regionId=" + regionId +
                ", districtId=" + districtId +
                ", createBy=" + createBy +
                ", createOn=" + createOn +
                ", modifiedBy=" + modifiedBy +
                ", modifiedOn=" + modifiedOn +
                ", active=" + active +
                '}';
    }
}
