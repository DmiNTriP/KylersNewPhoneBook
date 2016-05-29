import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, NullPointerException{
        // write your code here
        BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
        HashTable table = new HashTable();
        //TODO just creating all objects to eb safe
        Employee emp = new Employee("Kyler","Callaway","kyler.cal/away", "k");
        MyLinkedList theLinkedList = new MyLinkedList(emp);

        Employee bob = new Employee("Bob","Smith","bSmith@somewhere.com","555-555-5555");
        table.addInformation(bob);
        Employee jane = new Employee("Jane","Williams","jw@somewhere.com","555-555-5555");

        table.addInformation(jane);
        Employee mohamed = new Employee("Mohamed","Ala-Sam","mas@somewhere.com","555-555-5555");

        table.addInformation(mohamed);
        Employee pat = new Employee("Pat","Jones","pjones@homesweethome.com","555-555-5555");

        table.addInformation(pat);
        Employee billy = new Employee("Billy","Kidd","billy_the_kid@nowhere.com","555-555-5555");

        table.addInformation(billy);
        Employee h = new Employee("H","Houdini","houdini@noplace.com","555-555-5555");

        table.addInformation(h);
        Employee jack = new Employee("Jack","Jones","jjones@hill.com","555-555-5555");

        table.addInformation(jack);
        Employee jill = new Employee("Jill","Jones","jillj@hill.com","555-555-5555");

        table.addInformation(jill);
        Employee john = new Employee("John","Doe","jdoe@somedomain.com","555-555-5555");

        table.addInformation(john);
        Employee janeD = new Employee("Jane","Doe","jdoe@somedomain.com","555-555-5555");

        table.addInformation(janeD);


        table.find(bob.fullName());}








        //TODO: Delete all this extra code if current class structure works properly

       /* String choice;
        // creating the user interface
        System.out.println("To add an Employee to the Address Book please input add or done into the console");
        choice = mReader.readLine();
        do {
//            if (!choice.equals("add") || !choice.equals("done")) {

                switch (choice) {
                    case "add":

                        System.out.println("Please Enter Employees first Name");
                        emp.setFirstName(mReader.readLine());
                        System.out.println("Please Enter Employees Last Name");
                        emp.setLastName(mReader.readLine());
                        String fullName = emp.fullName();
                        System.out.println("Please Enter employees email address");
                        emp.setEmail(mReader.readLine());
                        System.out.println("Please Enter employees phone number");
                        emp.setPhoneNum(mReader.readLine());
                        System.out.printf("%s %n The hashcode is: %s %n %s %n %s%n", emp.fullName(), emp.fullName().hashCode(), emp.getEmail(), emp.getPhoneNum());
                        table.addInformation(emp);
                       // table.displayTheEmployees();

                        System.out.println(emp);
                        System.out.println(table);

                        System.out.println("  Please input either 1 or 2  to add another employee or done to exit the program");
                        choice = mReader.readLine();
                        if(choice.equals("1")) {
                           choice ="add";
                        }
                        else if (choice.equals("2")) {
                            System.out.println("Please enter the name of the person you would like to searcxh for ");
                         String fn = emp.fullName(); fn = mReader.readLine();
                            table.find(fn);


                        }
                         else {
                            choice.equals("3");
                        }
                        break;


                    case "done":
                        System.out.println("Thanks for entering the employees information");
                        break;
                    default:
                        System.out.println("you got to enter something here ");
                        System.out.println("Please enter add or done into the system to exit program");
                        choice = mReader.readLine();
                        break;

                }

        } while (!choice.equals("done"));*/

    }


