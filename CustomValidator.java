package com.ubk.bank.money.transfer.controller;

import com.ubk.bank.money.transfer.models.AccountDto;
import com.ubk.bank.money.transfer.models.AccountRequest;

import java.security.SecureRandom;

import static java.security.CryptoPrimitive.SECURE_RANDOM;

public class CustomValidator {

    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static boolean validationForTransfer(AccountDto accountDTO, AccountRequest request, int cifLimit, int accountNumberLimit, int ibanLimit) {

        if ((Double.valueOf(accountDTO.getBalance()) < Double.valueOf(request.getAmount()))
                || (!accountDTO.getCurrency().equalsIgnoreCase(request.getCurrency())
                || (Double.valueOf(request.getAmount()) > Double.valueOf(accountDTO.getLimits().getDaily()))
                || (Double.valueOf(request.getAmount()) > Double.valueOf(accountDTO.getLimits().getMonthly())))
                || !isValid(request.getCif(), cifLimit)
                || !isValidIBAN(request.getDestinationAccount(), ibanLimit)
                || !isValid(request.getSourceAccount(), accountNumberLimit)
        ) {
            return false;
        }


        return true;
    }

    public static boolean isValid(String cif, int digits) {
        if (cif == null) {
            return false;
        }

        // Check if the CIF is exactly digits
        return cif.matches("\\d{" + digits + "}");
    }

    public static boolean isValidIBAN(String iban, int digits) {
        if (iban == null) {
            return false;
        }

        // Check if the IBAN is exactly 24 characters long and consists of alphanumeric characters
        return iban.matches("[A-Za-z0-9]{" + digits + "}");
    }

    public static String generateRandomNumber(int length) {
        // Generate a random number between 0 and 9999999999 (10 digits)
        long number = SECURE_RANDOM.nextLong(10000000000000L);

        // Format the number to be exactly 10 digits
        return String.format("%010d", number);
    }

    public static String generateTransactionId(int length) {
        if (length <= 0 || length > 15) {
            throw new IllegalArgumentException("Length must be between 1 and 15");
        }

        // Generate a random number with the specified length
        StringBuilder transactionId = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            transactionId.append(SECURE_RANDOM.nextInt(10)); // Append a random digit
        }
        return transactionId.toString();
    }
}
