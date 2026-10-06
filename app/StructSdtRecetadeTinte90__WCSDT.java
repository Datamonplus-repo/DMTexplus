package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "RecetadeTinte90__WCSDT", namespace ="TexplusNET")
public final  class StructSdtRecetadeTinte90__WCSDT implements Cloneable, java.io.Serializable
{
   public StructSdtRecetadeTinte90__WCSDT( )
   {
      this( -1, new ModelContext( StructSdtRecetadeTinte90__WCSDT.class ));
   }

   public StructSdtRecetadeTinte90__WCSDT( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtRecetadeTinte90__WCSDT( java.util.Vector<StructSdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="RecetadeTinte90__WCSDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem> item = new java.util.Vector<>();
}

