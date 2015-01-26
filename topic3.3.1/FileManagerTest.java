package bootcamp33.topic3_3;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import bootcamp33.topic3_3.FileManager;

public class FileManagerTest {

	@Test
	public void test() {
		int limit = 2;
		List<File> files = new ArrayList<File>();
		FileManager fileM = new FileManager(limit);
		files = fileM.getList();
		assertEquals(files.size(), 0);

		fileM.open("aux1.txt");
	
		files = fileM.getList();
		assertEquals(files.size(), 1);

		fileM.open("aux1.txt");
		
		files = fileM.getList();
		assertEquals(files.size(), 1);

		fileM.open("aux2.txt");
	
		files = fileM.getList();
		assertEquals(files.size(), 2);
		
		//the file already exists in the list it is bumped to the top
		fileM.open("aux1.txt");
		files = fileM.getList();
		assertEquals(files.get(0).getName(), "aux1.txt" );
		
		//file is added and the recent file list is full so the oldest file is removed
		fileM.open("aux3.txt");
		files = fileM.getList();
		assertEquals(files.get(0).getName(), "aux2.txt");
		assertEquals(files.get(1).getName(), "aux3.txt");
	}
}
