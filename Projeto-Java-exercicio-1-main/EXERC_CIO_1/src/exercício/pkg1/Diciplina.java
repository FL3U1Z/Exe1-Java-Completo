/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício.pkg1;

/**
 *
 * @author flavio.barbosa
 */
    public abstract class Diciplina {
        //atributos
        private int codigo;
    
    
    //metodos
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public abstract float calculaMedia();
       
}
