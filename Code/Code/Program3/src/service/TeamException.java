package service;

public class TeamException extends RuntimeException{
    static final long serialVersionUID = -70347190745766939L;
    public TeamException(){super();}
    public TeamException(String message){
        super(message);
    }
}
