package src.StatisticalSystem;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int st_number;

        String st_number_string;

        st_number_string= JOptionPane.showInputDialog("Enter the number of student :");
        st_number = Integer.parseInt(st_number_string);

        int  array[]  =new int[st_number];
        int  age_square_array[]  =new int[st_number];




        int iterator=0;

        for(iterator=0;iterator<st_number;iterator++){

            st_number_string= JOptionPane.showInputDialog((iterator+1)+" th student age :");
            array[iterator]=Integer.parseInt(st_number_string);

            age_square_array[iterator]= array[iterator]*array[iterator];

        }
        int sum_of_age=0;
       int sum_of_age_square=0;

        for(iterator=0;iterator<st_number;iterator++){

            sum_of_age = sum_of_age + array[iterator];

        }


        for(iterator=0;iterator<st_number;iterator++){
            sum_of_age_square = sum_of_age_square + age_square_array[iterator];
        }

        double student_age_mean = (sum_of_age/st_number);
        double deviation = sum_of_age_square-((Math.pow(sum_of_age,2))/st_number);
        double student_age_standard_deviation = Math.sqrt(deviation/(st_number-1));

        JOptionPane.showMessageDialog(null,"Mean of Students : "+student_age_mean );
        JOptionPane.showMessageDialog(null,"Standard Deviation  of Students : "+student_age_standard_deviation );

    }
}
