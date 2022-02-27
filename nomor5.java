//Soal 5
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini :
//5. remove(0), remove(3), remove(2)

import java.util.ArrayList;
public class nomor5
{
    public static void main(String[] args) 
    {
        ArrayList<String> nama = new ArrayList<String>();
        
        nama.add("t");
        nama.add("a");
        nama.add("m");
        nama.add("i");     
        System.out.println("ArrayList sebelum remove : ");
        for(String var: nama)
        {
              System.out.println(var);
        }
        
        nama.remove(0);
        //nama.remove(3);
        //huruf index ke-3 tidak bisa di remove karena pasa sebelumnya data pada index ke 0 sudah dihapus
        nama.remove(2);
        System.out.println("ArrayList setelah remove : ");
           for(String var: nama)
           {
                 System.out.println(var);
           }
    }
}