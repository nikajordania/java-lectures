package lecture_3.interfaces;

public class InternetBank implements Accounts {
    @Override
    public void personRegistration(String firstName, String lastName, String email, String password) {
        System.out.println("Person registered");
    }

    @Override
    public void personLogin(String email, String password) {

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
