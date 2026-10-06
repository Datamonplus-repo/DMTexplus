package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "CONPRO", namespace ="")
public final  class StructSdtSDTCONPRO implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCONPRO( )
   {
      this( -1, new ModelContext( StructSdtSDTCONPRO.class ));
   }

   public StructSdtSDTCONPRO( int remoteHandle ,
                              ModelContext context )
   {
   }

   public  StructSdtSDTCONPRO( java.util.Vector<StructSdtSDTCONPRO_Registro> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Registro",namespace="")
   public java.util.Vector<StructSdtSDTCONPRO_Registro> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCONPRO_Registro> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCONPRO_Registro> item = new java.util.Vector<>();
}

