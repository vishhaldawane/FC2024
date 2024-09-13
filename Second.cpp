#include <iostream>
using namespace std;


//class is nothing but structure

class Book { // Skeleton

	//by default structure content is public

	int bookId;
	string bookName;
	float price;

	public:

	void setData(int b, string str, float p) {
		bookId = b;
		bookName=str;
		price = p;
	}
	void showData() {
		cout<<"\nBook Id   : "<<bookId;
		cout<<"\nBook Name : "<<bookName;
		cout<<"\nBook Price: "<<price;
	}
};

class Song { // Skeleton


	string songTitle;
	string album;
	string artist;
	int year;
 

	public:
	
	void setData(string title, string alb, string art, int yr) {
		songTitle=title;
		album=alb;
		artist=art;
		year=yr;
	}
	void showData() {
		cout<<"\nTitle : "<<songTitle;
		cout<<"\nAlbum : "<<album;
		cout<<"\nAuthor: "<<artist;
		cout<<"\nYear  : "<<year;
	}
};
int main() {

	Book book;
	book.setData(101,"C++ Programming",190);
	book.showData();
	cout<<"\n----------------\n";

	Song song;
	song.setData("Zhingat","Sairat","Ajay Atul",2016);
	song.showData();

	book.bookName= song.album;
	song.year = book.price;

	cout<<"\n---some changes made---\n";
	book.showData();
	song.showData();
/*
	Book bunch[5];

		bunch[0].setData(101,"Java Programming",290),
		bunch[1].setData(102,"Oracle Scripting",400),
		bunch[2].setData(103,"Unix Shell",700),
		bunch[3].setData(104,"Spring Boot",900),
		bunch[4].setData(105,"Angular",600),

	cout<<"\n-----------------------------";

	for(int i=0;i<5;i++) {
		bunch[i].showData();
		cout<<"\n------";
	}
*/

	cout<<endl;
	return 0;
	
};

