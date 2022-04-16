package com.indivara.hospital.models.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Setter
@Getter
@Entity
@Table(name = "treatment")
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 50)
    private String nama;

    @NotBlank
    @Size(max = 50)
    private String diagnosis;

    @NotBlank
    @Size(max = 50)
    private String deskripsi;

    @NotBlank
    @Size(max = 50)
    private String resepobat;

}
