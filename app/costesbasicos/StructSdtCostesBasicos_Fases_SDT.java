package app.costesbasicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "CostesBasicos_Fases_SDT", namespace ="TexplusNET")
public final  class StructSdtCostesBasicos_Fases_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtCostesBasicos_Fases_SDT( )
   {
      this( -1, new ModelContext( StructSdtCostesBasicos_Fases_SDT.class ));
   }

   public StructSdtCostesBasicos_Fases_SDT( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtCostesBasicos_Fases_SDT( java.util.Vector<StructSdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="CostesBasicos_Fases_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem> item = new java.util.Vector<>();
}

