package com.john.spendless;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader.*;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.file.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private Account getAccountInfo(String name) {
        
        int bufferSize = 70;
        Charset charset = Charset.forName("US-ASCII");
        Account acct = new Account(name);
        String loc = String.format("/app/src/dat/%s.dat", name);
        char[] buffer = new char[bufferSize];
        try (FileReader data = new FileReader(loc)) {

        }
        catch(FileNotFoundException excp) {
            System.err.printf("Cannot find data for user %s", name);
        }
        catch(IOException excp) {
            System.err.printf("Could not open file %s.dat", name);
        }
    }
}
