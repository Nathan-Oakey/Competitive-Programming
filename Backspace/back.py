s = input()
m = []
for c in s:
    if c == "<" and m: m.pop()
    else: m.append(c)
print("".join(m))