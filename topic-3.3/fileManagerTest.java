package bootcamp33.topic3_3;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import bootcamp33.topic3_3.FileManager;

public class fileManagerTest {

	@Test
	public void test() {
		fail("Not yet implemented");
		int limit = 2;
		List<File> files = new ArrayList<File>();
		FileManager fileM = new FileManager(limit);
		files = fileM.getList();
		assertEquals(files.size(), 0);

		fileM.open("C:\\Users\\Ciel\\aux1.txt");
		fileM.close();
		files = fileM.getList();
		assertEquals(files.size(), 1);

		fileM.open("C:\\Users\\Ciel\\aux1.txt");
		fileM.close();
		files = fileM.getList();
		assertEquals(files.size(), 1);

		fileM.open("C:\\Users\\Ciel\\aux2.txt");
		fileM.close();
		files = fileM.getList();
		assertEquals(files.size(), 2);

		fileM.open("C:\\Users\\Ciel\\aux3.txt");
		fileM.close();
		files = fileM.getList();
		assertEquals(files.size(), 2);
	}
}
