import java.util.ArrayList;

public class Stats {
	
	public static void main (String[] args){
		
		String file = "d20pfsrd-Bestiary.csv"; 
		ArrayList<Creature> all = Input.parseFile(file); 
		ArrayList<Creature> lg = new ArrayList<Creature>(); 
		ArrayList<Creature> ng = new ArrayList<Creature>(); 
		ArrayList<Creature> cg = new ArrayList<Creature>(); 
		ArrayList<Creature> ln = new ArrayList<Creature>(); 
		ArrayList<Creature> n = new ArrayList<Creature>(); 
		ArrayList<Creature> cn = new ArrayList<Creature>(); 
		ArrayList<Creature> le = new ArrayList<Creature>(); 
		ArrayList<Creature> ne = new ArrayList<Creature>(); 
		ArrayList<Creature> ce = new ArrayList<Creature>(); 

		for (Creature c: all){
			Alignment a = c.getAlignment(); 
			if (a.equals(Alignment.LG)){
				lg.add(c); 
			} else if (a.equals(Alignment.NG)){
				ng.add(c); 
			} else if (a.equals(Alignment.CG)){
				cg.add(c); 
			} else if (a.equals(Alignment.LN)){
				ln.add(c); 
			} else if (a.equals(Alignment.N)){
				n.add(c); 
			} else if (a.equals(Alignment.CN)){
				cn.add(c); 
			} else if (a.equals(Alignment.LE)){
				le.add(c); 
			} else if (a.equals(Alignment.NE)){
				ne.add(c); 
			} else if (a.equals(Alignment.CE)){
				ce.add(c); 
			}
		}
		
		ArrayList<Creature> law = new ArrayList<Creature>(); 
		law.addAll(lg);
		law.addAll(ln); 
		law.addAll(le); 
		ArrayList<Creature> neutral = new ArrayList<Creature>(); 
		neutral.addAll(n); 
		neutral.addAll(ng); 
		neutral.addAll(ln); 
		neutral.addAll(cn); 
		neutral.addAll(ne); 
		ArrayList<Creature> chaos = new ArrayList<Creature>(); 
		chaos.addAll(cg); 
		chaos.addAll(cn); 
		chaos.addAll(ce); 
		ArrayList<Creature> good = new ArrayList<Creature>(); 
		good.addAll(lg); 
		good.addAll(ng); 
		good.addAll(cg); 
		ArrayList<Creature> evil = new ArrayList<Creature>(); 
		evil.addAll(le); 
		evil.addAll(ne); 
		evil.addAll(ce); 
		
		ArrayList<Set> allSets = new ArrayList<Set>(); 
		Set All = new Set("All", all); 
		allSets.add(All); 
		Set LawfulGood = new Set("Lawful Good", lg); 
		allSets.add(LawfulGood); 
		Set NeutralGood = new Set("Neutral Good", ng); 
		allSets.add(NeutralGood); 
		Set ChaoticGood = new Set("Chaotic Good", cg); 
		allSets.add(ChaoticGood); 
		Set LawfulNeutral = new Set("Lawful Neutral", ln); 
		allSets.add(LawfulNeutral); 
		Set TrueNeutral = new Set("True Neutral", n); 
		allSets.add(TrueNeutral); 
		Set ChaoticNeutral = new Set("Chaotic Neutral", cn); 
		allSets.add(ChaoticNeutral); 
		Set LawfulEvil = new Set("Lawful Evil", le); 
		allSets.add(LawfulEvil); 
		Set NeutralEvil = new Set("Neutral Evil", ne); 
		allSets.add(NeutralEvil); 
		Set ChaoticEvil = new Set("Chaotic Evil", ce); 
		allSets.add(ChaoticEvil); 
		Set Lawful = new Set("Lawful", law); 
		allSets.add(Lawful); 
		Set Neutral = new Set("Neutral", neutral); 
		allSets.add(Neutral); 
		Set Chaotic = new Set("Chaotic", chaos);
		allSets.add(Chaotic); 
		Set Good = new Set("Good", good); 
		allSets.add(Good); 
		Set Evil = new Set("Evil", evil); 
		allSets.add(Evil); 
		
		for (Set s: allSets){
			System.out.println(s.getName());
			System.out.println("Total Aligned Creatures: " + s.getList().size());
			System.out.printf("Average CR: %.2f\n", s.getAvgCr()); 
			System.out.printf("Average All Stats: %.2f\n", s.getAvg()); 
			//System.out.printf("(Standard Deviation All Stats: %.2f)\n", s.getStandardDeviation()); 
			System.out.printf("Average Str: %.2f\n", s.getAvgStr()); 
			//System.out.printf("(Standard Deviation Str: %.2f)\n", s.getStrDeviation()); 
			System.out.printf("Average Dex: %.2f\n", s.getAvgDex()); 
			//System.out.printf("(Standard Deviation Dex: %.2f)\n", s.getDexDeviation()); 
			System.out.printf("Average Con: %.2f\n", s.getAvgCon()); 
			//System.out.printf("(Standard Deviation Con: %.2f)\n", s.getConDeviation()); 
			System.out.printf("Average Int: %.2f\n", s.getAvgInt()); 
			//System.out.printf("(Standard Deviation Int: %.2f)\n", s.getIntDeviation()); 
			System.out.printf("Average Wis: %.2f\n", s.getAvgWis()); 
			//System.out.printf("(Standard Deviation Wis: %.2f)\n", s.getWisDeviation()); 
			System.out.printf("Average Cha: %.2f\n", s.getAvgCha()); 
			//System.out.printf("(Standard Deviation Cha: %.2f)\n", s.getChaDeviation()); 
			System.out.println(); 
		}
		
		/*	System.out.print("**" + s.getName() + "** | ");
			System.out.print(s.getList().size() + " | ");
			System.out.printf("%.2f | ", s.getAvgCr());
			System.out.printf("%.2f | ", s.getAvg());
			//System.out.printf("%.2f | ", s.getStandardDeviation());
			System.out.printf("%.2f | ", s.getAvgStr());
			System.out.printf("%.2f | ", s.getAvgDex());
			System.out.printf("%.2f | ", s.getAvgCon());
			System.out.printf("%.2f | ", s.getAvgInt());
			System.out.printf("%.2f | ", s.getAvgWis());
			System.out.printf("%.2f | ", s.getAvgCha());

			System.out.println("\n"); */
		
		/*System.out.println("Total Aligned Creatures: " + s.getList().size());
		System.out.printf("Average CR: %.2f\n", s.getAvgCr()); 
		System.out.printf("Average All Stats: %.2f\n", s.getAvg()); 
		System.out.printf("(Standard Deviation All Stats: %.2f)\n", s.getStandardDeviation()); 
		System.out.printf("Average Str: %.2f\n", s.getAvgStr()); 
		System.out.printf("(Standard Deviation Str: %.2f)\n", s.getStrDeviation()); 
		System.out.printf("Average Dex: %.2f\n", s.getAvgDex()); 
		System.out.printf("(Standard Deviation Dex: %.2f)\n", s.getDexDeviation()); 
		System.out.printf("Average Con: %.2f\n", s.getAvgCon()); 
		System.out.printf("(Standard Deviation Con: %.2f)\n", s.getConDeviation()); 
		System.out.printf("Average Int: %.2f\n", s.getAvgInt()); 
		System.out.printf("(Standard Deviation Int: %.2f)\n", s.getIntDeviation()); 
		System.out.printf("Average Wis: %.2f\n", s.getAvgWis()); 
		System.out.printf("(Standard Deviation Wis: %.2f)\n", s.getWisDeviation()); 
		System.out.printf("Average Cha: %.2f\n", s.getAvgCha()); 
		System.out.printf("(Standard Deviation Cha: %.2f)\n", s.getChaDeviation()); 
		System.out.println(); */
		
		
	}
	
	
	
	

}
