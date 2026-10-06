package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmovpar extends GXProcedure
{
   public pmovpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmovpar.class ), "" );
   }

   public pmovpar( int remoteHandle ,
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
      pmovpar.this.aP9 = new java.util.Date[] {GXutil.nullDate()};
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
      pmovpar.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pmovpar.this.AV16PartCod = aP1[0];
      this.aP1 = aP1;
      pmovpar.this.AV17CliCod = aP2[0];
      this.aP2 = aP2;
      pmovpar.this.AV18PartAlbDis = aP3[0];
      this.aP3 = aP3;
      pmovpar.this.AV19ActCon = aP4[0];
      this.aP4 = aP4;
      pmovpar.this.AV20ActKgm = aP5[0];
      this.aP5 = aP5;
      pmovpar.this.AV21PartTipLin = aP6[0];
      this.aP6 = aP6;
      pmovpar.this.AV22DisColNom = aP7[0];
      this.aP7 = aP7;
      pmovpar.this.AV23DisColNum = aP8[0];
      this.aP8 = aP8;
      pmovpar.this.AV24PartFecMov = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29FlagBros = (byte)(0) ;
      GXv_int1[0] = AV29FlagBros ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "BROS  ", ""), GXv_int1) ;
      pmovpar.this.AV29FlagBros = GXv_int1[0] ;
      AV30FlagMag = (byte)(0) ;
      GXv_int1[0] = AV30FlagMag ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int1) ;
      pmovpar.this.AV30FlagMag = GXv_int1[0] ;
      AV32FlagSalt = (byte)(0) ;
      GXv_int1[0] = AV32FlagSalt ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SALTIN", ""), GXv_int1) ;
      pmovpar.this.AV32FlagSalt = GXv_int1[0] ;
      AV33Pervaf = (byte)(0) ;
      GXv_int1[0] = AV33Pervaf ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int1) ;
      pmovpar.this.AV33Pervaf = GXv_int1[0] ;
      if ( AV30FlagMag == 1 )
      {
         GXv_char2[0] = AV15EmprCod ;
         GXv_char3[0] = AV16PartCod ;
         GXv_int4[0] = AV17CliCod ;
         GXv_int5[0] = AV18PartAlbDis ;
         GXv_int6[0] = AV19ActCon ;
         GXv_decimal7[0] = AV20ActKgm ;
         GXv_char8[0] = AV21PartTipLin ;
         GXv_char9[0] = AV22DisColNom ;
         GXv_int10[0] = AV23DisColNum ;
         GXv_date11[0] = AV24PartFecMov ;
         new app.pmovpar2(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4, GXv_int5, GXv_int6, GXv_decimal7, GXv_char8, GXv_char9, GXv_int10, GXv_date11) ;
         pmovpar.this.AV15EmprCod = GXv_char2[0] ;
         pmovpar.this.AV16PartCod = GXv_char3[0] ;
         pmovpar.this.AV17CliCod = GXv_int4[0] ;
         pmovpar.this.AV18PartAlbDis = GXv_int5[0] ;
         pmovpar.this.AV19ActCon = GXv_int6[0] ;
         pmovpar.this.AV20ActKgm = GXv_decimal7[0] ;
         pmovpar.this.AV21PartTipLin = GXv_char8[0] ;
         pmovpar.this.AV22DisColNom = GXv_char9[0] ;
         pmovpar.this.AV23DisColNum = GXv_int10[0] ;
         pmovpar.this.AV24PartFecMov = GXv_date11[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV26DisRes = httpContext.getMessage( "N", "") ;
      AV27DispCli = "" ;
      if ( ( GXutil.strcmp(AV21PartTipLin, httpContext.getMessage( "B", "")) == 0 ) || ( GXutil.strcmp(AV21PartTipLin, httpContext.getMessage( "R", "")) == 0 ) || ( GXutil.strcmp(AV21PartTipLin, httpContext.getMessage( "S", "")) == 0 ) )
      {
         /* Using cursor P006F2 */
         pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18PartAlbDis)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P006F2_A361DisCod[0] ;
            A396EmprCod = P006F2_A396EmprCod[0] ;
            A1968DisRes = P006F2_A1968DisRes[0] ;
            n1968DisRes = P006F2_n1968DisRes[0] ;
            A360DisCliNum = P006F2_A360DisCliNum[0] ;
            A1002DisNumTen = P006F2_A1002DisNumTen[0] ;
            n1002DisNumTen = P006F2_n1002DisNumTen[0] ;
            A2009DisTipDis = P006F2_A2009DisTipDis[0] ;
            n2009DisTipDis = P006F2_n2009DisTipDis[0] ;
            AV26DisRes = A1968DisRes ;
            AV27DispCli = A360DisCliNum ;
            AV28DisNumTen = A1002DisNumTen ;
            AV31DisTipDis = A2009DisTipDis ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      /* Using cursor P006F3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, AV16PartCod, Integer.valueOf(AV17CliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A972PartULin = P006F3_A972PartULin[0] ;
         n972PartULin = P006F3_n972PartULin[0] ;
         A252CliCod = P006F3_A252CliCod[0] ;
         A966PartCod = P006F3_A966PartCod[0] ;
         A396EmprCod = P006F3_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W966PartCod = A966PartCod ;
         W252CliCod = A252CliCod ;
         if ( ( GXutil.strcmp(AV21PartTipLin, httpContext.getMessage( "B", "")) == 0 ) || ( GXutil.strcmp(AV21PartTipLin, httpContext.getMessage( "R", "")) == 0 ) )
         {
            /*
               INSERT RECORD ON TABLE TXPLPARTI

            */
            W396EmprCod = A396EmprCod ;
            W966PartCod = A966PartCod ;
            W252CliCod = A252CliCod ;
            A396EmprCod = AV15EmprCod ;
            A966PartCod = AV16PartCod ;
            A252CliCod = AV17CliCod ;
            A979PartLin = (int)(A972PartULin+1) ;
            A980PartLinTip = AV21PartTipLin ;
            n980PartLinTip = false ;
            A981PartAlbDis = AV18PartAlbDis ;
            n981PartAlbDis = false ;
            if ( ( AV29FlagBros == 1 ) || ( AV32FlagSalt == 1 ) )
            {
               A982PartSitDis = GXutil.concat( AV27DispCli, AV28DisNumTen, "/") ;
               n982PartSitDis = false ;
            }
            else
            {
               A982PartSitDis = GXutil.concat( AV22DisColNom, GXutil.str( AV23DisColNum, 6, 0), " / ") ;
               n982PartSitDis = false ;
            }
            if ( AV33Pervaf == 1 )
            {
               A982PartSitDis = httpContext.getMessage( "T. ", "") + AV28DisNumTen ;
               n982PartSitDis = false ;
            }
            A2246ParNumCli = AV27DispCli ;
            n2246ParNumCli = false ;
            if ( ( GXutil.strcmp(AV31DisTipDis, httpContext.getMessage( "P", "")) == 0 ) && ( AV30FlagMag == 1 ) )
            {
               A986KilUti = AV20ActKgm ;
               n986KilUti = false ;
               A987ConUti = AV19ActCon ;
               n987ConUti = false ;
            }
            else
            {
               if ( ( GXutil.strcmp(AV26DisRes, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(AV21PartTipLin, httpContext.getMessage( "R", "")) == 0 ) )
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
            /* Using cursor P006F4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin), Boolean.valueOf(n980PartLinTip), A980PartLinTip, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n983PartFecMov), A983PartFecMov, Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), Boolean.valueOf(n1966KilRes), A1966KilRes, Boolean.valueOf(n1967ConRes), Short.valueOf(A1967ConRes), Boolean.valueOf(n2246ParNumCli), A2246ParNumCli});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Cuidado, no se genero el movimiento del partido.", ""));
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A966PartCod = W966PartCod ;
            A252CliCod = W252CliCod ;
            /* End Insert */
         }
         else
         {
            /*
               INSERT RECORD ON TABLE TXPLPARTI

            */
            W396EmprCod = A396EmprCod ;
            W966PartCod = A966PartCod ;
            W252CliCod = A252CliCod ;
            A396EmprCod = AV15EmprCod ;
            A966PartCod = AV16PartCod ;
            A252CliCod = AV17CliCod ;
            A979PartLin = (int)(A972PartULin+1) ;
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
            /* Using cursor P006F5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin), Boolean.valueOf(n980PartLinTip), A980PartLinTip, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n983PartFecMov), A983PartFecMov, Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
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
            A396EmprCod = W396EmprCod ;
            A966PartCod = W966PartCod ;
            A252CliCod = W252CliCod ;
            /* End Insert */
         }
         A972PartULin = (int)(A972PartULin+1) ;
         n972PartULin = false ;
         /* Using cursor P006F6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n972PartULin), Integer.valueOf(A972PartULin), A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
         A396EmprCod = W396EmprCod ;
         A966PartCod = W966PartCod ;
         A252CliCod = W252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmovpar.this.AV15EmprCod;
      this.aP1[0] = pmovpar.this.AV16PartCod;
      this.aP2[0] = pmovpar.this.AV17CliCod;
      this.aP3[0] = pmovpar.this.AV18PartAlbDis;
      this.aP4[0] = pmovpar.this.AV19ActCon;
      this.aP5[0] = pmovpar.this.AV20ActKgm;
      this.aP6[0] = pmovpar.this.AV21PartTipLin;
      this.aP7[0] = pmovpar.this.AV22DisColNom;
      this.aP8[0] = pmovpar.this.AV23DisColNum;
      this.aP9[0] = pmovpar.this.AV24PartFecMov;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmovpar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new short[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_date11 = new java.util.Date[1] ;
      AV26DisRes = "" ;
      AV27DispCli = "" ;
      scmdbuf = "" ;
      P006F2_A361DisCod = new int[1] ;
      P006F2_A396EmprCod = new String[] {""} ;
      P006F2_A1968DisRes = new String[] {""} ;
      P006F2_n1968DisRes = new boolean[] {false} ;
      P006F2_A360DisCliNum = new String[] {""} ;
      P006F2_A1002DisNumTen = new String[] {""} ;
      P006F2_n1002DisNumTen = new boolean[] {false} ;
      P006F2_A2009DisTipDis = new String[] {""} ;
      P006F2_n2009DisTipDis = new boolean[] {false} ;
      A396EmprCod = "" ;
      A1968DisRes = "" ;
      A360DisCliNum = "" ;
      A1002DisNumTen = "" ;
      A2009DisTipDis = "" ;
      AV28DisNumTen = "" ;
      AV31DisTipDis = "" ;
      P006F3_A972PartULin = new int[1] ;
      P006F3_n972PartULin = new boolean[] {false} ;
      P006F3_A252CliCod = new int[1] ;
      P006F3_A966PartCod = new String[] {""} ;
      P006F3_A396EmprCod = new String[] {""} ;
      A966PartCod = "" ;
      W396EmprCod = "" ;
      W966PartCod = "" ;
      A980PartLinTip = "" ;
      A982PartSitDis = "" ;
      A2246ParNumCli = "" ;
      A986KilUti = DecimalUtil.ZERO ;
      A1966KilRes = DecimalUtil.ZERO ;
      A983PartFecMov = GXutil.nullDate() ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmovpar__default(),
         new Object[] {
             new Object[] {
            P006F2_A361DisCod, P006F2_A396EmprCod, P006F2_A1968DisRes, P006F2_n1968DisRes, P006F2_A360DisCliNum, P006F2_A1002DisNumTen, P006F2_n1002DisNumTen, P006F2_A2009DisTipDis, P006F2_n2009DisTipDis
            }
            , new Object[] {
            P006F3_A972PartULin, P006F3_n972PartULin, P006F3_A252CliCod, P006F3_A966PartCod, P006F3_A396EmprCod
            }
            , new Object[] {
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

   private byte AV29FlagBros ;
   private byte AV30FlagMag ;
   private byte AV32FlagSalt ;
   private byte AV33Pervaf ;
   private byte GXv_int1[] ;
   private short AV19ActCon ;
   private short GXv_int6[] ;
   private short A987ConUti ;
   private short A1967ConRes ;
   private short Gx_err ;
   private int AV17CliCod ;
   private int AV18PartAlbDis ;
   private int AV23DisColNum ;
   private int GXv_int4[] ;
   private int GXv_int5[] ;
   private int GXv_int10[] ;
   private int A361DisCod ;
   private int A972PartULin ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS208 ;
   private int A979PartLin ;
   private int A981PartAlbDis ;
   private java.math.BigDecimal AV20ActKgm ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal A986KilUti ;
   private java.math.BigDecimal A1966KilRes ;
   private String AV15EmprCod ;
   private String AV16PartCod ;
   private String AV21PartTipLin ;
   private String AV22DisColNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
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
   private String W396EmprCod ;
   private String W966PartCod ;
   private String A980PartLinTip ;
   private String A982PartSitDis ;
   private String A2246ParNumCli ;
   private String Gx_emsg ;
   private java.util.Date AV24PartFecMov ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date A983PartFecMov ;
   private boolean returnInSub ;
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
   private int[] P006F2_A361DisCod ;
   private String[] P006F2_A396EmprCod ;
   private String[] P006F2_A1968DisRes ;
   private boolean[] P006F2_n1968DisRes ;
   private String[] P006F2_A360DisCliNum ;
   private String[] P006F2_A1002DisNumTen ;
   private boolean[] P006F2_n1002DisNumTen ;
   private String[] P006F2_A2009DisTipDis ;
   private boolean[] P006F2_n2009DisTipDis ;
   private int[] P006F3_A972PartULin ;
   private boolean[] P006F3_n972PartULin ;
   private int[] P006F3_A252CliCod ;
   private String[] P006F3_A966PartCod ;
   private String[] P006F3_A396EmprCod ;
}

final  class pmovpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006F2", "SELECT DisCod, EmprCod, DisRes, DisCliNum, DisNumTen, DisTipDis FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006F3", "SELECT PartULin, CliCod, PartCod, EmprCod FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P006F4", "INSERT INTO TXPLPARTI(EmprCod, PartCod, CliCod, PartLin, PartLinTip, PartAlbDis, PartSitDis, PartFecMov, KilUti, ConUti, KilRes, ConRes, ParNumCli, TrnCod, KilEnt, ConEnt, PartLoc, PartPesCo, PartDm, ParPorAgu, TipConCod, ParExtLin, PartLinUni, PartPalUti, PartPalEst, PartCja, PartTarCja, PartTarPal, PartSts, PartFcEv, PartHhEv, PartTrz, PartFm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P006F5", "INSERT INTO TXPLPARTI(EmprCod, PartCod, CliCod, PartLin, PartLinTip, PartAlbDis, PartSitDis, PartFecMov, KilUti, ConUti, TrnCod, KilEnt, ConEnt, PartLoc, KilRes, ConRes, PartPesCo, PartDm, ParPorAgu, TipConCod, ParNumCli, ParExtLin, PartLinUni, PartPalUti, PartPalEst, PartCja, PartTarCja, PartTarPal, PartSts, PartFcEv, PartHhEv, PartTrz, PartFm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P006F6", "UPDATE TXPCPARTI SET PartULin=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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

