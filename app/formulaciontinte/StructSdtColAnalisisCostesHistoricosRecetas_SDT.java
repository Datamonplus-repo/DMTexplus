package app.formulaciontinte ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColAnalisisCostesHistoricosRecetas_SDT", namespace ="TexplusNET")
public final  class StructSdtColAnalisisCostesHistoricosRecetas_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColAnalisisCostesHistoricosRecetas_SDT( )
   {
      this( -1, new ModelContext( StructSdtColAnalisisCostesHistoricosRecetas_SDT.class ));
   }

   public StructSdtColAnalisisCostesHistoricosRecetas_SDT( int remoteHandle ,
                                                           ModelContext context )
   {
   }

   public  StructSdtColAnalisisCostesHistoricosRecetas_SDT( java.util.Vector<StructSdtAnalisisCostesHistoricosRecetas_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="AnalisisCostesHistoricosRecetas_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtAnalisisCostesHistoricosRecetas_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtAnalisisCostesHistoricosRecetas_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtAnalisisCostesHistoricosRecetas_SDT> item = new java.util.Vector<>();
}

