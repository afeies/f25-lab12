package edu.cmu.DirManager;

public class DirectoryExistsException extends Exception {
    public DirectoryExistsException(String path) {
        super("Directory already exists: " + path);
    }
}