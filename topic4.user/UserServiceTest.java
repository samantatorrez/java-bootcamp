package bootcamp412.topic4_user;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserServiceTest {

	@Test
	public void test() {
		// create
		// read
		Service pService = new ProxyService();
		pService.create("1@gmail", "one", "1234");
		pService.create("2@gmail", "two", "1222");
		pService.create("3@gmail", "three", "1233");
		assertEquals(pService.read("1@gmail").getName(), "one");
		assertEquals(pService.read("2@gmail").getName(), "two");
		assertEquals(pService.read("3@gmail").getName(), "three");

		// update
		pService.update("1@gmail", "eleven", "1234");
		assertEquals(pService.read("1@gmail").getName(), "eleven");

		// delete
		pService.delete("1@gmail");
		assertEquals(pService.read("1@gmail"), null);
	}

}
