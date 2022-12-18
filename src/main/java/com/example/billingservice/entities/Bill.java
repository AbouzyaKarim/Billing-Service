package com.example.billingservice.entities;

import com.example.billingservice.models.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    private Long customerId;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;

    @Transient
    private Customer customer;

    public double getTotale(){
        double somme=0;
        for(ProductItem pi: productItems){
            somme+=pi.getAmount();
        }
        return somme;
    }

}
