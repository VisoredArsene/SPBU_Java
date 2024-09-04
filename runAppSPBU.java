/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yonathan
 */
import java.util.Scanner;

public class runAppSPBU {

    static void isiBensinMotor() {
        toolsSPBU runTools = new toolsSPBU();

        motor runMotor = new motor();

        SPBU runSPBU1 = new motor();

        runTools.judulSPBU();
        Scanner input1 = new Scanner(System.in);
        int pilihMenu = input1.nextInt();
        float jumlahBayarMotor = 0f;
        float jumlahBayarCust = 0f;

        if (pilihMenu == 1) {
            System.out.println();
            System.out.println(runMotor.getJenisBBM2());

            System.out.print("Berapa Liter : ");
            float pilihLiter = input1.nextFloat();

            jumlahBayarMotor = runMotor.jumlahPertamaxTurbo * pilihLiter;
            System.out.println("Nominal Harga PertamaxTurbo : " + jumlahBayarMotor);

            System.out.print("Uang Customer : ");
            jumlahBayarCust = input1.nextFloat();

            if (jumlahBayarCust < jumlahBayarMotor) {
                System.out.println("Uang Tidak Cukup");
            }

            if (jumlahBayarCust >= jumlahBayarMotor) {
                jumlahBayarCust = jumlahBayarCust - jumlahBayarMotor;
                if (jumlahBayarCust == 0) {
                    runSPBU1.ucapSalam();
                } else if (jumlahBayarCust > 0) {
                    System.out.println();
                    System.out.println("Kembalian Sebesar : " + jumlahBayarCust);
                    runSPBU1.ucapSalam();
                }
            }
            runMotor.keuntunganMotor = (runMotor.keuntunganMotor + jumlahBayarMotor);
            System.out.println();
            System.out.println("Total Penjualan BBM Motor : " + runMotor.keuntunganMotor);

        } else if (pilihMenu == 2) {

            System.out.println(runMotor.getJenisBBM2());

            System.out.print("Berapa Liter : ");
            float pilihLiter2 = input1.nextFloat();

            jumlahBayarMotor = runMotor.jumlahPertamax * pilihLiter2;
            System.out.println("Nominal Harga Pertamax : " + jumlahBayarMotor);

            System.out.print("Uang Customer : ");
            jumlahBayarCust = input1.nextFloat();

            if (jumlahBayarCust < jumlahBayarMotor) {
                System.out.println("Uang Tidak Cukup");
            }

            if (jumlahBayarCust >= jumlahBayarMotor) {
                jumlahBayarCust = jumlahBayarCust - jumlahBayarMotor;
                if (jumlahBayarCust == 0) {
                    runSPBU1.ucapSalam();
                } else if (jumlahBayarCust > 0) {
                    System.out.println();
                    System.out.println("Kembalian Sebesar : " + jumlahBayarCust);
                    runSPBU1.ucapSalam();
                }
                runMotor.keuntunganMotor = (runMotor.keuntunganMotor + jumlahBayarMotor);
                System.out.println();
                System.out.println("Total Penjualan BBM Motor : " + runMotor.keuntunganMotor);
            }
        } else if (pilihMenu == 3) {

            System.out.println(runMotor.getJenisBBM2());

            System.out.print("Berapa Liter : ");
            float pilihLiter3 = input1.nextFloat();

            jumlahBayarMotor = runMotor.jumlahPertalite * pilihLiter3;
            System.out.println("Nominal Harga Pertalite : " + jumlahBayarMotor);

            System.out.print("Uang Customer : ");
            jumlahBayarCust = input1.nextFloat();

            if (jumlahBayarCust < jumlahBayarMotor) {
                System.out.println("Uang Tidak Cukup");
            }

            if (jumlahBayarCust >= jumlahBayarMotor) {
                jumlahBayarCust = jumlahBayarCust - jumlahBayarMotor;
                if (jumlahBayarCust == 0) {
                    runSPBU1.ucapSalam();
                } else if (jumlahBayarCust > 0) {
                    System.out.println();
                    System.out.println("Kembalian Sebesar : " + jumlahBayarCust);
                    runSPBU1.ucapSalam();
                }
                runMotor.keuntunganMotor = (runMotor.keuntunganMotor + jumlahBayarMotor);
                System.out.println();
                System.out.println("Total Penjualan BBM Motor : " + runMotor.keuntunganMotor);
            }
        } else if (pilihMenu == 4) {

            System.out.println(runMotor.getJenisBBM1());

            System.out.print("Berapa Liter : ");
            float pilihLiter4 = input1.nextFloat();

            jumlahBayarMotor = runMotor.jumlahDexlite * pilihLiter4;
            System.out.println("Nominal Harga Dexlite : " + jumlahBayarMotor);

            System.out.print("Uang Customer : ");
            jumlahBayarCust = input1.nextFloat();

            if (jumlahBayarCust < jumlahBayarMotor) {
                System.out.println("Uang Tidak Cukup");
            }

            if (jumlahBayarCust >= jumlahBayarMotor) {
                jumlahBayarCust = jumlahBayarCust - jumlahBayarMotor;
                if (jumlahBayarCust == 0) {
                    runSPBU1.ucapSalam();
                } else if (jumlahBayarCust > 0) {
                    System.out.println();
                    System.out.println("Kembalian Sebesar : " + jumlahBayarCust);
                    runSPBU1.ucapSalam();
                }
                runMotor.keuntunganMotor = (runMotor.keuntunganMotor + jumlahBayarMotor);
                System.out.println();
                System.out.println("Total Penjualan BBM Motor : " + runMotor.keuntunganMotor);
            }
        } else if (pilihMenu == 5) {

            System.out.println(runMotor.getJenisBBM1());

            System.out.print("Berapa Liter : ");
            float pilihLiter5 = input1.nextFloat();

            jumlahBayarMotor = runMotor.jumlahPertaminaDex * pilihLiter5;
            System.out.println("Nominal Harga Pertamina Dex : " + jumlahBayarMotor);

            System.out.print("Uang Customer : ");
            jumlahBayarCust = input1.nextFloat();

            if (jumlahBayarCust < jumlahBayarMotor) {
                System.out.println("Uang Tidak Cukup");
            }

            if (jumlahBayarCust >= jumlahBayarMotor) {
                jumlahBayarCust = jumlahBayarCust - jumlahBayarMotor;
                if (jumlahBayarCust == 0) {
                    runSPBU1.ucapSalam();
                } else if (jumlahBayarCust > 0) {
                    System.out.println();
                    System.out.println("Kembalian Sebesar : " + jumlahBayarCust);
                    runSPBU1.ucapSalam();
                }
                runMotor.keuntunganMotor = (runMotor.keuntunganMotor + jumlahBayarMotor);
                System.out.println();
                System.out.println("Total Penjualan BBM Motor : " + runMotor.keuntunganMotor);
            }
        }
    }

    static void isiBensinMobil() {
        toolsSPBU runTools = new toolsSPBU();

        mobil runMobil = new mobil();

        SPBU runSPBU1 = new mobil();

        runTools.judulSPBU();
        Scanner input1 = new Scanner(System.in);
        int pilihMenu = input1.nextInt();
        float jumlahBayarMobil = 0f;
        float jumlahBayarCust = 0f;

        if (pilihMenu == 1) {

            System.out.println(runMobil.getJenisBBM2());

            System.out.print("Berapa Liter : ");
            float pilihLiter = input1.nextFloat();

            jumlahBayarMobil = runMobil.jumlahPertamaxTurbo * pilihLiter;
            System.out.println("Nominal Harga PertamaxTurbo : " + jumlahBayarMobil);

            System.out.print("Uang Customer : ");
            jumlahBayarCust = input1.nextFloat();

            if (jumlahBayarCust < jumlahBayarMobil) {
                System.out.println("Uang Tidak Cukup");
            }

            if (jumlahBayarCust >= jumlahBayarMobil) {
                jumlahBayarCust = jumlahBayarCust - jumlahBayarMobil;
                if (jumlahBayarCust == 0) {
                    runSPBU1.ucapSalam();
                } else if (jumlahBayarCust > 0) {
                    System.out.println();
                    System.out.println("Kembalian Sebesar : " + jumlahBayarCust);
                    runSPBU1.ucapSalam();
                }
                runMobil.keuntunganMobil = runMobil.keuntunganMobil + jumlahBayarMobil;
                System.out.println();
                System.out.println("Total Penjualan BBM Mobil : " + runMobil.keuntunganMobil);
            }

        } else if (pilihMenu == 2) {

            System.out.println(runMobil.getJenisBBM2());

            System.out.print("Berapa Liter : ");
            float pilihLiter2 = input1.nextFloat();

            jumlahBayarMobil = runMobil.jumlahPertamax * pilihLiter2;
            System.out.println("Nominal Harga Pertamax : " + jumlahBayarMobil);

            System.out.print("Uang Customer : ");
            jumlahBayarCust = input1.nextFloat();

            if (jumlahBayarCust < jumlahBayarMobil) {
                System.out.println("Uang Tidak Cukup");
            }

            if (jumlahBayarCust >= jumlahBayarMobil) {
                jumlahBayarCust = jumlahBayarCust - jumlahBayarMobil;
                if (jumlahBayarCust == 0) {
                    runSPBU1.ucapSalam();
                } else if (jumlahBayarCust > 0) {
                    System.out.println();
                    System.out.println("Kembalian Sebesar : " + jumlahBayarCust);
                    runSPBU1.ucapSalam();
                }
                runMobil.keuntunganMobil = runMobil.keuntunganMobil + jumlahBayarMobil;
                System.out.println();
                System.out.println("Total Penjualan BBM Mobil : " + runMobil.keuntunganMobil);
            }
        } else if (pilihMenu == 3) {

            System.out.println(runMobil.getJenisBBM2());

            System.out.print("Berapa Liter : ");
            float pilihLiter3 = input1.nextFloat();

            jumlahBayarMobil = runMobil.jumlahPertalite * pilihLiter3;
            System.out.println("Nominal Harga Pertalite : " + jumlahBayarMobil);

            System.out.print("Uang Customer : ");
            jumlahBayarCust = input1.nextFloat();

            if (jumlahBayarCust < jumlahBayarMobil) {
                System.out.println("Uang Tidak Cukup");
            }

            if (jumlahBayarCust >= jumlahBayarMobil) {
                jumlahBayarCust = jumlahBayarCust - jumlahBayarMobil;
                if (jumlahBayarCust == 0) {
                    runSPBU1.ucapSalam();
                } else if (jumlahBayarCust > 0) {
                    System.out.println();
                    System.out.println("Kembalian Sebesar : " + jumlahBayarCust);
                    runSPBU1.ucapSalam();
                }
                runMobil.keuntunganMobil = runMobil.keuntunganMobil + jumlahBayarMobil;
                System.out.println();
                System.out.println("Total Penjualan BBM Mobil : " + runMobil.keuntunganMobil);
            }
        } else if (pilihMenu == 4) {

            System.out.println(runMobil.getJenisBBM1());

            System.out.print("Berapa Liter : ");
            float pilihLiter4 = input1.nextFloat();

            jumlahBayarMobil = runMobil.jumlahDexlite * pilihLiter4;
            System.out.println("Nominal Harga Dexlite : " + jumlahBayarMobil);

            System.out.print("Uang Customer : ");
            jumlahBayarCust = input1.nextFloat();

            if (jumlahBayarCust < jumlahBayarMobil) {
                System.out.println("Uang Tidak Cukup");
            }

            if (jumlahBayarCust >= jumlahBayarMobil) {
                jumlahBayarCust = jumlahBayarCust - jumlahBayarMobil;
                if (jumlahBayarCust == 0) {
                    runSPBU1.ucapSalam();
                } else if (jumlahBayarCust > 0) {
                    System.out.println();
                    System.out.println("Kembalian Sebesar : " + jumlahBayarCust);
                    runSPBU1.ucapSalam();
                }
                runMobil.keuntunganMobil = runMobil.keuntunganMobil + jumlahBayarMobil;
                System.out.println();
                System.out.println("Total Penjualan BBM Mobil : " + runMobil.keuntunganMobil);
            }
        } else if (pilihMenu == 5) {

            System.out.println(runMobil.getJenisBBM1());

            System.out.print("Berapa Liter : ");
            float pilihLiter5 = input1.nextFloat();

            jumlahBayarMobil = runMobil.jumlahPertaminaDex * pilihLiter5;
            System.out.println("Nominal Harga Pertamina Dex : " + jumlahBayarMobil);

            System.out.print("Uang Customer : ");
            jumlahBayarCust = input1.nextFloat();

            if (jumlahBayarCust < jumlahBayarMobil) {
                System.out.println("Uang Tidak Cukup");
            }

            if (jumlahBayarCust >= jumlahBayarMobil) {
                jumlahBayarCust = jumlahBayarCust - jumlahBayarMobil;
                if (jumlahBayarCust == 0) {
                    runSPBU1.ucapSalam();
                } else if (jumlahBayarCust > 0) {
                    System.out.println();
                    System.out.println("Kembalian Sebesar : " + jumlahBayarCust);
                    runSPBU1.ucapSalam();
                }
                runMobil.keuntunganMobil = runMobil.keuntunganMobil + jumlahBayarMobil;
                System.out.println();
                System.out.println("Total Penjualan BBM Mobil : " + runMobil.keuntunganMobil);
            }

        }
    }

    public static void main(String[] args) {
        String ulang = "";
        do {

            motor createSPBU = new motor();

            createSPBU.namaSPBU();

            Scanner input1 = new Scanner(System.in);
            System.out.print("Motor / Mobil : ");
            String kendaraan = input1.nextLine();

            if ("Motor".equals(kendaraan)) {
                isiBensinMotor();
            } else if ("Mobil".equals(kendaraan)) {
                isiBensinMobil();
            }
            SPBU isiUlang = new SPBU() {
                @Override
                void namaSPBU() {
                    System.out.println("Kebon Siri");
                }
            };
            System.out.println();
            isiUlang.ucapSalam();
            System.out.println();

            System.out.print("Kembali ke menu utama (y|n) : ");
            ulang = input1.nextLine();
        } while ("y".equals(ulang) || "Y".equals(ulang));
    }
}
