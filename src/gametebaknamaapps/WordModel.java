/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebaknamaapps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class WordModel {
    private String nama;
    private String hint;
    private String jawaban;

    /**
     * @return the nama
     */
    
    
    public WordModel(String nama, String hint) {
        this.nama = nama;
        this.hint = hint;
        
    }

    public WordModel(String nama, String hint, String jawaban) {
        this.nama = nama;
        this.hint = hint;
        this.jawaban = jawaban;
    }
    
    

    public WordModel() {
    }

    public String acakhuruf(){
        nama = nama.toUpperCase();
        String[] arrWord = nama.split("");
        List<String> huruf = Arrays.asList(arrWord);
        Collections.shuffle(huruf);
        
        StringBuilder sb = new StringBuilder();
        for (String string : huruf) {
            sb.append(string.trim());
            
        }return sb.toString();
        
        
    }
    public boolean cekjawaban(){
        boolean tes;
        if (jawaban.equalsIgnoreCase(nama)) {
            tes = true;
        }
        else 
            tes = false;
        return tes;
        
    }
    
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }
    
    
}
