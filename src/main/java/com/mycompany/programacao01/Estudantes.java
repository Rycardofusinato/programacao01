/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacao01;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudantes {

   private String nome;
   private Date dataNascimento;
   private String cpf;
   private char genero;
   private String matricula;
   private String email;
   private String telefoneDeContato;
   private String AnoDeIngresso;
   private String semestreDeIngresso;
   private String situacaoAcademica;
   
   public Estudantes(){
       nome = "Dimitri";
   }
   
   public int obterIdade(Date hoje){
       int idade = 0;
       //lógica de calculo de idade;
       return idade;
   }
   
   public String getNome(){
       return nome;
   }
   
   public void setNome(String _nome){
       nome = _nome;
   }
   /////////
   public Date getdataNascimento(){
       return dataNascimento;
   }
   public void setdatanascimento(Date _dataNascimento){
       dataNascimento = _dataNascimento;
   }
   /////////
   public String getcpf(){
       return cpf;
   }
   public void setcpf(String _cpf){
       cpf = _cpf;
   }
   ////////
   public char getgenero(){
       return genero;
   }
   public void setgenero(char _genero){
       genero = _genero;
   }
   ////////
   public String getmatricula(){
       return matricula;
   }
   public void setmatricula(String _matricula){
       matricula = _matricula;
   }
   //////////
   public String getemail(){
       return email;
   }
   public void setemail(String _email){
       email = _email;
   }
   /////////
   public String gettelefoneDeContato(){
       return telefoneDeContato;
   }
   public void settelefoneDeContato(String _telefoneDeContato){
      telefoneDeContato = _telefoneDeContato;
   }
   //////////
   public String getAnoDeIngresso(){
       return AnoDeIngresso;
   }
   public void setAnoDeIngresso(String _AnoDeIngresso){
       AnoDeIngresso = _AnoDeIngresso;
   }
   //////////
   public String getsemestreDeIngresso(){
       return semestreDeIngresso;
   }
   public void setsemestreDeIngresso(String  _semestreDeIngresso){
       semestreDeIngresso = _semestreDeIngresso;
   }
   /////////
   public String getsituacaoAcademica(){
       return situacaoAcademica;
   }
   public void setsituacao (String _situacaoAcademica){
       situacaoAcademica = _situacaoAcademica;
   }

}
