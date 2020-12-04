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
public class HardRock extends MusicGenre implements PopRock, ProgressiveRock, PsychedelicRock{
    public void genreHardRock(String artistName) {
        System.out.println("Hard Rock");
    }
    
    @Override
    public void genrePopRock(String artistName) {
        System.out.println("Pop Rock");
    }
    
    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println("Progressive Rock");
    }
    
    @Override
    public void genrePsychedellicRock(String artistName) {
        System.out.println("Psychedellic Rock");
    }
}
