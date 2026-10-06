package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmtsrdt extends GXProcedure
{
   public pmtsrdt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmtsrdt.class ), "" );
   }

   public pmtsrdt( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal aP4 )
   {
      pmtsrdt.this.A396EmprCod = aP0;
      pmtsrdt.this.A129BarCod = aP1;
      pmtsrdt.this.A132BarCodReo = aP2;
      pmtsrdt.this.A130BarCodPar = aP3;
      pmtsrdt.this.AV13BarRdt = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FlagMfR = (byte)(0) ;
      GXv_int1[0] = AV8FlagMfR ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MTSRDO", ""), GXv_int1) ;
      pmtsrdt.this.AV8FlagMfR = GXv_int1[0] ;
      GXv_int1[0] = AV9FlagGm2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MTSGM2", ""), GXv_int1) ;
      pmtsrdt.this.AV9FlagGm2 = GXv_int1[0] ;
      GXv_int1[0] = AV16Grm2Cru ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MTSGMC", ""), GXv_int1) ;
      pmtsrdt.this.AV16Grm2Cru = GXv_int1[0] ;
      if ( AV8FlagMfR == 1 )
      {
         /* Using cursor P01ZF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A44AlbRecCod = P01ZF2_A44AlbRecCod[0] ;
            A361DisCod = P01ZF2_A361DisCod[0] ;
            A228BarUniMed = P01ZF2_A228BarUniMed[0] ;
            A203BarPieKil = P01ZF2_A203BarPieKil[0] ;
            A205BarPieMet = P01ZF2_A205BarPieMet[0] ;
            A200BarPieCod = P01ZF2_A200BarPieCod[0] ;
            A361DisCod = P01ZF2_A361DisCod[0] ;
            A228BarUniMed = P01ZF2_A228BarUniMed[0] ;
            if ( ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV13BarRdt)==0) )
            {
               A205BarPieMet = A203BarPieKil.multiply(AV13BarRdt) ;
               AV14DisPieMet = A203BarPieKil.multiply(AV13BarRdt) ;
               AV15Barpiecod = GXutil.substring( A200BarPieCod, 1, 8) ;
               /* Optimized UPDATE. */
               /* Using cursor P01ZF3 */
               pr_default.execute(1, new Object[] {AV14DisPieMet, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), AV15Barpiecod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
               /* End optimized UPDATE. */
            }
            /* Using cursor P01ZF4 */
            pr_default.execute(2, new Object[] {A205BarPieMet, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            pr_default.readNext(0);
         }
         pr_default.close(0);
         System.out.println( httpContext.getMessage( "Re-calculo Mts F(Rdto)", "") );
      }
      if ( AV9FlagGm2 == 1 )
      {
         /* Using cursor P01ZF6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1909BarGraAca = P01ZF6_A1909BarGraAca[0] ;
            A125BarAncAca1 = P01ZF6_A125BarAncAca1[0] ;
            A212BarSer = P01ZF6_A212BarSer[0] ;
            A120BarAgrEst = P01ZF6_A120BarAgrEst[0] ;
            A166BarKgm = P01ZF6_A166BarKgm[0] ;
            A184BarMtr = P01ZF6_A184BarMtr[0] ;
            A199BarPie1 = P01ZF6_A199BarPie1[0] ;
            A365DisDes = P01ZF6_A365DisDes[0] ;
            A898BarPieNDes = P01ZF6_A898BarPieNDes[0] ;
            A166BarKgm = P01ZF6_A166BarKgm[0] ;
            A184BarMtr = P01ZF6_A184BarMtr[0] ;
            A199BarPie1 = P01ZF6_A199BarPie1[0] ;
            A898BarPieNDes = P01ZF6_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            /* Using cursor P01ZF7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A44AlbRecCod = P01ZF7_A44AlbRecCod[0] ;
               A361DisCod = P01ZF7_A361DisCod[0] ;
               A4920AlbRGrm2 = P01ZF7_A4920AlbRGrm2[0] ;
               A4921AlbRAnc = P01ZF7_A4921AlbRAnc[0] ;
               A203BarPieKil = P01ZF7_A203BarPieKil[0] ;
               A205BarPieMet = P01ZF7_A205BarPieMet[0] ;
               A200BarPieCod = P01ZF7_A200BarPieCod[0] ;
               A4920AlbRGrm2 = P01ZF7_A4920AlbRGrm2[0] ;
               A4921AlbRAnc = P01ZF7_A4921AlbRAnc[0] ;
               A361DisCod = P01ZF7_A361DisCod[0] ;
               AV17AlbRGrm2 = A4920AlbRGrm2 ;
               AV18AlbRAnc = A4921AlbRAnc ;
               AV19Grm2 = ((AV16Grm2Cru==0) ? A1909BarGraAca : AV17AlbRGrm2) ;
               AV10Ancho = ((AV16Grm2Cru==0) ? DecimalUtil.doubleToDec(A125BarAncAca1/ (double) (100)) : DecimalUtil.doubleToDec(AV18AlbRAnc/ (double) (100))) ;
               AV11MetrosT = (((DecimalUtil.doubleToDec(AV19Grm2).multiply(AV10Ancho)).doubleValue()>0) ? (A203BarPieKil.divide((DecimalUtil.doubleToDec(AV19Grm2).multiply(AV10Ancho)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
               A205BarPieMet = AV11MetrosT ;
               AV14DisPieMet = AV11MetrosT ;
               AV15Barpiecod = GXutil.substring( A200BarPieCod, 1, 8) ;
               /* Optimized UPDATE. */
               /* Using cursor P01ZF8 */
               pr_default.execute(5, new Object[] {AV11MetrosT, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), AV15Barpiecod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
               /* End optimized UPDATE. */
               /* Using cursor P01ZF9 */
               pr_default.execute(6, new Object[] {A205BarPieMet, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               pr_default.readNext(4);
            }
            pr_default.close(4);
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               AV25Kilos = A166BarKgm ;
               AV24Metros = A184BarMtr ;
               AV23Piezas = A198BarPie ;
               AV20baragrcod = A129BarCod ;
               AV21baragrreo = A132BarCodReo ;
               AV22baragrpar = A130BarCodPar ;
               /* Execute user subroutine: 'BARAGR' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BARAGR' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01ZF10 */
      short AV23Piezas671Aux;
      AV23Piezas671Aux = (short)(AV23Piezas) ;
      pr_default.execute(7, new Object[] {Short.valueOf(AV23Piezas671Aux), AV24Metros, AV25Kilos, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(AV20baragrcod), Byte.valueOf(AV21baragrreo), AV22baragrpar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pmtsrdt");
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
      scmdbuf = "" ;
      P01ZF2_A396EmprCod = new String[] {""} ;
      P01ZF2_A129BarCod = new int[1] ;
      P01ZF2_A132BarCodReo = new byte[1] ;
      P01ZF2_A130BarCodPar = new String[] {""} ;
      P01ZF2_A44AlbRecCod = new int[1] ;
      P01ZF2_A361DisCod = new int[1] ;
      P01ZF2_A228BarUniMed = new String[] {""} ;
      P01ZF2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZF2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZF2_A200BarPieCod = new String[] {""} ;
      A228BarUniMed = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV14DisPieMet = DecimalUtil.ZERO ;
      AV15Barpiecod = "" ;
      A384DisPieMet = DecimalUtil.ZERO ;
      P01ZF6_A396EmprCod = new String[] {""} ;
      P01ZF6_A129BarCod = new int[1] ;
      P01ZF6_A132BarCodReo = new byte[1] ;
      P01ZF6_A130BarCodPar = new String[] {""} ;
      P01ZF6_A1909BarGraAca = new short[1] ;
      P01ZF6_A125BarAncAca1 = new short[1] ;
      P01ZF6_A212BarSer = new String[] {""} ;
      P01ZF6_A120BarAgrEst = new String[] {""} ;
      P01ZF6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZF6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZF6_A199BarPie1 = new short[1] ;
      P01ZF6_A365DisDes = new String[] {""} ;
      P01ZF6_A898BarPieNDes = new int[1] ;
      A212BarSer = "" ;
      A120BarAgrEst = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      P01ZF7_A396EmprCod = new String[] {""} ;
      P01ZF7_A129BarCod = new int[1] ;
      P01ZF7_A132BarCodReo = new byte[1] ;
      P01ZF7_A130BarCodPar = new String[] {""} ;
      P01ZF7_A44AlbRecCod = new int[1] ;
      P01ZF7_A361DisCod = new int[1] ;
      P01ZF7_A4920AlbRGrm2 = new short[1] ;
      P01ZF7_A4921AlbRAnc = new short[1] ;
      P01ZF7_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZF7_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZF7_A200BarPieCod = new String[] {""} ;
      AV10Ancho = DecimalUtil.ZERO ;
      AV11MetrosT = DecimalUtil.ZERO ;
      AV25Kilos = DecimalUtil.ZERO ;
      AV24Metros = DecimalUtil.ZERO ;
      AV22baragrpar = "" ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A590KgmAgr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmtsrdt__default(),
         new Object[] {
             new Object[] {
            P01ZF2_A396EmprCod, P01ZF2_A129BarCod, P01ZF2_A132BarCodReo, P01ZF2_A130BarCodPar, P01ZF2_A44AlbRecCod, P01ZF2_A361DisCod, P01ZF2_A228BarUniMed, P01ZF2_A203BarPieKil, P01ZF2_A205BarPieMet, P01ZF2_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01ZF6_A396EmprCod, P01ZF6_A129BarCod, P01ZF6_A132BarCodReo, P01ZF6_A130BarCodPar, P01ZF6_A1909BarGraAca, P01ZF6_A125BarAncAca1, P01ZF6_A212BarSer, P01ZF6_A120BarAgrEst, P01ZF6_A166BarKgm, P01ZF6_A184BarMtr,
            P01ZF6_A199BarPie1, P01ZF6_A365DisDes, P01ZF6_A898BarPieNDes
            }
            , new Object[] {
            P01ZF7_A396EmprCod, P01ZF7_A129BarCod, P01ZF7_A132BarCodReo, P01ZF7_A130BarCodPar, P01ZF7_A44AlbRecCod, P01ZF7_A361DisCod, P01ZF7_A4920AlbRGrm2, P01ZF7_A4921AlbRAnc, P01ZF7_A203BarPieKil, P01ZF7_A205BarPieMet,
            P01ZF7_A200BarPieCod
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

   private byte A132BarCodReo ;
   private byte AV8FlagMfR ;
   private byte AV9FlagGm2 ;
   private byte AV16Grm2Cru ;
   private byte GXv_int1[] ;
   private byte AV21baragrreo ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short A199BarPie1 ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short AV17AlbRGrm2 ;
   private short AV18AlbRAnc ;
   private short AV19Grm2 ;
   private short A671PieAgr ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int A361DisCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV23Piezas ;
   private int AV20baragrcod ;
   private java.math.BigDecimal AV13BarRdt ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV14DisPieMet ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV10Ancho ;
   private java.math.BigDecimal AV11MetrosT ;
   private java.math.BigDecimal AV25Kilos ;
   private java.math.BigDecimal AV24Metros ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal A590KgmAgr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A228BarUniMed ;
   private String A200BarPieCod ;
   private String AV15Barpiecod ;
   private String A212BarSer ;
   private String A120BarAgrEst ;
   private String A365DisDes ;
   private String AV22baragrpar ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P01ZF2_A396EmprCod ;
   private int[] P01ZF2_A129BarCod ;
   private byte[] P01ZF2_A132BarCodReo ;
   private String[] P01ZF2_A130BarCodPar ;
   private int[] P01ZF2_A44AlbRecCod ;
   private int[] P01ZF2_A361DisCod ;
   private String[] P01ZF2_A228BarUniMed ;
   private java.math.BigDecimal[] P01ZF2_A203BarPieKil ;
   private java.math.BigDecimal[] P01ZF2_A205BarPieMet ;
   private String[] P01ZF2_A200BarPieCod ;
   private String[] P01ZF6_A396EmprCod ;
   private int[] P01ZF6_A129BarCod ;
   private byte[] P01ZF6_A132BarCodReo ;
   private String[] P01ZF6_A130BarCodPar ;
   private short[] P01ZF6_A1909BarGraAca ;
   private short[] P01ZF6_A125BarAncAca1 ;
   private String[] P01ZF6_A212BarSer ;
   private String[] P01ZF6_A120BarAgrEst ;
   private java.math.BigDecimal[] P01ZF6_A166BarKgm ;
   private java.math.BigDecimal[] P01ZF6_A184BarMtr ;
   private short[] P01ZF6_A199BarPie1 ;
   private String[] P01ZF6_A365DisDes ;
   private int[] P01ZF6_A898BarPieNDes ;
   private String[] P01ZF7_A396EmprCod ;
   private int[] P01ZF7_A129BarCod ;
   private byte[] P01ZF7_A132BarCodReo ;
   private String[] P01ZF7_A130BarCodPar ;
   private int[] P01ZF7_A44AlbRecCod ;
   private int[] P01ZF7_A361DisCod ;
   private short[] P01ZF7_A4920AlbRGrm2 ;
   private short[] P01ZF7_A4921AlbRAnc ;
   private java.math.BigDecimal[] P01ZF7_A203BarPieKil ;
   private java.math.BigDecimal[] P01ZF7_A205BarPieMet ;
   private String[] P01ZF7_A200BarPieCod ;
}

final  class pmtsrdt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01ZF2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod, T2.DisCod, T2.BarUniMed, T1.BarPieKil, T1.BarPieMet, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01ZF3", "UPDATE TXPDISALD SET DisPieMet=?  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? and DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P01ZF4", "UPDATE TXPBARPIE SET BarPieMet=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P01ZF6", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarGraAca, T1.BarAncAca1, T1.BarSer, T1.BarAgrEst, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01ZF7", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod, T3.DisCod, T2.AlbRGrm2, T2.AlbRAnc, T1.BarPieKil, T1.BarPieMet, T1.BarPieCod FROM ((TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01ZF8", "UPDATE TXPDISALD SET DisPieMet=?  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? and DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P01ZF9", "UPDATE TXPBARPIE SET BarPieMet=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P01ZF10", "UPDATE TXPBARAGR SET PieAgr=?, MtrAgr=?, KgmAgr=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 9);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
      }
   }

}

