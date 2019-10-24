package com.docker.demo.entry;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="t_test_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    @Column(name="user_id")
    private String userId;

    @Column(name="email")
    private String email;

    @Column(name="sex")
    private String sex;

}