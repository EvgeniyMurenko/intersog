package com.intersog.domain;

import javax.persistence.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String status;
    private Double amount;
    private Long applicationSignedHour;
    private Long applicationSignedWeekday;
    private String city;
    private String country;
    private String creditScoreEsEquifaxRisk;
    private Date dateOfBirth;
    private Double debtToIncome;
    private Long education;
    private String employmentDurationCurrentEmployer;
    private String employmentPosition;
    private Long employmentStatus;
    private Long existingLiabilities;
    private Long gender;
    private Long homeOwnershipType;
    private Long incomeFromPrincipalEmployer;
    private Long incomeTotal;
    private Double interestRate;
    private Date loanDate;
    private Long loanDuration;
    private Long maritalStatus;
    private Boolean newCreditCustomer;
    private Long noOfPreviousLoansBeforeLoan;
    private Long occupationArea;
    private Long useOfLoan;
    private Long verificationType;
    private String workExperience;
    private Double previousScore;
    private Boolean defaulted;
    private String defaultDate;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getApplicationSignedHour() {
        return applicationSignedHour;
    }

    public void setApplicationSignedHour(Long applicationSignedHour) {
        this.applicationSignedHour = applicationSignedHour;
    }

    public Long getApplicationSignedWeekday() {
        return applicationSignedWeekday;
    }

    public void setApplicationSignedWeekday(Long applicationSignedWeekday) {
        this.applicationSignedWeekday = applicationSignedWeekday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCreditScoreEsEquifaxRisk() {
        return creditScoreEsEquifaxRisk;
    }

    public void setCreditScoreEsEquifaxRisk(String creditScoreEsEquifaxRisk) {
        this.creditScoreEsEquifaxRisk = creditScoreEsEquifaxRisk;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getDebtToIncome() {
        return debtToIncome;
    }

    public void setDebtToIncome(Double debtToIncome) {
        this.debtToIncome = debtToIncome;
    }

    public Long getEducation() {
        return education;
    }

    public void setEducation(Long education) {
        this.education = education;
    }

    public String getEmploymentDurationCurrentEmployer() {
        return employmentDurationCurrentEmployer;
    }

    public void setEmploymentDurationCurrentEmployer(String employmentDurationCurrentEmployer) {
        this.employmentDurationCurrentEmployer = employmentDurationCurrentEmployer;
    }

    public String getEmploymentPosition() {
        return employmentPosition;
    }

    public void setEmploymentPosition(String employmentPosition) {
        this.employmentPosition = employmentPosition;
    }

    public Long getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(Long employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Long getExistingLiabilities() {
        return existingLiabilities;
    }

    public void setExistingLiabilities(Long existingLiabilities) {
        this.existingLiabilities = existingLiabilities;
    }

    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public Long getHomeOwnershipType() {
        return homeOwnershipType;
    }

    public void setHomeOwnershipType(Long homeOwnershipType) {
        this.homeOwnershipType = homeOwnershipType;
    }

    public Long getIncomeFromPrincipalEmployer() {
        return incomeFromPrincipalEmployer;
    }

    public void setIncomeFromPrincipalEmployer(Long incomeFromPrincipalEmployer) {
        this.incomeFromPrincipalEmployer = incomeFromPrincipalEmployer;
    }

    public Long getIncomeTotal() {
        return incomeTotal;
    }

    public void setIncomeTotal(Long incomeTotal) {
        this.incomeTotal = incomeTotal;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Long getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(Long loanDuration) {
        this.loanDuration = loanDuration;
    }

    public Long getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Long maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Boolean getNewCreditCustomer() {
        return newCreditCustomer;
    }

    public void setNewCreditCustomer(Boolean newCreditCustomer) {
        this.newCreditCustomer = newCreditCustomer;
    }

    public Long getNoOfPreviousLoansBeforeLoan() {
        return noOfPreviousLoansBeforeLoan;
    }

    public void setNoOfPreviousLoansBeforeLoan(Long noOfPreviousLoansBeforeLoan) {
        this.noOfPreviousLoansBeforeLoan = noOfPreviousLoansBeforeLoan;
    }

    public Long getOccupationArea() {
        return occupationArea;
    }

    public void setOccupationArea(Long occupationArea) {
        this.occupationArea = occupationArea;
    }

    public Long getUseOfLoan() {
        return useOfLoan;
    }

    public void setUseOfLoan(Long useOfLoan) {
        this.useOfLoan = useOfLoan;
    }

    public Long getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(Long verificationType) {
        this.verificationType = verificationType;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public Double getPreviousScore() {
        return previousScore;
    }

    public void setPreviousScore(Double previousScore) {
        this.previousScore = previousScore;
    }

    public Boolean getDefaulted() {
        return defaulted;
    }

    public void setDefaulted(Boolean defaulted) {
        this.defaulted = defaulted;
    }

    public String getDefaultDate() {
        return defaultDate;
    }

    public void setDefaultDate(String defaultDate) {
        this.defaultDate = defaultDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ID=" + ID +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", applicationSignedHour=" + applicationSignedHour +
                ", applicationSignedWeekday=" + applicationSignedWeekday +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", creditScoreEsEquifaxRisk='" + creditScoreEsEquifaxRisk + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", debtToIncome=" + debtToIncome +
                ", education=" + education +
                ", employmentDurationCurrentEmployer='" + employmentDurationCurrentEmployer + '\'' +
                ", employmentPosition='" + employmentPosition + '\'' +
                ", employmentStatus=" + employmentStatus +
                ", existingLiabilities=" + existingLiabilities +
                ", gender=" + gender +
                ", homeOwnershipType=" + homeOwnershipType +
                ", incomeFromPrincipalEmployer=" + incomeFromPrincipalEmployer +
                ", incomeTotal=" + incomeTotal +
                ", interestRate=" + interestRate +
                ", loanDate=" + loanDate +
                ", loanDuration=" + loanDuration +
                ", maritalStatus=" + maritalStatus +
                ", newCreditCustomer=" + newCreditCustomer +
                ", noOfPreviousLoansBeforeLoan=" + noOfPreviousLoansBeforeLoan +
                ", occupationArea=" + occupationArea +
                ", useOfLoan=" + useOfLoan +
                ", verificationType=" + verificationType +
                ", workExperience='" + workExperience + '\'' +
                ", previousScore=" + previousScore +
                ", defaulted=" + defaulted +
                ", defaultDate='" + defaultDate + '\'' +
                '}';
    }
}

