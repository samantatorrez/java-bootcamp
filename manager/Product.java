package manager;

/**
 * @author Samanta
 * @version 1.0 Strategy Pattern Incorporates setPrice function
 */
public interface Product {
	public String toString();

	public double getPrice();

	public void setPrice(double newPrice);
}
