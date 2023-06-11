package com.Bhc_Ops.Bhc_API.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "pallet")
public class Pallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(min=5, max=5)
    @Column(name="palletNumber", unique = true, nullable = false)
    private String palletNumber;
    private String warehouse;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Bale> bales;


}
