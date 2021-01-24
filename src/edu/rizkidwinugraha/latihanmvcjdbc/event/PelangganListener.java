/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkidwinugraha.latihanmvcjdbc.event;

import edu.rizkidwinugraha.latihanmvcjdbc.entity.Pelanggan;
import edu.rizkidwinugraha.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * 
 */
public interface PelangganListener {
    
    //parameter dari model pelanggan
    public void onChange(PelangganModel model);
    
    //parameter dari entity databases pelanggan
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    
    //karna tidak perlu menambahkan data ke dalam tabel,
    //jadi ondelete tidak perlu memasukkan data 
    // alias tidak perlu memakai parameter
    public void onDelete();
    
}
