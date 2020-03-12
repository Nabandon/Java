package Library.book;

public class BookList {
    private Book[] books=new Book[1024];
    private int size=0;

    public BookList() {
       books[0]=new Book("三国","罗贯中",100,"古典名著",false);
       books[1]= new Book("西游记", "吴承恩", 120, "古典名著", false);
       books[2] = new Book("金瓶梅", "兰陵笑笑生", 200, "古典名著", false);
        size = 3;
    }
    public Book getBook(int pos){
        return books[pos];
    }

    public void setBooks(int pos,Book book) {
        books[pos]=book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
