package com.geo.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author yuxiaohong
 * @package com.geo.pojo
 * @date 2024/1/24 15:59
 * @description
 */
public class Person {
    private int name;
    private String[] phones;
    private List<String> cities;
    private Map<String, Object> map;

    public Person() {
    }

    public Person(int name, String[] phones, List<String> cities, Map<String, Object> map) {
        this.name = name;
        this.phones = phones;
        this.cities = cities;
        this.map = map;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", phones=" + Arrays.toString(phones) +
                ", cities=" + cities +
                ", map=" + map +
                '}';
    }
}
