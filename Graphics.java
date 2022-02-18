package com.company.Exame;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.awt.event.*;
public class Graphics {

    public void draw(){
        Frame f = new Frame("untitled");
        MenuBar menuBar = new MenuBar();
        Menu File = new Menu("FIle");
        Menu Edit = new Menu("Edit");
        Menu Help = new Menu("Help");
        f.setVisible(true);
        f.setSize(200,300);
        f.setBackground(Color.RED);
        Panel p = new Panel();
        p.add(new Label("Nouveau Produit"));
        f.add(p);
        menuBar.add(File);
        menuBar.add(Edit);
        menuBar.add(Help);
        f.setMenuBar(menuBar);
        Choice choice = new Choice();
        Produit produit = new Produit("yessine" , "jaoua" , 23);
        Produit produit1 = new Produit("yessine" , "jaoua" , 23);
        Set<Produit> produitSet = new HashSet<>(Arrays.asList(produit1 , produit));
        Commercial commercial = new Commercial("sdqf" , "lksqdjf" , "lksdjqf" , produitSet );
        Commercial commercia2 = new Commercial("sdqfqsdf" , "lksqdjf" , "lksdjqf" , produitSet );
        Panel name = new Panel();
        Panel lastname = new Panel();
        Panel prix = new Panel();

        name.add(new Label("type the name here"));
        lastname.add(new Label("type the lastname here"));
        prix.add(new Label("type the price here"));
        TextField textField = new TextField(30);
        name.add(textField);
        lastname.add(new TextField(30));
        prix.add(new TextField(30));

        p.add(name);
        p.add(lastname);
        p.add(prix);


        //Set<Commercial> commercialSetziko = new DAOImpl().selectAll();
        Set<Commercial> commercialSet =new HashSet<Commercial>(Arrays.asList(commercia2 , commercial));
        Iterator iterator = commercialSet.iterator();
        while(iterator.hasNext()){
            choice.add(iterator.next().toString());
        }
        p.add(new Label("choose your commercial")) ;
        p.add(choice);
        Button ajout  = new Button("Ajouter");
        ajout.setBackground(Color.WHITE);
        p.add(ajout);
    }
    private class Ziko extends MouseAdapter{

        public void mouse(MouseEvent e){

        }
    }


    public static void main(String[] args) {
        Graphics graphics = new Graphics();
        graphics.draw();
    }

}
