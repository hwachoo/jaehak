package com.prod;

public class BookExample {
	public static void main(String[] args) {
		// 책(제목, 저자, 출판사, 가격)
		Book b1 = new Book();
		b1.BookName = "혼공자";
		b1.BookWriter = "신용권";
		b1.BookPublisher = "한빛미디어";
		b1.BookPrice = 24000;

		Book b2 = new Book();
		b2.BookName = "powerJava";
		b2.BookWriter = "천인국";
		b2.BookPublisher = "인피니티";
		b2.BookPrice = 35000;

		Book b3 = new Book();
		b3.BookName = "재밌는 Java";
		b3.BookWriter = "이호준";
		b3.BookPublisher = "인피니티";
		b3.BookPrice = 20000;

		Book[] books = { b1, b2, b3 };

		for (int i = 0; i < books.length; i++) {
//			if (books[i].BookPublisher == "인피니티") {
			if (books[i].BookWriter == "신용권") {
				System.out.println("============================");
				System.out.println("제목 : " + books[i].BookName);
				System.out.println("저자 : " + books[i].BookWriter);
				System.out.println("가격 : " + books[i].BookPrice);
				System.out.println("출판사 : " + books[i].BookPublisher);
				System.out.println("============================");
			}
		}
	}
}
