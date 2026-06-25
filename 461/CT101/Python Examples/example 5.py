print("BMI program: enter details")
H=eval(input("enter your height in centimeters: "))
W=eval(input("enter your weight in kilograms: "))
height=H/100
bmi=W/(height*height)
print("your body mass index is: ",bmi)
