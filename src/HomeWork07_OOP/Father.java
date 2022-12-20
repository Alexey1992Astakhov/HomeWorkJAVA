package HomeWork07_OOP;

public interface Father {

    void childrenToSchool(String time);
    void goingToWork();
    void drivingFromWork();
    void childOutOfSchool();

    int childID();
    default int idChild(){
        return 1;
    }
    static int idChildUniversal(){
        return 10;
    }

}
