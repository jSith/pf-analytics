import java.util.ArrayList;
import java.util.HashMap;

public class Creature {

	private String name; 
	private double cr; 
	private Alignment alignment; 
	private Size size; 
	private Type type; 
	private int ac; 
	private int hp; 
	private int hd; 
	private int str; 
	private int dex; 
	private int con; 
	private int intel; 
	private int wis; 
	private int cha; 

	
	public Creature (String name, double cr, Alignment alignment, Size size, Type type, int ac, int hp, int hd, int str, int dex, int con, int intel, int wis, int cha){
		this.name = name; 
		this.cr = cr; 
		this.alignment = alignment; 
		this.size = size; 
		this.type = type; 
		this.ac = ac; 
		this.hp = hp; 
		this.hd = hd; 
		this.str = str; 
		this.dex = dex; 
		this.con = con; 
		this.intel = intel; 
		this.wis = wis; 
		this.cha = cha; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCr() {
		return cr;
	}
	public void setCr(double cr) {
		this.cr = cr;
	}
	public Alignment getAlignment() {
		return alignment;
	}
	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getAc() {
		return ac;
	}
	public void setAc(int ac) {
		this.ac = ac;
	}
	public int getHp() {
		return hp;
	}
	public int getHD (){
		return this.hd; 
	}
	public void setHD(int hd){
		this.hd = hd; 
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getCon() {
		return con;
	}
	public void setCon(int con) {
		this.con = con;
	}
	public int getIntel() {
		return intel;
	}
	public void setIntel(int intel) {
		this.intel = intel;
	}
	public int getWis() {
		return wis;
	}
	public void setWis(int wis) {
		this.wis = wis;
	}
	public int getCha() {
		return cha;
	}
	public void setCha(int cha) {
		this.cha = cha;
	}
		
}
