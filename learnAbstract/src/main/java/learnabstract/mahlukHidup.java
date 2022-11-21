package learnabstract;
public abstract class mahlukHidup {
    String nama;
    String jenisKelamin;

    public abstract void kepercayaan();
    public void info()
    {
        System.out.println("Ini merupakan "+this.nama+" dan berjenis "+this.jenisKelamin);
    }

    public mahlukHidup() {
        System.out.println("Kita hidup boleh sedih dan bahagia dik adik");
    }
}
