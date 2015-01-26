package bootcamp33.topic3_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Class FileManager
 * 
 * 
 * Create a list of files when they are opened. If the file is in the list, it
 * is placed at the top. If the list is complete, delete the last one added and
 * add the new file.
 * 
 * @author Samanta
 *
 */
public class FileManager {
	private int limit;
	private File reader;
	private List<File> files;

	public FileManager(int limit) {
		this.limit = limit;
		this.reader = null;
		this.files = new ArrayList<File>();
	}

	public int getPosition(String name) {
		for (int i = 0; i < this.files.size(); i++) {
			if (this.files.get(i).getName().equals(name)) {
				return i;
			}
		}
		return 0;
	}

	public void open(String string)  {
		File file = new File(string);
		this.reader=file;
		if ((this.files.size() < limit) && !(this.files.contains(file))) {
			files.add(file);
		} else if (this.files.contains(file)) {
			int index = this.files.indexOf(file);
			this.files.remove(index);
			this.files.add(0, file);
		} else {
			this.files.remove(0);
			this.files.add(file);
		}
	}
	public void close(){
		this.reader=null;
	}

	public List<File> getList() {
		return this.files;
	}


}
