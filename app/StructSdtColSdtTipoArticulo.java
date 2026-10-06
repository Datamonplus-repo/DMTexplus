package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtTipoArticulo", namespace ="TexplusNET")
public final  class StructSdtColSdtTipoArticulo implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtTipoArticulo( )
   {
      this( -1, new ModelContext( StructSdtColSdtTipoArticulo.class ));
   }

   public StructSdtColSdtTipoArticulo( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtColSdtTipoArticulo( java.util.Vector<StructSdtSdtTipoArticulo> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtTipoArticulo",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtTipoArticulo> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtTipoArticulo> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtTipoArticulo> item = new java.util.Vector<>();
}

