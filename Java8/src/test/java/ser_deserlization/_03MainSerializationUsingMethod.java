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

class _03MainSerializationUsingMethod {

	public static void main(String[] args) {
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

			private void writeObject(ObjectOutputStream oos) {
				try {
					System.out.println("Internally Write Method Called");
					oos.writeInt(this.id);
					oos.writeObject(this.name);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			private void readObject(ObjectInputStream ois) {
				try {
					System.out.println("Internally Read Method Called");
					id = ois.readInt();
					name = (String) ois.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

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
			System.out.println("De-Serialization process has started, de-serializing employee objects...");

			InputStream inputStream = new FileInputStream("ser.txt");
			ObjectInput objectInput = new ObjectInputStream(inputStream);
			try {
				System.out.println((Employee) objectInput.readObject());
				System.out.println((Employee) objectInput.readObject());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			objectInput.close();
			inputStream.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
