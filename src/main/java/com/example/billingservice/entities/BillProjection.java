package com.example.billingservice.entities;

import com.example.billingservice.models.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Projection(name = "fullBill",types = Bill.class)
public interface BillProjection {
    Long getId();
    Date getbillingDate();
    Long getCustomerId();
}
