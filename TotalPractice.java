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

                int[] num = {14, 56, 9, 45};
                int temp;

                for (int i = 0; i<num.length-1; i++){

                    for (int j = i+1; j<num.length-1-i; j++){

                        if(num[j+1] < num[j]){

                            temp = num[j];
                            num[j] = num[j+1];
                            num[j+1] = temp;
                        }
                    }
                }

                for (int a:num){

                    System.out.println(a);
                }

            }
    }
