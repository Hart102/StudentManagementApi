package com.example.studentManagementSystem.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Generate unique id
    private Long id;
    private String firstName;
    private String lastName;
    @NaturalId(mutable = true) //Make email unique and editable
    private String email;
    private String department;
}
