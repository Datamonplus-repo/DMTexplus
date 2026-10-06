package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColCalprd_TRN", namespace ="TexplusNET")
public final  class StructSdtColCalprd_TRN implements Cloneable, java.io.Serializable
{
   public StructSdtColCalprd_TRN( )
   {
      this( -1, new ModelContext( StructSdtColCalprd_TRN.class ));
   }

   public StructSdtColCalprd_TRN( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColCalprd_TRN( java.util.Vector<StructSdtCalprd_TRN> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Calprd_TRN",namespace="TexplusNET")
   public java.util.Vector<StructSdtCalprd_TRN> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtCalprd_TRN> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtCalprd_TRN> item = new java.util.Vector<>();
}

