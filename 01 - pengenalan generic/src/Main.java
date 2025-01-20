/**
 - generic adalah kemampuan menambahkan parameter type saat membuat class atau method
 - berbeda dengan tipe data yang biasa kita gunakan di class di function, generic memungkinkan kita bisa mengubah-ubah bentuk tipe data sesuai yang kita mau
 */

/**
 manfaat generic

 - pengecekan ketika proses kompilasi
 - tidak perlu manual menggunakan pengecekan tipe data dan konversi tipe data
 - mwmudahkan programmer membuat kode program yang generic sehingga bisa digunakan oleh berbagai tipe data
 */

// CONTOH PENGGUAAN TANPA GENERIC

class Data{
    Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {

        Data dataString = new Data();
        dataString.setData("String");
        String result = (String) dataString.getData();

        Data dataInt = new Data();
        dataInt.setData(5);
        int reslt = (int) dataInt.getData();

        // harus dikonversi manuaalll
    }
}