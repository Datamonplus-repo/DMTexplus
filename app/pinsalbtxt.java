package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsalbtxt extends GXProcedure
{
   public pinsalbtxt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsalbtxt.class ), "" );
   }

   public pinsalbtxt( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 )
   {
      pinsalbtxt.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pinsalbtxt.this.AV8emprcod = aP0[0];
      this.aP0 = aP0;
      pinsalbtxt.this.AV9albprocod = aP1[0];
      this.aP1 = aP1;
      pinsalbtxt.this.AV10barcod = aP2[0];
      this.aP2 = aP2;
      pinsalbtxt.this.AV11barcodreo = aP3[0];
      this.aP3 = aP3;
      pinsalbtxt.this.AV12barcodpar = aP4[0];
      this.aP4 = aP4;
      pinsalbtxt.this.AV13BarAlbKgmE = aP5[0];
      this.aP5 = aP5;
      pinsalbtxt.this.AV14AlbProRec = aP6[0];
      this.aP6 = aP6;
      pinsalbtxt.this.AV17usurcod = aP7[0];
      this.aP7 = aP7;
      pinsalbtxt.this.AV18station = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV16contdsc2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV8emprcod, httpContext.getMessage( "TXTRCG", ""), GXv_char2) ;
      pinsalbtxt.this.GXt_char1 = GXv_char2[0] ;
      AV16contdsc2 = GXt_char1 ;
      AV16contdsc2 = ((GXutil.strcmp("", AV16contdsc2)==0) ? httpContext.getMessage( "Falta Texto contador TXTRCG", "") : AV16contdsc2) ;
      /* Using cursor P09QA2 */
      pr_default.execute(0, new Object[] {AV8emprcod, Long.valueOf(AV9albprocod), Integer.valueOf(AV10barcod), Byte.valueOf(AV11barcodreo), AV12barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P09QA2_A130BarCodPar[0] ;
         A132BarCodReo = P09QA2_A132BarCodReo[0] ;
         A129BarCod = P09QA2_A129BarCod[0] ;
         A30AlbProCod = P09QA2_A30AlbProCod[0] ;
         A396EmprCod = P09QA2_A396EmprCod[0] ;
         A2763AlbHdrUlin = P09QA2_A2763AlbHdrUlin[0] ;
         A40AlbProRec = P09QA2_A40AlbProRec[0] ;
         AV15AlbHdrUlin = (short)(A2763AlbHdrUlin+1) ;
         A2763AlbHdrUlin = (short)(A2763AlbHdrUlin+1) ;
         AV19inc_obs = httpContext.getMessage( "Inicializo campo AlbProrec ", "") + GXutil.trim( GXutil.str( A40AlbProRec, 13, 5)) + GXutil.newLine( ) ;
         AV19inc_obs += httpContext.getMessage( "N Guia ", "") + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) + GXutil.newLine( ) ;
         A40AlbProRec = DecimalUtil.ZERO ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV23Pgmname, AV17usurcod, AV18station, AV19inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P09QA3 */
         pr_default.execute(1, new Object[] {Short.valueOf(A2763AlbHdrUlin), A40AlbProRec, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPALBTXT

      */
      A396EmprCod = AV8emprcod ;
      A30AlbProCod = AV9albprocod ;
      A129BarCod = AV10barcod ;
      A132BarCodReo = AV11barcodreo ;
      A2764AlbHdrLin = AV15AlbHdrUlin ;
      A2765AlbHdrTxt = GXutil.substring( AV16contdsc2, 1, 30) ;
      A2767AlbHdrPKg = AV14AlbProRec ;
      A2768AlbHdrKgs = AV13BarAlbKgmE ;
      A2766AlbHdrRD = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2771ALbHdrImp = DecimalUtil.ZERO ;
      A2772AlbHdrTip = "" ;
      A3614AlbTxtCod = "" ;
      A5343AlbHdrPzs = (short)(0) ;
      n5343AlbHdrPzs = false ;
      /* Using cursor P09QA4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin), A2765AlbHdrTxt, A2766AlbHdrRD, A2767AlbHdrPKg, A2768AlbHdrKgs, A2769AlbHdrPMt, A2770ALbHdrMts, A2771ALbHdrImp, A2772AlbHdrTip, A3614AlbTxtCod, Boolean.valueOf(n5343AlbHdrPzs), Short.valueOf(A5343AlbHdrPzs)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
      if ( (pr_default.getStatus(2) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsalbtxt.this.AV8emprcod;
      this.aP1[0] = pinsalbtxt.this.AV9albprocod;
      this.aP2[0] = pinsalbtxt.this.AV10barcod;
      this.aP3[0] = pinsalbtxt.this.AV11barcodreo;
      this.aP4[0] = pinsalbtxt.this.AV12barcodpar;
      this.aP5[0] = pinsalbtxt.this.AV13BarAlbKgmE;
      this.aP6[0] = pinsalbtxt.this.AV14AlbProRec;
      this.aP7[0] = pinsalbtxt.this.AV17usurcod;
      this.aP8[0] = pinsalbtxt.this.AV18station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinsalbtxt");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16contdsc2 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P09QA2_A130BarCodPar = new String[] {""} ;
      P09QA2_A132BarCodReo = new byte[1] ;
      P09QA2_A129BarCod = new int[1] ;
      P09QA2_A30AlbProCod = new long[1] ;
      P09QA2_A396EmprCod = new String[] {""} ;
      P09QA2_A2763AlbHdrUlin = new short[1] ;
      P09QA2_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A40AlbProRec = DecimalUtil.ZERO ;
      AV19inc_obs = "" ;
      AV23Pgmname = "" ;
      A2765AlbHdrTxt = "" ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2766AlbHdrRD = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2771ALbHdrImp = DecimalUtil.ZERO ;
      A2772AlbHdrTip = "" ;
      A3614AlbTxtCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinsalbtxt__default(),
         new Object[] {
             new Object[] {
            P09QA2_A130BarCodPar, P09QA2_A132BarCodReo, P09QA2_A129BarCod, P09QA2_A30AlbProCod, P09QA2_A396EmprCod, P09QA2_A2763AlbHdrUlin, P09QA2_A40AlbProRec
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV23Pgmname = "PinsALBTXT" ;
      /* GeneXus formulas. */
      AV23Pgmname = "PinsALBTXT" ;
      Gx_err = (short)(0) ;
   }

   private byte AV11barcodreo ;
   private byte A132BarCodReo ;
   private short A2763AlbHdrUlin ;
   private short AV15AlbHdrUlin ;
   private short A2764AlbHdrLin ;
   private short A5343AlbHdrPzs ;
   private short Gx_err ;
   private int AV10barcod ;
   private int A129BarCod ;
   private int GX_INS402 ;
   private long AV9albprocod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV13BarAlbKgmE ;
   private java.math.BigDecimal AV14AlbProRec ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal A2766AlbHdrRD ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2771ALbHdrImp ;
   private String AV8emprcod ;
   private String AV12barcodpar ;
   private String AV17usurcod ;
   private String AV18station ;
   private String AV16contdsc2 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV23Pgmname ;
   private String A2765AlbHdrTxt ;
   private String A2772AlbHdrTip ;
   private String A3614AlbTxtCod ;
   private String Gx_emsg ;
   private boolean n5343AlbHdrPzs ;
   private String AV19inc_obs ;
   private String[] aP8 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P09QA2_A130BarCodPar ;
   private byte[] P09QA2_A132BarCodReo ;
   private int[] P09QA2_A129BarCod ;
   private long[] P09QA2_A30AlbProCod ;
   private String[] P09QA2_A396EmprCod ;
   private short[] P09QA2_A2763AlbHdrUlin ;
   private java.math.BigDecimal[] P09QA2_A40AlbProRec ;
}

final  class pinsalbtxt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QA2", "SELECT BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod, AlbHdrUlin, AlbProRec FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09QA3", "UPDATE TXPALBBAR SET AlbHdrUlin=?, AlbProRec=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P09QA4", "INSERT INTO TXPALBTXT(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin, AlbHdrTxt, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, ALbHdrImp, AlbHdrTip, AlbTxtCod, AlbHdrPzs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTXT")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 30);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 6);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[16]).shortValue());
               }
               return;
      }
   }

}

