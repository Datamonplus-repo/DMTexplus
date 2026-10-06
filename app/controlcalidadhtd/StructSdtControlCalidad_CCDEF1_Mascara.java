package app.controlcalidadhtd ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ControlCalidad_CCDEF1_Mascara", namespace ="TexplusNET")
public final  class StructSdtControlCalidad_CCDEF1_Mascara implements Cloneable, java.io.Serializable
{
   public StructSdtControlCalidad_CCDEF1_Mascara( )
   {
      this( -1, new ModelContext( StructSdtControlCalidad_CCDEF1_Mascara.class ));
   }

   public StructSdtControlCalidad_CCDEF1_Mascara( int remoteHandle ,
                                                  ModelContext context )
   {
   }

   public  StructSdtControlCalidad_CCDEF1_Mascara( java.util.Vector<StructSdtControlCalidad_CCDEF1_Mascara_Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtControlCalidad_CCDEF1_Mascara_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtControlCalidad_CCDEF1_Mascara_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtControlCalidad_CCDEF1_Mascara_Item> item = new java.util.Vector<>();
}

