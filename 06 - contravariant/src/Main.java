/**
 - contavariant artinya kita bisa melakukan subtitusi supertype (parent) dengan subtype (child)
 - caranya agar generic object kita menjadi contravariant adalah dengan menggunakan kata kunci (? super SubClass)
 - artinya saat kita membuat object contoh<Object>, maka bisa disubtitusi menjadi contoh<String>
 - contraavariant adakah bisa write dana read, namun perlu berhati-hati ketika melakukan read, terutama jika sampai parent-nya punya banyak child

 <? super String> -> bacanya: apapun itu yang merupakan parent dari String
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
}



public class Main {
    public static void main(String[] args) {

        Data<Object> dataObj = new Data<>("world");
        process(dataObj);
        Data<? super String> obj = dataObj;

        System.out.println(dataObj.getData());
        System.out.println(obj.getData());

    }

    public static void process(Data<? super String> data){
        data.setData("Hello");
    }
}