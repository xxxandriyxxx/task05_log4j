package com.epam;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class ExampleSMS {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "";//exists in token.txt
    public static final String AUTH_TOKEN = "";//exists in token.txt

    public static void send(String str) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message
                .creator(new PhoneNumber("+380980000000"),
                        /*my phone number*/
                        new PhoneNumber("+12054984005"), str).create(); /*attached to me number*/
    }

}
