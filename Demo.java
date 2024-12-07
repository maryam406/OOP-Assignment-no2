import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Server server = new Server();
        Sender send = new Sender();
        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean running = true;
        do {
            System.out.println("Menu");
            System.out.println("1.Add to Contacts");
            System.out.println("2.Display Contacts");
            System.out.println("3.Delete a contact");
            System.out.println("4.Send message");
            System.out.println("5.Displaying Sendmessages");
            System.out.println("6.Displaying Recieved messages");
            System.out.println("7.Display all messages");
            System.out.println("8.Display messages in arranged way ");
            System.out.println("9.Delete your message");
            System.out.println("10.Exit the program");
            System.out.println("Enter your choice");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("You selected to add to contacts.");
                    send.addcontacts();
                    break;
                case "2":
                    System.out.println("You selected to display contacts.");
                    send.displaycontacts();
                    break;

                case "3":
                    System.out.println("You selected to delete contacts.");
                    send.deletecontact();
                    break;
                case "4":
                    System.out.println("Sending message");
                    server.setupcommunication();
                    server.sendmessage();
                    break;
                case "5":
                    System.out.println("Displaying messages send by u ");
                    server.Displaymessagessend();
                    break;

                case "6":
                    System.out.println("Printing messages recieved by u");
                    server.Displayrecievemessages();
                    break;
                case "7":
                    System.out.println("You have selected to display all messages");
                    server.DisplayAllmessages();
                    break;
                case"8":
                    System.out.println("You have selected to display the messages in a sorted way");
                    server.arraysort();
                    break;
                case "9":
                    System.out.println("You selected to delete message");
                    server.deletemessage();
                    break;

                case "10":
                    System.out.println("Exiting the program");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please select a number between 1 and 12.");
            }

        } while (running);
        scanner.close();
    }

}

