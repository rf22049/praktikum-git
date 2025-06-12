package week12.Latihan;

import java.util.Scanner;
import java.util.Arrays;

class InvalidBorrowDurationException extends Exception {
    InvalidBorrowDurationException(String message) {
        super(message);
    }
}

class InvalidBookIdException extends Exception {
    InvalidBookIdException(String message) {
        super(message);
    }
}

public class LibrarySystem {

    private static final String[] VALID_BOOK_IDS = {"B001", "B002", "B003"};

    public static void validateBookId(String bookId) throws InvalidBookIdException {
        if (!Arrays.asList(VALID_BOOK_IDS).contains(bookId)) {
            throw new InvalidBookIdException("ID buku tidak valid");
        }
    }

    public static void validateBorrowDuration(int duration) throws InvalidBorrowDurationException {
        if (duration < 1 || duration > 14) {
            throw new InvalidBorrowDurationException("Lama peminjaman harus antara 1-14 hari");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan nama: ");
            String userName = scanner.nextLine();

            System.out.print("Masukkan ID buku: ");
            String bookId = scanner.nextLine();
            validateBookId(bookId);

            System.out.print("Masukkan lama peminjaman (hari): ");
            int borrowDuration = Integer.parseInt(scanner.nextLine());
            validateBorrowDuration(borrowDuration);

            System.out.println("Peminjaman buku berhasil untuk " + userName + " dengan ID buku " + bookId + " selama " + borrowDuration + " hari");

        } catch (InvalidBookIdException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (InvalidBorrowDurationException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Exception: Input lama peminjaman tidak valid, harus angka");
        } catch (Exception e) {
            System.out.println("Exception: Terjadi kesalahan tidak terduga");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Program selesai");
        }
    }
}

