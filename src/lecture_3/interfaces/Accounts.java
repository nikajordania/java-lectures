package lecture_3.interfaces;

public interface Accounts {

    default void test() {
        System.out.println("testy");
    }

    void personRegistration(String firstName, String lastName, String email, String password);

    void personLogin(String email, String password);

    void personLogout();

    void personProfile();

    void updatePersonEmail(String email);
}
