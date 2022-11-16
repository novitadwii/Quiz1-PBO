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
public class Mahasiswa_3055 extends Penduduk_3055 {
    String nim_3055;
    float ipk_3055;
    
    public void tampilDataMahasiswa_3055(){
        tampilDataPenduduk_3055();
        System.out.println("NIM         : "+nim_3055);
        System.out.println("IPK         : "+ipk_3055);
    }
    public void tampilDataBeasiswa_3055(){
        if(ipk_3055 > 3.5){
            System.out.println("Mahasiswa bernama "+nama_3055+" berhak mendapatkan beasiswa");
        }else{
            System.out.println("Mahasiswa bernama "+nama_3055+" tidak berhak mendapatkan beasiswa");
        }
    }
}
