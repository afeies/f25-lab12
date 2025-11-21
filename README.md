# Fall 2025 Lab 12: APIs

See the handout at https://github.com/CMU-17-214/f2025/blob/main/labs/lab12.md.


## DirManager

### Problem
Q4 is violated because the API returns integer error codes instead of throwing exceptions, allowing callers to ignore failures and causing the directory creation to silently fail.

### Solution
Define custom exception classes and throw them in place of integer error codes so the method fails fast rather than silently returing status values.

## Library

### Problem
Q4 is violated because the moethod assumes a fixe libraryID:userName string format and indexes into the split parts, causing crashes instead of failing fast with an error.

### Solution
Define and throw a InvalidUserIdException so the API fails fast and communicates exactly what went wrong instead of crashing with unclear runtime errors.