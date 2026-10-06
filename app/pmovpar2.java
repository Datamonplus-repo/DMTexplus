package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmovpar2 extends GXProcedure
{
   public pmovpar2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmovpar2.class ), "" );
   }

   public pmovpar2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 ,
                                     int[] aP2 ,
                                     int[] aP3 ,
                                     short[] aP4 ,
                                     java.math.BigDecimal[] aP5 ,
                                     String[] aP6 ,
                                     String[] aP7 ,
                                     int[] aP8 )
   {
      pmovpar2.this.aP9 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        java.util.Date[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             java.util.Date[] aP9 )
   {
      pmovpar2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pmovpar2.this.AV16PartCod = aP1[0];
      this.aP1 = aP1;
      pmovpar2.this.AV17CliCod = aP2[0];
      this.aP2 = aP2;
      pmovpar2.this.AV18PartAlbDis = aP3[0];
      this.aP3 = aP3;
      pmovpar2.this.AV19ActCon = aP4[0];
      this.aP4 = aP4;
      pmovpar2.this.AV20ActKgm = aP5[0];
      this.aP5 = aP5;
      pmovpar2.this.AV21PartTipLin = aP6[0];
      this.aP6 = aP6;
      pmovpar2.this.AV22DisColNom = aP7[0];
      this.aP7 = aP7;
      pmovpar2.this.AV23DisColNum = aP8[0];
      this.aP8 = aP8;
      pmovpar2.this.AV24PartFecMov = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26DisRes = httpContext.getMessage( "N", "") ;
      AV27DispCli = "" ;
      if ( GXutil.strcmp(AV21PartTipLin, httpContext.getMessage( "B", "")) == 0 )
      {
         /* Using cursor P019M2 */
         pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18PartAlbDis)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P019M2_A361DisCod[0] ;
            A396EmprCod = P019M2_A396EmprCod[0] ;
            A367DisEst = P019M2_A367DisEst[0] ;
            A1968DisRes = P019M2_A1968DisRes[0] ;
            n1968DisRes = P019M2_n1968DisRes[0] ;
            A360DisCliNum = P019M2_A360DisCliNum[0] ;
            A1002DisNumTen = P019M2_A1002DisNumTen[0] ;
            n1002DisNumTen = P019M2_n1002DisNumTen[0] ;
            A2009DisTipDis = P019M2_A2009DisTipDis[0] ;
            n2009DisTipDis = P019M2_n2009DisTipDis[0] ;
            AV35DisEst = A367DisEst ;
            AV26DisRes = A1968DisRes ;
            AV27DispCli = A360DisCliNum ;
            AV28DisNumTen = A1002DisNumTen ;
            AV31DisTipDis = A2009DisTipDis ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      /* Using cursor P019M3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, AV16PartCod, Integer.valueOf(AV17CliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P019M3_A252CliCod[0] ;
         A966PartCod = P019M3_A966PartCod[0] ;
         A396EmprCod = P019M3_A396EmprCod[0] ;
         A972PartULin = P019M3_A972PartULin[0] ;
         n972PartULin = P019M3_n972PartULin[0] ;
         AV33PartULin = A972PartULin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV34OKNew = httpContext.getMessage( "N", "") ;
      while ( GXutil.strcmp(AV34OKNew, httpContext.getMessage( "N", "")) == 0 )
      {
         if ( AV33PartULin >= 999 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Partido llegó al máximo de líneas. REGULARICE", ""));
            if (true) break;
         }
         else
         {
            AV33PartULin = (int)(AV33PartULin+1) ;
            if ( GXutil.strcmp(AV21PartTipLin, httpContext.getMessage( "B", "")) == 0 )
            {
               /*
                  INSERT RECORD ON TABLE TXPLPARTI

               */
               A396EmprCod = AV15EmprCod ;
               A966PartCod = AV16PartCod ;
               A252CliCod = AV17CliCod ;
               A979PartLin = AV33PartULin ;
               A980PartLinTip = AV21PartTipLin ;
               n980PartLinTip = false ;
               A981PartAlbDis = AV18PartAlbDis ;
               n981PartAlbDis = false ;
               A982PartSitDis = GXutil.concat( AV22DisColNom, GXutil.str( AV23DisColNum, 6, 0), " / ") ;
               n982PartSitDis = false ;
               A2246ParNumCli = AV27DispCli ;
               n2246ParNumCli = false ;
               if ( GXutil.strcmp(AV31DisTipDis, httpContext.getMessage( "P", "")) == 0 )
               {
                  A986KilUti = AV20ActKgm ;
                  n986KilUti = false ;
                  A987ConUti = AV19ActCon ;
                  n987ConUti = false ;
               }
               else
               {
                  if ( ( GXutil.strcmp(AV26DisRes, httpContext.getMessage( "S", "")) == 0 ) || ( AV35DisEst == 1 ) )
                  {
                     A1966KilRes = AV20ActKgm ;
                     n1966KilRes = false ;
                     A1967ConRes = AV19ActCon ;
                     n1967ConRes = false ;
                  }
                  else
                  {
                     A986KilUti = AV20ActKgm ;
                     n986KilUti = false ;
                     A987ConUti = AV19ActCon ;
                     n987ConUti = false ;
                  }
               }
               if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24PartFecMov)) )
               {
                  A983PartFecMov = AV24PartFecMov ;
                  n983PartFecMov = false ;
               }
               AV34OKNew = httpContext.getMessage( "S", "") ;
               /* Using cursor P019M4 */
               pr_default.execute(2, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin), Boolean.valueOf(n980PartLinTip), A980PartLinTip, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n983PartFecMov), A983PartFecMov, Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), Boolean.valueOf(n1966KilRes), A1966KilRes, Boolean.valueOf(n1967ConRes), Short.valueOf(A1967ConRes), Boolean.valueOf(n2246ParNumCli), A2246ParNumCli});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
               if ( (pr_default.getStatus(2) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  AV34OKNew = httpContext.getMessage( "N", "") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
            }
            else
            {
               /*
                  INSERT RECORD ON TABLE TXPLPARTI

               */
               A396EmprCod = AV15EmprCod ;
               A966PartCod = AV16PartCod ;
               A252CliCod = AV17CliCod ;
               A979PartLin = AV33PartULin ;
               A980PartLinTip = httpContext.getMessage( "D", "") ;
               n980PartLinTip = false ;
               A981PartAlbDis = AV18PartAlbDis ;
               n981PartAlbDis = false ;
               A982PartSitDis = httpContext.getMessage( "DEVOLUCION DE GENERO", "") ;
               n982PartSitDis = false ;
               A986KilUti = AV20ActKgm ;
               n986KilUti = false ;
               A987ConUti = AV19ActCon ;
               n987ConUti = false ;
               if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24PartFecMov)) )
               {
                  A983PartFecMov = AV24PartFecMov ;
                  n983PartFecMov = false ;
               }
               AV34OKNew = httpContext.getMessage( "S", "") ;
               /* Using cursor P019M5 */
               pr_default.execute(3, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin), Boolean.valueOf(n980PartLinTip), A980PartLinTip, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n983PartFecMov), A983PartFecMov, Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
               if ( (pr_default.getStatus(3) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  AV34OKNew = httpContext.getMessage( "N", "") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
            }
         }
      }
      /* Using cursor P019M6 */
      pr_default.execute(4, new Object[] {AV15EmprCod, AV16PartCod, Integer.valueOf(AV17CliCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A252CliCod = P019M6_A252CliCod[0] ;
         A966PartCod = P019M6_A966PartCod[0] ;
         A396EmprCod = P019M6_A396EmprCod[0] ;
         A972PartULin = P019M6_A972PartULin[0] ;
         n972PartULin = P019M6_n972PartULin[0] ;
         if ( AV33PartULin > A972PartULin )
         {
            A972PartULin = AV33PartULin ;
            n972PartULin = false ;
         }
         /* Using cursor P019M7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n972PartULin), Integer.valueOf(A972PartULin), A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmovpar2.this.AV15EmprCod;
      this.aP1[0] = pmovpar2.this.AV16PartCod;
      this.aP2[0] = pmovpar2.this.AV17CliCod;
      this.aP3[0] = pmovpar2.this.AV18PartAlbDis;
      this.aP4[0] = pmovpar2.this.AV19ActCon;
      this.aP5[0] = pmovpar2.this.AV20ActKgm;
      this.aP6[0] = pmovpar2.this.AV21PartTipLin;
      this.aP7[0] = pmovpar2.this.AV22DisColNom;
      this.aP8[0] = pmovpar2.this.AV23DisColNum;
      this.aP9[0] = pmovpar2.this.AV24PartFecMov;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmovpar2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26DisRes = "" ;
      AV27DispCli = "" ;
      scmdbuf = "" ;
      P019M2_A361DisCod = new int[1] ;
      P019M2_A396EmprCod = new String[] {""} ;
      P019M2_A367DisEst = new byte[1] ;
      P019M2_A1968DisRes = new String[] {""} ;
      P019M2_n1968DisRes = new boolean[] {false} ;
      P019M2_A360DisCliNum = new String[] {""} ;
      P019M2_A1002DisNumTen = new String[] {""} ;
      P019M2_n1002DisNumTen = new boolean[] {false} ;
      P019M2_A2009DisTipDis = new String[] {""} ;
      P019M2_n2009DisTipDis = new boolean[] {false} ;
      A396EmprCod = "" ;
      A1968DisRes = "" ;
      A360DisCliNum = "" ;
      A1002DisNumTen = "" ;
      A2009DisTipDis = "" ;
      AV28DisNumTen = "" ;
      AV31DisTipDis = "" ;
      P019M3_A252CliCod = new int[1] ;
      P019M3_A966PartCod = new String[] {""} ;
      P019M3_A396EmprCod = new String[] {""} ;
      P019M3_A972PartULin = new int[1] ;
      P019M3_n972PartULin = new boolean[] {false} ;
      A966PartCod = "" ;
      AV34OKNew = "" ;
      A980PartLinTip = "" ;
      A982PartSitDis = "" ;
      A2246ParNumCli = "" ;
      A986KilUti = DecimalUtil.ZERO ;
      A1966KilRes = DecimalUtil.ZERO ;
      A983PartFecMov = GXutil.nullDate() ;
      Gx_emsg = "" ;
      P019M6_A252CliCod = new int[1] ;
      P019M6_A966PartCod = new String[] {""} ;
      P019M6_A396EmprCod = new String[] {""} ;
      P019M6_A972PartULin = new int[1] ;
      P019M6_n972PartULin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmovpar2__default(),
         new Object[] {
             new Object[] {
            P019M2_A361DisCod, P019M2_A396EmprCod, P019M2_A367DisEst, P019M2_A1968DisRes, P019M2_n1968DisRes, P019M2_A360DisCliNum, P019M2_A1002DisNumTen, P019M2_n1002DisNumTen, P019M2_A2009DisTipDis, P019M2_n2009DisTipDis
            }
            , new Object[] {
            P019M3_A252CliCod, P019M3_A966PartCod, P019M3_A396EmprCod, P019M3_A972PartULin, P019M3_n972PartULin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P019M6_A252CliCod, P019M6_A966PartCod, P019M6_A396EmprCod, P019M6_A972PartULin, P019M6_n972PartULin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A367DisEst ;
   private byte AV35DisEst ;
   private short AV19ActCon ;
   private short A987ConUti ;
   private short A1967ConRes ;
   private short Gx_err ;
   private int AV17CliCod ;
   private int AV18PartAlbDis ;
   private int AV23DisColNum ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A972PartULin ;
   private int AV33PartULin ;
   private int GX_INS208 ;
   private int A979PartLin ;
   private int A981PartAlbDis ;
   private java.math.BigDecimal AV20ActKgm ;
   private java.math.BigDecimal A986KilUti ;
   private java.math.BigDecimal A1966KilRes ;
   private String AV15EmprCod ;
   private String AV16PartCod ;
   private String AV21PartTipLin ;
   private String AV22DisColNom ;
   private String AV26DisRes ;
   private String AV27DispCli ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A1968DisRes ;
   private String A360DisCliNum ;
   private String A1002DisNumTen ;
   private String A2009DisTipDis ;
   private String AV28DisNumTen ;
   private String AV31DisTipDis ;
   private String A966PartCod ;
   private String AV34OKNew ;
   private String A980PartLinTip ;
   private String A982PartSitDis ;
   private String A2246ParNumCli ;
   private String Gx_emsg ;
   private java.util.Date AV24PartFecMov ;
   private java.util.Date A983PartFecMov ;
   private boolean n1968DisRes ;
   private boolean n1002DisNumTen ;
   private boolean n2009DisTipDis ;
   private boolean n972PartULin ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n982PartSitDis ;
   private boolean n2246ParNumCli ;
   private boolean n986KilUti ;
   private boolean n987ConUti ;
   private boolean n1966KilRes ;
   private boolean n1967ConRes ;
   private boolean n983PartFecMov ;
   private java.util.Date[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
   private IDataStoreProvider pr_default ;
   private int[] P019M2_A361DisCod ;
   private String[] P019M2_A396EmprCod ;
   private byte[] P019M2_A367DisEst ;
   private String[] P019M2_A1968DisRes ;
   private boolean[] P019M2_n1968DisRes ;
   private String[] P019M2_A360DisCliNum ;
   private String[] P019M2_A1002DisNumTen ;
   private boolean[] P019M2_n1002DisNumTen ;
   private String[] P019M2_A2009DisTipDis ;
   private boolean[] P019M2_n2009DisTipDis ;
   private int[] P019M3_A252CliCod ;
   private String[] P019M3_A966PartCod ;
   private String[] P019M3_A396EmprCod ;
   private int[] P019M3_A972PartULin ;
   private boolean[] P019M3_n972PartULin ;
   private int[] P019M6_A252CliCod ;
   private String[] P019M6_A966PartCod ;
   private String[] P019M6_A396EmprCod ;
   private int[] P019M6_A972PartULin ;
   private boolean[] P019M6_n972PartULin ;
}

final  class pmovpar2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P019M2", "SELECT DisCod, EmprCod, DisEst, DisRes, DisCliNum, DisNumTen, DisTipDis FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P019M3", "SELECT CliCod, PartCod, EmprCod, PartULin FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P019M4", "INSERT INTO TXPLPARTI(EmprCod, PartCod, CliCod, PartLin, PartLinTip, PartAlbDis, PartSitDis, PartFecMov, KilUti, ConUti, KilRes, ConRes, ParNumCli, TrnCod, KilEnt, ConEnt, PartLoc, PartPesCo, PartDm, ParPorAgu, TipConCod, ParExtLin, PartLinUni, PartPalUti, PartPalEst, PartCja, PartTarCja, PartTarPal, PartSts, PartFcEv, PartHhEv, PartTrz, PartFm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P019M5", "INSERT INTO TXPLPARTI(EmprCod, PartCod, CliCod, PartLin, PartLinTip, PartAlbDis, PartSitDis, PartFecMov, KilUti, ConUti, TrnCod, KilEnt, ConEnt, PartLoc, KilRes, ConRes, PartPesCo, PartDm, ParPorAgu, TipConCod, ParNumCli, ParExtLin, PartLinUni, PartPalUti, PartPalEst, PartCja, PartTarCja, PartTarPal, PartSts, PartFcEv, PartHhEv, PartTrz, PartFm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new ForEachCursor("P019M6", "SELECT CliCod, PartCod, EmprCod, PartULin FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P019M7", "UPDATE TXPCPARTI SET PartULin=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[21], 8);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

