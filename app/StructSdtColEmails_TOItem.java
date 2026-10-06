package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColEmails.TOItem", namespace ="TexplusNET")
public final  class StructSdtColEmails_TOItem implements Cloneable, java.io.Serializable
{
   public StructSdtColEmails_TOItem( )
   {
      this( -1, new ModelContext( StructSdtColEmails_TOItem.class ));
   }

   public StructSdtColEmails_TOItem( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtColEmails_TOItem( java.util.Vector<StructSdtEmails_TOItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Emails.TOItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtEmails_TOItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtEmails_TOItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtEmails_TOItem> item = new java.util.Vector<>();
}

