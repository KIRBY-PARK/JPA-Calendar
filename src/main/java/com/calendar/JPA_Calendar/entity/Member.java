package com.calendar.JPA_Calendar.entity;

@Entity
@Table(name = "member")
public class Member extends BaseEntity {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private Integer age;
}
