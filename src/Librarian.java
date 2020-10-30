public class Librarian {

    public void lendingRequestForBook(Student student, int numberOfBooks){
        //kontrollera att studenten har ett giltigt ID
        // om han inte har en, avslå begäran

    }
    public void lendingRequestForBook(NonStudent nonStudent, int numberOfBooks) {
    }

    public void returnRequestForBook(Student student, int numberOfBooks){
        //kontrollera att studenten har ett giltigt ID
        // om han inte har en, avslå begäran
        // få booksBorrowed värde och dra av numberOfBooks från det
    }
    public void returnRequestForBook(NonStudent nonStudent, int numberOfBooks){

    }

}