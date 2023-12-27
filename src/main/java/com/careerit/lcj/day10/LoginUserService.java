package com.careerit.lcj.day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

record User(String username, String password) {
}
class UserService{

        Map<String,User> map =  new HashMap<>();

        public UserService() {
            List<User> users = getUsers();
            for(User user:users){
                map.put(user.username(),user);
            }
        }

        public boolean login(String username,String password){
            if(map.containsKey(username)){
                User user = map.get(username);
                return user.password().equals(password);
            }
            return false;
        }

        private List<User> getUsers(){
            List<User> users = new ArrayList<>();
            users.add(new User("krish","krish123"));
            users.add(new User("manoj","manoj123"));
            users.add(new User("charan","charan123"));
            users.add(new User("sai","sai123"));
            users.add(new User("balaji","balaji123"));
            users.add(new User("ramesh","ramesh123"));
            return users;
        }
}

public class LoginUserService {

    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.login("krish","krish123"));
        System.out.println(userService.login("krish","krish1234"));
        System.out.println(userService.login("krish1","krish123"));
    }


}

