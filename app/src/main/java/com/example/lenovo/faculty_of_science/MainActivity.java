package com.example.lenovo.faculty_of_science;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.lenovo.faculty_of_science.R.id.parent;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner faculty = (Spinner)findViewById(R.id.faculty);
        final Spinner department = (Spinner)findViewById(R.id.department);
        final Spinner year = (Spinner)findViewById(R.id.year);
        final Spinner semester = (Spinner)findViewById(R.id.semester);
        final Spinner material = (Spinner)findViewById(R.id.material);

        ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.faculty,android.R.layout.simple_spinner_dropdown_item);
        faculty.setAdapter(adapter);


        faculty.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (faculty.getSelectedItem().toString().equals("Science Faculty")) {
                    department.setVisibility(View.VISIBLE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.departmentSC, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        department.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if(department.getSelectedItem().toString().equals("Industrial Chemistry")) {
                            year.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.yearCH, android.R.layout.simple_spinner_dropdown_item);
                            year.setAdapter(yearAdapter);
                        }
                        else if(department.getSelectedItem().toString().equals("Petroleum Geology and Natural Gas")) {
                            year.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.yearPG, android.R.layout.simple_spinner_dropdown_item);
                            year.setAdapter(yearAdapter);
                        }
                        else if(department.getSelectedItem().toString().equals("Physics")) {
                            year.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.yearPH, android.R.layout.simple_spinner_dropdown_item);
                            year.setAdapter(yearAdapter);
                        }
                        else if(department.getSelectedItem().toString().equals("Mathematics")) {
                            year.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.yearMA, android.R.layout.simple_spinner_dropdown_item);
                            year.setAdapter(yearAdapter);
                        }
                        else if(department.getSelectedItem().toString().equals("Microbiology")) {
                            year.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.yearMB, android.R.layout.simple_spinner_dropdown_item);
                            year.setAdapter(yearAdapter);
                        }
                        else if(department.getSelectedItem().toString().equals("Biotechnology")) {
                            year.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.yearBT, android.R.layout.simple_spinner_dropdown_item);
                            year.setAdapter(yearAdapter);
                        }

                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });


        year.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if(year.getSelectedItem().toString().equals("First Year CH")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterCH1, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Second Year CH")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterCH2, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Third Year CH")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterCH3, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Forth Year CH")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterCH4, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("First Year PG")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterPG1, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Second Year PG")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterPG2, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Third Year PG")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterPG3, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Forth Year PG")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterPG4, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("First Year PH")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterPH1, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Second Year PH")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterPH2, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Third Year PH")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterPH3, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Forth Year PH")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterPH4, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("First Year MA")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterMA1, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Second Year MA")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterMA2, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Third Year MA")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterMA3, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Forth year MA")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterMA4, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("First Year MB")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterMB1, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Second Year MB")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterMB2, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Third Year MB")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterMB3, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Forth Year MB")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterMB4, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("First Year BT")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterBT1, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Second Year BT")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterBT2, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Third Year BT")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterBT3, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                        else if(year.getSelectedItem().toString().equals("Forth Year BT")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterBT4, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });


        semester.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if(semester.getSelectedItem().toString().equals("first semester CH Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialCH11,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester CH Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialCH12,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester CH Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialCH21,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester CH Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialCH22,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester CH Y3")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialCH31,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester CH Y3")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialCH32,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester CH Y4")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialCH41,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester CH Y4")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialCH42,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester PG Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPG11,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester PG Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPG12,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester PG Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPG21,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester PG Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPG22,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester PG Y3")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPG31,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester PG Y3")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPG32,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester PG Y4")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPG41,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester PG Y4")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPG42,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester PH Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPH11,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester PH Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPH12,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester PH Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPH21,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester PH Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPH22,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester PH Y3")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPH31,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester PH Y3")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPH32,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester PH Y4")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPH41,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester PH Y4")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPH42,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester MA Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMA11,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester MA Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMA12,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester MA Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMA21,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester MA Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMA22,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester MA Y3")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMA31,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester MA Y3")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMA32,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester MA Y4")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMA41,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester MA Y4")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMA42,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester MB Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMB11,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester MB Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMB12,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester MB Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMB21,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester MB Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMB22,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester MB Y3")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMB31,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester MB Y3")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMB32,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester MB Y4")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMB41,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester MB Y4")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMB42,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester BT Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialBT11,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester BT Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialBT12,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester BT Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialBT21,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester BT Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialBT22,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester BT Y3")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialBT31,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester BT Y3")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialBT32,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("first semester BT Y4")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialBT41,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }
                        else if(semester.getSelectedItem().toString().equals("second semester BT Y4")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialBT42,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }

                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });


        material.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if(material.getSelectedItem().toString().equals("حقوق انسان")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/1Blaktt58ohJi1AgJ_KyyvPL8Wi2xzEWB");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("مبادئ العلوم السياسة")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B71nZ7yuupSCLS15d1Juc0dENEk");
                            startActivity(i);
                        }

                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
    }
}