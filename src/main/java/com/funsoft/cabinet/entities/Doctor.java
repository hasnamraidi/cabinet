package com.funsoft.cabinet.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;

//PJO ---> entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doctors")

public class Doctor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 30, nullable = false)
    @NotBlank(message= "firstname is mandatory")
    @Pattern(regexp = "[a-zA-Z]+", message= "firstname should be contains only alphabetic")
    private String firstname;
    @Column(length = 35, nullable = false)
    @NotBlank(message= "lastname is mandatory")
    @Pattern(regexp = "[a-zA-Z]+", message= "lastname should be contains only alphabetic")
    private String lastname;
    @Column(nullable = false, unique = true)
    @Email(message= "email invalid")
    private String email;
    @Column(nullable = false)
    @NotBlank(message= "address is mandatory")
    private String address;
    //@NotBlank(message= "speciality is mandatory")
    @Enumerated(EnumType.STRING)
    private Speciality speciality;

  /*  @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY, cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private List<Appointment> appointments;*/

}
