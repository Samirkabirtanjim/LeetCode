fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>() // Stores number -> index
    
    for ((index, num) in nums.withIndex()) {
        val complement = target - num
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, index)
        }
        map[num] = index
    }

    return intArrayOf() // Guaranteed to never reach this line
}
