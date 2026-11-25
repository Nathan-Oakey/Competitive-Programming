s = input()
w = 0
l = 0
u = 0
y = 0
for c in s:
    if c == "_": w += 1
    elif c.isalpha() and c.islower(): l += 1
    elif c.isalpha() and c.isupper(): u += 1
    else: y += 1
s = len(s)
print(w / s, "\n", l / s, "\n", u / s, "\n", y / s)