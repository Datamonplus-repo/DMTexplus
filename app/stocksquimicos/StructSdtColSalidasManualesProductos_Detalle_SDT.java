package app.stocksquimicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSalidasManualesProductos_Detalle_SDT", namespace ="TexplusNET")
public final  class StructSdtColSalidasManualesProductos_Detalle_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColSalidasManualesProductos_Detalle_SDT( )
   {
      this( -1, new ModelContext( StructSdtColSalidasManualesProductos_Detalle_SDT.class ));
   }

   public StructSdtColSalidasManualesProductos_Detalle_SDT( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColSalidasManualesProductos_Detalle_SDT( java.util.Vector<StructSdtSalidasManualesProductos_Detalle_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SalidasManualesProductos_Detalle_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtSalidasManualesProductos_Detalle_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSalidasManualesProductos_Detalle_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSalidasManualesProductos_Detalle_SDT> item = new java.util.Vector<>();
}

