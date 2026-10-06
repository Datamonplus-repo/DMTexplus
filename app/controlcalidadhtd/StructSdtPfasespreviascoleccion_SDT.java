package app.controlcalidadhtd ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Pfasespreviascoleccion_SDT", namespace ="TexplusNET")
public final  class StructSdtPfasespreviascoleccion_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtPfasespreviascoleccion_SDT( )
   {
      this( -1, new ModelContext( StructSdtPfasespreviascoleccion_SDT.class ));
   }

   public StructSdtPfasespreviascoleccion_SDT( int remoteHandle ,
                                               ModelContext context )
   {
   }

   public  StructSdtPfasespreviascoleccion_SDT( java.util.Vector<StructSdtPfasespreviascoleccion_SDT_Item> value )
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
   public java.util.Vector<StructSdtPfasespreviascoleccion_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPfasespreviascoleccion_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPfasespreviascoleccion_SDT_Item> item = new java.util.Vector<>();
}

