package com.Bhc_Ops.Bhc_API.PartA;

import com.Bhc_Ops.Bhc_API.model.Bale;
import com.Bhc_Ops.Bhc_API.model.Debt;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PartAtest {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String[] args) {
        // Question 1 : testing
        // Required 1 : testing
        System.out.println("\n===== Requirement 1 ======\n");
        QuestionOne pa = new QuestionOne();
        Bale bale1 = new Bale("110000011","TMOS", "123456", 2.50f, 115f);
        Bale bale2 = new Bale("110000012","TLOS", "123456", 4.50f, 85f);
        Bale bale3 = new Bale("110000013","TLOS", "123456", 5.50f,95f);

        List<Bale> baleList = new ArrayList<>();
        baleList.add(bale1);
        baleList.add(bale2);
        baleList.add(bale3);


        float gross = pa.CalculateGross(baleList);
        System.out.println("Gross : "+gross);

        // Required 2 : testing
        System.out.println("\n===== Requirement 2 ======\n");
        float massSold = pa.massSold;
        int totalBales = pa.totalBales;
        float totaltax = pa.TAX_1(gross) + pa.TAX_2(gross,massSold)+ pa.TAX_3(totalBales);
        float netAftertaxes = gross-totaltax;
        System.out.println("Net After Taxes : "+decfor.format(netAftertaxes));

        // Required 3 : testing
        System.out.println("\n===== Requirement 3 ======\n");
         Debt debt = new Debt(50,1,10);
         float grossAfterDebtsCommissionTaxes = pa.deductDebtItem(netAftertaxes, debt);
        System.out.println("Gross After Debts and Commission : "+grossAfterDebtsCommissionTaxes);

        // Required 4 : testing
        System.out.println("\n===== Requirement 4 ======\n");
        Debt debt1 = new Debt(50,1,10);
        Debt debt2 = new Debt(100,2,10);
        List<Debt> debts = new ArrayList<>();
        debts.add(debt1);
        debts.add(debt2);

        float totalCommission = pa.totalCommission;
        float totalInterest = pa.totalInterest;
        float totalDebts = pa.totalDebts;
        float remainingGross = pa.deductDebtItems(netAftertaxes, debts);
        System.out.println(" Remaining Gross : "+remainingGross);

        // Required 5 : testing
        System.out.println("\n===== Requirement 5 ======\n");
        float totalRebate = pa.applyRebate(gross,massSold);
        float NetWithRebate = remainingGross + totalRebate;
        System.out.println("Net With Rebate : "+ NetWithRebate);

        // Required 6 : testing
        System.out.println("\n===== Requirement 6 ======\n");
        pa.ProcessSale(baleList, debts, NetWithRebate);

        // Question 2 : testing
        System.out.println("\n=====  Question 2 ======\n");
        Bale bal1 = new Bale("110000011","TMOS", "123456", 2.50f, 115f);
        Bale bal2 = new Bale("110000012","TLOS", "123456", 4.50f, 85f);
        Bale bal3 = new Bale("110000013","TLOS", "123456", 5.50f,95f);
        Bale bal4 = new Bale("110000014","TLOS", "123456", 5.50f,5f);
        Bale bal5 = new Bale("110000015","TLOS", "123456", 4.50f,10f);
        List<Bale> bList = new ArrayList<>();
        bList.add(bal1);
        bList.add(bal2);
        bList.add(bal3);
        bList.add(bal4);
        bList.add(bal5);

        QuestionTwo qt = new QuestionTwo();
        System.out.println(qt.reworks(bList));
    }
}