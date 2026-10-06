package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptestrtm extends GXProcedure
{
   public ptestrtm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptestrtm.class ), "" );
   }

   public ptestrtm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      ptestrtm.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      ptestrtm.this.AV35Emprcod = aP0[0];
      this.aP0 = aP0;
      ptestrtm.this.AV32Barcod = aP1[0];
      this.aP1 = aP1;
      ptestrtm.this.AV33Barcodreo = aP2[0];
      this.aP2 = aP2;
      ptestrtm.this.AV34Barcodpar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV25ContKgs ;
      GXv_char2[0] = AV35Emprcod ;
      GXv_char3[0] = httpContext.getMessage( "RTMKGS", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      ptestrtm.this.AV35Emprcod = GXv_char2[0] ;
      ptestrtm.this.GXt_int1 = GXv_int4[0] ;
      AV25ContKgs = GXt_int1 ;
      AV26Kgs = DecimalUtil.doubleToDec(AV25ContKgs/ (double) (100)) ;
      GXt_int1 = AV27ContDias ;
      GXv_char3[0] = AV35Emprcod ;
      GXv_char2[0] = httpContext.getMessage( "RTMDIA", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4) ;
      ptestrtm.this.AV35Emprcod = GXv_char3[0] ;
      ptestrtm.this.GXt_int1 = GXv_int4[0] ;
      AV27ContDias = (short)(GXt_int1) ;
      AV24TestRtm = (byte)(0) ;
      /* Using cursor P04B83 */
      pr_default.execute(0, new Object[] {AV35Emprcod, Integer.valueOf(AV32Barcod), Byte.valueOf(AV33Barcodreo), AV34Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04B83_A130BarCodPar[0] ;
         A132BarCodReo = P04B83_A132BarCodReo[0] ;
         A129BarCod = P04B83_A129BarCod[0] ;
         A396EmprCod = P04B83_A396EmprCod[0] ;
         A252CliCod = P04B83_A252CliCod[0] ;
         n252CliCod = P04B83_n252CliCod[0] ;
         A212BarSer = P04B83_A212BarSer[0] ;
         A135BarColNom = P04B83_A135BarColNom[0] ;
         A136BarColNum = P04B83_A136BarColNum[0] ;
         A218BarTipCol = P04B83_A218BarTipCol[0] ;
         A2829BarProPer = P04B83_A2829BarProPer[0] ;
         A9775BarItem1 = P04B83_A9775BarItem1[0] ;
         A9776barItem2 = P04B83_A9776barItem2[0] ;
         A166BarKgm = P04B83_A166BarKgm[0] ;
         n166BarKgm = P04B83_n166BarKgm[0] ;
         A166BarKgm = P04B83_A166BarKgm[0] ;
         n166BarKgm = P04B83_n166BarKgm[0] ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A252CliCod ;
         GXv_char2[0] = A212BarSer ;
         GXv_char5[0] = A135BarColNom ;
         GXv_int6[0] = A136BarColNum ;
         GXv_int7[0] = A218BarTipCol ;
         GXv_int8[0] = AV22ForNumcol ;
         new app.pnformu(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char2, GXv_char5, GXv_int6, GXv_int7, GXv_int8) ;
         ptestrtm.this.A396EmprCod = GXv_char3[0] ;
         ptestrtm.this.A252CliCod = GXv_int4[0] ;
         ptestrtm.this.A212BarSer = GXv_char2[0] ;
         ptestrtm.this.A135BarColNom = GXv_char5[0] ;
         ptestrtm.this.A136BarColNum = GXv_int6[0] ;
         ptestrtm.this.A218BarTipCol = GXv_int7[0] ;
         ptestrtm.this.AV22ForNumcol = GXv_int8[0] ;
         /* Execute user subroutine: 'COLORANTES' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV24TestRtm > 0 ) && ( GXutil.strcmp(A2829BarProPer, " ") != 0 ) )
         {
            if ( ( DecimalUtil.compareTo(A166BarKgm, AV26Kgs) > 0 ) && ( AV25ContKgs > 0 ) )
            {
               AV24TestRtm = (byte)(AV24TestRtm+1) ;
               AV28FechCtrl = GXutil.dadd(GXutil.today( ),-((int)(AV27ContDias))) ;
               AV29Clicod = A252CliCod ;
               AV30BarcolNum = A136BarColNum ;
               /* Execute user subroutine: 'CONTROLOS' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV31Num_os == 1 )
               {
                  AV24TestRtm = (byte)(AV24TestRtm+1) ;
                  A9775BarItem1 = httpContext.getMessage( "TESTE RTM", "") ;
                  A9776barItem2 = AV23Prdrtm ;
               }
            }
            else
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               /* Using cursor P04B84 */
               pr_default.execute(1, new Object[] {A9775BarItem1, A9776barItem2, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
               if (true) break;
            }
         }
         /* Using cursor P04B85 */
         pr_default.execute(2, new Object[] {A9775BarItem1, A9776barItem2, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      /* Using cursor P04B86 */
      pr_default.execute(3, new Object[] {AV35Emprcod, Integer.valueOf(AV22ForNumcol)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A719PrdNum = P04B86_A719PrdNum[0] ;
         A486ForNumCol = P04B86_A486ForNumCol[0] ;
         A396EmprCod = P04B86_A396EmprCod[0] ;
         A10935PrdRTM = P04B86_A10935PrdRTM[0] ;
         A309ColLin = P04B86_A309ColLin[0] ;
         A10935PrdRTM = P04B86_A10935PrdRTM[0] ;
         AV23Prdrtm = A10935PrdRTM ;
         if ( GXutil.strcmp(A10935PrdRTM, " ") != 0 )
         {
            AV24TestRtm = (byte)(AV24TestRtm+1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S121( )
   {
      /* 'CONTROLOS' Routine */
      returnInSub = false ;
      AV31Num_os = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P04B87 */
      pr_default.execute(4, new Object[] {AV35Emprcod, Integer.valueOf(AV29Clicod), AV28FechCtrl, Integer.valueOf(AV30BarcolNum)});
      cV31Num_os = P04B87_AV31Num_os[0] ;
      pr_default.close(4);
      AV31Num_os = (short)(AV31Num_os+cV31Num_os*1) ;
      /* End optimized group. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptestrtm.this.AV35Emprcod;
      this.aP1[0] = ptestrtm.this.AV32Barcod;
      this.aP2[0] = ptestrtm.this.AV33Barcodreo;
      this.aP3[0] = ptestrtm.this.AV34Barcodpar;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptestrtm");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26Kgs = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P04B83_A130BarCodPar = new String[] {""} ;
      P04B83_A132BarCodReo = new byte[1] ;
      P04B83_A129BarCod = new int[1] ;
      P04B83_A396EmprCod = new String[] {""} ;
      P04B83_A252CliCod = new int[1] ;
      P04B83_n252CliCod = new boolean[] {false} ;
      P04B83_A212BarSer = new String[] {""} ;
      P04B83_A135BarColNom = new String[] {""} ;
      P04B83_A136BarColNum = new int[1] ;
      P04B83_A218BarTipCol = new byte[1] ;
      P04B83_A2829BarProPer = new String[] {""} ;
      P04B83_A9775BarItem1 = new String[] {""} ;
      P04B83_A9776barItem2 = new String[] {""} ;
      P04B83_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04B83_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A2829BarProPer = "" ;
      A9775BarItem1 = "" ;
      A9776barItem2 = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new int[1] ;
      AV28FechCtrl = GXutil.nullDate() ;
      AV23Prdrtm = "" ;
      P04B86_A719PrdNum = new String[] {""} ;
      P04B86_A486ForNumCol = new int[1] ;
      P04B86_A396EmprCod = new String[] {""} ;
      P04B86_A10935PrdRTM = new String[] {""} ;
      P04B86_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A10935PrdRTM = "" ;
      P04B87_AV31Num_os = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptestrtm__default(),
         new Object[] {
             new Object[] {
            P04B83_A130BarCodPar, P04B83_A132BarCodReo, P04B83_A129BarCod, P04B83_A396EmprCod, P04B83_A252CliCod, P04B83_n252CliCod, P04B83_A212BarSer, P04B83_A135BarColNom, P04B83_A136BarColNum, P04B83_A218BarTipCol,
            P04B83_A2829BarProPer, P04B83_A9775BarItem1, P04B83_A9776barItem2, P04B83_A166BarKgm, P04B83_n166BarKgm
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04B86_A719PrdNum, P04B86_A486ForNumCol, P04B86_A396EmprCod, P04B86_A10935PrdRTM, P04B86_A309ColLin
            }
            , new Object[] {
            P04B87_AV31Num_os
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV33Barcodreo ;
   private byte AV24TestRtm ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte GXv_int7[] ;
   private short AV27ContDias ;
   private short AV31Num_os ;
   private short A309ColLin ;
   private short cV31Num_os ;
   private short Gx_err ;
   private int AV32Barcod ;
   private int AV25ContKgs ;
   private int GXt_int1 ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int GXv_int4[] ;
   private int GXv_int6[] ;
   private int AV22ForNumcol ;
   private int GXv_int8[] ;
   private int AV29Clicod ;
   private int AV30BarcolNum ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV26Kgs ;
   private java.math.BigDecimal A166BarKgm ;
   private String AV35Emprcod ;
   private String AV34Barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A2829BarProPer ;
   private String A9775BarItem1 ;
   private String A9776barItem2 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String AV23Prdrtm ;
   private String A719PrdNum ;
   private String A10935PrdRTM ;
   private java.util.Date AV28FechCtrl ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04B83_A130BarCodPar ;
   private byte[] P04B83_A132BarCodReo ;
   private int[] P04B83_A129BarCod ;
   private String[] P04B83_A396EmprCod ;
   private int[] P04B83_A252CliCod ;
   private boolean[] P04B83_n252CliCod ;
   private String[] P04B83_A212BarSer ;
   private String[] P04B83_A135BarColNom ;
   private int[] P04B83_A136BarColNum ;
   private byte[] P04B83_A218BarTipCol ;
   private String[] P04B83_A2829BarProPer ;
   private String[] P04B83_A9775BarItem1 ;
   private String[] P04B83_A9776barItem2 ;
   private java.math.BigDecimal[] P04B83_A166BarKgm ;
   private boolean[] P04B83_n166BarKgm ;
   private String[] P04B86_A719PrdNum ;
   private int[] P04B86_A486ForNumCol ;
   private String[] P04B86_A396EmprCod ;
   private String[] P04B86_A10935PrdRTM ;
   private short[] P04B86_A309ColLin ;
   private short[] P04B87_AV31Num_os ;
}

final  class ptestrtm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04B83", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarProPer, T1.BarItem1, T1.barItem2, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04B84", "UPDATE TXPBARCAD SET BarItem1=?, barItem2=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P04B85", "UPDATE TXPBARCAD SET BarItem1=?, barItem2=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P04B86", "SELECT T1.PrdNum, T1.ForNumCol, T1.EmprCod, T2.PrdRTM, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04B87", "SELECT COUNT(*) FROM TXPBARCAD WHERE (EmprCod = ? and CliCod = ? and BarFecGen >= ?) AND (BarColNum = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               ((String[]) buf[12])[0] = rslt.getString(12, 20);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

