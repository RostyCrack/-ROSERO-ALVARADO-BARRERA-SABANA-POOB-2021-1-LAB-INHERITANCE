package edu.sabana.poob;

public class Square extends Rectangle {

    public Square(){
        super(1,1);

    }

    public Square (String color){
        super(color, 1, 1);
    }

    public Square (double side){
        super(side, side);
    }

    public Square (String color, double side){
        super(color, side, side);
    }

}
