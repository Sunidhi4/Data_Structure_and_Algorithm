class ListNode
{
    int key;
    int val;
    ListNode next;
    ListNode prev;
 
    ListNode( int key, int val)
    {
         this.key= key;
         this.val= val;
         this.next=null;
         this.prev=null;
    }
}
class LRUCache 
{
    HashMap<Integer, ListNode>mp= new HashMap<>();
    int capacity;
    ListNode head= new ListNode(-1,-1);
    ListNode tail= new ListNode(-1,-1);
 
 
    public LRUCache(int capacity) 
    {
        this.capacity = capacity;
        head.next = tail;
        tail.prev= head;
    }
     void deleteNode( ListNode node)
    {
          ListNode p = node.prev;
          ListNode n = node.next;
 
          p.next = n;
          n.prev = p;
    }
     void addFront( ListNode node)
    {
         ListNode ne = head.next;
 
         head.next= node;
         node.prev= head;
 
         node.next = ne;
         ne.prev= node;
    }
    public int get(int key) 
    {
         if( mp.containsKey( key )== true)
         {
            ListNode node = mp.get(key);
 
            deleteNode(node);
            addFront( node);
 
           return node.val;
         }
        else
        {
             return -1;
        }
    }
 
    public void put(int key, int value) 
    {
         if( mp.containsKey( key )== true)
         {
              ListNode node= mp.get(key);
              node.val = value;
 
              deleteNode( node );
              addFront( node );
             return;
         }
 
        ListNode newNode = new ListNode(key, value);
 
        if( mp.size()==capacity)
        {
             ListNode node= tail.prev;
 
              mp.remove( tail.prev.key);
             deleteNode( node);
        }
 
        mp.put( key, newNode);
        addFront( newNode);
    }
}