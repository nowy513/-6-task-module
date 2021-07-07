package com.kodilla.hibernate.task;

<<<<<<< HEAD
import org.springframework.lang.NonNull;

import javax.persistence.*;
=======
import javax.persistence.*;
import javax.validation.constraints.NotNull;
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
import java.math.BigDecimal;

@Entity
@Table(name = "TASKS_FINANCIALS")
public class TaskFinancialDetails {
<<<<<<< HEAD
=======

>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    private int id;
    private BigDecimal price;
    private boolean paid;

    public TaskFinancialDetails() {
<<<<<<< HEAD

=======
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    }

    public TaskFinancialDetails(BigDecimal price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }
<<<<<<< HEAD
    @Id
    @GeneratedValue
    @NonNull
=======

    @Id
    @GeneratedValue
    @NotNull
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
<<<<<<< HEAD
=======

>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }
<<<<<<< HEAD
=======

>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    @Column(name = "PAID")
    public boolean isPaid() {
        return paid;
    }

<<<<<<< HEAD
    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPaid(boolean paid) {
=======
    private void setId(int id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setPaid(boolean paid) {
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
        this.paid = paid;
    }
}