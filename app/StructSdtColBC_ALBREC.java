package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColBC_ALBREC", namespace ="TexplusNET")
public final  class StructSdtColBC_ALBREC implements Cloneable, java.io.Serializable
{
   public StructSdtColBC_ALBREC( )
   {
      this( -1, new ModelContext( StructSdtColBC_ALBREC.class ));
   }

   public StructSdtColBC_ALBREC( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtColBC_ALBREC( java.util.Vector<StructSdtBC_ALBREC> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="BC_ALBREC",namespace="TexplusNET")
   public java.util.Vector<StructSdtBC_ALBREC> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtBC_ALBREC> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtBC_ALBREC> item = new java.util.Vector<>();
}

