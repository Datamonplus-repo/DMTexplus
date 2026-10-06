package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprc131 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprc131 pgm = new apprc131 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprc131( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprc131.class ), "" );
   }

   public apprc131( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apprc131.this.AV10EmprCod = GXv_char1[0] ;
      apprc131.this.AV11EmprNom = GXv_char2[0] ;
      apprc131.this.AV8UsurCod = GXv_char3[0] ;
      /* Using cursor P05M42 */
      pr_default.execute(0, new Object[] {AV10EmprCod, AV12Fec1, AV13Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05M42_A396EmprCod[0] ;
         A130BarCodPar = P05M42_A130BarCodPar[0] ;
         A132BarCodReo = P05M42_A132BarCodReo[0] ;
         A129BarCod = P05M42_A129BarCod[0] ;
         A159BarFecGen = P05M42_A159BarFecGen[0] ;
         AV20Barcod = A129BarCod ;
         AV21Barcodreo = A132BarCodReo ;
         AV22Barcodpar = A130BarCodPar ;
         /* Using cursor P05M43 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = P05M43_A44AlbRecCod[0] ;
            A12911BarPieFep = P05M43_A12911BarPieFep[0] ;
            n12911BarPieFep = P05M43_n12911BarPieFep[0] ;
            A12113BarPieCLd = P05M43_A12113BarPieCLd[0] ;
            n12113BarPieCLd = P05M43_n12113BarPieCLd[0] ;
            A12912BarPieUltD = P05M43_A12912BarPieUltD[0] ;
            n12912BarPieUltD = P05M43_n12912BarPieUltD[0] ;
            A200BarPieCod = P05M43_A200BarPieCod[0] ;
            AV14BarpieCod = A200BarPieCod ;
            AV15ALbReccod = A44AlbRecCod ;
            /* Execute user subroutine: 'DEFECTOS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            A12911BarPieFep = AV17AlbRecFec ;
            n12911BarPieFep = false ;
            A12113BarPieCLd = AV16AlRPieClaMan ;
            n12113BarPieCLd = false ;
            A12912BarPieUltD = AV19BarPieLDf ;
            n12912BarPieUltD = false ;
            AV23Control = " " ;
            AV23Control = httpContext.getMessage( "Pieza ", "") + AV14BarpieCod + GXutil.newLine( ) ;
            AV23Control += httpContext.getMessage( "Calidad ", "") + GXutil.str( AV16AlRPieClaMan, 2, 0) + GXutil.newLine( ) ;
            AV23Control += httpContext.getMessage( "Fecha   ", "") + localUtil.dtoc( AV17AlbRecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
            System.out.println( AV23Control );
            /* Using cursor P05M44 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n12911BarPieFep), A12911BarPieFep, Boolean.valueOf(n12113BarPieCLd), Byte.valueOf(A12113BarPieCLd), Boolean.valueOf(n12912BarPieUltD), Short.valueOf(A12912BarPieUltD), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'DEFECTOS' Routine */
      returnInSub = false ;
      AV16AlRPieClaMan = (byte)(0) ;
      AV17AlbRecFec = GXutil.nullDate() ;
      /* Using cursor P05M45 */
      pr_default.execute(3, new Object[] {AV10EmprCod, Integer.valueOf(AV15ALbReccod), AV14BarpieCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2159AlbRecPie = P05M45_A2159AlbRecPie[0] ;
         A44AlbRecCod = P05M45_A44AlbRecCod[0] ;
         A396EmprCod = P05M45_A396EmprCod[0] ;
         A4798AlRPieClaM = P05M45_A4798AlRPieClaM[0] ;
         n4798AlRPieClaM = P05M45_n4798AlRPieClaM[0] ;
         A4411AlbRecFec = P05M45_A4411AlbRecFec[0] ;
         n4411AlbRecFec = P05M45_n4411AlbRecFec[0] ;
         A4799AlRPieUltC = P05M45_A4799AlRPieUltC[0] ;
         n4799AlRPieUltC = P05M45_n4799AlRPieUltC[0] ;
         W396EmprCod = A396EmprCod ;
         AV16AlRPieClaMan = A4798AlRPieClaM ;
         AV17AlbRecFec = localUtil.ctod( localUtil.ttoc( A4411AlbRecFec, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV18AlRPieUltCnt = A4799AlRPieUltC ;
         AV19BarPieLDf = (short)(0) ;
         /* Using cursor P05M46 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A4395AlRDefCod = P05M46_A4395AlRDefCod[0] ;
            A6683AlrDefMtr = P05M46_A6683AlrDefMtr[0] ;
            A6684AlRDefCDe = P05M46_A6684AlRDefCDe[0] ;
            n6684AlRDefCDe = P05M46_n6684AlRDefCDe[0] ;
            A4412AlRFasCod = P05M46_A4412AlRFasCod[0] ;
            A12910AlRDefMtf = P05M46_A12910AlRDefMtf[0] ;
            n12910AlRDefMtf = P05M46_n12910AlRDefMtf[0] ;
            W396EmprCod = A396EmprCod ;
            AV19BarPieLDf = (short)(AV19BarPieLDf+1) ;
            /*
               INSERT RECORD ON TABLE TXPBARPDE

            */
            W396EmprCod = A396EmprCod ;
            A129BarCod = AV20Barcod ;
            A132BarCodReo = AV21Barcodreo ;
            A130BarCodPar = AV22Barcodpar ;
            A200BarPieCod = AV14BarpieCod ;
            A12913BarPieLDf = AV19BarPieLDf ;
            A12914BarPieDfID = A4395AlRDefCod ;
            n12914BarPieDfID = false ;
            A12915BarPieDfMi = A6683AlrDefMtr ;
            n12915BarPieDfMi = false ;
            A12916BarPieDfMf = A6684AlRDefCDe ;
            n12916BarPieDfMf = false ;
            A12917BarPieDfFI = A4412AlRFasCod ;
            n12917BarPieDfFI = false ;
            /* Using cursor P05M47 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A12913BarPieLDf), Boolean.valueOf(n12914BarPieDfID), Short.valueOf(A12914BarPieDfID), Boolean.valueOf(n12915BarPieDfMi), A12915BarPieDfMi, Boolean.valueOf(n12916BarPieDfMf), A12916BarPieDfMf, Boolean.valueOf(n12917BarPieDfFI), A12917BarPieDfFI});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPDE");
            if ( (pr_default.getStatus(5) == 1) )
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
            /* End Insert */
            AV23Control = " " ;
            AV23Control = httpContext.getMessage( "Defectos.Pieza ", "") + AV14BarpieCod + GXutil.newLine( ) ;
            AV23Control += httpContext.getMessage( "Calidad ", "") + GXutil.str( AV16AlRPieClaMan, 2, 0) + GXutil.newLine( ) ;
            AV23Control += httpContext.getMessage( "Fecha   ", "") + localUtil.dtoc( AV17AlbRecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
            AV23Control += httpContext.getMessage( "Fase    ", "") + A4412AlRFasCod + GXutil.newLine( ) ;
            AV23Control += httpContext.getMessage( "Defecto ", "") + GXutil.str( A4395AlRDefCod, 4, 0) + GXutil.newLine( ) ;
            System.out.println( AV23Control );
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprc131.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apprc131");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      AV12Fec1 = GXutil.nullDate() ;
      AV13Fec2 = GXutil.nullDate() ;
      P05M42_A396EmprCod = new String[] {""} ;
      P05M42_A130BarCodPar = new String[] {""} ;
      P05M42_A132BarCodReo = new byte[1] ;
      P05M42_A129BarCod = new int[1] ;
      P05M42_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      AV22Barcodpar = "" ;
      P05M43_A396EmprCod = new String[] {""} ;
      P05M43_A129BarCod = new int[1] ;
      P05M43_A132BarCodReo = new byte[1] ;
      P05M43_A130BarCodPar = new String[] {""} ;
      P05M43_A44AlbRecCod = new int[1] ;
      P05M43_A12911BarPieFep = new java.util.Date[] {GXutil.nullDate()} ;
      P05M43_n12911BarPieFep = new boolean[] {false} ;
      P05M43_A12113BarPieCLd = new byte[1] ;
      P05M43_n12113BarPieCLd = new boolean[] {false} ;
      P05M43_A12912BarPieUltD = new short[1] ;
      P05M43_n12912BarPieUltD = new boolean[] {false} ;
      P05M43_A200BarPieCod = new String[] {""} ;
      A12911BarPieFep = GXutil.nullDate() ;
      A200BarPieCod = "" ;
      AV14BarpieCod = "" ;
      AV17AlbRecFec = GXutil.nullDate() ;
      AV23Control = "" ;
      P05M45_A2159AlbRecPie = new String[] {""} ;
      P05M45_A44AlbRecCod = new int[1] ;
      P05M45_A396EmprCod = new String[] {""} ;
      P05M45_A4798AlRPieClaM = new byte[1] ;
      P05M45_n4798AlRPieClaM = new boolean[] {false} ;
      P05M45_A4411AlbRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05M45_n4411AlbRecFec = new boolean[] {false} ;
      P05M45_A4799AlRPieUltC = new String[] {""} ;
      P05M45_n4799AlRPieUltC = new boolean[] {false} ;
      A2159AlbRecPie = "" ;
      A4411AlbRecFec = GXutil.resetTime( GXutil.nullDate() );
      A4799AlRPieUltC = "" ;
      W396EmprCod = "" ;
      AV18AlRPieUltCnt = "" ;
      P05M46_A396EmprCod = new String[] {""} ;
      P05M46_A44AlbRecCod = new int[1] ;
      P05M46_A2159AlbRecPie = new String[] {""} ;
      P05M46_A4395AlRDefCod = new short[1] ;
      P05M46_A6683AlrDefMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M46_A6684AlRDefCDe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M46_n6684AlRDefCDe = new boolean[] {false} ;
      P05M46_A4412AlRFasCod = new String[] {""} ;
      P05M46_A12910AlRDefMtf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M46_n12910AlRDefMtf = new boolean[] {false} ;
      A6683AlrDefMtr = DecimalUtil.ZERO ;
      A6684AlRDefCDe = DecimalUtil.ZERO ;
      A4412AlRFasCod = "" ;
      A12910AlRDefMtf = DecimalUtil.ZERO ;
      A12915BarPieDfMi = DecimalUtil.ZERO ;
      A12916BarPieDfMf = DecimalUtil.ZERO ;
      A12917BarPieDfFI = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apprc131__default(),
         new Object[] {
             new Object[] {
            P05M42_A396EmprCod, P05M42_A130BarCodPar, P05M42_A132BarCodReo, P05M42_A129BarCod, P05M42_A159BarFecGen
            }
            , new Object[] {
            P05M43_A396EmprCod, P05M43_A129BarCod, P05M43_A132BarCodReo, P05M43_A130BarCodPar, P05M43_A44AlbRecCod, P05M43_A12911BarPieFep, P05M43_n12911BarPieFep, P05M43_A12113BarPieCLd, P05M43_n12113BarPieCLd, P05M43_A12912BarPieUltD,
            P05M43_n12912BarPieUltD, P05M43_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05M45_A2159AlbRecPie, P05M45_A44AlbRecCod, P05M45_A396EmprCod, P05M45_A4798AlRPieClaM, P05M45_n4798AlRPieClaM, P05M45_A4411AlbRecFec, P05M45_n4411AlbRecFec, P05M45_A4799AlRPieUltC, P05M45_n4799AlRPieUltC
            }
            , new Object[] {
            P05M46_A396EmprCod, P05M46_A44AlbRecCod, P05M46_A2159AlbRecPie, P05M46_A4395AlRDefCod, P05M46_A6683AlrDefMtr, P05M46_A6684AlRDefCDe, P05M46_n6684AlRDefCDe, P05M46_A4412AlRFasCod, P05M46_A12910AlRDefMtf, P05M46_n12910AlRDefMtf
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV21Barcodreo ;
   private byte A12113BarPieCLd ;
   private byte AV16AlRPieClaMan ;
   private byte A4798AlRPieClaM ;
   private short A12912BarPieUltD ;
   private short AV19BarPieLDf ;
   private short A4395AlRDefCod ;
   private short A12913BarPieLDf ;
   private short A12914BarPieDfID ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV20Barcod ;
   private int A44AlbRecCod ;
   private int AV15ALbReccod ;
   private int GX_INS1772 ;
   private java.math.BigDecimal A6683AlrDefMtr ;
   private java.math.BigDecimal A6684AlRDefCDe ;
   private java.math.BigDecimal A12910AlRDefMtf ;
   private java.math.BigDecimal A12915BarPieDfMi ;
   private java.math.BigDecimal A12916BarPieDfMf ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV22Barcodpar ;
   private String A200BarPieCod ;
   private String AV14BarpieCod ;
   private String A2159AlbRecPie ;
   private String A4799AlRPieUltC ;
   private String W396EmprCod ;
   private String AV18AlRPieUltCnt ;
   private String A4412AlRFasCod ;
   private String A12917BarPieDfFI ;
   private String Gx_emsg ;
   private java.util.Date A4411AlbRecFec ;
   private java.util.Date AV12Fec1 ;
   private java.util.Date AV13Fec2 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A12911BarPieFep ;
   private java.util.Date AV17AlbRecFec ;
   private boolean n12911BarPieFep ;
   private boolean n12113BarPieCLd ;
   private boolean n12912BarPieUltD ;
   private boolean returnInSub ;
   private boolean n4798AlRPieClaM ;
   private boolean n4411AlbRecFec ;
   private boolean n4799AlRPieUltC ;
   private boolean n6684AlRDefCDe ;
   private boolean n12910AlRDefMtf ;
   private boolean n12914BarPieDfID ;
   private boolean n12915BarPieDfMi ;
   private boolean n12916BarPieDfMf ;
   private boolean n12917BarPieDfFI ;
   private String AV23Control ;
   private IDataStoreProvider pr_default ;
   private String[] P05M42_A396EmprCod ;
   private String[] P05M42_A130BarCodPar ;
   private byte[] P05M42_A132BarCodReo ;
   private int[] P05M42_A129BarCod ;
   private java.util.Date[] P05M42_A159BarFecGen ;
   private String[] P05M43_A396EmprCod ;
   private int[] P05M43_A129BarCod ;
   private byte[] P05M43_A132BarCodReo ;
   private String[] P05M43_A130BarCodPar ;
   private int[] P05M43_A44AlbRecCod ;
   private java.util.Date[] P05M43_A12911BarPieFep ;
   private boolean[] P05M43_n12911BarPieFep ;
   private byte[] P05M43_A12113BarPieCLd ;
   private boolean[] P05M43_n12113BarPieCLd ;
   private short[] P05M43_A12912BarPieUltD ;
   private boolean[] P05M43_n12912BarPieUltD ;
   private String[] P05M43_A200BarPieCod ;
   private String[] P05M45_A2159AlbRecPie ;
   private int[] P05M45_A44AlbRecCod ;
   private String[] P05M45_A396EmprCod ;
   private byte[] P05M45_A4798AlRPieClaM ;
   private boolean[] P05M45_n4798AlRPieClaM ;
   private java.util.Date[] P05M45_A4411AlbRecFec ;
   private boolean[] P05M45_n4411AlbRecFec ;
   private String[] P05M45_A4799AlRPieUltC ;
   private boolean[] P05M45_n4799AlRPieUltC ;
   private String[] P05M46_A396EmprCod ;
   private int[] P05M46_A44AlbRecCod ;
   private String[] P05M46_A2159AlbRecPie ;
   private short[] P05M46_A4395AlRDefCod ;
   private java.math.BigDecimal[] P05M46_A6683AlrDefMtr ;
   private java.math.BigDecimal[] P05M46_A6684AlRDefCDe ;
   private boolean[] P05M46_n6684AlRDefCDe ;
   private String[] P05M46_A4412AlRFasCod ;
   private java.math.BigDecimal[] P05M46_A12910AlRDefMtf ;
   private boolean[] P05M46_n12910AlRDefMtf ;
}

final  class apprc131__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05M42", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarFecGen FROM TXPBARCAD WHERE (EmprCod = ? and BarFecGen >= ?) AND (BarFecGen <= ?) ORDER BY EmprCod, BarFecGen ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05M43", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieFep, BarPieCLd, BarPieUltD, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05M44", "UPDATE TXPBARPIE SET BarPieFep=?, BarPieCLd=?, BarPieUltD=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P05M45", "SELECT AlbRecPie, AlbRecCod, EmprCod, AlRPieClaM, AlbRecFec, AlRPieUltC FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05M46", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlrDefMtr, AlRDefCDe, AlRFasCod, AlRDefMtf FROM TXPAlRPMe WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05M47", "INSERT INTO TXPBARPDE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf, BarPieDfID, BarPieDfMi, BarPieDfMf, BarPieDfFI, BarPieLong, BarPieDPto, BarPieDfCr, BarPieRepa, BarPieDfTu, BarPieDSoC, BarPieDHor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPDE")
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
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               stmt.setString(8, (String)parms[10], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[13], 8);
               }
               return;
      }
   }

}

