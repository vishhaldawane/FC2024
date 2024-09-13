#include <iostream>
using namespace std;

int main() {

	int bookId=101;
	char bookName[20]="Java Programming";
	float price=190;

	int bookIds[5]={101,102,103,104,105};
	char bookNames[5][20]={
			"Java Programming",
			"Oracle Scripting",
			"Unix scripting",
			"Spring Boot",
			"Angular Coding"
	};
	float prices[5]={290,500,300,700,600};

	cout<<"\nBook Id   : "<<bookId;
	cout<<"\nBook Name : "<<bookName;
	cout<<"\nBook Price: "<<price;
	cout<<"\n-----------------------------";

	for(int i=0;i<5;i++) {

		cout<<"\nBook Id    from array  : "<<bookIds[i];
		cout<<"\nBook Name  from array  : "<<bookNames[i];
		cout<<"\nBook Price from array  : "<<prices[i];
		cout<<"\n------";
	}


	cout<<endl;
	return 0;
	
};

