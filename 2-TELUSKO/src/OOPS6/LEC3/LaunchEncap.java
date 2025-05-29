package OOPS6.LEC3;
class Book{
   private int pageNum;
   void disp(){
      System.out.println("Java and inheritence present in pagenumber"+pageNum);
   }
   void setPageNum(int pgNo) {
      pageNum = pgNo;
   }
//   to get the pagenumber from the private entity
//   his sole purpose is to get the value

   int getPageNum(){
      return pageNum;
   }
//   method whose sole purpose is to set the value of pageNum
}
public class LaunchEncap {
   public static void main(String[] args) {

   Book book=new Book();
//   private pageNum is not access here only access in the same class
//   book.pageNum=4;
//      if we want  to set the page number we cannot update directly but we call setPageNum
      book.setPageNum(12);
   book.disp();
   }

}

