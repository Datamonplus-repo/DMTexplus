package app.pedidosclientesindetalle ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "RMOD008_SDT", namespace ="TexplusNET")
public final  class StructSdtRMOD008_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtRMOD008_SDT( )
   {
      this( -1, new ModelContext( StructSdtRMOD008_SDT.class ));
   }

   public StructSdtRMOD008_SDT( int remoteHandle ,
                                ModelContext context )
   {
   }

   public  StructSdtRMOD008_SDT( java.util.Vector<StructSdtRMOD008_SDT_Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtRMOD008_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRMOD008_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRMOD008_SDT_Item> item = new java.util.Vector<>();
}

