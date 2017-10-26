/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Utility;

import java.awt.Component;
import java.util.Hashtable;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rbhaskar
 */
public class Utility {
    
static public String checkEmptyFields(Hashtable<String,String> data)
{
    String message="";
    for(String key: data.keySet())
    {
        if(data.get(key).length()==0)
        {
        message=message+ " please enter value for "+ key+"\n";
        }
    }
    return message;
}
static public Hashtable<String,String> readData(JPanel panel)
{
    Hashtable<String,String> data= new Hashtable<String,String>();
    for(Component comp : panel.getComponents())
    {
        if(comp instanceof JTextField)
        {
            data.put(comp.getName(), ((JTextField) comp).getText());
        }
    }
    return data;
}


}
