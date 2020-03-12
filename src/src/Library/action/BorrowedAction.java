package Library.action;

import Library.book.Book;
import Library.book.BookList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BorrowedAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("借书操作");
        System.out.println("借书书名:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        for(int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                if(book.isBorrowed()){
                    System.out.println("已借出");
                    continue;
                }else{
                    book.setBorrowed(true);
                    System.out.println("借书成功!");
                    return;
                }
            }
        }
        System.out.println("无匹配书籍");
    }
}
