public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(20, "Warnet Dewa", 140000);

        // To do: Panggillah Method Informasi dari class Komputer
        komputer.informasi();
        

        System.out.println("==================");

        // Komputer Premium dengan ruang pribadi


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet Gaming X", 7000.0f, false);


        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputerVIP.informasi();

        // To do: Panggillah Method Login
        komputerVIP.login("Asep");


        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komputerVIP.bermain(2);
        komputerVIP.bermain(2, 3);

        System.out.println("==================");


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerPremium = new KomputerPremium(5, "Warnet Gaming X", 10000.0f, false);


        // To do: Panggillah Method Informasi dari class KomputerPremium
        komputerPremium.informasi();

        // To do: Panggillah Method Pesan
        komputerPremium.pesan(14);

        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        komputerPremium.tambahLayanan("Mie Goreng");
        komputerPremium.tambahLayanan("Nasgor Mantap", "Es Teh");
       
    }
}