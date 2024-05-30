class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        // var answer= IntArray(4){0}
        var Xline=IntArray(4){0}
        for ( i in 0 until wallpaper.size){
            if( wallpaper[i].contains("#")){
                Xline[0]=i
                break  
            }
        }
        for ( i in wallpaper.size-1 downTo 0){
            if( wallpaper[i].contains("#")){
                Xline[2]=i+1
                break
            }
        }
        var stop = 0
        for ( i in 0 until wallpaper[0].length){
            for(j in 0 until wallpaper.size){
                if( wallpaper[j][i] == '#'){
                    Xline[1]=i
                    stop=1
                    break
                }
            }
            if (stop== 1){
                    break
            }
        }
        stop= 0
        for (i in wallpaper[0].length-1 downTo 0){
            for (j in 0 until wallpaper.size){
                if(wallpaper[j][i] == '#'){
                    Xline[3]=i+1
                    stop=1
                    break
                }
            }
            if (stop==1){
                break
            }
        }
        return Xline
    }
}