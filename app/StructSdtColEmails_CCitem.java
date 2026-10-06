package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColEmails.CCitem", namespace ="TexplusNET")
public final  class StructSdtColEmails_CCitem implements Cloneable, java.io.Serializable
{
   public StructSdtColEmails_CCitem( )
   {
      this( -1, new ModelContext( StructSdtColEmails_CCitem.class ));
   }

   public StructSdtColEmails_CCitem( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtColEmails_CCitem( java.util.Vector<StructSdtEmails_CCitem> value )
   {
      item = value;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   @jakarta.xml.bind.annotation.XmlElement(name="Emails.CCitem",namespace="TexplusNET")
   public java.util.Vector<StructSdtEmails_CCitem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtEmails_CCitem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtEmails_CCitem> item = new java.util.Vector<>();
}

