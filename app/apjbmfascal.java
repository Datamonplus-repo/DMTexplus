package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjbmfascal extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjbmfascal pgm = new apjbmfascal (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjbmfascal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjbmfascal.class ), "" );
   }

   public apjbmfascal( int remoteHandle ,
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
      /* User SQL Command. */
      cmdBuffer = "  alter session set nls_language = 'AMERICAN'; ";
      ExecuteDirectSQL.execute(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      /* User SQL Command. */
      cmdBuffer = "  alter session set nls_territory = 'AMERICA'; ";
      ExecuteDirectSQL.execute(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      /* Using cursor P01K73 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01K73_A130BarCodPar[0] ;
         n130BarCodPar = P01K73_n130BarCodPar[0] ;
         A132BarCodReo = P01K73_A132BarCodReo[0] ;
         n132BarCodReo = P01K73_n132BarCodReo[0] ;
         A129BarCod = P01K73_A129BarCod[0] ;
         n129BarCod = P01K73_n129BarCod[0] ;
         A213BarSit = P01K73_A213BarSit[0] ;
         A396EmprCod = P01K73_A396EmprCod[0] ;
         A252CliCod = P01K73_A252CliCod[0] ;
         n252CliCod = P01K73_n252CliCod[0] ;
         A212BarSer = P01K73_A212BarSer[0] ;
         A135BarColNom = P01K73_A135BarColNom[0] ;
         A136BarColNum = P01K73_A136BarColNum[0] ;
         A218BarTipCol = P01K73_A218BarTipCol[0] ;
         A191BarNumPie = P01K73_A191BarNumPie[0] ;
         A184BarMtr = P01K73_A184BarMtr[0] ;
         n184BarMtr = P01K73_n184BarMtr[0] ;
         A184BarMtr = P01K73_A184BarMtr[0] ;
         n184BarMtr = P01K73_n184BarMtr[0] ;
         AV11DecTot = DecimalUtil.doubleToDec(0) ;
         Gx_msg = GXutil.trim( GXutil.str( A129BarCod, 10, 0)) + GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)) + GXutil.trim( A130BarCodPar) ;
         System.out.println( Gx_msg );
         /* Using cursor P01K74 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A456FasActTin = P01K74_A456FasActTin[0] ;
            n456FasActTin = P01K74_n456FasActTin[0] ;
            A468FasPrePie = P01K74_A468FasPrePie[0] ;
            n468FasPrePie = P01K74_n468FasPrePie[0] ;
            A469FasPreSal = P01K74_A469FasPreSal[0] ;
            n469FasPreSal = P01K74_n469FasPreSal[0] ;
            A472FasVelPro = P01K74_A472FasVelPro[0] ;
            n472FasVelPro = P01K74_n472FasVelPro[0] ;
            A464FasNumPas = P01K74_A464FasNumPas[0] ;
            n464FasNumPas = P01K74_n464FasNumPas[0] ;
            A216BarTieTeo = P01K74_A216BarTieTeo[0] ;
            A457FasCod = P01K74_A457FasCod[0] ;
            A194BarOrdLin = P01K74_A194BarOrdLin[0] ;
            A758ProCod = P01K74_A758ProCod[0] ;
            A456FasActTin = P01K74_A456FasActTin[0] ;
            n456FasActTin = P01K74_n456FasActTin[0] ;
            A468FasPrePie = P01K74_A468FasPrePie[0] ;
            n468FasPrePie = P01K74_n468FasPrePie[0] ;
            A469FasPreSal = P01K74_A469FasPreSal[0] ;
            n469FasPreSal = P01K74_n469FasPreSal[0] ;
            A472FasVelPro = P01K74_A472FasVelPro[0] ;
            n472FasVelPro = P01K74_n472FasVelPro[0] ;
            A464FasNumPas = P01K74_A464FasNumPas[0] ;
            n464FasNumPas = P01K74_n464FasNumPas[0] ;
            AV9BarTieTeo = DecimalUtil.ZERO ;
            if ( ( A213BarSit == 1 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) == 0 ) )
            {
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = A252CliCod ;
               GXv_char3[0] = A212BarSer ;
               GXv_char4[0] = A135BarColNom ;
               GXv_int5[0] = A136BarColNum ;
               GXv_int6[0] = A218BarTipCol ;
               GXv_int7[0] = (short)(DecimalUtil.decToDouble(AV12TiePro)) ;
               new app.pfortie(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_int7) ;
               apjbmfascal.this.A396EmprCod = GXv_char1[0] ;
               apjbmfascal.this.A252CliCod = GXv_int2[0] ;
               apjbmfascal.this.A212BarSer = GXv_char3[0] ;
               apjbmfascal.this.A135BarColNom = GXv_char4[0] ;
               apjbmfascal.this.A136BarColNum = GXv_int5[0] ;
               apjbmfascal.this.A218BarTipCol = GXv_int6[0] ;
               apjbmfascal.this.AV12TiePro = DecimalUtil.doubleToDec(GXv_int7[0]) ;
               AV9BarTieTeo = AV12TiePro.add(DecimalUtil.doubleToDec(A469FasPreSal)).add(DecimalUtil.doubleToDec((A468FasPrePie*A191BarNumPie))) ;
            }
            else
            {
               if ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) == 0 )
               {
                  /* Execute user subroutine: 'TIPCOL' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
                     pr_default.close(1);
                     pr_default.close(0);
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV9BarTieTeo = AV12TiePro.add(DecimalUtil.doubleToDec(A469FasPreSal)).add(DecimalUtil.doubleToDec((A468FasPrePie*A191BarNumPie))) ;
               }
               else
               {
                  if ( A472FasVelPro.doubleValue() != 0 )
                  {
                     AV9BarTieTeo = DecimalUtil.doubleToDec(A469FasPreSal+(A468FasPrePie*A191BarNumPie)).add(((A184BarMtr.divide(A472FasVelPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(A464FasNumPas)))) ;
                  }
               }
            }
            AV9BarTieTeo = AV9BarTieTeo.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
            A216BarTieTeo = AV9BarTieTeo ;
            AV18Msg1 = Gx_msg + " - " + GXutil.trim( GXutil.str( A194BarOrdLin, 10, 0)) + " " + GXutil.trim( A457FasCod) ;
            System.out.println( AV18Msg1 );
            /* Using cursor P01K75 */
            pr_default.execute(2, new Object[] {A216BarTieTeo, A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
      /* 'TIPCOL' Routine */
      returnInSub = false ;
      /* Using cursor P01K76 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A129BarCod = P01K76_A129BarCod[0] ;
         n129BarCod = P01K76_n129BarCod[0] ;
         A132BarCodReo = P01K76_A132BarCodReo[0] ;
         n132BarCodReo = P01K76_n132BarCodReo[0] ;
         A130BarCodPar = P01K76_A130BarCodPar[0] ;
         n130BarCodPar = P01K76_n130BarCodPar[0] ;
         A831TipColCod = P01K76_A831TipColCod[0] ;
         A483ForColNum = P01K76_A483ForColNum[0] ;
         A482ForColNom = P01K76_A482ForColNom[0] ;
         A252CliCod = P01K76_A252CliCod[0] ;
         n252CliCod = P01K76_n252CliCod[0] ;
         A396EmprCod = P01K76_A396EmprCod[0] ;
         A494ForSer = P01K76_A494ForSer[0] ;
         A136BarColNum = P01K76_A136BarColNum[0] ;
         A135BarColNom = P01K76_A135BarColNom[0] ;
         A212BarSer = P01K76_A212BarSer[0] ;
         A136BarColNum = P01K76_A136BarColNum[0] ;
         A135BarColNom = P01K76_A135BarColNom[0] ;
         A212BarSer = P01K76_A212BarSer[0] ;
         /* Optimized group. */
         /* Using cursor P01K77 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         c771ProForTie = DecimalUtil.doubleToDec(P01K77_A771ProForTie[0]) ;
         pr_default.close(4);
         AV12TiePro = AV12TiePro.add(c771ProForTie) ;
         /* End optimized group. */
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pjbmfascal.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjbmfascal");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      cmdBuffer = "" ;
      scmdbuf = "" ;
      P01K73_A130BarCodPar = new String[] {""} ;
      P01K73_n130BarCodPar = new boolean[] {false} ;
      P01K73_A132BarCodReo = new byte[1] ;
      P01K73_n132BarCodReo = new boolean[] {false} ;
      P01K73_A129BarCod = new int[1] ;
      P01K73_n129BarCod = new boolean[] {false} ;
      P01K73_A213BarSit = new byte[1] ;
      P01K73_A396EmprCod = new String[] {""} ;
      P01K73_A252CliCod = new int[1] ;
      P01K73_n252CliCod = new boolean[] {false} ;
      P01K73_A212BarSer = new String[] {""} ;
      P01K73_A135BarColNom = new String[] {""} ;
      P01K73_A136BarColNum = new int[1] ;
      P01K73_A218BarTipCol = new byte[1] ;
      P01K73_A191BarNumPie = new short[1] ;
      P01K73_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01K73_n184BarMtr = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV11DecTot = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      P01K74_A396EmprCod = new String[] {""} ;
      P01K74_A129BarCod = new int[1] ;
      P01K74_n129BarCod = new boolean[] {false} ;
      P01K74_A132BarCodReo = new byte[1] ;
      P01K74_n132BarCodReo = new boolean[] {false} ;
      P01K74_A130BarCodPar = new String[] {""} ;
      P01K74_n130BarCodPar = new boolean[] {false} ;
      P01K74_A456FasActTin = new String[] {""} ;
      P01K74_n456FasActTin = new boolean[] {false} ;
      P01K74_A468FasPrePie = new short[1] ;
      P01K74_n468FasPrePie = new boolean[] {false} ;
      P01K74_A469FasPreSal = new short[1] ;
      P01K74_n469FasPreSal = new boolean[] {false} ;
      P01K74_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01K74_n472FasVelPro = new boolean[] {false} ;
      P01K74_A464FasNumPas = new short[1] ;
      P01K74_n464FasNumPas = new boolean[] {false} ;
      P01K74_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01K74_A457FasCod = new String[] {""} ;
      P01K74_A194BarOrdLin = new short[1] ;
      P01K74_A758ProCod = new String[] {""} ;
      A456FasActTin = "" ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV9BarTieTeo = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      AV12TiePro = DecimalUtil.ZERO ;
      GXv_int7 = new short[1] ;
      AV18Msg1 = "" ;
      P01K76_A129BarCod = new int[1] ;
      P01K76_n129BarCod = new boolean[] {false} ;
      P01K76_A132BarCodReo = new byte[1] ;
      P01K76_n132BarCodReo = new boolean[] {false} ;
      P01K76_A130BarCodPar = new String[] {""} ;
      P01K76_n130BarCodPar = new boolean[] {false} ;
      P01K76_A831TipColCod = new byte[1] ;
      P01K76_A483ForColNum = new int[1] ;
      P01K76_A482ForColNom = new String[] {""} ;
      P01K76_A252CliCod = new int[1] ;
      P01K76_n252CliCod = new boolean[] {false} ;
      P01K76_A396EmprCod = new String[] {""} ;
      P01K76_A494ForSer = new String[] {""} ;
      P01K76_A136BarColNum = new int[1] ;
      P01K76_A135BarColNom = new String[] {""} ;
      P01K76_A212BarSer = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      c771ProForTie = DecimalUtil.ZERO ;
      P01K77_A771ProForTie = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjbmfascal__default(),
         new Object[] {
             new Object[] {
            P01K73_A130BarCodPar, P01K73_A132BarCodReo, P01K73_A129BarCod, P01K73_A213BarSit, P01K73_A396EmprCod, P01K73_A252CliCod, P01K73_n252CliCod, P01K73_A212BarSer, P01K73_A135BarColNom, P01K73_A136BarColNum,
            P01K73_A218BarTipCol, P01K73_A191BarNumPie, P01K73_A184BarMtr, P01K73_n184BarMtr
            }
            , new Object[] {
            P01K74_A396EmprCod, P01K74_A129BarCod, P01K74_A132BarCodReo, P01K74_A130BarCodPar, P01K74_A456FasActTin, P01K74_n456FasActTin, P01K74_A468FasPrePie, P01K74_n468FasPrePie, P01K74_A469FasPreSal, P01K74_n469FasPreSal,
            P01K74_A472FasVelPro, P01K74_n472FasVelPro, P01K74_A464FasNumPas, P01K74_n464FasNumPas, P01K74_A216BarTieTeo, P01K74_A457FasCod, P01K74_A194BarOrdLin, P01K74_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01K76_A129BarCod, P01K76_n129BarCod, P01K76_A132BarCodReo, P01K76_n132BarCodReo, P01K76_A130BarCodPar, P01K76_n130BarCodPar, P01K76_A831TipColCod, P01K76_A483ForColNum, P01K76_A482ForColNom, P01K76_A252CliCod,
            P01K76_n252CliCod, P01K76_A396EmprCod, P01K76_A494ForSer, P01K76_A136BarColNum, P01K76_A135BarColNom, P01K76_A212BarSer
            }
            , new Object[] {
            P01K77_A771ProForTie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte GXv_int6[] ;
   private byte A831TipColCod ;
   private short A191BarNumPie ;
   private short A468FasPrePie ;
   private short A469FasPreSal ;
   private short A464FasNumPas ;
   private short A194BarOrdLin ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int A483ForColNum ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV11DecTot ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal AV9BarTieTeo ;
   private java.math.BigDecimal AV12TiePro ;
   private java.math.BigDecimal c771ProForTie ;
   private String cmdBuffer ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String Gx_msg ;
   private String A456FasActTin ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV18Msg1 ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean n252CliCod ;
   private boolean n184BarMtr ;
   private boolean n456FasActTin ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n472FasVelPro ;
   private boolean n464FasNumPas ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P01K73_A130BarCodPar ;
   private boolean[] P01K73_n130BarCodPar ;
   private byte[] P01K73_A132BarCodReo ;
   private boolean[] P01K73_n132BarCodReo ;
   private int[] P01K73_A129BarCod ;
   private boolean[] P01K73_n129BarCod ;
   private byte[] P01K73_A213BarSit ;
   private String[] P01K73_A396EmprCod ;
   private int[] P01K73_A252CliCod ;
   private boolean[] P01K73_n252CliCod ;
   private String[] P01K73_A212BarSer ;
   private String[] P01K73_A135BarColNom ;
   private int[] P01K73_A136BarColNum ;
   private byte[] P01K73_A218BarTipCol ;
   private short[] P01K73_A191BarNumPie ;
   private java.math.BigDecimal[] P01K73_A184BarMtr ;
   private boolean[] P01K73_n184BarMtr ;
   private String[] P01K74_A396EmprCod ;
   private int[] P01K74_A129BarCod ;
   private boolean[] P01K74_n129BarCod ;
   private byte[] P01K74_A132BarCodReo ;
   private boolean[] P01K74_n132BarCodReo ;
   private String[] P01K74_A130BarCodPar ;
   private boolean[] P01K74_n130BarCodPar ;
   private String[] P01K74_A456FasActTin ;
   private boolean[] P01K74_n456FasActTin ;
   private short[] P01K74_A468FasPrePie ;
   private boolean[] P01K74_n468FasPrePie ;
   private short[] P01K74_A469FasPreSal ;
   private boolean[] P01K74_n469FasPreSal ;
   private java.math.BigDecimal[] P01K74_A472FasVelPro ;
   private boolean[] P01K74_n472FasVelPro ;
   private short[] P01K74_A464FasNumPas ;
   private boolean[] P01K74_n464FasNumPas ;
   private java.math.BigDecimal[] P01K74_A216BarTieTeo ;
   private String[] P01K74_A457FasCod ;
   private short[] P01K74_A194BarOrdLin ;
   private String[] P01K74_A758ProCod ;
   private int[] P01K76_A129BarCod ;
   private boolean[] P01K76_n129BarCod ;
   private byte[] P01K76_A132BarCodReo ;
   private boolean[] P01K76_n132BarCodReo ;
   private String[] P01K76_A130BarCodPar ;
   private boolean[] P01K76_n130BarCodPar ;
   private byte[] P01K76_A831TipColCod ;
   private int[] P01K76_A483ForColNum ;
   private String[] P01K76_A482ForColNom ;
   private int[] P01K76_A252CliCod ;
   private boolean[] P01K76_n252CliCod ;
   private String[] P01K76_A396EmprCod ;
   private String[] P01K76_A494ForSer ;
   private int[] P01K76_A136BarColNum ;
   private String[] P01K76_A135BarColNom ;
   private String[] P01K76_A212BarSer ;
   private long[] P01K77_A771ProForTie ;
}

final  class apjbmfascal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01K73", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSit, T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarNumPie, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01K74", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasActTin, T2.FasPrePie, T2.FasPreSal, T2.FasVelPro, T2.FasNumPas, T1.BarTieTeo, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01K75", "UPDATE TXPBARFAS SET BarTieTeo=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P01K76", "SELECT * FROM (SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.CliCod, T1.EmprCod, T1.ForSer, T2.BarColNum, T2.BarColNom, T2.BarSer FROM (TXPCFORMU T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.CliCod = ?) AND (T1.ForSer = T2.BarSer) AND (T1.ForColNom = T2.BarColNom) AND (T1.ForColNum = T2.BarColNum) ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01K77", "SELECT SUM(T2.ProForTie) FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[15])[0] = rslt.getString(11, 8);
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(4);
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 13);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setString(6, (String)parms[8], 8);
               stmt.setShort(7, ((Number) parms[9]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 13);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
      }
   }

}

