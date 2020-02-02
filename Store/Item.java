class Item implements Comparable<Item> {
 
        private int myId;
        private int myInv;
 
 
        public Item(int id, int inv){
                myId = id;
                myInv = inv;
        }
       
        public int getId(){
                return myId;
        }
       
        public int getInv(){
                return myInv;
        }
               
        public int compareTo(Item other){
                if (this.getId() == other.getId()) {
                        return 0;
                }
                else {
                        return this.getId()-other.getId();
                }
        }
 
        public boolean equals(Item other){
                if (this.compareTo(other) == 0) {
                        return true;
                }
                else {
                        return false;
                }
        }
 
 
        public String toString(){
                return ("\t" + this.getId() + "\t" + this.getInv());
        }
}      
 
