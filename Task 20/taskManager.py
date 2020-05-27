from datetime import date
current_date = date.today()
print(str(current_date))
User_file = open('user.txt', 'r+')
user_login = {}
for line in User_file:
    user_details = line.split(", ")
    user_login[user_details[0]] = str(user_details[1]).replace("\n", "")#strip away user.txt line by line 
print("LOG ON BELOW")#log in screen start
User_name = ""
User_password = ""
while True:#log in loop begin 
    User_name = input("Enter your Username: ")
    if user_login.get(User_name):#finds user name in dictionary 
        print("welcome"+ " "+ User_name)
        break
    else:
        print("Wrong user id ")
while True:
    User_password = input("Enter your password: ")
    if User_password == user_login[User_name]:
        print("Correct password ")
        break
    else:
        print("Wrong user password ")#log in loop end
#at this point user should be able to log in 
#admin vs other user menu selection here 
if User_name ==  ("admin"):
    print("Please select one of the following options:\n", "r - register user\n", "a - add task\n", "va - view all task\n", "vm - view my task\n","St - view statistics\n" , "e - exit\n")
else:
    print("Please select one of the following options:\n", "a - add task\n", "va - view all task\n", "vm - view my task\n", "e - exit\n")
User_selection = input(" Enter your selection here: ")#user selection input 
if User_selection == str("r") and User_name == ("admin"):
    New_passwordS = open('user.txt', 'r+')
    New_passwordS.read()
    print("Register a new user ID and password ")
    New_userId = input("Enter your new user Id here: ")
    while New_userId == New_passwordS:
        print("that user exists ")
        New_userId = input("Enter your new user Id here: ")
    new_passwordreg = input("Enter your new password here: ")
    Confirmation = input("Confirm your password: ")
    while new_passwordreg != Confirmation:
        print("Passwords don't match: ")
        new_passwordreg = input("Enter your new password here: ")
        Confirmation = input("Confirm your password: ")
    New_passwordS.read()
    New_passwordS.write("\n" + New_userId + ", " + new_passwordreg)
    New_passwordS.close()
elif User_selection == str("a"):
    add_tasks = open('tasks.txt', 'r+')
    Task_user = input("Task user name: ")
    task_title1 = input("Task title: ")
    task_description1 = input("Task description: ")
    task_due1 = input("Task due date: ")
    task_compl = "No"
    add_tasks.read()
    add_tasks.write("\n" + Task_user + ", " + task_title1 + ", " +  task_description1 + ", " + str(current_date) + ", " + task_due1 + ", " + task_compl)
    add_tasks.close()

elif User_selection == str("va"):#formatting on screen 
    task_display_open = open('tasks.txt', 'r')
    for task_display in task_display_open:
        line_task = task_display.split(", ")
        print("Task assigned to User: " + "\t"  + line_task[0] + "\n" + "Task title: " + "\t" + line_task[1] +"\n" + "Task description: " + line_task[2] +"\n" + "Task assigned date: " + "\t" + line_task[3]+"\n" + "Task due date: " + "\t" + line_task[4]+"\n" + "task Completed: " + line_task[5])
    task_display_open.close()
elif User_selection == str("vm"):
    task_view_open = open('tasks.txt', 'r')
    for line in task_view_open:
        user = line.split(", ")
        if User_name == user[0]:
            print("Task assigned to User: " + "\t"  + user[0] + "\n" + "Task title: " + "\t" + user[1] +"\n" + "Task description: " + user[2] +"\n" + "Task assigned date: " + "\t" + user[3]+"\n"+ "Task due date: " + "\t" + user[4]+"\n"+ "task completed: " + user[5])#formatting on screen 
    task_view_open.close()
elif User_selection.lower() == str("st") and User_name == ("admin"):
    task_display_open1 = open('tasks.txt', 'r')
    User_file1 = open('user.txt', 'r')
    total_user = 0
    total_tasks = 0 
    for line in task_display_open1:
        total_tasks += 1
    for line in User_file1:
        total_user +=1
    print("The total number of tasks: " + str(total_tasks))#user display " "
    print("The total number of users: "+ str(total_user))#user display " "
#
elif User_selection == str("e"):
    exit(0)