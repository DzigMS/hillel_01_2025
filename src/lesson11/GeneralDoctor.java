package lesson11;

public class GeneralDoctor {
    private String name;
    private String specialization;
    private Surgery surgeryPossibility;

    public GeneralDoctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    private GeneralDoctor() {}

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void surgery() {
        if (surgeryPossibility == null) {
            System.out.println("I can't surgery");
            return;
        }
        surgeryPossibility.surgery();
    }

    public void learnSurgery() {
        surgeryPossibility = new Surgery();
    }

    private class Surgery {
        public void surgery(){
            System.out.println("Processing surgery");
        }
    }

    public static class GeneralDoctorBuilder {
        private GeneralDoctor generalDoctor;

        public GeneralDoctorBuilder() {
            generalDoctor = new GeneralDoctor();
        }

        public GeneralDoctorBuilder setName(String name) {
            generalDoctor.name = name;
            return this;
        }

        public GeneralDoctorBuilder setSpecialization(String specialization) {
            generalDoctor.specialization = specialization;
            return this;
        }

        public GeneralDoctor build() {
            if (generalDoctor.name == null && generalDoctor.specialization == null) {
                throw new IllegalArgumentException("Some fields missing");
            }
            return generalDoctor;
        }
    }
}
