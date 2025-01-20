/**
 - generic class adalah class atau interface yang memiliki parameter type
 - tidak ada ketentuan dalam pembuatan generic parameter type, namun biasanya kebanyakan orang menggunakan 1 karakter
 sebagai generic parameter type
 */

/**
 nama generic parameter type yang biasa digunakan adalah:
 - E -> element (biasa digunakan di collection atau struktur data)
 - K -> key
 - N -> number
 - T -> type
 - V - value
 - S,U,V etc -> 2nd, 3rd, 4th types
 */

/**
 - parameter type di generic class boleh lebih dari satu
 - naum herus menggunakan nama type berbeda
 - ini sangat berguna ketika kita ingin membuat generic parameter type yang banyak
 */

class Data<T>{
    private T data;

    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class Main {
    public static void main(String[] args) {

        // CLASS DATA
        Data<String> dataString = new Data<String>("Hello");
        Data<Integer> dataInteger = new Data<>(10);
        var dataBoolean = new Data<>(true);

        System.out.println(dataString.getData());
        System.out.println(dataInteger.getData());
        System.out.println(dataBoolean.getData());



        // CLASS WAIFU
        Waifu<String, Integer> mikasa = new Waifu("Mikasa Ackerman", 20);
        System.out.println(mikasa.getName());
        System.out.println(mikasa.getAge());
    }
}