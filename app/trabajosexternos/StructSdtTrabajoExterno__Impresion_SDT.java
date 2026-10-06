package app.trabajosexternos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "TrabajoExterno__Impresion_SDT", namespace ="TexplusNET")
public final  class StructSdtTrabajoExterno__Impresion_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtTrabajoExterno__Impresion_SDT( )
   {
      this( -1, new ModelContext( StructSdtTrabajoExterno__Impresion_SDT.class ));
   }

   public StructSdtTrabajoExterno__Impresion_SDT( int remoteHandle ,
                                                  ModelContext context )
   {
   }

   public  StructSdtTrabajoExterno__Impresion_SDT( java.util.Vector<StructSdtTrabajoExterno__Impresion_SDT_Item> value )
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
   public java.util.Vector<StructSdtTrabajoExterno__Impresion_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTrabajoExterno__Impresion_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTrabajoExterno__Impresion_SDT_Item> item = new java.util.Vector<>();
}

