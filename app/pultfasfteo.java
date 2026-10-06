package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pultfasfteo extends GXProcedure
{
   public pultfasfteo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pultfasfteo.class ), "" );
   }

   public pultfasfteo( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pultfasfteo.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pultfasfteo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pultfasfteo.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pultfasfteo.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pultfasfteo.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pultfasfteo.this.AV12usurcod = aP4[0];
      this.aP4 = aP4;
      pultfasfteo.this.AV13station = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9BarPritin = (byte)(80) ;
      AV10Termof = (byte)(0) ;
      AV15EsmeLam = (byte)(0) ;
      AV14BarOrdlin = (short)(0) ;
      /* Using cursor P04HA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A153BarFasEst = P04HA2_A153BarFasEst[0] ;
         A457FasCod = P04HA2_A457FasCod[0] ;
         A150BarFacTin = P04HA2_A150BarFacTin[0] ;
         A194BarOrdLin = P04HA2_A194BarOrdLin[0] ;
         A758ProCod = P04HA2_A758ProCod[0] ;
         if ( ( GXutil.strcmp(GXutil.substring( A457FasCod, 1, 6), httpContext.getMessage( "TERMOF", "")) == 0 ) && ( A153BarFasEst != 2 ) )
         {
            AV9BarPritin = (byte)(95) ;
            AV10Termof = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV14BarOrdlin = A194BarOrdLin ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV10Termof == 0 )
      {
         /* Using cursor P04HA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV14BarOrdlin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A194BarOrdLin = P04HA3_A194BarOrdLin[0] ;
            A153BarFasEst = P04HA3_A153BarFasEst[0] ;
            A457FasCod = P04HA3_A457FasCod[0] ;
            A758ProCod = P04HA3_A758ProCod[0] ;
            if ( ( ( GXutil.strcmp(GXutil.substring( A457FasCod, 1, 5), httpContext.getMessage( "ESMER", "")) == 0 ) && ( A153BarFasEst != 2 ) ) || ( ( GXutil.strcmp(GXutil.substring( A457FasCod, 1, 6), httpContext.getMessage( "LAMINA", "")) == 0 ) && ( A153BarFasEst != 2 ) ) )
            {
               AV9BarPritin = (byte)(95) ;
               AV15EsmeLam = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      AV8Barfecteo = GXutil.nullDate() ;
      /* Using cursor P04HA4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A162BarFecTeo = P04HA4_A162BarFecTeo[0] ;
         A194BarOrdLin = P04HA4_A194BarOrdLin[0] ;
         A758ProCod = P04HA4_A758ProCod[0] ;
         AV8Barfecteo = A162BarFecTeo ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P04HA5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A158BarFecFpr = P04HA5_A158BarFecFpr[0] ;
         A3594BarPriTin = P04HA5_A3594BarPriTin[0] ;
         A158BarFecFpr = AV8Barfecteo ;
         if ( ( A3594BarPriTin == 95 ) && ( AV10Termof == 0 ) && ( AV15EsmeLam == 0 ) )
         {
            AV11Inc_obs = httpContext.getMessage( "OS con PP=95. NO hay TERMOF o ESMER o LAMINA", "") + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "Cambio PP  ", "") + GXutil.str( A3594BarPriTin, 2, 0) + httpContext.getMessage( " por ", "") + GXutil.str( AV9BarPritin, 2, 0) + GXutil.newLine( ) ;
            A3594BarPriTin = AV9BarPritin ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV22Pgmname, AV12usurcod, AV13station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
         if ( AV10Termof == 1 )
         {
            AV11Inc_obs = httpContext.getMessage( "Control.Hay fase que comienza por TERMOF.", "") + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "&Termof  = ", "") + GXutil.str( AV10Termof, 1, 0) + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "Cambio PP  ", "") + GXutil.str( A3594BarPriTin, 2, 0) + httpContext.getMessage( " por ", "") + GXutil.str( AV9BarPritin, 2, 0) + GXutil.newLine( ) ;
            A3594BarPriTin = AV9BarPritin ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV22Pgmname, AV12usurcod, AV13station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
         if ( AV15EsmeLam == 1 )
         {
            AV11Inc_obs = httpContext.getMessage( "Control.Hay fase que comienza por ESMER o LAMINA.", "") + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "&&EsmeLam  = ", "") + GXutil.str( AV15EsmeLam, 1, 0) + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "Cambio PP  ", "") + GXutil.str( A3594BarPriTin, 2, 0) + httpContext.getMessage( " por ", "") + GXutil.str( AV9BarPritin, 2, 0) + GXutil.newLine( ) ;
            A3594BarPriTin = AV9BarPritin ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV22Pgmname, AV12usurcod, AV13station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
         /* Using cursor P04HA6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A6039RecAcab = P04HA6_A6039RecAcab[0] ;
            n6039RecAcab = P04HA6_n6039RecAcab[0] ;
            A5431RecPriPla = P04HA6_A5431RecPriPla[0] ;
            n5431RecPriPla = P04HA6_n5431RecPriPla[0] ;
            A2804RecLinMaq = P04HA6_A2804RecLinMaq[0] ;
            if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) != 0 )
            {
               if ( ( A5431RecPriPla == 95 ) && ( AV10Termof == 0 ) && ( AV15EsmeLam == 0 ) )
               {
                  AV11Inc_obs = httpContext.getMessage( "OS con PP=95. NO hay TERMOF o ESMER o LAMINA", "") + GXutil.newLine( ) ;
                  AV11Inc_obs += httpContext.getMessage( "Cambio PP,RECMAQ  ", "") + GXutil.str( A5431RecPriPla, 2, 0) + httpContext.getMessage( " por ", "") + GXutil.str( AV9BarPritin, 2, 0) + GXutil.newLine( ) ;
                  A5431RecPriPla = AV9BarPritin ;
                  n5431RecPriPla = false ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV22Pgmname, AV12usurcod, AV13station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               }
               if ( AV10Termof == 1 )
               {
                  AV11Inc_obs = httpContext.getMessage( "Control.Hay fase que comienza por TERMOF.", "") + GXutil.newLine( ) ;
                  AV11Inc_obs += httpContext.getMessage( "&Termof  = ", "") + GXutil.str( AV10Termof, 1, 0) + GXutil.newLine( ) ;
                  AV11Inc_obs += httpContext.getMessage( "Cambio PP,RECMAQ  ", "") + GXutil.str( A5431RecPriPla, 2, 0) + httpContext.getMessage( " por ", "") + GXutil.str( AV9BarPritin, 2, 0) + GXutil.newLine( ) ;
                  A5431RecPriPla = AV9BarPritin ;
                  n5431RecPriPla = false ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV22Pgmname, AV12usurcod, AV13station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               }
               if ( AV15EsmeLam == 1 )
               {
                  AV11Inc_obs = httpContext.getMessage( "Control.Hay fase que comienza por ESMER o LAMINA.", "") + GXutil.newLine( ) ;
                  AV11Inc_obs += httpContext.getMessage( "&&EsmeLam  = ", "") + GXutil.str( AV15EsmeLam, 1, 0) + GXutil.newLine( ) ;
                  AV11Inc_obs += httpContext.getMessage( "Cambio PP,RECMAQ  ", "") + GXutil.str( A5431RecPriPla, 2, 0) + httpContext.getMessage( " por ", "") + GXutil.str( AV9BarPritin, 2, 0) + GXutil.newLine( ) ;
                  A5431RecPriPla = AV9BarPritin ;
                  n5431RecPriPla = false ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV22Pgmname, AV12usurcod, AV13station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               }
               /* Using cursor P04HA7 */
               pr_default.execute(5, new Object[] {Boolean.valueOf(n5431RecPriPla), Byte.valueOf(A5431RecPriPla), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Using cursor P04HA8 */
         pr_default.execute(6, new Object[] {A158BarFecFpr, Byte.valueOf(A3594BarPriTin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pultfasfteo.this.A396EmprCod;
      this.aP1[0] = pultfasfteo.this.A129BarCod;
      this.aP2[0] = pultfasfteo.this.A132BarCodReo;
      this.aP3[0] = pultfasfteo.this.A130BarCodPar;
      this.aP4[0] = pultfasfteo.this.AV12usurcod;
      this.aP5[0] = pultfasfteo.this.AV13station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pultfasfteo");
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
      P04HA2_A396EmprCod = new String[] {""} ;
      P04HA2_A129BarCod = new int[1] ;
      P04HA2_A132BarCodReo = new byte[1] ;
      P04HA2_A130BarCodPar = new String[] {""} ;
      P04HA2_A153BarFasEst = new byte[1] ;
      P04HA2_A457FasCod = new String[] {""} ;
      P04HA2_A150BarFacTin = new String[] {""} ;
      P04HA2_A194BarOrdLin = new short[1] ;
      P04HA2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      P04HA3_A396EmprCod = new String[] {""} ;
      P04HA3_A129BarCod = new int[1] ;
      P04HA3_A132BarCodReo = new byte[1] ;
      P04HA3_A130BarCodPar = new String[] {""} ;
      P04HA3_A194BarOrdLin = new short[1] ;
      P04HA3_A153BarFasEst = new byte[1] ;
      P04HA3_A457FasCod = new String[] {""} ;
      P04HA3_A758ProCod = new String[] {""} ;
      AV8Barfecteo = GXutil.nullDate() ;
      P04HA4_A396EmprCod = new String[] {""} ;
      P04HA4_A129BarCod = new int[1] ;
      P04HA4_A132BarCodReo = new byte[1] ;
      P04HA4_A130BarCodPar = new String[] {""} ;
      P04HA4_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P04HA4_A194BarOrdLin = new short[1] ;
      P04HA4_A758ProCod = new String[] {""} ;
      A162BarFecTeo = GXutil.nullDate() ;
      P04HA5_A396EmprCod = new String[] {""} ;
      P04HA5_A129BarCod = new int[1] ;
      P04HA5_A132BarCodReo = new byte[1] ;
      P04HA5_A130BarCodPar = new String[] {""} ;
      P04HA5_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P04HA5_A3594BarPriTin = new byte[1] ;
      A158BarFecFpr = GXutil.nullDate() ;
      AV11Inc_obs = "" ;
      AV22Pgmname = "" ;
      P04HA6_A396EmprCod = new String[] {""} ;
      P04HA6_A129BarCod = new int[1] ;
      P04HA6_A132BarCodReo = new byte[1] ;
      P04HA6_A130BarCodPar = new String[] {""} ;
      P04HA6_A6039RecAcab = new String[] {""} ;
      P04HA6_n6039RecAcab = new boolean[] {false} ;
      P04HA6_A5431RecPriPla = new byte[1] ;
      P04HA6_n5431RecPriPla = new boolean[] {false} ;
      P04HA6_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pultfasfteo__default(),
         new Object[] {
             new Object[] {
            P04HA2_A396EmprCod, P04HA2_A129BarCod, P04HA2_A132BarCodReo, P04HA2_A130BarCodPar, P04HA2_A153BarFasEst, P04HA2_A457FasCod, P04HA2_A150BarFacTin, P04HA2_A194BarOrdLin, P04HA2_A758ProCod
            }
            , new Object[] {
            P04HA3_A396EmprCod, P04HA3_A129BarCod, P04HA3_A132BarCodReo, P04HA3_A130BarCodPar, P04HA3_A194BarOrdLin, P04HA3_A153BarFasEst, P04HA3_A457FasCod, P04HA3_A758ProCod
            }
            , new Object[] {
            P04HA4_A396EmprCod, P04HA4_A129BarCod, P04HA4_A132BarCodReo, P04HA4_A130BarCodPar, P04HA4_A162BarFecTeo, P04HA4_A194BarOrdLin, P04HA4_A758ProCod
            }
            , new Object[] {
            P04HA5_A396EmprCod, P04HA5_A129BarCod, P04HA5_A132BarCodReo, P04HA5_A130BarCodPar, P04HA5_A158BarFecFpr, P04HA5_A3594BarPriTin
            }
            , new Object[] {
            P04HA6_A396EmprCod, P04HA6_A129BarCod, P04HA6_A132BarCodReo, P04HA6_A130BarCodPar, P04HA6_A6039RecAcab, P04HA6_n6039RecAcab, P04HA6_A5431RecPriPla, P04HA6_n5431RecPriPla, P04HA6_A2804RecLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV22Pgmname = "PUltFasFteo" ;
      /* GeneXus formulas. */
      AV22Pgmname = "PUltFasFteo" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV9BarPritin ;
   private byte AV10Termof ;
   private byte AV15EsmeLam ;
   private byte A153BarFasEst ;
   private byte A3594BarPriTin ;
   private byte A5431RecPriPla ;
   private short AV14BarOrdlin ;
   private short A194BarOrdLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV12usurcod ;
   private String AV13station ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String AV22Pgmname ;
   private String A6039RecAcab ;
   private java.util.Date AV8Barfecteo ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A158BarFecFpr ;
   private boolean n6039RecAcab ;
   private boolean n5431RecPriPla ;
   private String AV11Inc_obs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04HA2_A396EmprCod ;
   private int[] P04HA2_A129BarCod ;
   private byte[] P04HA2_A132BarCodReo ;
   private String[] P04HA2_A130BarCodPar ;
   private byte[] P04HA2_A153BarFasEst ;
   private String[] P04HA2_A457FasCod ;
   private String[] P04HA2_A150BarFacTin ;
   private short[] P04HA2_A194BarOrdLin ;
   private String[] P04HA2_A758ProCod ;
   private String[] P04HA3_A396EmprCod ;
   private int[] P04HA3_A129BarCod ;
   private byte[] P04HA3_A132BarCodReo ;
   private String[] P04HA3_A130BarCodPar ;
   private short[] P04HA3_A194BarOrdLin ;
   private byte[] P04HA3_A153BarFasEst ;
   private String[] P04HA3_A457FasCod ;
   private String[] P04HA3_A758ProCod ;
   private String[] P04HA4_A396EmprCod ;
   private int[] P04HA4_A129BarCod ;
   private byte[] P04HA4_A132BarCodReo ;
   private String[] P04HA4_A130BarCodPar ;
   private java.util.Date[] P04HA4_A162BarFecTeo ;
   private short[] P04HA4_A194BarOrdLin ;
   private String[] P04HA4_A758ProCod ;
   private String[] P04HA5_A396EmprCod ;
   private int[] P04HA5_A129BarCod ;
   private byte[] P04HA5_A132BarCodReo ;
   private String[] P04HA5_A130BarCodPar ;
   private java.util.Date[] P04HA5_A158BarFecFpr ;
   private byte[] P04HA5_A3594BarPriTin ;
   private String[] P04HA6_A396EmprCod ;
   private int[] P04HA6_A129BarCod ;
   private byte[] P04HA6_A132BarCodReo ;
   private String[] P04HA6_A130BarCodPar ;
   private String[] P04HA6_A6039RecAcab ;
   private boolean[] P04HA6_n6039RecAcab ;
   private byte[] P04HA6_A5431RecPriPla ;
   private boolean[] P04HA6_n5431RecPriPla ;
   private short[] P04HA6_A2804RecLinMaq ;
}

final  class pultfasfteo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04HA2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasEst, FasCod, BarFacTin, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04HA3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasEst, FasCod, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin < ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04HA4", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFecTeo, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04HA5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFecFpr, BarPriTin FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04HA6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecAcab, RecPriPla, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04HA7", "UPDATE TXPRECMAQ SET RecPriPla=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new UpdateCursor("P04HA8", "UPDATE TXPBARCAD SET BarFecFpr=?, BarPriTin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 6 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

