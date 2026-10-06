package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "In_TimerLine_SDT", namespace ="TexplusNET")
public final  class StructSdtIn_TimerLine_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtIn_TimerLine_SDT( )
   {
      this( -1, new ModelContext( StructSdtIn_TimerLine_SDT.class ));
   }

   public StructSdtIn_TimerLine_SDT( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtIn_TimerLine_SDT( java.util.Vector<StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="In_TimerLine_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem> item = new java.util.Vector<>();
}

