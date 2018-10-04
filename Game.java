import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Game extends Applet implements ActionListener
{
    JButton New; 
    JPanel pane = new JPanel();
    JLabel Moves;
    static int moves=0;   
    
    JButton n1;
    JButton n2;
    JButton n3;
    JButton n4;
    JButton n5;
    JButton n6;
    JButton n7;
    JButton n8;
    JButton n9;
    
    JPanel cardPanel1;
    CardLayout c1;
    JPanel cardPanel2;
    CardLayout c2;
    JPanel cardPanel3;
    CardLayout c3;
    JPanel cardPanel4;
    CardLayout c4;
    JPanel cardPanel5;
    CardLayout c5;
    JPanel cardPanel6;
    CardLayout c6;
    JPanel cardPanel7;
    CardLayout c7;
    JPanel cardPanel8;
    CardLayout c8;
    JPanel cardPanel9;
    CardLayout c9;
    
    JPanel pcard1;
    JPanel pcard2;
    JPanel pcard3;
    JPanel pcard4;
    JPanel pcard5;
    JPanel pcard6;
    JPanel pcard7;
    JPanel pcard8;
    JPanel pcard9;
    public Game() 
    {
        New = new JButton ("New Game");
        New.addActionListener(this);
                
        pane.setLayout(new BorderLayout());
        JPanel subpanel = new JPanel();
        subpanel.add(New);
        pane.add(subpanel, BorderLayout.NORTH);
       
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        GridLayout family = new GridLayout(3,3,15,15);
        panel.setLayout(family);
        
        int[] array = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int i,j,temp;
        Random rand = new Random(); 
        for (i=0; i<=8;i++)
        {
            temp= rand.nextInt(9);
            j=0;
            while (j<=8)
            {
                if (array[j]==temp)
                {
                    temp=rand.nextInt(9);
                    j=0;
                }
                else 
                {
                    j++;
                }
            }
            array[i]=temp;     
        }
        String[] arrays=new String[9];
        for (i=0;i<=8;i++)
        {
            if (array[i]==0)
            {
                arrays[i]="";
            }else
            {
                arrays[i]=Integer.toString(array[i]);
            }
        }
        cardPanel1 = new JPanel();
        n1=new JButton(arrays[0]);
        n1.setPreferredSize(new Dimension(80, 60));
        cardPanel1.setBackground(Color.black);
        n1.setBackground(Color.gray);
        cardPanel2 = new JPanel();
        n2=new JButton(arrays[1]);
        n2.setPreferredSize(new Dimension(80, 60));
        cardPanel2.setBackground(Color.black);
        n2.setBackground(Color.gray);
        cardPanel3 = new JPanel();
        n3=new JButton(arrays[2]);
        n3.setPreferredSize(new Dimension(80, 60));
        cardPanel3.setBackground(Color.black);
        n3.setBackground(Color.gray);
        cardPanel4 = new JPanel();
        n4=new JButton(arrays[3]);
        n4.setPreferredSize(new Dimension(80, 60));
        cardPanel4.setBackground(Color.black);
        n4.setBackground(Color.gray);
        cardPanel5 = new JPanel();
        n5=new JButton(arrays[4]);
        n5.setPreferredSize(new Dimension(80, 60));
        cardPanel5.setBackground(Color.black);
        n5.setBackground(Color.gray);
        cardPanel6 = new JPanel();
        n6=new JButton(arrays[5]);
        n6.setPreferredSize(new Dimension(80, 60));
        cardPanel6.setBackground(Color.black);
        n6.setBackground(Color.gray);
        cardPanel7 = new JPanel();
        n7=new JButton(arrays[6]);
        n7.setPreferredSize(new Dimension(80, 60));
        cardPanel7.setBackground(Color.black);
        n7.setBackground(Color.gray);
        cardPanel8 = new JPanel();
        n8=new JButton(arrays[7]);
        n8.setPreferredSize(new Dimension(80, 60));
        cardPanel8.setBackground(Color.black);
        n8.setBackground(Color.gray);
        cardPanel9 = new JPanel();
        n9=new JButton(arrays[8]);
        n9.setPreferredSize(new Dimension(80, 60));
        cardPanel9.setBackground(Color.black);
        n9.setBackground(Color.gray);
        
        blackpanel(n1);
        blackpanel(n2);
        blackpanel(n3);
        blackpanel(n4);
        blackpanel(n5);
        blackpanel(n6);
        blackpanel(n7);
        blackpanel(n8);
        blackpanel(n9);
   
        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);
        
        cardPanel1.add(n1);
        cardPanel2.add(n2);
        cardPanel3.add(n3);
        cardPanel4.add(n4);
        cardPanel5.add(n5);
        cardPanel6.add(n6);
        cardPanel7.add(n7);
        cardPanel8.add(n8);
        cardPanel9.add(n9);
        
        panel.add(cardPanel1, "1");
        panel.add(cardPanel2,"2");
        panel.add(cardPanel3,"3");
        panel.add(cardPanel4,"4");
        panel.add(cardPanel5,"5");
        panel.add(cardPanel6,"6");
        panel.add(cardPanel7,"7");
        panel.add(cardPanel8,"8");
        panel.add(cardPanel9,"9");

        Moves= new JLabel("Moves:   "+moves);
        pane.add(Moves,BorderLayout.SOUTH);
        pane.add(panel,BorderLayout.CENTER);
        add(pane);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent evt)
    {
        Object source =evt.getSource();
        String text_of_the_button=((JButton)(evt.getSource())).getText();
            if (source == n1) 
            {
                if (n2.getText() == "")
                {
                    n1.setText("");
                    n2.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n4.getText() == "")
                {
                    n1.setText("");
                    n4.setText(text_of_the_button);
                    moves=moves+1;
                }
            }else if(source == n2)
            {
                if (n1.getText() == "")
                {
                    n2.setText("");
                    n1.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n3.getText() == "")
                {
                    n2.setText("");
                    n3.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n5.getText() == "")
                {
                    n2.setText("");
                    n5.setText(text_of_the_button);
                    moves=moves+1;
                }
            }else if(source == n3)
            {
                if (n2.getText() == "")
                {
                    n3.setText("");
                    n2.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n6.getText() == "")
                {
                    n3.setText("");
                    n6.setText(text_of_the_button);
                    moves=moves+1;
                }
            }else if(source == n4)
            {
                if (n1.getText() == "")
                {
                    n4.setText("");
                    n1.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n5.getText() == "")
                {
                    n4.setText("");
                    n5.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n7.getText() =="")
                {
                    n4.setText("");
                    n7.setText(text_of_the_button);
                    moves=moves+1;
                }
            }else if(source == n5)
            {
                if (n2.getText() == "")
                {
                    n5.setText("");
                    n2.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n4.getText() == "")
                {
                    n5.setText("");
                    n4.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n6.getText() == "")
                {
                    n5.setText("");
                    n6.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n8.getText() == "")
                {
                    n5.setText("");
                    n8.setText(text_of_the_button);
                    moves=moves+1;
                }
            }else if(source == n6)
            {
                if (n3.getText() == "")
                {
                    n6.setText("");
                    n3.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n5.getText() == "")
                {
                    n6.setText("");
                    n5.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n9.getText() == "")
                {
                    n6.setText("");
                    n9.setText(text_of_the_button);
                    moves=moves+1;
                }
            }else if(source == n7)
            {
                if (n4.getText() == "")
                {
                    n7.setText("");
                    n4.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n8.getText() == "")
                {
                    n7.setText("");
                    n8.setText(text_of_the_button);
                    moves=moves+1;
                }
            }else if(source == n8)
            {
                if (n5.getText() == "")
                {
                    n8.setText("");
                    n5.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n7.getText() == "")
                {
                    n8.setText("");
                    n7.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n9.getText() == "")
                {
                    n8.setText("");
                    n9.setText(text_of_the_button);
                    moves=moves+1;
                }
            }else if(source == n9)
            {
                if (n6.getText() == "")
                {
                    n9.setText("");
                    n6.setText(text_of_the_button);
                    moves=moves+1;
                }else if (n8.getText() == "")
                {
                    n9.setText("");
                    n8.setText(text_of_the_button);
                    moves=moves+1;
                }
            }else if(source == New)
            {
                int[] array = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1};
                int i,j,temp;
                Random rand = new Random();
                moves=0;
                for (i=0; i<=8;i++)
                {
                    temp= rand.nextInt(9);
                    j=0;
                    while (j<=8)
                    {
                        if (array[j]==temp)
                        {
                            temp=rand.nextInt(9);
                            j=0;
                        }
                        else
                        {
                            j++;
                        }
                    }
                    array[i]=temp;
                }
                String[] arrays=new String[9];
                for (i=0;i<=8;i++)
                {
                    if (array[i]==0)
                    {
                        arrays[i]="";
                    }else
                    {
                        arrays[i]=Integer.toString(array[i]);
                    }
                }
                n1.setText(arrays[0]);
                n2.setText(arrays[1]);
                n3.setText(arrays[2]);
                n4.setText(arrays[3]);
                n5.setText(arrays[4]);
                n6.setText(arrays[5]);
                n7.setText(arrays[6]);
                n8.setText(arrays[7]);
                n9.setText(arrays[8]);
            }
            blackpanel(n1);
            blackpanel(n2);
            blackpanel(n3);
            blackpanel(n4);
            blackpanel(n5);
            blackpanel(n6);
            blackpanel(n7);
            blackpanel(n8);
            blackpanel(n9);
            if (n1.getText().equals("1") && n2.getText().equals("2") && n3.getText().equals("3") && n4.getText().equals("4") && n5.getText().equals("5") && n6.getText().equals("6") && n7.getText().equals("7") && n8.getText().equals("8") && n9.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Well Done!!!");
            }
            Moves.setText("Moves:   "+moves);
            revalidate();
    }
    public void blackpanel(JButton jp)
    {
        if (jp.getText() == "")
        {
            jp.setBackground(Color.black);
            jp.setBorderPainted(false);
        }else
        {
            jp.setBackground(Color.gray);
            jp.setBorderPainted(true);
        }
    }     
}

