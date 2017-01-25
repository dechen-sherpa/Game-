import java.util.Scanner;
public class game {
	public static void main(String[]args){
		System.out.println("Hi! Welcome to StarSpeller! I’m going to give you a picture and you’re going to help me spell it out!");
		Scanner kb = new Scanner(System.in);
		String name="";
		int num=0;
		System.out.println("First, please enter your name:");
		name = kb.nextLine();
		int level;
		System.out.println("Please enter your level: choose 1 or 2: ");
		level = kb.nextInt();
		while(level!=1 && level != 2){
			System.out.println("This is not valid. Please enter the level ags");
			level = kb.nextInt();
		}
		
        int topic;
		System.out.println("Please enter your topic 1 or 2: ");
		topic = kb.nextInt();
	
		while (topic!=1 && topic != 2) {
			System.out.println("This is not valid. Please enter again.");
			topic = kb.nextInt();
		}
		
	option(level,topic);
	for(int i =0; i<3;i++){
		System.out.print("Do you want to continue: enter 1 to continue, -1 to quit");
		int user = kb.nextInt();
		if(user == 1){ 
			System.out.println("Please enter your level: choose 1 or 2: ");
			level = kb.nextInt();

			System.out.println("Please enter your topic 1 or 2:");
			topic = kb.nextInt();
			option(level,topic);
		}
		else
			System.out.print("Thanks for playing " +name+ "." + " Bye!");
			break;
	}
  }
			
	public static void option(int l,int t){
		if( l==1&&t==1)
			game1(l,t);
		else if(l==1&&t==2)
			game2(l,t);
		else if(l==2&&t==1)
			game3(l,t);
		else if(l==2&&t==2)
			game4(l,t);	
	}

	public static void game1(int a,int b){
		int[] star={0,0,0};
		Scanner kb = new Scanner(System.in);
		
		//p1
        System.out.println("Please link the website to browser and read the pic: http://www.wbhof.com/margo-template/images/team/basketball.png");
        System.out.println("Please enter the word:");// users enter the word
        String uenter, str1 = "basketball";// answer for the w1
        uenter = kb.next();
        
        if (str1.equals(uenter) == true) {// if the answer is correct
			System.out.println("Congratulation! ");
			star[0]=star[0]+1;
		} 
        else {
        int i =0;
        while (i < 1 && str1.equals(uenter) == false) {// one more time
														// to try
			System.out.println("You have one more attempt.");
			uenter = kb.next();
			i++;
		}
		if (str1.equals(uenter)) {
			System.out.println("Congratulation!");
		} 
		else 
			System.out.println("The correct answer is basketball.This is the link for the dictionary: https://www.merriam-webster.com");
       }
      
        String user,str2 = "badminton";
		System.out.println("Please link the website to browser and read the pic: https://www.tutorialspoint.com/badminton/images/badminton_racket.jpg");// the pic show
		System.out.println("Please enter the word:");
		user = kb.next();
		
		
		if(str2.equals(user)==true){
			System.out.println("Congratulations! ");
			star[1]=star[1]+1;
		} else {
			int i=0;
			while(i<1&&str2.equals(user)==false){
			
				System.out.println("You have one more attempt.");
				uenter = kb.next();
				i++;
		    }
		
			if(str2.equals(user)){
				System.out.println("Congratulations!");
				//star[1]=star[1]+1;
			}
			else {
				System.out.println("The correct answer is badminton.This is the link for the dictionary: https://www.merriam-webster.com");
		} 
		
		star[2]=star[0]+star[1];
		System.out.println("You get"+star[2]+"stars.");
     }
	}
	
	public static void game2(int c,int d){
		int[] star={0,0,0};
		Scanner kb = new Scanner(System.in);
		
		//p1
        System.out.println("Please link the website to browser and read the pic: http://apenchantforpaper.blogspot.ca/2015/03/eraser-review-staedtler-rasoplast-combi.html");
        System.out.println("Please enter the word:");// users enter the word
        String uenter, str1 = "eraser";// answer for the w1
        uenter = kb.next();
        
        if (str1.equals(uenter) == true) {// if the answer is correct
			System.out.println("Congratulations! ");
			star[0]=star[0]+1;
		} 
        else {
        int i =0;
        while (i < 1 && str1.equals(uenter) == false) {// one more time
														// to try
			System.out.println("You have one more attempt.");
			uenter = kb.next();
			i++;
		}
		if (str1.equals(uenter)) {
			System.out.println("Congratulations!");
			//star[0]=star[0]+1;
		} 
		else
			System.out.println("The correct answer is eraser.This is the link for the dictionary: https://www.merriam-webster.com");

       }
        
        // p2
        String user,str2 = "book";
		System.out.println("Please link the website to browser and read the pic: http://weknowyourdreams.com/images/book/book-07.jpg");// the pic show
		System.out.println("Please enter the word:");// users enter the word2
		user = kb.next();
		
		
		if(str2.equals(user)==true){// is the answeris correct, ask whether continue.
			System.out.println("Congratulations! ");
			star[1]=star[1]+1;
		}
		
		else{
			int i=0;
			while(i<1&&str2.equals(user)==false){
			
				System.out.println("You have one more attempt.");
				uenter = kb.next();
				i++;
		    }
		
			if(str2.equals(user)){
				System.out.println("Congratulations!");
				//star[1]=star[1]+1;
			} else {
				System.out.println("The correct answer is book.This is the link for the dictionary: https://www.merriam-webster.com");
		}  
		
		star[2]=star[0]+star[1];
		System.out.println("You get"+star[2]+"stars.");
	}
	}
	
	public static void game3(int e,int f){
		int[] star ={0,0,0};
		Scanner kb = new Scanner(System.in);
		
		//p1
        System.out.println("Please link the website to browser and read the pic: http://images.wisegeek.com/uscuba-diver-swimming-underwater-above-white-sand.jpg");
        System.out.println("Please enter the word:");// users enter the word
        String uenter, str1 = "diving";// answer for the w1
        uenter = kb.next();
        
        if (str1.equals(uenter) == true) {// if the answer is correct
			System.out.println("Congratulations! ");
			star[0]=star[0]+1;
			
		} 
        else {
        int i =0;
        while (i < 1 && str1.equals(uenter) == false) {// one more time
														// to try
			System.out.println("You have one more attempt.");
			uenter = kb.next();
			i++;
		}
		if (str1.equals(uenter)) {
			System.out.println("Congratulations!");
			//star[0]=star[0]+1;
			
		} 
		else
			System.out.println("The correct answer is diving.This is the link for the dictionary: https://www.merriam-webster.com");

       }
        
        // p2
        String user,str2 = "kayaking";
		System.out.println("Please link the website to browser and read the pic: http://www.exmooradventures.co.uk/wp-content/uploads/2013/10/DSCN0858.jpg");// the pic show
		System.out.println("Please enter the word:");// users enter the word2
		user = kb.next();
		
		
		if(str2.equals(user)==true){// is the answeris correct, ask whether continue.
			System.out.println("Congratulations! ");
			star[1]=star[1]+1;	
		} else {
			int i=0;
			while(i<1&&str2.equals(user)==false){
			
				System.out.println("You have one more attempt.");
				uenter = kb.next();
				i++;
		    }
		
			if(str2.equals(user)){
				System.out.println("Congratulations!");
				//star[1]=star[1]+1;
				
			}
			else
				System.out.println("The correct answer is kayaking.This is the link for the dictionary: https://www.merriam-webster.com");
		}  
		star[2]=star[0]+star[1];
		System.out.println("You get"+star[2]+"stars.");
    }
	
	public static void game4(int g, int h){
		int[] star ={0,0,0,0};
		Scanner kb = new Scanner(System.in);
		
		//p1
        System.out.println("Please link the website to browser and read the pic: http://core0.staticworld.net/images/article/2015/02/hp-spectre-x360_beauty-100570598-orig.jpg");
        System.out.println("Please enter the word:");// users enter the word
        String uenter, str1 = "laptop";// answer for the w1
        uenter = kb.next();
        
        if (str1.equals(uenter) == true) {// if the answer is correct
			System.out.println("Congratulations! ");
			star[0]=star[0]+1;
		} 
        else {
        int i =0;
        while (i < 1 && str1.equals(uenter) == false) {// one more time
														// to try
			System.out.println("You have one more attempt.");
			uenter = kb.next();
			i++;
		}
		if (str1.equals(uenter)) {
			System.out.println("Congratulations!");
		} 
		else
			System.out.println("The correct answer is laptop. This is the link for the dictionary:https://www.merriam-webster.com");
       }
        
        // p2
        String user,str2 = "calculator";
		System.out.println("Please link the website to browser and read the pic: https://btmedia.whsmith.co.uk/pws/client/images/catalogue/products/3533/44/08/xlarge/35334408_1.jpg");// the pic show
		System.out.println("Please enter the word: ");// users enter the word2
		user = kb.next();
		
		
		if(str2.equals(user)==true){// is the answeris correct, ask whether continue.
			System.out.println("Congratulations! ");
			star[1]=star[1]+1;
		}
		
		else{
			int i=0;
			while(i<1&&str2.equals(user)==false){
			
				System.out.println("You have one more attempt.");
				uenter = kb.next();
				i++;
		    }
		
			if(str2.equals(user)){
				System.out.println("Congratulations!");
				
			}
			else {
			 	System.out.println("The correct answer is calculator. This is the link for the dictionary: https://www.merriam-webster.com");
		} 
	star[2]=star[0]+star[1];
	System.out.println("You get"+star[2]+"stars.");
	
	}
}
}
