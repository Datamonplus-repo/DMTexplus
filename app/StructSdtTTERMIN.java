package app ;
import com.genexus.*;

public final  class StructSdtTTERMIN implements Cloneable, java.io.Serializable
{
   public StructSdtTTERMIN( )
   {
      this( -1, new ModelContext( StructSdtTTERMIN.class ));
   }

   public StructSdtTTERMIN( int remoteHandle ,
                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTTERMIN_Termcod = "" ;
      gxTv_SdtTTERMIN_Emprcod = "" ;
      gxTv_SdtTTERMIN_Emprnom = "" ;
      gxTv_SdtTTERMIN_Termdsc = "" ;
      gxTv_SdtTTERMIN_Impcod = "" ;
      gxTv_SdtTTERMIN_Impdsc = "" ;
      gxTv_SdtTTERMIN_Termusu = "" ;
      gxTv_SdtTTERMIN_Impcod1 = "" ;
      gxTv_SdtTTERMIN_Impcod2 = "" ;
      gxTv_SdtTTERMIN_Impcod3 = "" ;
      gxTv_SdtTTERMIN_Impcod4 = "" ;
      gxTv_SdtTTERMIN_Impcod5 = "" ;
      gxTv_SdtTTERMIN_Implpt1 = "" ;
      gxTv_SdtTTERMIN_Implpt2 = "" ;
      gxTv_SdtTTERMIN_Implpt3 = "" ;
      gxTv_SdtTTERMIN_Implpt4 = "" ;
      gxTv_SdtTTERMIN_Implpt5 = "" ;
      gxTv_SdtTTERMIN_Termlog1 = "" ;
      gxTv_SdtTTERMIN_Termlog2 = "" ;
      gxTv_SdtTTERMIN_Termfec = cal.getTime() ;
      gxTv_SdtTTERMIN_Mode = "" ;
      gxTv_SdtTTERMIN_Termcod_Z = "" ;
      gxTv_SdtTTERMIN_Emprcod_Z = "" ;
      gxTv_SdtTTERMIN_Emprnom_Z = "" ;
      gxTv_SdtTTERMIN_Termdsc_Z = "" ;
      gxTv_SdtTTERMIN_Impcod_Z = "" ;
      gxTv_SdtTTERMIN_Impdsc_Z = "" ;
      gxTv_SdtTTERMIN_Termusu_Z = "" ;
      gxTv_SdtTTERMIN_Impcod1_Z = "" ;
      gxTv_SdtTTERMIN_Impcod2_Z = "" ;
      gxTv_SdtTTERMIN_Impcod3_Z = "" ;
      gxTv_SdtTTERMIN_Impcod4_Z = "" ;
      gxTv_SdtTTERMIN_Impcod5_Z = "" ;
      gxTv_SdtTTERMIN_Implpt1_Z = "" ;
      gxTv_SdtTTERMIN_Implpt2_Z = "" ;
      gxTv_SdtTTERMIN_Implpt3_Z = "" ;
      gxTv_SdtTTERMIN_Implpt4_Z = "" ;
      gxTv_SdtTTERMIN_Implpt5_Z = "" ;
      gxTv_SdtTTERMIN_Termlog1_Z = "" ;
      gxTv_SdtTTERMIN_Termlog2_Z = "" ;
      gxTv_SdtTTERMIN_Termfec_Z = cal.getTime() ;
      gxTv_SdtTTERMIN_Emprcod_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Emprnom_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termdsc_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impcod_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impdsc_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termusu_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impcod1_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impcod2_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impcod3_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impcod4_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impcod5_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Implpt1_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Implpt2_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Implpt3_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Implpt4_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Implpt5_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termbol_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termbal_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termnotr_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termlog1_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termlog2_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termpes_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termest_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termfec_N = (byte)(1) ;
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
      return gxTv_SdtTTERMIN_Termcod ;
   }

   public void setTermcod( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termcod = value ;
   }

   public String getEmprcod( )
   {
      return gxTv_SdtTTERMIN_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtTTERMIN_Emprcod_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Emprcod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtTTERMIN_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtTTERMIN_Emprnom_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Emprnom = value ;
   }

   public String getTermdsc( )
   {
      return gxTv_SdtTTERMIN_Termdsc ;
   }

   public void setTermdsc( String value )
   {
      gxTv_SdtTTERMIN_Termdsc_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termdsc = value ;
   }

   public String getImpcod( )
   {
      return gxTv_SdtTTERMIN_Impcod ;
   }

   public void setImpcod( String value )
   {
      gxTv_SdtTTERMIN_Impcod_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod = value ;
   }

   public String getImpdsc( )
   {
      return gxTv_SdtTTERMIN_Impdsc ;
   }

   public void setImpdsc( String value )
   {
      gxTv_SdtTTERMIN_Impdsc_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impdsc = value ;
   }

   public String getTermusu( )
   {
      return gxTv_SdtTTERMIN_Termusu ;
   }

   public void setTermusu( String value )
   {
      gxTv_SdtTTERMIN_Termusu_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termusu = value ;
   }

   public String getImpcod1( )
   {
      return gxTv_SdtTTERMIN_Impcod1 ;
   }

   public void setImpcod1( String value )
   {
      gxTv_SdtTTERMIN_Impcod1_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod1 = value ;
   }

   public String getImpcod2( )
   {
      return gxTv_SdtTTERMIN_Impcod2 ;
   }

   public void setImpcod2( String value )
   {
      gxTv_SdtTTERMIN_Impcod2_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod2 = value ;
   }

   public String getImpcod3( )
   {
      return gxTv_SdtTTERMIN_Impcod3 ;
   }

   public void setImpcod3( String value )
   {
      gxTv_SdtTTERMIN_Impcod3_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod3 = value ;
   }

   public String getImpcod4( )
   {
      return gxTv_SdtTTERMIN_Impcod4 ;
   }

   public void setImpcod4( String value )
   {
      gxTv_SdtTTERMIN_Impcod4_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod4 = value ;
   }

   public String getImpcod5( )
   {
      return gxTv_SdtTTERMIN_Impcod5 ;
   }

   public void setImpcod5( String value )
   {
      gxTv_SdtTTERMIN_Impcod5_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod5 = value ;
   }

   public String getImplpt1( )
   {
      return gxTv_SdtTTERMIN_Implpt1 ;
   }

   public void setImplpt1( String value )
   {
      gxTv_SdtTTERMIN_Implpt1_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt1 = value ;
   }

   public String getImplpt2( )
   {
      return gxTv_SdtTTERMIN_Implpt2 ;
   }

   public void setImplpt2( String value )
   {
      gxTv_SdtTTERMIN_Implpt2_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt2 = value ;
   }

   public String getImplpt3( )
   {
      return gxTv_SdtTTERMIN_Implpt3 ;
   }

   public void setImplpt3( String value )
   {
      gxTv_SdtTTERMIN_Implpt3_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt3 = value ;
   }

   public String getImplpt4( )
   {
      return gxTv_SdtTTERMIN_Implpt4 ;
   }

   public void setImplpt4( String value )
   {
      gxTv_SdtTTERMIN_Implpt4_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt4 = value ;
   }

   public String getImplpt5( )
   {
      return gxTv_SdtTTERMIN_Implpt5 ;
   }

   public void setImplpt5( String value )
   {
      gxTv_SdtTTERMIN_Implpt5_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt5 = value ;
   }

   public byte getTermbol( )
   {
      return gxTv_SdtTTERMIN_Termbol ;
   }

   public void setTermbol( byte value )
   {
      gxTv_SdtTTERMIN_Termbol_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termbol = value ;
   }

   public byte getTermbal( )
   {
      return gxTv_SdtTTERMIN_Termbal ;
   }

   public void setTermbal( byte value )
   {
      gxTv_SdtTTERMIN_Termbal_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termbal = value ;
   }

   public byte getTermnotr( )
   {
      return gxTv_SdtTTERMIN_Termnotr ;
   }

   public void setTermnotr( byte value )
   {
      gxTv_SdtTTERMIN_Termnotr_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termnotr = value ;
   }

   public String getTermlog1( )
   {
      return gxTv_SdtTTERMIN_Termlog1 ;
   }

   public void setTermlog1( String value )
   {
      gxTv_SdtTTERMIN_Termlog1_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termlog1 = value ;
   }

   public String getTermlog2( )
   {
      return gxTv_SdtTTERMIN_Termlog2 ;
   }

   public void setTermlog2( String value )
   {
      gxTv_SdtTTERMIN_Termlog2_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termlog2 = value ;
   }

   public byte getTermpes( )
   {
      return gxTv_SdtTTERMIN_Termpes ;
   }

   public void setTermpes( byte value )
   {
      gxTv_SdtTTERMIN_Termpes_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termpes = value ;
   }

   public byte getTermest( )
   {
      return gxTv_SdtTTERMIN_Termest ;
   }

   public void setTermest( byte value )
   {
      gxTv_SdtTTERMIN_Termest_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termest = value ;
   }

   public java.util.Date getTermfec( )
   {
      return gxTv_SdtTTERMIN_Termfec ;
   }

   public void setTermfec( java.util.Date value )
   {
      gxTv_SdtTTERMIN_Termfec_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termfec = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTTERMIN_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTTERMIN_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Initialized = value ;
   }

   public String getTermcod_Z( )
   {
      return gxTv_SdtTTERMIN_Termcod_Z ;
   }

   public void setTermcod_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termcod_Z = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtTTERMIN_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Emprcod_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtTTERMIN_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Emprnom_Z = value ;
   }

   public String getTermdsc_Z( )
   {
      return gxTv_SdtTTERMIN_Termdsc_Z ;
   }

   public void setTermdsc_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termdsc_Z = value ;
   }

   public String getImpcod_Z( )
   {
      return gxTv_SdtTTERMIN_Impcod_Z ;
   }

   public void setImpcod_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod_Z = value ;
   }

   public String getImpdsc_Z( )
   {
      return gxTv_SdtTTERMIN_Impdsc_Z ;
   }

   public void setImpdsc_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impdsc_Z = value ;
   }

   public String getTermusu_Z( )
   {
      return gxTv_SdtTTERMIN_Termusu_Z ;
   }

   public void setTermusu_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termusu_Z = value ;
   }

   public String getImpcod1_Z( )
   {
      return gxTv_SdtTTERMIN_Impcod1_Z ;
   }

   public void setImpcod1_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod1_Z = value ;
   }

   public String getImpcod2_Z( )
   {
      return gxTv_SdtTTERMIN_Impcod2_Z ;
   }

   public void setImpcod2_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod2_Z = value ;
   }

   public String getImpcod3_Z( )
   {
      return gxTv_SdtTTERMIN_Impcod3_Z ;
   }

   public void setImpcod3_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod3_Z = value ;
   }

   public String getImpcod4_Z( )
   {
      return gxTv_SdtTTERMIN_Impcod4_Z ;
   }

   public void setImpcod4_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod4_Z = value ;
   }

   public String getImpcod5_Z( )
   {
      return gxTv_SdtTTERMIN_Impcod5_Z ;
   }

   public void setImpcod5_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod5_Z = value ;
   }

   public String getImplpt1_Z( )
   {
      return gxTv_SdtTTERMIN_Implpt1_Z ;
   }

   public void setImplpt1_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt1_Z = value ;
   }

   public String getImplpt2_Z( )
   {
      return gxTv_SdtTTERMIN_Implpt2_Z ;
   }

   public void setImplpt2_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt2_Z = value ;
   }

   public String getImplpt3_Z( )
   {
      return gxTv_SdtTTERMIN_Implpt3_Z ;
   }

   public void setImplpt3_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt3_Z = value ;
   }

   public String getImplpt4_Z( )
   {
      return gxTv_SdtTTERMIN_Implpt4_Z ;
   }

   public void setImplpt4_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt4_Z = value ;
   }

   public String getImplpt5_Z( )
   {
      return gxTv_SdtTTERMIN_Implpt5_Z ;
   }

   public void setImplpt5_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt5_Z = value ;
   }

   public byte getTermbol_Z( )
   {
      return gxTv_SdtTTERMIN_Termbol_Z ;
   }

   public void setTermbol_Z( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termbol_Z = value ;
   }

   public byte getTermbal_Z( )
   {
      return gxTv_SdtTTERMIN_Termbal_Z ;
   }

   public void setTermbal_Z( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termbal_Z = value ;
   }

   public byte getTermnotr_Z( )
   {
      return gxTv_SdtTTERMIN_Termnotr_Z ;
   }

   public void setTermnotr_Z( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termnotr_Z = value ;
   }

   public String getTermlog1_Z( )
   {
      return gxTv_SdtTTERMIN_Termlog1_Z ;
   }

   public void setTermlog1_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termlog1_Z = value ;
   }

   public String getTermlog2_Z( )
   {
      return gxTv_SdtTTERMIN_Termlog2_Z ;
   }

   public void setTermlog2_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termlog2_Z = value ;
   }

   public byte getTermpes_Z( )
   {
      return gxTv_SdtTTERMIN_Termpes_Z ;
   }

   public void setTermpes_Z( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termpes_Z = value ;
   }

   public byte getTermest_Z( )
   {
      return gxTv_SdtTTERMIN_Termest_Z ;
   }

   public void setTermest_Z( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termest_Z = value ;
   }

   public java.util.Date getTermfec_Z( )
   {
      return gxTv_SdtTTERMIN_Termfec_Z ;
   }

   public void setTermfec_Z( java.util.Date value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termfec_Z = value ;
   }

   public byte getEmprcod_N( )
   {
      return gxTv_SdtTTERMIN_Emprcod_N ;
   }

   public void setEmprcod_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Emprcod_N = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtTTERMIN_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Emprnom_N = value ;
   }

   public byte getTermdsc_N( )
   {
      return gxTv_SdtTTERMIN_Termdsc_N ;
   }

   public void setTermdsc_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termdsc_N = value ;
   }

   public byte getImpcod_N( )
   {
      return gxTv_SdtTTERMIN_Impcod_N ;
   }

   public void setImpcod_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod_N = value ;
   }

   public byte getImpdsc_N( )
   {
      return gxTv_SdtTTERMIN_Impdsc_N ;
   }

   public void setImpdsc_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impdsc_N = value ;
   }

   public byte getTermusu_N( )
   {
      return gxTv_SdtTTERMIN_Termusu_N ;
   }

   public void setTermusu_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termusu_N = value ;
   }

   public byte getImpcod1_N( )
   {
      return gxTv_SdtTTERMIN_Impcod1_N ;
   }

   public void setImpcod1_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod1_N = value ;
   }

   public byte getImpcod2_N( )
   {
      return gxTv_SdtTTERMIN_Impcod2_N ;
   }

   public void setImpcod2_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod2_N = value ;
   }

   public byte getImpcod3_N( )
   {
      return gxTv_SdtTTERMIN_Impcod3_N ;
   }

   public void setImpcod3_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod3_N = value ;
   }

   public byte getImpcod4_N( )
   {
      return gxTv_SdtTTERMIN_Impcod4_N ;
   }

   public void setImpcod4_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod4_N = value ;
   }

   public byte getImpcod5_N( )
   {
      return gxTv_SdtTTERMIN_Impcod5_N ;
   }

   public void setImpcod5_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Impcod5_N = value ;
   }

   public byte getImplpt1_N( )
   {
      return gxTv_SdtTTERMIN_Implpt1_N ;
   }

   public void setImplpt1_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt1_N = value ;
   }

   public byte getImplpt2_N( )
   {
      return gxTv_SdtTTERMIN_Implpt2_N ;
   }

   public void setImplpt2_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt2_N = value ;
   }

   public byte getImplpt3_N( )
   {
      return gxTv_SdtTTERMIN_Implpt3_N ;
   }

   public void setImplpt3_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt3_N = value ;
   }

   public byte getImplpt4_N( )
   {
      return gxTv_SdtTTERMIN_Implpt4_N ;
   }

   public void setImplpt4_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt4_N = value ;
   }

   public byte getImplpt5_N( )
   {
      return gxTv_SdtTTERMIN_Implpt5_N ;
   }

   public void setImplpt5_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Implpt5_N = value ;
   }

   public byte getTermbol_N( )
   {
      return gxTv_SdtTTERMIN_Termbol_N ;
   }

   public void setTermbol_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termbol_N = value ;
   }

   public byte getTermbal_N( )
   {
      return gxTv_SdtTTERMIN_Termbal_N ;
   }

   public void setTermbal_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termbal_N = value ;
   }

   public byte getTermnotr_N( )
   {
      return gxTv_SdtTTERMIN_Termnotr_N ;
   }

   public void setTermnotr_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termnotr_N = value ;
   }

   public byte getTermlog1_N( )
   {
      return gxTv_SdtTTERMIN_Termlog1_N ;
   }

   public void setTermlog1_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termlog1_N = value ;
   }

   public byte getTermlog2_N( )
   {
      return gxTv_SdtTTERMIN_Termlog2_N ;
   }

   public void setTermlog2_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termlog2_N = value ;
   }

   public byte getTermpes_N( )
   {
      return gxTv_SdtTTERMIN_Termpes_N ;
   }

   public void setTermpes_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termpes_N = value ;
   }

   public byte getTermest_N( )
   {
      return gxTv_SdtTTERMIN_Termest_N ;
   }

   public void setTermest_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termest_N = value ;
   }

   public byte getTermfec_N( )
   {
      return gxTv_SdtTTERMIN_Termfec_N ;
   }

   public void setTermfec_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      gxTv_SdtTTERMIN_Termfec_N = value ;
   }

   protected byte gxTv_SdtTTERMIN_Termbol ;
   protected byte gxTv_SdtTTERMIN_Termbal ;
   protected byte gxTv_SdtTTERMIN_Termnotr ;
   protected byte gxTv_SdtTTERMIN_Termpes ;
   protected byte gxTv_SdtTTERMIN_Termest ;
   protected byte gxTv_SdtTTERMIN_Termbol_Z ;
   protected byte gxTv_SdtTTERMIN_Termbal_Z ;
   protected byte gxTv_SdtTTERMIN_Termnotr_Z ;
   protected byte gxTv_SdtTTERMIN_Termpes_Z ;
   protected byte gxTv_SdtTTERMIN_Termest_Z ;
   protected byte gxTv_SdtTTERMIN_Emprcod_N ;
   protected byte gxTv_SdtTTERMIN_Emprnom_N ;
   protected byte gxTv_SdtTTERMIN_Termdsc_N ;
   protected byte gxTv_SdtTTERMIN_Impcod_N ;
   protected byte gxTv_SdtTTERMIN_Impdsc_N ;
   protected byte gxTv_SdtTTERMIN_Termusu_N ;
   protected byte gxTv_SdtTTERMIN_Impcod1_N ;
   protected byte gxTv_SdtTTERMIN_Impcod2_N ;
   protected byte gxTv_SdtTTERMIN_Impcod3_N ;
   protected byte gxTv_SdtTTERMIN_Impcod4_N ;
   protected byte gxTv_SdtTTERMIN_Impcod5_N ;
   protected byte gxTv_SdtTTERMIN_Implpt1_N ;
   protected byte gxTv_SdtTTERMIN_Implpt2_N ;
   protected byte gxTv_SdtTTERMIN_Implpt3_N ;
   protected byte gxTv_SdtTTERMIN_Implpt4_N ;
   protected byte gxTv_SdtTTERMIN_Implpt5_N ;
   protected byte gxTv_SdtTTERMIN_Termbol_N ;
   protected byte gxTv_SdtTTERMIN_Termbal_N ;
   protected byte gxTv_SdtTTERMIN_Termnotr_N ;
   protected byte gxTv_SdtTTERMIN_Termlog1_N ;
   protected byte gxTv_SdtTTERMIN_Termlog2_N ;
   protected byte gxTv_SdtTTERMIN_Termpes_N ;
   protected byte gxTv_SdtTTERMIN_Termest_N ;
   protected byte gxTv_SdtTTERMIN_Termfec_N ;
   private byte gxTv_SdtTTERMIN_N ;
   protected short gxTv_SdtTTERMIN_Initialized ;
   protected String gxTv_SdtTTERMIN_Termcod ;
   protected String gxTv_SdtTTERMIN_Emprcod ;
   protected String gxTv_SdtTTERMIN_Emprnom ;
   protected String gxTv_SdtTTERMIN_Termdsc ;
   protected String gxTv_SdtTTERMIN_Impcod ;
   protected String gxTv_SdtTTERMIN_Impdsc ;
   protected String gxTv_SdtTTERMIN_Termusu ;
   protected String gxTv_SdtTTERMIN_Impcod1 ;
   protected String gxTv_SdtTTERMIN_Impcod2 ;
   protected String gxTv_SdtTTERMIN_Impcod3 ;
   protected String gxTv_SdtTTERMIN_Impcod4 ;
   protected String gxTv_SdtTTERMIN_Impcod5 ;
   protected String gxTv_SdtTTERMIN_Implpt1 ;
   protected String gxTv_SdtTTERMIN_Implpt2 ;
   protected String gxTv_SdtTTERMIN_Implpt3 ;
   protected String gxTv_SdtTTERMIN_Implpt4 ;
   protected String gxTv_SdtTTERMIN_Implpt5 ;
   protected String gxTv_SdtTTERMIN_Mode ;
   protected String gxTv_SdtTTERMIN_Termcod_Z ;
   protected String gxTv_SdtTTERMIN_Emprcod_Z ;
   protected String gxTv_SdtTTERMIN_Emprnom_Z ;
   protected String gxTv_SdtTTERMIN_Termdsc_Z ;
   protected String gxTv_SdtTTERMIN_Impcod_Z ;
   protected String gxTv_SdtTTERMIN_Impdsc_Z ;
   protected String gxTv_SdtTTERMIN_Termusu_Z ;
   protected String gxTv_SdtTTERMIN_Impcod1_Z ;
   protected String gxTv_SdtTTERMIN_Impcod2_Z ;
   protected String gxTv_SdtTTERMIN_Impcod3_Z ;
   protected String gxTv_SdtTTERMIN_Impcod4_Z ;
   protected String gxTv_SdtTTERMIN_Impcod5_Z ;
   protected String gxTv_SdtTTERMIN_Implpt1_Z ;
   protected String gxTv_SdtTTERMIN_Implpt2_Z ;
   protected String gxTv_SdtTTERMIN_Implpt3_Z ;
   protected String gxTv_SdtTTERMIN_Implpt4_Z ;
   protected String gxTv_SdtTTERMIN_Implpt5_Z ;
   protected String gxTv_SdtTTERMIN_Termlog1 ;
   protected String gxTv_SdtTTERMIN_Termlog2 ;
   protected String gxTv_SdtTTERMIN_Termlog1_Z ;
   protected String gxTv_SdtTTERMIN_Termlog2_Z ;
   protected java.util.Date gxTv_SdtTTERMIN_Termfec ;
   protected java.util.Date gxTv_SdtTTERMIN_Termfec_Z ;
}

