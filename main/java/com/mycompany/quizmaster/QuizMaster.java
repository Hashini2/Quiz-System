/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quizmaster;

/**
 *
 * @author aysha
 */
public class QuizMaster {

    public static void main(String[] args) {
       Startprg start = new Startprg();
       start.setVisible(true);
       
       try{
           
           for(int i=0;i<=100;i++){
               Thread.sleep(50);
               Startprg.jLabel1.setText(""+i);
               Startprg.jProgressBar1.setValue(i);
               if(i==100){
                   index home = new index();
                   start.setVisible(false);
                   home.setVisible(true);
               }
               
          }
       }catch(Exception e){
       }
    }
}
