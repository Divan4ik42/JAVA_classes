/*
    * Classname Item

    * Version 1.0

    * Copyright notice by Divan

 */


package com.company;

import java.util.Objects;

public class Item {


    private String id;
    private String name;
    private String description;

    public Item() {
    }

    public Item(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "items{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String toXML(){
        String string = "<Item>" + "\n" +
                "    <id>" + id + "</id>" +"\n" +
                "    <id>" + name + "</id>" +"\n" +
                "    <id>" + description + "</id>"+"\n" +
                "</Item>";
        return string;
    }
    public String toJSON(){
        String string = "Item:{" + "\""+ "id" + "\"" + ":" + "\"" + id + "\""+ ","
                + "\"" + "name" + "\"" + ":" + "\"" + name + "\"" + ","
                + "\"" + "description" + "\"" + ":" + "\"" + description + "\"" + "}";
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item Item = (Item) o;
        return id.equals(Item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
