package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColEmails", namespace ="TexplusNET")
public final  class StructSdtColEmails implements Cloneable, java.io.Serializable
{
   public StructSdtColEmails( )
   {
      this( -1, new ModelContext( StructSdtColEmails.class ));
   }

   public StructSdtColEmails( int remoteHandle ,
                              ModelContext context )
   {
   }

   public  StructSdtColEmails( java.util.Vector<StructSdtEmails> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Emails",namespace="TexplusNET")
   public java.util.Vector<StructSdtEmails> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtEmails> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtEmails> item = new java.util.Vector<>();
}

