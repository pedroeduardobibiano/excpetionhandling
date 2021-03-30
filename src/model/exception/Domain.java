package model.exception;

public class Domain extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public Domain(String pp) {
		super(pp);
	}
}
