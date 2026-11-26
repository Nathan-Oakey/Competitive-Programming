s = input()
t = 0
h = 0
for c in s:
    if c == "T": t += 1
    else: h += 1
    if abs(t - h) >= 2 and max(t , h) >= 11: t, h = 0, 0
print(f"{t}-{h}")