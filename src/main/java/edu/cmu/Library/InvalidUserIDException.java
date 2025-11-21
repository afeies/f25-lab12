package edu.cmu.Library;

public class InvalidUserIDException extends Exception {
    public InvalidUserIDException(String userID) {
        super("Invalid user ID format: " + userID + ". Expected format: libraryID:userName");
    }
}
