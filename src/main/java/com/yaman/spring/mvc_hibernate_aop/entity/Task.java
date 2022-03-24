package com.yaman.spring.mvc_hibernate_aop.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
@Getter@Setter
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "task_name")
    @ToString.Include
    private String name;

    @Column(name = "task_info")
    @ToString.Include
    private String info;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
