import java.util.ArrayList;

class Book{

    String title;
    String author;
    String ISBN;
    ArrayList<String> listofBook = new ArrayList<>();

    public Book(String title, String author, String ISBN){

        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle(String title){

        return title;
    }
    public String getauthor(String author){

        return author;
    }
    public String getISBN(String ISBN){

        return ISBN;
    }

    public void addBook(){

        listofBook.add(Book);
    }

    public void remveBook(){

        listofBook.remove(Book);
    }

    public ArrayList<String> collection(){

        return listofBook;
    }
}