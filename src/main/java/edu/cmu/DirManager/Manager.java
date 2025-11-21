package edu.cmu.DirManager;

public class Manager {
    private DirOps dirOps;
    
    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     *
     * @throws DirectoryExistsException if a directory already exists at the given path
     * @throws InvalidPathException if the provided path is not syntactically valid
     */
    public void newDirectory(String path) throws DirectoryExistsException, InvalidPathException {
        if (dirOps.checkDirectoryExists(path)) {
            throw new DirectoryExistsException(path);
        }
        if (!dirOps.checkPathValid(path)) {
            throw new InvalidPathException(path);
        }
        dirOps.createDirectory(path);
    }
}