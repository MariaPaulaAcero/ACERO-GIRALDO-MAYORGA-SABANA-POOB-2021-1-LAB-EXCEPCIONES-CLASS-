package edu.sabana.poob.sabanapayroll;

public class BankAccountException extends Exception{
    public static final String VALUE_ERROR="El valor depositado es menor al descuento del deposito";

    public BankAccountException(String message){
        super(message);
    }
}
