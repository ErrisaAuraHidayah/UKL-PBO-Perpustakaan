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
public class listBuku {
    //pemberian nilai pada array "listBuku' dengan tipe class buku
    
    buku[] listBuku = {
        new buku(1, 30, "fisika"),
        new buku(2, 20, "Bahasa"),
        new buku(3, 15, "Kimia"),
    };
    
    //method untuk menampilkan data list buku
    public void viewBuku(){
        System.out.println("--- List Buku ---");
        System.out.println("ID \t Stok \t Judul");
        for(int i=0; i< listBuku.length; i++){
            System.out.println(listBuku[i].getIdBuku()+ " \t "+
                    listBuku[i].getJudulBuku() + " \t\t "+
                    listBuku[i].getStok());
        }
    }
    
    public int cariBuku(int id){
        int found =0;
        //pencarian data berdasarkan id
        for(int i=0; i < listBuku.length; i++){
            if(listBuku[i].getIdBuku() == id){
                found =i; // menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;
    }
    
    
}
