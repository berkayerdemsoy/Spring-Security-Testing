package com.berkai.spring_security.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
@Entity
public class User {
    @Id
    private Integer id;
    private String username;
    private String password;
}
