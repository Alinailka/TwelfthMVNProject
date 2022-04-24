package ru.netology;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException() {
        super("Один из участников не прошёл регистрацию");
    }
}
