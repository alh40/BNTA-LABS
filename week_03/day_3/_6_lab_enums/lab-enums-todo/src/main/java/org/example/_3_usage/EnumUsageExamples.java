package org.example._3_usage;

import org.example._2_basics.LogLevel;
import org.example._2_basics.Month;
import org.example._2_basics.PizzaStatus;

public class EnumUsageExamples {

    public static void main(String[] args) {
        PizzaStatus pizza = PizzaStatus.DELIVERED;

        if(pizza == PizzaStatus.ORDERED){

            System.out.println("Pizza Ordered");
        }else{
            System.out.println("Pizza has already been delivered!");
        }

        Month month = Month.DECEMBER;

        switch(month){

            case JANUARY:
                System.out.println("First Month!");
                break;

            case FEBRUARY:
                System.out.println("Second Month!");
                break;

            case MARCH:
                System.out.println("Third Month!");
                break;

            case APRIL:
                System.out.println("Fourth Month!");
                break;

            case MAY:
                System.out.println("Fifth Month!");
                break;

            case JUNE:
                System.out.println("Sixth Month!");
                break;

            case JULY:
                System.out.println("Seventh Month!");
                break;

            case AUGUST:
                System.out.println("Eighth Month!");
                break;

            case SEPTEMBER:
                System.out.println("Ninth Month!");
                break;

            case OCTOBER:
                System.out.println("Tenth Month!");
                break;

            case NOVEMBER:
                System.out.println("Eleventh Month!");
                break;

            case DECEMBER:
                System.out.println("Twelfth Month!");
                break;

            default:
                System.out.println("What is this?");
                break;

        }


    }
    String getLogLevelMessageUsingSwitchCase(LogLevel logLevel) {

        switch (logLevel){
            case DEBUG:
                return "It's DEBUG!";

            case INFO:
                return "It's INFO!";

            case WARNING:
                return "It's WARNING!";

            default:
                System.out.println("Unknown");
                break;
        }

        return null;
    }

    public String getLogLevelMessageUsingIf(LogLevel logLevel) {
        if (logLevel == LogLevel.INFO) {
            return "It's INFO!";
        } else if (logLevel == LogLevel.DEBUG) {
            return "It's DEBUG!";
        } else if (logLevel == LogLevel.WARNING) {
            return "It's WARNING!";
        } else {
            return "Hi";
        }
    }
}
