package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTProduccionMaquinasFases.FasesItem", namespace ="TexplusNET")
public final  class StructSdtColSDTProduccionMaquinasFases_FasesItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTProduccionMaquinasFases_FasesItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTProduccionMaquinasFases_FasesItem.class ));
   }

   public StructSdtColSDTProduccionMaquinasFases_FasesItem( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColSDTProduccionMaquinasFases_FasesItem( java.util.Vector<StructSdtSDTProduccionMaquinasFases_FasesItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTProduccionMaquinasFases.FasesItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTProduccionMaquinasFases_FasesItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTProduccionMaquinasFases_FasesItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTProduccionMaquinasFases_FasesItem> item = new java.util.Vector<>();
}

