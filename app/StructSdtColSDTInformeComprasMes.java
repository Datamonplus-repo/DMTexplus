package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeComprasMes", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeComprasMes implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeComprasMes( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeComprasMes.class ));
   }

   public StructSdtColSDTInformeComprasMes( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtColSDTInformeComprasMes( java.util.Vector<StructSdtSDTInformeComprasMes> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeComprasMes",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeComprasMes> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeComprasMes> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeComprasMes> item = new java.util.Vector<>();
}

