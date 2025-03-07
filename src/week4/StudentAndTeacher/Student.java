
package week4.StudentAndTeacher;

import java.time.Year;

public class Student extends Person {
    private Year yearOfAdmission;
    private int entranceEnglishScore;

    public Student() {
        this.yearOfAdmission = Year.now();
        this.entranceEnglishScore = 0;
    }

    public Year getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(Year yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getEntranceEnglishScore() {
        return entranceEnglishScore;
    }

    public void setEntranceEnglishScore(int entranceEnglishScore) {
        this.entranceEnglishScore = entranceEnglishScore;
    }
    
    
    
}
