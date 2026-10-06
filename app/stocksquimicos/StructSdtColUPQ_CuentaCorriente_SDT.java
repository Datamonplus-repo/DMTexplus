package app.stocksquimicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColUPQ_CuentaCorriente_SDT", namespace ="TexplusNET")
public final  class StructSdtColUPQ_CuentaCorriente_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColUPQ_CuentaCorriente_SDT( )
   {
      this( -1, new ModelContext( StructSdtColUPQ_CuentaCorriente_SDT.class ));
   }

   public StructSdtColUPQ_CuentaCorriente_SDT( int remoteHandle ,
                                               ModelContext context )
   {
   }

   public  StructSdtColUPQ_CuentaCorriente_SDT( java.util.Vector<StructSdtUPQ_CuentaCorriente_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="UPQ_CuentaCorriente_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtUPQ_CuentaCorriente_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtUPQ_CuentaCorriente_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtUPQ_CuentaCorriente_SDT> item = new java.util.Vector<>();
}

