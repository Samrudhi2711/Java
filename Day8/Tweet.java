package streamOperations;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Tweet {
	private String subject;
	private Date date;
	private int noViews;
	private Set<String> hashTags;

	@Override
	public String toString() {
		return "Tweet [subject=" + subject + ", date=" + date + ", noViews=" + noViews + ", hashTags=" + hashTags + "]";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNoViews() {
		return noViews;
	}

	public void setNoViews(int noViews) {
		this.noViews = noViews;
	}

	public Set<String> getHashTags() {
		return hashTags;
	}

	public void setHashTags(Set<String> hashTags) {
		this.hashTags = hashTags;
	}

	public Tweet(String subject, Date date, int noViews, Set<String> hashTags) {
		this.subject = subject;
		this.date = date;
		this.noViews = noViews;
		this.hashTags = hashTags;
	}
	

}
