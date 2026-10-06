package app.pedidos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColDisObs_SDT", namespace ="TexplusNET")
public final  class StructSdtColDisObs_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColDisObs_SDT( )
   {
      this( -1, new ModelContext( StructSdtColDisObs_SDT.class ));
   }

   public StructSdtColDisObs_SDT( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColDisObs_SDT( java.util.Vector<StructSdtDisObs_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="DisObs_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtDisObs_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDisObs_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDisObs_SDT> item = new java.util.Vector<>();
}

