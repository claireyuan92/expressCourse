declare -a arr=(3 402 282 84 422 316)
for i in "${arr[@]}"
do
    leetcode  show "$i" --gen -l java
done

