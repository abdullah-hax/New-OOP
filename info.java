package newOOP;

//-------------------------------------------------------
/*  Engine engine1;          // শুধু নাম + টাইপ
    engine1 = new Engine();  // আসল object
 

৪️⃣ Memory-level intuition (exam-friendly)

Engine engine1;
    → stack এ একটা reference variable
    → value = null

engine1 = new Engine();
    → heap এ Engine object
    → reference এখন সেই object-কে point করছে */

//-------------------------------------------------------

/* - extends means প্রসারিত করা , তবে java তে অন্তর্ভুক্ত অর্থে ব্যবহৃত হবে 

        class Bird extends Animal
        class Toyota extends Car 
        
        =>  Bird, Animal এর অন্তর্ভুক্ত 
            তাই Animal এর বৈশিষ্ট্যগুলো inheretantly পাবে
            is a সম্পর্ক আছে
        
   - implements means বাস্তবায়ন করা

        class Smartphone implements Camera, GPS 
        class Nagad implements Payment, Transfer  
        
        => Nagad, Transfer & Payment করতে সক্ষম 
           Smartphone, Camera & GPS এর কাজগুলো করতে সক্ষম 
           
        example: class Bank implements Transfer, SaveGold
                 class Uber implements Riding
                 Father implements Business, Cooking, Journey 
                 
                (Listening -> Shadowing -> //@ Juggling)

        Interface, inheretance না  */