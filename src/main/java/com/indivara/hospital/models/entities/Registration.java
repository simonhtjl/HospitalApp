package com.indivara.hospital.models.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Setter
@Getter
@Entity
@Table(name = "registrasi")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 50)
    private String nama;

    @NotBlank
    @Size(max = 50)
    private String umur;

    @NotBlank
    @Size(max = 50)
    private String jeniskelamin;

    @NotBlank
    @Size(max = 50)
    private String golongandarah;

    @NotBlank
    @Size(max = 50)
    private String gejala;


}
