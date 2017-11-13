package project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class database {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("c:\\user");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		product p = new product("name", 2, 10);
		oos.writeObject(p);
	}

}
