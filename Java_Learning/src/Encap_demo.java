class Student{
	
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void seName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String Name() {
		return name;
	}
}

public class Encap_demo{
	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.setId(111);
		st.seName("Yash");
		
		System.out.println("Id: "+ st.getId() + " Name: " + st.Name());
	}
}

