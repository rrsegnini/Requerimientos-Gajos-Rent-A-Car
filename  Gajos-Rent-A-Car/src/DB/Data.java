/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import domain.Automóvil;
import domain.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CASA
 */
public class Data {
    private static Data data_instance = new Data();
    private List<Automóvil> Vehicle_List = new ArrayList<Automóvil>();
    private List<Usuario> User_List = new ArrayList<Usuario>();

    public static Data getData_instance() {
        return data_instance;
    }

    public static void setData_instance(Data data_instance) {
        Data.data_instance = data_instance;
    }

    public List<Usuario> getUser_List() {
        return User_List;
    }

    public void setUser_List(List<Usuario> User_List) {
        this.User_List = User_List;
    }
    

    public Data() {
    }
    
    public static Data getInstance(){
        if (data_instance == null){
            data_instance = new Data();
            return data_instance;
        }else{
            return data_instance;
        }
    }
    
    
    public List<Automóvil> getVehicle_List() {
        return Vehicle_List;
    }

    public void setVehicle_List(List<Automóvil> Vehicle_List) {
        this.Vehicle_List = Vehicle_List;
    }
    
    
    
}
