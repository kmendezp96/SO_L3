/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Akka {

    public static void main(String[] args) {
        ActorSystem system=ActorSystem.create("Transacciones");
        ActorRef bankActor = system.actorOf(new Props(BankActor.class), "Transaccion1");
        ActorRef bankActor2 = system.actorOf(new Props(BankActor.class), "Transaccion2");
        Scanner sc2 = new Scanner(System.in);
        int A = sc2.nextInt();
        int B = sc2.nextInt();
        int [] arregloA= new int[A];
        int [] arregloB= new int[B];
        for (int i=0;i<A;i++){
            arregloA[i]=sc2.nextInt();
            bankActor.tell(arregloA[i],null);
        }
        for (int i=0;i<B;i++){
            arregloB[i]=sc2.nextInt();
            bankActor2.tell(arregloB[i],null);
        }
        System.out.println(BankActor.cuenta);
        system.shutdown();
        system.awaitTermination();//JOIN
    }    
}
