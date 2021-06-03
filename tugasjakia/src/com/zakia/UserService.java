package com.zakia;

public class UserService {

    private String[][] data = new String[2][3];
    private String email, password;


    public UserService(String emails, String passwords)
    {
        this.email = emails;
        this.password = passwords;
        String[][] data =
                {
                        {"zakiamarrit@gmail.com", "zakia123"},
                        {"zz", "zz"}
                };
        this.data = data;
    }

    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }



}
