package movieList;

public class Movie {
	
	private String Title;
	
	private String Category;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String cat) {
		Category = cat;
	}

	public void printMovie() {
		System.out.println(getTitle());
	}
	
}
