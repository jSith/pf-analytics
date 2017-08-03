import java.util.ArrayList;

public class Set { //Set of creatures in a certain group
	
	private String name; 
	private ArrayList<Creature> list; 
	private ArrayList<Double> cr = new ArrayList<Double>(); 
	private ArrayList<Integer> att = new ArrayList<Integer>(); 
	private ArrayList<Integer> str = new ArrayList<Integer>(); 
	private ArrayList<Integer> dex = new ArrayList<Integer>(); 
	private ArrayList<Integer> con = new ArrayList<Integer>(); 
	private ArrayList<Integer> intel = new ArrayList<Integer>(); 
	private ArrayList<Integer> wis = new ArrayList<Integer>(); 
	private ArrayList<Integer> cha = new ArrayList<Integer>(); 

	public Set (String name, ArrayList<Creature> list){
		this.name = name; 
		this.list = list; 
		
		for (Creature c: this.list){
			cr.add(c.getCr()); 
			str.add(c.getStr()); 
			dex.add(c.getDex()); 
			con.add(c.getCon()); 
			intel.add(c.getIntel()); 
			wis.add(c.getWis()); 
			cha.add(c.getCha()); 
		}
		
		att.addAll(str); 
		att.addAll(dex); 
		att.addAll(con); 
		att.addAll(intel); 
		att.addAll(wis); 
		att.addAll(cha); 
		
	}
	
	public ArrayList<Double> getCr() {
		return cr;
	}

	public void setCr(ArrayList<Double> cr) {
		this.cr = cr;
	}

	public ArrayList<Integer> getStr() {
		return str;
	}

	public void setStr(ArrayList<Integer> str) {
		this.str = str;
	}

	public ArrayList<Integer> getDex() {
		return dex;
	}

	public void setDex(ArrayList<Integer> dex) {
		this.dex = dex;
	}

	public ArrayList<Integer> getCon() {
		return con;
	}

	public void setCon(ArrayList<Integer> con) {
		this.con = con;
	}

	public ArrayList<Integer> getIntel() {
		return intel;
	}

	public void setIntel(ArrayList<Integer> intel) {
		this.intel = intel;
	}

	public ArrayList<Integer> getWis() {
		return wis;
	}

	public void setWis(ArrayList<Integer> wis) {
		this.wis = wis;
	}

	public ArrayList<Integer> getCha() {
		return cha;
	}

	public void setCha(ArrayList<Integer> cha) {
		this.cha = cha;
	}

	public String getName(){
		return this.name; 
	}
	
	public ArrayList<Creature> getList(){
		return this.list; 
	}
	
	public double getAvg(){
		double avg = 0; 
		for (Integer i: this.att){
			avg += i; 
		}
		avg /= this.att.size(); 
		return avg; 
	}
	
	public double getStandardDeviation(){
		double avg = this.getAvg(); 
		double var = 0; 
		
		for (int i: this.att){
			var += (i-avg)*(i-avg); 
		}
		
		var /= this.att.size(); 
		
		return Math.sqrt(var); 
	}
	
	public double getAvgStr (){
		
		double avg = 0; 
		
		for (Integer s: this.str){
			avg += s; 
		}
		
		avg /= this.list.size(); 
		
		return avg; 
		
	}
	
	public double getAvgDex (){
		
		double avg = 0; 
		
		for (Integer d: this.dex){
			avg += d; 
		}
		
		avg /= this.list.size(); 
		
		return avg; 
		
	}
	
	public double getAvgCon (){
		
		double avg = 0; 
		
		for (Integer c: this.con){
			avg += c; 
		}
		
		avg /= this.list.size(); 
		
		return avg; 
		
	}
	
	public double getAvgInt (){
		
		double avg = 0; 
		
		for (Integer i: this.intel){
			avg += i; 
		}
		
		avg /= this.list.size(); 
		
		return avg; 
		
	}
	
	public double getAvgWis (){
		
		double avg = 0; 
		
		for (Integer w: this.wis){
			avg += w; 
		}
		
		avg /= this.list.size(); 
		
		return avg; 
		
	}
	
	public double getAvgCha (){
		
		double avg = 0; 
		
		for (Integer c: this.cha){
			avg += c; 
		}
		
		avg /= this.list.size(); 
		
		return avg; 
		
	}
	
	public double getAvgCr (){
		
		double avg = 0; 
		
		for (Double c: this.cr){
			avg += c; 
		}
		
		avg /= this.list.size(); 
		
		return avg; 
		
	}
	
	public double getStrDeviation(){
		
		double avg = this.getAvgStr(); 
		double var = 0; 
		
		for (int i: this.str){
			var += (i-avg)*(i-avg); 
		}
		
		var /= this.str.size(); 
		
		return Math.sqrt(var); 
		
	}
	
	public double getDexDeviation(){
		
		double avg = this.getAvgStr(); 
		double var = 0; 
		
		for (int i: this.dex){
			var += (i-avg)*(i-avg); 
		}
		
		var /= this.dex.size(); 
		
		return Math.sqrt(var); 
		
	}
	
	public double getConDeviation(){
		
		double avg = this.getAvgStr(); 
		double var = 0; 
		
		for (int i: this.con){
			var += (i-avg)*(i-avg); 
		}
		
		var /= this.con.size(); 
		
		return Math.sqrt(var); 
		
	}
	
	public double getIntDeviation(){
		
		double avg = this.getAvgStr(); 
		double var = 0; 
		
		for (int i: this.intel){
			var += (i-avg)*(i-avg); 
		}
		
		var /= this.intel.size(); 
		
		return Math.sqrt(var); 
		
	}
	
	public double getWisDeviation(){
		
		double avg = this.getAvgStr(); 
		double var = 0; 
		
		for (int i: this.wis){
			var += (i-avg)*(i-avg); 
		}
		
		var /= this.wis.size(); 
		
		return Math.sqrt(var); 
		
	}
	
	public double getChaDeviation(){
		
		double avg = this.getAvgStr(); 
		double var = 0; 
		
		for (int i: this.cha){
			var += (i-avg)*(i-avg); 
		}
		
		var /= this.cha.size(); 
		
		return Math.sqrt(var); 
		
	}
	
}
