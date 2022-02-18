package com.company.Exame;

import com.company.Exemple.C;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class DAOImpl implements DAO{

    private ConnectionDB conn ;

    public DAOImpl(){
        conn = new ConnectionDB();
    }
    @Override
    public Set<Commercial> selectAll() {
        String req = "SELECT  * FROM cmmercial";
        Set<Commercial> commercialSet = new HashSet<>();
        ResultSet resultSet = null;
        try{
            resultSet = conn.getStatement().executeQuery(req);
            while(resultSet.next()){
                Set<Produit> sets= (Set) resultSet.getObject("lksdjf");
                commercialSet.add(new Commercial(resultSet.getString("reference") , resultSet.getString("nom")  , resultSet.getString("prenom") , sets));
            }
        }catch (SQLException e){

        }
        return commercialSet;
    }

    @Override
    public void delete(String matricule) {
        String req = "DELETE From commercial where matricule ='" + matricule + "'" ;
        try {
            conn.getStatement().executeUpdate(req);
        }catch (SQLException e){
            e.printStackTrace();
        }
        }
}
