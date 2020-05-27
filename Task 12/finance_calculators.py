import math
 #selection window/ Choose calculation type
calculation_type = input('''Choose either "investment" or "bond" in the menu below:
investment \t - to calculate the amount of interest you'll earn on interest
bond \t\t - to calculate the amount you'll have to pay on a home loan
''').lower()

if calculation_type  == "investment":
    print("You have selected the investment calculator")
    deposit = float(input("what is your deposit ammount: "))
    intrest = float(input("what is the intrest rate: "))
    rate = intrest / 100
    years = float(input("number of years investing: "))
    intrest_met = input("would you like 'simple' or 'compound' investment:" )
    if intrest_met == "simple":
        final_amount = deposit * ((1 + rate * years))
        print(f"This is the total after the investment period: {final_amount:.2f}")
    elif intrest_met == "compound":
        print(deposit * math.pow((1 + rate), years)) 
   #sould display investment calculation either simple or compund              
if calculation_type == "bond":
    print("You have selected the Bond calculator")
    if calculation_type == "bond":
        house_val = float(input("What is the house value: "))
        bond_int = float(input("Enter the intrest rate: "))
        bonterm_months = int(input("Repayment months term: "))
        bondrepay = house_val * (bond_int * (1 +  bond_int) ** bonterm_months) / ((1 + bond_int) ** bonterm_months -1)
        print("The montly morgage payment is\n (%.2f)" % bondrepay)
  #sould display bond calculation    


    

        
        
