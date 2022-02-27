
    //Soal 6
    //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
    //6. add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)
import java.util.ArrayList;
    public class nomor6 {
        public static void main(String[] args) 
        {
            ArrayList<String> nama = new ArrayList<String>();
            nama.add("t");
            nama.add("a");
            nama.add("m");
            nama.add("i");
            
            nama.add(0,"e");
            System.out.println("Hasil setelah add (0,e) : " + nama);
            nama.add(2,"f");
            System.out.println("Hasil setelah add (2,f) : " + nama);
            nama.add(3,"g");
            System.out.println("Hasil setelah add (3,g) : " + nama);
            nama.add(4,"h");  
            System.out.println("Hasil setelah add (4,h) : " + nama);
            nama.add(6,"h");
            System.out.println("Hasil setelah add (6,h) : " + nama);
            nama.add(-3,"j");
            System.out.println("Hasil setelah add (-3,j) : " + nama);
        }
    } 
