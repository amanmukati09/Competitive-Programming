for s in [*open(0)][1:]:

    l, r = map(int, s.split())
    r &= ~(l < r)
    d = -1
    i = 2S
    
    while i*i <= r:

        d = (i, d)[r % i > 0]
        i += 1
        print(*[d, r-d][:d])
