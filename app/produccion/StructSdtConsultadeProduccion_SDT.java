package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ConsultadeProduccion_SDT", namespace ="TexplusNET")
public final  class StructSdtConsultadeProduccion_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtConsultadeProduccion_SDT( )
   {
      this( -1, new ModelContext( StructSdtConsultadeProduccion_SDT.class ));
   }

   public StructSdtConsultadeProduccion_SDT( int remoteHandle ,
                                             ModelContext context )
   {
   }

   public  StructSdtConsultadeProduccion_SDT( java.util.Vector<StructSdtConsultadeProduccion_SDT_Item> value )
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
   public java.util.Vector<StructSdtConsultadeProduccion_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtConsultadeProduccion_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtConsultadeProduccion_SDT_Item> item = new java.util.Vector<>();
}

