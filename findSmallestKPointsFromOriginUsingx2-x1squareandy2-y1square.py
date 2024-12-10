import math
import heapq

def main(arraysOfarr,k ):
    # do loop 
    answ = {}
    x2=0
    y2=0
    
    for arr in arraysOfarr:
        x1=arr[0]
        y1=arr[1]
        result=((x1-x2)**2 + (y1-y2)**2) 
        print(result)
        answ[math.sqrt(result)]= arr

    print(answ)
    smallest_keys = n_smallest_keys_with_values(answ, k)


    for value in smallest_keys.values():
        print(value)

def n_smallest_keys_with_values(input_dict, n):
    # Find the n smallest keys
    smallest_keys = sorted(input_dict.keys())[:n]
    # Create a dictionary with these keys and their values
    return {key: input_dict[key] for key in smallest_keys}
        


main([[1,3],[-2,2]],1)
print('--------------------')
main([[3,3],[5,-1],[-2,4]],2)
    
