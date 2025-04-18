package com.controlefinanceiro.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Movimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int quantidade;

    @ManyToOne
    private Categoria categoria;

    @OneToOne
    private Valor valor;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;



}
