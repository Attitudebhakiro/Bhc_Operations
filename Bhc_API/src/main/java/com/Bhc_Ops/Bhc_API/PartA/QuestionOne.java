package com.Bhc_Ops.Bhc_API.PartA;

import com.Bhc_Ops.Bhc_API.model.Bale;
import com.Bhc_Ops.Bhc_API.model.Debt;

import java.text.DecimalFormat;
import java.util.List;

public class QuestionOne {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    // Required 1
    float massSold = 0.0f;
    int totalBales = 0;
    float totalDebts = 0.0f;
    float totalInterest = 0.0f;
    float totalCommission = 0.0f;



    float CalculateGross(List<Bale> bales){
       float grossValue = 0.0f;

       for(Bale el: bales){
           grossValue += el.getMass() * el.getPrice();
           massSold += el.getMass();
           totalBales++;
           }
       return  grossValue;
    }

   // Required 2
    float TAX_1(Float grossVal){
        return (float) ((0.3/100)*grossVal);
    }
    float TAX_2(Float grossV, Float ms){
      return (float) ((grossV*1.5 + ms*2)/100);
    }

    float TAX_3(int numberOfbales){
        return (float) (5.00*numberOfbales);
    }

    // Required 3
    float deductDebtItem(float grossVl, Debt debt){
        float interest = (debt.interestRate/100)*debt.amount;
        float commission = (float) ((0.5/100)*debt.amount);
       return grossVl -(debt.amount + interest + commission);
    }

    // Required 4

    float deductDebtItems(float grossVl, List<Debt> debts){

        for(Debt debtitem: debts) {
            totalInterest += (debtitem.interestRate / 100) * debtitem.amount;
            totalCommission += (float) ((0.5 / 100) * debtitem.amount);
            totalDebts += debtitem.amount;
        }
        System.out.println("Total debts: "+totalDebts+ " Total Interest : "+totalInterest+ " Total Commission : "+totalCommission);
        return grossVl -(totalDebts + totalInterest + totalCommission);
    }

    // Required 5
    float applyRebate(float grossvl, float tobaccoSold){
        float REBATE_1 = (5*tobaccoSold)/100;
        float REBATE_2 = 10 + (2*grossvl)/100;
        return REBATE_1 + REBATE_2;

    }

    // Required 6

    float ProcessSale(List<Bale> bls, List<Debt> dts, float remainingNet){
        System.out.println("Bales Processed");
        for(Bale b: bls){
            System.out.println("Barcode : "+ b.getBarcode() + " Grade : "+ b.getGrade() + " Grower Number : "+ b.getGrowerNumber() + " Mass : "+ b.getMass() + " Price : "+ b.getPrice());
        }

        System.out.println("Debts Processed");
        for (Debt d: dts) {
            System.out.println("Amount : "+d.amount+ " Priority: "+ d.priority+ " Interest Rate : "+d.interestRate );

        }

        float netproceeds = remainingNet;
        System.out.println("\t Net Proceeds due to the grower : "+decfor.format(netproceeds));
        return netproceeds;
    }
}
