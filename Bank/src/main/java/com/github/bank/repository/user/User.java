package com.github.bank.repository.user;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 15, nullable = false)
    private String username;

    @Column(length = 20,nullable = false,unique = true)
    private String userId;

    @Column(length = 100,nullable = false)
    private String password;

    @Column(length = 20,nullable = false)
    private String bankType;

}
