#include<iostream>
using namespace std;

class Bank {
public:
    string name;
    int account_number;
    float bal;

    void getData() {
        cout << "Enter Name: ";
        cin >> name;

        cout << "Enter Account Number: ";
        cin >> account_number;

        cout << "Enter Balance: ";
        cin >> bal;
    }

    void display() {
        cout << "\nName: " << name;
        cout << "\nAccount Number: " << account_number;
        cout << "\nBalance: " << bal << endl;
    }

    void deposit(float amt) {
        bal += amt;
        cout << "Amount Deposited: " << amt << endl;
        cout << "Updated Balance: " << bal << endl;
    }

    void withdraw(float amt) {
        if (amt > bal) {
            cout << "Insufficient Balance" << endl;
        }
        else {
            bal -= amt;
            cout << "Amount Withdrawn: " << amt << endl;
            cout << "Remaining Balance: " << bal << endl;
        }
    }
};

int main() {
    Bank b;
    int choice;
    float amt;

    b.getData();

    do {
        cout << "\n1. Deposit";
        cout << "\n2. Withdraw";
        cout << "\n3. Display";
        cout << "\n4. Exit";
        cout << "\nEnter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter amount to deposit: ";
                cin >> amt;
                b.deposit(amt);
                break;

            case 2:
                cout << "Enter amount to withdraw: ";
                cin >> amt;
                b.withdraw(amt);
                break;

            case 3:
                b.display();
                break;

            case 4:
                cout << "Thank You!" << endl;
                break;

            default:
                cout << "Invalid Choice!" << endl;
        }

    } while (choice != 4);

    return 0;
}