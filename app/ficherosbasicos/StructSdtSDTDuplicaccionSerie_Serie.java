package app.ficherosbasicos ;
import com.genexus.*;

public final  class StructSdtSDTDuplicaccionSerie_Serie implements Cloneable, java.io.Serializable
{
   public StructSdtSDTDuplicaccionSerie_Serie( )
   {
      this( -1, new ModelContext( StructSdtSDTDuplicaccionSerie_Serie.class ));
   }

   public StructSdtSDTDuplicaccionSerie_Serie( int remoteHandle ,
                                               ModelContext context )
   {
      gxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori = "" ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes = "" ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod = "" ;
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

   public boolean getSelected( )
   {
      return gxTv_SdtSDTDuplicaccionSerie_Serie_Selected ;
   }

   public void setSelected( boolean value )
   {
      gxTv_SdtSDTDuplicaccionSerie_Serie_N = (byte)(0) ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Selected = value ;
   }

   public String getArtcodori( )
   {
      return gxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori ;
   }

   public void setArtcodori( String value )
   {
      gxTv_SdtSDTDuplicaccionSerie_Serie_N = (byte)(0) ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori = value ;
   }

   public String getArtdscdes( )
   {
      return gxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes ;
   }

   public void setArtdscdes( String value )
   {
      gxTv_SdtSDTDuplicaccionSerie_Serie_N = (byte)(0) ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes = value ;
   }

   public String getEmprcod( )
   {
      return gxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDTDuplicaccionSerie_Serie_N = (byte)(0) ;
      gxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod = value ;
   }

   protected byte gxTv_SdtSDTDuplicaccionSerie_Serie_N ;
   protected String gxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori ;
   protected String gxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes ;
   protected String gxTv_SdtSDTDuplicaccionSerie_Serie_Emprcod ;
   protected boolean gxTv_SdtSDTDuplicaccionSerie_Serie_Selected ;
}

