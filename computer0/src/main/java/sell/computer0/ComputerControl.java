package sell.computer0;
import sell.computer0.Computer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class ComputerControl {
	
	static String money;
	SellerSingleton sell = SellerSingleton.getInstance();
	ComFactory comF = new ComFactory();
	ArrayList<Computer> com = new ArrayList<Computer>();

	
	
	public static void fileWriter() {
		try {
			FileWriter w = new FileWriter("output.txt");
			w.write("sell computer : "+money+"bath");
			w.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static void fileReader() {
		try {
			FileReader r =  new FileReader("output.txt");
			int data;
			while((data = r.read()) != -1) {
				System.out.printf("%c\n", data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value= "/computer/create-{computer}-{gen}-{brand}-{price}", method=RequestMethod.POST)
	public ResponseEntity<Computer> create(@PathVariable("gen") String gen, @PathVariable("brand") String brand, @PathVariable("price") int price  , @PathVariable("computer") String computerx){
		com.add(comF.getCom(computerx,price,brand ,gen));
		sell.setMoney(price+sell.getMoney());
		money = Integer.toString(sell.getMoney());
		fileWriter();
		fileReader();
		System.out.println("money : "+money);
		return new ResponseEntity<Computer>(comF.getCom(computerx,price,brand,gen), HttpStatus.OK);
	}
	
	
	@RequestMapping(value= "/computer/all", method=RequestMethod.GET)
	public ArrayList<Computer> AllCom() {
		return com;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ComputerControl.class, args);
		
	}


	
}
