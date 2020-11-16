public class Zufallszahlen{

        public static void main (String[] args) {
			int i=0,kl=81,gr=0;
			
			int[]qzahlen = new int[41];
			
			do{
				qzahlen[i] =(int) (30*Math.random()+50);
				if (kl>qzahlen[i]) {
				kl=qzahlen[i];};
				if (gr<qzahlen[i]) {
				gr=qzahlen[i];};
				i++;
			}
			while(i<41);
			
			i=0;
			do{
				EA.schreiben(i+" "+qzahlen[i]);
				EA.nz();
				i++;
			}
			while (i<qzahlen.length);
			
			EA.schreiben("Kleinste Zahl: "+ kl); EA.nz();
			EA.schreiben("Groesste Zahl: "+ gr); EA.nz();
}}