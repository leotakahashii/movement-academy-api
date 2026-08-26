package com.movementacademy.movement_academy_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.math.BigDecimal;

@Entity
@Table(name = "plano_assinatura")

public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private BigDecimal valorMensal;
    private String nome;
    private Integer duracaoEmMeses;

    public Plano(){
    }

    public Plano(BigDecimal valorMensal, String nome, Integer duracaoEmMeses) {
        this.valorMensal = valorMensal;
        this.nome = nome;
        this.duracaoEmMeses = duracaoEmMeses;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getValorMensal(){
        return valorMensal;
    }

    public void setValorMensal(BigDecimal valorMensal) {
        this.valorMensal = valorMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracaoEmMeses() {
        return duracaoEmMeses;
    }

    public void setDuracaoEmMeses(Integer duracaoEmMeses) {
        this.duracaoEmMeses = duracaoEmMeses;
    }
}
