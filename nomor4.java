
//Soal 4
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini :
//4. indexOf(a), indexOf(c), indexOf(q)

import java.util.ArrayList;
public class nomor4 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("t");
        nama.add("a");
        nama.add("m");
        nama.add("i");


        // indexof()
        //jika bernilai 1 maka data terdapat di dalam index array
        //jika bernilai -1 maka data tidak terdapat dalam index array
        System.out.println("index dari elemen a : " + nama.indexOf("a"));
        System.out.println("index dari elemen c : " + nama.indexOf("c"));
        System.out.println("index dari elemen q : " + nama.indexOf("q"));
        
    }
} 