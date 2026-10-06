package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcredi2 extends GXProcedure
{
   public pcredi2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcredi2.class ), "" );
   }

   public pcredi2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 )
   {
      pcredi2.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        int[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 ,
                             String[] aP14 )
   {
      pcredi2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pcredi2.this.AV16CliCod = aP1[0];
      this.aP1 = aP1;
      pcredi2.this.AV17ArtCod = aP2[0];
      this.aP2 = aP2;
      pcredi2.this.AV18Kilos = aP3[0];
      this.aP3 = aP3;
      pcredi2.this.AV19Piezas = aP4[0];
      this.aP4 = aP4;
      pcredi2.this.AV20ColorNom = aP5[0];
      this.aP5 = aP5;
      pcredi2.this.AV21ColorNum = aP6[0];
      this.aP6 = aP6;
      pcredi2.this.AV22Metros = aP7[0];
      this.aP7 = aP7;
      pcredi2.this.AV23TipCol = aP8[0];
      this.aP8 = aP8;
      pcredi2.this.AV24DisCliNum = aP9[0];
      this.aP9 = aP9;
      pcredi2.this.AV25DisPos = aP10[0];
      this.aP10 = aP10;
      pcredi2.this.AV26PriCod = aP11[0];
      this.aP11 = aP11;
      pcredi2.this.AV27PartCod = aP12[0];
      this.aP12 = aP12;
      pcredi2.this.AV28OpeAntCod = aP13[0];
      this.aP13 = aP13;
      pcredi2.this.AV29OpeNMtr = aP14[0];
      this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV26PriCod, "0") == 0 )
      {
         AV36ContCod = "020200" ;
      }
      else
      {
         AV36ContCod = "021200" ;
      }
      GXv_int1[0] = AV30DisCod ;
      new app.pnumdoc(remoteHandle, context).execute( AV15EmprCod, AV36ContCod, GXv_int1) ;
      pcredi2.this.AV30DisCod = GXv_int1[0] ;
      AV25DisPos = AV30DisCod ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_int1[0] = AV30DisCod ;
      GXv_char3[0] = AV17ArtCod ;
      GXv_int4[0] = AV16CliCod ;
      new app.pbuspro(remoteHandle, context).execute( GXv_char2, GXv_int1, GXv_char3, GXv_int4) ;
      pcredi2.this.AV15EmprCod = GXv_char2[0] ;
      pcredi2.this.AV30DisCod = GXv_int1[0] ;
      pcredi2.this.AV17ArtCod = GXv_char3[0] ;
      pcredi2.this.AV16CliCod = GXv_int4[0] ;
      /* Using cursor P00ED2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliCod), AV17ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P00ED2_A65ArtCod[0] ;
         A252CliCod = P00ED2_A252CliCod[0] ;
         A396EmprCod = P00ED2_A396EmprCod[0] ;
         A69ArtDsc = P00ED2_A69ArtDsc[0] ;
         n69ArtDsc = P00ED2_n69ArtDsc[0] ;
         A829TipArtCod = P00ED2_A829TipArtCod[0] ;
         A105ArtTra1 = P00ED2_A105ArtTra1[0] ;
         n105ArtTra1 = P00ED2_n105ArtTra1[0] ;
         A106ArtTra2 = P00ED2_A106ArtTra2[0] ;
         n106ArtTra2 = P00ED2_n106ArtTra2[0] ;
         A107ArtTra3 = P00ED2_A107ArtTra3[0] ;
         n107ArtTra3 = P00ED2_n107ArtTra3[0] ;
         A108ArtTraP1 = P00ED2_A108ArtTraP1[0] ;
         n108ArtTraP1 = P00ED2_n108ArtTraP1[0] ;
         A109ArtTraP2 = P00ED2_A109ArtTraP2[0] ;
         n109ArtTraP2 = P00ED2_n109ArtTraP2[0] ;
         A110ArtTraP3 = P00ED2_A110ArtTraP3[0] ;
         n110ArtTraP3 = P00ED2_n110ArtTraP3[0] ;
         A111ArtUrd1 = P00ED2_A111ArtUrd1[0] ;
         n111ArtUrd1 = P00ED2_n111ArtUrd1[0] ;
         A112ArtUrd2 = P00ED2_A112ArtUrd2[0] ;
         n112ArtUrd2 = P00ED2_n112ArtUrd2[0] ;
         A113ArtUrd3 = P00ED2_A113ArtUrd3[0] ;
         n113ArtUrd3 = P00ED2_n113ArtUrd3[0] ;
         A114ArtUrdP1 = P00ED2_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P00ED2_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = P00ED2_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P00ED2_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = P00ED2_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P00ED2_n116ArtUrdP3[0] ;
         A967ArtNMtr = P00ED2_A967ArtNMtr[0] ;
         n967ArtNMtr = P00ED2_n967ArtNMtr[0] ;
         A87ArtMat = P00ED2_A87ArtMat[0] ;
         n87ArtMat = P00ED2_n87ArtMat[0] ;
         AV54DisArtDsc = A69ArtDsc ;
         AV38DisArtTip = A829TipArtCod ;
         AV39DisArtTr1 = A105ArtTra1 ;
         AV40DisArtTr2 = A106ArtTra2 ;
         AV41DisArtTr3 = A107ArtTra3 ;
         AV42DisArtPt1 = A108ArtTraP1 ;
         AV43DisArtPt2 = A109ArtTraP2 ;
         AV44DisArtPt3 = A110ArtTraP3 ;
         AV45DisArtUr1 = A111ArtUrd1 ;
         AV46DisArtUr2 = A112ArtUrd2 ;
         AV47DisArtUr3 = A113ArtUrd3 ;
         AV48DisArtPu1 = A114ArtUrdP1 ;
         AV49DisArtPu2 = A115ArtUrdP2 ;
         AV50DisArtPu3 = A116ArtUrdP3 ;
         AV51DisNMtr = A967ArtNMtr ;
         AV52DisArtMat = A87ArtMat ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPDISPOS

      */
      A396EmprCod = AV15EmprCod ;
      A361DisCod = AV25DisPos ;
      A252CliCod = AV16CliCod ;
      A757PriCod = AV26PriCod ;
      A335DisArtCod = AV17ArtCod ;
      A966PartCod = AV27PartCod ;
      n966PartCod = false ;
      A375DisNumUni = AV18Kilos ;
      A374DisNumPie = (short)(AV19Piezas) ;
      A392DisUniMed = httpContext.getMessage( "K", "") ;
      A362DisColNom = AV20ColorNom ;
      n362DisColNom = false ;
      A363DisColNum = AV21ColorNum ;
      n363DisColNum = false ;
      A369DisFec = Gx_date ;
      A390DisTipCol = AV23TipCol ;
      n390DisTipCol = false ;
      A360DisCliNum = AV24DisCliNum ;
      A367DisEst = (byte)(1) ;
      A337DisArtDsc = AV54DisArtDsc ;
      A352DisArtTip = AV38DisArtTip ;
      A353DisArtTr1 = AV39DisArtTr1 ;
      A354DisArtTr2 = AV40DisArtTr2 ;
      A355DisArtTr3 = AV41DisArtTr3 ;
      A344DisArtPt1 = AV42DisArtPt1 ;
      A345DisArtPt2 = AV43DisArtPt2 ;
      A346DisArtPt3 = AV44DisArtPt3 ;
      A356DisArtUr1 = AV45DisArtUr1 ;
      A357DisArtUr2 = AV46DisArtUr2 ;
      A358DisArtUr3 = AV47DisArtUr3 ;
      A347DisArtPu1 = AV48DisArtPu1 ;
      A348DisArtPu2 = AV49DisArtPu2 ;
      A349DisArtPu3 = AV50DisArtPu3 ;
      n349DisArtPu3 = false ;
      if ( GXutil.strcmp(AV29OpeNMtr, "") == 0 )
      {
         A998DisNMtr = AV51DisNMtr ;
      }
      else
      {
         A998DisNMtr = AV29OpeNMtr ;
      }
      A340DisArtMat = AV52DisArtMat ;
      A365DisDes = httpContext.getMessage( "N", "") ;
      A1968DisRes = httpContext.getMessage( "N", "") ;
      n1968DisRes = false ;
      A2403DisOpeAnt = AV28OpeAntCod ;
      n2403DisOpeAnt = false ;
      A2009DisTipDis = httpContext.getMessage( "A", "") ;
      n2009DisTipDis = false ;
      A1002DisNumTen = "" ;
      n1002DisNumTen = false ;
      A370DisFecCli = GXutil.nullDate() ;
      /* Using cursor P00ED3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A365DisDes, A335DisArtCod, Short.valueOf(A374DisNumPie), A375DisNumUni, A392DisUniMed, A757PriCod, A360DisCliNum, A370DisFecCli, A369DisFec, Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol), A337DisArtDsc, A340DisArtMat, Short.valueOf(A352DisArtTip), A353DisArtTr1, Short.valueOf(A344DisArtPt1), A354DisArtTr2, Short.valueOf(A345DisArtPt2), A355DisArtTr3, Short.valueOf(A346DisArtPt3), A356DisArtUr1, Short.valueOf(A347DisArtPu1), A357DisArtUr2, Short.valueOf(A348DisArtPu2), A358DisArtUr3, Boolean.valueOf(n349DisArtPu3), Short.valueOf(A349DisArtPu3), Byte.valueOf(A367DisEst), A998DisNMtr, Boolean.valueOf(n1002DisNumTen), A1002DisNumTen, Boolean.valueOf(n966PartCod), A966PartCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n1968DisRes), A1968DisRes, Boolean.valueOf(n2009DisTipDis), A2009DisTipDis, Boolean.valueOf(n2403DisOpeAnt), Integer.valueOf(A2403DisOpeAnt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      if ( (pr_default.getStatus(1) == 1) )
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
      AV32MaqCod = "" ;
      GXv_char3[0] = AV15EmprCod ;
      GXv_int4[0] = AV25DisPos ;
      GXv_char2[0] = AV32MaqCod ;
      GXv_int5[0] = (byte)(0) ;
      new app.pgenbamh(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char2, GXv_int5) ;
      pcredi2.this.AV15EmprCod = GXv_char3[0] ;
      pcredi2.this.AV25DisPos = GXv_int4[0] ;
      pcredi2.this.AV32MaqCod = GXv_char2[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcredi2.this.AV15EmprCod;
      this.aP1[0] = pcredi2.this.AV16CliCod;
      this.aP2[0] = pcredi2.this.AV17ArtCod;
      this.aP3[0] = pcredi2.this.AV18Kilos;
      this.aP4[0] = pcredi2.this.AV19Piezas;
      this.aP5[0] = pcredi2.this.AV20ColorNom;
      this.aP6[0] = pcredi2.this.AV21ColorNum;
      this.aP7[0] = pcredi2.this.AV22Metros;
      this.aP8[0] = pcredi2.this.AV23TipCol;
      this.aP9[0] = pcredi2.this.AV24DisCliNum;
      this.aP10[0] = pcredi2.this.AV25DisPos;
      this.aP11[0] = pcredi2.this.AV26PriCod;
      this.aP12[0] = pcredi2.this.AV27PartCod;
      this.aP13[0] = pcredi2.this.AV28OpeAntCod;
      this.aP14[0] = pcredi2.this.AV29OpeNMtr;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcredi2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36ContCod = "" ;
      GXv_int1 = new int[1] ;
      scmdbuf = "" ;
      P00ED2_A65ArtCod = new String[] {""} ;
      P00ED2_A252CliCod = new int[1] ;
      P00ED2_A396EmprCod = new String[] {""} ;
      P00ED2_A69ArtDsc = new String[] {""} ;
      P00ED2_n69ArtDsc = new boolean[] {false} ;
      P00ED2_A829TipArtCod = new short[1] ;
      P00ED2_A105ArtTra1 = new String[] {""} ;
      P00ED2_n105ArtTra1 = new boolean[] {false} ;
      P00ED2_A106ArtTra2 = new String[] {""} ;
      P00ED2_n106ArtTra2 = new boolean[] {false} ;
      P00ED2_A107ArtTra3 = new String[] {""} ;
      P00ED2_n107ArtTra3 = new boolean[] {false} ;
      P00ED2_A108ArtTraP1 = new short[1] ;
      P00ED2_n108ArtTraP1 = new boolean[] {false} ;
      P00ED2_A109ArtTraP2 = new short[1] ;
      P00ED2_n109ArtTraP2 = new boolean[] {false} ;
      P00ED2_A110ArtTraP3 = new short[1] ;
      P00ED2_n110ArtTraP3 = new boolean[] {false} ;
      P00ED2_A111ArtUrd1 = new String[] {""} ;
      P00ED2_n111ArtUrd1 = new boolean[] {false} ;
      P00ED2_A112ArtUrd2 = new String[] {""} ;
      P00ED2_n112ArtUrd2 = new boolean[] {false} ;
      P00ED2_A113ArtUrd3 = new String[] {""} ;
      P00ED2_n113ArtUrd3 = new boolean[] {false} ;
      P00ED2_A114ArtUrdP1 = new short[1] ;
      P00ED2_n114ArtUrdP1 = new boolean[] {false} ;
      P00ED2_A115ArtUrdP2 = new short[1] ;
      P00ED2_n115ArtUrdP2 = new boolean[] {false} ;
      P00ED2_A116ArtUrdP3 = new short[1] ;
      P00ED2_n116ArtUrdP3 = new boolean[] {false} ;
      P00ED2_A967ArtNMtr = new String[] {""} ;
      P00ED2_n967ArtNMtr = new boolean[] {false} ;
      P00ED2_A87ArtMat = new String[] {""} ;
      P00ED2_n87ArtMat = new boolean[] {false} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A69ArtDsc = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      A967ArtNMtr = "" ;
      A87ArtMat = "" ;
      AV54DisArtDsc = "" ;
      AV39DisArtTr1 = "" ;
      AV40DisArtTr2 = "" ;
      AV41DisArtTr3 = "" ;
      AV45DisArtUr1 = "" ;
      AV46DisArtUr2 = "" ;
      AV47DisArtUr3 = "" ;
      AV51DisNMtr = "" ;
      AV52DisArtMat = "" ;
      A757PriCod = "" ;
      A335DisArtCod = "" ;
      A966PartCod = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A362DisColNom = "" ;
      A369DisFec = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A360DisCliNum = "" ;
      A337DisArtDsc = "" ;
      A353DisArtTr1 = "" ;
      A354DisArtTr2 = "" ;
      A355DisArtTr3 = "" ;
      A356DisArtUr1 = "" ;
      A357DisArtUr2 = "" ;
      A358DisArtUr3 = "" ;
      A998DisNMtr = "" ;
      A340DisArtMat = "" ;
      A365DisDes = "" ;
      A1968DisRes = "" ;
      A2009DisTipDis = "" ;
      A1002DisNumTen = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      Gx_emsg = "" ;
      AV32MaqCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcredi2__default(),
         new Object[] {
             new Object[] {
            P00ED2_A65ArtCod, P00ED2_A252CliCod, P00ED2_A396EmprCod, P00ED2_A69ArtDsc, P00ED2_n69ArtDsc, P00ED2_A829TipArtCod, P00ED2_A105ArtTra1, P00ED2_n105ArtTra1, P00ED2_A106ArtTra2, P00ED2_n106ArtTra2,
            P00ED2_A107ArtTra3, P00ED2_n107ArtTra3, P00ED2_A108ArtTraP1, P00ED2_n108ArtTraP1, P00ED2_A109ArtTraP2, P00ED2_n109ArtTraP2, P00ED2_A110ArtTraP3, P00ED2_n110ArtTraP3, P00ED2_A111ArtUrd1, P00ED2_n111ArtUrd1,
            P00ED2_A112ArtUrd2, P00ED2_n112ArtUrd2, P00ED2_A113ArtUrd3, P00ED2_n113ArtUrd3, P00ED2_A114ArtUrdP1, P00ED2_n114ArtUrdP1, P00ED2_A115ArtUrdP2, P00ED2_n115ArtUrdP2, P00ED2_A116ArtUrdP3, P00ED2_n116ArtUrdP3,
            P00ED2_A967ArtNMtr, P00ED2_n967ArtNMtr, P00ED2_A87ArtMat, P00ED2_n87ArtMat
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV23TipCol ;
   private byte A390DisTipCol ;
   private byte A367DisEst ;
   private byte GXv_int5[] ;
   private short A829TipArtCod ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short AV38DisArtTip ;
   private short AV42DisArtPt1 ;
   private short AV43DisArtPt2 ;
   private short AV44DisArtPt3 ;
   private short AV48DisArtPu1 ;
   private short AV49DisArtPu2 ;
   private short AV50DisArtPu3 ;
   private short A374DisNumPie ;
   private short A352DisArtTip ;
   private short A344DisArtPt1 ;
   private short A345DisArtPt2 ;
   private short A346DisArtPt3 ;
   private short A347DisArtPu1 ;
   private short A348DisArtPu2 ;
   private short A349DisArtPu3 ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int AV19Piezas ;
   private int AV21ColorNum ;
   private int AV25DisPos ;
   private int AV28OpeAntCod ;
   private int AV30DisCod ;
   private int GXv_int1[] ;
   private int A252CliCod ;
   private int GX_INS34 ;
   private int A361DisCod ;
   private int A363DisColNum ;
   private int A2403DisOpeAnt ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV18Kilos ;
   private java.math.BigDecimal AV22Metros ;
   private java.math.BigDecimal A375DisNumUni ;
   private String AV15EmprCod ;
   private String AV17ArtCod ;
   private String AV20ColorNom ;
   private String AV24DisCliNum ;
   private String AV26PriCod ;
   private String AV27PartCod ;
   private String AV29OpeNMtr ;
   private String AV36ContCod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A69ArtDsc ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A111ArtUrd1 ;
   private String A112ArtUrd2 ;
   private String A113ArtUrd3 ;
   private String A967ArtNMtr ;
   private String A87ArtMat ;
   private String AV54DisArtDsc ;
   private String AV39DisArtTr1 ;
   private String AV40DisArtTr2 ;
   private String AV41DisArtTr3 ;
   private String AV45DisArtUr1 ;
   private String AV46DisArtUr2 ;
   private String AV47DisArtUr3 ;
   private String AV51DisNMtr ;
   private String AV52DisArtMat ;
   private String A757PriCod ;
   private String A335DisArtCod ;
   private String A966PartCod ;
   private String A392DisUniMed ;
   private String A362DisColNom ;
   private String A360DisCliNum ;
   private String A337DisArtDsc ;
   private String A353DisArtTr1 ;
   private String A354DisArtTr2 ;
   private String A355DisArtTr3 ;
   private String A356DisArtUr1 ;
   private String A357DisArtUr2 ;
   private String A358DisArtUr3 ;
   private String A998DisNMtr ;
   private String A340DisArtMat ;
   private String A365DisDes ;
   private String A1968DisRes ;
   private String A2009DisTipDis ;
   private String A1002DisNumTen ;
   private String Gx_emsg ;
   private String AV32MaqCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date A369DisFec ;
   private java.util.Date Gx_date ;
   private java.util.Date A370DisFecCli ;
   private boolean n69ArtDsc ;
   private boolean n105ArtTra1 ;
   private boolean n106ArtTra2 ;
   private boolean n107ArtTra3 ;
   private boolean n108ArtTraP1 ;
   private boolean n109ArtTraP2 ;
   private boolean n110ArtTraP3 ;
   private boolean n111ArtUrd1 ;
   private boolean n112ArtUrd2 ;
   private boolean n113ArtUrd3 ;
   private boolean n114ArtUrdP1 ;
   private boolean n115ArtUrdP2 ;
   private boolean n116ArtUrdP3 ;
   private boolean n967ArtNMtr ;
   private boolean n87ArtMat ;
   private boolean n966PartCod ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private boolean n349DisArtPu3 ;
   private boolean n1968DisRes ;
   private boolean n2403DisOpeAnt ;
   private boolean n2009DisTipDis ;
   private boolean n1002DisNumTen ;
   private String[] aP14 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private byte[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private int[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ED2_A65ArtCod ;
   private int[] P00ED2_A252CliCod ;
   private String[] P00ED2_A396EmprCod ;
   private String[] P00ED2_A69ArtDsc ;
   private boolean[] P00ED2_n69ArtDsc ;
   private short[] P00ED2_A829TipArtCod ;
   private String[] P00ED2_A105ArtTra1 ;
   private boolean[] P00ED2_n105ArtTra1 ;
   private String[] P00ED2_A106ArtTra2 ;
   private boolean[] P00ED2_n106ArtTra2 ;
   private String[] P00ED2_A107ArtTra3 ;
   private boolean[] P00ED2_n107ArtTra3 ;
   private short[] P00ED2_A108ArtTraP1 ;
   private boolean[] P00ED2_n108ArtTraP1 ;
   private short[] P00ED2_A109ArtTraP2 ;
   private boolean[] P00ED2_n109ArtTraP2 ;
   private short[] P00ED2_A110ArtTraP3 ;
   private boolean[] P00ED2_n110ArtTraP3 ;
   private String[] P00ED2_A111ArtUrd1 ;
   private boolean[] P00ED2_n111ArtUrd1 ;
   private String[] P00ED2_A112ArtUrd2 ;
   private boolean[] P00ED2_n112ArtUrd2 ;
   private String[] P00ED2_A113ArtUrd3 ;
   private boolean[] P00ED2_n113ArtUrd3 ;
   private short[] P00ED2_A114ArtUrdP1 ;
   private boolean[] P00ED2_n114ArtUrdP1 ;
   private short[] P00ED2_A115ArtUrdP2 ;
   private boolean[] P00ED2_n115ArtUrdP2 ;
   private short[] P00ED2_A116ArtUrdP3 ;
   private boolean[] P00ED2_n116ArtUrdP3 ;
   private String[] P00ED2_A967ArtNMtr ;
   private boolean[] P00ED2_n967ArtNMtr ;
   private String[] P00ED2_A87ArtMat ;
   private boolean[] P00ED2_n87ArtMat ;
}

final  class pcredi2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ED2", "SELECT ArtCod, CliCod, EmprCod, ArtDsc, TipArtCod, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtNMtr, ArtMat FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00ED3", "INSERT INTO TXPDISPOS(EmprCod, DisCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, PriCod, DisCliNum, DisFecCli, DisFec, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisArtMat, DisArtTip, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisEst, DisNMtr, DisNumTen, PartCod, CliCod, DisRes, DisTipDis, DisOpeAnt, DisArtPes, DisFecEnt, DisEnt, DisObsULin, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtEnc, DisArtCor, DisArtOpe, DisArtRdt, DisArtUrg, DisArtAnh, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMez, MaqCodDis, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisNumBas, DisCliDes, DisManCod, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 16);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setDate(10, (java.util.Date)parms[9]);
               stmt.setDate(11, (java.util.Date)parms[10]);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[12], 13);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[16]).byteValue());
               }
               stmt.setString(15, (String)parms[17], 26);
               stmt.setString(16, (String)parms[18], 16);
               stmt.setShort(17, ((Number) parms[19]).shortValue());
               stmt.setString(18, (String)parms[20], 4);
               stmt.setShort(19, ((Number) parms[21]).shortValue());
               stmt.setString(20, (String)parms[22], 4);
               stmt.setShort(21, ((Number) parms[23]).shortValue());
               stmt.setString(22, (String)parms[24], 4);
               stmt.setShort(23, ((Number) parms[25]).shortValue());
               stmt.setString(24, (String)parms[26], 4);
               stmt.setShort(25, ((Number) parms[27]).shortValue());
               stmt.setString(26, (String)parms[28], 4);
               stmt.setShort(27, ((Number) parms[29]).shortValue());
               stmt.setString(28, (String)parms[30], 4);
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[32]).shortValue());
               }
               stmt.setByte(30, ((Number) parms[33]).byteValue());
               stmt.setString(31, (String)parms[34], 10);
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[36], 10);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[38], 16);
               }
               stmt.setInt(34, ((Number) parms[39]).intValue());
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(37, ((Number) parms[45]).intValue());
               }
               return;
      }
   }

}

