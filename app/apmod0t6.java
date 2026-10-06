package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apmod0t6 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apmod0t6 pgm = new apmod0t6 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apmod0t6( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apmod0t6.class ), "" );
   }

   public apmod0t6( int remoteHandle ,
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
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Inicio Proceso", ""));
      /* Using cursor P01YL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P01YL2_A719PrdNum[0] ;
         A396EmprCod = P01YL2_A396EmprCod[0] ;
         A724PrdPreAct = P01YL2_A724PrdPreAct[0] ;
         A795PrvNum = P01YL2_A795PrvNum[0] ;
         AV8Pre_new = A724PrdPreAct ;
         AV9PrvNum = A795PrvNum ;
         AV12PedPri = "1" ;
         /* Using cursor P01YL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A681PrdAny = P01YL3_A681PrdAny[0] ;
            A331DifValConA = P01YL3_A331DifValConA[0] ;
            n331DifValConA = P01YL3_n331DifValConA[0] ;
            /* Optimized DELETE. */
            /* Using cursor P01YL4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
            /* End optimized DELETE. */
            /* Using cursor P01YL5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDES");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P01YL6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV9PrvNum)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A779PrvAny = P01YL6_A779PrvAny[0] ;
            A795PrvNum = P01YL6_A795PrvNum[0] ;
            A330DifEstCa1 = P01YL6_A330DifEstCa1[0] ;
            n330DifEstCa1 = P01YL6_n330DifEstCa1[0] ;
            /* Optimized DELETE. */
            /* Using cursor P01YL7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
            /* End optimized DELETE. */
            /* Using cursor P01YL8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRVES");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         /* Using cursor P01YL9 */
         pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A3348CCStkFec = P01YL9_A3348CCStkFec[0] ;
            A3345TipMovCc = P01YL9_A3345TipMovCc[0] ;
            A3343CCStkCanE = P01YL9_A3343CCStkCanE[0] ;
            A3347CCStkPri = P01YL9_A3347CCStkPri[0] ;
            A3344CCStkCanS = P01YL9_A3344CCStkCanS[0] ;
            A3342CCStkLin = P01YL9_A3342CCStkLin[0] ;
            AV11Year = (short)(GXutil.year( A3348CCStkFec)) ;
            if ( AV11Year == 2004 )
            {
               AV10Mes = (byte)(GXutil.month( A3348CCStkFec)) ;
               if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", "")) == 0 )
               {
                  GXv_char1[0] = A396EmprCod ;
                  GXv_int2[0] = AV9PrvNum ;
                  GXv_int3[0] = AV11Year ;
                  GXv_int4[0] = AV10Mes ;
                  GXv_decimal5[0] = A3343CCStkCanE ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal7[0] = AV8Pre_new ;
                  GXv_char8[0] = A3347CCStkPri ;
                  new app.pentpro(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_char8) ;
                  apmod0t6.this.A396EmprCod = GXv_char1[0] ;
                  apmod0t6.this.AV9PrvNum = GXv_int2[0] ;
                  apmod0t6.this.AV11Year = GXv_int3[0] ;
                  apmod0t6.this.AV10Mes = GXv_int4[0] ;
                  apmod0t6.this.A3343CCStkCanE = GXv_decimal5[0] ;
                  apmod0t6.this.AV8Pre_new = GXv_decimal7[0] ;
                  apmod0t6.this.A3347CCStkPri = GXv_char8[0] ;
                  GXv_char8[0] = A396EmprCod ;
                  GXv_char1[0] = A719PrdNum ;
                  GXv_int3[0] = AV11Year ;
                  GXv_int4[0] = AV10Mes ;
                  GXv_decimal7[0] = A3343CCStkCanE ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = AV8Pre_new ;
                  new app.pentprd(remoteHandle, context).execute( GXv_char8, GXv_char1, GXv_int3, GXv_int4, GXv_decimal7, GXv_decimal6, GXv_decimal5) ;
                  apmod0t6.this.A396EmprCod = GXv_char8[0] ;
                  apmod0t6.this.A719PrdNum = GXv_char1[0] ;
                  apmod0t6.this.AV11Year = GXv_int3[0] ;
                  apmod0t6.this.AV10Mes = GXv_int4[0] ;
                  apmod0t6.this.A3343CCStkCanE = GXv_decimal7[0] ;
                  apmod0t6.this.AV8Pre_new = GXv_decimal5[0] ;
               }
               if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 ) )
               {
                  new app.pentpr2(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV11Year, AV10Mes, A3344CCStkCanS, DecimalUtil.doubleToDec(0), AV8Pre_new, A3348CCStkFec) ;
               }
               if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", "")) == 0 )
               {
                  GXv_char8[0] = A396EmprCod ;
                  GXv_int2[0] = AV9PrvNum ;
                  GXv_date9[0] = A3348CCStkFec ;
                  GXv_int10[0] = 0 ;
                  GXv_decimal7[0] = A3344CCStkCanS ;
                  GXv_decimal6[0] = AV8Pre_new ;
                  GXv_char1[0] = A3347CCStkPri ;
                  new app.pacespr(remoteHandle, context).execute( GXv_char8, GXv_int2, GXv_date9, GXv_int10, GXv_decimal7, GXv_decimal6, GXv_char1) ;
                  apmod0t6.this.A396EmprCod = GXv_char8[0] ;
                  apmod0t6.this.AV9PrvNum = GXv_int2[0] ;
                  apmod0t6.this.A3348CCStkFec = GXv_date9[0] ;
                  apmod0t6.this.A3344CCStkCanS = GXv_decimal7[0] ;
                  apmod0t6.this.AV8Pre_new = GXv_decimal6[0] ;
                  apmod0t6.this.A3347CCStkPri = GXv_char1[0] ;
                  GXv_char8[0] = A396EmprCod ;
                  GXv_char1[0] = A719PrdNum ;
                  GXv_date9[0] = A3348CCStkFec ;
                  GXv_decimal7[0] = A3344CCStkCanS ;
                  GXv_decimal6[0] = AV8Pre_new ;
                  new app.pacespd(remoteHandle, context).execute( GXv_char8, GXv_char1, GXv_date9, GXv_decimal7, GXv_decimal6) ;
                  apmod0t6.this.A396EmprCod = GXv_char8[0] ;
                  apmod0t6.this.A719PrdNum = GXv_char1[0] ;
                  apmod0t6.this.A3348CCStkFec = GXv_date9[0] ;
                  apmod0t6.this.A3344CCStkCanS = GXv_decimal7[0] ;
                  apmod0t6.this.AV8Pre_new = GXv_decimal6[0] ;
               }
            }
            pr_default.readNext(7);
         }
         pr_default.close(7);
         /* Using cursor P01YL10 */
         pr_default.execute(8, new Object[] {A396EmprCod, A719PrdNum});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A3348CCStkFec = P01YL10_A3348CCStkFec[0] ;
            A3349CCStkPre = P01YL10_A3349CCStkPre[0] ;
            A3342CCStkLin = P01YL10_A3342CCStkLin[0] ;
            AV11Year = (short)(GXutil.year( A3348CCStkFec)) ;
            if ( AV11Year == 2004 )
            {
               A3349CCStkPre = AV8Pre_new ;
            }
            /* Using cursor P01YL11 */
            pr_default.execute(9, new Object[] {A3349CCStkPre, A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
            pr_default.readNext(8);
         }
         pr_default.close(8);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P01YL12 */
      pr_default.execute(10);
      while ( (pr_default.getStatus(10) != 101) )
      {
         A396EmprCod = P01YL12_A396EmprCod[0] ;
         A704PrdExiAlm = P01YL12_A704PrdExiAlm[0] ;
         A726PrdPreMed = P01YL12_A726PrdPreMed[0] ;
         A724PrdPreAct = P01YL12_A724PrdPreAct[0] ;
         A719PrdNum = P01YL12_A719PrdNum[0] ;
         if ( A704PrdExiAlm.doubleValue() == 0 )
         {
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A726PrdPreMed = A724PrdPreAct ;
         }
         /* Using cursor P01YL13 */
         pr_default.execute(11, new Object[] {A726PrdPreMed, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         pr_default.readNext(10);
      }
      pr_default.close(10);
      AV13FechaHora = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV14FechaCar = localUtil.ttoc( AV13FechaHora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV15Mensaje2 = httpContext.getMessage( "Fin Proceso ", "") + "/" + httpContext.getMessage( " FechaHora : ", "") + AV14FechaCar ;
      httpContext.GX_msglist.addItem(AV15Mensaje2);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pmod0t6.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apmod0t6");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P01YL2_A719PrdNum = new String[] {""} ;
      P01YL2_A396EmprCod = new String[] {""} ;
      P01YL2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YL2_A795PrvNum = new int[1] ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV8Pre_new = DecimalUtil.ZERO ;
      AV12PedPri = "" ;
      P01YL3_A396EmprCod = new String[] {""} ;
      P01YL3_A719PrdNum = new String[] {""} ;
      P01YL3_A681PrdAny = new short[1] ;
      P01YL3_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YL3_n331DifValConA = new boolean[] {false} ;
      A331DifValConA = DecimalUtil.ZERO ;
      P01YL6_A396EmprCod = new String[] {""} ;
      P01YL6_A779PrvAny = new short[1] ;
      P01YL6_A795PrvNum = new int[1] ;
      P01YL6_A330DifEstCa1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YL6_n330DifEstCa1 = new boolean[] {false} ;
      A330DifEstCa1 = DecimalUtil.ZERO ;
      P01YL9_A396EmprCod = new String[] {""} ;
      P01YL9_A719PrdNum = new String[] {""} ;
      P01YL9_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P01YL9_A3345TipMovCc = new String[] {""} ;
      P01YL9_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YL9_A3347CCStkPri = new String[] {""} ;
      P01YL9_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YL9_A3342CCStkLin = new long[1] ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3345TipMovCc = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3347CCStkPri = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      GXv_int3 = new short[1] ;
      GXv_int4 = new byte[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int2 = new int[1] ;
      GXv_int10 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      P01YL10_A396EmprCod = new String[] {""} ;
      P01YL10_A719PrdNum = new String[] {""} ;
      P01YL10_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P01YL10_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YL10_A3342CCStkLin = new long[1] ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      P01YL12_A396EmprCod = new String[] {""} ;
      P01YL12_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YL12_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YL12_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YL12_A719PrdNum = new String[] {""} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      AV13FechaHora = GXutil.resetTime( GXutil.nullDate() );
      AV14FechaCar = "" ;
      AV15Mensaje2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apmod0t6__default(),
         new Object[] {
             new Object[] {
            P01YL2_A719PrdNum, P01YL2_A396EmprCod, P01YL2_A724PrdPreAct, P01YL2_A795PrvNum
            }
            , new Object[] {
            P01YL3_A396EmprCod, P01YL3_A719PrdNum, P01YL3_A681PrdAny, P01YL3_A331DifValConA, P01YL3_n331DifValConA
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01YL6_A396EmprCod, P01YL6_A779PrvAny, P01YL6_A795PrvNum, P01YL6_A330DifEstCa1, P01YL6_n330DifEstCa1
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01YL9_A396EmprCod, P01YL9_A719PrdNum, P01YL9_A3348CCStkFec, P01YL9_A3345TipMovCc, P01YL9_A3343CCStkCanE, P01YL9_A3347CCStkPri, P01YL9_A3344CCStkCanS, P01YL9_A3342CCStkLin
            }
            , new Object[] {
            P01YL10_A396EmprCod, P01YL10_A719PrdNum, P01YL10_A3348CCStkFec, P01YL10_A3349CCStkPre, P01YL10_A3342CCStkLin
            }
            , new Object[] {
            }
            , new Object[] {
            P01YL12_A396EmprCod, P01YL12_A704PrdExiAlm, P01YL12_A726PrdPreMed, P01YL12_A724PrdPreAct, P01YL12_A719PrdNum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Mes ;
   private byte GXv_int4[] ;
   private short A681PrdAny ;
   private short A779PrvAny ;
   private short AV11Year ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int A795PrvNum ;
   private int AV9PrvNum ;
   private int GXv_int2[] ;
   private int GXv_int10[] ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV8Pre_new ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A330DifEstCa1 ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A726PrdPreMed ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String AV12PedPri ;
   private String A3345TipMovCc ;
   private String A3347CCStkPri ;
   private String GXv_char8[] ;
   private String GXv_char1[] ;
   private String AV14FechaCar ;
   private String AV15Mensaje2 ;
   private java.util.Date AV13FechaHora ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date GXv_date9[] ;
   private boolean n331DifValConA ;
   private boolean n330DifEstCa1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01YL2_A719PrdNum ;
   private String[] P01YL2_A396EmprCod ;
   private java.math.BigDecimal[] P01YL2_A724PrdPreAct ;
   private int[] P01YL2_A795PrvNum ;
   private String[] P01YL3_A396EmprCod ;
   private String[] P01YL3_A719PrdNum ;
   private short[] P01YL3_A681PrdAny ;
   private java.math.BigDecimal[] P01YL3_A331DifValConA ;
   private boolean[] P01YL3_n331DifValConA ;
   private String[] P01YL6_A396EmprCod ;
   private short[] P01YL6_A779PrvAny ;
   private int[] P01YL6_A795PrvNum ;
   private java.math.BigDecimal[] P01YL6_A330DifEstCa1 ;
   private boolean[] P01YL6_n330DifEstCa1 ;
   private String[] P01YL9_A396EmprCod ;
   private String[] P01YL9_A719PrdNum ;
   private java.util.Date[] P01YL9_A3348CCStkFec ;
   private String[] P01YL9_A3345TipMovCc ;
   private java.math.BigDecimal[] P01YL9_A3343CCStkCanE ;
   private String[] P01YL9_A3347CCStkPri ;
   private java.math.BigDecimal[] P01YL9_A3344CCStkCanS ;
   private long[] P01YL9_A3342CCStkLin ;
   private String[] P01YL10_A396EmprCod ;
   private String[] P01YL10_A719PrdNum ;
   private java.util.Date[] P01YL10_A3348CCStkFec ;
   private java.math.BigDecimal[] P01YL10_A3349CCStkPre ;
   private long[] P01YL10_A3342CCStkLin ;
   private String[] P01YL12_A396EmprCod ;
   private java.math.BigDecimal[] P01YL12_A704PrdExiAlm ;
   private java.math.BigDecimal[] P01YL12_A726PrdPreMed ;
   private java.math.BigDecimal[] P01YL12_A724PrdPreAct ;
   private String[] P01YL12_A719PrdNum ;
}

final  class apmod0t6__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YL2", "SELECT PrdNum, EmprCod, PrdPreAct, PrvNum FROM TXPPRODUC WHERE EmprCod = '001' ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01YL3", "SELECT EmprCod, PrdNum, PrdAny, DifValConA FROM TXPCPRDES WHERE EmprCod = ? and PrdNum = ? and PrdAny = 2004 ORDER BY EmprCod, PrdNum, PrdAny ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01YL4", "DELETE FROM TXPLPRDES  WHERE EmprCod = ? and PrdNum = ? and PrdAny = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new UpdateCursor("P01YL5", "DELETE FROM TXPCPRDES  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDES")
         ,new ForEachCursor("P01YL6", "SELECT EmprCod, PrvAny, PrvNum, DifEstCa1 FROM TXPCPRVES WHERE EmprCod = ? and PrvNum = ? and PrvAny = 2004 ORDER BY EmprCod, PrvNum, PrvAny ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01YL7", "DELETE FROM TXPLPRVES  WHERE EmprCod = ? and PrvNum = ? and PrvAny = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
         ,new UpdateCursor("P01YL8", "DELETE FROM TXPCPRVES  WHERE EmprCod = ? AND PrvNum = ? AND PrvAny = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRVES")
         ,new ForEachCursor("P01YL9", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkCanE, CCStkPri, CCStkCanS, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, CCStkLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01YL10", "SELECT EmprCod, PrdNum, CCStkFec, CCStkPre, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, CCStkLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01YL11", "UPDATE TXPCCSTKS SET CCStkPre=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
         ,new ForEachCursor("P01YL12", "SELECT EmprCod, PrdExiAlm, PrdPreMed, PrdPreAct, PrdNum FROM TXPPRODUC WHERE EmprCod = '001' ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01YL13", "UPDATE TXPPRODUC SET PrdPreMed=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

