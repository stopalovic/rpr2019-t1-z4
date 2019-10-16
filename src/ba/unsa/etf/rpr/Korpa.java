package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] kart=new Artikl[50];
    static int brojac1=0;

    public Artikl[] getArtikli() {
        return kart;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = new Artikl();
       z: for(int i=0;i<brojac1;i++)
        {
            if(kart[i].Kod.equals(kod))
            {
                if(kart[i].Kod.equals(kod))
                {
                       a=kart[i];
                       kart[i]=null;
                        for(int j=i;j<brojac1-1;j++)
                        {
                            kart[j]=kart[j+1];
                        }

                    kart[brojac1-1]=null;
                    break z;
                }

            }
        }
        brojac1--;
        return a;
    }
    public boolean dodajArtikl(Artikl ar) {

        kart[brojac1]=new Artikl(ar.NazivArtikla,ar.Cijena,ar.Kod);
        brojac1++;
        if(brojac1<=kart.length) return true;
        return false;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0;i<brojac1;i++)
        {
            suma+=kart[i].Cijena;
        }
        return  suma;
    }
}
