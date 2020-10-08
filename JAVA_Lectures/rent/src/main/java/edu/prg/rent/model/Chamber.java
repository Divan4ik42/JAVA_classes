package edu.prg.rent.model;
// этот обьект пойдет в базу
import java.time.LocalDateTime;
import java.util.Objects;

public class Chamber {
    private String id; // db  видит его хорошо если стринг
    private String name;
    private int capacity;
    private Comfort comfort;
    private int price;
    private String description;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;

    public Chamber() {
    }

    public Chamber(String name, int capacity, Comfort comfort, int price, String description) {
        this.name = name;
        this.capacity = capacity;
        this.comfort = comfort;
        this.price = price;
        this.description = description;
    }

    public Chamber(String id, String name, int capacity, Comfort comfort, int price, String description) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.comfort = comfort;
        this.price = price;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Comfort getComfort() {
        return comfort;
    }

    public void setComfort(Comfort comfort) {
        this.comfort = comfort;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getModified_at() {
        return modified_at;
    }

    public void setModified_at(LocalDateTime modified_at) {
        this.modified_at = modified_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chamber chamber = (Chamber) o;
        return id.equals(chamber.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Chamber{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", comfort=" + comfort +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", modified_at=" + modified_at +
                '}';
    }
}
