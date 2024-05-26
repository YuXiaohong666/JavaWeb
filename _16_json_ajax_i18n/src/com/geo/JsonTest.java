package com.geo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author YuHong
 * #Description JsonTest
 * #Date: 2024/5/24 22:13
 */
public class JsonTest {
    @Test
    public void test() {
        Person person = new Person(1, "ihi");
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
        Person person1 = gson.fromJson(json, Person.class);
        System.out.println(person1);
    }

    @Test
    public void test2() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(1, "ihi"));
        persons.add(new Person(2, "ihi"));
        Gson gson = new Gson();
        String json = gson.toJson(persons);
        System.out.println(json);
        List<Person> persons1 = gson.fromJson(json, persons.getClass());
        System.out.println(persons1);
    }

    @Test
    public void test3() {
        Map<Integer, Person> persons = new HashMap<Integer, Person>();
        persons.put(1, new Person(1, "ihi"));
        persons.put(2, new Person(2, "ihi"));

        Gson gson = new Gson();
        String json = gson.toJson(persons);
        System.out.println(json);
        Map<Integer, Person> persons1 = gson.fromJson(json, persons.getClass());
        System.out.println(persons1);
    }
}
