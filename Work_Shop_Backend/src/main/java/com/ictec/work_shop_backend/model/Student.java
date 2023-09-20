package com.ictec.work_shop_backend.model;

import jakarta.persistence.Entity;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String age;
    private String gender;
    private String email;

}