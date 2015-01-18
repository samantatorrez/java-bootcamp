package manager;

/**
 * @author Samanta
 * @version 1.0 the manager receives an email with notifications
 */
public class marketManager implements Observer {

	@Override
	public void doUpdate(String note) {
		System.out.println("e-mail: " + note);

	}

}
