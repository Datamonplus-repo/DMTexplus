package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aeliminacionmacro extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aeliminacionmacro pgm = new aeliminacionmacro (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public aeliminacionmacro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aeliminacionmacro.class ), "" );
   }

   public aeliminacionmacro( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      aeliminacionmacro.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      aeliminacionmacro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      aeliminacionmacro.this.AV16Maccod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV18NoBaragr ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOBARG", ""), GXv_int2) ;
      aeliminacionmacro.this.GXt_int1 = GXv_int2[0] ;
      AV18NoBaragr = GXt_int1 ;
      GXt_char3 = AV24Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      aeliminacionmacro.this.GXt_char3 = GXv_char4[0] ;
      AV24Station = GXt_char3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = AV25EmprNom ;
      GXv_char6[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char4, GXv_char5, GXv_char6) ;
      aeliminacionmacro.this.A396EmprCod = GXv_char4[0] ;
      aeliminacionmacro.this.AV25EmprNom = GXv_char5[0] ;
      aeliminacionmacro.this.AV23UsurCod = GXv_char6[0] ;
      AV14RecMaq = (byte)(0) ;
      AV17Err_m = (byte)(0) ;
      /* Using cursor P09JF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16Maccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1199MacCod = P09JF2_A1199MacCod[0] ;
         A1200MacUltLin = P09JF2_A1200MacUltLin[0] ;
         n1200MacUltLin = P09JF2_n1200MacUltLin[0] ;
         /* Using cursor P09JF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1203MacBarCod = P09JF3_A1203MacBarCod[0] ;
            A1204MacBarReo = P09JF3_A1204MacBarReo[0] ;
            A1205MacBarPar = P09JF3_A1205MacBarPar[0] ;
            A1201MacLin = P09JF3_A1201MacLin[0] ;
            AV11BarCodm = A1203MacBarCod ;
            AV12BarCodreom = A1204MacBarReo ;
            AV13BarCodParm = A1205MacBarPar ;
            new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV11BarCodm, AV12BarCodreom, AV13BarCodParm) ;
            /* Execute user subroutine: 'RECMAQ' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV14RecMaq == 1 )
            {
               AV17Err_m = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV17Err_m == 1 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17Err_m == 1 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. NO se puede eliminar esta MACRO.", "") + GXutil.newLine( ) + httpContext.getMessage( "Existe Receta Quimica.", "") + GXutil.newLine( ) + httpContext.getMessage( "Contactar con el responsable de Tinte.", "") + GXutil.newLine( ) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV26Inc_obs = "" ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV20TabHdrs[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV21i = (short)(1) ;
      /* Using cursor P09JF4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV16Maccod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1199MacCod = P09JF4_A1199MacCod[0] ;
         A1200MacUltLin = P09JF4_A1200MacUltLin[0] ;
         n1200MacUltLin = P09JF4_n1200MacUltLin[0] ;
         AV26Inc_obs = httpContext.getMessage( "LMACRO.Eliminacion Accesorios, Nº ", "") + GXutil.str( AV16Maccod, 8, 0) + GXutil.newLine( ) ;
         /* Using cursor P09JF5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1203MacBarCod = P09JF5_A1203MacBarCod[0] ;
            A1204MacBarReo = P09JF5_A1204MacBarReo[0] ;
            A1205MacBarPar = P09JF5_A1205MacBarPar[0] ;
            A1202MacDisCod = P09JF5_A1202MacDisCod[0] ;
            A1201MacLin = P09JF5_A1201MacLin[0] ;
            AV8BarCod = A1203MacBarCod ;
            AV9BarCodreo = A1204MacBarReo ;
            AV10BarCodPar = A1205MacBarPar ;
            if ( AV18NoBaragr == 0 )
            {
               AV20TabHdrs[AV21i-1] = GXutil.str( AV8BarCod, 8, 0) + GXutil.str( AV9BarCodreo, 1, 0) + AV10BarCodPar ;
               AV21i = (short)(AV21i+1) ;
            }
            AV26Inc_obs += httpContext.getMessage( "N Disp Interna ", "") + GXutil.str( A1202MacDisCod, 8, 0) + GXutil.newLine( ) ;
            AV26Inc_obs += httpContext.getMessage( "Hdr            ", "") + GXutil.str( A1203MacBarCod, 8, 0) + "-" + GXutil.str( A1204MacBarReo, 1, 0) + A1205MacBarPar + GXutil.newLine( ) ;
            /* Using cursor P09JF6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV26Inc_obs += httpContext.getMessage( "CMACRO.Eliminacion Accesorio, Nº ", "") + GXutil.str( AV16Maccod, 8, 0) + GXutil.newLine( ) ;
         /* Using cursor P09JF7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( ! (GXutil.strcmp("", AV26Inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV40Pgmname, AV23UsurCod, AV24Station, AV26Inc_obs, AV16Maccod, (byte)(0), "") ;
      }
      if ( AV18NoBaragr == 0 )
      {
         AV21i = (short)(1) ;
         while ( AV21i <= 1000 )
         {
            if ( GXutil.strcmp(AV20TabHdrs[AV21i-1], " ") == 0 )
            {
               if (true) break;
            }
            AV8BarCod = (int)(GXutil.lval( GXutil.substring( AV20TabHdrs[AV21i-1], 1, 8))) ;
            AV9BarCodreo = (byte)(GXutil.lval( GXutil.substring( AV20TabHdrs[AV21i-1], 9, 1))) ;
            AV10BarCodPar = GXutil.substring( AV20TabHdrs[AV21i-1], 10, 1) ;
            /* Execute user subroutine: 'BARAGR' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV21i = (short)(AV21i+1) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BARAGR' Routine */
      returnInSub = false ;
      AV26Inc_obs = httpContext.getMessage( "Eliminacion BarAgr, Hdr ", "") + GXutil.str( AV8BarCod, 8, 0) + "-" + GXutil.str( AV9BarCodreo, 1, 0) + AV10BarCodPar + GXutil.newLine( ) ;
      AV31baragr = (short)(0) ;
      /* Using cursor P09JF8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodreo), AV10BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A130BarCodPar = P09JF8_A130BarCodPar[0] ;
         A132BarCodReo = P09JF8_A132BarCodReo[0] ;
         A129BarCod = P09JF8_A129BarCod[0] ;
         A590KgmAgr = P09JF8_A590KgmAgr[0] ;
         A122BarAgrPar = P09JF8_A122BarAgrPar[0] ;
         A124BarAgrReo = P09JF8_A124BarAgrReo[0] ;
         A119BarAgrCod = P09JF8_A119BarAgrCod[0] ;
         AV31baragr = (short)(1) ;
         AV26Inc_obs += httpContext.getMessage( "Agrupada con", "") + GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar + GXutil.newLine( ) ;
         /* Using cursor P09JF9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( AV31baragr == 1 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV40Pgmname, AV23UsurCod, AV24Station, AV26Inc_obs, AV8BarCod, AV9BarCodreo, AV10BarCodPar) ;
      }
      AV32barcad = (short)(0) ;
      /* Using cursor P09JF10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodreo), AV10BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A130BarCodPar = P09JF10_A130BarCodPar[0] ;
         A132BarCodReo = P09JF10_A132BarCodReo[0] ;
         A129BarCod = P09JF10_A129BarCod[0] ;
         A120BarAgrEst = P09JF10_A120BarAgrEst[0] ;
         A3595BarMacCod = P09JF10_A3595BarMacCod[0] ;
         A120BarAgrEst = httpContext.getMessage( "N", "") ;
         A3595BarMacCod = ((AV19Indutexma==1) ? 0 : A3595BarMacCod) ;
         AV32barcad = (short)(1) ;
         AV26Inc_obs = httpContext.getMessage( "Actualizo BARCAD, Hdr ", "") + GXutil.str( AV8BarCod, 8, 0) + "-" + GXutil.str( AV9BarCodreo, 1, 0) + AV10BarCodPar + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "BarAgrEst ", "") + httpContext.getMessage( "N", "") + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "BarMaccod ", "") + GXutil.str( A3595BarMacCod, 8, 0) + GXutil.newLine( ) ;
         /* Using cursor P09JF11 */
         pr_default.execute(9, new Object[] {A120BarAgrEst, Integer.valueOf(A3595BarMacCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      if ( AV32barcad == 1 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV40Pgmname, AV23UsurCod, AV24Station, AV26Inc_obs, AV8BarCod, AV9BarCodreo, AV10BarCodPar) ;
      }
   }

   public void S121( )
   {
      /* 'RECMAQ' Routine */
      returnInSub = false ;
      AV14RecMaq = (byte)(0) ;
      /* Using cursor P09JF12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV11BarCodm), Byte.valueOf(AV12BarCodreom), AV13BarCodParm});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A130BarCodPar = P09JF12_A130BarCodPar[0] ;
         A132BarCodReo = P09JF12_A132BarCodReo[0] ;
         A129BarCod = P09JF12_A129BarCod[0] ;
         A2805RecVolPrd = P09JF12_A2805RecVolPrd[0] ;
         A2804RecLinMaq = P09JF12_A2804RecLinMaq[0] ;
         AV14RecMaq = (byte)(1) ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(eliminacionmacro.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = aeliminacionmacro.this.A396EmprCod;
      this.aP1[0] = aeliminacionmacro.this.AV16Maccod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pedidosclientesindetalle.aeliminacionmacro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV24Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV25EmprNom = "" ;
      GXv_char5 = new String[1] ;
      AV23UsurCod = "" ;
      GXv_char6 = new String[1] ;
      scmdbuf = "" ;
      P09JF2_A396EmprCod = new String[] {""} ;
      P09JF2_A1199MacCod = new int[1] ;
      P09JF2_A1200MacUltLin = new short[1] ;
      P09JF2_n1200MacUltLin = new boolean[] {false} ;
      P09JF3_A396EmprCod = new String[] {""} ;
      P09JF3_A1199MacCod = new int[1] ;
      P09JF3_A1203MacBarCod = new int[1] ;
      P09JF3_A1204MacBarReo = new byte[1] ;
      P09JF3_A1205MacBarPar = new String[] {""} ;
      P09JF3_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV13BarCodParm = "" ;
      Gx_msg = "" ;
      AV26Inc_obs = "" ;
      AV20TabHdrs = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV20TabHdrs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P09JF4_A396EmprCod = new String[] {""} ;
      P09JF4_A1199MacCod = new int[1] ;
      P09JF4_A1200MacUltLin = new short[1] ;
      P09JF4_n1200MacUltLin = new boolean[] {false} ;
      P09JF5_A396EmprCod = new String[] {""} ;
      P09JF5_A1199MacCod = new int[1] ;
      P09JF5_A1203MacBarCod = new int[1] ;
      P09JF5_A1204MacBarReo = new byte[1] ;
      P09JF5_A1205MacBarPar = new String[] {""} ;
      P09JF5_A1202MacDisCod = new int[1] ;
      P09JF5_A1201MacLin = new short[1] ;
      AV10BarCodPar = "" ;
      AV40Pgmname = "" ;
      P09JF8_A396EmprCod = new String[] {""} ;
      P09JF8_A130BarCodPar = new String[] {""} ;
      P09JF8_A132BarCodReo = new byte[1] ;
      P09JF8_A129BarCod = new int[1] ;
      P09JF8_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09JF8_A122BarAgrPar = new String[] {""} ;
      P09JF8_A124BarAgrReo = new byte[1] ;
      P09JF8_A119BarAgrCod = new int[1] ;
      A130BarCodPar = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A122BarAgrPar = "" ;
      P09JF10_A396EmprCod = new String[] {""} ;
      P09JF10_A130BarCodPar = new String[] {""} ;
      P09JF10_A132BarCodReo = new byte[1] ;
      P09JF10_A129BarCod = new int[1] ;
      P09JF10_A120BarAgrEst = new String[] {""} ;
      P09JF10_A3595BarMacCod = new int[1] ;
      A120BarAgrEst = "" ;
      P09JF12_A396EmprCod = new String[] {""} ;
      P09JF12_A130BarCodPar = new String[] {""} ;
      P09JF12_A132BarCodReo = new byte[1] ;
      P09JF12_A129BarCod = new int[1] ;
      P09JF12_A2805RecVolPrd = new int[1] ;
      P09JF12_A2804RecLinMaq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.aeliminacionmacro__default(),
         new Object[] {
             new Object[] {
            P09JF2_A396EmprCod, P09JF2_A1199MacCod, P09JF2_A1200MacUltLin, P09JF2_n1200MacUltLin
            }
            , new Object[] {
            P09JF3_A396EmprCod, P09JF3_A1199MacCod, P09JF3_A1203MacBarCod, P09JF3_A1204MacBarReo, P09JF3_A1205MacBarPar, P09JF3_A1201MacLin
            }
            , new Object[] {
            P09JF4_A396EmprCod, P09JF4_A1199MacCod, P09JF4_A1200MacUltLin, P09JF4_n1200MacUltLin
            }
            , new Object[] {
            P09JF5_A396EmprCod, P09JF5_A1199MacCod, P09JF5_A1203MacBarCod, P09JF5_A1204MacBarReo, P09JF5_A1205MacBarPar, P09JF5_A1202MacDisCod, P09JF5_A1201MacLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P09JF8_A396EmprCod, P09JF8_A130BarCodPar, P09JF8_A132BarCodReo, P09JF8_A129BarCod, P09JF8_A590KgmAgr, P09JF8_A122BarAgrPar, P09JF8_A124BarAgrReo, P09JF8_A119BarAgrCod
            }
            , new Object[] {
            }
            , new Object[] {
            P09JF10_A396EmprCod, P09JF10_A130BarCodPar, P09JF10_A132BarCodReo, P09JF10_A129BarCod, P09JF10_A120BarAgrEst, P09JF10_A3595BarMacCod
            }
            , new Object[] {
            }
            , new Object[] {
            P09JF12_A396EmprCod, P09JF12_A130BarCodPar, P09JF12_A132BarCodReo, P09JF12_A129BarCod, P09JF12_A2805RecVolPrd, P09JF12_A2804RecLinMaq
            }
         }
      );
      AV40Pgmname = "PedidosClienteSinDetalle.AEliminacionMacro" ;
      /* GeneXus formulas. */
      AV40Pgmname = "PedidosClienteSinDetalle.AEliminacionMacro" ;
      Gx_err = (short)(0) ;
   }

   private byte AV18NoBaragr ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV14RecMaq ;
   private byte AV17Err_m ;
   private byte A1204MacBarReo ;
   private byte AV12BarCodreom ;
   private byte AV9BarCodreo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte AV19Indutexma ;
   private short A1200MacUltLin ;
   private short A1201MacLin ;
   private short AV21i ;
   private short AV31baragr ;
   private short AV32barcad ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV16Maccod ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int AV11BarCodm ;
   private int GX_I ;
   private int A1202MacDisCod ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int A3595BarMacCod ;
   private int A2805RecVolPrd ;
   private java.math.BigDecimal A590KgmAgr ;
   private String A396EmprCod ;
   private String AV24Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV25EmprNom ;
   private String GXv_char5[] ;
   private String AV23UsurCod ;
   private String GXv_char6[] ;
   private String scmdbuf ;
   private String A1205MacBarPar ;
   private String AV13BarCodParm ;
   private String Gx_msg ;
   private String AV20TabHdrs[] ;
   private String AV10BarCodPar ;
   private String AV40Pgmname ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private String A120BarAgrEst ;
   private boolean n1200MacUltLin ;
   private boolean returnInSub ;
   private String AV26Inc_obs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09JF2_A396EmprCod ;
   private int[] P09JF2_A1199MacCod ;
   private short[] P09JF2_A1200MacUltLin ;
   private boolean[] P09JF2_n1200MacUltLin ;
   private String[] P09JF3_A396EmprCod ;
   private int[] P09JF3_A1199MacCod ;
   private int[] P09JF3_A1203MacBarCod ;
   private byte[] P09JF3_A1204MacBarReo ;
   private String[] P09JF3_A1205MacBarPar ;
   private short[] P09JF3_A1201MacLin ;
   private String[] P09JF4_A396EmprCod ;
   private int[] P09JF4_A1199MacCod ;
   private short[] P09JF4_A1200MacUltLin ;
   private boolean[] P09JF4_n1200MacUltLin ;
   private String[] P09JF5_A396EmprCod ;
   private int[] P09JF5_A1199MacCod ;
   private int[] P09JF5_A1203MacBarCod ;
   private byte[] P09JF5_A1204MacBarReo ;
   private String[] P09JF5_A1205MacBarPar ;
   private int[] P09JF5_A1202MacDisCod ;
   private short[] P09JF5_A1201MacLin ;
   private String[] P09JF8_A396EmprCod ;
   private String[] P09JF8_A130BarCodPar ;
   private byte[] P09JF8_A132BarCodReo ;
   private int[] P09JF8_A129BarCod ;
   private java.math.BigDecimal[] P09JF8_A590KgmAgr ;
   private String[] P09JF8_A122BarAgrPar ;
   private byte[] P09JF8_A124BarAgrReo ;
   private int[] P09JF8_A119BarAgrCod ;
   private String[] P09JF10_A396EmprCod ;
   private String[] P09JF10_A130BarCodPar ;
   private byte[] P09JF10_A132BarCodReo ;
   private int[] P09JF10_A129BarCod ;
   private String[] P09JF10_A120BarAgrEst ;
   private int[] P09JF10_A3595BarMacCod ;
   private String[] P09JF12_A396EmprCod ;
   private String[] P09JF12_A130BarCodPar ;
   private byte[] P09JF12_A132BarCodReo ;
   private int[] P09JF12_A129BarCod ;
   private int[] P09JF12_A2805RecVolPrd ;
   private short[] P09JF12_A2804RecLinMaq ;
}

final  class aeliminacionmacro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09JF2", "SELECT EmprCod, MacCod, MacUltLin FROM TXPCMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09JF3", "SELECT EmprCod, MacCod, MacBarCod, MacBarReo, MacBarPar, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod, MacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09JF4", "SELECT EmprCod, MacCod, MacUltLin FROM TXPCMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09JF5", "SELECT EmprCod, MacCod, MacBarCod, MacBarReo, MacBarPar, MacDisCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod, MacLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09JF6", "DELETE FROM TXPLMACRO  WHERE EmprCod = ? AND MacCod = ? AND MacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACRO")
         ,new UpdateCursor("P09JF7", "DELETE FROM TXPCMACRO  WHERE EmprCod = ? AND MacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMACRO")
         ,new ForEachCursor("P09JF8", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09JF9", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new ForEachCursor("P09JF10", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAgrEst, BarMacCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09JF11", "UPDATE TXPBARCAD SET BarAgrEst=?, BarMacCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P09JF12", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, RecVolPrd, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

