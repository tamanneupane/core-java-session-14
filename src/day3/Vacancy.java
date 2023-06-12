package day3;

import java.util.List;

public class Vacancy {

    String positionAppliedFor;
    String appliedDepartment;
    String preferredBranch;

    PersonalInformation information;

    Address permanentAddress;
    Address temporaryAddress;

    boolean isTemporarySameAsPermanent;

    List<Education> educationList;

    List<Training> trainingList;

    CurrentExperience currentExperience;

    List<Experience> experienceList;

    String application;

    boolean applicationConfirmation;

    String payloadVerificationValue;

    public static void main(String[] args) {
        Vacancy vacancy1 = new Vacancy();
        Vacancy vacancy2 = new Vacancy();
        Vacancy vacancy3 = new Vacancy();
        Vacancy vacancy4 = new Vacancy();
        Vacancy vacancy5 = new Vacancy();
    }

    /*
    Position Applied For (String)
    Applied Department (String)
    Preferred Branch (String)

    Personal Information

    Permanent Address (Address)
    Temporary Address (Address)

    Same as Permanent (boolean)

    Educations (List of Education)

    Trainings (List of Training)

    Current Experience

    Experiences (List of Experience)

    References (List of Reference)

    Application - abc / def (String)

    Application Confirmation (Boolean)

    Hash Value - dajhgsdjhagd= (Payload verification value)
    */

    /*
        data_type variable_name = value; // Declare and define same place

        data_type variable_name; // Declaration
        variable_name = value; // Definition

        int a = 2;

        While writing variable name follow the same practice as a class name
        but the first letter should be small.

        String educationLevel = "BE";

     */
}
