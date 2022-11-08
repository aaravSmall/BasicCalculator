package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    //Number Buttons
    Button num0;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;

    //Operator Buttons
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    Button equals;

    //Other stuff
    Button clear;
    Button negative;
    Button percent;
    Button decimal;
    TextView display;
    String print;
    int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Number Buttons
        num0 = findViewById(R.id.id_num0);
        num1 = findViewById(R.id.id_1);
        num2 = findViewById(R.id.id_2);
        num3 = findViewById(R.id.id_3);
        num4 = findViewById(R.id.id_4);
        num5 = findViewById(R.id.id_5);
        num6 = findViewById(R.id.id_6);
        num7 = findViewById(R.id.id_7);
        num8 = findViewById(R.id.id_8);
        num9 = findViewById(R.id.id_9);

        //Operator Buttons
        add = findViewById(R.id.id_add);
        subtract = findViewById(R.id.id_subtract);
        multiply = findViewById(R.id.id_multiply);
        divide = findViewById(R.id.id_divide);
        equals = findViewById(R.id.id_equals);

        //Other stuff
        clear = findViewById(R.id.id_clear);
        negative = findViewById(R.id.id_negative);
        percent = findViewById(R.id.id_percent);
        decimal = findViewById(R.id.id_decimal);
        display = findViewById(R.id.id_display);
        print = "";
        answer = 0;


        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="0";
                display.setText(print);
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="1";
                display.setText(print);             }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="2";
                display.setText(print);
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="3";
                display.setText(print);
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="4";
                display.setText(print);
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="5";
                display.setText(print);
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="6";
                display.setText(print);
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="7";
                display.setText(print);
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="8";
                display.setText(print);
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="9";
                display.setText(print);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="+";
                display.setText(print);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="-";
                display.setText(print);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="*";
                display.setText(print);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+="/";
                display.setText(print);
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print+=".";
                display.setText(print);
            }
        });

        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Integer.parseInt(print) == 0){
                    display.setText(print);
                }
                else{
                    int num = -1 * Integer.parseInt(print);
                    print = "" + num;
                    display.setText(print);
                }
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(print);
                d*=100;

                if(d == (int)d){
                    print= "" + (int)d + "%";
                }
                else{
                    print= "" + d + "%";
                }
                display.setText(print);

            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> terms = new ArrayList<>();
                ArrayList<String> terms2 = new ArrayList<>();

                /*
                StringTokenizer st = new StringTokenizer(print, "+/-", true);
                int counter = 0;

                print = "";

                while(st.hasMoreTokens()){
                    terms.add(counter, st.nextToken());
                    counter++;
                }

                for(int x = 0; x<terms.size(); x++){
                    if(terms.get(x).contains("*")){
                        st = new StringTokenizer(terms.get(x), "*", true);

                        counter = 0;

                        while(st.hasMoreTokens()){
                            terms2.add(counter, st.nextToken());
                            counter++;
                        }

                        int index = terms2.indexOf("*");
                        double factor1 = Double.parseDouble(terms2.get(index-1));
                        double factor2 = Double.parseDouble(terms2.get(index+1));
                        double answer = factor1*factor2;

                        terms.set(x, Double.toString(answer));
                    }
                }

                for(int x = 0; x< terms.size(); x++){
                    if(!print.equals("Error")){
                        print="";
                        print+=terms.get(x);
                    }
                }
                */

                /*
                StringTokenizer st = new StringTokenizer(print, "*-/+", true);
                int counter = 0;

                while (st.hasMoreTokens()) {
                    terms.add(counter, st.nextToken());
                    counter++;
                }

                for(int x = 1; x<terms.size(); x++){
                    if(terms.get(x).equals("*")){
                        if(terms.get(x-1).equals("*") || terms.get(x-1).equals("/") || terms.get(x-1).equals("+") ||terms.get(x-1).equals("-")){
                            print = "Error";
                        }
                        else if(terms.get(x+1).equals("*") || terms.get(x+1).equals("/") || terms.get(x+1).equals("+") ||terms.get(x+1).equals("-")){
                            print = "Error";
                        }
                        else{
                            Double term1 = Double.parseDouble(terms.remove(x-1));
                            Double term2 = Double.parseDouble(terms.remove(x));
                            Double answer = term1*term2;
                            terms.add(Double.toString(answer));
                        }
                    }
                }
                for(int x = 0; x< terms.size(); x++){
                    if(!print.equals("Error")){
                        print+=terms.get(x);
                    }
                }
                */



                StringTokenizer st = new StringTokenizer(print, "*-/+", true);
                int counter = 0;

                while (st.hasMoreTokens()) {
                    terms.add(counter, st.nextToken());
                    counter++;
                }

                for(int x = 0; x<terms.size(); x++){
                    if(terms.get(x).equals("*") || terms.get(x).equals("/") || terms.get(x).equals("+") ||terms.get(x).equals("-")) {
                       try{
                            if (terms.get(x - 1).equals("*") || terms.get(x - 1).equals("/") || terms.get(x - 1).equals("+") || terms.get(x - 1).equals("-")) {
                                print = "ERROR";
                            } else if (terms.get(x + 1).equals("*") || terms.get(x + 1).equals("/") || terms.get(x + 1).equals("+") || terms.get(x + 1).equals("-")) {
                                print = "ERROR";
                            } else if(x == 0){
                                print = "ERROR";
                            }
                        }catch(Exception e){
                            print = "ERROR";
                        }
                    }
                }

                terms.clear();


                //Multiplying
                st = new StringTokenizer(print, "*");
                counter = 0;

                while (st.hasMoreTokens()) {
                    terms.add(counter, st.nextToken());
                    counter++;
                }
                if(counter>1){
                    while(print.contains("*")){
                        print = multiply(terms);
                    }
                }

                //Reset arrayList
                terms.clear();


                //Divide
                st = new StringTokenizer(print, "/");
                counter = 0;

                while (st.hasMoreTokens()) {
                    terms.add(counter, st.nextToken());
                    counter++;
                }
                if(counter>1) {
                    print = divide(terms);
                }

                //Reset arrayList
                terms.clear();

                //Add
                st = new StringTokenizer(print, "+");
                counter = 0;

                while (st.hasMoreTokens()) {
                    terms.add(counter, st.nextToken());
                    counter++;
                }

                if(counter>1) {
                    print = add(terms);
                }

                //Reset arrayList
                terms.clear();

                Log.i("TestApp", "" + print);

                //Subtract
                st = new StringTokenizer(print, "-");
                counter = 0;

                while (st.hasMoreTokens()) {
                    terms.add(counter, st.nextToken());
                    counter++;
                }
                if(counter>1) {
                    print = subtract(terms);
                }

                display.setText(print);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print="";
                display.setText(print);
            }
        });

    }

    public static String multiply(ArrayList al){
        ArrayList<String> firstTerms = new ArrayList<>();
        ArrayList<String> secondTerms = new ArrayList<>();

        double term1;
        double term2;

        String equation = "";

        for(int p = 0; p < al.size(); p+=2){
            if(p+1 >= al.size()){
                StringTokenizer st = new StringTokenizer(equation, "+-*/", true);
                int counter = 0;
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p: " + p + ": " + s);
                    firstTerms.add(counter, s);
                    counter++;
                }

                st = new StringTokenizer((String) al.get(p), "+-*/", true);
                counter = 0;

                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p+1: " + (p+1) + s);
                    secondTerms.add(counter, s);
                    counter++;
                }

                term1 = Double.parseDouble(firstTerms.remove(firstTerms.size()-1));
                term2 = Double.parseDouble(secondTerms.remove(0));
            }
            else{
                StringTokenizer st = new StringTokenizer((String) al.get(p), "+-*/", true);
                int counter = 0;
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p: " + p + ": " + s);
                    firstTerms.add(counter, s);
                    counter++;
                }

                st = new StringTokenizer((String) al.get(p+1), "+-*/", true);
                counter = 0;
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p+1: " + (p+1) + s);
                    secondTerms.add(counter, s);
                    counter++;
                }

                term1 = Double.parseDouble(firstTerms.remove(firstTerms.size()-1));
                term2 = Double.parseDouble(secondTerms.remove(0));
            }

            double answer = term1*term2;

            equation = "";

            for(int x = 0; x<=firstTerms.size()-1; x++){
                equation+=firstTerms.get(x);
            }

            if(answer == (int)answer){
                equation+=(int)answer;
            }
            else{
                equation+=answer;
            }

            for(int x = 0; x<=secondTerms.size()-1; x++){
                equation+=secondTerms.get(x);
            }
            Log.i("TestApp", "Equation at " + p + ": " + equation);

            firstTerms.clear();
            secondTerms.clear();
        }


        return equation;

    }

    public static String divide(ArrayList al){
        ArrayList<String> firstTerms = new ArrayList<>();
        ArrayList<String> secondTerms = new ArrayList<>();

        double term1;
        double term2;

        String equation = "";

        for(int p = 0; p < al.size(); p+=2){
            if(p+1 >= al.size()){
                StringTokenizer st = new StringTokenizer(equation, "+-*/", true);
                int counter = 0;
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p: " + p + ": " + s);
                    firstTerms.add(counter, s);
                    counter++;
                }

                st = new StringTokenizer((String) al.get(p), "+-*/", true);
                counter = 0;

                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p+1: " + (p+1) + s);
                    secondTerms.add(counter, s);
                    counter++;
                }

                term1 = Double.parseDouble(firstTerms.remove(firstTerms.size()-1));
                term2 = Double.parseDouble(secondTerms.remove(0));
            }
            else{
                StringTokenizer st = new StringTokenizer((String) al.get(p), "+-*/", true);
                int counter = 0;
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p: " + p + ": " + s);
                    firstTerms.add(counter, s);
                    counter++;
                }

                st = new StringTokenizer((String) al.get(p+1), "+-*/", true);
                counter = 0;
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p+1: " + (p+1) + s);
                    secondTerms.add(counter, s);
                    counter++;
                }

                term1 = Double.parseDouble(firstTerms.remove(firstTerms.size()-1));
                term2 = Double.parseDouble(secondTerms.remove(0));
            }

            double answer = 0.0;
            
            if(term2==0){
                equation="ERROR";
            }
            else {
                answer = term1 / term2;

                equation = "";

                for(int x = 0; x<=firstTerms.size()-1; x++){
                    equation+=firstTerms.get(x);
                }

                if(answer == (int)answer){
                    equation+=(int)answer;
                }
                else{
                    equation+=answer;
                }

                for(int x = 0; x<=secondTerms.size()-1; x++){
                    equation+=secondTerms.get(x);
                }
                Log.i("TestApp", "Equation at " + p + ": " + equation);
            }

            firstTerms.clear();
            secondTerms.clear();

        }

        return equation;

    }

    public static String add(ArrayList al){
        ArrayList<String> firstTerms = new ArrayList<>();
        ArrayList<String> secondTerms = new ArrayList<>();

        double term1;
        double term2;

        String equation = "";

        for(int p = 0; p < al.size(); p+=2){
            if(p+1 >= al.size()){
                StringTokenizer st = new StringTokenizer(equation, "+-*/", true);
                int counter = 0;
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p: " + p + ": " + s);
                    firstTerms.add(counter, s);
                    counter++;
                }

                st = new StringTokenizer((String) al.get(p), "+-*/", true);
                counter = 0;

                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p+1: " + (p+1) + s);
                    secondTerms.add(counter, s);
                    counter++;
                }

                term1 = Double.parseDouble(firstTerms.remove(firstTerms.size()-1));
                term2 = Double.parseDouble(secondTerms.remove(0));
            }
            else{
                StringTokenizer st = new StringTokenizer((String) al.get(p), "+-*/", true);
                int counter = 0;
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p: " + p + ": " + s);
                    firstTerms.add(counter, s);
                    counter++;
                }

                st = new StringTokenizer((String) al.get(p+1), "+-*/", true);
                counter = 0;
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p+1: " + (p+1) + s);
                    secondTerms.add(counter, s);
                    counter++;
                }

                term1 = Double.parseDouble(firstTerms.remove(firstTerms.size()-1));
                term2 = Double.parseDouble(secondTerms.remove(0));
            }

            double answer = term1+term2;

            equation = "";

            Log.i("TestApp", "Equation before construction at " + p + ": " + equation);
            for(int x = 0; x<=firstTerms.size()-1; x++){
                equation+=firstTerms.get(x);
            }

            Log.i("TestApp", "Equation after first terms at " + p + ": " + equation);
            if(answer == (int)answer){
                equation+=(int)answer;
            }
            else{
                equation+=answer;
            }

            Log.i("TestApp", "Equation after answer at " + p + ": " + equation);
            for(int x = 0; x<=secondTerms.size()-1; x++){
                equation+=secondTerms.get(x);
            }
            Log.i("TestApp", "Equation after second terms at " + p + ": " + equation);

            firstTerms.clear();
            secondTerms.clear();
        }


        return equation;
    }

    public static String subtract(ArrayList al){
        ArrayList<String> firstTerms = new ArrayList<>();
        ArrayList<String> secondTerms = new ArrayList<>();

        double term1;
        double term2;

        String equation = "";

        for(int p = 0; p < al.size(); p+=2){
            if(p+1 >= al.size()){
                StringTokenizer st = new StringTokenizer(equation, "+-*/", true);
                int counter = 0;
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p: " + p + ": " + s);
                    firstTerms.add(counter, s);
                    counter++;
                }

                st = new StringTokenizer((String) al.get(p), "+-*/", true);
                counter = 0;

                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p+1: " + (p+1) + s);
                    secondTerms.add(counter, s);
                    counter++;
                }

                term1 = Double.parseDouble(firstTerms.remove(firstTerms.size()-1));
                term2 = Double.parseDouble(secondTerms.remove(0));
            }
            else{
                StringTokenizer st = new StringTokenizer((String) al.get(p), "+-*/", true);
                int counter = 0;
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p: " + p + ": " + s);
                    firstTerms.add(counter, s);
                    counter++;
                }

                st = new StringTokenizer((String) al.get(p+1), "+-*/", true);
                counter = 0;
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    //Log.i("TestApp", "p+1: " + (p+1) + s);
                    secondTerms.add(counter, s);
                    counter++;
                }

                term1 = Double.parseDouble(firstTerms.remove(firstTerms.size()-1));
                term2 = Double.parseDouble(secondTerms.remove(0));
            }

            double answer = term1-term2;

            equation = "";

            for(int x = 0; x<=firstTerms.size()-1; x++){
                equation+=firstTerms.get(x);
            }

            if(answer == (int)answer){
                equation+=(int)answer;
            }
            else{
                equation+=answer;
            }

            for(int x = 0; x<=secondTerms.size()-1; x++){
                equation+=secondTerms.get(x);
            }
            Log.i("TestApp", "Equation at " + p + ": " + equation);

            firstTerms.clear();
            secondTerms.clear();
        }


        return equation;
    }



}