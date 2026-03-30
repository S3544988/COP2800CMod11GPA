//InvalidBirdDataException.java
// Julio Colon
// 3/30/26
// Custom exception for invalid bird data

package edu.fscj.cop2800c.penguin; // use your project’s package

public class InvalidBirdDataException extends Exception {
    public InvalidBirdDataException(String message) {
        super(message);
    }
}
