package com.pos.astra.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pos_mst_user")
public class MstUser {
    @Id
    private int id;

    @Column(name = "username", length = 50, nullable = false)
    private String username;

    @Column(name = "password", length = 255, nullable = false)
    private String password;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = MstRole.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstRole roleId;

    @OneToOne(targetEntity = MstEmployee.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstEmployee employeeId;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MstRole getRoleId() {
        return roleId;
    }

    public void setRoleId(MstRole roleId) {
        this.roleId = roleId;
    }

    public MstEmployee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(MstEmployee employeeId) {
        this.employeeId = employeeId;
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
        return "MstUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roleId=" + roleId +
                ", employeeId=" + employeeId +
                ", createBy=" + createBy +
                ", createOn=" + createOn +
                ", modifiedBy=" + modifiedBy +
                ", modifiedOn=" + modifiedOn +
                ", active=" + active +
                '}';
    }
}
