package com.Bhc_Ops.Bhc_API.PartA;

import com.Bhc_Ops.Bhc_API.model.Bale;

import java.util.List;

public class QuestionTwo {
    List<Bale>  reworks(List<Bale> bales){
       // for(Bale b: bales){
            for(int i=0; i<bales.size()-1; i++) {
                System.out.println("");
                if (bales.get(i).getGrade().equals(bales.get(i + 1).getGrade()) && (bales.get(i).getMass() + bales.get(i + 1).getMass())<=120f) {
                    System.out.println("Barcode : "+ bales.get(i).getBarcode() + " Grade : "+ bales.get(i).getGrade() + " Grower Number : "+ bales.get(i).getGrowerNumber() + " Mass : "+ bales.get(i).getMass() + " Price : "+ bales.get(i).getPrice());
                    System.out.println("Barcode : "+ bales.get(i + 1).getBarcode() + " Grade : "+ bales.get(i + 1).getGrade() + " Grower Number : "+ bales.get(i + 1).getGrowerNumber() + " Mass : "+ bales.get(i + 1).getMass() + " Price : "+ bales.get(i + 1).getPrice());
                    System.out.println("New Average Price : "+ (bales.get(i).getPrice() + bales.get(i + 1).getPrice())/2);
                }else {
                    System.out.println("Rejected Bale :");
                    System.out.println("Barcode : "+ bales.get(i).getBarcode() + " Grade : "+ bales.get(i).getGrade() + " Grower Number : "+ bales.get(i).getGrowerNumber() + " Mass : "+ bales.get(i).getMass() + " Price : "+ bales.get(i).getPrice());
                }
            }
      return null;
    }
}
