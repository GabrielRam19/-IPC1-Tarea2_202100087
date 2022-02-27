/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;

/**
 *
 * @author gabriel
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Usuario[] User=new Usuario[10];
User[0]= new Usuario("Gabriel","Ramirez","ingenieria",202100087);
User[1]= new Usuario("Vincent","Ross","Medicina",202012945);
Login1 login=new Login1(User);
login.setVisible(true);

    }
    
}
