import java.lang.*;
import javax.swing.*;
import java.awt.*;

class configGui extends JFrame{

    JLabel labels[];
    JTextField data[];
    JButton run;
    public configGui(){
        labels=new JLabel[4];
        data=new JTextField[4];
        run=new JButton("Run!");

        JPanel jp=new JPanel();

        labels[0]=new JLabel("Item Name:");
        labels[1]=new JLabel("Item Frequency:");
        labels[2]=new JLabel("Loading co-ordinate(Polar):");
        labels[3]=new JLabel("Loading co-ordinate(Rectangular):");

        jp.setLayout(new GridLayout(5,2));

        for(int i=0;i<4;i++){
            jp.add(labels[i]);
            data[i]=new JTextField(16);
            jp.add(data[i]);
        }
        jp.add(run);
        add(jp);
        
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


public class cofig_gui{

    public static void main(String[] args){
        configGui cg=new configGui();
    }
}