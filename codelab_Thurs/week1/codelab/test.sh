declare -a arr=(19 2 86 155)
for i in "${arr[@]}"
do
    leetcode  show "$i" --gen -l java
done

