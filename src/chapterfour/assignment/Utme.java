package chapterfour.assignment;

public class Utme {

    public int testDriller(int perCopies) {
        if (perCopies >= 1 && perCopies <= 4)
            perCopies = perCopies * 2000;

         else if (perCopies >= 5 && perCopies <= 9)
                perCopies = perCopies * 1800;

            else if (perCopies >= 10 && perCopies <= 29)
                perCopies = perCopies * 1600;

            else if (perCopies >= 30 && perCopies <= 49)
                perCopies = perCopies * 1500;
         else if (perCopies >= 50 && perCopies <= 99)
            perCopies = perCopies * 1300;

        else if (perCopies >= 100 && perCopies <= 199)
            perCopies = perCopies * 1200;

        else if (perCopies >= 200 && perCopies <= 499)
            perCopies = perCopies * 1100;

        else if (perCopies >= 500)
            perCopies = perCopies * 1000;

        else if (perCopies >= 100 && perCopies >= 199)
            perCopies = perCopies * 1200;

        return perCopies;

        }
    }
