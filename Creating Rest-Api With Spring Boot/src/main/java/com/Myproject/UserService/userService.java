package com.Myproject.UserService;

import com.Myproject.entities.Users;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class userService {
    public List<Users> mylist = new CopyOnWriteArrayList<Users>();

//    Add Users
    public Users adduser(Users users) {
        mylist.add(users);
        return users;
    }

//    Get all users
    public List<Users> getusers() {
        return mylist;
    }

//    Get single user
    public Users getauser(int userid) {
        return mylist.stream().filter(c->c.getUserid()==userid).findFirst().get();
    }

//    Update Users
    public Users updateuser(int userid, Users users) {
        mylist.forEach(c->{
            if (c.getUserid()==userid) {
                c.setUserid(users.getUserid());
                c.setName(users.getName());
                c.setEmail(users.getEmail());
                c.setPassword(users.getPassword());
            }
        });
        return mylist.stream().filter(c->c.getUserid()==userid).findFirst().get();
    }

//    Delete a User
    public void deleteuser(int userid) {
        mylist.forEach(c->{
            if (c.getUserid()==userid) {
                mylist.remove(c);
            }
        });
    }
}
