n = int(input())
s = []
for i in range(n): s.append(input())
m = int(input())
for i in range(m): 
    d = False
    for i in range(6):
        if (input() in s): d = True
    print("Hæfileikalaust Drasl") if d else print("Fínn Stokkur")