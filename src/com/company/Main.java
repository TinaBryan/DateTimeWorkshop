package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/DD/YY HH:mm:ss");

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        main.getDate();

    }
    private void getDate() {
        Calendar calendar = Calendar.getInstance();
        //System.out.println(calendar);
        //dateFormat.format(calendar);
        System.out.println(dateFormat.format(calendar.getTime()));

        calendar.add(Calendar.DAY_OF_YEAR, 7);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
