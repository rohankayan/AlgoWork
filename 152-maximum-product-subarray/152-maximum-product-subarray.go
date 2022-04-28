// You can edit this code!
// Click here and start typing.
package main

import "fmt"

func max ( a, b int ) int {
    if a > b {
        return a
    }

    return b
}

func min ( a, b int ) int {
    if a < b {
        return a
    }

    return b
}


func maxProduct(nums []int) int {
    
    global_max := nums[0]
    local_max := nums[0]
    local_min := nums[0]
    for i := 1 ; i<len(nums) ; i++ {
        temp := local_max
        local_max = max(nums[i],max(nums[i]*local_max,nums[i]*local_min))
        local_min = min(nums[i],min(nums[i]*temp,nums[i]*local_min))
        
        global_max = max(global_max,local_max)
        
    }
    
    return global_max
}