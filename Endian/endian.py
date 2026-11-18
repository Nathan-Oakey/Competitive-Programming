ft = input().split()
input()
s = list(input())
bh = 8 if s[1] == "b" else 2
if ft[0] == ft[1]: print("".join(s))
else:
    st = 2; e = len(s) - 1
    while st < e:
        if bh == 2:
            temp = s[st]
            temp1 = s[st + 1]
            s[st] = s[e - 1]
            s[st + 1] = s[e]
            s[e - 1] = temp
            s[e] = temp1
        else:
            temp = s[st]
            temp1 = s[st + 1]
            temp2 = s[st + 2]
            temp3 = s[st + 3]
            temp4 = s[st + 4]
            temp5 = s[st + 5]
            temp6 = s[st + 6]
            temp7 = s[st + 7]
            s[st] = s[e - 7]
            s[st + 1] = s[e - 6]
            s[st + 2] = s[e - 5]
            s[st + 3] = s[e - 4]
            s[st + 4] = s[e - 3]
            s[st + 5] = s[e - 2]
            s[st + 6] = s[e - 1]
            s[st + 7] = s[e]
            s[e - 7] = temp
            s[e - 6] = temp1
            s[e - 5] = temp2
            s[e - 4] = temp3
            s[e - 3] = temp4
            s[e - 2] = temp5
            s[e - 1] = temp6
            s[e] = temp7
        st += bh; e -= bh
    print("".join(s))

