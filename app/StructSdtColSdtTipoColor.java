package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtTipoColor", namespace ="TexplusNET")
public final  class StructSdtColSdtTipoColor implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtTipoColor( )
   {
      this( -1, new ModelContext( StructSdtColSdtTipoColor.class ));
   }

   public StructSdtColSdtTipoColor( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColSdtTipoColor( java.util.Vector<StructSdtSdtTipoColor> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtTipoColor",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtTipoColor> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtTipoColor> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtTipoColor> item = new java.util.Vector<>();
}

