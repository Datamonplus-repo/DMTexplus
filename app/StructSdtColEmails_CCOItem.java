package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColEmails.CCOItem", namespace ="TexplusNET")
public final  class StructSdtColEmails_CCOItem implements Cloneable, java.io.Serializable
{
   public StructSdtColEmails_CCOItem( )
   {
      this( -1, new ModelContext( StructSdtColEmails_CCOItem.class ));
   }

   public StructSdtColEmails_CCOItem( int remoteHandle ,
                                      ModelContext context )
   {
   }

   public  StructSdtColEmails_CCOItem( java.util.Vector<StructSdtEmails_CCOItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Emails.CCOItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtEmails_CCOItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtEmails_CCOItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtEmails_CCOItem> item = new java.util.Vector<>();
}

