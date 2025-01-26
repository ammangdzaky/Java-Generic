/**
 - type erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan penngecekan pada saat runtime
 - type erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita telah di compile menjadi binary file
 - compiler akan mengubah generic parameter type menjadi tipe Object di java
 */


public class Main {

    static class Data<T>{
        T data;
        public Data(T data) {this.data = data;}
        public T getData() {return data;}
    }

    public static void main(String[] args) {

        Data string = new Data("String");
        Data<Integer> integer = (Data<Integer>) string;
        Integer number = integer.getData();
        // kode diatas tidak ada tanda merah merah kan yg artinya tidak ada yg salah saat kompilasi,
        // tapi coba cek saaat runtime, maka akan menyebabkan eror


        // inilah kode yang aman
        Data<String> dataString = new Data("String");
        Data<Integer> dataInteger = (Data<Integer>) dataString;
        // setidaknya kita sudah diberitahu saat kompilasi bahwa ini kodenya eror
    }
}