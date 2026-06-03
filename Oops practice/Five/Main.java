class Main{

    public static void main(String args[]){

        Book bkobj = new Book("crime", "koley", "new");
        bkobj.addBook();
        Book bkobj1 = new Book("comedy", "temba", "old");
        bkobj1.addBook();
        Book bkobj2 = new Book("Thriller", "Ghosh", "New");
        bkobj2.addBook();
        bkobj1.remove();

        ArrayList<String> bookcollection = bkobj.collection();

        for(String book: bookcollection){

            System.out.println("Title:" + bkobj.getTitle + "Author" + bkobj.getauthor + "ISBN:" + bkobj.getISBN);
        }

    }
}