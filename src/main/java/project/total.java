/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author W I N D O W S
 */
public class total {
    private static int totalHarga = 0;
    
    void setInvoice(int harga){
        totalHarga = totalHarga + harga;
        System.out.println(totalHarga);
    }
    
    public int getInvoice(){
        System.out.println(totalHarga);
        return totalHarga;
    }
}
