package com.controlefinanceiro.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorColumn(name = "tipo")

public abstract class Usuario {
    @Column(name = "matricula", unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
}
