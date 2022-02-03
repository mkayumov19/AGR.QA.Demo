package com.apollo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {

        String path = "SampleData.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Employees");

        System.out.println("sheet.getRow(1).getCell(0) = " + sheet.getRow(1).getCell(0));

        System.out.println("sheet.getRow(3).getCell(2) = " + sheet.getRow(3).getCell(2));

        int usedRows = sheet.getPhysicalNumberOfRows();

        int lastUsedRow = sheet.getLastRowNum();

        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Nirosh")){
                System.out.println("Current cell = " + sheet.getRow(rowNum).getCell(0));
            }
        }

        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Paige")){
                System.out.println("Leila's JOB_ID: " + sheet.getRow(rowNum).getCell(2));

            }
        }
    }
}

