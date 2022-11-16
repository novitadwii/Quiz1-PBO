/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_c_3055;

/**
 *
 * @author User
 * Novita Dwi
 * 21103055
 * SI05C
 */
public class Dosen_3055 extends Penduduk_3055 {
    public String NIDN_3055, gol_3055;
    int gajiPokok_3055,tunjangan_3055;
    double gajitotal_3055;
    
    public double totalPendapatan_3055(){
        switch(gol_3055){
            case "IIIA":
                tunjangan_3055 = 300000;
            break;
            case "IIIB":
                tunjangan_3055 = 500000;
            break;
            case "IIIC":
                tunjangan_3055 = 700000;
            break;
        }
        gajitotal_3055 = gajiPokok_3055 + tunjangan_3055;
        return gajitotal_3055;
    }
    public void tampilDataDosen_3055(){
        tampilDataPenduduk_3055();
        System.out.println("NIDN        : "+NIDN_3055);
        System.out.println("Golongan    : "+gol_3055);
        System.out.println("Gaji Pokok  : "+gajiPokok_3055);
    }
}
