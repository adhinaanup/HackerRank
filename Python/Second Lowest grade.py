n=int(input("Enter the no of students : "))
li=[]
for i in range(n):
  li.append([name,grade])
li.sorted(key=lambda x:x[1])
lowest=li[0][1]
second=0.0
for name,grade in li:
  if grade>lowest:
    second=grade
    break
result=[]
for name,grade in li:
  if grade==second:
    result.append(name)
result.sort()
for i in result:
  print(i)
