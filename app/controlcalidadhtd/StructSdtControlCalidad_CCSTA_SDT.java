package app.controlcalidadhtd ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ControlCalidad_CCSTA_SDT", namespace ="TexplusNET")
public final  class StructSdtControlCalidad_CCSTA_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtControlCalidad_CCSTA_SDT( )
   {
      this( -1, new ModelContext( StructSdtControlCalidad_CCSTA_SDT.class ));
   }

   public StructSdtControlCalidad_CCSTA_SDT( int remoteHandle ,
                                             ModelContext context )
   {
   }

   public  StructSdtControlCalidad_CCSTA_SDT( java.util.Vector<StructSdtControlCalidad_CCSTA_SDT_Item> value )
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
   public java.util.Vector<StructSdtControlCalidad_CCSTA_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtControlCalidad_CCSTA_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtControlCalidad_CCSTA_SDT_Item> item = new java.util.Vector<>();
}

