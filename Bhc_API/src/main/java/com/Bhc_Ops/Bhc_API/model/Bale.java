package com.Bhc_Ops.Bhc_API.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "bale")
public class Bale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, nullable = false)
    String barcode;
    String grade;
    String growerNumber;
    float price;
    float mass;


    public Bale(String barcode, String grade, String growerNumber, float price, float mass) {
        this.barcode = barcode;
        this.grade = grade;
        this.growerNumber = growerNumber;
        this.price = price;
        this.mass = mass;
    }
//    public Bale(){}
}
