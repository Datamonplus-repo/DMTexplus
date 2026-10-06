package app ;
import com.genexus.*;

public final  class StructSdtTTERPES implements Cloneable, java.io.Serializable
{
   public StructSdtTTERPES( )
   {
      this( -1, new ModelContext( StructSdtTTERPES.class ));
   }

   public StructSdtTTERPES( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_SdtTTERPES_Termcod = "" ;
      gxTv_SdtTTERPES_Termdsc = "" ;
      gxTv_SdtTTERPES_Emprcod = "" ;
      gxTv_SdtTTERPES_Emprnom = "" ;
      gxTv_SdtTTERPES_Termpespro = "" ;
      gxTv_SdtTTERPES_Termpestpo = "" ;
      gxTv_SdtTTERPES_Mode = "" ;
      gxTv_SdtTTERPES_Termcod_Z = "" ;
      gxTv_SdtTTERPES_Termdsc_Z = "" ;
      gxTv_SdtTTERPES_Emprcod_Z = "" ;
      gxTv_SdtTTERPES_Emprnom_Z = "" ;
      gxTv_SdtTTERPES_Termpespro_Z = "" ;
      gxTv_SdtTTERPES_Termpestpo_Z = "" ;
      gxTv_SdtTTERPES_Termdsc_N = (byte)(1) ;
      gxTv_SdtTTERPES_Emprcod_N = (byte)(1) ;
      gxTv_SdtTTERPES_Emprnom_N = (byte)(1) ;
      gxTv_SdtTTERPES_Termpes_N = (byte)(1) ;
      gxTv_SdtTTERPES_Termpesult_N = (byte)(1) ;
      gxTv_SdtTTERPES_Termpestpo_N = (byte)(1) ;
      gxTv_SdtTTERPES_Termpesqty_N = (byte)(1) ;
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

   public String getTermcod( )
   {
      return gxTv_SdtTTERPES_Termcod ;
   }

   public void setTermcod( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termcod = value ;
   }

   public String getTermdsc( )
   {
      return gxTv_SdtTTERPES_Termdsc ;
   }

   public void setTermdsc( String value )
   {
      gxTv_SdtTTERPES_Termdsc_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termdsc = value ;
   }

   public String getEmprcod( )
   {
      return gxTv_SdtTTERPES_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtTTERPES_Emprcod_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Emprcod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtTTERPES_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtTTERPES_Emprnom_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Emprnom = value ;
   }

   public byte getTermpes( )
   {
      return gxTv_SdtTTERPES_Termpes ;
   }

   public void setTermpes( byte value )
   {
      gxTv_SdtTTERPES_Termpes_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpes = value ;
   }

   public String getTermpespro( )
   {
      return gxTv_SdtTTERPES_Termpespro ;
   }

   public void setTermpespro( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpespro = value ;
   }

   public long getTermpesult( )
   {
      return gxTv_SdtTTERPES_Termpesult ;
   }

   public void setTermpesult( long value )
   {
      gxTv_SdtTTERPES_Termpesult_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpesult = value ;
   }

   public String getTermpestpo( )
   {
      return gxTv_SdtTTERPES_Termpestpo ;
   }

   public void setTermpestpo( String value )
   {
      gxTv_SdtTTERPES_Termpestpo_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpestpo = value ;
   }

   public short getTermpesqty( )
   {
      return gxTv_SdtTTERPES_Termpesqty ;
   }

   public void setTermpesqty( short value )
   {
      gxTv_SdtTTERPES_Termpesqty_N = (byte)(0) ;
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpesqty = value ;
   }

   public java.util.Vector<app.StructSdtTTERPES_Level1Item> getLevel1( )
   {
      return gxTv_SdtTTERPES_Level1 ;
   }

   public void setLevel1( java.util.Vector<app.StructSdtTTERPES_Level1Item> value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Level1 = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTTERPES_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTTERPES_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Initialized = value ;
   }

   public String getTermcod_Z( )
   {
      return gxTv_SdtTTERPES_Termcod_Z ;
   }

   public void setTermcod_Z( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termcod_Z = value ;
   }

   public String getTermdsc_Z( )
   {
      return gxTv_SdtTTERPES_Termdsc_Z ;
   }

   public void setTermdsc_Z( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termdsc_Z = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtTTERPES_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Emprcod_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtTTERPES_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Emprnom_Z = value ;
   }

   public byte getTermpes_Z( )
   {
      return gxTv_SdtTTERPES_Termpes_Z ;
   }

   public void setTermpes_Z( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpes_Z = value ;
   }

   public String getTermpespro_Z( )
   {
      return gxTv_SdtTTERPES_Termpespro_Z ;
   }

   public void setTermpespro_Z( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpespro_Z = value ;
   }

   public long getTermpesult_Z( )
   {
      return gxTv_SdtTTERPES_Termpesult_Z ;
   }

   public void setTermpesult_Z( long value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpesult_Z = value ;
   }

   public String getTermpestpo_Z( )
   {
      return gxTv_SdtTTERPES_Termpestpo_Z ;
   }

   public void setTermpestpo_Z( String value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpestpo_Z = value ;
   }

   public short getTermpesqty_Z( )
   {
      return gxTv_SdtTTERPES_Termpesqty_Z ;
   }

   public void setTermpesqty_Z( short value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpesqty_Z = value ;
   }

   public byte getTermdsc_N( )
   {
      return gxTv_SdtTTERPES_Termdsc_N ;
   }

   public void setTermdsc_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termdsc_N = value ;
   }

   public byte getEmprcod_N( )
   {
      return gxTv_SdtTTERPES_Emprcod_N ;
   }

   public void setEmprcod_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Emprcod_N = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtTTERPES_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Emprnom_N = value ;
   }

   public byte getTermpes_N( )
   {
      return gxTv_SdtTTERPES_Termpes_N ;
   }

   public void setTermpes_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpes_N = value ;
   }

   public byte getTermpesult_N( )
   {
      return gxTv_SdtTTERPES_Termpesult_N ;
   }

   public void setTermpesult_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpesult_N = value ;
   }

   public byte getTermpestpo_N( )
   {
      return gxTv_SdtTTERPES_Termpestpo_N ;
   }

   public void setTermpestpo_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpestpo_N = value ;
   }

   public byte getTermpesqty_N( )
   {
      return gxTv_SdtTTERPES_Termpesqty_N ;
   }

   public void setTermpesqty_N( byte value )
   {
      gxTv_SdtTTERPES_N = (byte)(0) ;
      gxTv_SdtTTERPES_Termpesqty_N = value ;
   }

   protected byte gxTv_SdtTTERPES_Termpes ;
   protected byte gxTv_SdtTTERPES_Termpes_Z ;
   protected byte gxTv_SdtTTERPES_Termdsc_N ;
   protected byte gxTv_SdtTTERPES_Emprcod_N ;
   protected byte gxTv_SdtTTERPES_Emprnom_N ;
   protected byte gxTv_SdtTTERPES_Termpes_N ;
   protected byte gxTv_SdtTTERPES_Termpesult_N ;
   protected byte gxTv_SdtTTERPES_Termpestpo_N ;
   protected byte gxTv_SdtTTERPES_Termpesqty_N ;
   private byte gxTv_SdtTTERPES_N ;
   protected short gxTv_SdtTTERPES_Termpesqty ;
   protected short gxTv_SdtTTERPES_Initialized ;
   protected short gxTv_SdtTTERPES_Termpesqty_Z ;
   protected long gxTv_SdtTTERPES_Termpesult ;
   protected long gxTv_SdtTTERPES_Termpesult_Z ;
   protected String gxTv_SdtTTERPES_Termcod ;
   protected String gxTv_SdtTTERPES_Termdsc ;
   protected String gxTv_SdtTTERPES_Emprcod ;
   protected String gxTv_SdtTTERPES_Emprnom ;
   protected String gxTv_SdtTTERPES_Termpespro ;
   protected String gxTv_SdtTTERPES_Termpestpo ;
   protected String gxTv_SdtTTERPES_Mode ;
   protected String gxTv_SdtTTERPES_Termcod_Z ;
   protected String gxTv_SdtTTERPES_Termdsc_Z ;
   protected String gxTv_SdtTTERPES_Emprcod_Z ;
   protected String gxTv_SdtTTERPES_Emprnom_Z ;
   protected String gxTv_SdtTTERPES_Termpespro_Z ;
   protected String gxTv_SdtTTERPES_Termpestpo_Z ;
   protected java.util.Vector<app.StructSdtTTERPES_Level1Item> gxTv_SdtTTERPES_Level1=null ;
}

