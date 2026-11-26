s = input()
t = sum(int(c) for c in s)
while(t > 9): 
    s = str(t)
    t = sum(int(c) for c in s)
print(t)