public class UserService {
    
    public void processUser(String type, String name, String email) {
        // validate
        if (name == null || name.isEmpty()) {
            System.out.println("Error: name is empty");
            return;
        }
        if (email == null || !email.contains("@")) {
            System.out.println("Error: invalid email");
            return;
        }

        // save to DB
        System.out.println("Saving user to DB: " + name);

        // send notification
        if (type.equals("EMAIL")) {
            System.out.println("Sending EMAIL to: " + email);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS to: " + name);
        } else if (type.equals("PUSH")) {
            System.out.println("Sending PUSH notification to: " + name);
        }

        // log
        System.out.println("LOG: user processed - " + name);
    }
}