/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktekpbo25o;
import Config.ConfigDatabase;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author NUR AL BAR BASKORO
 */
public class praktekpbo25o {

    /*Koding Menjalankan Simpan Dinamis Informasi
    public static void main(String[] args) {
        try {
            ConfigDatabase config = new ConfigDatabase();

             Mengisi parameter untuk pemanggilan SimpanDinamisInformasi
            int Id_informasi = 1;
            int Id_admin = 1;
            String Tgl_informasi = "2024-14-11";
            String Informasi = "Informasi Di Sini";

            // Memanggil metode SimpanSuratDinamis
            config.SimpanDinamisInformasi(Id_informasi, Id_admin,Tgl_informasi,Informasi);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    
    //Koding Menjalankan Simpan Dinamis Pelajaran
    /*public static void main(String[] args) {
        try {
            ConfigDatabase config = new ConfigDatabase();

             //Mengisi parameter untuk pemanggilan SimpanDinamisInformasi
            String Kode_pelajaran = "1";
            String Nama_pelajaran = "Matematika";
            int Kelas = 6;
            String Keterangan = "Informasi Matematika";
            int Id_admin = 1;

            // Memanggil metode SimpanSuratDinamis
            config.SimpanDinamisPelajaran(Kode_pelajaran, Nama_pelajaran, Kelas, Keterangan, Id_admin);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    
    //Koding Menjalankan Ubah Dinamis
    /*public static void main(String[] args) {
        try {
            ConfigDatabase config = new ConfigDatabase();
            
            // Menentukan tabel, primary key, dan isi primary key
            String NamaTabel = "pelajaran";
            String PrimaryKey = "Kode_pelajaran";
            String IsiPrimary = "1";
            
            // Menentukan field dan value untuk update
            String[] Field = {"Nama_pelajaran", "Kelas", "Keterangan", "Id_admin"};
            String[] Value = {"Bahasa Inggris", "7", "Khusus kelas 7", "2"};
            
            // Memanggil metode UbahDinamis
            config.UbahDinamis(NamaTabel, PrimaryKey, IsiPrimary, Field, Value);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    
    //Koding Hapus Dinamis
    /*public static void main(String[] args) {
        try {
            ConfigDatabase config = new ConfigDatabase();
            
            // Menentukan tabel, primary key, dan isi primary key yang akan dihapus
            String NamaTabel = "pelajaran";
            String PrimaryKey = "Kode_pelajaran";
            String IsiPrimary = "1";  // Nilai primary key yang ingin dihapus
            
            // Memanggil metode HapusDinamis
            config.HapusDinamis(NamaTabel, PrimaryKey, IsiPrimary);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}