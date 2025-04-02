package lecture_3.interfaces;

public class MobileBank implements Accounts {


    @Override
    public void personRegistration(String firstName, String lastName, String email, String password) {
        if (firstName == null || lastName == null || email == null || password == null) {
            System.out.println("Please fill in all fields");
        } else {
            System.out.println("Person registered");
        }
    }

    @Override
    public void personLogin(String email, String password) {
        if (email == null || password == null) {
            System.out.println("Please fill in all fields");
        } else {
            System.out.println("Person logged in");
        }
    }

    @Override
    public void personLogout() {

    }


    @Override
    public void personProfile() {

    }

    @Override
    public void updatePersonEmail(String email) {

    }
}
