package com.example.friendgui;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipFile;

public class CreateFriend {
    private static String age;
    private static String phoneNumber;
    private static String name;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Friend> friends = new ArrayList<>();

    public static ArrayList createAllFriends(String fileName) throws IOException {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        StringBuilder friendString = new StringBuilder();
        while((line = br.readLine()) != null){
            if(!line.equals(";")){
                friendString.append(line);
            }else {
                parseFriend(friendString.toString());
                friendString = new StringBuilder();
            }
        }
        fr.close();
        br.close();
        return friends;
    }
    private static void parseFriend(String string){
        String[] x = string.split(",");
        age = x[0];
        phoneNumber = x[1];
        name = x[2];

        friends.add(new Friend(age, phoneNumber, name));
    }
}
