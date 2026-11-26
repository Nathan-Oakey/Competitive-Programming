s = input().split(";")
t = 0
for g in s:
    if "-" in g: 
        g = list(map(int, g.split("-")))
        t += g[1] - g[0] + 1
    else: t += 1
print(t)