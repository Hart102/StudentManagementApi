package com.example.studentManagementSystem.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

//@Setter
//@Getter
@Entity
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


    public Object getFirstName() {
        return firstName;
    }

    public void setFirstName(Object firstName) {
        this.firstName = (String) firstName;
    }

    public Object getLastName() {
        return lastName;
    }

    public void setLastName(Object lastName) {
        this.lastName = (String) lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = (String) email;
    }

    public Object getDepartment() {
        return department;
    }

    public void setDepartment(Object department) {
        this.department = (String) department;
    }
}
