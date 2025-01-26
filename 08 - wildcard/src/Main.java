/**
 - kadang ada kasus kita tidak peduli dengan generic parameter type pada object
 - misal kita hanya ingin mem-print data T, tidak peduli tipe apapun
 - jika kita menbgalami kasus seperti ini, kita bisa menggunakan wildcard
 - wildcard bisa dibuat dengan mengganti generic parameter type dengan karakter ?
 */



public class Main {

    static class  Data<T>{
        T data;
        public Data(T data) {
            this.data = data;
        }
        public T getData() {
            return data;
        }
    }


    public static void main(String[] args) {

        Read(new Data<String>("true"));
        Read(new Data<Integer>(1));
        Read(new Data<Boolean>(true));

    }

    public static void Read(Data<?> data){
        System.out.println(data.getData());
    }
}