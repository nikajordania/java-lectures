package lecture_2;

import java.util.Random;

public class Person {

    private String username;
    private String password;


    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public Person(String username, String password, boolean strongPassword) {
        this.username = username;
        this.password = password;

        if (strongPassword) {
            if (password.length() < 8
                    || !password.matches(".*\\d.*")
                    || !password.matches(".*[a-zA-Z].*")) {
                throw new IllegalArgumentException("Password must be at least 8 characters long.");
            }
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (oldPassword.equals(password)) {
            password = newPassword;
        } else {
            throw new IllegalArgumentException("You can't use old password.");
        }
    }


    public String generateNewPassword(boolean strongPassword) {
        Random random = new Random();
        StringBuilder newPassword = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        if (strongPassword) {
            characters += specialCharacters;
        }

        for (int i = 0; i < 12; i++) {
            int nextInt = random.nextInt(characters.length());

            char randomCharacter = characters.charAt(nextInt);

            newPassword.append(randomCharacter);
        }

        return password.toString();
    }
}
