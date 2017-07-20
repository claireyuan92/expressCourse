declare -a arr=(153 278 162 129 297 437 449)
for i in "${arr[@]}"
do
    leetcode  show "$i" --gen -l java
done

