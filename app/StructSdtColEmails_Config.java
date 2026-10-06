package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColEmails.Config", namespace ="TexplusNET")
public final  class StructSdtColEmails_Config implements Cloneable, java.io.Serializable
{
   public StructSdtColEmails_Config( )
   {
      this( -1, new ModelContext( StructSdtColEmails_Config.class ));
   }

   public StructSdtColEmails_Config( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtColEmails_Config( java.util.Vector<StructSdtEmails_Config> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Emails.Config",namespace="TexplusNET")
   public java.util.Vector<StructSdtEmails_Config> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtEmails_Config> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtEmails_Config> item = new java.util.Vector<>();
}

