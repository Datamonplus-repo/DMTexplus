package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTTERPES", namespace ="TexplusNET")
public final  class StructSdtColTTERPES implements Cloneable, java.io.Serializable
{
   public StructSdtColTTERPES( )
   {
      this( -1, new ModelContext( StructSdtColTTERPES.class ));
   }

   public StructSdtColTTERPES( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColTTERPES( java.util.Vector<StructSdtTTERPES> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TTERPES",namespace="TexplusNET")
   public java.util.Vector<StructSdtTTERPES> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTTERPES> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTTERPES> item = new java.util.Vector<>();
}

