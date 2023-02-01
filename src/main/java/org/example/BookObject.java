package org.example;

public class BookObject {
    private String bookTitle;
    private String bookAuthor;
    private String bookGenre;

    private int indexNumber;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int setIndexNumber(){
        //TODO Add Tests to this section
        String letterList1 = "ABCDEFGH";
        String letterList2 = "IJKLMNOP";
        String letterList3 = "QRSTUVWXYZ";

        int indexNumber = 0;
        String currentTitle = this.getBookTitle().toUpperCase();
        for(char letter: currentTitle.toUpperCase().toCharArray()){
            if(letterList1.indexOf(letter) != -1){
                indexNumber++;
            }else if(letterList2.indexOf(letter) != -1){
                indexNumber = indexNumber+2;
            }else if(letterList3.indexOf(letter) != -1) {
                indexNumber = indexNumber + 3;
            }else {
                indexNumber = indexNumber + 4;
            }
        }
        this.indexNumber = indexNumber;
        return  indexNumber;
    }
    public int getIndexNumber(){return indexNumber;}


}
