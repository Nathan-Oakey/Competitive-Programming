a = input()

s = []

if a.isalpha() and a.islower(): s.append("flatcase")

if a.isalpha() and a.isupper(): s.append("SCREAMINGCASE")

b = []
c = ""

for d in a:
    if d.isupper() and c:
        b.append(c)
        c = d
    else: c += d
b.append(c)

if a.isalpha() and all(p[0].isupper() and (len(p) == 1 or p[1:].islower()) for p in b): s.append("PascalCase")
if a.isalpha() and (b[0][0].islower() and (len(b[0]) == 1 or b[0][1:].islower()) and all(p[0].isupper() and (len(p) == 1 or p[1:].islower()) for p in b[1:])): s.append("camelCase")

b = a.split("-")
if all(p.isalpha() and p.islower() for p in b): s.append("kebab-case")
if all(p.isalpha() and p.isupper() for p in b): s.append("COBOL-CASE")
if all(p.isalpha() and p[0].isupper() and (len(p) == 1 or p[1:].islower()) for p in b): s.append("Train-Case")

b = a.split("_")
if all(p.isalpha() and p.islower() for p in b): s.append("snake_case")
if all(p.isalpha() and p.isupper() for p in b): s.append("MACRO_CASE")

v= True
if a.isalpha(): 
    for i, c in enumerate(a): 
        if (i % 2 == 0 and not c.islower()) or (i % 2 == 1 and not c.isupper()): 
            v = False
            break

if v and a.isalpha(): s.append("sPoNgEcAsE")
    
if s:
    s.sort()
    for c in s: print(c)
else: print("O nei!")