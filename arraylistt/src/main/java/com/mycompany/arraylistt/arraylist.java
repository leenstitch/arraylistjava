
package com.mycompany.arraylistt;

public class arraylist {
  private  int size;
  private  int a[]=new int[1];

public void arraylist(){
    size=0;
   
}
public int getSize(){//return the size of the arrylist
    return this.size;
}
public int[] getA(){
    return this.a;
}
@Override
  public String toString(){
    String str="";
    for(int i=0;i<size;i++){
        str=str+a[i]+" ";
    }
    return str;
}
  void enc(int i){//follows to addlast method its to copy the old arry to a new one
       int anew[]=new int[size*2];
            for(int j=0;j<a.length;j++){
                anew[j]=a[j];
  }
             
            a=anew;
      a[size]=i;
      size++;
  
  }
  
  void copy(int size){//copy the old arraylist to a new one
      int anew[]=new int[size*2];
            for(int j=0;j<a.length;j++){
                anew[j]=a[j];
  }
            a=anew;
           
  }
    void addlast(int i) {//add elemnt to last index in the array
        if(size==a.length){
enc(i);
            }
           
       else{
        a[size]=i;
        size++;
        }
    }

    void removelast() {//remove thr last elemnt in the array
        if(size>0){
            size--;
        }
        else if(size==0){
            System.out.println("-1");
        }
    }

    void add(int i, int index) {
        if(index>size){
           copy(this.size);
           a[index]=i;
           
        }
        else if(index==a.length){
            copy(this.size);
            a[index]=i;
        }
        else if(index<size){
            copy(this.size);
            int m=a[index];
             a[size]=a[size-1];
            for(int k=size-1;k>index;k--){
             a[k]=a[k-1];   
            }
            
            a[index]=i;
            size++;
        }
        else if(index==size){
            a[index]=i;
            size++;
        }
    }

    void setSize(int i) {
        this.size=i;
    }
    void shift_lift(){
        if(size==a.length){
          //if i dont wanna to delete the firt elemnt
           //and wanna put as the last elemnt i should do this
            // copy(this.size);
            //a[size]=a[0];
            for(int i=0;i<size;i++){
                a[i]=a[i+1];
            }
            size--;//if i wanna do the above note i  dont have to increse the size by 1 
        }
        if(size<a.length){
            a[size]=a[0];
            for(int i=0;i<size;i++){
                a[i]=a[i+1];
            }
            size--;
        }
    }

    void deldetfirst() {
        shift_lift();
    }
    
 void deletebyindex(int index) {
       if(index<size){
        for(int j=index;j<size-1;j++){
            a[j]=a[j+1];
        }
        size--;
        }
        
    }
 public void shiftright(int index){
//    size++;
     for(int i=size;i>index;i--){
         a[i]=a[i-1];
     }
 }
 public void clear(){
     size=0;
 }
 public int indexof(int value){
     boolean b=true;
     int m=0;
     for(int i=0;i<size;i++){
         if(a[i]==value){
             m=i;
             b=false;
             break;
         }
         }
     if(b){
         return -1;
     }
     return m;
 }
    public int get(int index){
        return a[index];
        
    }
    public void set(int index,int value){
        a[index]=value;
    }
    public boolean remove(int value){
        boolean b= false;
        for(int i=0;i<size;i++){
            if(a[i]==value){
            this.deletebyindex(i);
            b=true;
            break;
            }
        }
        return b;
    }

    void addall(arraylist list) {
        if(this.a.length<list.getSize()+this.getSize()){
            copy(this.size);
        }
       for (int i =this.size,j=0; i<list.getSize()+this.getSize(); i++,j++) {
         this.a[i]=list.a[j];
           
        }
      
      this.setSize((list.getSize()+this.getSize()));
     
    }
    
    public void doubleeven(){
     int m=0;
     
       for(int i=0;i<size;i++){
            if(a[i]%2==0){
                if(this.size==this.a.length){
                    this.copybyone(this.size);
                }
                this.shiftright(i);
            m++;
              i++;
              size++;
            }
        }

    }
    public  void tirmlength(){
      int aa[]=new int[size];
      if(a.length>size){
       for(int i=0;i<size;i++){
         aa[i]=a[i];    
         }
      }
    a=aa;
  }
    void copybyone(int size){
      int anew[]=new int[size+1];
            for(int j=0;j<a.length;j++){
                anew[j]=a[j];
  }
            a=anew;
           
  }

    void deleteprime() {
        for(int i=0;i<size;i++){
            if(prime(a[i])){
                this.deletebyindex(i);
                i--;
            }
        }
    }

    public boolean prime(int n) {
        if(n==1){
            return true;
        }
        int m=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                m++;
            }
        }
        if(m==2){
            return true;
        }
        return false;
    }
 
}
