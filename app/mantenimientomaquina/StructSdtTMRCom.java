package app.mantenimientomaquina ;
import com.genexus.*;

public final  class StructSdtTMRCom implements Cloneable, java.io.Serializable
{
   public StructSdtTMRCom( )
   {
      this( -1, new ModelContext( StructSdtTMRCom.class ));
   }

   public StructSdtTMRCom( int remoteHandle ,
                           ModelContext context )
   {
      gxTv_SdtTMRCom_Emprcod = "" ;
      gxTv_SdtTMRCom_Emprnom = "" ;
      gxTv_SdtTMRCom_Mrprinom = "" ;
      gxTv_SdtTMRCom_Mode = "" ;
      gxTv_SdtTMRCom_Emprcod_Z = "" ;
      gxTv_SdtTMRCom_Emprnom_Z = "" ;
      gxTv_SdtTMRCom_Mrprinom_Z = "" ;
      gxTv_SdtTMRCom_Emprnom_N = (byte)(1) ;
      gxTv_SdtTMRCom_Mrprinom_N = (byte)(1) ;
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

   public String getEmprcod( )
   {
      return gxTv_SdtTMRCom_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Emprcod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtTMRCom_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtTMRCom_Emprnom_N = (byte)(0) ;
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Emprnom = value ;
   }

   public int getMrpricod( )
   {
      return gxTv_SdtTMRCom_Mrpricod ;
   }

   public void setMrpricod( int value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Mrpricod = value ;
   }

   public String getMrprinom( )
   {
      return gxTv_SdtTMRCom_Mrprinom ;
   }

   public void setMrprinom( String value )
   {
      gxTv_SdtTMRCom_Mrprinom_N = (byte)(0) ;
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Mrprinom = value ;
   }

   public java.util.Vector<app.mantenimientomaquina.StructSdtTMRCom_Level1Item> getLevel1( )
   {
      return gxTv_SdtTMRCom_Level1 ;
   }

   public void setLevel1( java.util.Vector<app.mantenimientomaquina.StructSdtTMRCom_Level1Item> value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1 = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTMRCom_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTMRCom_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtTMRCom_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Emprcod_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtTMRCom_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Emprnom_Z = value ;
   }

   public int getMrpricod_Z( )
   {
      return gxTv_SdtTMRCom_Mrpricod_Z ;
   }

   public void setMrpricod_Z( int value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Mrpricod_Z = value ;
   }

   public String getMrprinom_Z( )
   {
      return gxTv_SdtTMRCom_Mrprinom_Z ;
   }

   public void setMrprinom_Z( String value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Mrprinom_Z = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtTMRCom_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Emprnom_N = value ;
   }

   public byte getMrprinom_N( )
   {
      return gxTv_SdtTMRCom_Mrprinom_N ;
   }

   public void setMrprinom_N( byte value )
   {
      gxTv_SdtTMRCom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Mrprinom_N = value ;
   }

   protected byte gxTv_SdtTMRCom_Emprnom_N ;
   protected byte gxTv_SdtTMRCom_Mrprinom_N ;
   private byte gxTv_SdtTMRCom_N ;
   protected short gxTv_SdtTMRCom_Initialized ;
   protected int gxTv_SdtTMRCom_Mrpricod ;
   protected int gxTv_SdtTMRCom_Mrpricod_Z ;
   protected String gxTv_SdtTMRCom_Emprcod ;
   protected String gxTv_SdtTMRCom_Emprnom ;
   protected String gxTv_SdtTMRCom_Mrprinom ;
   protected String gxTv_SdtTMRCom_Mode ;
   protected String gxTv_SdtTMRCom_Emprcod_Z ;
   protected String gxTv_SdtTMRCom_Emprnom_Z ;
   protected String gxTv_SdtTMRCom_Mrprinom_Z ;
   protected java.util.Vector<app.mantenimientomaquina.StructSdtTMRCom_Level1Item> gxTv_SdtTMRCom_Level1=null ;
}

