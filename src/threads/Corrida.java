/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daiane
 */
public class Corrida{
    
    
    public static void main(String[] args) {
        ArrayList<Carro> arrCarro = new ArrayList<Carro>();
        Carro c1 = new Carro(1);
        Carro c2 = new Carro(2);
        Carro c3 = new Carro(3);
        arrCarro.add(c1);
        arrCarro.add(c2);
        arrCarro.add(c3);
        
        ArrayList<Thread> arr = new ArrayList<Thread>();
        Thread r1 = new Thread(c1);
        Thread r2 = new Thread(c2);
        Thread r3 = new Thread(c3);

        arr.add(r1);
        arr.add(r2);
        arr.add(r3);
        arr.forEach(a -> a.start());
        arr.forEach(a -> {
            try {
                a.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ExemploThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Carro vencedor;
        vencedor = arrCarro.get(0);
        for (int i = 1; i < arrCarro.size(); i++) {
            if(vencedor.getTempo().isAfter(arrCarro.get(i).getTempo())){
                vencedor = arrCarro.get(i);
            }
                    
        }
        
        System.out.println("O vencedor é o " + vencedor.getId());
        System.out.println("Fim");
    }
     
}
