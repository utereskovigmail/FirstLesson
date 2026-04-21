import javax.xml.transform.Source;
import java.util.*;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {


        //1
//        System.out.println("enter numbers");
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        List<Integer> list = new ArrayList<>(Arrays.stream(s.split(" ")).toList().stream().map(Integer::parseInt).toList());
//
//        while(true){
//            System.out.println("enter number:\n1) add\n2) remove\n3) show\n4) check if exists\n5) replace\n 0)exit");
//            try{
//                int choice = sc.nextInt();
//                switch (choice){
//                    case 1:
//                        System.out.println("enter number to add");
//                        try{
//                            int num = sc.nextInt();
//                            list.add(num);
//                        }
//                        catch(Exception e){
//                            System.out.println("invalid input");
//                        }
//                        break;
//                    case 2:
//                        System.out.println("enter number to remove");
//                        try{
//                            int num = sc.nextInt();
//                            int index = list.indexOf(num);
//                            list.remove(index);
//                        }
//                        catch (Exception e){
//                            System.out.println("invalid input");
//                        }
//                        break;
//                    case 3:
//                        System.out.println("Showing list");
//                        System.out.println(list);
//                        break;
//                    case 4:
//                        System.out.println("enter number to check");
//                        try{
//                            int num = sc.nextInt();
//                            if(list.contains(num)){
//                                System.out.println("number exists");
//                            }
//                            else{
//                                System.out.println("number does not exist");
//                            }
//                        }
//                        catch(Exception e){
//                            System.out.println("invalid input");
//                        }
//                        break;
//                    case 5:
//                        System.out.println("enter number to replace");
//                        try{
//                            int num = sc.nextInt();
//                            System.out.println("enter new number");
//                            int newNum = sc.nextInt();
//                            list.set(list.indexOf(num), newNum);
//                        }
//                        catch(Exception e){
//                            System.out.println("invalid input");
//                        }
//                        break;
//                    case 0:
//                        return;
//
//                }
//            }
//            catch(Exception e){
//                System.out.println("invalid input");
//            }
//
//
//        }



        //2
//        List<User> users = new ArrayList<>(List.of(new User("hello", "world"), new User("hell1o", "wor1ld"), new User("hellsls", "wolsjdf")));
//        while(true) {
//            System.out.println("enter number:\n1) add\n2) remove\n3) check if exists\n4)change login\n5)change password\n 0)exit");
//            try{
//                int choice = sc.nextInt();
//                switch (choice){
//                    case 1:
//                        System.out.println("enter login");
//                        String login = sc.next();
//                        System.out.println("enter password");
//                        String password = sc.next();
//                        users.add(new User(login, password));
//                        break;
//                    case 2:
//                        System.out.println("enter login");
//                        String login2 = sc.next();
//                        users.removeIf(user -> user.getLogin().equals(login2));
//                        break;
//                    case 3:
//                        System.out.println("enter login");
//                        String login3 = sc.next();
//                        if(users.stream().anyMatch(user -> user.getLogin().equals(login3))){
//                            System.out.println("login exists");
//                        }
//                        else{
//                            System.out.println("login does not exist");
//                        }
//                        break;
//                    case 4:
//                        System.out.println("enter login");
//                        String login4 = sc.next();
//                        System.out.println("enter new login");
//                        String newLogin = sc.next();
//                        users.stream().filter(user -> user.getLogin().equals(login4)).forEach(user -> user.setLogin(newLogin));
//                        System.out.println("login changed");
//                        break;
//                    case 5:
//                        System.out.println("enter login");
//                        String login5 = sc.next();
//                        System.out.println("enter new password");
//                        String newPassword = sc.next();
//                        users.stream().filter(user -> user.getLogin().equals(login5)).forEach(user -> user.setPassword(newPassword));
//                        System.out.println("password changed");
//                        break;
//                        case 0:
//                        return;
//                }
//            }
//            catch (Exception e){
//                System.out.println("invalid input");
//            }
//        }


        //3

        Queue<Request> serverQueue = new PriorityQueue<>();

        Queue<Statistics> statsQueue = new LinkedList<>();

        serverQueue.add(new Request("User1", 1));
        serverQueue.add(new Request("VIP_User", 10));
        serverQueue.add(new Request("User2", 3));

        System.out.println("Processing starts...");

        while (!serverQueue.isEmpty()) {
            Request currentRequest = serverQueue.poll();
            System.out.println("Handling: " + currentRequest);

            statsQueue.add(new Statistics(currentRequest.user));
        }

        System.out.println("\n--- Server Statistics ---");
        statsQueue.forEach(System.out::println);
    }
}
