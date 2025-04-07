package com.xworkz.governmentjobs;

import com.xworkz.governmentjobs.jobmaterial.GovernmentJobs;

public class GovernmentJobsRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Government Job
        GovernmentJobs job1 = new GovernmentJobs();
        job1.setJobTitle("IAS Officer");
        job1.setDepartment("Union Public Service Commission (UPSC)");
        job1.setSalary(100000);
        job1.setPermanent(true);
        job1.setVacancyCount(180);
        job1.setApplicationDeadline("30 June 2023");
        job1.setEligibilityCriteria("Bachelor's Degree with age limit between 21-32 years.");

        System.out.println("Job Title: " + job1.getJobTitle());
        System.out.println("Department: " + job1.getDepartment());
        System.out.println("Salary: " + job1.getSalary() + " INR");
        System.out.println("Permanent: " + job1.getIsPermanent());
        System.out.println("Vacancy Count: " + job1.getVacancyCount());
        System.out.println("Application Deadline: " + job1.getApplicationDeadline());
        System.out.println("Eligibility Criteria: " + job1.getEligibilityCriteria());

        // Second Government Job
        GovernmentJobs job2 = new GovernmentJobs();
        job2.setJobTitle("Police Inspector");
        job2.setDepartment("State Police Department");
        job2.setSalary(80000);
        job2.setPermanent(true);
        job2.setVacancyCount(500);
        job2.setApplicationDeadline("15 July 2023");
        job2.setEligibilityCriteria("Graduation Degree with physical fitness standards.");

        System.out.println("\nJob Title: " + job2.getJobTitle());
        System.out.println("Department: " + job2.getDepartment());
        System.out.println("Salary: " + job2.getSalary() + " INR");
        System.out.println("Permanent: " + job2.getIsPermanent());
        System.out.println("Vacancy Count: " + job2.getVacancyCount());
        System.out.println("Application Deadline: " + job2.getApplicationDeadline());
        System.out.println("Eligibility Criteria: " + job2.getEligibilityCriteria());

        System.out.println("Main Ended");
    }
}

