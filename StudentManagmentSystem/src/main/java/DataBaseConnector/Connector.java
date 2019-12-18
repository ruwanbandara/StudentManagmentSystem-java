/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataBaseConnector;

import java.sql.ResultSet;


/**
 *
 * @author Ruwan Bandara
 */
public interface Connector {
    public void connect();
    public ResultSet getSql(String sql);
    
   
    
}
