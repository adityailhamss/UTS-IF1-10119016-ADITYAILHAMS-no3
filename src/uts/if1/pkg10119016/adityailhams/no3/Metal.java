/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119016.adityailhams.no3;

/**
 *
 * @author aditi
 */
public class Metal extends MusicGenre implements Punk, HeavyMetal {
    public void genreMetal(String artistName) {
        System.out.println("Metal");
    }
    
    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println("Heavy Metal");
    }
    
    @Override
    public void genrePunk(String artistName) {
        System.out.println("Punk");
    }
    
    public void genreGrunge(String artistName) {
        System.out.println("Grunge");
    }
}