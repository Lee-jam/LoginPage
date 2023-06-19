package com.example.demo.entitiy;

import jakarta.persistence.*;

@Entity
public class Member {
    @Id
    @Column(name = "mem_num")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long num;

    @Column(name ="mem_name")
    private String name;
    @Column(name ="mem_id")
    private String id;
    @Column(name ="mem_pw")
    private String password;
    @Column(name ="mem_email")
    private String email;


}
