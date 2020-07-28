package practice.ecoomerceAutomation.Utils;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public Object[][] getdata(String filePath) throws IOException {

		FileInputStream file = new FileInputStream(filePath);

		@SuppressWarnings("resource")

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet worksheet = workbook.getSheetAt(0);

		int rowNums = worksheet.getLastRowNum() + 1;

		int colNums = worksheet.getRow(0).getLastCellNum();

		String[][] datatable = new String[rowNums][colNums];

		try {

			for (int i = 0; i < rowNums; i++) {

				XSSFRow row = worksheet.getRow(i);

				for (int j = 0; j < colNums; j++) {

					XSSFCell cell = row.getCell(j);

					if (cell.getCellType().toString().contains("STRING")) {

						datatable[i][j] = cell.toString();

						// System.out.println(datatable);

					}

					else if (cell.getCellType().toString().contains("NUMERIC")) {

						datatable[i][j] = cell.getRawValue();

						// System.out.println(datatable);

					}

				}

			}

		} catch (Exception e) {

			System.out.println(e);

		}

		for (int i = 0; i < datatable.length; i++) {

			System.out.println(Arrays.toString(datatable[i]));

		}

		return datatable;

	}

}