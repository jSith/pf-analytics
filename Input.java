import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Input {
		
	public static ArrayList<Creature> parseFile (String file){
		
		FileReader fr;
		
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Invalid file"); 
		} 
		
		BufferedReader br = new BufferedReader(fr); 
		String line = ""; 
		ArrayList<Creature> creatureList = new ArrayList<Creature>(); 
		
		try {
			while (br.readLine() != null){
				line = br.readLine(); 
				if (line != null){
					Creature creature = generateCreature(line); 
					creatureList.add(creature); 
				}
			}
		} catch (IOException e) {
			throw new RuntimeException("Reader error"); 

		}
		
		return creatureList; 
	}

	public static Creature generateCreature (String line){
			
		String[] split = line.split(","); 

		String name = split[0]; 
		double cr = Double.parseDouble(split[1]); 
		Alignment alignment = Alignment.valueOf(split[7]); 
		Size size = Size.valueOf(split[8]); 
		Type type = Type.valueOf(split[9]); 
		int ac = Integer.parseInt(split[16]); 
		int hp = Integer.parseInt(split[19]); 
		int hd = parseHD(split[20]); 
		int str = 0; 
		if (!split[25].contains("-")){
			str = Integer.parseInt(split[25]); 
		}
		int dex = 0; 
		if (!split[26].contains("-")){
			dex = Integer.parseInt(split[26]); 
		}
		int con = 0; 
		if (!split[27].contains("-")){
			con = Integer.parseInt(split[27]); 
		}		
		int intel = 0; 
		if (!split[28].contains("-")){
			intel = Integer.parseInt(split[28]); 
		}
		int wis = 0; 
		if (!split[29].contains("-")){
			wis = Integer.parseInt(split[29]); 
		}
		int cha = 0; 
		if (!split[30].contains("-")){
			cha = Integer.parseInt(split[30]); 
		}

		Creature creature = new Creature (name, cr, alignment, size, type, ac, hp, hd, str, dex, con, intel, wis, cha); 
		
		return creature; 
	}
	
	public static int parseHD (String input){
		
		String[] dSplit = input.split("d"); 
		int hd = 0; 
		
		if (dSplit[1].contains("+")){
			String[] plusSplit = dSplit[1].split("\\+"); 
			hd = Integer.parseInt(plusSplit[0].trim()); 
		} else if (dSplit[1].contains("-")){
			String[] minusSplit = dSplit[1].split("-"); 
			hd = Integer.parseInt(minusSplit[0].trim()); 
		} else {
			hd = Integer.parseInt(dSplit[1].trim()); 
		}
		return hd; 
		
	}
	
}
