class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;
    
    // To do: Buatlah constructor pada class Komputer
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam){
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }
    
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan
    public void informasi(){
        System.out.println("Informasi Komputer");
        System.out.print("Jumlah Komputer :");
        System.out.println(jumlahKomputer);
        System.out.print("Nama Warnet :");
        System.out.println(namaWarnet);
        System.out.print("Harga Per Jam :");
        System.out.println(hargaPerJam);
    } 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

}