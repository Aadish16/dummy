package objectcollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Movie implements Comparable<Movie>{
	private String MovieName;
	private int relYear;
	
	public Movie(String movieName, int relYear) {
		super();
		this.MovieName = movieName;
		this.relYear = relYear;
	}
	public String getMovieName() {
		return MovieName;
	}
	
	public int getRealYear() {
		return relYear;
	}
	public int compareTo (Movie o) {
		
		return this.relYear-o.relYear;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
}
public class colls {
public static void main(String[] args) {
	List<Movie> mv= new ArrayList<Movie>();
	mv.add(new Movie("MI7",2022));
	mv.add(new Movie("Andhadhun",2019));
	mv.add(new Movie("War",2020));
	
	Collections.sort(mv, new Comparator<Movie>(){
		
		public int compare(Movie o1, Movie o2) {
			return o1.movieName.compareTo(o2.movieName);
		}
	});
	
	for 
}
}
