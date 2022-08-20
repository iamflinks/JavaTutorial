package org.iamflinks.helloworld;

public class Database {
    private String name;

    private static Database instance;

    // synchronize keyword makes the Class thread safe (only one thread can call it at the same time)
    public static synchronized Database getInstance(String name) {
        if (null == instance) {
            instance = new Database(name);

        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // this private access modifier restrict instantiating the class from outside.
    // It makes it only usable in the class itself
    private Database(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String text = "Database class\n" +
                "Name: " + this.name;
        return  text;
    }
}
