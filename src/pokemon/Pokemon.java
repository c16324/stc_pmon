/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author c16324
 */
public class Pokemon{
        private String name; //ポケモン名
        private int num; //図鑑No
        private String habitat; //生息地
    
    public Pokemon(String n,int no,String habi){
        name =n;
        num = no;
        habitat =habi;
    }

    public String getName(){
       return name;
    }

    public int getNo(){
       return num;
    }

    public String getHabitat(){
       return habitat;
    }
}