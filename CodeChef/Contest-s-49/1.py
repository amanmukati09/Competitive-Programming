from collections import Counter
t = int(input())
for i in range(t):
    n = int(input())
    arr = list(map(int,input().split(" ")))
    freq = Counter(arr)
    coun = list(freq.values())
    coun.sort()
    if coun[-1]%2 == 0:
        coun[-1] = coun[-1]//2
    else:
        coun[-1] = (coun[-1]+1)//2
    coun.sort()
    print(coun[-1])
        
        
    
    