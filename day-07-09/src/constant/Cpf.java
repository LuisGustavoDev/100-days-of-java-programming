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
