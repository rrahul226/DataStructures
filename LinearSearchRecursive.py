l=list(map(int,input("Enter Elements: ").split()))
print("The Given List is: ",l)
key=int(input("Enter Key: "))
index=0
def linearSearch(l,index,key):
    if(l[index]==key):
        return True
    if(index==len(l)-1):
        return False
    return linearSearch(l,index+1,key)
if(linearSearch(l,index,key)):
    print("Element Found")
else:
    print("Not Found")
