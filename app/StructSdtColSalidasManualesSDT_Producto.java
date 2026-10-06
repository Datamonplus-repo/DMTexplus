package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSalidasManualesSDT.Producto", namespace ="TexplusNET")
public final  class StructSdtColSalidasManualesSDT_Producto implements Cloneable, java.io.Serializable
{
   public StructSdtColSalidasManualesSDT_Producto( )
   {
      this( -1, new ModelContext( StructSdtColSalidasManualesSDT_Producto.class ));
   }

   public StructSdtColSalidasManualesSDT_Producto( int remoteHandle ,
                                                   ModelContext context )
   {
   }

   public  StructSdtColSalidasManualesSDT_Producto( java.util.Vector<StructSdtSalidasManualesSDT_Producto> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SalidasManualesSDT.Producto",namespace="TexplusNET")
   public java.util.Vector<StructSdtSalidasManualesSDT_Producto> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSalidasManualesSDT_Producto> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSalidasManualesSDT_Producto> item = new java.util.Vector<>();
}

