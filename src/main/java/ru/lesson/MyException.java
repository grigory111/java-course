package ru.lesson;

import org.omg.CORBA.UserException;

public class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
