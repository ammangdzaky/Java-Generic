/**
 - kadang kita ingin membatasi data yang boleh digunakan di generic parameter type
 - kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang diperbolehkan
 - secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan, atau class-class turunannya
 - secara default, constraint type untuk generic parameter type adalah Object, sehingga semua tipe data bisa digunakan
 */


public class Main {
    public static void main(String[] args) {

        Waifu<String, Integer> mikasa = new Waifu("Mikasa Ackerman", 20, "Kuudere");

        // error
//        Waifu<Object, Object> sakura = new Waifu("Sakura", 20, "Beban");  -> parameter yang bisa digunkan adalah String dn turunannya, dan Number dn turunannya

        System.out.println(mikasa.getName());
        System.out.println(mikasa.getAge());
        System.out.println(mikasa.getType());

    }
}