package app.pedidos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColDisPar_SDT", namespace ="TexplusNET")
public final  class StructSdtColDisPar_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColDisPar_SDT( )
   {
      this( -1, new ModelContext( StructSdtColDisPar_SDT.class ));
   }

   public StructSdtColDisPar_SDT( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColDisPar_SDT( java.util.Vector<StructSdtDisPar_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="DisPar_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtDisPar_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDisPar_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDisPar_SDT> item = new java.util.Vector<>();
}

