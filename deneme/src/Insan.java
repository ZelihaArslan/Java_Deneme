
public class Insan {
	
	private int yas;
	private String isim;
	
    public Insan()
{
	setYas(20);
	setIsim("isimsiz");
}
    public Insan(int alinanYas, String alinanIsim)
    {
    	setYas(alinanYas);
    	setIsim(alinanIsim);
    	
    }
    
    public void selamla()
    {
    	System.out.println("merhaba,benim adým "+isim);
    }
    
    public void biriniSelamla(Insan gelenInsan)
    {
    	System.out.println("merhaba, " + gelenInsan.getIsim() +" benim adým "+ isim + " nasýlsýn?");
    }
    
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
}
