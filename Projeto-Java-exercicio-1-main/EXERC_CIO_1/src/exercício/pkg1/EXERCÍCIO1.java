/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício.pkg1;

/**
 *
 * @author flavio.barbosa
 */
public class EXERCÍCIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinguagemProgramacao1 LP = new LinguagemProgramacao1();
        LP.setCodigo(95783);
        
        LP.setLaboratorio("Lab.3");
        
        System.out.println("Media:" + LP.calculaMedia());
        System.out.println("Laboratório:" + LP.obterLaboratorio());
    }
    
}
