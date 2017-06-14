declare -a arr=(16 18 11 228 163 57 24 25 246 380 17 166)
for i in "${arr[@]}"
do
    leetcode  show "$i" --gen -l java
done

