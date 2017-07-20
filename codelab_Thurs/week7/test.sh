declare -a arr=(281 341 604 211 400 359)
for i in "${arr[@]}"
do
    leetcode  show "$i" --gen -l java
done
