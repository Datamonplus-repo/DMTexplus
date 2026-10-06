package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColControlProductossinMovimientos_SDT", namespace ="TexplusNET")
public final  class StructSdtColControlProductossinMovimientos_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColControlProductossinMovimientos_SDT( )
   {
      this( -1, new ModelContext( StructSdtColControlProductossinMovimientos_SDT.class ));
   }

   public StructSdtColControlProductossinMovimientos_SDT( int remoteHandle ,
                                                          ModelContext context )
   {
   }

   public  StructSdtColControlProductossinMovimientos_SDT( java.util.Vector<StructSdtControlProductossinMovimientos_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ControlProductossinMovimientos_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtControlProductossinMovimientos_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtControlProductossinMovimientos_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtControlProductossinMovimientos_SDT> item = new java.util.Vector<>();
}

