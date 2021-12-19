object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        require(leftStrand.length == rightStrand.length) {
            "left and right strands must be of equal length"
        }
        return calculateDiff(leftStrand, rightStrand)
    }

    private fun calculateDiff(leftStrand: String, rightStrand: String): Int {
        if(leftStrand == rightStrand)
            return 0

        var diff = 0;

        for(index in leftStrand.indices) {
            if(leftStrand[index] == rightStrand[index]) {
                continue
            }
            diff++
        }
        
        return diff
    }

}



