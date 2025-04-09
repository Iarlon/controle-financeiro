package com.controlefinanceiro.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("CLIENTE")

public class Cliente extends Usuario {
    private String cpf;
    private String localizacao;

    @OneToMany(mappedBy = "cliente")  // ← Indica que "cliente" é o atributo em Movimentacao
    private List<Movimentacao> movimentacoes;
}