public class Student {
    String studentID;
    String firstName;
    String lastName;
    int booksBorrowed;

    public Student(String studentID, String firstName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.booksBorrowed = 0;
    }

    public void borrowBook(Librarian librarian, int numberOfBooks){
        //calling the librarian method lendingRequestForBook(Student, int)
        librarian.lendingRequestForBook(this, numberOfBooks);

    }
    public void returnBook(Librarian librarian, int numberOfBooks){
        librarian.returnRequestForBook(this, numberOfBooks);
    }
}