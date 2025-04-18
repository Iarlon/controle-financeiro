package com.controlefinanceiro.api.service;

import com.controlefinanceiro.api.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoService {
    @Autowired
    MovimentacaoRepository movimentacaoRepository;

    public void criarMovimentacao(Valor valor, Categoria categoria) {

        if (categoria.getTipoMovimentacao() == Categoria.TipoMovimentacao.DESPESA) {
            if (categoria.getNomeDespesa() == null || categoria.getNomeReceita() != null) {
                throw new IllegalArgumentException("Categoria de despesa deve ter nomeDespesa preenchido e nomeReceita nulo.");
            }

            if (categoria.getTipoCategoria() != Categoria.TipoCategoria.FIXA &&
                    categoria.getTipoCategoria() != Categoria.TipoCategoria.VARIAVEL) {
                throw new IllegalArgumentException("Despesa só pode ter tipo FIXA ou VARIAVEL.");
            }

        } else if (categoria.getTipoMovimentacao() == Categoria.TipoMovimentacao.RECEITA) {
            if (categoria.getNomeReceita() == null || categoria.getNomeDespesa() != null) {
                throw new IllegalArgumentException("Categoria de receita deve ter nomeReceita preenchido e nomeDespesa nulo.");
            }

            if (categoria.getTipoCategoria() != Categoria.TipoCategoria.FIXA &&
                    categoria.getTipoCategoria() != Categoria.TipoCategoria.EXTRA) {
                throw new IllegalArgumentException("Receita só pode ter tipo FIXA ou EXTRA.");
            }
        }

        // salvar movimentação aqui ou retornar DTO
        System.out.println("Movimentação criada com sucesso!");
    }
}
