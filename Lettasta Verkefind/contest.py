p = int(input())
t = int(input())
s = input().split(" ")
a = [0] * p
for _ in range(t):
    b = input().split(" ")
    for i in range(p): 
        a[i] += int(b[i])

mv = 0
mi = 0
for i in range(p):
    if a[i] > mv: 
        mv = a[i]
        mi = i

print(s[mi])