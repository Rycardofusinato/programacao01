/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

/**
 *
 * @author aluno
 */
public class Diciplina {
    private String codigo;
    private String Nome;
    private String CargaHoraria;
    private String Ementa;
    private String ObjetivoAtividade;
    
    public String getcodigo(){
        return codigo;
    }
    public void setcodigo(String _codigo){
        codigo = _codigo;
    }
    //////////
    public String getNome(){
        return Nome;
    }
    public void setNome(String _Nome){
        Nome = _Nome;
    }
    /////////
    public String getCargahoraria(){
        return CargaHoraria;
    }
    public void setCargaHoraria(String _CargaHoraria){
        CargaHoraria = _CargaHoraria;
    }
    /////////
    public String getEmenta(){
        return Ementa;
    }
    public void setEmenta(String _Ementa){
        Ementa = _Ementa;
    }
    ///////////
    public String getObjetivoAtividade(){
        return ObjetivoAtividade;
    }
    public void setObjetivoAtividade(String _ObjetivoAtividade){
        ObjetivoAtividade = _ObjetivoAtividade;
    }
}
