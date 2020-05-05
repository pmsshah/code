
public class DPJC4_Item_Demo {

	public static void main(String[] args) {
		DPJC4_Registry registry = new DPJC4_Registry();

		DPJC4_Movie movie = (DPJC4_Movie) registry.createItem("Movie");
		movie.setTitle("Beautful Moon");
		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		DPJC4_Movie movie2 = (DPJC4_Movie) registry.createItem("Movie");
		movie.setTitle("Game of Throne");
		System.out.println(movie2);
		System.out.println(movie2.getRuntime());
		System.out.println(movie2.getTitle());
		System.out.println(movie2.getUrl());
	}
}
