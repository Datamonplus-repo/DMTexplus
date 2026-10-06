package app.trabajosexternos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColFilterTrabajoExterno_Header_TRNWW", namespace ="TexplusNET")
public final  class StructSdtColFilterTrabajoExterno_Header_TRNWW implements Cloneable, java.io.Serializable
{
   public StructSdtColFilterTrabajoExterno_Header_TRNWW( )
   {
      this( -1, new ModelContext( StructSdtColFilterTrabajoExterno_Header_TRNWW.class ));
   }

   public StructSdtColFilterTrabajoExterno_Header_TRNWW( int remoteHandle ,
                                                         ModelContext context )
   {
   }

   public  StructSdtColFilterTrabajoExterno_Header_TRNWW( java.util.Vector<StructSdtFilterTrabajoExterno_Header_TRNWW> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="FilterTrabajoExterno_Header_TRNWW",namespace="TexplusNET")
   public java.util.Vector<StructSdtFilterTrabajoExterno_Header_TRNWW> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFilterTrabajoExterno_Header_TRNWW> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFilterTrabajoExterno_Header_TRNWW> item = new java.util.Vector<>();
}

