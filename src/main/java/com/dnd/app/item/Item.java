package com.dnd.app.item;

import javax.persistence.*;

@Entity
@Table
public class Item {
    @Id
    @SequenceGenerator(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_sequence"
    )
    private Long id;

    private String name;
    private Integer cost;
    private Integer weight;
    private String attribute;
    private Long owner_id;

    public Item() {
    }

    public Item(Long id, String name, Integer cost, Integer weight, String attribute) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.attribute = attribute;
    }

    public Item(String name, Integer cost, Integer weight, String attribute) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.attribute = attribute;
    }

    public Item(String name, Integer cost, Integer weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    public Item(String name, Integer cost, Integer weight, String attribute, Long owner_id) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.attribute = attribute;
        this.owner_id = owner_id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Long getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Long owner_id) {
        this.owner_id = owner_id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                ", attribute='" + attribute + '\'' +
                ", owner_id=" + owner_id +
                '}';
    }
}
