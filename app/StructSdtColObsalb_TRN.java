package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColObsalb_TRN", namespace ="TexplusNET")
public final  class StructSdtColObsalb_TRN implements Cloneable, java.io.Serializable
{
   public StructSdtColObsalb_TRN( )
   {
      this( -1, new ModelContext( StructSdtColObsalb_TRN.class ));
   }

   public StructSdtColObsalb_TRN( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColObsalb_TRN( java.util.Vector<StructSdtObsalb_TRN> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Obsalb_TRN",namespace="TexplusNET")
   public java.util.Vector<StructSdtObsalb_TRN> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtObsalb_TRN> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtObsalb_TRN> item = new java.util.Vector<>();
}

