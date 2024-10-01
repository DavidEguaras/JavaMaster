package exercises.CLIproject.User;

public class UserDAO {

    public static User[] users = new User[500];
    public static int userCount = 0;

    public boolean addUser (User user){
        if(userCount < users.length){
            users[userCount] = user;
            userCount++;
            return true;
        }else{
            System.out.println("The user array is full");
            return false;
        }
    }

    public User[] viewAllUsers(){
        User[] allUsers = new User[userCount];
        //business logic
        return allUsers;
    }
}
