/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author aluno
 */
public class Cliente {
    private String nome;
    private String emial;
    private String senha;
    private char sexo;
    private String estilodeleitura;
    private String timedefutebol;

    public Cliente(String nome, String emial, String senha, char sexo, String estilodeleitura, String timedefutebol) {
        this.nome = nome;
        this.emial = emial;
        this.senha = senha;
        this.sexo = sexo;
        this.estilodeleitura = estilodeleitura;
        this.timedefutebol = timedefutebol;
    }

    
    public Cliente() {
        
    }
    
    
    public String getNome() {
        return nome;
    }

    public String getEmial() {
        return emial;
    }

    public String getSenha() {
        return senha;
    }

    public char getSexo() {
        return sexo;
    }

    public String getEstilodeleitura() {
        return estilodeleitura;
    }

    public String getTimedefutebol() {
        return timedefutebol;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEstilodeleitura(String estilodeleitura) {
        this.estilodeleitura = estilodeleitura;
    }

    public void setTimedefutebol(String timedefutebol) {
        this.timedefutebol = timedefutebol;
    }
    
    
}
