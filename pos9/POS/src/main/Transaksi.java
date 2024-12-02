package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaksi {
        // Fungsi untuk menyimpan transaksi ke database
        public static void saveTransaksi(String namaProduk, int jumlah, int subtotal, int total, int bayar, int kembalian) {
            String sql = "INSERT INTO transaksi (tanggal_transaksi, nama_produk, jumlah, subtotal, total, bayar, kembalian) " + "VALUES (CURRENT_DATE, ?, ?, ?, ?, ?, ?)";
        
            try (Connection k = Koneksi.conn();
                PreparedStatement pst = k.prepareStatement(sql)) {
             
                // Set parameter untuk prepared statement
                pst.setString(1, namaProduk);  // Nama produk
                pst.setInt(2, jumlah);         // Jumlah produk
                pst.setInt(3, subtotal);       // Subtotal
                pst.setInt(4, total);          // Total harga
                pst.setInt(5, bayar);          // Jumlah bayar
                pst.setInt(6, kembalian);      // Kembalian

                // Eksekusi perintah insert
                pst.executeUpdate();
                System.out.println("Transaksi berhasil disimpan.");
            } catch (SQLException e) {
                System.out.println("Terjadi kesalahan saat menyimpan transaksi: " + e.getMessage());
            }
        } 
    
}
