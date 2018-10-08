package com.intersog.controller;


import com.intersog.domain.Client;
import com.intersog.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/data")
public class ClientController {

    @Value("${file.path}")
    private String filePath;

    @Autowired
    private ClientRepo clientRepo;

    private static final Logger log = Logger.getLogger(ClientController.class.getName());

    @GetMapping("/{readFrom}/**")
    public List<Client> getFilm(@PathVariable String readFrom,
                          HttpServletRequest request) throws IOException, ParseException {

        log.info(request.getRequestURL().toString());

        List<String> list = new ArrayList<>(Arrays.asList(request.getServletPath().split("/")));
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);

        // create filter
        Map<String,String> filterMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++){
            filterMap.put(list.get(i), list.get(i+1));
            i++;
        }

        List<Client> clientsList = null;

        switch (readFrom){
            case "db": clientsList = filterListClient(filterMap, clientRepo.findAll()); break;
            case "file": clientsList = filterListClient(filterMap, readCsvFile()); break;
        }

        return clientsList;
    }


    private List<Client> filterListClient(Map<String, String> filterMap, List<Client> clientList){

        for (Map.Entry entry: filterMap.entrySet()) {

            List<Client> sortList = new ArrayList<>();

            String key = entry.getKey().toString().toLowerCase();
            String value = entry.getValue().toString().toLowerCase();


            if (StringUtils.isEmpty(key) || StringUtils.isEmpty(value)){
                continue;
            }

            for (Client client: clientList) {

                switch (key){
                    case "id": if (client.getID() != null && client.getID()== Long.parseLong(value)) sortList.add(client); break;
                    case "status": if (client.getStatus() != null && client.getStatus().toLowerCase().indexOf(value)> -1) sortList.add(client); break;
                    case "amount": if (client.getAmount() != null && client.getAmount() == Double.parseDouble(value)) sortList.add(client); break;
                    case "applicationsignedhour": if (client.getApplicationSignedHour() != null && client.getApplicationSignedHour()== Long.parseLong(value)) sortList.add(client); break;
                    case "applicationsignedweekday": if (client.getApplicationSignedWeekday() != null && client.getApplicationSignedWeekday() == Long.parseLong(value)) sortList.add(client); break;
                    case "city": if (client.getCity() != null && client.getCity().toLowerCase().indexOf(value)> -1) sortList.add(client); break;
                    case "country": if (client.getCountry() != null && client.getCountry().toLowerCase().indexOf(value)> -1) sortList.add(client); break;
                    case "creditScoreesequifaxrisk": if (client.getCreditScoreEsEquifaxRisk() != null && client.getCreditScoreEsEquifaxRisk().toLowerCase().indexOf(value)> -1) sortList.add(client); break;
                    case "debttoincome": if (client.getDebtToIncome() != null && client.getDebtToIncome()== Double.parseDouble(value)) sortList.add(client); break;
                    case "education": if (client.getEducation() != null && client.getEducation() == Long.parseLong(value)) sortList.add(client); break;
                    case "employmentdurationcurrentemployer": if (client.getEmploymentDurationCurrentEmployer() != null && client.getEmploymentDurationCurrentEmployer().toLowerCase().indexOf(value)> -1) sortList.add(client); break;
                    case "employmentposition": if (client.getEmploymentPosition() != null && client.getEmploymentPosition().toLowerCase().indexOf(value)> -1) sortList.add(client); break;
                    case "employmentstatus": if (client.getEmploymentStatus() != null && client.getEmploymentStatus()== Long.parseLong(value)) sortList.add(client); break;
                    case "existingliabilities":if (client.getExistingLiabilities() != null && client.getExistingLiabilities()== Long.parseLong(value)) sortList.add(client); break;
                    case "gender": if (client.getGender() != null && client.getGender() == Long.parseLong(value)) sortList.add(client); break;
                    case "homeownershiptype": if (client.getHomeOwnershipType() != null && client.getHomeOwnershipType()== Long.parseLong(value)) sortList.add(client); break;
                    case "incomefromprincipalemployer": if (client.getIncomeFromPrincipalEmployer() != null && client.getIncomeFromPrincipalEmployer() == Long.parseLong(value)) sortList.add(client); break;
                    case "incometotal": if (client.getIncomeTotal() != null && client.getIncomeTotal() == Long.parseLong(value)) sortList.add(client); break;
                    case "interestrate": if (client.getInterestRate() != null && client.getInterestRate() == Double.parseDouble(value)) sortList.add(client); break;
                    case "loanduration": if (client.getLoanDuration() != null && client.getLoanDuration() == Long.parseLong(value)) sortList.add(client); break;
                    case "maritalstatus": if (client.getMaritalStatus() != null && client.getMaritalStatus() == Long.parseLong(value)) sortList.add(client); break;
                    case "newcreditcustomer": if (client.getNewCreditCustomer() != null && client.getNewCreditCustomer()) sortList.add(client); break;
                    case "noofpreviousloansbeforeloan": if (client.getNoOfPreviousLoansBeforeLoan() != null && client.getNoOfPreviousLoansBeforeLoan() == Long.parseLong(value)) sortList.add(client); break;
                    case "occupationarea": if (client.getOccupationArea() != null && client.getOccupationArea() == Long.parseLong(value)) sortList.add(client); break;
                    case "useofloan": if (client.getUseOfLoan() != null && client.getUseOfLoan() == Long.parseLong(value)) sortList.add(client); break;
                    case "verificationtype": if (client.getVerificationType() != null && client.getVerificationType() == Long.parseLong(value)) sortList.add(client); break;
                    case "workexperience": if (client.getWorkExperience() != null && client.getWorkExperience().toLowerCase().indexOf(value)> -1) sortList.add(client); break;
                    case "previousscore": if (client.getPreviousScore() != null && client.getPreviousScore() == Double.parseDouble(value)) sortList.add(client); break;
                    case "defaulted": if (client.getDefaulted() != null && client.getDefaulted()) sortList.add(client); break;
                    case "defaultdate": if (client.getDefaultDate() != null && client.getDefaultDate().toLowerCase().indexOf(value)> -1) sortList.add(client); break;
                }

            }

            clientList = sortList;

        }

        return clientList;
    }



    public List<Client> readCsvFile() throws IOException, ParseException {

        List<String> lines  = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        lines.remove(0);
        List<Client> clientsList = new ArrayList<>();

        Scanner scanner = null;

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        for (String line: lines) {

            Client client = new Client();

            scanner = new Scanner(line);
            scanner.useDelimiter(",");

            int index = 0;
            while (scanner.hasNext()) {

                String data = scanner.next();

                if (StringUtils.isEmpty(data)){
                    index++;
                    break;
                }

                switch (index){
                    case 0: client.setID(Long.parseLong(data));break;
                    case 1: client.setStatus(data);break;
                    case 2: client.setAmount(Double.parseDouble(data));break;
                    case 3: client.setApplicationSignedHour(Long.parseLong(data));break;
                    case 4: client.setApplicationSignedWeekday(Long.parseLong(data));break;
                    case 5: client.setCity(data);break;
                    case 6: client.setCountry(data);break;
                    case 7: client.setCreditScoreEsEquifaxRisk(data);break;
                    case 8: client.setDateOfBirth(format.parse(data)); break; //
                    case 9: client.setDebtToIncome(Double.parseDouble(data));break;
                    case 10: client.setEducation(Long.parseLong(data));break;
                    case 11: client.setEmploymentDurationCurrentEmployer(data);break; //
                    case 12: client.setEmploymentPosition(data);break;
                    case 13: client.setEmploymentStatus(Long.parseLong(data));break;
                    case 14: client.setExistingLiabilities(Long.parseLong(data));break;
                    case 15: client.setGender(Long.parseLong(data));break;
                    case 16: client.setHomeOwnershipType(Long.parseLong(data));break;
                    case 17: client.setIncomeFromPrincipalEmployer(Long.parseLong(data));break;
                    case 18: client.setIncomeTotal(Long.parseLong(data));break;
                    case 19: client.setInterestRate(Double.parseDouble(data));break;
                    case 20: client.setLoanDate(format.parse(data));break;//
                    case 21: client.setLoanDuration(Long.parseLong(data));break;
                    case 22: client.setMaritalStatus(Long.parseLong(data));break;
                    case 23: client.setNewCreditCustomer(Boolean.parseBoolean(data));break;
                    case 24: client.setNoOfPreviousLoansBeforeLoan(Long.parseLong(data));break;
                    case 25: client.setOccupationArea(Long.parseLong(data));break;
                    case 26: client.setUseOfLoan(Long.parseLong(data));break;
                    case 27: client.setVerificationType(Long.parseLong(data));break;
                    case 28: client.setWorkExperience(data);break;
                    case 29: client.setPreviousScore(Double.parseDouble(data));break;
                    case 30: client.setDefaulted(Boolean.parseBoolean(data));break;
                    case 31: client.setDefaultDate(data);break;
                }

                index++;
            }

            clientsList.add(client);

        }

        System.out.println(clientsList.size());

        return clientsList;

    }


}
