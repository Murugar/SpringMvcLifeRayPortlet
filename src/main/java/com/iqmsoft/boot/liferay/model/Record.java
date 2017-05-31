package com.iqmsoft.boot.liferay.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "record")
@Getter
@Setter
public class Record implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long recordId;

    @Column(name = "name")
    private String name;

}
