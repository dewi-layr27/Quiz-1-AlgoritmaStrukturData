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
public class SepedaMotorMain {
    public static void main(String[] args) {
        SepedaMotor spd = new SepedaMotor();
        spd.merk = "Honda";
        spd.kecepatanMotor = 80;
        spd.kontakMotor = true;
        spd.info();
        spd.nyalakanMotor(true);
        spd.matikanMotor(true);
        spd.tambahKecepatan(80, 5);
        spd.kurangiKecepatan(80, 5);
        System.out.println("");
        
        spd.merk = "Yamaha";
        spd.kecepatanMotor = 70;
        spd.kontakMotor = false;
        spd.info();
        spd.nyalakanMotor(false);
        spd.matikanMotor(false);
        spd.tambahKecepatan(70, 5);
        spd.kurangiKecepatan(70, 5);
        System.out.println("");
        
        spd.merk = "Ducati";
        spd.kecepatanMotor = 65;
        spd.kontakMotor = true;
        spd.info();
        spd.nyalakanMotor(true);
        spd.matikanMotor(true);
        spd.tambahKecepatan(65, 5);
        spd.kurangiKecepatan(65, 5);
        System.out.println("");
        
        spd.merk = "Suzuki";
        spd.kecepatanMotor = 60;
        spd.kontakMotor = false;
        spd.info();
        spd.nyalakanMotor(false);
        spd.matikanMotor(false);
        spd.tambahKecepatan(60, 5);
        spd.kurangiKecepatan(60, 5);
        
    }
}
