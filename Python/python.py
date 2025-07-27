a=input()
h={}
for i in a:
    count=0
    for j in a:
        if(i==j):
            count+=1
            h[i]=count

max=h[a[0]]
min=h[a[0]]
for i in a:
    if(max<=h[i]):
        max=h[i]
    if(min>=h[i]):
        min=h[i]


printed_freqs = set()
for i in a:
    freq = h[i]
    if freq not in printed_freqs:
        c = []
        for j in a:
            if h[j] == freq and j not in c and j != ' ':
                c.append(j)
        c.append(freq)
        print(*c)
        printed_freqs.add(freq)
