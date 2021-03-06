package com.company;

import java.util.Objects;

public class Character {
    // Member variables
    private String name;
    private String occupation;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    // Constructor
    public Character(String name, String occupation, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.occupation = occupation;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    // Character methods
    public void move() {
        System.out.println("running...");
    }

    public void attack() {
        System.out.println("attacking...");
    }

    public void heal() {
        System.out.println("healing...");
    }

    public void decreaseHealth(int attackPower) {
        this.health -= attackPower;
    }

    public void increaseStamina(int rest) {
        this.stamina += rest;
    }

    public void decreaseStamina(int exertion) {
        this.stamina -= exertion;
    }

    // Getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // Override equals() & hashCode()


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return strength == character.strength && health == character.health && stamina == character.stamina && speed == character.speed && attackPower == character.attackPower && Objects.equals(name, character.name) && Objects.equals(occupation, character.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, occupation, strength, health, stamina, speed, attackPower);
    }

    // Override toString()
    @Override
    public String toString() {
        return this.getName() + ": " +
                "\n\toccupation = " + this.getOccupation() +
                "\n\thealth = " + this.getHealth() +
                "\n\tstrength = " + this.getStrength() +
                "\n\tstamina = " + this.getStamina() +
                "\n\tspeed = " + this.getSpeed() +
                "\n\tattack power = " + this.getAttackPower();
    }
}
