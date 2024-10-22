package praktikum2.soal1;

class Buah {
    private String namaBuah;
    private double hargaPerUnit;
    private double beratPerUnit;
    private double beratDibeli;

    public Buah(String namaBuah, double hargaPerUnit, double beratPerUnit, double beratDibeli) {
        this.namaBuah = namaBuah;
        this.hargaPerUnit = hargaPerUnit;
        this.beratPerUnit = beratPerUnit;
        this.beratDibeli = beratDibeli;
    }

    public double hitungHargaSebelumDiskon() {
        return (beratDibeli / beratPerUnit) * hargaPerUnit;
    }

    
    public double kelipatan4() {
        double sisa = beratDibeli % 4;
        return beratDibeli - sisa;  
    }


    private double hitungDiskon() {
        double diskon = (kelipatan4() * 0.02) * hargaPerUnit;
        return diskon;
    }

    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungDiskon();
    }

    public void tampilkanInfo() {
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat per Unit: " + beratPerUnit + " kg");
        System.out.println("Harga per Unit: Rp" + hargaPerUnit);
        System.out.println("Jumlah Beli: " + beratDibeli + " kg");
        System.out.println("Harga Sebelum Diskon: Rp" + hitungHargaSebelumDiskon());
        System.out.println("Total Diskon: Rp" + hitungDiskon());
        System.out.println("Harga Setelah Diskon: Rp" + hitungHargaSetelahDiskon());
        System.out.println();
    }
}
