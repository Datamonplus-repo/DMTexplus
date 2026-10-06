package app.balance ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColBalanceWeightMessage", namespace ="TexplusNET")
public final  class StructSdtColBalanceWeightMessage implements Cloneable, java.io.Serializable
{
   public StructSdtColBalanceWeightMessage( )
   {
      this( -1, new ModelContext( StructSdtColBalanceWeightMessage.class ));
   }

   public StructSdtColBalanceWeightMessage( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtColBalanceWeightMessage( java.util.Vector<StructSdtBalanceWeightMessage> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="BalanceWeightMessage",namespace="TexplusNET")
   public java.util.Vector<StructSdtBalanceWeightMessage> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtBalanceWeightMessage> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtBalanceWeightMessage> item = new java.util.Vector<>();
}

