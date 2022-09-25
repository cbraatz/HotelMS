package Soporte;

public class FunctionException extends Exception {
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;


	public FunctionException(){
	    super(); // Exception default constructor
	}


	public FunctionException(String excepcionStr){
	    super(excepcionStr);
	}
}