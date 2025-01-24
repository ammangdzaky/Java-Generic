/**
 - generic parameter type tidak hanya bisa digunakan pada class atau interface
 - kita juga bisa menggunakan generic parameter type di method
 - generic parameter type yang kita deklarasikan di method, hanya bisa diakses di method tersebut, tidak bisa digunakan di luar method
 - ini cocok jika kita ingin membuat generic method, tanpa harus mengubah deklarasi class
 */


class ArrayUtil{

    public static <T> int count(T[] array){
        return array.length;
    }
}

public class Main {
    public static void main(String[] args) {

        String[] animal = {"leon", "tiger", "dolphin"};
        Double[] decimal = {0.1, 0.2, 0.3};

        System.out.println(ArrayUtil.count(animal));
        // or
        System.out.println(ArrayUtil.<Double>count(decimal));
    }
}