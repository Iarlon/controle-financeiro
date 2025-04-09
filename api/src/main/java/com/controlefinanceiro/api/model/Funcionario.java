package com.controlefinanceiro.api.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("FUNCIONARIO")
public class Funcionario extends Usuario {
    private Long matricula;

    public void criarDica() { /* Lógica para dicas */ }
    public void receberEmail() { /* Lógica para emails */ }
}
