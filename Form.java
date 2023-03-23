//package mform.form;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kelompok 7 2KS7
 * 
 * Seizra Aulia Salsabila
 * Shofiatul Najmi
 * Soraya Afkarina Mumtazah	
 * Sultan Hadi Prabowo
 * Syakira Rizky Andini
 * Yoga Pratama
 */

public abstract class Form implements Validasi {
    //Properties error messages
    List<String> errorMessage = new ArrayList<String>();
    

    //method abstract form
    public abstract boolean save();
    public abstract void headerForm();
    public abstract void print();
    public abstract void reset();

    //get dan add error message
    public List<String> getErrorMessage() {
        return this.errorMessages;
    }

    public void addErrorMesssage(String message) {
        this.errorMessages.add(message);
    } 
}
