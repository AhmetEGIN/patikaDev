package patikaDev.projeKitapSiralama;

import java.util.Date;

public class NBook {
	
	private String bookName;
	private String authorName;
	private int page;
	private Date releaseTime;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public NBook(String bookName, String authorName,int page, Date releaseTime) {
		super();
		this.bookName = bookName;
		this.page = page;
		this.authorName = authorName;
		this.releaseTime = releaseTime;
	}
	
	
}
