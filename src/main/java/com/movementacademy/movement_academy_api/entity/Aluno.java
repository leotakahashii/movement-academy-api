package com.movementacademy.movement_academy_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "aluno")

public class Aluno {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   
   private Long id;
   private String nome;

   @Column(unique = true)
   private String cpf;
   @Column(unique = true)
   private String email;
   
   private String telefone;
   private String cep;
   private String logradouro;
   private String bairro;
   private String cidade;
   private String estado;
   private String numero;
   private String complemento;

   public Aluno(){
   }

   public Aluno(String nome, String cpf, String email, String telefone, String cep, String logradouro, String bairro, String cidade, String estado, String numero, String complemento) {
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.telefone = telefone;
    this.cep = cep;
    this.logradouro = logradouro;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.numero = numero;
    this.complemento = complemento;
   }

   public Long getId() {
    return id;
   }

   public String getNome() {
    return nome;
   }

   public void setNome(String nome) {
    this.nome = nome;
   }

   public String getCpf() {
    return cpf;
   }

   public void setCpf(String cpf) {
    this.cpf = cpf;
   }

   public String getEmail() {
    return email;
   }

   public void setEmail(String email) {
    this.email = email;
   }

   public String getTelefone() {
    return telefone;
   }

   public void setTelefone(String telefone) {
    this.telefone = telefone;
   }

   public String getCep() {
    return cep;
   }

   public void setCep(String cep) {
    this.cep = cep;
   }

   public String getLogradouro() {
    return logradouro;
   }

   public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
   }

   public String getBairro() {
    return bairro;
   }

   public void setBairro(String bairro) {
    this.bairro = bairro;
   }

   public String getCidade() {
    return cidade;
   }

   public void setCidade(String cidade) {
    this.cidade = cidade;
   }

   public String getEstado() {
    return estado;
   }

   public void setEstado(String estado) {
    this.estado = estado;
   }

   public String getNumero() {
    return numero;
   }

   public void setNumero(String numero) {
    this.numero = numero;
   }

   public String getComplemento() {
    return complemento;
   }

   public void setComplemento(String complemento) {
    this.complemento = complemento;
   }

}