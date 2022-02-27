//Soal 3
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini :
//3. get(0),get(2),get(6),get(-3)

import java.util.ArrayList;

public class nomor3 {
    public static void main(String[] args) 
    {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("t");
        nama.add("a");
        nama.add("m");
        nama.add("i");

        System.out.println(nama.get(0));
        System.out.println(nama.get(2));
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3));
    }
    }