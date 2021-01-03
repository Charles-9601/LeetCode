with open('file.txt', ) as f_object:
    for i in range(9):
        f_object.readline()
    print(f_object.readline(), end='')
