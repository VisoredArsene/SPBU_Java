/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yonathan
 */
abstract class SPBU {

    public float jumlahPertalite = 10000;
    public float jumlahPertamax = 13900;
    public float jumlahPertamaxTurbo = 14950;
    public float jumlahDexlite = 6500;
    public float jumlahPertaminaDex = 19400;

    private final String jenisBBM1 = "Diesel";
    private final String jenisBBM2 = "Bensin";

    abstract void namaSPBU();

    public String getJenisBBM1() {
        return jenisBBM1;
    }

    public String getJenisBBM2() {
        return jenisBBM2;
    }

    public void ucapSalam() {
        System.out.println("Terimakasih Telah Mengisi Ulang");
    }
}

interface judulSPBU {

    public void judulSPBU();
}

class toolsSPBU extends SPBU implements judulSPBU {

    public void judulSPBU() {
        System.out.println("+-----------------------------+");
        System.out.println("          POM BENSIN");
        System.out.println("1.Pertamax Turbo");
        System.out.println("2.Pertamax");
        System.out.println("3.Pertalite");
        System.out.println("4.Dextlite");
        System.out.println("5.Pertamina Dex");
        System.out.println("+------------------------------+");
        System.out.print("Pilih Menu : ");
    }

    @Override
    void namaSPBU() {
        System.out.println("SPBU Kebon Siri");
    }
}

class motor extends SPBU {

    @Override
    public void ucapSalam() {
        System.out.println("Motor Berhasil Mengisi Ulang BBM");
    }

    public float keuntunganMotor = 0f;

    @Override
    void namaSPBU() {
        System.out.println("SPBU Kebon Siri");
    }
}

class mobil extends SPBU {

    @Override
    public void ucapSalam() {
        System.out.println("Mobil Berhasil mengisi Ulang BBM");
    }

    public float keuntunganMobil = 0f;

    @Override
    void namaSPBU() {
        System.out.println("SPBU Kebon Siri");
    }
}
