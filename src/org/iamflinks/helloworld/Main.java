package org.iamflinks.helloworld;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance("db_car");
        Database db_music = Database.getInstance("db_music");
        System.out.println(db_music.toString());
    }
}
