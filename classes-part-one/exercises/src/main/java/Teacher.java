public class Teacher {
    private String firstName;
    private String lastName;
    private String subject ;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
    }
    public void setFirstName(String aFirstName) {firstName = aFirstName;}
    public String getFirstName() {return firstName;}

    public void setLastName(String aLastName) {lastName = aLastName;}
    public String getLastName() {return lastName;}

    public void setSubject(String aSubject) {subject= aSubject;}
    public String getSubject() {return subject;}

    public void setYearsTeaching(int aYearsTeaching) {yearsTeaching = aYearsTeaching;}
    public int getYearsTeaching() {return yearsTeaching;}
}
