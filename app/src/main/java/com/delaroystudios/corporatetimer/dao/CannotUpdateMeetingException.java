package com.delaroystudios.corporatetimer.dao;

public class CannotUpdateMeetingException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public CannotUpdateMeetingException(String message) {
        super(message);
    }
}
