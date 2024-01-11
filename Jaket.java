public class Jaket {
    public static void main(String[] args) {
        System.out.println("Jaket Keren ");
        Jaket x = new Jaket();
        x.tampilNama();
        System.out.println(x.ukuran(95));

    }

        public void tampilNama(){
            String nama= "Ellese";
            System.out.println("Nama Jaket : " + nama);
        }
        public int ukuran (int ukuranJaket){
            int ukuran=95;
            return ukuran;
        }
    }