package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rmod008_carga_sdt extends GXProcedure
{
   public rmod008_carga_sdt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rmod008_carga_sdt.class ), "" );
   }

   public rmod008_carga_sdt( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             byte aP5 ,
                             byte aP6 ,
                             short aP7 ,
                             short[] aP8 ,
                             String aP9 ,
                             String aP10 )
   {
      rmod008_carga_sdt.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        byte aP5 ,
                        byte aP6 ,
                        short aP7 ,
                        short[] aP8 ,
                        String aP9 ,
                        String aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             byte aP5 ,
                             byte aP6 ,
                             short aP7 ,
                             short[] aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String[] aP11 )
   {
      rmod008_carga_sdt.this.A396EmprCod = aP0;
      rmod008_carga_sdt.this.AV36vPCliCod = aP1;
      rmod008_carga_sdt.this.AV41vUCliCod = aP2;
      rmod008_carga_sdt.this.AV37vPFecGen = aP3;
      rmod008_carga_sdt.this.AV42vUFecGen = aP4;
      rmod008_carga_sdt.this.AV38vPSit = aP5;
      rmod008_carga_sdt.this.AV43vUSit = aP6;
      rmod008_carga_sdt.this.AV22TipArt1 = aP7;
      rmod008_carga_sdt.this.AV23TIpArt2 = aP8[0];
      this.aP8 = aP8;
      rmod008_carga_sdt.this.AV44Barserfrom = aP9;
      rmod008_carga_sdt.this.AV45Barserto = aP10;
      rmod008_carga_sdt.this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV18ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV18ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV18ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV18ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV18ProgressIndicator.show();
      AV8CantidadRegistrosAProcesar = (short)(0) ;
      /* Optimized group. */
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV36vPCliCod) ,
                                           Integer.valueOf(AV41vUCliCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A9U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV36vPCliCod), Integer.valueOf(AV41vUCliCod)});
      cV8CantidadRegistrosAProcesar = P0A9U2_AV8CantidadRegistrosAProcesar[0] ;
      pr_default.close(0);
      AV8CantidadRegistrosAProcesar = (short)(AV8CantidadRegistrosAProcesar+cV8CantidadRegistrosAProcesar*1) ;
      /* End optimized group. */
      if ( AV8CantidadRegistrosAProcesar == 0 )
      {
         AV8CantidadRegistrosAProcesar = (short)(1) ;
      }
      AV15messages.clear();
      AV19RMOD008_SDT.clear();
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV36vPCliCod) ,
                                           Integer.valueOf(AV41vUCliCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A10045CliAct ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A9U3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV36vPCliCod), Integer.valueOf(AV41vUCliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P0A9U3_A252CliCod[0] ;
         n252CliCod = P0A9U3_n252CliCod[0] ;
         A10045CliAct = P0A9U3_A10045CliAct[0] ;
         A279CliNom = P0A9U3_A279CliNom[0] ;
         AV40vTotCli = DecimalUtil.doubleToDec(0) ;
         AV12FlagCli = (byte)(0) ;
         AV39vTot_mts_c = DecimalUtil.doubleToDec(0) ;
         AV10CliCod = A252CliCod ;
         AV32Tot_p = DecimalUtil.doubleToDec(0) ;
         AV35Tot_t = DecimalUtil.doubleToDec(0) ;
         AV24Tot_a = DecimalUtil.doubleToDec(0) ;
         AV9CantidadRegistrosProcesados = (short)(AV9CantidadRegistrosProcesados+1) ;
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              AV37vPFecGen ,
                                              AV42vUFecGen ,
                                              Byte.valueOf(AV38vPSit) ,
                                              Byte.valueOf(AV43vUSit) ,
                                              Short.valueOf(AV22TipArt1) ,
                                              Short.valueOf(AV23TIpArt2) ,
                                              AV44Barserfrom ,
                                              AV45Barserto ,
                                              A159BarFecGen ,
                                              Byte.valueOf(A213BarSit) ,
                                              Short.valueOf(A217BarTipArt) ,
                                              A212BarSer ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN
                                              }
         });
         /* Using cursor P0A9U5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV37vPFecGen, AV42vUFecGen, Byte.valueOf(AV38vPSit), Byte.valueOf(AV43vUSit), Short.valueOf(AV22TipArt1), Short.valueOf(AV23TIpArt2), AV44Barserfrom, AV45Barserto});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A212BarSer = P0A9U5_A212BarSer[0] ;
            A217BarTipArt = P0A9U5_A217BarTipArt[0] ;
            n217BarTipArt = P0A9U5_n217BarTipArt[0] ;
            A213BarSit = P0A9U5_A213BarSit[0] ;
            A159BarFecGen = P0A9U5_A159BarFecGen[0] ;
            A166BarKgm = P0A9U5_A166BarKgm[0] ;
            n166BarKgm = P0A9U5_n166BarKgm[0] ;
            A130BarCodPar = P0A9U5_A130BarCodPar[0] ;
            A132BarCodReo = P0A9U5_A132BarCodReo[0] ;
            A129BarCod = P0A9U5_A129BarCod[0] ;
            A166BarKgm = P0A9U5_A166BarKgm[0] ;
            n166BarKgm = P0A9U5_n166BarKgm[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            if ( ( A213BarSit >= 1 ) && ( A213BarSit <= 3 ) )
            {
               AV32Tot_p = AV32Tot_p.add(A166BarKgm) ;
            }
            else if ( ( A213BarSit == 4 ) && ( A213BarSit == 4 ) )
            {
               AV35Tot_t = AV35Tot_t.add(A166BarKgm) ;
            }
            else if ( ( A213BarSit >= 5 ) && ( A213BarSit <= 6 ) )
            {
               AV24Tot_a = AV24Tot_a.add(A166BarKgm) ;
            }
            else
            {
            }
            AV14message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV14message.setgxTv_SdtMessages_Message_Id( A13696BarNHdr );
            AV14message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Barsit=", "")+GXutil.str( A213BarSit, 2, 0)+httpContext.getMessage( "Barkgm=", "")+GXutil.str( A166BarKgm, 9, 2)+httpContext.getMessage( "&tot_a=", "")+GXutil.str( AV24Tot_a, 13, 2) );
            AV15messages.add(AV14message, 0);
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Execute user subroutine: 'ALMACEN' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( (AV20Saldo_k.add(AV32Tot_p).add(AV24Tot_a).add(AV35Tot_t)).doubleValue() != 0 )
         {
            AV13Item = (app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)new app.pedidosclientesindetalle.SdtRMOD008_SDT_Item(remoteHandle, context);
            AV13Item.setgxTv_SdtRMOD008_SDT_Item_Clicod( A252CliCod );
            AV13Item.setgxTv_SdtRMOD008_SDT_Item_Clinom( A279CliNom );
            AV13Item.setgxTv_SdtRMOD008_SDT_Item_Saldo_k( AV20Saldo_k );
            AV13Item.setgxTv_SdtRMOD008_SDT_Item_Saldo_m( AV21Saldo_m );
            AV13Item.setgxTv_SdtRMOD008_SDT_Item_Tot_p( AV32Tot_p );
            AV13Item.setgxTv_SdtRMOD008_SDT_Item_Tot_l( AV20Saldo_k.add(AV32Tot_p).add(AV24Tot_a).add(AV35Tot_t) );
            AV13Item.setgxTv_SdtRMOD008_SDT_Item_Tot_a( AV24Tot_a );
            AV13Item.setgxTv_SdtRMOD008_SDT_Item_Tot_t( AV35Tot_t );
            AV19RMOD008_SDT.add(AV13Item, 0);
         }
         AV17Porcentaje = (int)((AV9CantidadRegistrosProcesados/ (double) (AV8CantidadRegistrosAProcesar))*100) ;
         AV18ProgressIndicator.setgxTv_SdtProgress_Value( AV17Porcentaje );
         AV18ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV9CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV8CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( GXutil.str( A252CliCod, 6, 0)), A279CliNom, "", "", "", "", ""));
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV18ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV18ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV18ProgressIndicator.hide();
      AV11DataJSon = AV19RMOD008_SDT.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'ALMACEN' Routine */
      returnInSub = false ;
      AV29Tot_Ent_K = DecimalUtil.doubleToDec(0) ;
      AV33Tot_Sal_K = DecimalUtil.doubleToDec(0) ;
      AV30Tot_Ent_m = DecimalUtil.doubleToDec(0) ;
      AV34Tot_Sal_m = DecimalUtil.doubleToDec(0) ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV37vPFecGen ,
                                           AV42vUFecGen ,
                                           Short.valueOf(AV22TipArt1) ,
                                           Short.valueOf(AV23TIpArt2) ,
                                           AV44Barserfrom ,
                                           AV45Barserto ,
                                           A49AlbRFen ,
                                           Short.valueOf(A6263AlbRTartC) ,
                                           A45AlbRef ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV10CliCod) ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor P0A9U6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV10CliCod), AV37vPFecGen, AV42vUFecGen, Short.valueOf(AV22TipArt1), Short.valueOf(AV23TIpArt2), AV44Barserfrom, AV45Barserto});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A45AlbRef = P0A9U6_A45AlbRef[0] ;
         A6263AlbRTartC = P0A9U6_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P0A9U6_n6263AlbRTartC[0] ;
         A49AlbRFen = P0A9U6_A49AlbRFen[0] ;
         A252CliCod = P0A9U6_A252CliCod[0] ;
         n252CliCod = P0A9U6_n252CliCod[0] ;
         A56AlbRUni = P0A9U6_A56AlbRUni[0] ;
         A58AlbRUniEnt = P0A9U6_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P0A9U6_A60AlbRUniUti[0] ;
         A44AlbRecCod = P0A9U6_A44AlbRecCod[0] ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            AV29Tot_Ent_K = AV29Tot_Ent_K.add(A58AlbRUniEnt) ;
            AV33Tot_Sal_K = AV33Tot_Sal_K.add(A60AlbRUniUti) ;
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            AV30Tot_Ent_m = AV30Tot_Ent_m.add(A58AlbRUniEnt) ;
            AV34Tot_Sal_m = AV34Tot_Sal_m.add(A60AlbRUniUti) ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV21Saldo_m = AV30Tot_Ent_m.subtract(AV34Tot_Sal_m) ;
      AV20Saldo_k = AV29Tot_Ent_K.subtract(AV33Tot_Sal_K) ;
   }

   protected void cleanup( )
   {
      this.aP8[0] = rmod008_carga_sdt.this.AV23TIpArt2;
      this.aP11[0] = rmod008_carga_sdt.this.AV11DataJSon;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11DataJSon = "" ;
      AV18ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      P0A9U2_AV8CantidadRegistrosAProcesar = new short[1] ;
      AV15messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV19RMOD008_SDT = new GXBaseCollection<app.pedidosclientesindetalle.SdtRMOD008_SDT_Item>(app.pedidosclientesindetalle.SdtRMOD008_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      A10045CliAct = "" ;
      P0A9U3_A396EmprCod = new String[] {""} ;
      P0A9U3_A252CliCod = new int[1] ;
      P0A9U3_n252CliCod = new boolean[] {false} ;
      P0A9U3_A10045CliAct = new String[] {""} ;
      P0A9U3_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      AV40vTotCli = DecimalUtil.ZERO ;
      AV39vTot_mts_c = DecimalUtil.ZERO ;
      AV32Tot_p = DecimalUtil.ZERO ;
      AV35Tot_t = DecimalUtil.ZERO ;
      AV24Tot_a = DecimalUtil.ZERO ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      P0A9U5_A396EmprCod = new String[] {""} ;
      P0A9U5_A252CliCod = new int[1] ;
      P0A9U5_n252CliCod = new boolean[] {false} ;
      P0A9U5_A212BarSer = new String[] {""} ;
      P0A9U5_A217BarTipArt = new short[1] ;
      P0A9U5_n217BarTipArt = new boolean[] {false} ;
      P0A9U5_A213BarSit = new byte[1] ;
      P0A9U5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9U5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9U5_n166BarKgm = new boolean[] {false} ;
      P0A9U5_A130BarCodPar = new String[] {""} ;
      P0A9U5_A132BarCodReo = new byte[1] ;
      P0A9U5_A129BarCod = new int[1] ;
      A166BarKgm = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV14message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV20Saldo_k = DecimalUtil.ZERO ;
      AV13Item = new app.pedidosclientesindetalle.SdtRMOD008_SDT_Item(remoteHandle, context);
      AV21Saldo_m = DecimalUtil.ZERO ;
      AV29Tot_Ent_K = DecimalUtil.ZERO ;
      AV33Tot_Sal_K = DecimalUtil.ZERO ;
      AV30Tot_Ent_m = DecimalUtil.ZERO ;
      AV34Tot_Sal_m = DecimalUtil.ZERO ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      P0A9U6_A396EmprCod = new String[] {""} ;
      P0A9U6_A45AlbRef = new String[] {""} ;
      P0A9U6_A6263AlbRTartC = new short[1] ;
      P0A9U6_n6263AlbRTartC = new boolean[] {false} ;
      P0A9U6_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9U6_A252CliCod = new int[1] ;
      P0A9U6_n252CliCod = new boolean[] {false} ;
      P0A9U6_A56AlbRUni = new String[] {""} ;
      P0A9U6_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9U6_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9U6_A44AlbRecCod = new int[1] ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.rmod008_carga_sdt__default(),
         new Object[] {
             new Object[] {
            P0A9U2_AV8CantidadRegistrosAProcesar
            }
            , new Object[] {
            P0A9U3_A396EmprCod, P0A9U3_A252CliCod, P0A9U3_A10045CliAct, P0A9U3_A279CliNom
            }
            , new Object[] {
            P0A9U5_A396EmprCod, P0A9U5_A252CliCod, P0A9U5_n252CliCod, P0A9U5_A212BarSer, P0A9U5_A217BarTipArt, P0A9U5_n217BarTipArt, P0A9U5_A213BarSit, P0A9U5_A159BarFecGen, P0A9U5_A166BarKgm, P0A9U5_n166BarKgm,
            P0A9U5_A130BarCodPar, P0A9U5_A132BarCodReo, P0A9U5_A129BarCod
            }
            , new Object[] {
            P0A9U6_A396EmprCod, P0A9U6_A45AlbRef, P0A9U6_A6263AlbRTartC, P0A9U6_n6263AlbRTartC, P0A9U6_A49AlbRFen, P0A9U6_A252CliCod, P0A9U6_A56AlbRUni, P0A9U6_A58AlbRUniEnt, P0A9U6_A60AlbRUniUti, P0A9U6_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV38vPSit ;
   private byte AV43vUSit ;
   private byte AV12FlagCli ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short AV22TipArt1 ;
   private short AV23TIpArt2 ;
   private short AV8CantidadRegistrosAProcesar ;
   private short cV8CantidadRegistrosAProcesar ;
   private short AV9CantidadRegistrosProcesados ;
   private short A217BarTipArt ;
   private short A6263AlbRTartC ;
   private short Gx_err ;
   private int AV36vPCliCod ;
   private int AV41vUCliCod ;
   private int A252CliCod ;
   private int AV10CliCod ;
   private int A129BarCod ;
   private int AV17Porcentaje ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV40vTotCli ;
   private java.math.BigDecimal AV39vTot_mts_c ;
   private java.math.BigDecimal AV32Tot_p ;
   private java.math.BigDecimal AV35Tot_t ;
   private java.math.BigDecimal AV24Tot_a ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV20Saldo_k ;
   private java.math.BigDecimal AV21Saldo_m ;
   private java.math.BigDecimal AV29Tot_Ent_K ;
   private java.math.BigDecimal AV33Tot_Sal_K ;
   private java.math.BigDecimal AV30Tot_Ent_m ;
   private java.math.BigDecimal AV34Tot_Sal_m ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private String A396EmprCod ;
   private String AV44Barserfrom ;
   private String AV45Barserto ;
   private String scmdbuf ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String A45AlbRef ;
   private String A56AlbRUni ;
   private java.util.Date AV37vPFecGen ;
   private java.util.Date AV42vUFecGen ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A49AlbRFen ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n6263AlbRTartC ;
   private String AV11DataJSon ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV18ProgressIndicator ;
   private String[] aP11 ;
   private short[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P0A9U2_AV8CantidadRegistrosAProcesar ;
   private String[] P0A9U3_A396EmprCod ;
   private int[] P0A9U3_A252CliCod ;
   private boolean[] P0A9U3_n252CliCod ;
   private String[] P0A9U3_A10045CliAct ;
   private String[] P0A9U3_A279CliNom ;
   private String[] P0A9U5_A396EmprCod ;
   private int[] P0A9U5_A252CliCod ;
   private boolean[] P0A9U5_n252CliCod ;
   private String[] P0A9U5_A212BarSer ;
   private short[] P0A9U5_A217BarTipArt ;
   private boolean[] P0A9U5_n217BarTipArt ;
   private byte[] P0A9U5_A213BarSit ;
   private java.util.Date[] P0A9U5_A159BarFecGen ;
   private java.math.BigDecimal[] P0A9U5_A166BarKgm ;
   private boolean[] P0A9U5_n166BarKgm ;
   private String[] P0A9U5_A130BarCodPar ;
   private byte[] P0A9U5_A132BarCodReo ;
   private int[] P0A9U5_A129BarCod ;
   private String[] P0A9U6_A396EmprCod ;
   private String[] P0A9U6_A45AlbRef ;
   private short[] P0A9U6_A6263AlbRTartC ;
   private boolean[] P0A9U6_n6263AlbRTartC ;
   private java.util.Date[] P0A9U6_A49AlbRFen ;
   private int[] P0A9U6_A252CliCod ;
   private boolean[] P0A9U6_n252CliCod ;
   private String[] P0A9U6_A56AlbRUni ;
   private java.math.BigDecimal[] P0A9U6_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P0A9U6_A60AlbRUniUti ;
   private int[] P0A9U6_A44AlbRecCod ;
   private GXBaseCollection<app.pedidosclientesindetalle.SdtRMOD008_SDT_Item> AV19RMOD008_SDT ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV15messages ;
   private com.genexus.SdtMessages_Message AV14message ;
   private app.pedidosclientesindetalle.SdtRMOD008_SDT_Item AV13Item ;
}

final  class rmod008_carga_sdt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A9U2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV36vPCliCod ,
                                          int AV41vUCliCod ,
                                          int A252CliCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[3];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCLIENT" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliAct = 'S')");
      if ( ! (0==AV36vPCliCod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV41vUCliCod) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_P0A9U3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV36vPCliCod ,
                                          int AV41vUCliCod ,
                                          int A252CliCod ,
                                          String A10045CliAct ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[3];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, CliAct, CliNom FROM TXPCLIENT" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliAct = 'S')");
      if ( ! (0==AV36vPCliCod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV41vUCliCod) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   protected Object[] conditional_P0A9U5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV37vPFecGen ,
                                          java.util.Date AV42vUFecGen ,
                                          byte AV38vPSit ,
                                          byte AV43vUSit ,
                                          short AV22TipArt1 ,
                                          short AV23TIpArt2 ,
                                          String AV44Barserfrom ,
                                          String AV45Barserto ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          short A217BarTipArt ,
                                          String A212BarSer ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[10];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarTipArt, T1.BarSit, T1.BarFecGen, COALESCE( T2.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37vPFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42vUFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV38vPSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV43vUSit) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV22TipArt1) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (0==AV23TIpArt2) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarSit" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0A9U6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV37vPFecGen ,
                                          java.util.Date AV42vUFecGen ,
                                          short AV22TipArt1 ,
                                          short AV23TIpArt2 ,
                                          String AV44Barserfrom ,
                                          String AV45Barserto ,
                                          java.util.Date A49AlbRFen ,
                                          short A6263AlbRTartC ,
                                          String A45AlbRef ,
                                          String A396EmprCod ,
                                          int AV10CliCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[8];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbRef, AlbRTartC, AlbRFen, CliCod, AlbRUni, AlbRUniEnt, AlbRUniUti, AlbRecCod FROM TXPALBREC" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37vPFecGen)) )
      {
         addWhere(sWhereString, "(AlbRFen >= ?)");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42vUFecGen)) )
      {
         addWhere(sWhereString, "(AlbRFen <= ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! (0==AV22TipArt1) )
      {
         addWhere(sWhereString, "(AlbRTartC >= ?)");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! (0==AV23TIpArt2) )
      {
         addWhere(sWhereString, "(AlbRTartC <= ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Barserfrom)==0) )
      {
         addWhere(sWhereString, "(AlbRef >= ?)");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Barserto)==0) )
      {
         addWhere(sWhereString, "(AlbRef <= ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0A9U2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] );
            case 1 :
                  return conditional_P0A9U3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 2 :
                  return conditional_P0A9U5(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() );
            case 3 :
                  return conditional_P0A9U6(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9U2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9U3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9U5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9U6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  if ( ((Boolean) parms[11]).booleanValue() )
                  {
                     stmt.setNull( sIdx , Types.NUMERIC );
                  }
                  else
                  {
                     stmt.setInt(sIdx, ((Number) parms[12]).intValue());
                  }
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[15]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 16);
               }
               return;
      }
   }

}

