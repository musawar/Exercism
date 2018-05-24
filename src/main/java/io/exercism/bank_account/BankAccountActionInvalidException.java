package io.exercism.bank_account;

class BankAccountActionInvalidException extends Exception {

    BankAccountActionInvalidException(String message) {
        super(message);
    }
}