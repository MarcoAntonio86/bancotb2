package com.cursoandroid.bancotb2.Model;

public class Usuario {

        private String nome;
        private  String cpf;
        private String senha;
        private String depositoInical;

        public Usuario () {}

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDepositoInical() {
        return depositoInical;
    }

    public void setDepositoInical(String depositoInical) {
        this.depositoInical = depositoInical;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Nome='" + nome +'\'' +
                ", Cpf='" + cpf + '\'' +
                ", Senha='" + senha + '\'' +
                ", DepositoInicial='" + '\'' +
                '}';

    }
}
