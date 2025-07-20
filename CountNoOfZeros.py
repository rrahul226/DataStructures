Num=int(input("Enter a Number: "))
count=0
def CountNoOfZeros(Num,count):
    if(Num==0):
        return count
    rem=Num%10
    if(rem==0):
        return CountNoOfZeros(Num//10,count+1)
    return CountNoOfZeros(Num//10,count)
print("CountNoOfZeros Of a given Number: ",CountNoOfZeros(Num,count))

        

