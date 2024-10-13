import java.util.ArrayList;
import java.util.Scanner;

public class FlightBooking {
    private static ArrayList<Booking> bookings = new ArrayList<>();
    private static int bookingIdCounter = 1;

    public static void main(String[] args) {
        ArrayList<Flight> flightList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        flightList.add(new Flight("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000.0f));
        flightList.add(new Flight("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000.0f));

        while (true) {
            System.out.println("======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                displayFlightList(flightList);
            } else if (choice == 2) {
                bookTicket(flightList, scanner);
            } else if (choice == 3) {
                displayBookedTicket();
            } else if (choice == 4) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }

    private static void displayFlightList(ArrayList<Flight> flightList) {
        for (int i = 0; i < flightList.size(); i++) {
            System.out.println((i + 1) + ".");
            flightList.get(i).displayFlightDetails();
        }
    }

    private static void bookTicket(ArrayList<Flight> flightList, Scanner scanner) {
        System.out.println("\nSilakan isi data diri anda terlebih dahulu");
        System.out.println("----------------------------------------");
        System.out.print("Masukan NIK: ");
        String nik = scanner.next();
        System.out.print("Masukan Nama Depan: ");
        String firstName = scanner.next();
        System.out.print("Masukan Nama Belakang: ");
        String lastName = scanner.next();

        Passenger passenger = new Passenger(nik, firstName, lastName);

        System.out.println("\nTerima Kasih Telah Mengisi Data Pelanggan. Silakan Pilih Tiket Penerbangan Yang Tersedia");
        System.out.println("----------------------------------------");
        displayFlightList(flightList);
        System.out.print("Pilih nomor penerbangan (ex: 1): ");
        int flightIndex = scanner.nextInt() - 1;

        if (flightIndex >= 0 && flightIndex < flightList.size()) {
            Flight selectedFlight = flightList.get(flightIndex);
            
            System.out.println("Pemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
            saveBooking(passenger, selectedFlight);
        } else {
            System.out.println("Nomor penerbangan tidak valid.");
        }
    }

    private static void saveBooking(Passenger passenger, Flight flight) {
        Booking booking = new Booking(bookingIdCounter++, passenger, flight);
        bookings.add(booking);
    }

    private static void displayBookedTicket() {
        if (bookings.isEmpty()) {
            System.out.println("Pembelian Tiket Tidak Ada");
        } else {
            System.out.println("======= Detail Tiket Penerbangan =======");
            for (Booking booking : bookings) {
                System.out.println("Nomor Induk Kependudukan: " + booking.getPassenger().getNIK());
                System.out.println("Nama Depan: " + booking.getPassenger().getFirstName());
                System.out.println("Nama Belakang: " + booking.getPassenger().getLastName());
                System.out.println("Penerbangan: " + booking.getFlight().getFlightNumber());
                System.out.println("Bandara Keberangkatan: " + booking.getFlight().getDepartureAirport() + " ---> Bandara Tujuan: " + booking.getFlight().getArrivalAirport());
                System.out.println("Waktu Keberangkatan: " + booking.getFlight().getDepartureTime() + " ---> Waktu Kedatangan: " + booking.getFlight().getArrivalTime());
                System.out.println("Harga Tiket: Rp" + booking.getFlight().getTicketPrice());
                System.out.println();
            }
        }
    }

    static class Flight {
        private String flightNumber;
        private String departureAirport;
        private String arrivalAirport;
        private String departureTime;
        private String arrivalTime;
        private float ticketPrice;

        public Flight(String flightNumber, String departureAirport, String arrivalAirport,
                      String departureTime, String arrivalTime, float ticketPrice) {
            this.flightNumber = flightNumber;
            this.departureAirport = departureAirport;
            this.arrivalAirport = arrivalAirport;
            this.departureTime = departureTime;
            this.arrivalTime = arrivalTime;
            this.ticketPrice = ticketPrice;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public String getDepartureAirport() {
            return departureAirport;
        }

        public String getArrivalAirport() {
            return arrivalAirport;
        }

        public String getDepartureTime() {
            return departureTime;
        }

        public String getArrivalTime() {
            return arrivalTime;
        }

        public float getTicketPrice() {
            return ticketPrice;
        }

        public void displayFlightDetails() {
            System.out.println("Nomor Penerbangan: " + flightNumber);
            System.out.println("Bandara Keberangkatan: " + departureAirport + " ---> Bandara Tujuan: " + arrivalAirport);
            System.out.println("Waktu Keberangkatan: " + departureTime + " ---> Waktu Kedatangan: " + arrivalTime);
            System.out.println("Harga Tiket: Rp" + ticketPrice);
            System.out.println();
        }
    }

    static class Passenger {
        private String NIK;
        private String firstName;
        private String lastName;

        public Passenger(String NIK, String firstName, String lastName) {
            this.NIK = NIK;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getNIK() {
            return NIK;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

    static class Booking {
        private int bookingId;
        private Passenger passenger;
        private Flight flight;

        public Booking(int bookingId, Passenger passenger, Flight flight) {
            this.bookingId = bookingId;
            this.passenger = passenger;
            this.flight = flight;
        }

        public int getBookingId() {
            return bookingId;
        }

        public Passenger getPassenger() {
            return passenger;
        }

        public Flight getFlight() {
            return flight;
        }
    }
}
