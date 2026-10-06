package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apforestact extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apforestact pgm = new apforestact (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apforestact( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apforestact.class ), "" );
   }

   public apforestact( int remoteHandle ,
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
      AV8Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV9EmprCod ;
      GXv_char2[0] = "" ;
      GXv_char3[0] = "" ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char1, GXv_char2, GXv_char3) ;
      apforestact.this.AV9EmprCod = GXv_char1[0] ;
      GXt_int4 = AV10EstCob ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "ESTCOB", ""), GXv_int5) ;
      apforestact.this.GXt_int4 = GXv_int5[0] ;
      AV10EstCob = GXt_int4 ;
      GXt_int4 = AV11EstPas ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "ESTPAS", ""), GXv_int5) ;
      apforestact.this.GXt_int4 = GXv_int5[0] ;
      AV11EstPas = GXt_int4 ;
      /* Using cursor P01EF2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A279CliNom = P01EF2_A279CliNom[0] ;
         A2076ColEstMba = P01EF2_A2076ColEstMba[0] ;
         n2076ColEstMba = P01EF2_n2076ColEstMba[0] ;
         A4861DibCob = P01EF2_A4861DibCob[0] ;
         n4861DibCob = P01EF2_n4861DibCob[0] ;
         A2078ColFon = P01EF2_A2078ColFon[0] ;
         A2074ColCom = P01EF2_A2074ColCom[0] ;
         A1014DibInt = P01EF2_A1014DibInt[0] ;
         A1013DibCli = P01EF2_A1013DibCli[0] ;
         A2141SerEst = P01EF2_A2141SerEst[0] ;
         A252CliCod = P01EF2_A252CliCod[0] ;
         A396EmprCod = P01EF2_A396EmprCod[0] ;
         A1823DibTipMaq = P01EF2_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P01EF2_n1823DibTipMaq[0] ;
         A2075ColEstAnh = P01EF2_A2075ColEstAnh[0] ;
         n2075ColEstAnh = P01EF2_n2075ColEstAnh[0] ;
         A279CliNom = P01EF2_A279CliNom[0] ;
         A4861DibCob = P01EF2_A4861DibCob[0] ;
         n4861DibCob = P01EF2_n4861DibCob[0] ;
         A1823DibTipMaq = P01EF2_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P01EF2_n1823DibTipMaq[0] ;
         A2075ColEstAnh = P01EF2_A2075ColEstAnh[0] ;
         n2075ColEstAnh = P01EF2_n2075ColEstAnh[0] ;
         A2076ColEstMba = DecimalUtil.doubleToDec(100) ;
         n2076ColEstMba = false ;
         /* Using cursor P01EF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2100MolCon = P01EF3_A2100MolCon[0] ;
            n2100MolCon = P01EF3_n2100MolCon[0] ;
            A2098MolCod = P01EF3_A2098MolCod[0] ;
            if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
            {
               A4862MolPrcCob = getMolPrcCob0( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
            }
            else
            {
               if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
               {
                  A4862MolPrcCob = getMolPrcCob1( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
               }
               else
               {
                  A4862MolPrcCob = DecimalUtil.doubleToDec(0) ;
               }
            }
            Gx_msg = httpContext.getMessage( "Actualizando : ", "") + GXutil.trim( A279CliNom) + ", " + GXutil.trim( A2141SerEst) + ", " + GXutil.trim( A1013DibCli) + ", " + GXutil.trim( GXutil.str( A1014DibInt, 10, 0)) + ", " + GXutil.trim( A2074ColCom) + ", " + GXutil.trim( A2078ColFon) ;
            System.out.println( Gx_msg );
            if ( AV11EstPas == 1 )
            {
               GXv_char3[0] = A396EmprCod ;
               GXv_int6[0] = A252CliCod ;
               GXv_char2[0] = A2141SerEst ;
               GXv_char1[0] = A1013DibCli ;
               GXv_int7[0] = A1014DibInt ;
               GXv_char8[0] = A2074ColCom ;
               GXv_char9[0] = A2078ColFon ;
               GXv_int5[0] = A2098MolCod ;
               new app.pestpas(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_char2, GXv_char1, GXv_int7, GXv_char8, GXv_char9, GXv_int5) ;
               apforestact.this.A396EmprCod = GXv_char3[0] ;
               apforestact.this.A252CliCod = GXv_int6[0] ;
               apforestact.this.A2141SerEst = GXv_char2[0] ;
               apforestact.this.A1013DibCli = GXv_char1[0] ;
               apforestact.this.A1014DibInt = GXv_int7[0] ;
               apforestact.this.A2074ColCom = GXv_char8[0] ;
               apforestact.this.A2078ColFon = GXv_char9[0] ;
               apforestact.this.A2098MolCod = GXv_int5[0] ;
            }
            if ( AV10EstCob == 1 )
            {
               A2100MolCon = A4861DibCob.multiply((A4862MolPrcCob.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).multiply(DecimalUtil.doubleToDec((A2075ColEstAnh/ (double) (100)))).multiply(A2076ColEstMba) ;
               n2100MolCon = false ;
            }
            /* Using cursor P01EF4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n2100MolCon), A2100MolCon, A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P01EF5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n2076ColEstMba), A2076ColEstMba, A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORES");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( "" );
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso finalizado", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pforestact.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apforestact");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getMolPrcCob1( byte E2098MolCod ,
                                              String E396EmprCod ,
                                              String E1013DibCli ,
                                              int E252CliCod ,
                                              int E1014DibInt )
   {
      X5381DibPrcCobM = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor P01EF6 */
      pr_default.execute(4, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         if ( ( ( P01EF6_A2088DibDibMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X5381DibPrcCobM = P01EF6_A5381DibPrcCobM[0] ;
            nX5381DibPrcCobM = false ;
            if (true) break;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      return X5381DibPrcCobM ;
   }

   public java.math.BigDecimal getMolPrcCob0( byte E2098MolCod ,
                                              String E396EmprCod ,
                                              String E1013DibCli ,
                                              int E252CliCod ,
                                              int E1014DibInt )
   {
      X4860DibPrcCob = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor P01EF7 */
      pr_default.execute(5, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         if ( ( ( P01EF7_A2089DibLinMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X4860DibPrcCob = P01EF7_A4860DibPrcCob[0] ;
            nX4860DibPrcCob = false ;
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      return X4860DibPrcCob ;
   }

   public void initialize( )
   {
      AV8Station = "" ;
      AV9EmprCod = "" ;
      scmdbuf = "" ;
      P01EF2_A65ArtCod = new String[] {""} ;
      P01EF2_A279CliNom = new String[] {""} ;
      P01EF2_A2076ColEstMba = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EF2_n2076ColEstMba = new boolean[] {false} ;
      P01EF2_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EF2_n4861DibCob = new boolean[] {false} ;
      P01EF2_A2078ColFon = new String[] {""} ;
      P01EF2_A2074ColCom = new String[] {""} ;
      P01EF2_A1014DibInt = new int[1] ;
      P01EF2_A1013DibCli = new String[] {""} ;
      P01EF2_A2141SerEst = new String[] {""} ;
      P01EF2_A252CliCod = new int[1] ;
      P01EF2_A396EmprCod = new String[] {""} ;
      P01EF2_A1823DibTipMaq = new String[] {""} ;
      P01EF2_n1823DibTipMaq = new boolean[] {false} ;
      P01EF2_A2075ColEstAnh = new short[1] ;
      P01EF2_n2075ColEstAnh = new boolean[] {false} ;
      A279CliNom = "" ;
      A2076ColEstMba = DecimalUtil.ZERO ;
      A4861DibCob = DecimalUtil.ZERO ;
      A2078ColFon = "" ;
      A2074ColCom = "" ;
      A1013DibCli = "" ;
      A2141SerEst = "" ;
      A396EmprCod = "" ;
      A1823DibTipMaq = "" ;
      P01EF3_A396EmprCod = new String[] {""} ;
      P01EF3_A252CliCod = new int[1] ;
      P01EF3_A2141SerEst = new String[] {""} ;
      P01EF3_A1013DibCli = new String[] {""} ;
      P01EF3_A1014DibInt = new int[1] ;
      P01EF3_A2074ColCom = new String[] {""} ;
      P01EF3_A2078ColFon = new String[] {""} ;
      P01EF3_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EF3_n2100MolCon = new boolean[] {false} ;
      P01EF3_A2098MolCod = new byte[1] ;
      A2100MolCon = DecimalUtil.ZERO ;
      A4862MolPrcCob = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int5 = new byte[1] ;
      X5381DibPrcCobM = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      E1013DibCli = "" ;
      P01EF6_A396EmprCod = new String[] {""} ;
      P01EF6_A1013DibCli = new String[] {""} ;
      P01EF6_A252CliCod = new int[1] ;
      P01EF6_A1014DibInt = new int[1] ;
      P01EF6_A1029DibLin = new short[1] ;
      P01EF6_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EF6_n5381DibPrcCobM = new boolean[] {false} ;
      P01EF6_A2088DibDibMol = new byte[1] ;
      P01EF6_n2088DibDibMol = new boolean[] {false} ;
      X4860DibPrcCob = DecimalUtil.ZERO ;
      P01EF7_A396EmprCod = new String[] {""} ;
      P01EF7_A1013DibCli = new String[] {""} ;
      P01EF7_A252CliCod = new int[1] ;
      P01EF7_A1014DibInt = new int[1] ;
      P01EF7_A1807DibLinCil = new short[1] ;
      P01EF7_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EF7_n4860DibPrcCob = new boolean[] {false} ;
      P01EF7_A2089DibLinMol = new byte[1] ;
      P01EF7_n2089DibLinMol = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apforestact__default(),
         new Object[] {
             new Object[] {
            P01EF2_A65ArtCod, P01EF2_A279CliNom, P01EF2_A2076ColEstMba, P01EF2_n2076ColEstMba, P01EF2_A4861DibCob, P01EF2_n4861DibCob, P01EF2_A2078ColFon, P01EF2_A2074ColCom, P01EF2_A1014DibInt, P01EF2_A1013DibCli,
            P01EF2_A2141SerEst, P01EF2_A252CliCod, P01EF2_A396EmprCod, P01EF2_A1823DibTipMaq, P01EF2_n1823DibTipMaq, P01EF2_A2075ColEstAnh, P01EF2_n2075ColEstAnh
            }
            , new Object[] {
            P01EF3_A396EmprCod, P01EF3_A252CliCod, P01EF3_A2141SerEst, P01EF3_A1013DibCli, P01EF3_A1014DibInt, P01EF3_A2074ColCom, P01EF3_A2078ColFon, P01EF3_A2100MolCon, P01EF3_n2100MolCon, P01EF3_A2098MolCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01EF6_A396EmprCod, P01EF6_A1013DibCli, P01EF6_A252CliCod, P01EF6_A1014DibInt, P01EF6_A1029DibLin, P01EF6_A5381DibPrcCobM, P01EF6_n5381DibPrcCobM, P01EF6_A2088DibDibMol, P01EF6_n2088DibDibMol
            }
            , new Object[] {
            P01EF7_A396EmprCod, P01EF7_A1013DibCli, P01EF7_A252CliCod, P01EF7_A1014DibInt, P01EF7_A1807DibLinCil, P01EF7_A4860DibPrcCob, P01EF7_n4860DibPrcCob, P01EF7_A2089DibLinMol, P01EF7_n2089DibLinMol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10EstCob ;
   private byte AV11EstPas ;
   private byte GXt_int4 ;
   private byte A2098MolCod ;
   private byte GXv_int5[] ;
   private byte E2098MolCod ;
   private short A2075ColEstAnh ;
   private short Gx_err ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private int E252CliCod ;
   private int E1014DibInt ;
   private java.math.BigDecimal A2076ColEstMba ;
   private java.math.BigDecimal A4861DibCob ;
   private java.math.BigDecimal A2100MolCon ;
   private java.math.BigDecimal A4862MolPrcCob ;
   private java.math.BigDecimal X5381DibPrcCobM ;
   private java.math.BigDecimal X4860DibPrcCob ;
   private String AV8Station ;
   private String AV9EmprCod ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A2078ColFon ;
   private String A2074ColCom ;
   private String A1013DibCli ;
   private String A2141SerEst ;
   private String A396EmprCod ;
   private String A1823DibTipMaq ;
   private String Gx_msg ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String E396EmprCod ;
   private String E1013DibCli ;
   private boolean n2076ColEstMba ;
   private boolean n4861DibCob ;
   private boolean n1823DibTipMaq ;
   private boolean n2075ColEstAnh ;
   private boolean n2100MolCon ;
   private boolean Gx_first ;
   private boolean nX5381DibPrcCobM ;
   private boolean nX4860DibPrcCob ;
   private IDataStoreProvider pr_default ;
   private String[] P01EF2_A65ArtCod ;
   private String[] P01EF2_A279CliNom ;
   private java.math.BigDecimal[] P01EF2_A2076ColEstMba ;
   private boolean[] P01EF2_n2076ColEstMba ;
   private java.math.BigDecimal[] P01EF2_A4861DibCob ;
   private boolean[] P01EF2_n4861DibCob ;
   private String[] P01EF2_A2078ColFon ;
   private String[] P01EF2_A2074ColCom ;
   private int[] P01EF2_A1014DibInt ;
   private String[] P01EF2_A1013DibCli ;
   private String[] P01EF2_A2141SerEst ;
   private int[] P01EF2_A252CliCod ;
   private String[] P01EF2_A396EmprCod ;
   private String[] P01EF2_A1823DibTipMaq ;
   private boolean[] P01EF2_n1823DibTipMaq ;
   private short[] P01EF2_A2075ColEstAnh ;
   private boolean[] P01EF2_n2075ColEstAnh ;
   private String[] P01EF3_A396EmprCod ;
   private int[] P01EF3_A252CliCod ;
   private String[] P01EF3_A2141SerEst ;
   private String[] P01EF3_A1013DibCli ;
   private int[] P01EF3_A1014DibInt ;
   private String[] P01EF3_A2074ColCom ;
   private String[] P01EF3_A2078ColFon ;
   private java.math.BigDecimal[] P01EF3_A2100MolCon ;
   private boolean[] P01EF3_n2100MolCon ;
   private byte[] P01EF3_A2098MolCod ;
   private String[] P01EF6_A396EmprCod ;
   private String[] P01EF6_A1013DibCli ;
   private int[] P01EF6_A252CliCod ;
   private int[] P01EF6_A1014DibInt ;
   private short[] P01EF6_A1029DibLin ;
   private java.math.BigDecimal[] P01EF6_A5381DibPrcCobM ;
   private boolean[] P01EF6_n5381DibPrcCobM ;
   private byte[] P01EF6_A2088DibDibMol ;
   private boolean[] P01EF6_n2088DibDibMol ;
   private String[] P01EF7_A396EmprCod ;
   private String[] P01EF7_A1013DibCli ;
   private int[] P01EF7_A252CliCod ;
   private int[] P01EF7_A1014DibInt ;
   private short[] P01EF7_A1807DibLinCil ;
   private java.math.BigDecimal[] P01EF7_A4860DibPrcCob ;
   private boolean[] P01EF7_n4860DibPrcCob ;
   private byte[] P01EF7_A2089DibLinMol ;
   private boolean[] P01EF7_n2089DibLinMol ;
}

final  class apforestact__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01EF2", "SELECT T4.ArtCod, T2.CliNom, T1.ColEstMba, T3.DibCob, T1.ColFon, T1.ColCom, T1.DibInt, T1.DibCli, T1.SerEst, T1.CliCod, T1.EmprCod, T3.DibTipMaq, COALESCE( T4.ArtAcaMin, 0) AS ColEstAnh FROM (((TXPCFORES T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCDIBUJ T3 ON T3.EmprCod = T1.EmprCod AND T3.DibCli = T1.DibCli AND T3.CliCod = T1.CliCod AND T3.DibInt = T1.DibInt) LEFT JOIN TXPARTICU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ArtCod = T1.SerEst) ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01EF3", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCon, MolCod FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01EF4", "UPDATE TXPMFORES SET MolCon=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMFORES")
         ,new UpdateCursor("P01EF5", "UPDATE TXPCFORES SET ColEstMba=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORES")
         ,new ForEachCursor("P01EF6", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLin, DibPrcCobM, DibDibMol FROM TXPLDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01EF7", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibPrcCob, DibLinMol FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 12);
               ((String[]) buf[7])[0] = rslt.getString(6, 12);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 16);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 12);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 16);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 12);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

