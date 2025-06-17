package com.example221.deemo;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "student")

public class student {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @jakarta.persistence.Column(nullable = false)
    private String name;
    @jakarta.persistence.Column(nullable = false , unique = true)
    private String telephone;
    private String email;

}
