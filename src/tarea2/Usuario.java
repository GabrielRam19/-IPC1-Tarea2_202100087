/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author gabriel
 */
public class Usuario {
    String Nombre;
    String Apellido;
    String Pass;
    int Carnet;
    Usuario(String Nombre, String Apellido,String Pass, int Carnet){
    this.Nombre=Nombre;
    this.Apellido=Apellido;
    this.Pass=Pass;
    this.Carnet=Carnet;
    
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCarnet() {
        return Carnet;
    }

    public void setCarnet(int Carnet) {
        this.Carnet = Carnet;
    }
}
