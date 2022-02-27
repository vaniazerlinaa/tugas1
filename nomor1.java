//Soal 1
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini : 1. isEmpty
public class nomor1 {

    public static void main(String[] args) {
        String[] nama = { "t", "a", "m", "i" };

    //perintah pertama
    // IsEmpty()
    //untuk mengecek tidak ada data yang kosong, jika kosong akan bernilai true
    
    System.out.println("data index ke-0 :" +nama[0].isEmpty()); 
    System.out.println("data index ke-1 :" +nama[1].isEmpty());
    System.out.println("data index ke-2 :" +nama[2].isEmpty());
    System.out.println("data index ke-3 :" +nama[3].isEmpty());

    }

}