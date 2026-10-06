package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeProduccionResumenFase.FaseItem", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeProduccionResumenFase_FaseItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeProduccionResumenFase_FaseItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeProduccionResumenFase_FaseItem.class ));
   }

   public StructSdtColSDTInformeProduccionResumenFase_FaseItem( int remoteHandle ,
                                                                ModelContext context )
   {
   }

   public  StructSdtColSDTInformeProduccionResumenFase_FaseItem( java.util.Vector<StructSdtSDTInformeProduccionResumenFase_FaseItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeProduccionResumenFase.FaseItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeProduccionResumenFase_FaseItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeProduccionResumenFase_FaseItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeProduccionResumenFase_FaseItem> item = new java.util.Vector<>();
}

