/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.perpus1;

/**
 *
 * @author erisa
 */
public class listSiswa {
    
    //pemberian nilai pada array "listSiswa" dengan tipe class siswa
    siswa[] listSiswa = {
        new siswa(1, "Peter", "London", "0341", true),
        new siswa(2, "Johny", "Madrid", "0341", true),
        new siswa(3, "Maria", "Malang", "0341", true),
    };
    
    //method untuk menampilkan data list siswa
    public void viewSiswa(){
        System.out.println("--- List Siswa ---");
        System.out.println("ID \t Nama \t\t Alamat \t\t Status");
        
        for(int i=0; i<listSiswa.length; i++){
            System.out.println(listSiswa[i].getidSiswa() + " \t" +
                    listSiswa[i].getNama()+ " \t\t " +
                    listSiswa[i].getAlamat()+ " \t\t " +
                    listSiswa[1].getStatus());
        }    
    }
    
    public int cariSiswa(int id){
        int found =0;
        
        //pencarian data berdasarkan id
        for(int i=0; i< listSiswa.length; i++){
           if(listSiswa[i].getidSiswa() == id){
               found = i; //menyimpan nilai index dari data yang ditemukan
           }
        }
        return found;
    }
    
}
