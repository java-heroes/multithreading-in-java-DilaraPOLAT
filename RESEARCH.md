
#MULTHİTHREADİNG NEDİR?

Çoklu iş parçacığı, bir işlem içinde birden çok iş parçacığının oluşturulmasına izin veren, bağımsız olarak yürütülen ancak aynı anda işlem kaynaklarını paylaşan bir program yürütme modelidir. Donanıma bağlı olarak, iş parçacıkları kendi CPU çekirdeğine dağıtılırsa tamamen paralel çalışabilir.

#MULTHİTHREADİNG NERDE (HANGİ DURUMLARDA) KULLANILIR?

Pek çoğumuz bilgisayarı açtığımız zaman aynı anda birkaç uygulamayı başlatırız. Örneğin kod yazarken bir yandan internette birşeyler arar bir yandan müzik dinler bir yandan da gelen maillerimizi kontrol ederiz. Bütün bunlar aynı anda olur yada bize öyle oluyormuş gibi gelir. İşte bu olaya multitasking denilir, yani eş zamanlı görevler.

#Multi Thread Çalışmanın Avantaj & Dezavantajları

Öncelikle Multi Thread çalışmanın avantajlarını ele almak gerekirse bunlar arasından en gözde olanı asenkron yaklaşım diye nitelendirdiğimiz uygulama içerisinde görevlerin paralel bir şekilde, beklemeksizin gerçekleştirilebiliyor olmasıdır. Bunun yanında, Multi Thread bir uygulamada threadlardan birinin harap olması diğerlerini etkilemez ve uygulama diğer kanallardan normal çalışmaya devam eder.

Elle tutulur tek olumsuz yanı tek mikro işlemciye sahip sistemlerde performans kaybıdır. Nihayetinde aynı anda çalışan thread sayısı ile her bir threadın çalıştırılma miktarı arasında ters bir ortantı söz konusudur.

#Özet

Her bir process en az bir tane thread içermek zorundadır, bu threade main thread denilir. main thread gerekli durumda başka threadleri de yaratabilir.
Java’da multithread kavramı Thread sınıfı ve Runnable interface üzerine kurulmuştur. Yeni bir thread yaratmak ve ona bir görev atamak için bu iki sınıfı kullanabiliriz; birinci yöntemde doğrudan Thread sınıfını extend edip run metodunu override edebiliriz, böylece yeni bir thread sınıfı yaratmış oluruz ve onun objelerini yaratarak doğrudan thread yaratma ve çalıştırma imkanına sahip oluruz. İkinci yöntemde ise Runnable sınıfını implemente eder ve run metodunu override ederek yeni bir task oluştururuz ve bu oluşturduğumuz taskı bir thread objesine verip çalıştırmasını isteriz. 

#Kaynaklar

https://totalview.io/blog/multithreading-multithreaded-applications#:~:text=Multithreading%20is%20a%20model%20of,to%20their%20own%20CPU%20core.
https://www.gencayyildiz.com/blog/multi-thread-calismanin-avantaj-ve-dezavantajlari/
https://medium.com/s%C4%B1f%C4%B1rdan-i%CC%87leri-d%C3%BCzeye-java-e%C4%9Fitim-serisi/multithreaded-programlama-1-k%C4%B1s%C4%B1m-40904a219a18
