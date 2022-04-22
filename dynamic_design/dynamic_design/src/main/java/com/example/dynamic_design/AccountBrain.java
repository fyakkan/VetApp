package com.example.dynamic_design;

public class AccountBrain {
    int id =1;
    UserList userList = new UserList();
    public void Register(String name,String surname,String phoneNumber,
                          String username, String password,String mailAddress){

        Customer user = new Customer(id,username,password);
        user.setMailAddress(mailAddress);
        user.setPhoneNumber(phoneNumber);
        user.setName(name);
        user.setSurname(surname);
        userList.getUsers().add(user);
        // id number increasing one by one but i am not sure it is working or not
        id++;

    }
    public void Register(String name,String surname,String phoneNumber,String mailAddress,
                          String username, String password,String address){

        MyVet user = new MyVet(id,username,password);
        user.setMailAddress(mailAddress);
        user.setPhoneNumber(phoneNumber);
        user.setName(name);
        user.setSurname(surname);
        user.setAddress(address);
        userList.getUsers().add(user);
        // id number increasing one by one but i am not sure it is working or not
        id++;

    }
    public void LogIn(String username,String password, Boolean isVet){
        Application m = new Application();
      if (checkLogin(username,password)&&isVet){

          //go to vet after login page

      }
        else if (checkLogin(username,password)&&!isVet){

            //go to customer after login page

        }

    }
    private Boolean checkLogin(String username,String password){

        String UserPassword;

        int i=0;
        //This loop find user and get password that user's password
        while (true){

            if (username.equals(userList.getUsers().get(i).getUsername())){
                UserPassword=userList.getUsers().get(i).getPassword();
                break;
            }
           i++;
        }



        if (UserPassword.equals(password)){
            return true;
        }
        return false;

    }

}
