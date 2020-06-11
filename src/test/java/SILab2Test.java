import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    private final SILab2 siLab2 = new SILab2();

    @Test
    public void everyStatement(){
        ArrayList<Angle> list = new ArrayList<>();
        ArrayList<Integer> rez = new ArrayList<>();
        list.add(new Angle(40, 60, 30));
        Throwable exception = assertThrows(RuntimeException.class, () -> siLab2.function(list));
        assertEquals("The minutes of the angle are not valid!", exception.getMessage());
        list.clear();
        list.add(new Angle(20, 40, 65));
        exception = assertThrows(RuntimeException.class, () -> siLab2.function(list));
        assertEquals("The seconds of the angle are not valid", exception.getMessage());
        list.clear();
        list.add(new Angle(0, 0, 0));
        rez.add(0);
        assertEquals(rez, siLab2.function(list));
        list.clear();
        list.add(new Angle(360, 0, 0));
        rez.clear();
        rez.add(1296000);
        assertEquals(rez, siLab2.function(list));
        list.clear();
        list.add(new Angle(360, 15,22));
        exception = assertThrows(RuntimeException.class, () -> siLab2.function(list));
        assertEquals("The angle is greater then the maximum", exception.getMessage());
        list.clear();
        list.add(new Angle(522, 45, 13));
        exception = assertThrows(RuntimeException.class, () -> siLab2.function(list));
        assertEquals("The angle is smaller or greater then the minimum", exception.getMessage());
    }



    @Test
    public void everyBranch(){
        ArrayList<Angle> list = new ArrayList<>();
        ArrayList<Integer> rez = new ArrayList<>();
        list.add(new Angle(40, 60, 30));
        Throwable exception = assertThrows(RuntimeException.class, () -> siLab2.function(list));
        assertEquals("The minutes of the angle are not valid!", exception.getMessage());
        list.clear();
        list.add(new Angle(20, 40, 65));
        exception = assertThrows(RuntimeException.class, () -> siLab2.function(list));
        assertEquals("The seconds of the angle are not valid", exception.getMessage());
        list.clear();
        list.add(new Angle(0, 0, 0));
        rez.add(0);
        assertEquals(rez, siLab2.function(list));
        list.clear();
        list.add(new Angle(360, 0, 0));
        rez.clear();
        rez.add(1296000);
        assertEquals(rez, siLab2.function(list));
        list.clear();
        list.add(new Angle(360, 15,22));
        exception = assertThrows(RuntimeException.class, () -> siLab2.function(list));
        assertEquals("The angle is greater then the maximum", exception.getMessage());
        list.clear();
        list.add(new Angle(522, 45, 13));
        exception = assertThrows(RuntimeException.class, () -> siLab2.function(list));
        assertEquals("The angle is smaller or greater then the minimum", exception.getMessage());


    }
}
