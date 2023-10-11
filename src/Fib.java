public class Fib {
    int First = 0;
    int Second = 1;
    int Next;

    Fib(int numbers){
         for (int i = 0; i < numbers; i++){
             if(i < 2){
                 System.out.println(1);
             }
             else{
                 Next = First + Second;
                 First = Second;
                 Second = Next;

                 System.out.println(Next);
             }
         }
    }
}
