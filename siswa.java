package Siswa;

public class siswa {
    //varibel
    private int id;
    private String nama;
    private double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    //Constructor
    public siswa() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    }
     //Construstor Parameter
     public siswa(int i, String n, double k) {
        id = i;
        nama = n;
        ipk = k;
    }

    //Getter --> untuk mengambil nilai variabel
    public int getID() {
        return id;
    }
    //Setter--> untuk mengubah nilai variabel
    public void setID(int id) {
        //variabel = parameter
        this.id = id;
    }

    //Method
    public void print() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    
}
}
