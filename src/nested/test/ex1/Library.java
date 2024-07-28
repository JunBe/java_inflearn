package nested.test.ex1;

public class Library {
    private Book[] maxBookNum;
    private int count = 0;
    public Library(int num) {
        maxBookNum = new Book[num];
    }

    public void addBook(String title, String author) {
        if (count < maxBookNum.length) {
            maxBookNum[count] = new Book(title, author);
            count++;
        }else{
            System.out.println("도서관 저장 공간이 부족합니다.");
        }

    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < count; i++) {
            System.out.println("도서 제목: " + maxBookNum[i].title + ", 저자: " + maxBookNum[i].author);
        }

    }

    class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

}
