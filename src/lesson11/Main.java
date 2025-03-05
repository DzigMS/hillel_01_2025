package lesson11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Doctor doctor = new Doctor("Mike", "Psyholog");
//        Surgery surgery = new Surgery("Greg");
//
//        doctor.examination();
//
//        surgery.examination();
//        surgery.surgery();

        GeneralDoctor generalDoctor = new GeneralDoctor("Gregory", "LOR");
        generalDoctor.surgery();
        generalDoctor.learnSurgery();
        generalDoctor.surgery();

        GeneralDoctor generalDoctor1 = new GeneralDoctor.GeneralDoctorBuilder()
                .setName("Greg")
                .setSpecialization("someSpecialization")
                .build();

        System.out.println(generalDoctor1.getName());
    }
}
