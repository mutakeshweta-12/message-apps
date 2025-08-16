package com.ma.message_apps.enumDto;

public enum FriendStatus {

    PENDING("Pending"),
    ACCEPTED("Accepted"),
    Rejected("Rejected");
    private final String status;
    FriendStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return  status;
    }
}
