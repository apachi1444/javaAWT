package com.company.Exame;

import java.util.Set;

public interface DAO {

    Set<Commercial> selectAll() ;
    void delete (String matricule);
}
