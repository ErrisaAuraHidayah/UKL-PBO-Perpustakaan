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
public class buku {
    private int idBuku, stok;
    private String judulBuku;
    
    public buku(int idBuku, int stok, String judulBuku){
        this.idBuku = idBuku;
        this.stok = stok;
        this.judulBuku = judulBuku;
    }
    
    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idBuku"
    public int getIdBuku(){
        return idBuku;
    }
    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "stok"
    public int getStok(){
        return stok;
    }
     //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "judulBuku"
    public String getJudulBuku(){
        return judulBuku;
    }
    
    //method untuk mengurangi stok sejumlah 1
    public void kurangiStok(){
        this.stok--;
    }
    
}
