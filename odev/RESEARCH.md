
*MULTH�THREAD�NG NED�R?
�oklu i� par�ac���, bir i�lem i�inde birden �ok i� par�ac���n�n olu�turulmas�na izin veren, ba��ms�z olarak y�r�t�len ancak ayn� anda i�lem kaynaklar�n� payla�an bir program y�r�tme modelidir. Donan�ma ba�l� olarak, i� par�ac�klar� kendi CPU �ekirde�ine da��t�l�rsa tamamen paralel �al��abilir.

*MULTH�THREAD�NG NERDE (HANG� DURUMLARDA) KULLANILIR? 
Pek �o�umuz bilgisayar� a�t���m�z zaman ayn� anda birka� uygulamay� ba�lat�r�z. �rne�in kod yazarken bir yandan internette bir�eyler arar bir yandan m�zik dinler bir yandan da gelen maillerimizi kontrol ederiz. B�t�n bunlar ayn� anda olur yada bize �yle oluyormu� gibi gelir. ��te bu olaya multitasking denilir, yani e� zamanl� g�revler.

*Multi Thread �al��man�n Avantaj & Dezavantajlar�
�ncelikle Multi Thread �al��man�n avantajlar�n� ele almak gerekirse bunlar aras�ndan en g�zde olan� asenkron yakla��m diye nitelendirdi�imiz uygulama i�erisinde g�revlerin paralel bir �ekilde, beklemeksizin ger�ekle�tirilebiliyor olmas�d�r. Bunun yan�nda, Multi Thread bir uygulamada threadlardan birinin harap olmas� di�erlerini etkilemez ve uygulama di�er kanallardan normal �al��maya devam eder.

Elle tutulur tek olumsuz yan� tek mikro i�lemciye sahip sistemlerde performans kayb�d�r. Nihayetinde ayn� anda �al��an thread say�s� ile her bir thread�n �al��t�r�lma miktar� aras�nda ters bir ortant� s�z konusudur.
*�zet
Her bir process en az bir tane thread i�ermek zorundad�r, bu threade main thread denilir. main thread gerekli durumda ba�ka threadleri de yaratabilir.
Java�da multithread kavram� Thread s�n�f� ve Runnable interface �zerine kurulmu�tur. Yeni bir thread yaratmak ve ona bir g�rev atamak i�in bu iki s�n�f� kullanabiliriz; birinci y�ntemde do�rudan Thread s�n�f�n� extend edip run metodunu override edebiliriz, b�ylece yeni bir thread s�n�f� yaratm�� oluruz ve onun objelerini yaratarak do�rudan thread yaratma ve �al��t�rma imkan�na sahip oluruz. �kinci y�ntemde ise Runnable s�n�f�n� implemente eder ve run metodunu override ederek yeni bir task olu�tururuz ve bu olu�turdu�umuz task� bir thread objesine verip �al��t�rmas�n� isteriz. 
*Kaynaklar
https://totalview.io/blog/multithreading-multithreaded-applications#:~:text=Multithreading%20is%20a%20model%20of,to%20their%20own%20CPU%20core.
https://www.gencayyildiz.com/blog/multi-thread-calismanin-avantaj-ve-dezavantajlari/
https://medium.com/s%C4%B1f%C4%B1rdan-i%CC%87leri-d%C3%BCzeye-java-e%C4%9Fitim-serisi/multithreaded-programlama-1-k%C4%B1s%C4%B1m-40904a219a18
