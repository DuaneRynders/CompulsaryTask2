print("Please select one of the following options:\n", "r - register user\n", "a - add task\n", "va - view all taks\n", "vm - view my taks\n", "e - exit\n")
User_selection = input(" Enter your selection here: ")
if User_selection == str("r"):
    New_passwordS = open('user.txt', 'r+')
    print("Register a new user ID and passowrd ")
    New_userId = input("Enter your new user Id here: ")
    new_passwordreg = input("Enter your new password here: ")
    splitData = New_passwordS.split(", ")
    New_passwordS.close()
if User_selection == str("a"):
    User_allocation = input("Allocate user: ")
    task_title = input("Select task: ")