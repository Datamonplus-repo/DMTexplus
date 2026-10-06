package app.ficherosbasicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "wCopiaSerieClienteSDT", namespace ="TexplusNET")
public final  class StructSdtwCopiaSerieClienteSDT implements Cloneable, java.io.Serializable
{
   public StructSdtwCopiaSerieClienteSDT( )
   {
      this( -1, new ModelContext( StructSdtwCopiaSerieClienteSDT.class ));
   }

   public StructSdtwCopiaSerieClienteSDT( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtwCopiaSerieClienteSDT( java.util.Vector<StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="wCopiaSerieClienteSDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem> item = new java.util.Vector<>();
}

