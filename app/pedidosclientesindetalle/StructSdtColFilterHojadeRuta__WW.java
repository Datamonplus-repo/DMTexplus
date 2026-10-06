package app.pedidosclientesindetalle ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColFilterHojadeRuta__WW", namespace ="TexplusNET")
public final  class StructSdtColFilterHojadeRuta__WW implements Cloneable, java.io.Serializable
{
   public StructSdtColFilterHojadeRuta__WW( )
   {
      this( -1, new ModelContext( StructSdtColFilterHojadeRuta__WW.class ));
   }

   public StructSdtColFilterHojadeRuta__WW( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtColFilterHojadeRuta__WW( java.util.Vector<StructSdtFilterHojadeRuta__WW> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="FilterHojadeRuta__WW",namespace="TexplusNET")
   public java.util.Vector<StructSdtFilterHojadeRuta__WW> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFilterHojadeRuta__WW> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFilterHojadeRuta__WW> item = new java.util.Vector<>();
}

