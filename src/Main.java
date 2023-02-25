public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Aytmatov","@Aytmatov",'M');
        Author author2 = new Author("Dostoevdkiy","@Dostoevdkiy",'M');
        Author author3 = new Author("Tolstoy","@Tolstoy",'M');
        
        
        Book book1 = new Book ("Belyi parohod",author1,500.0,50);
        Book book2 = new Book ("Besy",author2,600.0,35);
        Book book3 = new Book ("Voskresenie",author3,400.0,41);

        Author[] authors ={author1,author2,author3};
        for (Author author:authors) {
            System.out.println(author);

        }
        System.out.println();
        Book[] books ={book1,book2,book3};
        for (Book book:books) {
            System.out.println(book);

        }
        
        
    }
}