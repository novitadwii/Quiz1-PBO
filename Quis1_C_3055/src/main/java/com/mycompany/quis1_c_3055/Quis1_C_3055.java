/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quis1_c_3055;

/**
 *
 * @author User
 * Novita Dwi 
 * 21103055
 * SI05C
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Quis1_C_3055 {
    public static void main(String[] args) {
    //Membuat Objek Baru
        Mahasiswa_3055 A = new Mahasiswa_3055();
        Mahasiswa_3055 B = new Mahasiswa_3055();
        Dosen_3055 C = new Dosen_3055();
        Dosen_3055 D = new Dosen_3055();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        try {
            //Mahasiswa A
            System.out.println("NIK     : ");
            A.NIK_3055 = br.readLine();
            System.out.println("Nama    : ");
            A.nama_3055 = br.readLine();
            System.out.println("Umur    : ");
            A.umur_3055 = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            A.alamat_3055 = br.readLine();
            System.out.println("NIM     : ");
            A.nim_3055 = br.readLine();
            System.out.println("IPK     : ");
            A.ipk_3055 = Float.parseFloat(br.readLine());
            System.out.println();
            
           //Mahasiswa B
            System.out.println("NIK     : ");
            B.NIK_3055 = br.readLine();
            System.out.println("Nama    : ");
            B.nama_3055 = br.readLine();
            System.out.println("Umur    : ");
            B.umur_3055 = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            B.alamat_3055 = br.readLine();
            System.out.println("NIM     : ");
            B.nim_3055 = br.readLine();
            System.out.println("IPK     : ");
            B.ipk_3055 = Float.parseFloat(br.readLine());
            System.out.println();
            
            //Dosen C
            System.out.println("NIK             : ");
            C.NIK_3055 = br.readLine();
            System.out.println("Nama            : ");
            C.nama_3055 = br.readLine();
            System.out.println("Umur            : ");
            C.umur_3055 = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            C.alamat_3055 = br.readLine();
            System.out.println("NIDN            : ");
            C.NIDN_3055 = br.readLine();
            System.out.println("Golongan        : ");
            C.gol_3055 = br.readLine();
            System.out.println("Gaji Pokok      : ");
            C.gajiPokok_3055 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            //Dosen D
            System.out.println("NIK             : ");
            D.NIK_3055 = br.readLine();
            System.out.println("Nama            : ");
            D.nama_3055 = br.readLine();
            System.out.println("Umur            : ");
            D.umur_3055 = Integer.parseInt(br.readLine()); 
            System.out.println("Alamat          : ");
            D.alamat_3055 = br.readLine();
            System.out.println("NIDN            : ");
            D.NIDN_3055 = br.readLine();
            System.out.println("Golongan        : ");
            D.gol_3055 = br.readLine();
            System.out.println("Gaji Pokok      : ");
            D.gajiPokok_3055 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("DATA MAHASISWA");
            A.tampilDataMahasiswa_3055();
            A.tampilDataBeasiswa_3055();
            System.out.println("");
            B.tampilDataMahasiswa_3055();
            B.tampilDataBeasiswa_3055();
            System.out.println("");
            
            System.out.println("DATA DOSEN");
            C.tampilDataDosen_3055();
            System.out.println("Total Pendapatan    : Rp "+C.totalPendapatan_3055());
            System.out.println("");
            D.tampilDataDosen_3055();
            System.out.println("Total Pendapatan    : Rp "+D.totalPendapatan_3055());
        }
        catch(IOException eox){
            System.out.println(eox); //berguna dalam menangkap kesalahan
        }
    }
}
