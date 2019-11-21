package com.pos.astra.model;

import javax.persistence.*;

@Entity
@Table(name = "pos_employee_outlet")
//table baru hasil many to many employee dan outlet
public class AssEmployeeOutlet {
    @Id
    private int id;

    @OneToOne(targetEntity = MstEmployee.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstEmployee employeeId;

    @OneToOne(targetEntity = MstOutlet.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "outlet_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstOutlet outletId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MstEmployee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(MstEmployee employeeId) {
        this.employeeId = employeeId;
    }

    public MstOutlet getOutletId() {
        return outletId;
    }

    public void setOutletId(MstOutlet outletId) {
        this.outletId = outletId;
    }

    @Override
    public String toString() {
        return "AssEmployeeOutlet{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", outletId=" + outletId +
                '}';
    }
}
