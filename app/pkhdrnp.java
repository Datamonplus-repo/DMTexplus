package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkhdrnp extends GXProcedure
{
   public pkhdrnp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkhdrnp.class ), "" );
   }

   public pkhdrnp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 )
   {
      pkhdrnp.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pkhdrnp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkhdrnp.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pkhdrnp.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      pkhdrnp.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      pkhdrnp.this.AV18DisCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV27Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISEMP", ""), GXv_int1) ;
      pkhdrnp.this.AV27Flag1 = GXv_int1[0] ;
      GXv_int1[0] = AV30Flag2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DETPIE", ""), GXv_int1) ;
      pkhdrnp.this.AV30Flag2 = GXv_int1[0] ;
      AV44F_macros = (byte)(0) ;
      GXv_int1[0] = AV44F_macros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KILMAC", ""), GXv_int1) ;
      pkhdrnp.this.AV44F_macros = GXv_int1[0] ;
      GXv_int1[0] = AV45BajaPP ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BAJAPP", ""), GXv_int1) ;
      pkhdrnp.this.AV45BajaPP = GXv_int1[0] ;
      GXt_char2 = AV22msg0 ;
      GXv_char3[0] = GXt_char2 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG249_", ""), (byte)(99), GXv_char3) ;
      pkhdrnp.this.GXt_char2 = GXv_char3[0] ;
      AV22msg0 = GXt_char2 ;
      GXt_char2 = AV46msg1 ;
      GXv_char3[0] = GXt_char2 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN581_", ""), (byte)(99), GXv_char3) ;
      pkhdrnp.this.GXt_char2 = GXv_char3[0] ;
      AV46msg1 = GXt_char2 ;
      AV23Contador = (short)(0) ;
      AV24BorDis = (byte)(0) ;
      /* Optimized group. */
      /* Using cursor P01Y32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18DisCod)});
      cV23Contador = P01Y32_AV23Contador[0] ;
      pr_default.close(0);
      AV23Contador = (short)(AV23Contador+cV23Contador*1) ;
      /* End optimized group. */
      if ( AV23Contador < 2 )
      {
         AV24BorDis = (byte)(1) ;
      }
      AV21Flag = (byte)(0) ;
      /* Using cursor P01Y33 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P01Y33_A130BarCodPar[0] ;
         A132BarCodReo = P01Y33_A132BarCodReo[0] ;
         A129BarCod = P01Y33_A129BarCod[0] ;
         A213BarSit = P01Y33_A213BarSit[0] ;
         /* Using cursor P01Y34 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A153BarFasEst = P01Y34_A153BarFasEst[0] ;
            A194BarOrdLin = P01Y34_A194BarOrdLin[0] ;
            A758ProCod = P01Y34_A758ProCod[0] ;
            if ( A153BarFasEst >= 1 )
            {
               AV21Flag = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( AV21Flag == 1 )
         {
            AV47Confirm = httpContext.getMessage( "N", "") ;
            if ( AV45BajaPP == 1 )
            {
               AV46msg1 = httpContext.getMessage( "HDR iniciada en Produccion. ", "") + AV46msg1 ;
               if ( GXutil.strcmp(AV47Confirm, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV21Flag = (byte)(0) ;
               }
            }
            else
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Atención. Hoja de Ruta iniciada en Producción. No se permite su eliminación", ""));
            }
         }
         if ( AV21Flag == 0 )
         {
            if ( GXutil.strcmp(AV47Confirm, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Execute user subroutine: 'PARTES' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            /* Using cursor P01Y35 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A758ProCod = P01Y35_A758ProCod[0] ;
               A761ProFasLin = P01Y35_A761ProFasLin[0] ;
               n761ProFasLin = P01Y35_n761ProFasLin[0] ;
               /* Using cursor P01Y36 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A194BarOrdLin = P01Y36_A194BarOrdLin[0] ;
                  /* Using cursor P01Y37 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  /* Optimized DELETE. */
                  /* Using cursor P01Y38 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
                  /* End optimized DELETE. */
                  /* Optimized DELETE. */
                  /* Using cursor P01Y39 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
                  /* End optimized DELETE. */
                  /* Optimized DELETE. */
                  /* Using cursor P01Y310 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
                  /* End optimized DELETE. */
                  /* Optimized DELETE. */
                  /* Using cursor P01Y311 */
                  pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  /* End optimized DELETE. */
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               /* Using cursor P01Y312 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Optimized DELETE. */
            /* Using cursor P01Y313 */
            pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P01Y314 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAUD");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P01Y315 */
            pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P01Y316 */
            pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
            /* End optimized DELETE. */
            /* Using cursor P01Y317 */
            pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Execute user subroutine: 'DISPOS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            httpContext.GX_msglist.addItem(AV22msg0);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'DISPOS' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01Y318 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(AV18DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
      /* Optimized DELETE. */
      /* Using cursor P01Y319 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(AV18DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISBAR");
      /* End optimized DELETE. */
   }

   public void S121( )
   {
      /* 'PARTES' Routine */
      returnInSub = false ;
      /* Using cursor P01Y320 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A130BarCodPar = P01Y320_A130BarCodPar[0] ;
         A132BarCodReo = P01Y320_A132BarCodReo[0] ;
         A129BarCod = P01Y320_A129BarCod[0] ;
         A194BarOrdLin = P01Y320_A194BarOrdLin[0] ;
         A160BarFecRea = P01Y320_A160BarFecRea[0] ;
         A603MaqCodBis = P01Y320_A603MaqCodBis[0] ;
         A758ProCod = P01Y320_A758ProCod[0] ;
         AV48HisProFec = A160BarFecRea ;
         AV49MaqCod = A603MaqCodBis ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = AV49MaqCod ;
         GXv_date5[0] = AV48HisProFec ;
         GXv_int6[0] = AV15BarCod ;
         GXv_int1[0] = AV16BarCodReo ;
         GXv_char7[0] = AV17BarCodPar ;
         new app.peliphr(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_date5, GXv_int6, GXv_int1, GXv_char7) ;
         pkhdrnp.this.A396EmprCod = GXv_char3[0] ;
         pkhdrnp.this.AV49MaqCod = GXv_char4[0] ;
         pkhdrnp.this.AV48HisProFec = GXv_date5[0] ;
         pkhdrnp.this.AV15BarCod = GXv_int6[0] ;
         pkhdrnp.this.AV16BarCodReo = GXv_int1[0] ;
         pkhdrnp.this.AV17BarCodPar = GXv_char7[0] ;
         GXv_char7[0] = A396EmprCod ;
         GXv_char4[0] = AV49MaqCod ;
         GXv_date5[0] = AV48HisProFec ;
         new app.pelipar(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_date5) ;
         pkhdrnp.this.A396EmprCod = GXv_char7[0] ;
         pkhdrnp.this.AV49MaqCod = GXv_char4[0] ;
         pkhdrnp.this.AV48HisProFec = GXv_date5[0] ;
         pr_default.readNext(18);
      }
      pr_default.close(18);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkhdrnp.this.A396EmprCod;
      this.aP1[0] = pkhdrnp.this.AV15BarCod;
      this.aP2[0] = pkhdrnp.this.AV16BarCodReo;
      this.aP3[0] = pkhdrnp.this.AV17BarCodPar;
      this.aP4[0] = pkhdrnp.this.AV18DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkhdrnp");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22msg0 = "" ;
      AV46msg1 = "" ;
      GXt_char2 = "" ;
      scmdbuf = "" ;
      P01Y32_AV23Contador = new short[1] ;
      P01Y33_A396EmprCod = new String[] {""} ;
      P01Y33_A130BarCodPar = new String[] {""} ;
      P01Y33_A132BarCodReo = new byte[1] ;
      P01Y33_A129BarCod = new int[1] ;
      P01Y33_A213BarSit = new byte[1] ;
      A130BarCodPar = "" ;
      P01Y34_A396EmprCod = new String[] {""} ;
      P01Y34_A129BarCod = new int[1] ;
      P01Y34_A132BarCodReo = new byte[1] ;
      P01Y34_A130BarCodPar = new String[] {""} ;
      P01Y34_A153BarFasEst = new byte[1] ;
      P01Y34_A194BarOrdLin = new short[1] ;
      P01Y34_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV47Confirm = "" ;
      P01Y35_A396EmprCod = new String[] {""} ;
      P01Y35_A129BarCod = new int[1] ;
      P01Y35_A132BarCodReo = new byte[1] ;
      P01Y35_A130BarCodPar = new String[] {""} ;
      P01Y35_A758ProCod = new String[] {""} ;
      P01Y35_A761ProFasLin = new short[1] ;
      P01Y35_n761ProFasLin = new boolean[] {false} ;
      P01Y36_A396EmprCod = new String[] {""} ;
      P01Y36_A129BarCod = new int[1] ;
      P01Y36_A132BarCodReo = new byte[1] ;
      P01Y36_A130BarCodPar = new String[] {""} ;
      P01Y36_A758ProCod = new String[] {""} ;
      P01Y36_A194BarOrdLin = new short[1] ;
      P01Y320_A396EmprCod = new String[] {""} ;
      P01Y320_A130BarCodPar = new String[] {""} ;
      P01Y320_A132BarCodReo = new byte[1] ;
      P01Y320_A129BarCod = new int[1] ;
      P01Y320_A194BarOrdLin = new short[1] ;
      P01Y320_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P01Y320_A603MaqCodBis = new String[] {""} ;
      P01Y320_A758ProCod = new String[] {""} ;
      A160BarFecRea = GXutil.nullDate() ;
      A603MaqCodBis = "" ;
      AV48HisProFec = GXutil.nullDate() ;
      AV49MaqCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkhdrnp__default(),
         new Object[] {
             new Object[] {
            P01Y32_AV23Contador
            }
            , new Object[] {
            P01Y33_A396EmprCod, P01Y33_A130BarCodPar, P01Y33_A132BarCodReo, P01Y33_A129BarCod, P01Y33_A213BarSit
            }
            , new Object[] {
            P01Y34_A396EmprCod, P01Y34_A129BarCod, P01Y34_A132BarCodReo, P01Y34_A130BarCodPar, P01Y34_A153BarFasEst, P01Y34_A194BarOrdLin, P01Y34_A758ProCod
            }
            , new Object[] {
            P01Y35_A396EmprCod, P01Y35_A129BarCod, P01Y35_A132BarCodReo, P01Y35_A130BarCodPar, P01Y35_A758ProCod, P01Y35_A761ProFasLin, P01Y35_n761ProFasLin
            }
            , new Object[] {
            P01Y36_A396EmprCod, P01Y36_A129BarCod, P01Y36_A132BarCodReo, P01Y36_A130BarCodPar, P01Y36_A758ProCod, P01Y36_A194BarOrdLin
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
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01Y320_A396EmprCod, P01Y320_A130BarCodPar, P01Y320_A132BarCodReo, P01Y320_A129BarCod, P01Y320_A194BarOrdLin, P01Y320_A160BarFecRea, P01Y320_A603MaqCodBis, P01Y320_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV27Flag1 ;
   private byte AV30Flag2 ;
   private byte AV44F_macros ;
   private byte AV45BajaPP ;
   private byte AV24BorDis ;
   private byte AV21Flag ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A153BarFasEst ;
   private byte GXv_int1[] ;
   private short AV23Contador ;
   private short cV23Contador ;
   private short A194BarOrdLin ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int AV18DisCod ;
   private int A129BarCod ;
   private int GXv_int6[] ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String AV22msg0 ;
   private String AV46msg1 ;
   private String GXt_char2 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV47Confirm ;
   private String A603MaqCodBis ;
   private String AV49MaqCod ;
   private String GXv_char3[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date AV48HisProFec ;
   private java.util.Date GXv_date5[] ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P01Y32_AV23Contador ;
   private String[] P01Y33_A396EmprCod ;
   private String[] P01Y33_A130BarCodPar ;
   private byte[] P01Y33_A132BarCodReo ;
   private int[] P01Y33_A129BarCod ;
   private byte[] P01Y33_A213BarSit ;
   private String[] P01Y34_A396EmprCod ;
   private int[] P01Y34_A129BarCod ;
   private byte[] P01Y34_A132BarCodReo ;
   private String[] P01Y34_A130BarCodPar ;
   private byte[] P01Y34_A153BarFasEst ;
   private short[] P01Y34_A194BarOrdLin ;
   private String[] P01Y34_A758ProCod ;
   private String[] P01Y35_A396EmprCod ;
   private int[] P01Y35_A129BarCod ;
   private byte[] P01Y35_A132BarCodReo ;
   private String[] P01Y35_A130BarCodPar ;
   private String[] P01Y35_A758ProCod ;
   private short[] P01Y35_A761ProFasLin ;
   private boolean[] P01Y35_n761ProFasLin ;
   private String[] P01Y36_A396EmprCod ;
   private int[] P01Y36_A129BarCod ;
   private byte[] P01Y36_A132BarCodReo ;
   private String[] P01Y36_A130BarCodPar ;
   private String[] P01Y36_A758ProCod ;
   private short[] P01Y36_A194BarOrdLin ;
   private String[] P01Y320_A396EmprCod ;
   private String[] P01Y320_A130BarCodPar ;
   private byte[] P01Y320_A132BarCodReo ;
   private int[] P01Y320_A129BarCod ;
   private short[] P01Y320_A194BarOrdLin ;
   private java.util.Date[] P01Y320_A160BarFecRea ;
   private String[] P01Y320_A603MaqCodBis ;
   private String[] P01Y320_A758ProCod ;
}

final  class pkhdrnp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01Y32", "SELECT COUNT(*) FROM TXPDISBAR WHERE EmprCod = ? and DisDisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01Y33", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Y34", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasEst, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01Y35", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01Y36", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01Y37", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P01Y38", "DELETE FROM TXPBarPar  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
         ,new UpdateCursor("P01Y39", "DELETE FROM TXPFASMAQ  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new UpdateCursor("P01Y310", "DELETE FROM TXPFASQUI  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new UpdateCursor("P01Y311", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P01Y312", "DELETE FROM TXPBARPRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
         ,new UpdateCursor("P01Y313", "DELETE FROM TXPBARNOT  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new UpdateCursor("P01Y314", "DELETE FROM TXPBARAUD  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAUD")
         ,new UpdateCursor("P01Y315", "DELETE FROM TXPLMACRO  WHERE EmprCod = ? and MacBarCod = ? and MacBarReo = ? and MacBarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACRO")
         ,new UpdateCursor("P01Y316", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new UpdateCursor("P01Y317", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P01Y318", "UPDATE TXPDISPOS SET DisEst=1  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P01Y319", "DELETE FROM TXPDISBAR  WHERE EmprCod = ? and DisDisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISBAR")
         ,new ForEachCursor("P01Y320", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarOrdLin, BarFecRea, MaqCodBis, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

