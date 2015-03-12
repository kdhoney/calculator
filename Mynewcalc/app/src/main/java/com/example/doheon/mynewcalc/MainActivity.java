package com.example.doheon.mynewcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    private EditText editid;
    private EditText resultid;
    private Button addid;
    private Button subid;
    private Button mulid;
    private Button dviid;
    private Button eqid;
    private Button one,two,three,four,five,six,seven,eight,nine,zero;
    private int state, num, asmd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editid = (EditText)findViewById(R.id.edit_number);
        resultid = (EditText)findViewById(R.id.result_number);
        addid = (Button)findViewById(R.id.add_id);
        subid = (Button)findViewById(R.id.sub_id);
        mulid = (Button)findViewById(R.id.mul_id);
        dviid = (Button)findViewById(R.id.dvi_id);
        eqid = (Button)findViewById(R.id.eq_id);

        one = (Button)findViewById(R.id.one_id);
        two = (Button)findViewById(R.id.two_id);
        three = (Button)findViewById(R.id.three_id);
        four = (Button)findViewById(R.id.four_id);
        five = (Button)findViewById(R.id.five_id);
        six = (Button)findViewById(R.id.six_id);
        seven = (Button)findViewById(R.id.seven_id);
        eight = (Button)findViewById(R.id.eight_id);
        nine = (Button)findViewById(R.id.nine_id);
        zero = (Button)findViewById(R.id.zero_id);

        state = 0;
        asmd = 1; //1 = add, 2 = sub, 3 = mul, 4 = dvi
        resultid.setText("0");


        View.OnClickListener calclistener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //버튼 동작 설정
                if(state == 6) {
                    resultid.setText("0");
                }

                switch (v.getId())
                {
                    case R.id.add_id:
                        if(state>0 )
                            break;

                        state = 1;
                        num = Integer.valueOf(editid.getText().toString().trim());
                        editid.setText("");
                        break;
                    case R.id.sub_id:
                        if(state >0 )
                            break;

                        state = 2;
                        num = Integer.valueOf(editid.getText().toString().trim());
                        editid.setText("");
                        //editid.getText().toString()-resultid.getText();
                        break;
                    case R.id.mul_id:
                        if(state >0 )
                            break;

                        state = 3;
                        num = Integer.valueOf(editid.getText().toString().trim());
                        editid.setText("");
                        // editid.getText().toString()*resultid.getText();
                        break;
                    case R.id.dvi_id:
                        if(state >0 )
                            break;

                        state = 4;
                        num = Integer.valueOf(editid.getText().toString().trim());
                        editid.setText("");
                        // editid.getText().toString()/resultid.getText();
                        break;
                    case R.id.eq_id:

                        if(state >0 )
                            break;

                        state = 5;
                        num = Integer.valueOf(editid.getText().toString().trim());
                        editid.setText("");
                        // editid.getText().toString()/resultid.getText();
                        break;

                    case R.id.one_id:
                        state = 0;
                        editid.setText(editid.getText().toString() + 1);
                        break;
                    case R.id.two_id:
                        state = 0;
                        editid.setText(editid.getText().toString() + 2);
                        break;
                    case R.id.three_id:
                        state = 0;
                        editid.setText(editid.getText().toString() + 3);
                        break;
                    case R.id.four_id:
                        state = 0;
                        editid.setText(editid.getText().toString() + 4);
                        break;
                    case R.id.five_id:
                        state = 0;
                        editid.setText(editid.getText().toString() + 5);
                        break;
                    case R.id.six_id:
                        state = 0;
                        editid.setText(editid.getText().toString() + 6);
                        break;
                    case R.id.seven_id:
                        state = 0;
                        editid.setText(editid.getText().toString() + 7);
                        break;
                    case R.id.eight_id:
                        state = 0;
                        editid.setText(editid.getText().toString() + 8);
                        break;
                    case R.id.nine_id:
                        state = 0;
                        editid.setText(editid.getText().toString() + 9);
                        break;
                    case R.id.zero_id:
                        state = 0;
                        editid.setText(editid.getText().toString() + 0);
                        break;
                }

                if(state > 0 && state < 6) {
                    switch(asmd) {
                        case 1:
                            Integer a = Integer.valueOf(resultid.getText().toString().trim())+ num;
                            resultid.setText(a.toString());
                            asmd = state;
                            break;
                        case 2:
                            Integer b = Integer.valueOf(resultid.getText().toString().trim())- num;
                            resultid.setText(b.toString());
                            asmd = state;
                            break;
                        case 3:
                            Integer c = Integer.valueOf(resultid.getText().toString().trim())* num;
                            resultid.setText(c.toString());
                            asmd = state;
                            break;
                        case 4:
                            Integer d = Integer.valueOf(resultid.getText().toString().trim())/ num;
                            resultid.setText(d.toString());
                            asmd = state;
                            break;
                    }
                    if(asmd == 5) {
                        asmd = 1;
                        state = 6;
                    }
                }
            }
        };
        addid.setOnClickListener(calclistener);
        subid.setOnClickListener(calclistener);
        mulid.setOnClickListener(calclistener);
        dviid.setOnClickListener(calclistener);
        one.setOnClickListener(calclistener);
        two.setOnClickListener(calclistener);
        three.setOnClickListener(calclistener);
        four.setOnClickListener(calclistener);
        five.setOnClickListener(calclistener);
        six.setOnClickListener(calclistener);
        seven.setOnClickListener(calclistener);
        eight.setOnClickListener(calclistener);
        nine.setOnClickListener(calclistener);
        zero.setOnClickListener(calclistener);
        eqid.setOnClickListener(calclistener);

    }
}