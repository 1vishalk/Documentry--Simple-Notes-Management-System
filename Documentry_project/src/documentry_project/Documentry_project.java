/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentry_project;

/**
 *
 * @author HP
 */
public class Documentry_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Splash si=new Splash();
        si.setVisible(true);
        Loginform lg = new Loginform();
          try{
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                si.l2.setText(Integer.toString(i)+"%");
                si.jp.setValue(i);
                if(i==100){
                    si.setVisible(false);
                    lg.setVisible(true);
                }
            }
        }catch(Exception e){
            
        }
    }
    
}
