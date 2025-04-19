package PostTest07.Library.Main;

import PostTest07.Library.Model.Book;
import PostTest07.Library.Model.Member;

import java.util.ArrayList;

public class LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public LibrarySystem(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addMember(Member member){
        members.add(member);
    }

    public void showBooks(){
        System.out.println("===<Buku di Perpustakaan>===");
        for (int i = 0; i < books.size(); i++){
            Book book = books.get(i);
            System.out.println("Judul buku: " + book.getTitle());
            System.out.println("Pengarang buku: " + book.getAuthor());
            System.out.println("Tahun terbit: " + book.getYearPublished());
            System.out.println("===================================");
        }
    }

    public void showMembers(){
        System.out.println("===<Anggota Perpustakaan>===");
        for (int i = 0; i < members.size(); i++){
            Member member = members.get(i);
            System.out.println("Nama: " + member.getName());
            System.out.println("ID Anggota: " + member.getMemberId());
            System.out.println("===================================");
        }
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        library.addBook(new Book("Buku", "Orang", 1551));
        library.addBook(new Book("Filosofi", "Gnaro", 1551));

        library.addMember(new Member("Budi", "123"));
        library.addMember(new Member("Idub", "321"));

        library.showBooks();
        library.showMembers();
    }
}
