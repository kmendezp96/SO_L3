/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akka;

import akka.actor.UntypedActor;

/**
 *
 * @author Estudiante
 */
public class Banco extends UntypedActor{
    @Override
    public void onReceive(Object message) throws Exception {
        if(message instanceof Integer ) {
            int a= new Integer((int) message);
            String s=(String)message;
            switch (s){
                case "hello":{
                    System.out.println("hello you");
                    break;
                }
                default:
                    System.out.println("huu?");
                }
        }
        else{
            unhandled(message);
        }
    }    
    
}
