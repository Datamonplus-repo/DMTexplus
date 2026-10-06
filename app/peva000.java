package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peva000 extends GXProcedure
{
   public peva000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peva000.class ), "" );
   }

   public peva000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 ,
                             byte[] aP10 ,
                             byte[] aP11 ,
                             byte[] aP12 )
   {
      peva000.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        String[] aP9 ,
                        byte[] aP10 ,
                        byte[] aP11 ,
                        byte[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 ,
                             byte[] aP10 ,
                             byte[] aP11 ,
                             byte[] aP12 ,
                             String[] aP13 )
   {
      peva000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peva000.this.AV19Clicod = aP1[0];
      this.aP1 = aP1;
      peva000.this.AV18ARtcod = aP2[0];
      this.aP2 = aP2;
      peva000.this.AV17PArtColNom = aP3[0];
      this.aP3 = aP3;
      peva000.this.AV20PArtTipCol = aP4[0];
      this.aP4 = aP4;
      peva000.this.AV21FasActTin = aP5[0];
      this.aP5 = aP5;
      peva000.this.AV22FasPreObl = aP6[0];
      this.aP6 = aP6;
      peva000.this.AV8PafPre = aP7[0];
      this.aP7 = aP7;
      peva000.this.AV10PArtId = aP8[0];
      this.aP8 = aP8;
      peva000.this.AV9FasCod = aP9[0];
      this.aP9 = aP9;
      peva000.this.AV12PAFAut = aP10[0];
      this.aP10 = aP10;
      peva000.this.AV16PAFPreOk = aP11[0];
      this.aP11 = aP11;
      peva000.this.AV11PAFPreL = aP12[0];
      this.aP12 = aP12;
      peva000.this.AV14MsgErr = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (long)(DecimalUtil.decToDouble(AV13PafPreLis)) ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = AV10PArtId ;
      GXv_char4[0] = AV9FasCod ;
      GXv_int5[0] = (short)(0) ;
      GXv_char6[0] = httpContext.getMessage( "P", "") ;
      GXv_int7[0] = GXt_int1 ;
      new app.partpre0(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_int7) ;
      peva000.this.A396EmprCod = GXv_char2[0] ;
      peva000.this.AV10PArtId = GXv_int3[0] ;
      peva000.this.AV9FasCod = GXv_char4[0] ;
      peva000.this.GXt_int1 = GXv_int7[0] ;
      AV13PafPreLis = DecimalUtil.doubleToDec(GXt_int1) ;
      AV11PAFPreL = (byte)(((AV13PafPreLis.doubleValue()>0) ? 1 : 0)) ;
      AV15TextoMsg = httpContext.getMessage( "El precio debe ser igual al precio de Lista, ", "") + GXutil.str( AV13PafPreLis, 13, 5) ;
      AV14MsgErr = ((DecimalUtil.compareTo(AV8PafPre, AV13PafPreLis)!=0)&&(AV11PAFPreL==1)&&(AV12PAFAut==0) ? AV15TextoMsg : " ") ;
      GXt_decimal8 = AV23PAFPreMin ;
      GXv_char6[0] = A396EmprCod ;
      GXv_int3[0] = AV19Clicod ;
      GXv_char4[0] = AV18ARtcod ;
      GXv_char2[0] = AV17PArtColNom ;
      GXv_int9[0] = 0 ;
      GXv_int10[0] = AV20PArtTipCol ;
      GXv_char11[0] = AV21FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmin(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_char4, GXv_char2, GXv_int9, GXv_int10, GXv_char11, GXv_decimal12) ;
      peva000.this.A396EmprCod = GXv_char6[0] ;
      peva000.this.AV19Clicod = GXv_int3[0] ;
      peva000.this.AV18ARtcod = GXv_char4[0] ;
      peva000.this.AV17PArtColNom = GXv_char2[0] ;
      peva000.this.AV20PArtTipCol = GXv_int10[0] ;
      peva000.this.AV21FasActTin = GXv_char11[0] ;
      peva000.this.GXt_decimal8 = GXv_decimal12[0] ;
      AV23PAFPreMin = GXt_decimal8 ;
      GXt_decimal8 = AV24PAFPreMax ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = AV19Clicod ;
      GXv_char6[0] = AV18ARtcod ;
      GXv_char4[0] = AV17PArtColNom ;
      GXv_int3[0] = 0 ;
      GXv_int10[0] = AV20PArtTipCol ;
      GXv_char2[0] = AV21FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmax(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_char4, GXv_int3, GXv_int10, GXv_char2, GXv_decimal12) ;
      peva000.this.A396EmprCod = GXv_char11[0] ;
      peva000.this.AV19Clicod = GXv_int9[0] ;
      peva000.this.AV18ARtcod = GXv_char6[0] ;
      peva000.this.AV17PArtColNom = GXv_char4[0] ;
      peva000.this.AV20PArtTipCol = GXv_int10[0] ;
      peva000.this.AV21FasActTin = GXv_char2[0] ;
      peva000.this.GXt_decimal8 = GXv_decimal12[0] ;
      AV24PAFPreMax = GXt_decimal8 ;
      AV16PAFPreOk = (byte)(0) ;
      if ( ( ( DecimalUtil.compareTo(AV8PafPre, AV23PAFPreMin) < 0 ) && ( GXutil.strcmp(AV21FasActTin, httpContext.getMessage( "S", "")) == 0 ) ) && ( AV12PAFAut == 0 ) && ( AV11PAFPreL == 0 ) )
      {
         AV16PAFPreOk = (byte)(1) ;
      }
      if ( ( ( DecimalUtil.compareTo(AV8PafPre, AV24PAFPreMax) > 0 ) && ( GXutil.strcmp(AV21FasActTin, httpContext.getMessage( "S", "")) == 0 ) ) && ( AV12PAFAut == 0 ) && ( AV11PAFPreL == 0 ) )
      {
         AV16PAFPreOk = (byte)(1) ;
      }
      if ( ( DecimalUtil.compareTo(AV8PafPre, AV13PafPreLis) != 0 ) && ( AV11PAFPreL == 1 ) && ( AV12PAFAut == 0 ) )
      {
         AV16PAFPreOk = (byte)(1) ;
      }
      if ( ( ( AV22FasPreObl == 1 ) && ( AV8PafPre.doubleValue() == 0 ) ) && ( AV12PAFAut == 0 ) )
      {
         AV16PAFPreOk = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peva000.this.A396EmprCod;
      this.aP1[0] = peva000.this.AV19Clicod;
      this.aP2[0] = peva000.this.AV18ARtcod;
      this.aP3[0] = peva000.this.AV17PArtColNom;
      this.aP4[0] = peva000.this.AV20PArtTipCol;
      this.aP5[0] = peva000.this.AV21FasActTin;
      this.aP6[0] = peva000.this.AV22FasPreObl;
      this.aP7[0] = peva000.this.AV8PafPre;
      this.aP8[0] = peva000.this.AV10PArtId;
      this.aP9[0] = peva000.this.AV9FasCod;
      this.aP10[0] = peva000.this.AV12PAFAut;
      this.aP11[0] = peva000.this.AV16PAFPreOk;
      this.aP12[0] = peva000.this.AV11PAFPreL;
      this.aP13[0] = peva000.this.AV14MsgErr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13PafPreLis = DecimalUtil.ZERO ;
      GXv_int5 = new short[1] ;
      GXv_int7 = new long[1] ;
      AV15TextoMsg = "" ;
      AV23PAFPreMin = DecimalUtil.ZERO ;
      AV24PAFPreMax = DecimalUtil.ZERO ;
      GXt_decimal8 = DecimalUtil.ZERO ;
      GXv_char11 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20PArtTipCol ;
   private byte AV22FasPreObl ;
   private byte AV12PAFAut ;
   private byte AV16PAFPreOk ;
   private byte AV11PAFPreL ;
   private byte GXv_int10[] ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV19Clicod ;
   private int AV10PArtId ;
   private int GXv_int9[] ;
   private int GXv_int3[] ;
   private long GXt_int1 ;
   private long GXv_int7[] ;
   private java.math.BigDecimal AV8PafPre ;
   private java.math.BigDecimal AV13PafPreLis ;
   private java.math.BigDecimal AV23PAFPreMin ;
   private java.math.BigDecimal AV24PAFPreMax ;
   private java.math.BigDecimal GXt_decimal8 ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String A396EmprCod ;
   private String AV18ARtcod ;
   private String AV17PArtColNom ;
   private String AV21FasActTin ;
   private String AV9FasCod ;
   private String AV14MsgErr ;
   private String AV15TextoMsg ;
   private String GXv_char11[] ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private byte[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private String[] aP9 ;
   private byte[] aP10 ;
   private byte[] aP11 ;
   private byte[] aP12 ;
}

