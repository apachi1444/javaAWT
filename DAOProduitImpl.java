package com.company.Exame;

import com.company.Exemple.C;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOProduitImpl implements DAOProduit{
    private ConnectionDB connectionDB;
    public DAOProduitImpl(){
        connectionDB = new ConnectionDB();
    }
    @Override
    public int add(Produit p) {
        String req = "insert into produit values(?,?,?)";
        int r = 0 ;
        try{
            PreparedStatement preparedStatement = connectionDB.getConnection().prepareStatement(req);
            preparedStatement.setString(1,p.getNom());
            preparedStatement.setString(2,p.getDescription());
            r = preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return r ;
    }

    @Override
    public int update(Produit p) {
        String req = "UPDATE Produit ( " + p.getPrix() + ", " + "... where id = " + p.getId();
        int r = 0 ;
        try{
            r = connectionDB.getStatement().executeUpdate(req);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return r;
    }
}
