package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTResumenTipoArticulo", namespace ="TexplusNET")
public final  class StructSdtColSDTResumenTipoArticulo implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTResumenTipoArticulo( )
   {
      this( -1, new ModelContext( StructSdtColSDTResumenTipoArticulo.class ));
   }

   public StructSdtColSDTResumenTipoArticulo( int remoteHandle ,
                                              ModelContext context )
   {
   }

   public  StructSdtColSDTResumenTipoArticulo( java.util.Vector<StructSdtSDTResumenTipoArticulo> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTResumenTipoArticulo",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTResumenTipoArticulo> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTResumenTipoArticulo> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTResumenTipoArticulo> item = new java.util.Vector<>();
}

