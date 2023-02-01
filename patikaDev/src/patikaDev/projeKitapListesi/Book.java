package patikaDev.projeKitapListesi;

import java.time.LocalDateTime;
import java.util.Date;

public class Book {

	private String bookName;
	private String authorName;
	private int page;
	private Date releaseDate;
	public Book(String bookName, String authorName, int page, Date releaseDate) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.page = page;
		this.releaseDate = releaseDate;
	}
	public Book() {
		super();
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	

}
