/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileworkshopsorts;

/**
 *
 * @author Training
 */
public interface ISorter {
 
    public <T extends Comparable> void sort(T[] arr);
    
}