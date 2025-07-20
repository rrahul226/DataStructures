l=list(map(int,input("Enter Elements: ").split()))
print(l)
index=0
def SortedOrNot(l,index):
    if(l[index]==len(l)):
        return True
    return l[index]<l[index+1] and SortedOrNot(l,index+1)
print(SortedOrNot(l,index))
