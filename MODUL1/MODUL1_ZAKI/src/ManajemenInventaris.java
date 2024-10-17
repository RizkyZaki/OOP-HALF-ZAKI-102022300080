// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner

import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
  // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
  private ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
  private ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();
  Scanner scanner = new Scanner(System.in);
  public void tambahMakananKering() {
      
      // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
      System.out.print("Masukkan Nama Makanan: ");
      String nama = scanner.next();
      System.out.print("Masukkan Jumlah Makanan: ");
      int jumlah = scanner.nextInt();
      System.out.print("Masukkan Harga Makanan: ");
      double harga = scanner.nextDouble();
      System.out.print("Masukkan Brand: ");
      String brand = scanner.next();

      // Todo : Create a new object for MakananKering
      MakananKering makananKering = new MakananKering(nama, jumlah, harga, brand);
      makananKering.setNama(nama);
      makananKering.setJumlah(jumlah);
      makananKering.setHarga(harga);
      makananKering.setBrand(brand);
      daftarMakananKering.add(makananKering);
      
      // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
      System.out.println("Makanan kering berhasil ditambahkan");
      
  }

  public void tambahMakananBasah() {
      // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
      System.out.print("Masukkan Nama Makanan: ");
      String nama = scanner.next();
      System.out.print("Masukkan Jumlah Makanan: ");
      int jumlah = scanner.nextInt();
      System.out.print("Masukkan Harga Makanan: ");
      double harga = scanner.nextDouble();
      System.out.print("Masukkan Bahan: ");
      String bahan = scanner.next();
      // Todo : Create a new object for MakananBasah
      MakananBasah makananBasah = new MakananBasah(nama, jumlah, harga, bahan);
      makananBasah.setNama(nama);
      makananBasah.setJumlah(jumlah);
      makananBasah.setHarga(harga);
      makananBasah.setBahan(bahan);
      daftarMakananBasah.add(makananBasah);
      // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
      System.out.println("Makanan kering berhasil ditambahkan");
  }

  public void tampilkanSemuaMakanan() {
      if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
          // Todo : Create Print Notification "Tidak ada makanan disini"
          System.out.println("Tidak Ada Makanan");
      } else {
          // Todo : Create print notification for Makanan Kering  
          System.out.println("===================");
          for (MakananKering mk : daftarMakananKering) {
            mk.showData();
          }
          System.out.println("===================");
          // Todo : Create print notification for  Makanan Basah
          for(MakananBasah mb : daftarMakananBasah){
            mb.showData(); 
          }
          System.out.println("===================");
      }
  }
}