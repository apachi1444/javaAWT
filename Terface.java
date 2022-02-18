package com.company.AWT;

import com.company.Threads.Person;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;

public class Terface {
    Frame f ;
    Label label ;
    Panel panel ;
    CheckboxGroup checkboxGroup;
    Checkbox checkbox , checkbox2;
    Choice choice ;
    List list ;
    TextField textField;
    TextArea textArea;
    public void launch(){
        f = new Frame("this the title of the frame of our window ");
        label = new Label("hahhahhaha welcome to the club you mother fker");
        panel = new Panel(new GridLayout(3,3));
        panel.add(label);
        f.add(panel);
        f.setSize(200,300);
        label.setBackground(Color.BLUE);
        checkboxGroup = new CheckboxGroup();
        checkbox = new Checkbox("yessine " , true , checkboxGroup);
        checkbox2 = new Checkbox("yessinsdf" , true , checkboxGroup);
        panel.add(checkbox); panel.add(checkbox2);
        choice = new Choice();
        choice.addItem("yessine");
        choice.addItem("jaoua");
        choice.addItem("sqkdfjkl");
        panel.add(choice);

        // this is for the list
        list = new List(3,true);
        list.add("yessine");
        list.add("jaoua");
        panel.add(list);

        //this is for the text field
        textField = new TextField(20);
        textField.setText("yessine joaoua ");
        panel.add(textField);

        // this is for the text Area
        textArea = new TextArea("yessine\n hahah lkjdsqf\n",30 , 30 , TextArea.SCROLLBARS_VERTICAL_ONLY);
        textArea.setFont(new Font("Sherif" ,Font.BOLD,17));
        panel.add(textArea);


        f.setVisible(true);
    }

    public void launchWindow(){
       f = new Frame("thie is the title ");
       Dialog dg = new Dialog(f);
       dg.setBackground(Color.BLUE);
       dg.setSize(200,200);
       dg.add(new Label("Voulez vous vraiment continuer "));
       Panel panel = new Panel();
       panel.add(new Button("Yes"));
       panel.add(new Button("No"));
       dg.add(panel,BorderLayout.CENTER);
       dg.setVisible(true);
       Panel p1 , p2 , p3 , p4, p5;
       p1 = new Panel(); p1.setSize(20,400);p1.setBackground(Color.CYAN);
       p2 = new Panel(); p2.setBackground(Color.GREEN);
       p3 = new Panel(); p3.setBackground(Color.RED);
       p4 = new Panel(); p1.setBackground(Color.MAGENTA);
       p5 = new Panel(); p1.setBackground(Color.yellow);
        f.add(p1 , BorderLayout.NORTH);
        f.add( p2 , BorderLayout.SOUTH);
        f.add(p3 , BorderLayout.EAST);
        f.add(p4 , BorderLayout.WEST);
        f.add(p5 , BorderLayout.CENTER);
        f.setVisible(true);
        f.setSize(400,400);
    }

    // this is for the file dialog
    public void fileDialogue(){
        f = new Frame("this is for the file dialog");
        f.setBackground(Color.RED);
        f.setSize(500,500);
        FileDialog fileDialog = new FileDialog(f);
        fileDialog.setVisible(true);
        fileDialog.setSize(100,200);
        f.setVisible(true);

    }

    public void ScrollPane(){
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        Panel p = new Panel(new GridLayout(7,8));
        for ( int j = 0 ; j< 50 ; j++){
            p.add(new Button("Button -" + j));
        }
        sp.add(p);
        sp.setVisible(true);
        f = new Frame("lksqdjf");
        f.setVisible(true);
        f.setSize(400,400);
        f.setBackground(Color.blue);
        f.add(sp,BorderLayout.CENTER);

    }

    public void flowLayout(){
        f = new Frame("yessine jaoua");
        f.setSize(300,300);
        Panel panel = new Panel();
        panel.add(new Button("yessine"));
        panel.add(new Button("jaoua"));
        panel.add(new Button("yes"));
        f.add(panel);
        f.setLayout(new FlowLayout(FlowLayout.LEFT , 80 , 50));
        f.setVisible(true);

    }

    public void BorderLayout(){
        f = new Frame("yessine jaoua ");
        f.setVisible(true);
        f.setSize(300,300);
        f.setLayout(new GridLayout(3,2));
        f.setBackground(Color.MAGENTA);
        f.add("South " , new Button("yessine"));
        f.add("North" , new Button("Hey Bro"));
        f.add("Ease"  , new Label("yoyo"));
        f.add("West"  , new Label("yiyi"));
        f.add("Center " , new Label("sdqkfjlksdqf"));
    }
    private CardLayout c1 ;
    private class MouseListener extends MouseMotionAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            c1.next(f);
        }
    }
    public void CardLayout(){
        f = new Frame("yessine jaoua");
        c1 = new CardLayout(10,30);
        Button b1 = new Button("this is the first one ");
        Button b2 = new Button("this is the second time ");
        Button b3 = new Button("this is the third time ");

        f.setLayout(c1);
        MouseListener mouseListener = new MouseListener();
        b1.addMouseMotionListener(mouseListener);
        b2.addMouseMotionListener(mouseListener);
        b3.addMouseMotionListener(mouseListener);
        f.add("un" , b1 );
        f.add("two" , b2);
        f.add("three"  , b3);

        f.setSize(300,400);
        f.setBackground(Color.GREEN);
        f.setVisible(true);
        }


    public void Menu(){
        f  = new Frame("this is our menu of our application of course");
        f.setSize(400,500);
        f.setBackground(Color.GREEN);

        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("yessine");
        Menu menu1 = new Menu("jaoua");
        Menu menu2 = new Menu("zemel");
        menuBar.add(menu);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menu.add(new MenuItem("yoyoy"));
        menu.add(new MenuItem("yiyi"));
        f.setVisible(true);
        f.setLocation(300,400);
        f.setMenuBar(menuBar);
        menu2.setEnabled(false);
        Menu imad = new Menu("imad");
        imad.add(new CheckboxMenuItem("hahah"));
        menuBar.add(imad);
    }
    public static void main(String[] args) {
        Terface terface = new Terface();
        //terface.launch();
        //terface.ScrollPane();
        //terface.flowLayout();
        //terface.BorderLayout();
        terface.CardLayout();
        //terface.Menu();
    }
}
