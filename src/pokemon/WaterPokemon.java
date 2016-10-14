/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author kirukiru
 */
public class WaterPokemon extends Pokemon{
    boolean mount;//trueなら乗れるfalseなら乗れない
    public WaterPokemon(String name ,int no,String habitat,boolean m){
        super(name,no,habitat);
        mount = m;
    }
    
    public boolean getMount(){
        return mount;
    }
    
    public void naminori(){
        if(mount)
        System.out.println(getName() +"は" +  "なみのりを使った。");
        else
        System.out.println(getName() +"は" +  "なみのりを使えない");
    }
}
