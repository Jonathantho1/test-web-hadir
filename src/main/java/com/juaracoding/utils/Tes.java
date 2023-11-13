package com.juaracoding.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tes {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");

        // Menggunakan format untuk mendapatkan tanggal yang diformat
        String formattedDate = dateFormat.format(currentDate);

        // Menampilkan tanggal hari ini
        System.out.println("Tanggal hari ini: " + formattedDate);
    }

}
