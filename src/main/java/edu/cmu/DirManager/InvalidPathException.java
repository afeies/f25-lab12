package edu.cmu.DirManager;

public class InvalidPathException extends Exception {
    public InvalidPathException(String path) {
        super("Invalid path: " + path);
    }
}
