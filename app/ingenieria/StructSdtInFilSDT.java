package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtInFilSDT implements Cloneable, java.io.Serializable
{
   public StructSdtInFilSDT( )
   {
      this( -1, new ModelContext( StructSdtInFilSDT.class ));
   }

   public StructSdtInFilSDT( int remoteHandle ,
                             ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtInFilSDT_Infilusu = "" ;
      gxTv_SdtInFilSDT_Infilip = "" ;
      gxTv_SdtInFilSDT_Infilobj = "" ;
      gxTv_SdtInFilSDT_Infilfreg = cal.getTime() ;
      gxTv_SdtInFilSDT_Infilfini = cal.getTime() ;
      gxTv_SdtInFilSDT_Infilffin = cal.getTime() ;
      gxTv_SdtInFilSDT_Infilmaq = "" ;
      gxTv_SdtInFilSDT_Infilfase = "" ;
      gxTv_SdtInFilSDT_Infilhdr = "" ;
      gxTv_SdtInFilSDT_Infilpar = "" ;
      gxTv_SdtInFilSDT_Infilemp = "" ;
      gxTv_SdtInFilSDT_Infiltkn = "" ;
      gxTv_SdtInFilSDT_Infilfreg_N = (byte)(1) ;
      gxTv_SdtInFilSDT_Infilfini_N = (byte)(1) ;
      gxTv_SdtInFilSDT_Infilffin_N = (byte)(1) ;
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

   public long getInfilid( )
   {
      return gxTv_SdtInFilSDT_Infilid ;
   }

   public void setInfilid( long value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilid = value ;
   }

   public String getInfilusu( )
   {
      return gxTv_SdtInFilSDT_Infilusu ;
   }

   public void setInfilusu( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilusu = value ;
   }

   public String getInfilip( )
   {
      return gxTv_SdtInFilSDT_Infilip ;
   }

   public void setInfilip( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilip = value ;
   }

   public String getInfilobj( )
   {
      return gxTv_SdtInFilSDT_Infilobj ;
   }

   public void setInfilobj( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilobj = value ;
   }

   public java.util.Date getInfilfreg( )
   {
      return gxTv_SdtInFilSDT_Infilfreg ;
   }

   public void setInfilfreg( java.util.Date value )
   {
      gxTv_SdtInFilSDT_Infilfreg_N = (byte)(0) ;
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilfreg = value ;
   }

   public java.util.Date getInfilfini( )
   {
      return gxTv_SdtInFilSDT_Infilfini ;
   }

   public void setInfilfini( java.util.Date value )
   {
      gxTv_SdtInFilSDT_Infilfini_N = (byte)(0) ;
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilfini = value ;
   }

   public java.util.Date getInfilffin( )
   {
      return gxTv_SdtInFilSDT_Infilffin ;
   }

   public void setInfilffin( java.util.Date value )
   {
      gxTv_SdtInFilSDT_Infilffin_N = (byte)(0) ;
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilffin = value ;
   }

   public String getInfilmaq( )
   {
      return gxTv_SdtInFilSDT_Infilmaq ;
   }

   public void setInfilmaq( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilmaq = value ;
   }

   public String getInfilfase( )
   {
      return gxTv_SdtInFilSDT_Infilfase ;
   }

   public void setInfilfase( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilfase = value ;
   }

   public String getInfilhdr( )
   {
      return gxTv_SdtInFilSDT_Infilhdr ;
   }

   public void setInfilhdr( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilhdr = value ;
   }

   public String getInfilpar( )
   {
      return gxTv_SdtInFilSDT_Infilpar ;
   }

   public void setInfilpar( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilpar = value ;
   }

   public boolean getInfilerr( )
   {
      return gxTv_SdtInFilSDT_Infilerr ;
   }

   public void setInfilerr( boolean value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilerr = value ;
   }

   public String getInfilemp( )
   {
      return gxTv_SdtInFilSDT_Infilemp ;
   }

   public void setInfilemp( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilemp = value ;
   }

   public String getInfiltkn( )
   {
      return gxTv_SdtInFilSDT_Infiltkn ;
   }

   public void setInfiltkn( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infiltkn = value ;
   }

   public int getIntervalo( )
   {
      return gxTv_SdtInFilSDT_Intervalo ;
   }

   public void setIntervalo( int value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Intervalo = value ;
   }

   protected byte gxTv_SdtInFilSDT_Infilfreg_N ;
   protected byte gxTv_SdtInFilSDT_Infilfini_N ;
   protected byte gxTv_SdtInFilSDT_Infilffin_N ;
   protected byte gxTv_SdtInFilSDT_N ;
   protected int gxTv_SdtInFilSDT_Intervalo ;
   protected long gxTv_SdtInFilSDT_Infilid ;
   protected String gxTv_SdtInFilSDT_Infilusu ;
   protected String gxTv_SdtInFilSDT_Infilemp ;
   protected boolean gxTv_SdtInFilSDT_Infilerr ;
   protected String gxTv_SdtInFilSDT_Infilip ;
   protected String gxTv_SdtInFilSDT_Infilobj ;
   protected String gxTv_SdtInFilSDT_Infilmaq ;
   protected String gxTv_SdtInFilSDT_Infilfase ;
   protected String gxTv_SdtInFilSDT_Infilhdr ;
   protected String gxTv_SdtInFilSDT_Infilpar ;
   protected String gxTv_SdtInFilSDT_Infiltkn ;
   protected java.util.Date gxTv_SdtInFilSDT_Infilfreg ;
   protected java.util.Date gxTv_SdtInFilSDT_Infilfini ;
   protected java.util.Date gxTv_SdtInFilSDT_Infilffin ;
}

