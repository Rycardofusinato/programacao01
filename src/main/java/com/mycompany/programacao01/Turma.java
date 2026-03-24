/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

import java.util.HashSet;

/**
 *
 * @author aluno
 */
public class Turma {
    private Estudantes estudantes = new Estudantes();
    private Diciplina diciplina = new Diciplina();
    private Professor professor = new Professor();
    
   private Set<Estudantes>estudantes = new HashSet<Estudantes>();
   private Set<Profesor>professor = new HashSet<Professor>();
   private Set<Diciplina>diciplina = new HashSet<Diciplina>();
}
