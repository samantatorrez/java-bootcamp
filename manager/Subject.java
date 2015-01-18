package manager;

/**
 * @author Samanta
 * @version 1.0 Observer Pattern
 */
public interface Subject {

	public void addObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void doNotify(String note);
}
