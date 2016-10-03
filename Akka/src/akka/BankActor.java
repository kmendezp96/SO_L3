/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akka;
import akka.actor.UntypedActor;

public class BankActor extends UntypedActor{
    static public int cuenta=0;
    
    @Override
    public void onReceive(Object message) throws Exception {
        if(message instanceof Integer) {
            int a= new Integer((int) message);
            int temp=cuenta;
            temp=temp+a;
            cuenta=temp;
            System.out.println(cuenta);        }
        else{
            //System.out.println(cuenta); 
            unhandled(message);
        }
    }    
}
