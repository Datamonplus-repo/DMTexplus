package app.almacensindetalle ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColFilterDevolucionTejido_1", namespace ="TexplusNET")
public final  class StructSdtColFilterDevolucionTejido_1 implements Cloneable, java.io.Serializable
{
   public StructSdtColFilterDevolucionTejido_1( )
   {
      this( -1, new ModelContext( StructSdtColFilterDevolucionTejido_1.class ));
   }

   public StructSdtColFilterDevolucionTejido_1( int remoteHandle ,
                                                ModelContext context )
   {
   }

   public  StructSdtColFilterDevolucionTejido_1( java.util.Vector<StructSdtFilterDevolucionTejido_1> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="FilterDevolucionTejido_1",namespace="TexplusNET")
   public java.util.Vector<StructSdtFilterDevolucionTejido_1> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFilterDevolucionTejido_1> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFilterDevolucionTejido_1> item = new java.util.Vector<>();
}

