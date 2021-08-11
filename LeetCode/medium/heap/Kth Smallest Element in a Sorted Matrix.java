class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        //store elements in a max heap of size k
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>( (a,b) -> b-a);
        
        //iterate through matrix
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                //store element in maxHeap
                maxHeap.offer(matrix[i][j]);
                
                //if maxHeap size has exceeded k , pop the root
                if(maxHeap.size()>k)
                    maxHeap.poll();
            }
        }
        
        //return the root of the maxHeap of k size
        return maxHeap.peek();
    }
}
