package com.xworkz.governmentjobs.jobmaterial;

public class GovernmentJobs {
    private String jobTitle;              // Title of the government job (e.g., IAS Officer, Police Inspector)
    private String department;            // Government department (e.g., Home Affairs, Finance)
    private int salary;                   // Monthly salary in INR
    private boolean isPermanent;          // True if the job is permanent
    private int vacancyCount;             // Number of vacancies available
    private String applicationDeadline;   // Deadline for job application submission
    private String eligibilityCriteria;   // Criteria required to apply for the job

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean getIsPermanent() {
        return isPermanent;
    }
    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }

    public int getVacancyCount() {
        return vacancyCount;
    }
    public void setVacancyCount(int vacancyCount) {
        this.vacancyCount = vacancyCount;
    }

    public String getApplicationDeadline() {
        return applicationDeadline;
    }
    public void setApplicationDeadline(String applicationDeadline) {
        this.applicationDeadline = applicationDeadline;
    }

    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }
    public void setEligibilityCriteria(String eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }
}
