package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelcalb extends GXProcedure
{
   public pelcalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelcalb.class ), "" );
   }

   public pelcalb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             long aP1 )
   {
      pelcalb.this.A396EmprCod = aP0;
      pelcalb.this.A30AlbProCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV25Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pelcalb.this.GXt_char1 = GXv_char2[0] ;
      AV25Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char4[0] = AV27Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char2, GXv_char3, GXv_char4) ;
      pelcalb.this.A396EmprCod = GXv_char2[0] ;
      pelcalb.this.AV26EmprNom = GXv_char3[0] ;
      pelcalb.this.AV27Usurcod = GXv_char4[0] ;
      GXt_int5 = AV17F_albanu ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBANU", ""), GXv_int6) ;
      pelcalb.this.GXt_int5 = GXv_int6[0] ;
      AV17F_albanu = GXt_int5 ;
      GXt_int5 = AV28CalLib ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CALLIB", ""), GXv_int6) ;
      pelcalb.this.GXt_int5 = GXv_int6[0] ;
      AV28CalLib = GXt_int5 ;
      GXt_int5 = AV29HueAlb ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HUEALB", ""), GXv_int6) ;
      pelcalb.this.GXt_int5 = GXv_int6[0] ;
      AV29HueAlb = GXt_int5 ;
      GXt_int5 = AV31Tintutex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      pelcalb.this.GXt_int5 = GXv_int6[0] ;
      AV31Tintutex = GXt_int5 ;
      GXt_int5 = AV32Firmad ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      pelcalb.this.GXt_int5 = GXv_int6[0] ;
      AV32Firmad = GXt_int5 ;
      GXt_int5 = AV34SiRemito ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIREMI", ""), GXv_int6) ;
      pelcalb.this.GXt_int5 = GXv_int6[0] ;
      AV34SiRemito = GXt_int5 ;
      if ( AV32Firmad == 1 )
      {
         System.out.println( httpContext.getMessage( "go EliminacionDocumento", "") );
         new app.documentotransporteproduccion.eliminaciondocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod) ;
         System.out.println( httpContext.getMessage( "return EliminacionDocumento", "") );
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV15NumLin = (short)(0) ;
      /* Using cursor P00952 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5140AlbMarca = P00952_A5140AlbMarca[0] ;
         /* Optimized group. */
         /* Using cursor P00953 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         cV15NumLin = P00953_AV15NumLin[0] ;
         pr_default.close(1);
         AV15NumLin = (short)(AV15NumLin+cV15NumLin*1) ;
         /* End optimized group. */
         if ( AV15NumLin > 0 )
         {
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 )
            {
               A5140AlbMarca = "" ;
            }
         }
         /* Using cursor P00954 */
         pr_default.execute(2, new Object[] {A5140AlbMarca, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( (0==AV15NumLin) )
      {
         AV21F_Imp = (byte)(0) ;
         /* Using cursor P00955 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A39AlbProPri = P00955_A39AlbProPri[0] ;
            A5140AlbMarca = P00955_A5140AlbMarca[0] ;
            A33AlbProEst = P00955_A33AlbProEst[0] ;
            AV18AlbProCod = A30AlbProCod ;
            AV19AlbProPri = A39AlbProPri ;
            /* Using cursor P00956 */
            pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A200BarPieCod = P00956_A200BarPieCod[0] ;
               A130BarCodPar = P00956_A130BarCodPar[0] ;
               A132BarCodReo = P00956_A132BarCodReo[0] ;
               A129BarCod = P00956_A129BarCod[0] ;
               A27AlbPKilEnt = P00956_A27AlbPKilEnt[0] ;
               /* Using cursor P00957 */
               pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
               /* Optimized DELETE. */
               /* Using cursor P00958 */
               pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
               /* End optimized DELETE. */
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Optimized DELETE. */
            /* Using cursor P00959 */
            pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P009510 */
            pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P009511 */
            pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
            /* End optimized DELETE. */
            if ( AV32Firmad == 1 )
            {
               A5140AlbMarca = httpContext.getMessage( "A", "") ;
               AV33Texto_ii = httpContext.getMessage( "PELCALB-ALBARAN COMO ANULADO", "") + GXutil.newLine( ) + httpContext.getMessage( "Albaran=", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV27Usurcod, AV25Station, AV33Texto_ii, (int)(A30AlbProCod), (byte)(0), "") ;
            }
            else
            {
               if ( AV29HueAlb == 1 )
               {
                  /* Execute user subroutine: 'CTRL_NUMERO' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(3);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV33Texto_ii = httpContext.getMessage( "PELCAB-ALBARAN ELIMINADO", "") + GXutil.newLine( ) + httpContext.getMessage( "Albaran=", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV27Usurcod, AV25Station, AV33Texto_ii, (int)(A30AlbProCod), (byte)(0), "") ;
                  /* Using cursor P009512 */
                  pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
               }
               else
               {
                  if ( ( AV17F_albanu == 0 ) && ( AV28CalLib == 0 ) )
                  {
                     if ( AV31Tintutex == 0 )
                     {
                        if ( ( AV32Firmad == 1 ) || ( AV34SiRemito == 1 ) )
                        {
                           A5140AlbMarca = httpContext.getMessage( "A", "") ;
                           AV33Texto_ii = httpContext.getMessage( "PELCALB-ALBARAN COMO ANULADO", "") + GXutil.newLine( ) + httpContext.getMessage( "Albaran=", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV27Usurcod, AV25Station, AV33Texto_ii, (int)(A30AlbProCod), (byte)(0), "") ;
                        }
                        else
                        {
                           AV33Texto_ii = httpContext.getMessage( "PELCAB-ALBARAN ELIMINADO", "") + GXutil.newLine( ) + httpContext.getMessage( "Albaran=", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV27Usurcod, AV25Station, AV33Texto_ii, (int)(A30AlbProCod), (byte)(0), "") ;
                           /* Using cursor P009513 */
                           pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                           Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                        }
                     }
                     else
                     {
                        if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
                        {
                           Gx_msg = httpContext.getMessage( "ATENÇAO¡¡¡¡", "") + GXutil.newLine( ) ;
                           Gx_msg += httpContext.getMessage( "ACABA DE ANULAR O DOCUMENTO ", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
                           httpContext.GX_msglist.addItem(Gx_msg);
                           A5140AlbMarca = httpContext.getMessage( "A", "") ;
                           AV33Texto_ii = httpContext.getMessage( "PELCALB-ALBARAN COMO ANULADO", "") + GXutil.newLine( ) + httpContext.getMessage( "Albaran=", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV27Usurcod, AV25Station, AV33Texto_ii, (int)(A30AlbProCod), (byte)(0), "") ;
                        }
                     }
                  }
                  else
                  {
                     if ( AV17F_albanu == 1 )
                     {
                        if ( (0==A33AlbProEst) || ( A33AlbProEst == 0 ) )
                        {
                           /* Using cursor P009514 */
                           pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                           Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                           /* Execute user subroutine: 'CTRL_NUMERO' */
                           S111 ();
                           if ( returnInSub )
                           {
                              pr_default.close(3);
                              returnInSub = true;
                              cleanup();
                              if (true) return;
                           }
                           if ( AV22Dif_alb > 0 )
                           {
                              Gx_msg = httpContext.getMessage( "Atencion¡¡¡. El numero de Albaran ELIMINADO ", "") + GXutil.str( AV18AlbProCod, 10, 0) + GXutil.newLine( ) + httpContext.getMessage( "es superior al CONTADOR de Albaranes ", "") + GXutil.str( AV23ContVal, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "Queda un hueco con el numero ", "") + GXutil.str( AV18AlbProCod, 10, 0) ;
                              httpContext.GX_msglist.addItem(Gx_msg);
                              AV24Texto_i = httpContext.getMessage( "Atencion¡¡¡. El numero de Albaran ELIMINADO ", "") + GXutil.str( AV18AlbProCod, 10, 0) + GXutil.newLine( ) + httpContext.getMessage( "es superior al CONTADOR de Albaranes ", "") + GXutil.str( AV23ContVal, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "Queda un hueco con el numero ", "") + GXutil.str( AV18AlbProCod, 10, 0) + GXutil.newLine( ) ;
                              new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV27Usurcod, AV25Station, AV24Texto_i, 0, (byte)(0), " ") ;
                           }
                        }
                        else
                        {
                           A5140AlbMarca = httpContext.getMessage( "A", "") ;
                           AV21F_Imp = (byte)(1) ;
                        }
                     }
                     else
                     {
                        if ( AV28CalLib == 1 )
                        {
                           Gx_msg = httpContext.getMessage( "ATENÇÃO - DOCUMENTO SEM VALOR", "") ;
                           httpContext.GX_msglist.addItem(Gx_msg);
                        }
                     }
                  }
               }
            }
            /* Using cursor P009515 */
            pr_default.execute(13, new Object[] {A5140AlbMarca, A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         if ( ( AV21F_Imp == 1 ) && ( AV17F_albanu == 1 ) )
         {
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CTRL_NUMERO' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19AlbProPri, "0") == 0 )
      {
         AV20ContCod = "555555" ;
      }
      if ( GXutil.strcmp(AV19AlbProPri, "1") == 0 )
      {
         AV20ContCod = "666666" ;
      }
      AV22Dif_alb = 0 ;
      /* Using cursor P009516 */
      pr_default.execute(14, new Object[] {A396EmprCod, AV20ContCod});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A313ContCod = P009516_A313ContCod[0] ;
         A316ContVal = P009516_A316ContVal[0] ;
         AV22Dif_alb = (long)(A316ContVal-AV18AlbProCod) ;
         AV23ContVal = A316ContVal ;
         AV23ContVal = (int)(AV18AlbProCod-1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
      AV30ExiAlb = (byte)(0) ;
      /* Using cursor P009517 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV23ContVal), AV19AlbProPri});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A39AlbProPri = P009517_A39AlbProPri[0] ;
         AV30ExiAlb = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
      if ( AV30ExiAlb == 1 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P009518 */
         pr_default.execute(16, new Object[] {Long.valueOf(AV18AlbProCod), A396EmprCod, AV20ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* End optimized UPDATE. */
      }
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pelcalb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV26EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV27Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P00952_A396EmprCod = new String[] {""} ;
      P00952_A30AlbProCod = new long[1] ;
      P00952_A5140AlbMarca = new String[] {""} ;
      A5140AlbMarca = "" ;
      P00953_AV15NumLin = new short[1] ;
      P00955_A396EmprCod = new String[] {""} ;
      P00955_A30AlbProCod = new long[1] ;
      P00955_A39AlbProPri = new String[] {""} ;
      P00955_A5140AlbMarca = new String[] {""} ;
      P00955_A33AlbProEst = new byte[1] ;
      A39AlbProPri = "" ;
      AV19AlbProPri = "" ;
      P00956_A396EmprCod = new String[] {""} ;
      P00956_A30AlbProCod = new long[1] ;
      P00956_A200BarPieCod = new String[] {""} ;
      P00956_A130BarCodPar = new String[] {""} ;
      P00956_A132BarCodReo = new byte[1] ;
      P00956_A129BarCod = new int[1] ;
      P00956_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      AV33Texto_ii = "" ;
      AV45Pgmname = "" ;
      Gx_msg = "" ;
      AV24Texto_i = "" ;
      AV20ContCod = "" ;
      P009516_A396EmprCod = new String[] {""} ;
      P009516_A313ContCod = new String[] {""} ;
      P009516_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      P009517_A396EmprCod = new String[] {""} ;
      P009517_A39AlbProPri = new String[] {""} ;
      P009517_A30AlbProCod = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelcalb__default(),
         new Object[] {
             new Object[] {
            P00952_A396EmprCod, P00952_A30AlbProCod, P00952_A5140AlbMarca
            }
            , new Object[] {
            P00953_AV15NumLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00955_A396EmprCod, P00955_A30AlbProCod, P00955_A39AlbProPri, P00955_A5140AlbMarca, P00955_A33AlbProEst
            }
            , new Object[] {
            P00956_A396EmprCod, P00956_A30AlbProCod, P00956_A200BarPieCod, P00956_A130BarCodPar, P00956_A132BarCodReo, P00956_A129BarCod, P00956_A27AlbPKilEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P009516_A396EmprCod, P009516_A313ContCod, P009516_A316ContVal
            }
            , new Object[] {
            P009517_A396EmprCod, P009517_A39AlbProPri, P009517_A30AlbProCod
            }
            , new Object[] {
            }
         }
      );
      AV45Pgmname = "PELCALB" ;
      /* GeneXus formulas. */
      AV45Pgmname = "PELCALB" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17F_albanu ;
   private byte AV28CalLib ;
   private byte AV29HueAlb ;
   private byte AV31Tintutex ;
   private byte AV32Firmad ;
   private byte AV34SiRemito ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV21F_Imp ;
   private byte A33AlbProEst ;
   private byte A132BarCodReo ;
   private byte AV30ExiAlb ;
   private short AV15NumLin ;
   private short cV15NumLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV23ContVal ;
   private int A316ContVal ;
   private long A30AlbProCod ;
   private long AV18AlbProCod ;
   private long AV22Dif_alb ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private String A396EmprCod ;
   private String AV25Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV26EmprNom ;
   private String GXv_char3[] ;
   private String AV27Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A5140AlbMarca ;
   private String A39AlbProPri ;
   private String AV19AlbProPri ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String AV45Pgmname ;
   private String Gx_msg ;
   private String AV20ContCod ;
   private String A313ContCod ;
   private boolean returnInSub ;
   private String AV33Texto_ii ;
   private String AV24Texto_i ;
   private IDataStoreProvider pr_default ;
   private String[] P00952_A396EmprCod ;
   private long[] P00952_A30AlbProCod ;
   private String[] P00952_A5140AlbMarca ;
   private short[] P00953_AV15NumLin ;
   private String[] P00955_A396EmprCod ;
   private long[] P00955_A30AlbProCod ;
   private String[] P00955_A39AlbProPri ;
   private String[] P00955_A5140AlbMarca ;
   private byte[] P00955_A33AlbProEst ;
   private String[] P00956_A396EmprCod ;
   private long[] P00956_A30AlbProCod ;
   private String[] P00956_A200BarPieCod ;
   private String[] P00956_A130BarCodPar ;
   private byte[] P00956_A132BarCodReo ;
   private int[] P00956_A129BarCod ;
   private java.math.BigDecimal[] P00956_A27AlbPKilEnt ;
   private String[] P009516_A396EmprCod ;
   private String[] P009516_A313ContCod ;
   private int[] P009516_A316ContVal ;
   private String[] P009517_A396EmprCod ;
   private String[] P009517_A39AlbProPri ;
   private long[] P009517_A30AlbProCod ;
}

final  class pelcalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00952", "SELECT EmprCod, AlbProCod, AlbMarca FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00953", "SELECT COUNT(*) FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00954", "UPDATE TXPCALPRD SET AlbMarca=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P00955", "SELECT EmprCod, AlbProCod, AlbProPri, AlbMarca, AlbProEst FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00956", "SELECT EmprCod, AlbProCod, BarPieCod, BarCodPar, BarCodReo, BarCod, AlbPKilEnt FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00957", "DELETE FROM TXPLALPRD  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new UpdateCursor("P00958", "DELETE FROM TXPLALTRZ  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALTRZ")
         ,new UpdateCursor("P00959", "DELETE FROM TXPALBPRD  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPRD")
         ,new UpdateCursor("P009510", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P009511", "DELETE FROM TXPOBSALB  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALB")
         ,new UpdateCursor("P009512", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new UpdateCursor("P009513", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new UpdateCursor("P009514", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new UpdateCursor("P009515", "UPDATE TXPCALPRD SET AlbMarca=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P009516", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009517", "SELECT EmprCod, AlbProPri, AlbProCod FROM TXPCALPRD WHERE (EmprCod = ? and AlbProCod = ?) AND (AlbProPri = ?) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P009518", "UPDATE TXPEMPLIN SET ContVal=? - 1  WHERE EmprCod = ? and ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((long[]) buf[2])[0] = rslt.getLong(3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

