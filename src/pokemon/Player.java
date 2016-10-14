/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

public class Player{
        private String name; //トレーナー名
        private int get; //入手したポケモンの数
        private String sex; //性別
        private int ball; //モンスターボールの数
    
    public Player(String name,int get,String sex,int ball){
        name = name;
        get = get;
        sex = sex;
        ball = ball;
    }
    
    public void catchGet(){
        get++;
    }
    
    public String getName(){
        return name;
    }
    
     public int getGet(){
        return get;
    }
     
      public String getSex(){
        return sex;
    }
      
     public int getBall(){
        return ball;
    }
     
    
    
    
    
}
