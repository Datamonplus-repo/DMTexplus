package app.formulaciontinte ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColEliminaciondeFormulasTinte_SDT", namespace ="TexplusNET")
public final  class StructSdtColEliminaciondeFormulasTinte_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColEliminaciondeFormulasTinte_SDT( )
   {
      this( -1, new ModelContext( StructSdtColEliminaciondeFormulasTinte_SDT.class ));
   }

   public StructSdtColEliminaciondeFormulasTinte_SDT( int remoteHandle ,
                                                      ModelContext context )
   {
   }

   public  StructSdtColEliminaciondeFormulasTinte_SDT( java.util.Vector<StructSdtEliminaciondeFormulasTinte_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="EliminaciondeFormulasTinte_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtEliminaciondeFormulasTinte_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtEliminaciondeFormulasTinte_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtEliminaciondeFormulasTinte_SDT> item = new java.util.Vector<>();
}

