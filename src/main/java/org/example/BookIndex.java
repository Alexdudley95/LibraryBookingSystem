package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class BookIndex {

    public static int pushBookInfo(HashMap<Integer, BookObject> bookingInfo, String titleInput, String authorInput, String genreInput){
        BookObject newBook = new BookObject();
        newBook.setBookTitle(titleInput);
        newBook.setBookAuthor(authorInput);
        newBook.setBookGenre(genreInput);
        //TODO add hashmap to setIndexNumber so it can check if the index number is already in use and generate a new one
        newBook.setIndexNumber();
        System.out.println("The books index number is: " + newBook.getIndexNumber());
        // Main.startState(bookingInfo);
        return newBook.getIndexNumber();
    }

    public static String indexLookUp (HashMap<Integer, BookObject> bookingInfo){
        System.out.println("Search via index number: ");
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        BookObject bookLookUp = bookingInfo.get(inputNum);

        return (bookLookUp.getIndexNumber()+ ": The book is" + bookLookUp.getBookTitle() + " By " + bookLookUp.getBookAuthor() + " and the genre is " + bookLookUp.getBookGenre());
    }
}
