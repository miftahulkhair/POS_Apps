package com.pos.astra.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pos_item_inventory")
public class AssInventory {
    @Id
    private int id;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = MstVariant.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "variant_id", referencedColumnName = "id", insertable = false, updatable = false)
    private List<MstVariant> variantId;

    @OneToOne(targetEntity = MstOutlet.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "outlet_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstOutlet outletId;

    @Column(name = "beginning", nullable = false)
    private int beginning;

    @Column(name = "purchase_qty")
    private int purchaseQty;

    @Column(name = "sales_order_qty")
    private int salesOrderQty;

    @Column(name = "transfer_stock_qty")
    private int transferStockQty;

    @Column(name = "adjustment_qty")
    private int adjustmentQty;

    @Column(name = "ending_qty", nullable = false)
    private int endingQty;

    @Column(name = "alert_at_qty", nullable = false)
    private int alertAtQty;

    @Column(name = "create_by")
    private int createBy;

    @Column(name = "create_on")
    private Date createOn;

    @Column(name = "modified_by")
    private int modifiedBy;

    @Column(name = "modified_on")
    private Date modifiedOn;

    @Column(name = "active")
    private boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<MstVariant> getVariantId() {
        return variantId;
    }

    public void setVariantId(List<MstVariant> variantId) {
        this.variantId = variantId;
    }

    public MstOutlet getOutletId() {
        return outletId;
    }

    public void setOutletId(MstOutlet outletId) {
        this.outletId = outletId;
    }

    public int getBeginning() {
        return beginning;
    }

    public void setBeginning(int beginning) {
        this.beginning = beginning;
    }

    public int getPurchaseQty() {
        return purchaseQty;
    }

    public void setPurchaseQty(int purchaseQty) {
        this.purchaseQty = purchaseQty;
    }

    public int getSalesOrderQty() {
        return salesOrderQty;
    }

    public void setSalesOrderQty(int salesOrderQty) {
        this.salesOrderQty = salesOrderQty;
    }

    public int getTransferStockQty() {
        return transferStockQty;
    }

    public void setTransferStockQty(int transferStockQty) {
        this.transferStockQty = transferStockQty;
    }

    public int getAdjustmentQty() {
        return adjustmentQty;
    }

    public void setAdjustmentQty(int adjustmentQty) {
        this.adjustmentQty = adjustmentQty;
    }

    public int getEndingQty() {
        return endingQty;
    }

    public void setEndingQty(int endingQty) {
        this.endingQty = endingQty;
    }

    public int getAlertAtQty() {
        return alertAtQty;
    }

    public void setAlertAtQty(int alertAtQty) {
        this.alertAtQty = alertAtQty;
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
        return "AssInventory{" +
                "id=" + id +
                ", variantId=" + variantId +
                ", outletId=" + outletId +
                ", beginning=" + beginning +
                ", purchaseQty=" + purchaseQty +
                ", salesOrderQty=" + salesOrderQty +
                ", transferStockQty=" + transferStockQty +
                ", adjustmentQty=" + adjustmentQty +
                ", endingQty=" + endingQty +
                ", alertAtQty=" + alertAtQty +
                ", createBy=" + createBy +
                ", createOn=" + createOn +
                ", modifiedBy=" + modifiedBy +
                ", modifiedOn=" + modifiedOn +
                ", active=" + active +
                '}';
    }
}
