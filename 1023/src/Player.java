
public class Player {
	private String name;
	private int age;
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Player() {
		super();
	}
	
	
	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
