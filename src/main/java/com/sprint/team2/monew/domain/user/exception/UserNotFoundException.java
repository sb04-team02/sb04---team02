package com.sprint.team2.monew.domain.user.exception;

import java.util.UUID;

public class UserNotFoundException extends UserException {
    public UserNotFoundException() {
        super(UserErrorCode.USER_NOT_FOUND);
    }

    public static UserNotFoundException withId(UUID userId) {
        UserNotFoundException exception = new UserNotFoundException();
        exception.addDetail("userId", userId);
        return exception;
    }
}
