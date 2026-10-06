package app.anticipacionerrores ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtParametros", namespace ="TexplusNET")
public final  class StructSdtColsdtParametros implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtParametros( )
   {
      this( -1, new ModelContext( StructSdtColsdtParametros.class ));
   }

   public StructSdtColsdtParametros( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtColsdtParametros( java.util.Vector<StructSdtsdtParametros> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtParametros",namespace="TexplusNET")
   public java.util.Vector<StructSdtsdtParametros> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtParametros> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtParametros> item = new java.util.Vector<>();
}

