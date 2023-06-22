package edu.quotaservice.model;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class Quota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int code;

    @Column
    private BigDecimal price;

    @Column
    private int userId;

    @Column
    private String vin;

    @Enumerated(EnumType.ORDINAL)
    private  List<ServiceItemType> list;




}


