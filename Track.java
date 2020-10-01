import java.util.Date;

public class Track {
    Integer    id;
	String	name;
	String	genre;
	Double	duration;
	String	language;
	Date	released_date;
	public Track(int id, String name, String genre, String language, Double duration, Date released_date) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.duration = duration;
		this.language = language;
		this.released_date = released_date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Date getReleased_date() {
		return released_date;
	}
	public void setReleased_date(Date released_date) {
		this.released_date = released_date;
	}
	
}
