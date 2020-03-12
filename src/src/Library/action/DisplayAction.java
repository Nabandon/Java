package Library.action;

import Library.book.Book;
import Library.book.BookList;

public class DisplayAction implements IAction {
    @Override
    public void work(BookList bookList) {
        for(int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBook(i);
            System.out.println(book);
        }
    }
}
