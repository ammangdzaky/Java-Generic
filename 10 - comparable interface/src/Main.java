import java.util.Arrays;

/**
 - sebelumnya kita sudah tahu bahwa operator perbandingan object menggunakan method equals
 - bagaimana dengan operator perbandingan lainnya? Seperti kurang lebih atau lebih dari?
 - operator perbandingan tersebut bisa kita lakukan, jika object kita mewariskan interface generic Comparable
 - ini banyak sekali digunakan seperti untuk proses pengurutan data misalnya

 -1 : lebih kecil, 0 : sama dengan, +1 : lebih besar
 */



public class Main {
    public static void main(String[] args) {

        Person a = new Person("a", 20);
        Person b = new Person("b", 10);

        System.out.println(a.compareTo(b));


        Person[] people = {
                new Person("cuki", 19),
                new Person("asep", 12),
                new Person("bima", 14)
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}