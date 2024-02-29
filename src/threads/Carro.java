/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import static java.lang.Math.random;
import java.time.Instant;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daiane
 */
public class Carro implements Runnable{
    public int id;
    public Instant tempo;
    public int position;

    public Carro(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getTempo() {
        return tempo;
    }


    
    public void run(){
        Random r = new Random();
        while(position < 10){
            try{
                Thread.sleep(500 + r.nextInt(501));
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
            position++;
            System.out.println("O carro "+id+" está na posição "+position);
        }
        this.tempo = Instant.now();
////        Random r = new Random();
////        for (int i = 0; i < 10; i++) {
////            System.out.println("O carro " + id + " está nas posição: " + i);
////            try {
////                Thread.sleep(r.nextInt(500) + 500);
////            } catch (InterruptedException ex) {
////                Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
////            }
////        }
////        System.out.println(Instant.now());;;
    }

    
    
}
