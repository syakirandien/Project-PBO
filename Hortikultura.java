/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaskelompok;

import java.util.HashMap;

/**
 *
 * @author ASUS TUF
 */
public class Hortikultura implements KeyValue{
         private String key;
    private String value;

    HashMap<String, String> Input = new HashMap<String, String>();

    public Hortikultura(String key) throws Exception {
        setKeyValue();
       
            Object[] keys = Input.keySet().toArray();
            int i = 0;
            while (i < keys.length) {
                if (key.equals(keys[i].toString())) {
                    this.key = keys[i].toString();
                    break;
                }
                ++i;
            }

            if (i == keys.length) {
                throw new Exception("Inputan tidak valid");

            }
   
    }

     @Override
    public void setKeyValue() {
        Input.put("0", "Tidak Ada");
        Input.put("1", "Ada");
    }

     @Override
    public String getKey() {
        return key;
    }

     @Override
    public String getValue() {
        return Input.get(key);
    }
}
