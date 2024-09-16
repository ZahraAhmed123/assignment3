import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;
    private final List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void registerMember(Member member) {
        members.add(member);
    }
    public void lendBook(String isbn,int memberId){
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);
        if (book != null && member != null) {
            member.borrowedBook(book);
        } else {
            System.out.println("Invalid book iSBN or member ID.");
        }
    }

    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getisban().equals(isbn)) {
                return book;
            }

        }
        return null;
    }

    private Book findBookIsbn(String isbn) {
        for (Book book : books) {
            if (book.getisban().equals(isbn)) {
                return book;
            }

        }
        return null;
    }
    private Member findMemberById(int memberId) {
        for (Member member : members) {
            if (Integer.parseInt(member.getMemberId()) == memberId) {
                return member;

            }
        }
        return null;
    }
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Book 1", "Author 1", "ISBN 1", 5590);
        Book book2 = new Book("Book 2", "Author 2", "ISBN 2", 33000);
        library.addBook(book1);
        library.addBook(book2);
        Member member1 = new Member("Zahra",111);
        Member member2 = new Member("Ahmed",5555);
        library.registerMember(member1);
        library.registerMember(member2);

        library.lendBook("K111",730);
        library.lendBook("K222",483);
    }
}