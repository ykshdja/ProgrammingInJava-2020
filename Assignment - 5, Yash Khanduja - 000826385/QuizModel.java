/**
 *
 * @author - Yash Khanduja, 000826385
 *
 *
 */
package mathquiz;

import java.util.Random;


public class QuizModel {
    //operands for the question
    int operand1,operand2;
    //to track quiz score
    int total,score;
    //range of random number being generated
    int max,min;
    String type;
    //to generate random numbers
    Random rand;

    /**
     * Constructor for QuizModel
     *
     * @param type  of the quiz question addition, substraction, multiplication or division
     * @param min  value of the randomly generated operand
     * @param max value of the randomly generated operand
     */
    public QuizModel(String type,int min,int max){
        this.type=type;
        this.max=max;
        this.min=min;
        rand=new Random();
    }

    /**
     * @return  value of operand 1
     */
    public int getOperand1() {
        return operand1;
    }
    /**
     * To set random value of operand 1
     */
    public void setOperand1() {
        this.operand1 = rand.nextInt(max)+min;
    }

    /**
     * @return  value of operand 2
     */
    public int getOperand2() {
        return operand2;
    }
    /**
     * To set random value of operand 2
     */
    public void setOperand2() {
        this.operand2 = rand.nextInt(max)+min;
    }
    /**
     * @return  if true answer is correct for the current question else false
     */
    public boolean isCorrect(double result) {
        boolean res=false;
        result=Math.round(result);
        if(type.equalsIgnoreCase("addition")){
            if((operand2+operand1)==result){
                return true;
            }else{
                return false;
            }
        }else if(type.equalsIgnoreCase("substraction")){
            if((operand1-operand2)==result){
                return true;
            }else{
                return false;
            }
        }else if(type.equalsIgnoreCase("multiplication")){
            if((operand1*operand2)==result){
                return true;
            }else{
                return false;
            }
        }else if(type.equalsIgnoreCase("division")){
            if(Math.round((operand1/operand2))==result){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }


    /**
     * @return  score of the quiz
     */
    public int getScore() {
        return score;
    }
    /**
     * @param Score of the current quiz
     */
    public void setScore(int score) {
        this.score = score;
    }
    /**
     * @return type of current quiz question
     */
    public String getType() {
        return type;
    }
    /**
     * @param type of the quiz question
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return  current question of the quiz
     */
    public String getQuestion(){

        this.setOperand1();
        this.setOperand2();
        String question="";
        if(type.equalsIgnoreCase("addition")){
            question=operand1+"+"+operand2+"=";
        }else if(type.equalsIgnoreCase("substraction")){
            question=operand1+"-"+operand2+"=";
        }else if(type.equalsIgnoreCase("division")){
            question=operand1+"/"+operand2+"=";
        }else if(type.equalsIgnoreCase("multiplication")){
            question=operand1+"*"+operand2+"=";
        }
        return question;
    }

    /**
     * @param total question completed
     */
    public void setTotal(int total){
        this.total=total;
    }

    /**
     * @return total question completed
     */
    public int getTotal(){
        return this.total;
    }

}

