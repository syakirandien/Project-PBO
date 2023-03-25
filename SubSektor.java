/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaskelompok;

import java.util.ArrayList;

/**
 *
 * @author ASUS TUF
 */
public class SubSektor implements KeyValueSet
{
    public TanamanPangan tampan;
    public ArrayList<Perkebunan> kebun;
    public Hortikultura horti;
    public Peternakan ternak;
    public Kehutanan hutan;
    public Perikanan ikan;

    public SubSektor(TanamanPangan tampan, ArrayList<Perkebunan> kebun, Hortikultura horti, Peternakan ternak, Kehutanan hutan, Perikanan ikan) {
        this.tampan = tampan;
        this.kebun = kebun;
        this.horti = horti;
        this.ternak = ternak;
        this.hutan = hutan;
        this.ikan = ikan;
    }

    
    
    @Override
    public String getKeyValueSet() {
        ArrayList<String> valuekebun = new ArrayList<>();
        for(Perkebunan i:kebun){
            valuekebun.add(i.getValue());
        }
        return  "\n Tanaman Pangan      :  " + tampan.getValue() +
                "\n Hortikultura        :  " + horti.getValue() +
                "\n Perkebunan          : " + valuekebun +
                "\n Peternakan          :  " + ternak.getValue() +
                "\n Kehutanan           :  " + hutan.getValue() +
                "\n Perikanan           :  " + ikan.getValue() ;
    }
}
