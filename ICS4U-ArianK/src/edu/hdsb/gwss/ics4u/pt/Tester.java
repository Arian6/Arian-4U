package edu.hdsb.gwss.ics4u.pt;

/**
 * Open Hash Table Tester
 *
 * @version v2016.S2
 */
public class Tester {

    /**
     */
    public static void main(String[] args) {

        CSStudent studentJA = new CSStudent("Juwon", "A", 7111, 12);
        CSStudent studentKC = new CSStudent("Kevin", "C", 2221, 12);
        CSStudent studentSC = new CSStudent("Spencer", "C", 2332, 12);
        CSStudent studentGG = new CSStudent("Gurkeerat", "G", 1443, 12);
        CSStudent studentBG = new CSStudent("Braedon", "G", 2554, 12);
        CSStudent studentDG = new CSStudent("Daniel", "G", 6665, 12);
        CSStudent studentAH = new CSStudent("Alex", "H", 7976, 12);
        CSStudent studentMJ = new CSStudent("Matt", "J", 8387, 12);
        CSStudent studentSK = new CSStudent("Shah", "K", 9098, 12);
        CSStudent studentZM = new CSStudent("Zuhair", "M", 1120, 12);
        CSStudent studentMM = new CSStudent("Marwan", "M", 2231, 12);
        CSStudent studentRM = new CSStudent("Ryan", "M", 8695, 12);
        CSStudent studentIN = new CSStudent("Ildar", "N", 3695, 12);
        CSStudent studentRP = new CSStudent("Ryan", "P", 2691, 11); //2691
        CSStudent studentAK = new CSStudent("Arian", "K", 1234, 11);

        OpenHashTable ht = new OpenHashTable();

        ht.put(studentAK);
        ht.put(studentRP);

        System.out.println(ht.toString());

    }

}
