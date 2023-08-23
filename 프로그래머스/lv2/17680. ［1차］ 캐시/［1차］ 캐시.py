def solution(cacheSize, cities):
    cache = []
    time = 0
    if cacheSize == 0:
        return len(cities) * 5
    for i in range(len(cities)):
        if len(cache) < cacheSize:
            if cities[i].lower() not in cache:
                time += 5
            else:
                time += 1
            cache.append(cities[i].lower())    
        else:
            if cities[i].lower() not in cache:
                time += 5
                del cache[0]
            else:
                time += 1
                cache.remove(cities[i].lower())
            cache.append(cities[i].lower())
            
    return time