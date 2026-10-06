package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColEmails.AttachedItem", namespace ="TexplusNET")
public final  class StructSdtColEmails_AttachedItem implements Cloneable, java.io.Serializable
{
   public StructSdtColEmails_AttachedItem( )
   {
      this( -1, new ModelContext( StructSdtColEmails_AttachedItem.class ));
   }

   public StructSdtColEmails_AttachedItem( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColEmails_AttachedItem( java.util.Vector<StructSdtEmails_AttachedItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Emails.AttachedItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtEmails_AttachedItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtEmails_AttachedItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtEmails_AttachedItem> item = new java.util.Vector<>();
}

