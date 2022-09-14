package practica;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Practica {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		/*String path = "E:\\Programacion\\user-saucedemo.xlsx";
		
		File file = new File(path);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		
		XSSFSheet newSheet = newWorkbook.getSheet("hoja 1");
		
		XSSFRow row = newSheet.getRow(2);
		
		
		String cell = row.getCell(1).getStringCellValue();
		System.out.println(cell);
		
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
		System.out.println(rowCount);
				
		int cellTotal = row.getLastCellNum();
		System.out.println(cellTotal);
		
		int rowTotal = newSheet.getLastRowNum();
		System.out.println(rowTotal);
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow newRow = newSheet.getRow(i);
			String newCell = newRow.getCell(0).getStringCellValue();
			list.add(newCell);
		}
		
		System.out.println(list);
		newWorkbook.close();*/
		
		/*Object[][] objeto = new Object[][] {
			{"rodri"},
			{"juam"}
		};
		
		System.out.println(objeto[1][0]);*/
		
		JSONObject telefono1 = new JSONObject();
		telefono1.put("telefono", "111111");
		
		JSONObject telefono2 = new JSONObject();
		telefono2.put("telefono2", "22222");
		
		JSONArray telefonoList = new JSONArray();
		telefonoList.add(telefono1);
		telefonoList.add(telefono2);
	}	

}
