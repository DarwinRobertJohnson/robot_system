import java.lang.*;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;


class rackGui extends JFrame{

    JButton buttons[];

    public rackGui(){
        buttons=new JButton[10];
        setLayout(new FlowLayout());
        //create a array of buttons
        for(Integer i=0;i<10;i++){
            buttons[i]=new JButton(i.toString());
            add(buttons[i]);
        }

        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public rackGui(int num_rows,int num_columns){
        int num_buttons=num_columns*num_rows;

        buttons=new JButton[num_buttons];
        
        setLayout(new GridLayout(num_rows,num_columns));

        for(Integer i=0;i<num_buttons;i++){
            buttons[i]=new JButton(i.toString());
            add(buttons[i]);
        }


        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}


public class rack_gui{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arg1=sc.nextInt();
        int arg2=sc.nextInt();
        rackGui ng=new rackGui(arg1,arg2);

    }
}