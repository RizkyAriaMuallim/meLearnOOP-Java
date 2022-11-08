package learnpolymorphism;
public class LearnPolymorphism {
    public static void main(String[] args) {
        /*
        Up-Casting → Child kelas dari parent akan menjadi referensi untuk
                     kelas parent.
                   → Kelas yang lebih tinggi dapat berubah menjadi child kelasnya
        */
        Parent p = new Parent();
        ChildA cA = new ChildA();
        ChildB cB = new ChildB();
        GrandChildA gC = new GrandChildA();
        System.out.println("---Up-Casting---");
        Parent castP;
        // mencoba up-casting dari kelas ChildA ke child class grandChild()
        cA = gC;
        System.out.println(cA.toString());
        System.out.println(cA.number);
        // mencoba up-casting dari class Parent ke child class grandChild()
        castP = gC;
        System.out.println(castP.toString());
        System.out.println(castP.number);
        /*
        akan terjadi error karena mencoba akses method ketika up-casting
        karena pada objek yang mengaksesnya tidak memili method yang sama, 
        case overriding
        */
        //System.out.println(castP.methodGrand);

        //Down-Casting → Membuat child class dapat mengakses atribut parent-nya
        System.out.println("---Down-Casting---");
        castP = new GrandChildA();
        System.out.println(castP.toString());
        // Mengecek terlebih dahulu, apakah kelas yang dituju merupakan atas (parent)
        // dari kelas sekarang
        if(cA instanceof Parent){
            cA = (ChildA)castP;
            // Down-casting dapat mengakses atribut dari parentnya
            System.out.println(cA.name);
            /*
            Namun, ketika ingin mengakses atribut pada class yang dituju( parent )
            dan pada class sekarang ada atribut yang sama, maka akan mengakses 
            atribut pada kelas sekarang
            Parent[number] = 10; ChildA[number] = 20
            */
            System.out.println(cA.number);
        }
    }
}
