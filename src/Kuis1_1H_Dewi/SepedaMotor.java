/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kuis1_1H_Dewi;

/**
 *
 * @author user
 */
public class SepedaMotor {
    public String merk;
    public boolean kontakMotor;
    public int kecepatanMotor;
    
    SepedaMotor(){

    }
    SepedaMotor(String m, int c, boolean a){
        merk = m;
        kecepatanMotor = c;
        kontakMotor = a;
    }
    
   void nyalakanMotor(boolean kontakMotor){
        kontakMotor = false;
    }
    void matikanMotor(boolean kontakMotor){
        kontakMotor = false;
    }
  void tambahKecepatan(int kecepatanMotor, int c){
        kecepatanMotor += c;
        System.out.println("Kecepatan motor setelah ditambah : " + kecepatanMotor + " km/jam");
    }
  void kurangiKecepatan(int kecepatanMotor, int c){
        kecepatanMotor -=  c;
        System.out.println("Kecepatan motor setelah dikurangi : " + kecepatanMotor + " km/jam");
    }
    void info(){
        System.out.println("Nama Sepeda Motor : " + merk);
        System.out.println("Kecepatan Sepeda Motor : " + kecepatanMotor);
        System.out.println("Kontak motor : " + kontakMotor);
    }
}
