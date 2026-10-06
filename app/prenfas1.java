package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prenfas1 extends GXProcedure
{
   public prenfas1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prenfas1.class ), "" );
   }

   public prenfas1( int remoteHandle ,
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
      prenfas1.this.aP5 = new String[] {""};
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
      prenfas1.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      prenfas1.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      prenfas1.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      prenfas1.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      prenfas1.this.AV19ProCod = aP4[0];
      this.aP4 = aP4;
      prenfas1.this.AV20Modo = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV105Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      prenfas1.this.GXt_char1 = GXv_char2[0] ;
      AV105Station = GXt_char1 ;
      GXt_char1 = AV37Termcod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      prenfas1.this.GXt_char1 = GXv_char2[0] ;
      AV37Termcod = GXt_char1 ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV106EmprNom ;
      GXv_char4[0] = AV107UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV105Station, GXv_char2, GXv_char3, GXv_char4) ;
      prenfas1.this.AV15EmprCod = GXv_char2[0] ;
      prenfas1.this.AV106EmprNom = GXv_char3[0] ;
      prenfas1.this.AV107UsurCod = GXv_char4[0] ;
      GXt_int5 = AV67FasMin ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FASMIN", ""), GXv_int6) ;
      prenfas1.this.GXt_int5 = GXv_int6[0] ;
      AV67FasMin = GXt_int5 ;
      GXt_int5 = AV68Carvema ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      prenfas1.this.GXt_int5 = GXv_int6[0] ;
      AV68Carvema = GXt_int5 ;
      AV36Contador = (byte)(0) ;
      if ( GXutil.strcmp(AV20Modo, httpContext.getMessage( "DEL", "")) == 0 )
      {
         /* Using cursor P039E2 */
         pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, AV19ProCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A758ProCod = P039E2_A758ProCod[0] ;
            A130BarCodPar = P039E2_A130BarCodPar[0] ;
            A132BarCodReo = P039E2_A132BarCodReo[0] ;
            A129BarCod = P039E2_A129BarCod[0] ;
            A396EmprCod = P039E2_A396EmprCod[0] ;
            A761ProFasLin = P039E2_A761ProFasLin[0] ;
            n761ProFasLin = P039E2_n761ProFasLin[0] ;
            /* Using cursor P039E3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A194BarOrdLin = P039E3_A194BarOrdLin[0] ;
               A152BarFasCon = P039E3_A152BarFasCon[0] ;
               /* Optimized DELETE. */
               /* Using cursor P039E4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
               /* End optimized DELETE. */
               /* Using cursor P039E5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A4643BarFasLot = P039E5_A4643BarFasLot[0] ;
                  A4303BarFasEst1 = P039E5_A4303BarFasEst1[0] ;
                  n4303BarFasEst1 = P039E5_n4303BarFasEst1[0] ;
                  /* Using cursor P039E6 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
                  while ( (pr_default.getStatus(4) != 101) )
                  {
                     A10084BarPFcod = P039E6_A10084BarPFcod[0] ;
                     pr_default.readNext(4);
                  }
                  pr_default.close(4);
                  /* Using cursor P039E7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               /* Using cursor P039E8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A5371FasQuiLin = P039E8_A5371FasQuiLin[0] ;
                  AV104Inc_obs = httpContext.getMessage( "PRENFAS1.Eliminacion FASQUI", "") + GXutil.newLine( ) ;
                  AV104Inc_obs += httpContext.getMessage( "Procod=", "") + GXutil.trim( A758ProCod) + GXutil.newLine( ) ;
                  AV104Inc_obs += httpContext.getMessage( "Orden =", "") + GXutil.str( A194BarOrdLin, 4, 0) + GXutil.newLine( ) ;
                  AV104Inc_obs += httpContext.getMessage( "Linea =", "") + GXutil.str( A5371FasQuiLin, 4, 0) + GXutil.newLine( ) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV116Pgmname, AV107UsurCod, AV105Station, AV104Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                  /* Using cursor P039E9 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               /* Using cursor P039E10 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A7934Dtb_Ordl = P039E10_A7934Dtb_Ordl[0] ;
                  /* Optimized DELETE. */
                  /* Using cursor P039E11 */
                  pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0051");
                  /* End optimized DELETE. */
                  /* Using cursor P039E12 */
                  pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
                  pr_default.readNext(8);
               }
               pr_default.close(8);
               /* Using cursor P039E13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Using cursor P039E14 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prenfas1.this.AV15EmprCod;
      this.aP1[0] = prenfas1.this.AV16BarCod;
      this.aP2[0] = prenfas1.this.AV17BarCodReo;
      this.aP3[0] = prenfas1.this.AV18BarCodPar;
      this.aP4[0] = prenfas1.this.AV19ProCod;
      this.aP5[0] = prenfas1.this.AV20Modo;
      Application.commitDataStores(context, remoteHandle, pr_default, "prenfas1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV105Station = "" ;
      AV37Termcod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV106EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV107UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P039E2_A758ProCod = new String[] {""} ;
      P039E2_A130BarCodPar = new String[] {""} ;
      P039E2_A132BarCodReo = new byte[1] ;
      P039E2_A129BarCod = new int[1] ;
      P039E2_A396EmprCod = new String[] {""} ;
      P039E2_A761ProFasLin = new short[1] ;
      P039E2_n761ProFasLin = new boolean[] {false} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P039E3_A396EmprCod = new String[] {""} ;
      P039E3_A129BarCod = new int[1] ;
      P039E3_A132BarCodReo = new byte[1] ;
      P039E3_A130BarCodPar = new String[] {""} ;
      P039E3_A758ProCod = new String[] {""} ;
      P039E3_A194BarOrdLin = new short[1] ;
      P039E3_A152BarFasCon = new String[] {""} ;
      A152BarFasCon = "" ;
      P039E5_A396EmprCod = new String[] {""} ;
      P039E5_A129BarCod = new int[1] ;
      P039E5_A132BarCodReo = new byte[1] ;
      P039E5_A130BarCodPar = new String[] {""} ;
      P039E5_A758ProCod = new String[] {""} ;
      P039E5_A194BarOrdLin = new short[1] ;
      P039E5_A4643BarFasLot = new int[1] ;
      P039E5_A4303BarFasEst1 = new byte[1] ;
      P039E5_n4303BarFasEst1 = new boolean[] {false} ;
      P039E6_A396EmprCod = new String[] {""} ;
      P039E6_A129BarCod = new int[1] ;
      P039E6_A132BarCodReo = new byte[1] ;
      P039E6_A130BarCodPar = new String[] {""} ;
      P039E6_A758ProCod = new String[] {""} ;
      P039E6_A194BarOrdLin = new short[1] ;
      P039E6_A4643BarFasLot = new int[1] ;
      P039E6_A10084BarPFcod = new short[1] ;
      P039E8_A396EmprCod = new String[] {""} ;
      P039E8_A129BarCod = new int[1] ;
      P039E8_A132BarCodReo = new byte[1] ;
      P039E8_A130BarCodPar = new String[] {""} ;
      P039E8_A758ProCod = new String[] {""} ;
      P039E8_A194BarOrdLin = new short[1] ;
      P039E8_A5371FasQuiLin = new short[1] ;
      AV104Inc_obs = "" ;
      AV116Pgmname = "" ;
      P039E10_A396EmprCod = new String[] {""} ;
      P039E10_A129BarCod = new int[1] ;
      P039E10_A132BarCodReo = new byte[1] ;
      P039E10_A130BarCodPar = new String[] {""} ;
      P039E10_A758ProCod = new String[] {""} ;
      P039E10_A194BarOrdLin = new short[1] ;
      P039E10_A7934Dtb_Ordl = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prenfas1__default(),
         new Object[] {
             new Object[] {
            P039E2_A758ProCod, P039E2_A130BarCodPar, P039E2_A132BarCodReo, P039E2_A129BarCod, P039E2_A396EmprCod, P039E2_A761ProFasLin, P039E2_n761ProFasLin
            }
            , new Object[] {
            P039E3_A396EmprCod, P039E3_A129BarCod, P039E3_A132BarCodReo, P039E3_A130BarCodPar, P039E3_A758ProCod, P039E3_A194BarOrdLin, P039E3_A152BarFasCon
            }
            , new Object[] {
            }
            , new Object[] {
            P039E5_A396EmprCod, P039E5_A129BarCod, P039E5_A132BarCodReo, P039E5_A130BarCodPar, P039E5_A758ProCod, P039E5_A194BarOrdLin, P039E5_A4643BarFasLot, P039E5_A4303BarFasEst1, P039E5_n4303BarFasEst1
            }
            , new Object[] {
            P039E6_A396EmprCod, P039E6_A129BarCod, P039E6_A132BarCodReo, P039E6_A130BarCodPar, P039E6_A758ProCod, P039E6_A194BarOrdLin, P039E6_A4643BarFasLot, P039E6_A10084BarPFcod
            }
            , new Object[] {
            }
            , new Object[] {
            P039E8_A396EmprCod, P039E8_A129BarCod, P039E8_A132BarCodReo, P039E8_A130BarCodPar, P039E8_A758ProCod, P039E8_A194BarOrdLin, P039E8_A5371FasQuiLin
            }
            , new Object[] {
            }
            , new Object[] {
            P039E10_A396EmprCod, P039E10_A129BarCod, P039E10_A132BarCodReo, P039E10_A130BarCodPar, P039E10_A758ProCod, P039E10_A194BarOrdLin, P039E10_A7934Dtb_Ordl
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV116Pgmname = "PRENFAS1" ;
      /* GeneXus formulas. */
      AV116Pgmname = "PRENFAS1" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV67FasMin ;
   private byte AV68Carvema ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV36Contador ;
   private byte A132BarCodReo ;
   private byte A4303BarFasEst1 ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short A10084BarPFcod ;
   private short A5371FasQuiLin ;
   private short A7934Dtb_Ordl ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A4643BarFasLot ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV19ProCod ;
   private String AV20Modo ;
   private String AV105Station ;
   private String AV37Termcod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV106EmprNom ;
   private String GXv_char3[] ;
   private String AV107UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A152BarFasCon ;
   private String AV116Pgmname ;
   private boolean n761ProFasLin ;
   private boolean n4303BarFasEst1 ;
   private String AV104Inc_obs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P039E2_A758ProCod ;
   private String[] P039E2_A130BarCodPar ;
   private byte[] P039E2_A132BarCodReo ;
   private int[] P039E2_A129BarCod ;
   private String[] P039E2_A396EmprCod ;
   private short[] P039E2_A761ProFasLin ;
   private boolean[] P039E2_n761ProFasLin ;
   private String[] P039E3_A396EmprCod ;
   private int[] P039E3_A129BarCod ;
   private byte[] P039E3_A132BarCodReo ;
   private String[] P039E3_A130BarCodPar ;
   private String[] P039E3_A758ProCod ;
   private short[] P039E3_A194BarOrdLin ;
   private String[] P039E3_A152BarFasCon ;
   private String[] P039E5_A396EmprCod ;
   private int[] P039E5_A129BarCod ;
   private byte[] P039E5_A132BarCodReo ;
   private String[] P039E5_A130BarCodPar ;
   private String[] P039E5_A758ProCod ;
   private short[] P039E5_A194BarOrdLin ;
   private int[] P039E5_A4643BarFasLot ;
   private byte[] P039E5_A4303BarFasEst1 ;
   private boolean[] P039E5_n4303BarFasEst1 ;
   private String[] P039E6_A396EmprCod ;
   private int[] P039E6_A129BarCod ;
   private byte[] P039E6_A132BarCodReo ;
   private String[] P039E6_A130BarCodPar ;
   private String[] P039E6_A758ProCod ;
   private short[] P039E6_A194BarOrdLin ;
   private int[] P039E6_A4643BarFasLot ;
   private short[] P039E6_A10084BarPFcod ;
   private String[] P039E8_A396EmprCod ;
   private int[] P039E8_A129BarCod ;
   private byte[] P039E8_A132BarCodReo ;
   private String[] P039E8_A130BarCodPar ;
   private String[] P039E8_A758ProCod ;
   private short[] P039E8_A194BarOrdLin ;
   private short[] P039E8_A5371FasQuiLin ;
   private String[] P039E10_A396EmprCod ;
   private int[] P039E10_A129BarCod ;
   private byte[] P039E10_A132BarCodReo ;
   private String[] P039E10_A130BarCodPar ;
   private String[] P039E10_A758ProCod ;
   private short[] P039E10_A194BarOrdLin ;
   private short[] P039E10_A7934Dtb_Ordl ;
}

final  class prenfas1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P039E2", "SELECT ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P039E3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P039E4", "DELETE FROM TXPBarPar  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
         ,new ForEachCursor("P039E5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarFasEst1 FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P039E6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod FROM TXPFASPFA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P039E7", "DELETE FROM TXPFASMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new ForEachCursor("P039E8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P039E9", "DELETE FROM TXPFASQUI  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new ForEachCursor("P039E10", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P039E11", "DELETE FROM TXPDT0051  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Dtb_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0051")
         ,new UpdateCursor("P039E12", "DELETE FROM TXPDT005  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT005")
         ,new UpdateCursor("P039E13", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P039E14", "DELETE FROM TXPBARPRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
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
               stmt.setShort(7, ((Number) parms[6]).shortValue());
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

