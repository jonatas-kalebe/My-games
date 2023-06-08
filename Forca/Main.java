package Forca;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
        int j=7; boolean v=false;String d="";
        String x = JOptionPane.showInputDialog("Escolha uma palavra");
        x=x.toLowerCase();
        for(int i=0;i<x.length();i++){
            d+="#";
        }
        while(j>0){
            v=false;
            Character g = scan.nextLine().charAt(0);
            g=Character.toLowerCase(g);
            for(int i =0; i< x.length();i++){
                if(g.equals(x.charAt(i))){
                    d=d.substring(0, i)+g+d.substring(i+1);
                    v=true;
                }
            }
            System.out.println(d);
            if(v==false){
                j--;
                System.out.println("Errado. Voce tem "+j+" vidas");
            }
            if(d.equals(x)){
                break;
            }
    
        }
        if(d.equals(x)){
            System.out.println("Parabbens voce acertou");
        }
        else{
            System.out.println("Perdeu negao");
        }
        scan.close();
    }
}
