func dfs(grid [][]int, i, j, n, m int) int {
	//if i < 0 || j < 0 || i >= n || j >= m {
	//	return 0
	//}
    
    if i == 0 || j == 0 || i == n-1 || j == m-1 {
        if grid[i][j] == 0 {
            return 0
        }
		
	}

	if grid[i][j] == 1 || grid[i][j] == 2 {
		return 1
	}

	ans := 1
	// 1 = water, 2 = visited and 0 = land 
	 
	grid[i][j] = 2
	ans *= dfs(grid, i+1, j, n, m) //why are you multiplying here , border condition will make it 0 always 
  //yes,  idea is if any border condition we hit , we have to consider as zerro and multiple so ans will be zero 
  // and when all are 1 , ans will 1 , that will get added to result.
  
	ans *= dfs(grid, i, j+1, n, m)
	ans *= dfs(grid, i-1, j, n, m)
	ans *= dfs(grid, i, j-1, n, m)
	return ans
}

func closedIsland(grid [][]int) int {
	count := 0
	n := len(grid)
	m := len(grid[0])
	for i, row := range grid {
		for j, val := range row {
			if val == 0 {
				count += dfs(grid, i, j, n, m)
				//fmt.Println("========" , count)
				//print(grid)
				//fmt.Println("========")
			}
		}
	}
	return count
}