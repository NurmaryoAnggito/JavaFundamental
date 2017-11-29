/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebaknamaapps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class NamaGenerator {
    
    

    public ArrayList<WordModel> scanBankSoal1(){
    ArrayList<WordModel> banksoal = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("E:/tebak nama.txt"));
            
            
            while (scan.hasNextLine()) {
                String daftar = scan.nextLine();
                String[] data = daftar.split(",");
                WordModel wm = new WordModel(data[0].toUpperCase().trim(), data[1].trim());
                banksoal.add(wm);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return banksoal;
    }
    public ArrayList<WordModel> scanBankSoal2(){
    ArrayList<WordModel> banksoal = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("E:/tebak nama 2.txt"));
            
            
            while (scan.hasNextLine()) {
                String daftar = scan.nextLine();
                String[] data = daftar.split(",");
                WordModel wm = new WordModel(data[0].toUpperCase().trim(), data[1].trim());
                banksoal.add(wm);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return banksoal;
    }
    public ArrayList<WordModel> scanBankSoal3(){
    ArrayList<WordModel> banksoal = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("E:/tebak nama 3.txt"));
            
            
            while (scan.hasNextLine()) {
                String daftar = scan.nextLine();
                String[] data = daftar.split(",");
                WordModel wm = new WordModel(data[0].toUpperCase().trim(), data[1].trim());
                banksoal.add(wm);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return banksoal;
    }
}
