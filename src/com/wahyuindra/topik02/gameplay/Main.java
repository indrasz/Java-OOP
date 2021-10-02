package com.wahyuindra.topik02.gameplay;

class GameCharacter{
    String name;
    int lifePoint;
    int attackHitPoint;
    int attackKickPoint;

    GameCharacter(String name, int attackHitPoint, int attackKickPoint){
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    String getName() {
        return name;
    }

    void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    int getLifePoint() {
        return lifePoint;
    }

    void hit(GameCharacter player){
        player.setLifePoint(player.getLifePoint() - this.attackHitPoint);
    }

    void kick(GameCharacter player){
        player.setLifePoint(player.getLifePoint() - this.attackKickPoint);
    }

    void display(){
        System.out.println("Player : " + getName());
        System.out.println("Health : " + getLifePoint());
    }

    void compare (GameCharacter player){
        int compare = Integer.compare(this.lifePoint, player.getLifePoint());

        if(compare > 0) System.out.println(this.name + " CHAMPIONSSS!!");
        else if(compare < 0) System.out.println(player.getName() + " CHAMPIONSSS!!");
        else System.out.println("DRAW");

    }
}
public class Main {
    public static void main(String[] args) {
        GameCharacter player1 = new GameCharacter("Raiden", 10, 20);
        GameCharacter player2 = new GameCharacter("Sub Zero", 5, 25);
        player1.setLifePoint(100);
        player2.setLifePoint(100);
        System.out.println("Status Player");
        player1.display();
        player2.display();
        System.out.println();

        System.out.println("Chapter 1");
        System.out.println(player1.getName() + " Kick " + player2.getName());
        player1.kick(player2);
        player2.display();
        System.out.println();

        System.out.println("Chapter 2");
        System.out.println(player2.getName() + " Kick " + player1.getName());
        player2.kick(player1);
        player1.display();
        System.out.println();

        System.out.println("Chapter 3");
        for(int i = 0; i < 3; i++){
            player2.hit(player1);
        }
        System.out.println(player2.getName() + " Hit 3x " + player1.getName());
        player1.display();
        System.out.println();

        System.out.println("Chapter 4");
        for(int i = 0; i < 4; i++){
            player1.kick(player2);
        }
        System.out.println(player1.getName() + " Kick 4x " + player2.getName());
        player2.display();
        System.out.println();

        System.out.println("Hasil Pertandingan");
        player1.display();
        player2.display();
        System.out.println();

        player1.compare(player2);

    }
}
