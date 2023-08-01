package com.joeyjin.rewards.entity;

import com.joeyjin.rewards.entity.type.YearMonthIntegerType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.TypeDef;

import java.time.YearMonth;

/**
 * A class for customer purchase.
 * Consists of customer id, the year & month of the purchase, and the amount of purchase.
 */
@Entity
@Table(name = "purchase")
@TypeDef(typeClass = YearMonthIntegerType.class,
        defaultForType = YearMonth.class)
public class PurchaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @NotBlank
    @Column(name = "customerid")
    private Long customerId;

    @NotBlank
    @Column(name = "yearmonth",
            columnDefinition = "date")
    private YearMonth yearmonth;

    @NotBlank
    @Column(name = "amount")
    private Integer amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public YearMonth getYearMonth() {
        return yearmonth;
    }

    public void setYearMonth(YearMonth yearmonth) {
        this.yearmonth = yearmonth;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PurchaseEntity{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", yearmonth=" + yearmonth +
                ", amount=" + amount +
                '}';
    }
}
