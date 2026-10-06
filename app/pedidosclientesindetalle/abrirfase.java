package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class abrirfase extends GXProcedure
{
   public abrirfase( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( abrirfase.class ), "" );
   }

   public abrirfase( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        String aP6 ,
                        String aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             String aP6 ,
                             String aP7 )
   {
      abrirfase.this.AV8emprcod = aP0;
      abrirfase.this.AV9barcod = aP1;
      abrirfase.this.AV10barcodreo = aP2;
      abrirfase.this.AV11barcodpar = aP3;
      abrirfase.this.AV13Procod = aP4;
      abrirfase.this.AV12barordlin = aP5;
      abrirfase.this.AV14usurcod = aP6;
      abrirfase.this.AV15station = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Inc_obs = GXutil.trim( AV24Pgmname) + httpContext.getMessage( "/Inicializo BARFAS/", "") ;
      AV17barfas = (short)(0) ;
      /* Using cursor P0AJU2 */
      pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV10barcodreo), AV11barcodpar, AV13Procod, Short.valueOf(AV12barordlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P0AJU2_A194BarOrdLin[0] ;
         A758ProCod = P0AJU2_A758ProCod[0] ;
         A130BarCodPar = P0AJU2_A130BarCodPar[0] ;
         A132BarCodReo = P0AJU2_A132BarCodReo[0] ;
         A129BarCod = P0AJU2_A129BarCod[0] ;
         A396EmprCod = P0AJU2_A396EmprCod[0] ;
         A153BarFasEst = P0AJU2_A153BarFasEst[0] ;
         A460FasDsc = P0AJU2_A460FasDsc[0] ;
         A457FasCod = P0AJU2_A457FasCod[0] ;
         A227BarUni = P0AJU2_A227BarUni[0] ;
         A160BarFecRea = P0AJU2_A160BarFecRea[0] ;
         A3298BarFecRIni = P0AJU2_A3298BarFecRIni[0] ;
         A215BarTieRea = P0AJU2_A215BarTieRea[0] ;
         A165BarHorIni = P0AJU2_A165BarHorIni[0] ;
         A164BarHorFin = P0AJU2_A164BarHorFin[0] ;
         A4442BarFasDTI = P0AJU2_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0AJU2_n4442BarFasDTI[0] ;
         A4443BarFasDTF = P0AJU2_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0AJU2_n4443BarFasDTF[0] ;
         A3837BarFasKgm = P0AJU2_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AJU2_n3837BarFasKgm[0] ;
         A3838BarFasMtr = P0AJU2_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AJU2_n3838BarFasMtr[0] ;
         A5719BarFasKgT = P0AJU2_A5719BarFasKgT[0] ;
         n5719BarFasKgT = P0AJU2_n5719BarFasKgT[0] ;
         A5720BarFasMtT = P0AJU2_A5720BarFasMtT[0] ;
         n5720BarFasMtT = P0AJU2_n5720BarFasMtT[0] ;
         A460FasDsc = P0AJU2_A460FasDsc[0] ;
         AV16Inc_obs += httpContext.getMessage( "Orden=", "") + GXutil.trim( GXutil.str( A194BarOrdLin, 4, 0)) + httpContext.getMessage( "Fase=", "") + GXutil.trim( A457FasCod) + " " + GXutil.trim( A460FasDsc) + httpContext.getMessage( "/E=", "") + GXutil.str( A153BarFasEst, 1, 0) + httpContext.getMessage( " cambia a 0", "") ;
         A153BarFasEst = (byte)(0) ;
         A227BarUni = DecimalUtil.ZERO ;
         A160BarFecRea = GXutil.nullDate() ;
         A3298BarFecRIni = GXutil.nullDate() ;
         A215BarTieRea = DecimalUtil.ZERO ;
         A165BarHorIni = (short)(0) ;
         A164BarHorFin = (short)(0) ;
         A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
         n4442BarFasDTI = false ;
         A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
         n4443BarFasDTF = false ;
         A3837BarFasKgm = DecimalUtil.ZERO ;
         n3837BarFasKgm = false ;
         A3838BarFasMtr = DecimalUtil.ZERO ;
         n3838BarFasMtr = false ;
         A5719BarFasKgT = DecimalUtil.ZERO ;
         n5719BarFasKgT = false ;
         A5720BarFasMtT = DecimalUtil.ZERO ;
         n5720BarFasMtT = false ;
         AV17barfas = (short)(1) ;
         /* Using cursor P0AJU3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A153BarFasEst), A227BarUni, A160BarFecRea, A3298BarFecRIni, A215BarTieRea, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, Boolean.valueOf(n5719BarFasKgT), A5719BarFasKgT, Boolean.valueOf(n5720BarFasMtT), A5720BarFasMtT, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17barfas == 1 )
      {
         new app.pctrinc(remoteHandle, context).execute( AV8emprcod, AV24Pgmname, AV14usurcod, AV15station, AV16Inc_obs, AV9barcod, AV10barcodreo, AV11barcodpar) ;
      }
      AV18lhipro = (short)(0) ;
      AV19Maqcod = "" ;
      AV16Inc_obs = GXutil.trim( AV24Pgmname) + httpContext.getMessage( "/Elimino LHIPRO/", "") ;
      /* Using cursor P0AJU4 */
      pr_default.execute(2, new Object[] {AV8emprcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV10barcodreo), AV11barcodpar, Short.valueOf(AV12barordlin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P0AJU4_A396EmprCod[0] ;
         A129BarCod = P0AJU4_A129BarCod[0] ;
         A132BarCodReo = P0AJU4_A132BarCodReo[0] ;
         A130BarCodPar = P0AJU4_A130BarCodPar[0] ;
         A194BarOrdLin = P0AJU4_A194BarOrdLin[0] ;
         A656ParCod = P0AJU4_A656ParCod[0] ;
         n656ParCod = P0AJU4_n656ParCod[0] ;
         A602MaqCod = P0AJU4_A602MaqCod[0] ;
         A558HisProFec = P0AJU4_A558HisProFec[0] ;
         A561HisProLin = P0AJU4_A561HisProLin[0] ;
         AV19Maqcod = A602MaqCod ;
         AV18lhipro = (short)(AV18lhipro+1) ;
         /* Using cursor P0AJU5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV18lhipro > 0 )
      {
         AV16Inc_obs += httpContext.getMessage( "Registros eliminados=", "") + GXutil.trim( GXutil.str( AV18lhipro, 4, 0)) ;
         new app.pctrinc(remoteHandle, context).execute( AV8emprcod, AV24Pgmname, AV14usurcod, AV15station, AV16Inc_obs, AV9barcod, AV10barcodreo, AV11barcodpar) ;
      }
      AV20lector = (short)(0) ;
      AV16Inc_obs = GXutil.trim( AV24Pgmname) + httpContext.getMessage( "/Elimino LECTOR/", "") ;
      /* Using cursor P0AJU6 */
      pr_default.execute(4, new Object[] {AV8emprcod, AV19Maqcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV10barcodreo), AV11barcodpar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1169LecBarPar = P0AJU6_A1169LecBarPar[0] ;
         n1169LecBarPar = P0AJU6_n1169LecBarPar[0] ;
         A1168LecBarReo = P0AJU6_A1168LecBarReo[0] ;
         n1168LecBarReo = P0AJU6_n1168LecBarReo[0] ;
         A1167LecBarCod = P0AJU6_A1167LecBarCod[0] ;
         n1167LecBarCod = P0AJU6_n1167LecBarCod[0] ;
         A1166LecMaqCod = P0AJU6_A1166LecMaqCod[0] ;
         A396EmprCod = P0AJU6_A396EmprCod[0] ;
         AV20lector = (short)(1) ;
         /* Using cursor P0AJU7 */
         pr_default.execute(5, new Object[] {A396EmprCod, A1166LecMaqCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV20lector == 1 )
      {
         new app.pctrinc(remoteHandle, context).execute( AV8emprcod, AV24Pgmname, AV14usurcod, AV15station, AV16Inc_obs, AV9barcod, AV10barcodreo, AV11barcodpar) ;
      }
      AV21grulec = (short)(0) ;
      AV16Inc_obs = GXutil.trim( AV24Pgmname) + httpContext.getMessage( "/Elimino GRULEC/", "") ;
      /* Using cursor P0AJU8 */
      pr_default.execute(6, new Object[] {AV8emprcod, AV19Maqcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV10barcodreo), AV11barcodpar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A1792GruBarPar = P0AJU8_A1792GruBarPar[0] ;
         A1793GruBarReo = P0AJU8_A1793GruBarReo[0] ;
         A1791GruBarCod = P0AJU8_A1791GruBarCod[0] ;
         A1794GruLecMaq = P0AJU8_A1794GruLecMaq[0] ;
         A396EmprCod = P0AJU8_A396EmprCod[0] ;
         A1795GruOrd = P0AJU8_A1795GruOrd[0] ;
         AV21grulec = (short)(1) ;
         /* Using cursor P0AJU9 */
         pr_default.execute(7, new Object[] {A396EmprCod, A1794GruLecMaq, Byte.valueOf(A1795GruOrd), Integer.valueOf(A1791GruBarCod), Byte.valueOf(A1793GruBarReo), A1792GruBarPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRULEC");
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( AV21grulec == 1 )
      {
         new app.pctrinc(remoteHandle, context).execute( AV8emprcod, AV24Pgmname, AV14usurcod, AV15station, AV16Inc_obs, AV9barcod, AV10barcodreo, AV11barcodpar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pedidosclientesindetalle.abrirfase");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Inc_obs = "" ;
      AV24Pgmname = "" ;
      scmdbuf = "" ;
      P0AJU2_A194BarOrdLin = new short[1] ;
      P0AJU2_A758ProCod = new String[] {""} ;
      P0AJU2_A130BarCodPar = new String[] {""} ;
      P0AJU2_A132BarCodReo = new byte[1] ;
      P0AJU2_A129BarCod = new int[1] ;
      P0AJU2_A396EmprCod = new String[] {""} ;
      P0AJU2_A153BarFasEst = new byte[1] ;
      P0AJU2_A460FasDsc = new String[] {""} ;
      P0AJU2_A457FasCod = new String[] {""} ;
      P0AJU2_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJU2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJU2_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJU2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJU2_A165BarHorIni = new short[1] ;
      P0AJU2_A164BarHorFin = new short[1] ;
      P0AJU2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJU2_n4442BarFasDTI = new boolean[] {false} ;
      P0AJU2_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJU2_n4443BarFasDTF = new boolean[] {false} ;
      P0AJU2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJU2_n3837BarFasKgm = new boolean[] {false} ;
      P0AJU2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJU2_n3838BarFasMtr = new boolean[] {false} ;
      P0AJU2_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJU2_n5719BarFasKgT = new boolean[] {false} ;
      P0AJU2_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJU2_n5720BarFasMtT = new boolean[] {false} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      AV19Maqcod = "" ;
      P0AJU4_A396EmprCod = new String[] {""} ;
      P0AJU4_A129BarCod = new int[1] ;
      P0AJU4_A132BarCodReo = new byte[1] ;
      P0AJU4_A130BarCodPar = new String[] {""} ;
      P0AJU4_A194BarOrdLin = new short[1] ;
      P0AJU4_A656ParCod = new short[1] ;
      P0AJU4_n656ParCod = new boolean[] {false} ;
      P0AJU4_A602MaqCod = new String[] {""} ;
      P0AJU4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJU4_A561HisProLin = new int[1] ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      P0AJU6_A1169LecBarPar = new String[] {""} ;
      P0AJU6_n1169LecBarPar = new boolean[] {false} ;
      P0AJU6_A1168LecBarReo = new byte[1] ;
      P0AJU6_n1168LecBarReo = new boolean[] {false} ;
      P0AJU6_A1167LecBarCod = new int[1] ;
      P0AJU6_n1167LecBarCod = new boolean[] {false} ;
      P0AJU6_A1166LecMaqCod = new String[] {""} ;
      P0AJU6_A396EmprCod = new String[] {""} ;
      A1169LecBarPar = "" ;
      A1166LecMaqCod = "" ;
      P0AJU8_A1792GruBarPar = new String[] {""} ;
      P0AJU8_A1793GruBarReo = new byte[1] ;
      P0AJU8_A1791GruBarCod = new int[1] ;
      P0AJU8_A1794GruLecMaq = new String[] {""} ;
      P0AJU8_A396EmprCod = new String[] {""} ;
      P0AJU8_A1795GruOrd = new byte[1] ;
      A1792GruBarPar = "" ;
      A1794GruLecMaq = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.abrirfase__default(),
         new Object[] {
             new Object[] {
            P0AJU2_A194BarOrdLin, P0AJU2_A758ProCod, P0AJU2_A130BarCodPar, P0AJU2_A132BarCodReo, P0AJU2_A129BarCod, P0AJU2_A396EmprCod, P0AJU2_A153BarFasEst, P0AJU2_A460FasDsc, P0AJU2_A457FasCod, P0AJU2_A227BarUni,
            P0AJU2_A160BarFecRea, P0AJU2_A3298BarFecRIni, P0AJU2_A215BarTieRea, P0AJU2_A165BarHorIni, P0AJU2_A164BarHorFin, P0AJU2_A4442BarFasDTI, P0AJU2_n4442BarFasDTI, P0AJU2_A4443BarFasDTF, P0AJU2_n4443BarFasDTF, P0AJU2_A3837BarFasKgm,
            P0AJU2_n3837BarFasKgm, P0AJU2_A3838BarFasMtr, P0AJU2_n3838BarFasMtr, P0AJU2_A5719BarFasKgT, P0AJU2_n5719BarFasKgT, P0AJU2_A5720BarFasMtT, P0AJU2_n5720BarFasMtT
            }
            , new Object[] {
            }
            , new Object[] {
            P0AJU4_A396EmprCod, P0AJU4_A129BarCod, P0AJU4_A132BarCodReo, P0AJU4_A130BarCodPar, P0AJU4_A194BarOrdLin, P0AJU4_A656ParCod, P0AJU4_n656ParCod, P0AJU4_A602MaqCod, P0AJU4_A558HisProFec, P0AJU4_A561HisProLin
            }
            , new Object[] {
            }
            , new Object[] {
            P0AJU6_A1169LecBarPar, P0AJU6_n1169LecBarPar, P0AJU6_A1168LecBarReo, P0AJU6_n1168LecBarReo, P0AJU6_A1167LecBarCod, P0AJU6_n1167LecBarCod, P0AJU6_A1166LecMaqCod, P0AJU6_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P0AJU8_A1792GruBarPar, P0AJU8_A1793GruBarReo, P0AJU8_A1791GruBarCod, P0AJU8_A1794GruLecMaq, P0AJU8_A396EmprCod, P0AJU8_A1795GruOrd
            }
            , new Object[] {
            }
         }
      );
      AV24Pgmname = "PedidosClienteSinDetalle.AbrirFase" ;
      /* GeneXus formulas. */
      AV24Pgmname = "PedidosClienteSinDetalle.AbrirFase" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10barcodreo ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte A1168LecBarReo ;
   private byte A1793GruBarReo ;
   private byte A1795GruOrd ;
   private short AV12barordlin ;
   private short AV17barfas ;
   private short A194BarOrdLin ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short AV18lhipro ;
   private short A656ParCod ;
   private short AV20lector ;
   private short AV21grulec ;
   private short Gx_err ;
   private int AV9barcod ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int A1167LecBarCod ;
   private int A1791GruBarCod ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private String AV8emprcod ;
   private String AV11barcodpar ;
   private String AV13Procod ;
   private String AV14usurcod ;
   private String AV15station ;
   private String AV24Pgmname ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String AV19Maqcod ;
   private String A602MaqCod ;
   private String A1169LecBarPar ;
   private String A1166LecMaqCod ;
   private String A1792GruBarPar ;
   private String A1794GruLecMaq ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date A558HisProFec ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n5719BarFasKgT ;
   private boolean n5720BarFasMtT ;
   private boolean n656ParCod ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private String AV16Inc_obs ;
   private IDataStoreProvider pr_default ;
   private short[] P0AJU2_A194BarOrdLin ;
   private String[] P0AJU2_A758ProCod ;
   private String[] P0AJU2_A130BarCodPar ;
   private byte[] P0AJU2_A132BarCodReo ;
   private int[] P0AJU2_A129BarCod ;
   private String[] P0AJU2_A396EmprCod ;
   private byte[] P0AJU2_A153BarFasEst ;
   private String[] P0AJU2_A460FasDsc ;
   private String[] P0AJU2_A457FasCod ;
   private java.math.BigDecimal[] P0AJU2_A227BarUni ;
   private java.util.Date[] P0AJU2_A160BarFecRea ;
   private java.util.Date[] P0AJU2_A3298BarFecRIni ;
   private java.math.BigDecimal[] P0AJU2_A215BarTieRea ;
   private short[] P0AJU2_A165BarHorIni ;
   private short[] P0AJU2_A164BarHorFin ;
   private java.util.Date[] P0AJU2_A4442BarFasDTI ;
   private boolean[] P0AJU2_n4442BarFasDTI ;
   private java.util.Date[] P0AJU2_A4443BarFasDTF ;
   private boolean[] P0AJU2_n4443BarFasDTF ;
   private java.math.BigDecimal[] P0AJU2_A3837BarFasKgm ;
   private boolean[] P0AJU2_n3837BarFasKgm ;
   private java.math.BigDecimal[] P0AJU2_A3838BarFasMtr ;
   private boolean[] P0AJU2_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AJU2_A5719BarFasKgT ;
   private boolean[] P0AJU2_n5719BarFasKgT ;
   private java.math.BigDecimal[] P0AJU2_A5720BarFasMtT ;
   private boolean[] P0AJU2_n5720BarFasMtT ;
   private String[] P0AJU4_A396EmprCod ;
   private int[] P0AJU4_A129BarCod ;
   private byte[] P0AJU4_A132BarCodReo ;
   private String[] P0AJU4_A130BarCodPar ;
   private short[] P0AJU4_A194BarOrdLin ;
   private short[] P0AJU4_A656ParCod ;
   private boolean[] P0AJU4_n656ParCod ;
   private String[] P0AJU4_A602MaqCod ;
   private java.util.Date[] P0AJU4_A558HisProFec ;
   private int[] P0AJU4_A561HisProLin ;
   private String[] P0AJU6_A1169LecBarPar ;
   private boolean[] P0AJU6_n1169LecBarPar ;
   private byte[] P0AJU6_A1168LecBarReo ;
   private boolean[] P0AJU6_n1168LecBarReo ;
   private int[] P0AJU6_A1167LecBarCod ;
   private boolean[] P0AJU6_n1167LecBarCod ;
   private String[] P0AJU6_A1166LecMaqCod ;
   private String[] P0AJU6_A396EmprCod ;
   private String[] P0AJU8_A1792GruBarPar ;
   private byte[] P0AJU8_A1793GruBarReo ;
   private int[] P0AJU8_A1791GruBarCod ;
   private String[] P0AJU8_A1794GruLecMaq ;
   private String[] P0AJU8_A396EmprCod ;
   private byte[] P0AJU8_A1795GruOrd ;
}

final  class abrirfase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJU2", "SELECT T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.BarUni, T1.BarFecRea, T1.BarFecRIni, T1.BarTieRea, T1.BarHorIni, T1.BarHorFin, T1.BarFasDTI, T1.BarFasDTF, T1.BarFasKgm, T1.BarFasMtr, T1.BarFasKgT, T1.BarFasMtT FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AJU3", "UPDATE TXPBARFAS SET BarFasEst=?, BarUni=?, BarFecRea=?, BarFecRIni=?, BarTieRea=?, BarHorIni=?, BarHorFin=?, BarFasDTI=?, BarFasDTF=?, BarFasKgm=?, BarFasMtr=?, BarFasKgT=?, BarFasMtT=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P0AJU4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, ParCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AJU5", "DELETE FROM TXPLHIPRO  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
         ,new ForEachCursor("P0AJU6", "SELECT LecBarPar, LecBarReo, LecBarCod, LecMaqCod, EmprCod FROM TXPLECTOR WHERE (EmprCod = ? and LecMaqCod = ?) AND (LecBarCod = ?) AND (LecBarReo = ?) AND (LecBarPar = ?) ORDER BY EmprCod, LecMaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AJU7", "DELETE FROM TXPLECTOR  WHERE EmprCod = ? AND LecMaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLECTOR")
         ,new ForEachCursor("P0AJU8", "SELECT GruBarPar, GruBarReo, GruBarCod, GruLecMaq, EmprCod, GruOrd FROM TXPGRULEC WHERE (EmprCod = ? and GruLecMaq = ?) AND (GruBarCod = ?) AND (GruBarReo = ?) AND (GruBarPar = ?) ORDER BY EmprCod, GruLecMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AJU9", "DELETE FROM TXPGRULEC  WHERE EmprCod = ? AND GruLecMaq = ? AND GruOrd = ? AND GruBarCod = ? AND GruBarReo = ? AND GruBarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGRULEC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[18], 2);
               }
               stmt.setString(14, (String)parms[19], 3);
               stmt.setInt(15, ((Number) parms[20]).intValue());
               stmt.setByte(16, ((Number) parms[21]).byteValue());
               stmt.setString(17, (String)parms[22], 1);
               stmt.setString(18, (String)parms[23], 8);
               stmt.setShort(19, ((Number) parms[24]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

