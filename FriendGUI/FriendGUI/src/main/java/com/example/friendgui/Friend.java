package com.example.friendgui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    public String name;
    public String age;
    public String phoneNum;

    Friend(String age, String phoneNum, String name){
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void writeToFile() throws IOException{
        FileWriter fw = new FileWriter("friends.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(age + ",\r");
        bw.write(phoneNum + ",\r");
        bw.write(name + "\r");
        bw.write(";\r");
        bw.close();
    }

    public static boolean compareFriends(Friend f, String name){
        if(name.equals(f.name)){
            return true;
        }
        else return false;
    }
}


