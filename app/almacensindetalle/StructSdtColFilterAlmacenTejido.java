package app.almacensindetalle ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColFilterAlmacenTejido", namespace ="TexplusNET")
public final  class StructSdtColFilterAlmacenTejido implements Cloneable, java.io.Serializable
{
   public StructSdtColFilterAlmacenTejido( )
   {
      this( -1, new ModelContext( StructSdtColFilterAlmacenTejido.class ));
   }

   public StructSdtColFilterAlmacenTejido( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColFilterAlmacenTejido( java.util.Vector<StructSdtFilterAlmacenTejido> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="FilterAlmacenTejido",namespace="TexplusNET")
   public java.util.Vector<StructSdtFilterAlmacenTejido> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFilterAlmacenTejido> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFilterAlmacenTejido> item = new java.util.Vector<>();
}

