package classes;

public class Main {

	public static void main(String[] args) {
      
	    //reference type int sayi gibi mesela 
		// bellekte 2 yer var 1. stack 2. heap 
		// stack kısmında CustomerManager customerManager kısmı oluşur 
		// new CustomerManager kısmı ise Heap yerinde nesneyi oluştur demek anlamında 
		
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2 =new CustomerManager();
		customerManager = customerManager2; //heapdeki 101i kullanmıyoruz ikisi de 102ye girdi.
		customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        
        
        // değişkenler value type (değer tiplidir)
        // değer tipli tanımlamaların hepsi stack kısmında oluşturuluyor.
        // sayi1'in değerine 10 değerini yaz - sayi2'nin değerine 20 değerini yaz - sayi2'nin değerine sayı1'in değerini yaz
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		
		int[] sayilar1 = new int[]{1,2,3};
		int[] sayilar2 = new int[]{4,5,6};
		
		sayilar2 = sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		
		// diziler referans tiptir bu yüzden 10 oldu.
		
		
		
	}

}



	
	
	
