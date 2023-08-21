package com.vaistra.exception;

public class ResorceAlreadyExistException extends RuntimeException{


        public ResorceAlreadyExistException() {

        }

        public ResorceAlreadyExistException(String msg) {
            super(msg);
        }
    }

