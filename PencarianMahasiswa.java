import java.util.Scanner;

public class PencarianMahasiswa {
    public static void main(String[] args) {
    
        String[] nim = {"20250040124", "20250040022", "20250040023", "20250040024", "20250040025"};
        String[] nama = {"Fauzan", "Siti", "Andi", "Dewi", "Bambang"};

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama mahasiswa yang dicari: ");
        String cariNama = input.nextLine();

        
        boolean ditemukan = false;
        int indeksDitemukan = -1;
        int jumlahPerbandingan = 0;

        
        for (int i = 0; i < nama.length; i++) {
            jumlahPerbandingan++; 
            
            
            if (nama[i].equalsIgnoreCase(cariNama)) {
                ditemukan = true;
                indeksDitemukan = i;
                break; 
            }
        }

        
        System.out.println("\n--- Hasil Pencarian ---");
        if (ditemukan) {
        
            System.out.println("Status          : Mahasiswa ditemukan");
            
            System.out.println("Posisi Indeks   : " + indeksDitemukan);
            System.out.println("Data Mahasiswa  : " + nim[indeksDitemukan] + " - " + nama[indeksDitemukan]);
        } else {
            System.out.println("Status          : Mahasiswa tidak ditemukan");
            System.out.println("Posisi Indeks   : -1");
        }
        
        
        System.out.println("Jumlah Iterasi  : " + jumlahPerbandingan + " kali perbandingan");
        
        input.close();
    }
}
