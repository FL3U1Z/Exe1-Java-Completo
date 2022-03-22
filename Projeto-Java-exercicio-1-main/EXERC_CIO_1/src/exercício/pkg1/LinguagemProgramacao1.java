/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author flavio.barbosa
 */
public class LinguagemProgramacao1 extends Diciplina implements Pratica{
    //atributos
    private String laboratorio;
    
    //metodos
    
    public LinguagemProgramacao1(){
        
    }
    
    public void setLaboratorio(String laboratorio){
        this.laboratorio=laboratorio;
    }
    
    public String obterLaboratorio(){
        return this.laboratorio;
    }
    
    public float calculaMedia(){
        String entrada;
        float nota1;
        float nota2 = 0;
        
        entrada = JOptionPane.showInputDialog("Digite a nota 1");
        nota1 = Float.parseFloat(entrada);
        entrada = JOptionPane.showInputDialog("Digite a nota 2");
        nota1 = Float.parseFloat(entrada);
        return (nota1 + nota2)/2;
    }

    void obterLaboratorio(String lab3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
    
    
}
