
*MULTHÝTHREADÝNG NEDÝR?
Çoklu iþ parçacýðý, bir iþlem içinde birden çok iþ parçacýðýnýn oluþturulmasýna izin veren, baðýmsýz olarak yürütülen ancak ayný anda iþlem kaynaklarýný paylaþan bir program yürütme modelidir. Donanýma baðlý olarak, iþ parçacýklarý kendi CPU çekirdeðine daðýtýlýrsa tamamen paralel çalýþabilir.

*MULTHÝTHREADÝNG NERDE (HANGÝ DURUMLARDA) KULLANILIR? 
Pek çoðumuz bilgisayarý açtýðýmýz zaman ayný anda birkaç uygulamayý baþlatýrýz. Örneðin kod yazarken bir yandan internette birþeyler arar bir yandan müzik dinler bir yandan da gelen maillerimizi kontrol ederiz. Bütün bunlar ayný anda olur yada bize öyle oluyormuþ gibi gelir. Ýþte bu olaya multitasking denilir, yani eþ zamanlý görevler.

*Multi Thread Çalýþmanýn Avantaj & Dezavantajlarý
Öncelikle Multi Thread çalýþmanýn avantajlarýný ele almak gerekirse bunlar arasýndan en gözde olaný asenkron yaklaþým diye nitelendirdiðimiz uygulama içerisinde görevlerin paralel bir þekilde, beklemeksizin gerçekleþtirilebiliyor olmasýdýr. Bunun yanýnda, Multi Thread bir uygulamada threadlardan birinin harap olmasý diðerlerini etkilemez ve uygulama diðer kanallardan normal çalýþmaya devam eder.

Elle tutulur tek olumsuz yaný tek mikro iþlemciye sahip sistemlerde performans kaybýdýr. Nihayetinde ayný anda çalýþan thread sayýsý ile her bir threadýn çalýþtýrýlma miktarý arasýnda ters bir ortantý söz konusudur.
*Özet
Her bir process en az bir tane thread içermek zorundadýr, bu threade main thread denilir. main thread gerekli durumda baþka threadleri de yaratabilir.
Java’da multithread kavramý Thread sýnýfý ve Runnable interface üzerine kurulmuþtur. Yeni bir thread yaratmak ve ona bir görev atamak için bu iki sýnýfý kullanabiliriz; birinci yöntemde doðrudan Thread sýnýfýný extend edip run metodunu override edebiliriz, böylece yeni bir thread sýnýfý yaratmýþ oluruz ve onun objelerini yaratarak doðrudan thread yaratma ve çalýþtýrma imkanýna sahip oluruz. Ýkinci yöntemde ise Runnable sýnýfýný implemente eder ve run metodunu override ederek yeni bir task oluþtururuz ve bu oluþturduðumuz taský bir thread objesine verip çalýþtýrmasýný isteriz. 
*Kaynaklar
https://totalview.io/blog/multithreading-multithreaded-applications#:~:text=Multithreading%20is%20a%20model%20of,to%20their%20own%20CPU%20core.
https://www.gencayyildiz.com/blog/multi-thread-calismanin-avantaj-ve-dezavantajlari/
https://medium.com/s%C4%B1f%C4%B1rdan-i%CC%87leri-d%C3%BCzeye-java-e%C4%9Fitim-serisi/multithreaded-programlama-1-k%C4%B1s%C4%B1m-40904a219a18
