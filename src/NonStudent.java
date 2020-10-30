public class NonStudent {
    String personNumber;
    String firstName;
    String lastName;
    int bookBorrowed;

    public NonStudent(String personNumber, String firstName, String lastName) {
        this.personNumber = personNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookBorrowed = 0;
    }

    public void borrowBook(Librarian librarian, int numberOfBooks){
        //calling the librarian method lendingRequestForBook(Student, int)
        librarian.lendingRequestForBook(this, numberOfBooks);


    }
    public void returnBook(Librarian librarian, int numberOfBooks){
        librarian.returnRequestForBook(this, numberOfBooks);

    }
}