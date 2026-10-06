package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcoptxt extends GXProcedure
{
   public pcoptxt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcoptxt.class ), "" );
   }

   public pcoptxt( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pcoptxt.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pcoptxt.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcoptxt.this.AV15AlbProCod = aP1[0];
      this.aP1 = aP1;
      pcoptxt.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      pcoptxt.this.AV17BarCodReo = aP3[0];
      this.aP3 = aP3;
      pcoptxt.this.AV18BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33Kgs_alb = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01FT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01FT2_A130BarCodPar[0] ;
         A132BarCodReo = P01FT2_A132BarCodReo[0] ;
         A129BarCod = P01FT2_A129BarCod[0] ;
         A30AlbProCod = P01FT2_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P01FT2_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P01FT2_A1265BarAlbPie[0] ;
         AV33Kgs_alb = A1261BarAlbKgmE ;
         AV35Pzs_alb = (short)(A1265BarAlbPie) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV34Lin_tp = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P01FT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      cV34Lin_tp = P01FT3_AV34Lin_tp[0] ;
      pr_default.close(1);
      AV34Lin_tp = (short)(AV34Lin_tp+cV34Lin_tp*1) ;
      /* End optimized group. */
      if ( AV34Lin_tp > 1 )
      {
         AV33Kgs_alb = DecimalUtil.doubleToDec(0) ;
         AV35Pzs_alb = (short)(0) ;
      }
      AV20LinFas = (short)(1) ;
      /* Using cursor P01FT4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A44AlbRecCod = P01FT4_A44AlbRecCod[0] ;
         A4295ClasCod = P01FT4_A4295ClasCod[0] ;
         n4295ClasCod = P01FT4_n4295ClasCod[0] ;
         A130BarCodPar = P01FT4_A130BarCodPar[0] ;
         A132BarCodReo = P01FT4_A132BarCodReo[0] ;
         A129BarCod = P01FT4_A129BarCod[0] ;
         A4296ClasDsc = P01FT4_A4296ClasDsc[0] ;
         n4296ClasDsc = P01FT4_n4296ClasDsc[0] ;
         A200BarPieCod = P01FT4_A200BarPieCod[0] ;
         A4295ClasCod = P01FT4_A4295ClasCod[0] ;
         n4295ClasCod = P01FT4_n4295ClasCod[0] ;
         A4296ClasDsc = P01FT4_A4296ClasDsc[0] ;
         n4296ClasDsc = P01FT4_n4296ClasDsc[0] ;
         AV32ClasDsc = A4296ClasDsc ;
         /*
            INSERT RECORD ON TABLE TXPALBTXT

         */
         A30AlbProCod = AV15AlbProCod ;
         A2764AlbHdrLin = AV20LinFas ;
         A2765AlbHdrTxt = AV32ClasDsc ;
         A2766AlbHdrRD = DecimalUtil.doubleToDec(0) ;
         A2767AlbHdrPKg = DecimalUtil.doubleToDec(0) ;
         A2768AlbHdrKgs = AV33Kgs_alb ;
         A2769AlbHdrPMt = DecimalUtil.doubleToDec(0) ;
         A2770ALbHdrMts = DecimalUtil.doubleToDec(0) ;
         A2771ALbHdrImp = DecimalUtil.doubleToDec(0) ;
         A2772AlbHdrTip = GXutil.space( (short)(1)) ;
         A3614AlbTxtCod = GXutil.space( (short)(6)) ;
         A5343AlbHdrPzs = AV35Pzs_alb ;
         n5343AlbHdrPzs = false ;
         /* Using cursor P01FT5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin), A2765AlbHdrTxt, A2766AlbHdrRD, A2767AlbHdrPKg, A2768AlbHdrKgs, A2769AlbHdrPMt, A2770ALbHdrMts, A2771ALbHdrImp, A2772AlbHdrTip, A3614AlbTxtCod, Boolean.valueOf(n5343AlbHdrPzs), Short.valueOf(A5343AlbHdrPzs)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
         if ( (pr_default.getStatus(3) == 1) )
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
         AV20LinFas = (short)(AV20LinFas+1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Optimized UPDATE. */
      /* Using cursor P01FT6 */
      pr_default.execute(4, new Object[] {Short.valueOf(AV20LinFas), A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
      /* End optimized UPDATE. */
      if ( AV34Lin_tp > 1 )
      {
         httpContext.wjLoc = formatLink("app.ttxtlav", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV18BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcoptxt.this.A396EmprCod;
      this.aP1[0] = pcoptxt.this.AV15AlbProCod;
      this.aP2[0] = pcoptxt.this.AV16BarCod;
      this.aP3[0] = pcoptxt.this.AV17BarCodReo;
      this.aP4[0] = pcoptxt.this.AV18BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcoptxt");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33Kgs_alb = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01FT2_A396EmprCod = new String[] {""} ;
      P01FT2_A130BarCodPar = new String[] {""} ;
      P01FT2_A132BarCodReo = new byte[1] ;
      P01FT2_A129BarCod = new int[1] ;
      P01FT2_A30AlbProCod = new long[1] ;
      P01FT2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FT2_A1265BarAlbPie = new int[1] ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P01FT3_AV34Lin_tp = new short[1] ;
      P01FT4_A44AlbRecCod = new int[1] ;
      P01FT4_A4295ClasCod = new short[1] ;
      P01FT4_n4295ClasCod = new boolean[] {false} ;
      P01FT4_A396EmprCod = new String[] {""} ;
      P01FT4_A130BarCodPar = new String[] {""} ;
      P01FT4_A132BarCodReo = new byte[1] ;
      P01FT4_A129BarCod = new int[1] ;
      P01FT4_A4296ClasDsc = new String[] {""} ;
      P01FT4_n4296ClasDsc = new boolean[] {false} ;
      P01FT4_A200BarPieCod = new String[] {""} ;
      A4296ClasDsc = "" ;
      A200BarPieCod = "" ;
      AV32ClasDsc = "" ;
      A2765AlbHdrTxt = "" ;
      A2766AlbHdrRD = DecimalUtil.ZERO ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2771ALbHdrImp = DecimalUtil.ZERO ;
      A2772AlbHdrTip = "" ;
      A3614AlbTxtCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcoptxt__default(),
         new Object[] {
             new Object[] {
            P01FT2_A396EmprCod, P01FT2_A130BarCodPar, P01FT2_A132BarCodReo, P01FT2_A129BarCod, P01FT2_A30AlbProCod, P01FT2_A1261BarAlbKgmE, P01FT2_A1265BarAlbPie
            }
            , new Object[] {
            P01FT3_AV34Lin_tp
            }
            , new Object[] {
            P01FT4_A44AlbRecCod, P01FT4_A4295ClasCod, P01FT4_n4295ClasCod, P01FT4_A396EmprCod, P01FT4_A130BarCodPar, P01FT4_A132BarCodReo, P01FT4_A129BarCod, P01FT4_A4296ClasDsc, P01FT4_n4296ClasDsc, P01FT4_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte A132BarCodReo ;
   private short AV35Pzs_alb ;
   private short AV34Lin_tp ;
   private short cV34Lin_tp ;
   private short AV20LinFas ;
   private short A4295ClasCod ;
   private short A2764AlbHdrLin ;
   private short A5343AlbHdrPzs ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A44AlbRecCod ;
   private int GX_INS402 ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV33Kgs_alb ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A2766AlbHdrRD ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2771ALbHdrImp ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A4296ClasDsc ;
   private String A200BarPieCod ;
   private String AV32ClasDsc ;
   private String A2765AlbHdrTxt ;
   private String A2772AlbHdrTip ;
   private String A3614AlbTxtCod ;
   private String Gx_emsg ;
   private boolean n4295ClasCod ;
   private boolean n4296ClasDsc ;
   private boolean n5343AlbHdrPzs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01FT2_A396EmprCod ;
   private String[] P01FT2_A130BarCodPar ;
   private byte[] P01FT2_A132BarCodReo ;
   private int[] P01FT2_A129BarCod ;
   private long[] P01FT2_A30AlbProCod ;
   private java.math.BigDecimal[] P01FT2_A1261BarAlbKgmE ;
   private int[] P01FT2_A1265BarAlbPie ;
   private short[] P01FT3_AV34Lin_tp ;
   private int[] P01FT4_A44AlbRecCod ;
   private short[] P01FT4_A4295ClasCod ;
   private boolean[] P01FT4_n4295ClasCod ;
   private String[] P01FT4_A396EmprCod ;
   private String[] P01FT4_A130BarCodPar ;
   private byte[] P01FT4_A132BarCodReo ;
   private int[] P01FT4_A129BarCod ;
   private String[] P01FT4_A4296ClasDsc ;
   private boolean[] P01FT4_n4296ClasDsc ;
   private String[] P01FT4_A200BarPieCod ;
}

final  class pcoptxt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01FT2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod, BarAlbKgmE, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01FT3", "SELECT COUNT(*) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01FT4", "SELECT T1.AlbRecCod, T2.ClasCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T3.ClasDsc, T1.BarPieCod FROM ((TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLAPEN T3 ON T3.EmprCod = T1.EmprCod AND T3.ClasCod = T2.ClasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01FT5", "INSERT INTO TXPALBTXT(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin, AlbHdrTxt, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, ALbHdrImp, AlbHdrTip, AlbTxtCod, AlbHdrPzs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTXT")
         ,new UpdateCursor("P01FT6", "UPDATE TXPALBBAR SET AlbHdrUlin=? - 1  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 9);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
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
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

