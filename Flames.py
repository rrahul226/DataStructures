#Flames Project

#Input from the User
N1=input("Enter 1st Name: ").lower().replace(' ','')
N2=input("Enter 2nd Name: ").lower().replace(' ','')
flame_list=list("flames")

#Removing Common letters
for ch in N1:
    if ch in N2:
        Name1=N1.replace(ch,'',1)
        Name2=N2.replace(ch,'',1)
l1=len(Name1)+len(Name2)

#Finding Relation between people
while len(flame_list)>1:
    split_index=((l1%len(flame_list))-1)
    if split_index>=0:
        right=flame_list[split_index+1:]
        left=flame_list[:split_index]
        flame_list=right+left
    else:
        flame_list=flame_list[:len(flame_list)-1]

#Final Output
res=flame_list[0]
if(res=='f'):
    print("Friends")
elif(res=='l'):
    print("Lovers")
elif(res=='a'):
    print("Attraction")
elif(res=='m'):
    print("Marriage")
elif(res=='e'):
    print("Enemies")
elif(res=='s'):
    print("Sister")
else:
    print("Working Issue")

