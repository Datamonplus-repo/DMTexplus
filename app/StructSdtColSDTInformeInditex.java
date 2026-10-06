package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeInditex", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeInditex implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeInditex( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeInditex.class ));
   }

   public StructSdtColSDTInformeInditex( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColSDTInformeInditex( java.util.Vector<StructSdtSDTInformeInditex> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeInditex",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeInditex> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeInditex> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeInditex> item = new java.util.Vector<>();
}

