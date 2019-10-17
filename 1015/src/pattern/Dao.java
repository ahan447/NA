package pattern;

public class Dao {
	private Dao() {	}
	
	
	private static Dao dao;
	
	public static Dao getInstance() {
		if(dao == null) {
			dao = new Dao();
		}
		return dao;
	}
}
