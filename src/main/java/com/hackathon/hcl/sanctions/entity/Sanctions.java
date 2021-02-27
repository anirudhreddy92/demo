package com.hackathon.hcl.sanctions.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="sanctions_tbl")
public class Sanctions {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String country;
    private boolean isSanctioned;

}
