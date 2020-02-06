import random
def fn():

    result = []
    for i in range(8):
        result.append(random.randrange(10,55)) #numeros
        result.append(random.randrange(10,55)) #min
        result.append(random.randrange(10,55)) #mas
    
    random.shuflle(result)

    return ''.join([str(x) for x in result])

a = fn()

print(a)