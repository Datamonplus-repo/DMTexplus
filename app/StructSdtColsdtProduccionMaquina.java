package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtProduccionMaquina", namespace ="TexplusNET")
public final  class StructSdtColsdtProduccionMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtProduccionMaquina( )
   {
      this( -1, new ModelContext( StructSdtColsdtProduccionMaquina.class ));
   }

   public StructSdtColsdtProduccionMaquina( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtColsdtProduccionMaquina( java.util.Vector<StructSdtsdtProduccionMaquina> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtProduccionMaquina",namespace="TexplusNET")
   public java.util.Vector<StructSdtsdtProduccionMaquina> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtProduccionMaquina> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtProduccionMaquina> item = new java.util.Vector<>();
}

