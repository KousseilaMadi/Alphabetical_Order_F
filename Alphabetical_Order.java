import java.util.Scanner;
public class exo {
	static Scanner sc = new Scanner(System.in);
	static String[] mots = new String[30];
	static String phrase;
	
	
	public static String saisie() {
	System.out.println("Entrez une Phrase : ");
	return sc.nextLine();
	}
	public static String[] subs(String phrase) {
	int j = 0,count = 0;
	for(int i=0;i<phrase.length();i++) {
		if(		phrase.charAt(i) == ' ' ||
				phrase.charAt(i) == ',' ||
				phrase.charAt(i) == ';' ||
				phrase.charAt(i) == '-' ||
				phrase.charAt(i) == '.' ||
				phrase.charAt(i) == '!' ||
				phrase.charAt(i) == '?') {
			mots[count] = phrase.substring(j, i);
			count++;
			j=i+1;
		}
	}
	return mots;
	}
	
	public static void show(String[] mots) {
	for(int i=0;i<mots.length;i++) {
		if(mots[i] != null)
		System.out.println(mots[i]);
		}
	}
	
	
	public static String[] tri_par_Taille(String[] mots) {
		
		String permute;
		for(int i=0;i<mots.length;i++) {
			for(int j=i;j<mots.length;j++) {
				if(mots[i] != null && mots[j] != null)
				if(mots[i].length() > mots[j].length()) {
						permute = mots[i];
						mots[i] = mots[j];
						mots[j] = permute;
				}
			}
		}
		return mots;
	}
	
	public static int min(int v1, int v2) {
		
		if(v1<v2)
			return v1;
		if(v2<v1)
			return v2;
		else return v1;

	}
	
	public static String[] tri_par_OrdreAlphabetique(String[] mots) {
		String swap;
		for(int i = 0;i<mots.length;i++) {
			for(int u = i;u<mots.length;u++) {
				
			if(mots[i] != null && mots[u] != null)
			for(int j = 0 ;j<min(mots[i].length(), mots[u].length());j++) {
				if(mots[i].charAt(j) > mots[u].charAt(j)) {
					swap = mots[i];
					mots[i] = mots[u];
					mots[u] = swap;
					break;
				}else if(mots[i].charAt(j) == mots[u].charAt(j)) 
					continue;
				else
					break;
				}
			}
		}
		
		
		return mots;
	}
	
	

	}




