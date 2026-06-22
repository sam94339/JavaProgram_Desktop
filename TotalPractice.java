import java.lang.invoke.VarHandle;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeoutException;

public class TotalPractice {
    public static void main(String args[]) {

        int a = 10; int b = 20;

        a = a+b;
        b = a -b;
        a = a - b;

        System.out.println(a + " "+ b);

    }
}

