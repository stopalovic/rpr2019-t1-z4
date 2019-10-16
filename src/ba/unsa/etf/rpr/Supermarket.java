package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] artikli= new Artikl[1000];
    static int brojac=0;
    public void dodajArtikl(Artikl ar) {

        artikli[brojac]=new Artikl(ar.NazivArtikla,ar.Cijena,ar.Kod);
        brojac++;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a=new Artikl();
        z: for(int i=0;i<brojac;i++)
        {
            if(artikli[i].Kod.equals(kod))
            {
                if(artikli[i].Kod.equals(kod))
                {
                    a=artikli[i];
                    artikli[i]=null;
                    for(int j=i;j<brojac-1;j++)
                    {
                        artikli[j]=artikli[j+1];
                    }

                    artikli[brojac-1]=null;
                    break z;
                }

            }
        }
        brojac--;
        return a;
    }
}
