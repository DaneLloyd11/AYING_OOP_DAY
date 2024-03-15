/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author CTU
 */

public class Paladin extends Swordsman{
    
    boolean hasResurrected;
    
    public Paladin(){
        
        super();
        
        this. hasResurrected = false;
    }
    
   @Override
   public void receiveDamage(int damage)
    {
        if(damage % 2 == 0){
            damage /= 2;
        }
        
        super.receiveDamage(damage);
    }
    
   public void resurrect(){
   if(!hasResurrected)
   {
       setHealth(100);
   }else{
       System.out.print("Paladin has died");
   }
   }
   
}
