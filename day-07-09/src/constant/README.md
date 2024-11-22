# CPF, Login, and Math Utilities in Java

This project demonstrates a Java application with CPF validation, password verification, and mathematical utilities. It focuses on using constants (`static final`) and static methods to improve code clarity and maintainability. The classes are designed to utilize these constants, ensuring that fixed values are centralized and easily updated when necessary.

## Project Structure

- **Cpf**: Validates CPF attributes using constants to represent position indices.

- **Login**: Verifies if the password meets the minimum length requirement.

- **Math**: Calculates the area of a circle using a constant for Pi.

- **MathConst**: Contains static constants for mathematical values.

### Cpf

The **Cpf** class is designed to validate CPF strings by extracting information about the region and verification digits. Constants are used to represent the positions of these attributes in the string, making the code more readable and easier to maintain. The use of constants ensures that if the logic needs to change, the fixed values are updated in a single location, avoiding errors in multiple parts of the code.

```java
package constant;

public class Cpf {

    private static final int CPF_REGION_INDEX = 8;
    private static final int FIRST_VERIFIER_INDEX = 9;
    private static final int SECOND_VERIFIER_INDEX = 10;

    public void validate(String cpf) {
        // ABCDEFGHIJK
        // A-H: an identifier issued by the federal revenue agency
        // I (8): the region where the CPF was issued
        // J (9): verification digits
        // K (10): verification digits
        int region = cpf.charAt(CPF_REGION_INDEX);
        int firstCheckDigit = cpf.charAt(FIRST_VERIFIER_INDEX);
        int secondCheckDigit = cpf.charAt(SECOND_VERIFIER_INDEX);
    }
}
```