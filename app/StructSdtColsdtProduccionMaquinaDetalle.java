package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtProduccionMaquinaDetalle", namespace ="TexplusNET")
public final  class StructSdtColsdtProduccionMaquinaDetalle implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtProduccionMaquinaDetalle( )
   {
      this( -1, new ModelContext( StructSdtColsdtProduccionMaquinaDetalle.class ));
   }

   public StructSdtColsdtProduccionMaquinaDetalle( int remoteHandle ,
                                                   ModelContext context )
   {
   }

   public  StructSdtColsdtProduccionMaquinaDetalle( java.util.Vector<StructSdtsdtProduccionMaquinaDetalle> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtProduccionMaquinaDetalle",namespace="TexplusNET")
   public java.util.Vector<StructSdtsdtProduccionMaquinaDetalle> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtProduccionMaquinaDetalle> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtProduccionMaquinaDetalle> item = new java.util.Vector<>();
}

