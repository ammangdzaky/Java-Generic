/**
 - covariant artinya kita bisa melakukan subtitusi subtype (child) dengan supertype (parent)
 - caranya agar generic object kita menjadi covariant adalah dengan menggunakan kata kunci (? extends parent class)
 - artinya saat kita membuat object contoh<String>, maka bisa disubtitusi menjadi contoh<? extends Object>
 - covariant adalah read-only, jadi kita tidak bisa mengubah data generic-nya

 <? extends Object> -> bacanya: apapun itu yang meng-extend object (child dari object)
 */


class Data<T>{

    T data;

    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void process(Data<? extends Object> data){   // <? extends Object>  -> apapun yang meng-extends object
        System.out.println(data.getData());
//        data.setData(1);  // tidak boleh
    }
}



public class Main {
    public static void main(String[] args) {

        Data<String> dataString = new Data<>("Hello");
        Data.process(dataString);

        Data<? extends Object> object = dataString;
//        object.setData("something");  eror
    }
}