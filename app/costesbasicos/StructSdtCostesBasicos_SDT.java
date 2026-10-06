package app.costesbasicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "CostesBasicos_SDT", namespace ="TexplusNET")
public final  class StructSdtCostesBasicos_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtCostesBasicos_SDT( )
   {
      this( -1, new ModelContext( StructSdtCostesBasicos_SDT.class ));
   }

   public StructSdtCostesBasicos_SDT( int remoteHandle ,
                                      ModelContext context )
   {
   }

   public  StructSdtCostesBasicos_SDT( java.util.Vector<StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="CostesBasicos_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem> item = new java.util.Vector<>();
}

