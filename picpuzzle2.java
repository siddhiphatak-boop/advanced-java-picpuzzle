import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class picpuzzle2 extends JFrame implements ActionListener{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,starB;
Icon star;
Icon ic0=new ImageIcon("starB0.jpg");
Icon ic10=new ImageIcon("starB10.jpg");
Icon ic20=new ImageIcon("starB20.jpg");
Icon samicon1=new ImageIcon("main.jpg");
Icon samicon2=new ImageIcon("main2.jpg");
Icon samicon3=new ImageIcon("main3.jpg");
Icon ic1=new ImageIcon("1.PNG");
Icon ic2=new ImageIcon("5.PNG");
Icon ic3=new ImageIcon("2.PNG");
Icon ic4=new ImageIcon("7.PNG");
Icon ic5=new ImageIcon("4.PNG");
Icon ic6=new ImageIcon("6.PNG");
Icon ic7=new ImageIcon("8.PNG");
Icon ic8=new ImageIcon("9.PNG");
Icon ic9=new ImageIcon("3.PNG");

Icon ic11=new ImageIcon("12.PNG");
Icon ic12=new ImageIcon("13.PNG");
Icon ic13=new ImageIcon("16.PNG");
Icon ic14=new ImageIcon("11.PNG");
Icon ic15=new ImageIcon("14.PNG");
Icon ic16=new ImageIcon("19.PNG");
Icon ic17=new ImageIcon("17.PNG");
Icon ic18=new ImageIcon("15.PNG");
Icon ic19=new ImageIcon("18.PNG");

Icon ic21=new ImageIcon("24.PNG");
Icon ic22=new ImageIcon("25.PNG");
Icon ic23=new ImageIcon("21.PNG");
Icon ic24=new ImageIcon("27.PNG");
Icon ic25=new ImageIcon("23.PNG");
Icon ic26=new ImageIcon("29.PNG");
Icon ic27=new ImageIcon("28.PNG");
Icon ic28=new ImageIcon("22.PNG");
Icon ic29=new ImageIcon("26.PNG");

picpuzzle2(){

super("picture puzzle");

b1=new JButton(ic1);
b1.setBounds(10,80,100,100);
b2=new JButton(ic2);
b2.setBounds(110,80,100,100);
b3=new JButton(ic3);
b3.setBounds(210,80,100,100);
b4=new JButton(ic4);
b4.setBounds(10,180,100,100);
b5=new JButton(ic5);
b5.setBounds(110,180,100,100);
b6=new JButton(ic6);
b6.setBounds(210,180,100,100);
b7=new JButton(ic7);
b7.setBounds(10,280,100,100);
b8=new JButton(ic8);
b8.setBounds(110,280,100,100);
b9=new JButton(ic9);
b9.setBounds(210,280,100,100);
sample=new JButton(samicon1);
sample.setBounds(380,100,200,200);

JLabel l1=new JLabel("Sample:");
l1.setBounds(330,200,70,20);
JLabel l2=new JLabel("NOTE:: icon has power to swap with neighbour icon=>");
l2.setBounds(5,15,500,20);
JLabel l3=new JLabel("click sample picture to next puzzle");
l3.setBounds(380,320,200,20);
l3.setForeground(Color.red);

starB=new JButton(ic0);
starB.setBounds(330,5,50,50);
star=b9.getIcon();

add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(sample);add(l1);add(l2);add(starB);add(l3);
b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); b4.addActionListener(this); b5.addActionListener(this); b6.addActionListener(this); b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this); 
sample.addActionListener(this);
setLayout(null);
setSize(600,500);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
    Icon s1=b1.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b1.setIcon(star);
      } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b1.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b2){
    Icon s1=b2.getIcon();
      if(b1.getIcon()==star){
        b1.setIcon(s1);
        b2.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b2.setIcon(star);
                   }
         else if(b3.getIcon()==star){
                    b3.setIcon(s1);
                    b2.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b3){
    Icon s1=b3.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b3.setIcon(star);
      } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b3.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b4){
    Icon s1=b4.getIcon();
      if(b1.getIcon()==star){
        b1.setIcon(s1);
        b4.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b4.setIcon(star);
                   }
         else if(b7.getIcon()==star){
                    b7.setIcon(s1);
                    b4.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b5){
    Icon s1=b5.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b5.setIcon(star);
      } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b5.setIcon(star);
                   }
         else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b5.setIcon(star);
                   }
          else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b5.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b6){
    Icon s1=b6.getIcon();
      if(b3.getIcon()==star){
        b3.setIcon(s1);
        b6.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b6.setIcon(star);
                   }
         else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b6.setIcon(star);
                   }
}//end of if

if(e.getSource()==b7){
    Icon s1=b7.getIcon();
      if(b4.getIcon()==star){
        b4.setIcon(s1);
        b7.setIcon(star);
      } else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b7.setIcon(star);
                   }
 }//end of if

   if(e.getSource()==b8){
    Icon s1=b8.getIcon();
      if(b7.getIcon()==star){
        b7.setIcon(s1);
        b8.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b8.setIcon(star);
                   }
         else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b8.setIcon(star);
                   }

  }//end of if

 if(e.getSource()==b9){
    Icon s1=b9.getIcon();
      if(b8.getIcon()==star){
        b8.setIcon(s1);
        b9.setIcon(star);
      } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b9.setIcon(star);
                   }
  }//end of if

if(e.getSource()==sample){
Icon s1=sample.getIcon();
 if(s1==samicon3){
sample.setIcon(samicon1);
b1.setIcon(ic1);
b2.setIcon(ic2);
b3.setIcon(ic3);
b4.setIcon(ic4);
b5.setIcon(ic5);
b6.setIcon(ic6);
b7.setIcon(ic7);
b8.setIcon(ic8);
b9.setIcon(ic9);
star=b9.getIcon();
starB.setIcon(ic0);
}//eof if
else if(s1==samicon1){
sample.setIcon(samicon2);
b1.setIcon(ic11);
b2.setIcon(ic12);
b3.setIcon(ic13);
b4.setIcon(ic14);
b5.setIcon(ic15);
b6.setIcon(ic16);
b7.setIcon(ic17);
b8.setIcon(ic18);
b9.setIcon(ic19);
star=b6.getIcon();
starB.setIcon(ic10);
}//eof else
else{
sample.setIcon(samicon3);
b1.setIcon(ic21);
b2.setIcon(ic22);
b3.setIcon(ic23);
b4.setIcon(ic24);
b5.setIcon(ic25);
b6.setIcon(ic26);
b7.setIcon(ic27);
b8.setIcon(ic28);
b9.setIcon(ic29);
star=b6.getIcon();
starB.setIcon(ic20);
}//eof else

}
}//end of actionPerformed

public static void main(String args[]){
new picpuzzle2();
}//end of main
}//end of class