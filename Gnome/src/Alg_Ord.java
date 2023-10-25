package aula;

public class Alg_Ord {

	public static Integer[] gnomeSort(Integer[] array){
		int num [] = new int[10];
		  int pivout = 0;
		  int aux;
		  while(pivout<(array.length-1)){
		    if(array[pivout]>array[pivout+1]){
		      aux = array[pivout];
		      array[pivout] = array[pivout+1];
		      array[pivout+1] = aux;
		      if(pivout>0){
		        pivout-=2;
		      }
		    }
		    pivout++;
		  }
		  return array;
		}}