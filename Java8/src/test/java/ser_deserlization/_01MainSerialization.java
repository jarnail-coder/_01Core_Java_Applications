package ser_deserlization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class _01MainSerialization {

	public static void main(String[] args) {

		Employee object1 = new Employee(1, "amy");
		Employee object2 = new Employee(2, "ankit");

		try {
			OutputStream fout = new FileOutputStream("ser.txt");
			ObjectOutput oout = new ObjectOutputStream(fout);
			System.out.println("Serialization process has started, serializing employee objects...");
			oout.writeObject(object1);
			oout.writeObject(object2);
			fout.close();
			oout.close();
			System.out.println("Object Serialization completed.");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}

class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String addedField;

	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
