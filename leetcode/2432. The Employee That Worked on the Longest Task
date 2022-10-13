class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int max_val = logs[0][1], id = logs[0][0];
        for(int i=1; i<logs.length; i++){
            int time_req = logs[i][1] - logs[i-1][1];
            if(time_req >= max_val){
                if(time_req == max_val){
                    id = Math.min(id, logs[i][0]);
                }else{
                    max_val = time_req;
                    id = logs[i][0];
                }
            }
        }
        return id;
    }
}
