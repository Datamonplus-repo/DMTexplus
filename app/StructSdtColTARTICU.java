package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTARTICU", namespace ="TexplusNET")
public final  class StructSdtColTARTICU implements Cloneable, java.io.Serializable
{
   public StructSdtColTARTICU( )
   {
      this( -1, new ModelContext( StructSdtColTARTICU.class ));
   }

   public StructSdtColTARTICU( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColTARTICU( java.util.Vector<StructSdtTARTICU> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TARTICU",namespace="TexplusNET")
   public java.util.Vector<StructSdtTARTICU> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTARTICU> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTARTICU> item = new java.util.Vector<>();
}

