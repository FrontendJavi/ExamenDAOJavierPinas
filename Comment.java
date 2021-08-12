import java.util.*;
public class Comment extends Entity {
    private String text;
    private double mark;
    private String date;
    private UUID userID;
    private UUID pizzaID;

    public Comment(String text, float rating, String date, UUID userID, UUID pizzaID){
        this.text = text;
        this.mark = rating;
        this.date = date;
        this.userID = userID;
        this.pizzaID = pizzaID;
    }

  

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    public double getMark(){
        return this.mark;
    }

    public void setMark(Double mark){
        this.mark = mark;
    }

    public String getDate(){
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public UUID getPizzaID(){
        return this.pizzaID;
    }

    public void setPizza(UUID pizzaID) {
        this.pizzaID = pizzaID;
    }

    public UUID getUserID(){
        return this.userID;
    }

    public void setUser(UUID userID) {
        this.userID = userID;
    }
}
