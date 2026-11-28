t = 0
c = 0
g = 0
for s in input():
    if s == "T": t += 1
    elif s == "C": c += 1
    else: g += 1

print(t * t + c * c + g * g + 7 * min(t, c, g))