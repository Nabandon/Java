package Library.book;

public class Book {
    private String name;
    private String author;
    private int pice;
    private String type;
    private boolean isBorrowed;

    public Book(String name, String author, int pice, String type, boolean isBorrowed) {
        this.name = name;
        this.author = author;
        this.pice = pice;
        this.type = type;
        this.isBorrowed = isBorrowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPice() {
        return pice;
    }

    public void setPice(int pice) {
        this.pice = pice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{"+"name="+name+"author="+author+"price="+pice+
                "type="+type+"isBorrowed="+isBorrowed+"}";
    }
}
