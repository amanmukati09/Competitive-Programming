for t in range(int(input())):
    s,a,b,c = input()+' ',0,1,1
    for i in range(len(s)-1):
        if s[i] == s[i-1]:
            a, b, c = a+1, b*(a+1) % 998244353, c+1
        else:
            b, c = b*c % 998244353, 1
        print(a,"-",b,"-",c)
    print(a, b*c % 998244353)



