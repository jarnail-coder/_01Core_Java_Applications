package errors;

import javassist.ClassPool;

//Add JVM Parameter -XX:MaxMetaspaceSize=5m
public class _02MetaSpaceOutOfMemoryError {
	static ClassPool classPool = ClassPool.getDefault();

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100000; i++) {
			// makeClass method - Creates a new class (or interface) from the
			// given class file.
			Class clas = classPool.makeClass(i + " outofmemory.OutOfMemoryErrorMetaspace ").toClass();
			// Print name of class loaded
			System.out.println(clas.getName());
		}
	}
}
