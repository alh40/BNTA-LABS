package org.example._4_props_and_methods;

public enum LogLevel {
    DEBUG("It's DEBUG!", false), INFO("It's INFO!", false), WARNING("It's WARNING!", true);

    private final String getDisplayName;
    private final boolean sendSMSToAdmin;

    LogLevel(String getDisplayName, boolean sendSMSToAdmin){

        this.getDisplayName = getDisplayName;
        this.sendSMSToAdmin = sendSMSToAdmin;
    }

    public String getGetDisplayName(){
        return getDisplayName;
    }

    public boolean isSendSMSToAdmin(){
        return sendSMSToAdmin;
    }

    /*
        TODO 8 add the below properties and set them in the constructor
         -String displayName
         -boolean sendSMSToAdmin

        +──────────+────────────────────+─────────────────+
        |          | displayName        | sendSmsToAdmin  |
        +──────────+────────────────────+─────────────────+
        | DEBUG    | "It's DEBUG!"      |      no         |
        | INFO     | "It's INFO!"       |      no         |
        | WARNING  | "It's WARNING!"    |     yes         |
        +──────────+────────────────────+─────────────────+

        TODO 9 add two methods, returning the above properties' values
        - getDisplayName
        - isSendSMSToAdmin


        TODO 10 to sum up, your enum should have:
        -3 constants
        -2 extra fields
        -2 methods
        -1, 2-parameter constructor

        run the tests in org.gexample._4_usage.EnumUsageExamplesTest to verify your work

     */
}
