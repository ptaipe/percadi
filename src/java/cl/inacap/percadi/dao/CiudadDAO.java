/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.dao;

import cl.inacap.percadi.model.Ciudad;
import java.util.List;

/**
 *
 * @author alvaro
 */
public interface CiudadDAO {
    
    public List<Ciudad> findAll();
    
}
