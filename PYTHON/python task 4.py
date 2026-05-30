
for x in range(10):
    print("tinker is in class")

x=int(input("Enter values between 0 and 100"))

print("numbers between 0 and 100:")
    
for x in range(0,101):
    print(x)


x=1
while x<=100:
    print("RETRY AGAIN")
    x=x+1

    
x=int(input("enter the mark:"))

while x<=0 and x<100:
    print("entered mark is correct")
    

if x>=70 and x<=100:
    print("DISTINCTION")
elif x>=60 and x<70:
    print("BACHELOR")
elif x>=50 and x<60:
    print("PASS")
elif x>=50 and x<40:
    print("FAIL")
else:
    print("REPEAT")    
