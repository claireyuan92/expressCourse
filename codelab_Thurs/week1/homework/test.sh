declare -a arr=(26 80 82 83 347 173 226 101 75)
for i in "${arr[@]}"
do
    leetcode  show "$i" --gen -l java
done

