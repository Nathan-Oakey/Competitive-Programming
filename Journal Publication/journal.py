n = int(input())
l = ""
a = []
for _ in range(n):
    p = input().split()[1:]
    v = [m for m in p if m >= l]
    if not v: 
        print("impossible")
        exit()
    s = min(v)
    a.append(s)
    l = s
for i in a: print(i)
