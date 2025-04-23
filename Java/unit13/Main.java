// unit 13 exception handling 2
// java built in exceptions (same as above)
//RETHROWING CATCHED EXCEPTION WITH IMPROVED TYPE CHECKING
//class InvalidInputException extends Exception {
//    public InvalidInputException(String message) {
//        super(message);
//    }
//}
//
//public class Main {
//    public static void processInput(int input) throws InvalidInputException {
//        try {
//            if (input < 0) {
//                throw new InvalidInputException("-ve input not allowed");
//            } else {
//                System.out.println("processing input " + input);
//            }
//        } catch (InvalidInputException e) {
//            System.out.println("caught inside processInput(): " + e.getMessage());
//            throw e;  // Rethrowing
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            processInput(-5);
//        } catch (InvalidInputException e) {
//            System.out.println("handled in main(): " + e.getMessage());
//        }
//    }
//}

//CREATING EXCEPTION SUBCLASSES
//In Java, you can create custom exceptions by extending either:
//
//Exception (for checked exceptions)
// Custom checked exception
//class AgeTooLowException extends Exception {
//    public AgeTooLowException(String message) {
//        super(message);
//    }
//}
//
//public class Main {
//    // Method that throws the custom exception
//    public static void checkAge(int age) throws AgeTooLowException {
//        if (age < 18) {
//            throw new AgeTooLowException("Age must be 18 or above to vote.");
//        }
//        System.out.println("You are eligible to vote!");
//    }
//
//    public static void main(String[] args) {
//        try {
//            checkAge(16);
//        } catch (AgeTooLowException e) {
//            System.out.println("Caught Exception: " + e.getMessage());
//        }
//    }
//}

//RuntimeException (for unchecked exceptions)
// Custom unchecked exception
//class InvalidNumberException extends RuntimeException {
//    public InvalidNumberException(String message) {
//        super(message);
//    }
//}
//
//public class Main {
//    public static void validateNumber(int number) {
//        if (number <= 0) {
//            throw new InvalidNumberException("Number must be greater than zero.");
//        }
//        System.out.println("Valid number: " + number);
//    }
//
//    public static void main(String[] args) {
//        validateNumber(-5); // Will throw exception at runtime
//    }
//}
//Because you did not catch this exception using a try-catch block in your main() method, the program crashed and exited with:

//corrected one
//class InvalidNumberException extends RuntimeException {
//    public InvalidNumberException(String message) {
//        super(message);
//    }
//}
//
//public class Main {
//    public static void validateNumber(int number) {
//        if (number <= 0) {
//            throw new InvalidNumberException("Number must be greater than zero.");
//        }
//        System.out.println("Valid number: " + number);
//    }
//
//    public static void main(String[] args){
//        try{
//            validateNumber(-5);
//        }catch (InvalidNumberException e){
//            System.out.println("caught exception"+e.getMessage());
//        }
//        System.out.println("program continues running");
//    }
//}

//CHAINED EXCEPTIONS
class ChainedExceptionExample{
    public static void main(String[] args){
        try{
            NullPointerException npe = new NullPointerException("null value found");
            throw new Exception("top level exception", npe);
        } catch (Exception e){
            System.out.println("caught exception"+e.getMessage());
            Throwable cause = e.getCause();
            if (cause !=null){
                System.out.println("caused by "+cause.getMessage());
            }

        }
    }
}








