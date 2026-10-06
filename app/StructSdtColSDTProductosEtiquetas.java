package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTProductosEtiquetas", namespace ="TexplusNET")
public final  class StructSdtColSDTProductosEtiquetas implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTProductosEtiquetas( )
   {
      this( -1, new ModelContext( StructSdtColSDTProductosEtiquetas.class ));
   }

   public StructSdtColSDTProductosEtiquetas( int remoteHandle ,
                                             ModelContext context )
   {
   }

   public  StructSdtColSDTProductosEtiquetas( java.util.Vector<StructSdtSDTProductosEtiquetas> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTProductosEtiquetas",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTProductosEtiquetas> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTProductosEtiquetas> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTProductosEtiquetas> item = new java.util.Vector<>();
}

