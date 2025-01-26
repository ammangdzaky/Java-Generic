/**
 - kadanga kita ingin membatasi tipe data dengan bebearpa jenis tiep data di generic parameter type
 - kita bisa menambahkan beberapa bounded type parameter dengan karakter & setelah bounded type pertama
 - tapi hanya boleh ada satu class, selebihnya interface
 */


public class MultipleBounded {

    public static interface CanBark{}

    public static abstract class Animal{}

    public static class Cat extends Animal{}

    public static class Dog extends Animal implements CanBark{}


    public class HewanNajis<T extends Animal & CanBark>{
        private T animal;

        public HewanNajis(T animal) {
            this.animal = animal;
        }

        public T getAnimal() {
            return animal;
        }
    }

    public void main(String[] args) {

        HewanNajis<Dog> anabul = new HewanNajis(new Dog());

//        HewanNajis<Cat> lampung = new HewanNajis(new Cat());   -> eror karena class cat tidak implements CanBark

    }
}
