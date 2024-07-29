public class App {
    public static void main(String[] args) {

        Author hemingway = new Author("Ernest", "Hemingway");
        Author dostoevsky = new Author("Fyodor", "Dostoevsky");

        Book theOldManAndTheSea = new Book("The Old Man and the Sea", hemingway, 1952);

        Book theIdiot = new Book("The Idiot", dostoevsky, 1868);

        theIdiot.setYear(1869);

        System.out.println(theOldManAndTheSea.getName() + ", " + theOldManAndTheSea.getAuthor() + ", " + theOldManAndTheSea.getYear());
        System.out.println(theIdiot.getName() + ", " + theIdiot.getAuthor() + ", " + theIdiot.getYear());
        System.out.println();
    }
}
