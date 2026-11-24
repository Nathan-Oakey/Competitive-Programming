s = input()
l = len(s) // 3
w1 = s[0: l]
w2 = s[l : 2 * l]
w3 = s[2 * l :]

print(w1 if w1 == w2 else w3)