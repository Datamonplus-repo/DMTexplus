package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeAlmacenenCrudoDistribucion", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeAlmacenenCrudoDistribucion implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeAlmacenenCrudoDistribucion( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeAlmacenenCrudoDistribucion.class ));
   }

   public StructSdtColSDTInformeAlmacenenCrudoDistribucion( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColSDTInformeAlmacenenCrudoDistribucion( java.util.Vector<StructSdtSDTInformeAlmacenenCrudoDistribucion> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeAlmacenenCrudoDistribucion",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeAlmacenenCrudoDistribucion> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeAlmacenenCrudoDistribucion> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeAlmacenenCrudoDistribucion> item = new java.util.Vector<>();
}

