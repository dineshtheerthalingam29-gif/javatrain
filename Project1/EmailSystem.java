package Project1;

import java.util.*;
class Email {
    String from, to, subject, message;

    Email(String from, String to, String subject, String message) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    void display() {
        System.out.println("From    : " + from);
        System.out.println("To      : " + to);
        System.out.println("Subject : " + subject);
        System.out.println("Message : " + message);
    }
}

public class EmailSystem {
    public static void main(String[] args) {

        ArrayList<Email> inbox = new ArrayList<>();

        // Create Emails
        Email e1 = new Email(
                "dinesh@gmail.com",
                "rahul@gmail.com",
                "Meeting",
                "Meeting at 10 AM tomorrow."
        );

        Email e2 = new Email(
                "priya@gmail.com",
                "dinesh@gmail.com",
                "Project",
                "Project submission is on Friday."
        );

        // Store Emails
        inbox.add(e1);
        inbox.add(e2);

        // Display Inbox
        System.out.println("===== EMAIL INBOX =====\n");

        for (Email email : inbox) {
            email.display();
            System.out.println("----------------------------");
        }
    }
}