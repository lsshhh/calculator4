package com.example.calculator111111



class AddOperation : AbstractOperation() {
    override fun calculate(num1: Double, num2:Double):Double {

        return  num1 + num2

    }

    override fun nextCalculate(num3: Double?, num4: Double): Double {
        return num3!!.toDouble() +num4
    }


}

class SubtractOperation: AbstractOperation(){
    override fun calculate(num1: Double, num2: Double): Double {

        return num1 - num2
    }

    override fun nextCalculate(num3: Double?, num4: Double): Double {
        return num3!!.toDouble()-num4
    }


}

class MultiplyOperation: AbstractOperation(){
    override fun calculate(num1: Double, num2: Double): Double {

        return num1*num2
    }

    override fun nextCalculate(num3: Double?, num4: Double): Double {
        return num3!!.toDouble()*num4
    }


}

class DivideOperation: AbstractOperation(){
    override fun calculate(num1: Double, num2: Double): Double {
        if(num2 ==0.0 ){
            throw Exception("Can't divided by 0")
        }

        return num1 / num2
    }

    override fun nextCalculate(num3: Double?, num4: Double): Double {
        if(num4 ==0.0 ){
            throw Exception("Can't divided by 0")
        }

        return num3!!.toDouble() / num4
    }
}
