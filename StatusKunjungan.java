/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ASUS
 */
public class StatusKunjungan {
    private String key;
    private String value;

    public StatusKunjungan(String key) throws Exception {
        if(Integer.parseInt(key) > 1 | Integer.parseInt(key) < 0){
            throw new Exception();
        }
        else{
            this.key = key;
            this.value = getValue();
        }
    }
    
    public String getKey() {
        return key;
    }

    public String getValue() {
        switch(key){
                case "1"->{
                    value = ("Sudah dikunjungi/ mendapatkan informasi dari pihak lain(dinas,dll)");
                }
                case"0" -> {
                    value = ("Belum dikonfirmasi keberadaannya");
                }

                default ->{
                    value = ("Type Mismatch");
                }
            }
        return value;
    }

    @Override
    public String toString() {
        return "\n<Keterangan Status Kunjungan>" + 
                "\nKey\t: " + key + 
                "\nValue\t: " + value;
    }
}
