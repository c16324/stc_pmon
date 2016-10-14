/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import java.util.Scanner;
import java.util.Random;



/**
 *
 * @author kirukiru
 */
public class pokemonTester {
         static void pcatch(Player p,Pokemon a) {
             System.out.println(a.getName()+"を捕まえた！");
             p.catchGet();
             
         }
        
    public static void main(String[] args){
         Scanner stdIn = new Scanner(System.in);
         
         //String[] spown = {"a","b","c"};
         //Random rnd = new Random();
        
        Player p = new Player("サトシ",0,"男",30);
        WaterPokemon a = new WaterPokemon("ヒトデマン",121,"水中",true);
        Pokemon b = new Pokemon("ストライク",101,"草むら");
        Pokemon c = new Pokemon("タマタマ",100,"草むら");
        
        
        System.out.println("サファリパークへようこそ！");
        System.out.println("行きたい場所を選択して下さい。");
         System.out.println("1:水中 2:草むら");
        int fieldselect = stdIn.nextInt();
        
        switch(fieldselect){
            
            case 1:
                if(a instanceof WaterPokemon && a.getMount()){
                     System.out.println("なみのりを使った！");
                     System.out.println(a.getName() + "が現れた！");
                     pcatch(p,a);
                     break;
                }
                else
                    System.out.println("なみのりをつかえない");
                    break;
                    
            case 2:
                System.out.println(b.getName() + "が現れた！");
                pcatch(p,b);
        }
    }
}
