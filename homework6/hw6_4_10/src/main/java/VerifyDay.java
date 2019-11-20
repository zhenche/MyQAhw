class VerifyDay {

    public enum DayOfWeek {
        SUNDAY,
        MONDAY
    }

    public static void main(String[] args) {
        DayOfWeek dayOfWeek =  DayOfWeek.SUNDAY;

        switch (dayOfWeek) {

            case SUNDAY:
                System.out.println("1");break;
            case MONDAY:
                System.out.println("2");break;
        }
    }
}
