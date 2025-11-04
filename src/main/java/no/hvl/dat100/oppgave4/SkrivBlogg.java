package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        String fullSti = mappe + "/" + filnavn;

        String bloggData = samling.toString();

        try(PrintWriter skriver = new PrintWriter(fullSti)){

            skriver.print(bloggData);

            return true;
        } catch(FileNotFoundException e){

            return false;
        }
	}
}
