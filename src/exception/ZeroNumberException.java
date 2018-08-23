package exception;

public class ZeroNumberException extends Exception {
	private static final long serialVersionUID = 1l;

	public ZeroNumberException() {

	}
	public ZeroNumberException(String message) {
		super(message);
	}
}
