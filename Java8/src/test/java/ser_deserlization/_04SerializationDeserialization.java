package ser_deserlization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class _04SerializationDeserialization {

	public static void main(String[] args) {
		class Employee implements Serializable {
			private static final long serialVersionUID = 1L;
			private Integer id;
			private String name;
//			private String addedField;

			public Employee(Integer id, String name) {
				this.id = id;
				this.name = name;
			}

			@Override
			public String toString() {
				return "Employee [id=" + id + ", name=" + name + "]";
			}

		}

		Employee object1 = new Employee(1, "amy");
		Employee object2 = new Employee(2, "ankit");

		try {
			// OutputStream fout = new FileOutputStream("ser.txt");
			// ObjectOutput oout = new ObjectOutputStream(fout);
			// System.out.println("Serialization process has started,serializing
			// employee objects...");
			// oout.writeObject(object1);
			// oout.writeObject(object2);
			// fout.close();
			// oout.close();
			// System.out.println("Object Serialization completed.");

			InputStream fin = new FileInputStream("ser.txt");
			ObjectInput oin = new ObjectInputStream(fin);

			System.out.println("DeSerialization process has started,displaying employee objects...");
			Employee emp = (Employee) oin.readObject();
			System.out.println(emp);
			Employee emp1 = (Employee) oin.readObject();
			System.out.println(emp1);

			fin.close();
			oin.close();
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
	}

}
