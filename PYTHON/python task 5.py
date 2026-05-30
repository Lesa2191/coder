for x in range(10):
    while True:
        try:
            x=int(input("Enter number between 0 and 100:"))
            if 0<= x <= 100:
                break
            else:
                print("Enter number between 0 and 100:")
        except :
                print("Enter valid number.")


    if 70<= x<=100:
       print("DISTINCTION")
    elif 60 <= x <70:
       print("BACHELOR")
    elif 50 <= x <60:
       print("PASS")
    elif 40 <= x <50:
       print("FAIL")
    else:
       print("REPEAT")    
         
