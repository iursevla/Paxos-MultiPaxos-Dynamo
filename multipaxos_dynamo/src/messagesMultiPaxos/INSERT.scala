package messagesMultiPaxos

//Used to send INSERT message from client to server
case class INSERT(k:String, elem:String) extends Super

