package com.epam;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class ExampleSMS {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "ACe0099e38a8ad6bd2d190d1b0f453bd23";
    public static final String AUTH_TOKEN = "7f9a001a769d6822d081d1acf4b5feaa";

    public static void send(String str) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message
                .creator(new PhoneNumber("+380980083300"),
                        /*my phone number*/
                        new PhoneNumber("+12054984005"), str).create(); /*attached to me number*/
    }
}
