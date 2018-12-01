
public abstract class Human {
	private String name;
	private int age;
	private String adress;
	private String family;

	Human(String name, int age, String adress, String family) {
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.family = family;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public abstract void action();
}
