package app.controlcalidadhtd ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ControlesdeCalidad_SDT", namespace ="TexplusNET")
public final  class StructSdtControlesdeCalidad_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtControlesdeCalidad_SDT( )
   {
      this( -1, new ModelContext( StructSdtControlesdeCalidad_SDT.class ));
   }

   public StructSdtControlesdeCalidad_SDT( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtControlesdeCalidad_SDT( java.util.Vector<StructSdtControlesdeCalidad_SDT_Item> value )
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
   public java.util.Vector<StructSdtControlesdeCalidad_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtControlesdeCalidad_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtControlesdeCalidad_SDT_Item> item = new java.util.Vector<>();
}

