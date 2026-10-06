package app.stocksquimicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColEntradadeProductosAlmacen_TRN", namespace ="TexplusNET")
public final  class StructSdtColEntradadeProductosAlmacen_TRN implements Cloneable, java.io.Serializable
{
   public StructSdtColEntradadeProductosAlmacen_TRN( )
   {
      this( -1, new ModelContext( StructSdtColEntradadeProductosAlmacen_TRN.class ));
   }

   public StructSdtColEntradadeProductosAlmacen_TRN( int remoteHandle ,
                                                     ModelContext context )
   {
   }

   public  StructSdtColEntradadeProductosAlmacen_TRN( java.util.Vector<StructSdtEntradadeProductosAlmacen_TRN> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="EntradadeProductosAlmacen_TRN",namespace="TexplusNET")
   public java.util.Vector<StructSdtEntradadeProductosAlmacen_TRN> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtEntradadeProductosAlmacen_TRN> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtEntradadeProductosAlmacen_TRN> item = new java.util.Vector<>();
}

