package project;

public class AccessDenied extends RuntimeException{
	  public AccessDenied()
	  {
	    super();
	  }

	  public AccessDenied(String message)
	  {
	    super(message);
	  }
}
