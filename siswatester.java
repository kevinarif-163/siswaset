package Siswa;

import java.util.Scanner;

//Driver Class
public class siswatester {
    public static void main(String[] args) {
        //String-->int--->double
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("ID : ");
        int id = input.nextInt();
        System.out.println("IPK : ");
        double ipk = input.nextDouble();
        input.close();

        siswa dimas = new siswa(id, nama, ipk);
        dimas.print();




        //membuat Object
        //namaClass namaObject = newp
        siswa Nafis = new siswa();
        siswa Dimas = new siswa();
        siswa Amin = new siswa();
        siswa Rabbani = new siswa();
        siswa Ibad = new siswa();
        
        

        Nafis.setID(25);
        Nafis.setNama("Nafis");
        Nafis.setIpk(95.0);
        Dimas.setNama("Dimas");
        Dimas.setIpk(88.0);
        Dimas.setID(10);
        Amin.setNama("Amin");
        Amin.setIpk(85.0);
        Amin.setID(21);
        Rabbani.setNama("Rabbani");
        Rabbani.setIpk(89.0);
        Rabbani.setID(23);
        Ibad.setNama("Ibad");
        Ibad.setIpk(100.0);
        Ibad.setID(15);
        Nafis.print();
        System.out.println("----------");
        Dimas.print();
        System.out.println("----------");
        Amin.print();
        System.out.println("----------");
        Rabbani.print();
        System.out.println("----------");
        Ibad.print();
        System.out.println("----------");

    }
}
