/**
 - secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah invariant
 - invariant artinya tidak boleh di subtitusi dengan subtype(child) atau supertype(parent)
 - artinya saat kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Object>, begitupun sebaliknya, saat membuat object
 Contoh<Object>, maka tidak samam dengan Contoh<String>
 */


class Data<T>{
    T data;

    public Data(T data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {

        Data<String> dataString = new Data<>("String");

//        Data<Object> dataObject = dataString; eror

        Data<Object> dataObject = new Data<>(0);
//        Data<String> obj = dataObject;    eror


    }
}