/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

/**
 *
 * @author aluno
 */
public class Professor {
    private String nomeProfessor;
    private String Siape;
    private String Email;
    private String Telefone;
    private String Titulacao;
    private String AreaDeAtuacao;
    private String RegimeTrabalho;
    private String AnoIngreso;
    private String Formacao;
          
   public Professor(){
       nomeProfessor = "Nobody";
   }
   public String getnomeProfessor(){
       return nomeProfessor;
   }
   public void setnomeProfessor(String _nomeProfessor){
       nomeProfessor = _nomeProfessor;
   }
   ///////////
   public String getSiape(){
       return Siape;
   }
   public void setSiape(String _Siape){
       Siape = _Siape;
   }
   //////////
   public String getEmail(){
       return Email;
   }
   public void setEmail(String _Email){
       Email = _Email;
   }
   //////////
   public String getTelefone(){
       return Telefone;
   }
   public void setTelefone(String _Telefone){
       Telefone = _Telefone;
   }
   ////////////
   public String getTitulacao(){
       return Titulacao;
   }
   public void setTitulacao(String _Titulacao){
       Titulacao = _Titulacao;
   }
   /////////////
   public String getAreaDeAtuacao(){
       return AreaDeAtuacao;
   }
   public void setAreaDeAtuacao(String _AreaDeAtuacao){
       AreaDeAtuacao = _AreaDeAtuacao;
   }
   ////////////
   public String getRegimeTrabalho(){
       return RegimeTrabalho;
   }
   public void setRegimeTrabalho(String _RegimeTrabalho){
     RegimeTrabalho = _RegimeTrabalho;
   }
   ////////////
    public String getAnoIngresso(){
       return AnoIngreso;
   }
   public void setAnoIngresso(String _AnoIngresso){
     AnoIngreso = _AnoIngresso;
   }
   /////////////
    public String getFormacao(){
       return Formacao;
   }
   public void setFormacao(String _Formacao){
     Formacao = _Formacao;
   }
}
