package ru.netology;

public class NotRegisteredException extends RuntimeException{
    public NotRegisteredException(String name) {
        super("Участник с именем " + name+" не прошёл регистрацию");
    }

}
