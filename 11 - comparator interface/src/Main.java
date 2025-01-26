import java.util.Arrays;
import java.util.Comparator;

/**
 - jika kita ingin mengurutkan class yang kita gunakan, cukup mudah tinggal implement interface Comparable
 - namun bagaimana jika class tersebut milik orang lain? tidak bisa diubah source kodenya?
 - maka kita bisa mengguanakn interface generic bernama comparator
 */



public class Main {
    public static void main(String[] args) {

        // compaarator satu satu
        Comparator<Person> comparatorAge = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        };

        Person suki = new Person("suki", 12);
        Person sule = new Person("sule", 13);

        var result = comparatorAge.compare(suki, sule);
        System.out.println(result);

        // mengurutkan item di array menggunakan comperator

        Comparator<Person> comparatorArray = new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Person[] people = {
                new Person("cuki", 19),
                new Person("asep", 22),
                new Person("bima", 14)
        };

        Arrays.sort(people, comparatorArray);
        System.out.println(Arrays.toString(people));


    }
}