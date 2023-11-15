//  @Rampage

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class configShape extends JFrame{
    JLabel shapeLabel;
    JLabel maxPoint;
    JComboBox shapList;
    JTextField maximaPoint;
    String[] shapeStringList;
    JButton submit;

    public configShape(){
        super("Product Shape Configuration");
        
        shapeLabel=new JLabel("Shape of Maxima");
        maxPoint=new JLabel("Point of Maxima");

        submit=new JButton("submit");

        maximaPoint=new JTextField(3);
        shapeStringList=new String[3];
        shapeStringList[0]="Circle";
        shapeStringList[1]="Square";
        shapeStringList[2]="triangle";
        
        shapList=new JComboBox(shapeStringList);

        setVisible(true);
        setLayout(new GridLayout(3,2));

        add(shapeLabel,0);
        add(shapList,1);
        add(maxPoint);
        add(maximaPoint);
        add(submit);
        pack();
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



public class shapeConfig{
    public static void main(String args[]){
        configShape ng=new configShape();
    }
}