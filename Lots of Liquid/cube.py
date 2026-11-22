import math
n = int(input())
s = input().split(" ")
t = 0
for i in s: 
    c = float(i)
    t += (c * c * c)
print(math.cbrt(t))