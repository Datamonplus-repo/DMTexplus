package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDT_TRATAMIENTO_RECETAS", namespace ="TexplusNET")
public final  class StructSdtSDT_TRATAMIENTO_RECETAS implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_TRATAMIENTO_RECETAS( )
   {
      this( -1, new ModelContext( StructSdtSDT_TRATAMIENTO_RECETAS.class ));
   }

   public StructSdtSDT_TRATAMIENTO_RECETAS( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtSDT_TRATAMIENTO_RECETAS( java.util.Vector<StructSdtSDT_TRATAMIENTO_RECETAS_Receta> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Receta",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDT_TRATAMIENTO_RECETAS_Receta> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDT_TRATAMIENTO_RECETAS_Receta> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDT_TRATAMIENTO_RECETAS_Receta> item = new java.util.Vector<>();
}

