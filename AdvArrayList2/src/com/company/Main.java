package com.company;

        import java.util.ArrayList;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        ArrayList<String> UsernameList=new ArrayList<String>();
        ArrayList<String> PasswordList=new ArrayList<String>();
        UsernameList.add("H");
        PasswordList.add("Pete");
        while (true) {
            System.out.println("Would you like to 'Create' account or 'Login'");
            String choice = console.nextLine();
            if (choice.equalsIgnoreCase("Create account")) {
                while (true) {
                    System.out.println("Please enter a username");
                    String Username = console.nextLine();
                    int k = 0;
                    boolean usernameExist = false;
                    while (k < UsernameList.size()) {
                        if (Username.equals(UsernameList.get(k))) {
                            usernameExist = true;
                            break;
                        } else {
                            usernameExist = false;
                        }
                        k = k + 1;
                    }
                    if (usernameExist) {
                        System.out.println("Username already exist");

                    } else {
                        System.out.println("Please enter a password ");
                        String Password = console.nextLine();
                        UsernameList.add(Username);
                        PasswordList.add(Password);
                        break;
                    }
                }
            }
            else if (choice.equalsIgnoreCase("login")) {
                while (true) {
                    System.out.println("Please enter a username");
                    String Username = console.nextLine();
                    int k = 0;
                    boolean usernameExist = false;
                    while (k < UsernameList.size()) {
                        if (Username.equals(UsernameList.get(k))) {
                            usernameExist = true;
                            break;
                        }
                        else {
                            usernameExist = false;

                        }
                        k = k + 1;
                    }
                    if (usernameExist) {
                        System.out.println("Please enter a password ");
                        String Password = console.nextLine();
                        if (Password.equals(PasswordList.get(k))) {
                            System.out.println("Welcome" + Username);
                            System.exit(0);
                        }
                        else {
                            System.out.println("Sorry your password does not mathe the username");
                            break;
                        }
                    }
                    else {
                        System.out.println("Please enter a password ");
                        String Password = console.nextLine();
                        System.out.println("Sorry that account does not exist");
                        break;


                    }
                }
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}
