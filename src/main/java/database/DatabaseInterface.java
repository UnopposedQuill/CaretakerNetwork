/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.List;

/**
 *
 * @author rober2
 */
public interface DatabaseInterface{
    
    public <T extends Object> List<T> getAll(Class<T> type);
    public <T extends Object> T get(Class<T> type);
    public <T extends Object> boolean save(T t);
    public  <T extends Object> boolean update(Class<T> type,List<String> names, List<String> values);
    public <T extends Object> boolean delete(T t);
    
}
