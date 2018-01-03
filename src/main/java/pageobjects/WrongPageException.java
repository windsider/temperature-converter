package pageobjects;

/**
 * Created by ruvzherdev on 1/3/2018.
 */
public class WrongPageException extends RuntimeException{
    public WrongPageException(String message){
        super(message);
    }
}
