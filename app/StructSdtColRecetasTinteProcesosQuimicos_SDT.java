package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColRecetasTinteProcesosQuimicos_SDT", namespace ="TexplusNET")
public final  class StructSdtColRecetasTinteProcesosQuimicos_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColRecetasTinteProcesosQuimicos_SDT( )
   {
      this( -1, new ModelContext( StructSdtColRecetasTinteProcesosQuimicos_SDT.class ));
   }

   public StructSdtColRecetasTinteProcesosQuimicos_SDT( int remoteHandle ,
                                                        ModelContext context )
   {
   }

   public  StructSdtColRecetasTinteProcesosQuimicos_SDT( java.util.Vector<StructSdtRecetasTinteProcesosQuimicos_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="RecetasTinteProcesosQuimicos_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtRecetasTinteProcesosQuimicos_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRecetasTinteProcesosQuimicos_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRecetasTinteProcesosQuimicos_SDT> item = new java.util.Vector<>();
}

