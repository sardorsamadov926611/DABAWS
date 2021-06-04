package uz.daba.gateway.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import uz.daba.gateway.transports.court.BankruptArgument;
import uz.daba.gateway.transports.court.entities.BankruptcyTrusteeEntity;
import uz.daba.gateway.transports.court.entities.ClaimantEntity;
import uz.daba.gateway.transports.court.entities.DefendantEntity;
import uz.daba.gateway.transports.court.entities.RepresentorEntity;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println("==date : "+sdf.parse("2020-10-29"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

//        ClaimantEntity entity = new ClaimantEntity();
//        entity.setClaimantOrgName("Claiman org name");
//        entity.setClaimantAddress("Claiman Adres");
//        entity.setClaimantBank("Claiman bank");
//        entity.setClaimantTin("123456789");
//        entity.setClaimantMfo("00521");
//
//        DefendantEntity dentity = new DefendantEntity();
//        dentity.setDefendantOrgName("Claiman org name");
//        dentity.setDefendantAddress("Claiman Adres");
//        dentity.setDefendantBank("Claiman bank");
//        dentity.setDefendantTin("123456789");
//        dentity.setDefendantMfo("00521");
//
//        RepresentorEntity rentity = new RepresentorEntity();
//        rentity.setRepresentorOrgName("Claiman org name");
//        rentity.setRepresentorAddress("Claiman Adres");
//        rentity.setRepresentorBank("Claiman bank");
//        rentity.setRepresentorTin("123456789");
//        rentity.setRepresentorMfo("00521");
//
//        List<BankruptcyTrusteeEntity> tentities = new ArrayList<>();
//        BankruptcyTrusteeEntity tentity = new BankruptcyTrusteeEntity();
//        tentity.setBankruptcyTrusteeAppointDate(new Date());
//        tentity.setBankruptcyTrusteeName("array1");
//        tentities.add(tentity);
//        tentity.setBankruptcyTrusteeAppointDate(new Date());
//        tentity.setBankruptcyTrusteeName("array2");
//        tentities.add(tentity);
//
//        BankruptArgument argument = new BankruptArgument();
//        argument.setClaimId(1);
//        argument.setCaseNumber("123");
//        argument.setJudge("Falonchayev faloncha");
//        argument.setHearingDate(new Date());
//        argument.setHearingDate(new Date());
//        argument.setClaimant(entity);
//        argument.setDefendant(dentity);
//        argument.setRepresentingOrg(rentity);
//        argument.setCourt(1);
//        argument.setDefinitionDate(new Date());
//        argument.setBankruptcyInCommon(1);
//        argument.setBankruptcyDeptAmount(1l);
//        argument.setBankruptcyDeptOnBudget(1l);
//        argument.setBankruptcyReportReturnedDate(new Date());
//        argument.setBankruptcyTrustee(tentities);
//
//        try {
//            new ObjectMapper().writeValue(System.out, argument);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("result --" + new Gson().toJson(argument));


    }
}
