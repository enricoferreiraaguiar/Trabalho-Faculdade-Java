/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;
import USUARIOS.User;
import java.util.ArrayList;

/**
 *
 * @author Enrico Ferreira
 */
public class EnviarDados {
private String nome;
private String email;
private int idade;
private String dataCadastro;
private String usuario;

public EnviarDados (){};

public EnviarDados (String usuario,String nome,String email,int idade,String dataCadastro){
    this.usuario = usuario;
    this.nome = nome;
    this.email = email;
    this.idade = idade;
    this.dataCadastro = dataCadastro;
}

    

 public String getDataCadastro() {
      
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   
    
    public String imprimirEnviarDados(){
       return  "------------------------" 
              +"\nUsuário: " + usuario
              +"\nNome: " + nome  
              +"\nE-mail: " + email  
              +"\nIdade: " + idade
              +"\nData de Cadastro : "+ dataCadastro;
               
    }





    
}


