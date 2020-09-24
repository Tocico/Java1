import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        a[0] = 1234;
        for(var e: a)
            System.out.println(e);

        int[] c = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        b = c;
        for(var i: b)
        System.out.println(i);

        String[] book = {"IQ", "Javascript", "Java"};
        System.out.println(book[0]);
        System.out.println(book[book.length-1]);
        //System.out.println(Arrays.sort(book));
        System.out.println(Arrays.toString(book));
        System.out.println(book.length);

        var newBook = new String[4];
        for (int i = 0; i < book.length; i++) {
            newBook[i] = book[i];
        }
        newBook[newBook.length-1] = "New book";

        System.out.println(Arrays.toString(newBook));
    }
}
