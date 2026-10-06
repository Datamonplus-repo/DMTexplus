package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgenalm extends GXProcedure
{
   public pgenalm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgenalm.class ), "" );
   }

   public pgenalm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pgenalm.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pgenalm.this.AV18EmprCod = aP0[0];
      this.aP0 = aP0;
      pgenalm.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pgenalm.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pgenalm.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pgenalm.this.AV17Opcion = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15EmprNew = "990" ;
      AV16EmprOri = AV18EmprCod ;
      if ( GXutil.strcmp(AV17Opcion, httpContext.getMessage( "A", "")) == 0 )
      {
         /* Execute user subroutine: 'ALTA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV17Opcion, httpContext.getMessage( "B", "")) == 0 )
      {
         /* Execute user subroutine: 'BAJA' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV17Opcion, httpContext.getMessage( "M", "")) == 0 )
      {
         /* Execute user subroutine: 'BAJA' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ALTA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ALTA' Routine */
      returnInSub = false ;
      AV8AlbProCod = (long)(A129BarCod*10+A132BarCodReo) ;
      /* Using cursor P01DM4 */
      pr_default.execute(0, new Object[] {AV16EmprOri, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A212BarSer = P01DM4_A212BarSer[0] ;
         A209BarPri = P01DM4_A209BarPri[0] ;
         A252CliCod = P01DM4_A252CliCod[0] ;
         n252CliCod = P01DM4_n252CliCod[0] ;
         A3091CliDivTra = P01DM4_A3091CliDivTra[0] ;
         n3091CliDivTra = P01DM4_n3091CliDivTra[0] ;
         A3140CliDivCod = P01DM4_A3140CliDivCod[0] ;
         n3140CliDivCod = P01DM4_n3140CliDivCod[0] ;
         A396EmprCod = P01DM4_A396EmprCod[0] ;
         A213BarSit = P01DM4_A213BarSit[0] ;
         A1279BarKla = P01DM4_A1279BarKla[0] ;
         n1279BarKla = P01DM4_n1279BarKla[0] ;
         A166BarKgm = P01DM4_A166BarKgm[0] ;
         A199BarPie1 = P01DM4_A199BarPie1[0] ;
         A365DisDes = P01DM4_A365DisDes[0] ;
         A898BarPieNDes = P01DM4_A898BarPieNDes[0] ;
         A3091CliDivTra = P01DM4_A3091CliDivTra[0] ;
         n3091CliDivTra = P01DM4_n3091CliDivTra[0] ;
         A3140CliDivCod = P01DM4_A3140CliDivCod[0] ;
         n3140CliDivCod = P01DM4_n3140CliDivCod[0] ;
         A1279BarKla = P01DM4_A1279BarKla[0] ;
         n1279BarKla = P01DM4_n1279BarKla[0] ;
         A166BarKgm = P01DM4_A166BarKgm[0] ;
         A199BarPie1 = P01DM4_A199BarPie1[0] ;
         A898BarPieNDes = P01DM4_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPCALPRD

         */
         W396EmprCod = A396EmprCod ;
         A396EmprCod = AV15EmprNew ;
         A30AlbProCod = AV8AlbProCod ;
         A39AlbProPri = A209BarPri ;
         A34AlbProfch = Gx_date ;
         A33AlbProEst = (byte)(0) ;
         A914AlbPObsCon = (byte)(0) ;
         A1243GuiRemCli = A252CliCod ;
         A1258GuiRemDom = (byte)(0) ;
         n1258GuiRemDom = false ;
         A1253EmprGuiRem = "990" ;
         A1259AlbDomEnv = (byte)(0) ;
         n1259AlbDomEnv = false ;
         A840TrnCod = (short)(0) ;
         A1782AlbProEso = (byte)(2) ;
         A1879AlbProEnt = GXutil.space( (short)(40)) ;
         n1879AlbProEnt = false ;
         A2242AlbSec = "X" ;
         A3093AlbDivTCod = A3091CliDivTra ;
         n3093AlbDivTCod = false ;
         A3108AlbDivCod = A3140CliDivCod ;
         n3108AlbDivCod = false ;
         A3869AlbCliDes = A252CliCod ;
         A4023AlbFecSal = GXutil.nullDate() ;
         /* Using cursor P01DM5 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A39AlbProPri, A34AlbProfch, Byte.valueOf(A33AlbProEst), Byte.valueOf(A914AlbPObsCon), Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1258GuiRemDom), Byte.valueOf(A1258GuiRemDom), A1253EmprGuiRem, Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), Short.valueOf(A840TrnCod), Byte.valueOf(A1782AlbProEso), Boolean.valueOf(n1879AlbProEnt), A1879AlbProEnt, A2242AlbSec, Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod), Integer.valueOf(A3869AlbCliDes), A4023AlbFecSal});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION: No se pudo generar el albarán de valoración", ""));
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal5[0] = AV9Barprekgm ;
         GXv_decimal6[0] = AV10BarPreMtr ;
         GXv_int7[0] = AV11AlbProEsp ;
         GXv_decimal8[0] = AV12AlbProRec ;
         GXv_decimal9[0] = AV13AlbBarRec ;
         GXv_decimal10[0] = AV14AlbBarDto ;
         new app.ptarpre(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_decimal10) ;
         pgenalm.this.A396EmprCod = GXv_char1[0] ;
         pgenalm.this.A129BarCod = GXv_int2[0] ;
         pgenalm.this.A132BarCodReo = GXv_int3[0] ;
         pgenalm.this.A130BarCodPar = GXv_char4[0] ;
         pgenalm.this.AV9Barprekgm = GXv_decimal5[0] ;
         pgenalm.this.AV10BarPreMtr = GXv_decimal6[0] ;
         pgenalm.this.AV11AlbProEsp = GXv_int7[0] ;
         pgenalm.this.AV12AlbProRec = GXv_decimal8[0] ;
         pgenalm.this.AV13AlbBarRec = GXv_decimal9[0] ;
         pgenalm.this.AV14AlbBarDto = GXv_decimal10[0] ;
         /*
            INSERT RECORD ON TABLE TXPALBBAR

         */
         /* Using cursor P01DM7 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A1292BarPlz = P01DM7_A1292BarPlz[0] ;
            n1292BarPlz = P01DM7_n1292BarPlz[0] ;
         }
         else
         {
            A1292BarPlz = (short)(0) ;
            n1292BarPlz = false ;
         }
         pr_default.close(2);
         W396EmprCod = A396EmprCod ;
         A396EmprCod = AV15EmprNew ;
         A30AlbProCod = AV8AlbProCod ;
         A1261BarAlbKgmE = A166BarKgm.subtract(A1279BarKla) ;
         A1262BarPreKgm = AV9Barprekgm ;
         A1264BarPreMtr = AV10BarPreMtr ;
         A1265BarAlbPie = (int)(A198BarPie-A1292BarPlz) ;
         A1266BarAlbTub = (int)(A198BarPie-A1292BarPlz) ;
         A32AlbProEsp = AV11AlbProEsp ;
         A40AlbProRec = AV12AlbProRec ;
         A2761AlbBarRec = AV13AlbBarRec ;
         A2762AlbBarDto = AV14AlbBarDto ;
         n2762AlbBarDto = false ;
         A3391AlbSer = A212BarSer ;
         /* Using cursor P01DM8 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A32AlbProEsp), A40AlbProRec, A1261BarAlbKgmE, Integer.valueOf(A1265BarAlbPie), Integer.valueOf(A1266BarAlbTub), A1262BarPreKgm, A1264BarPreMtr, A2761AlbBarRec, Boolean.valueOf(n2762AlbBarDto), A2762AlbBarDto, A3391AlbSer});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         if ( (pr_default.getStatus(3) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         GXv_char4[0] = AV16EmprOri ;
         GXv_int11[0] = AV8AlbProCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int7[0] = A132BarCodReo ;
         GXv_char1[0] = A130BarCodPar ;
         GXv_char12[0] = httpContext.getMessage( "P", "") ;
         new app.pnewope(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_int2, GXv_int7, GXv_char1, GXv_char12) ;
         pgenalm.this.AV16EmprOri = GXv_char4[0] ;
         pgenalm.this.AV8AlbProCod = GXv_int11[0] ;
         pgenalm.this.A129BarCod = GXv_int2[0] ;
         pgenalm.this.A132BarCodReo = GXv_int7[0] ;
         pgenalm.this.A130BarCodPar = GXv_char1[0] ;
         GXv_char12[0] = AV15EmprNew ;
         GXv_int11[0] = AV8AlbProCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int7[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         new app.pkgsope(remoteHandle, context).execute( GXv_char12, GXv_int11, GXv_int2, GXv_int7, GXv_char4) ;
         pgenalm.this.AV15EmprNew = GXv_char12[0] ;
         pgenalm.this.AV8AlbProCod = GXv_int11[0] ;
         pgenalm.this.A129BarCod = GXv_int2[0] ;
         pgenalm.this.A132BarCodReo = GXv_int7[0] ;
         pgenalm.this.A130BarCodPar = GXv_char4[0] ;
         GXv_char12[0] = AV16EmprOri ;
         GXv_int11[0] = AV8AlbProCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int7[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char1[0] = httpContext.getMessage( "P", "") ;
         new app.pnewtxt(remoteHandle, context).execute( GXv_char12, GXv_int11, GXv_int2, GXv_int7, GXv_char4, GXv_char1) ;
         pgenalm.this.AV16EmprOri = GXv_char12[0] ;
         pgenalm.this.AV8AlbProCod = GXv_int11[0] ;
         pgenalm.this.A129BarCod = GXv_int2[0] ;
         pgenalm.this.A132BarCodReo = GXv_int7[0] ;
         pgenalm.this.A130BarCodPar = GXv_char4[0] ;
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S121( )
   {
      /* 'BAJA' Routine */
      returnInSub = false ;
      /* Using cursor P01DM9 */
      pr_default.execute(4, new Object[] {AV15EmprNew, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P01DM9_A396EmprCod[0] ;
         A32AlbProEsp = P01DM9_A32AlbProEsp[0] ;
         A30AlbProCod = P01DM9_A30AlbProCod[0] ;
         AV8AlbProCod = A30AlbProCod ;
         /* Execute user subroutine: 'ELIMINA_OTROS_FICHEROS' */
         S135 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         /* Using cursor P01DM10 */
         pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S135( )
   {
      /* 'ELIMINA_OTROS_FICHEROS' Routine */
      returnInSub = false ;
      /* Using cursor P01DM11 */
      pr_default.execute(6, new Object[] {AV15EmprNew, Long.valueOf(AV8AlbProCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A30AlbProCod = P01DM11_A30AlbProCod[0] ;
         A396EmprCod = P01DM11_A396EmprCod[0] ;
         A34AlbProfch = P01DM11_A34AlbProfch[0] ;
         /* Optimized DELETE. */
         /* Using cursor P01DM12 */
         pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P01DM13 */
         pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         /* End optimized DELETE. */
         /* Using cursor P01DM14 */
         pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgenalm.this.AV18EmprCod;
      this.aP1[0] = pgenalm.this.A129BarCod;
      this.aP2[0] = pgenalm.this.A132BarCodReo;
      this.aP3[0] = pgenalm.this.A130BarCodPar;
      this.aP4[0] = pgenalm.this.AV17Opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgenalm");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(2);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15EmprNew = "" ;
      AV16EmprOri = "" ;
      scmdbuf = "" ;
      P01DM4_A129BarCod = new int[1] ;
      P01DM4_A132BarCodReo = new byte[1] ;
      P01DM4_A130BarCodPar = new String[] {""} ;
      P01DM4_A212BarSer = new String[] {""} ;
      P01DM4_A209BarPri = new String[] {""} ;
      P01DM4_A252CliCod = new int[1] ;
      P01DM4_n252CliCod = new boolean[] {false} ;
      P01DM4_A3091CliDivTra = new String[] {""} ;
      P01DM4_n3091CliDivTra = new boolean[] {false} ;
      P01DM4_A3140CliDivCod = new byte[1] ;
      P01DM4_n3140CliDivCod = new boolean[] {false} ;
      P01DM4_A396EmprCod = new String[] {""} ;
      P01DM4_A213BarSit = new byte[1] ;
      P01DM4_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01DM4_n1279BarKla = new boolean[] {false} ;
      P01DM4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01DM4_A199BarPie1 = new short[1] ;
      P01DM4_A365DisDes = new String[] {""} ;
      P01DM4_A898BarPieNDes = new int[1] ;
      A212BarSer = "" ;
      A209BarPri = "" ;
      A3091CliDivTra = "" ;
      A396EmprCod = "" ;
      A1279BarKla = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      W396EmprCod = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A1253EmprGuiRem = "" ;
      A1879AlbProEnt = "" ;
      A2242AlbSec = "" ;
      A3093AlbDivTCod = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      Gx_emsg = "" ;
      GXv_int3 = new byte[1] ;
      AV9Barprekgm = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV10BarPreMtr = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV12AlbProRec = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV13AlbBarRec = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV14AlbBarDto = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      P01DM7_A1292BarPlz = new short[1] ;
      P01DM7_n1292BarPlz = new boolean[] {false} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A2762AlbBarDto = DecimalUtil.ZERO ;
      A3391AlbSer = "" ;
      GXv_char12 = new String[1] ;
      GXv_int11 = new long[1] ;
      GXv_int2 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      P01DM9_A129BarCod = new int[1] ;
      P01DM9_A132BarCodReo = new byte[1] ;
      P01DM9_A130BarCodPar = new String[] {""} ;
      P01DM9_A396EmprCod = new String[] {""} ;
      P01DM9_A32AlbProEsp = new byte[1] ;
      P01DM9_A30AlbProCod = new long[1] ;
      P01DM11_A30AlbProCod = new long[1] ;
      P01DM11_A396EmprCod = new String[] {""} ;
      P01DM11_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgenalm__default(),
         new Object[] {
             new Object[] {
            P01DM4_A129BarCod, P01DM4_A132BarCodReo, P01DM4_A130BarCodPar, P01DM4_A212BarSer, P01DM4_A209BarPri, P01DM4_A252CliCod, P01DM4_n252CliCod, P01DM4_A3091CliDivTra, P01DM4_n3091CliDivTra, P01DM4_A3140CliDivCod,
            P01DM4_n3140CliDivCod, P01DM4_A396EmprCod, P01DM4_A213BarSit, P01DM4_A1279BarKla, P01DM4_n1279BarKla, P01DM4_A166BarKgm, P01DM4_A199BarPie1, P01DM4_A365DisDes, P01DM4_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            P01DM7_A1292BarPlz, P01DM7_n1292BarPlz
            }
            , new Object[] {
            }
            , new Object[] {
            P01DM9_A129BarCod, P01DM9_A132BarCodReo, P01DM9_A130BarCodPar, P01DM9_A396EmprCod, P01DM9_A32AlbProEsp, P01DM9_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01DM11_A30AlbProCod, P01DM11_A396EmprCod, P01DM11_A34AlbProfch
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A3140CliDivCod ;
   private byte A213BarSit ;
   private byte A33AlbProEst ;
   private byte A914AlbPObsCon ;
   private byte A1258GuiRemDom ;
   private byte A1259AlbDomEnv ;
   private byte A1782AlbProEso ;
   private byte A3108AlbDivCod ;
   private byte GXv_int3[] ;
   private byte AV11AlbProEsp ;
   private byte A32AlbProEsp ;
   private byte GXv_int7[] ;
   private short A199BarPie1 ;
   private short A840TrnCod ;
   private short Gx_err ;
   private short A1292BarPlz ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int GX_INS3 ;
   private int A1243GuiRemCli ;
   private int A3869AlbCliDes ;
   private int GX_INS195 ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int GXv_int2[] ;
   private long AV8AlbProCod ;
   private long A30AlbProCod ;
   private long GXv_int11[] ;
   private java.math.BigDecimal A1279BarKla ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV9Barprekgm ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV10BarPreMtr ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV12AlbProRec ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV13AlbBarRec ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV14AlbBarDto ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A2762AlbBarDto ;
   private String AV18EmprCod ;
   private String A130BarCodPar ;
   private String AV17Opcion ;
   private String AV15EmprNew ;
   private String AV16EmprOri ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A209BarPri ;
   private String A3091CliDivTra ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String W396EmprCod ;
   private String A39AlbProPri ;
   private String A1253EmprGuiRem ;
   private String A1879AlbProEnt ;
   private String A2242AlbSec ;
   private String A3093AlbDivTCod ;
   private String Gx_emsg ;
   private String A3391AlbSer ;
   private String GXv_char12[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Gx_date ;
   private java.util.Date A4023AlbFecSal ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n3091CliDivTra ;
   private boolean n3140CliDivCod ;
   private boolean n1279BarKla ;
   private boolean n1258GuiRemDom ;
   private boolean n1259AlbDomEnv ;
   private boolean n1879AlbProEnt ;
   private boolean n3093AlbDivTCod ;
   private boolean n3108AlbDivCod ;
   private boolean n1292BarPlz ;
   private boolean n2762AlbBarDto ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P01DM4_A129BarCod ;
   private byte[] P01DM4_A132BarCodReo ;
   private String[] P01DM4_A130BarCodPar ;
   private String[] P01DM4_A212BarSer ;
   private String[] P01DM4_A209BarPri ;
   private int[] P01DM4_A252CliCod ;
   private boolean[] P01DM4_n252CliCod ;
   private String[] P01DM4_A3091CliDivTra ;
   private boolean[] P01DM4_n3091CliDivTra ;
   private byte[] P01DM4_A3140CliDivCod ;
   private boolean[] P01DM4_n3140CliDivCod ;
   private String[] P01DM4_A396EmprCod ;
   private byte[] P01DM4_A213BarSit ;
   private java.math.BigDecimal[] P01DM4_A1279BarKla ;
   private boolean[] P01DM4_n1279BarKla ;
   private java.math.BigDecimal[] P01DM4_A166BarKgm ;
   private short[] P01DM4_A199BarPie1 ;
   private String[] P01DM4_A365DisDes ;
   private int[] P01DM4_A898BarPieNDes ;
   private short[] P01DM7_A1292BarPlz ;
   private boolean[] P01DM7_n1292BarPlz ;
   private int[] P01DM9_A129BarCod ;
   private byte[] P01DM9_A132BarCodReo ;
   private String[] P01DM9_A130BarCodPar ;
   private String[] P01DM9_A396EmprCod ;
   private byte[] P01DM9_A32AlbProEsp ;
   private long[] P01DM9_A30AlbProCod ;
   private long[] P01DM11_A30AlbProCod ;
   private String[] P01DM11_A396EmprCod ;
   private java.util.Date[] P01DM11_A34AlbProfch ;
}

final  class pgenalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01DM4", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSer, T1.BarPri, T1.CliCod, T2.CliDivTra, T2.CliDivCod, T1.EmprCod, T1.BarSit, COALESCE( T3.BarKla, 0) AS BarKla, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T4.BarPieNDes, 0) AS BarPieNDes FROM (((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarKilLan) AS BarKla, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01DM5", "INSERT INTO TXPCALPRD(EmprCod, AlbProCod, AlbProPri, AlbProfch, AlbProEst, AlbPObsCon, GuiRemCli, GuiRemDom, EmprGuiRem, AlbDomEnv, TrnCod, AlbProEso, AlbProEnt, AlbSec, AlbDivTCod, AlbDivCod, AlbCliDes, AlbFecSal, AlbHorSal, AlbLocCar, AlbLocDes, AlbMat, AlbProBon, AlbProTBo, AlbMarca, AlbTipCal, AlbKilRea, AlbEnvFtp, AlbUsu, AlbOComp, AlbMarCo, AlbLic, AlbNumT, AlbDesp, AlbMotTr, AlbTipDoc, AlbCambio, AlbColCa, AlbObsCb, AlbProNroF, AlbDomEv, AlbFmd, ALbFmdc, AlbHhfm, AlbGrossT, AlbProAT, AlbTrnNm, AlbTrnDm, AlbTrnNc, AlbIvaCod, DltUltob, FpgCod, AlbPdATCUD, AlbFecAnu, AlbUsuAnu, AlbHorAnu, AlbPdSerAT, AlbPdTipAT, AlbEnvMail) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P01DM7", "SELECT COALESCE( T1.BarPlz, 0) AS BarPlz FROM (SELECT SUM(BarPieLzd) AS BarPlz, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01DM8", "INSERT INTO TXPALBBAR(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbProEsp, AlbProRec, BarAlbKgmE, BarAlbPie, BarAlbTub, BarPreKgm, BarPreMtr, AlbBarRec, AlbBarDto, AlbSer, TubCod, BarAlbMtrE, GuiFasULin, AlbPConPie, BarAlbBul, BarAlbTar, BarAlbFor, BarAlbTip, BarAlbPN, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExt, BarFasExtD, BarAlbObs, BarAlbExt, BarAlbTin, AlbHdrObs, AlbHdrUlin, AlbProVal, AlbTipCon, AlbHdrAnc, CodCod, AlbColNom, AlbColNum, AlbTipCol, AlbPckUlin, AlbEncCli, AlbHdrgm2, TipAcaCod, AlbTipEnt, AlbImpMan, P_ForULin, PlasCod, BarAlbPlas, AlbHdRUl, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, AlbSerD, Et_UltNum, BarKgsCli, AlbMetULi, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbCadEnc, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P01DM9", "SELECT BarCod, BarCodReo, BarCodPar, EmprCod, AlbProEsp, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01DM10", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P01DM11", "SELECT AlbProCod, EmprCod, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01DM12", "DELETE FROM TXPALBTXT  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTXT")
         ,new UpdateCursor("P01DM13", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P01DM14", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((int[]) buf[18])[0] = rslt.getInt(15);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[8]).byteValue());
               }
               stmt.setString(9, (String)parms[9], 3);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[11]).byteValue());
               }
               stmt.setShort(11, ((Number) parms[12]).shortValue());
               stmt.setByte(12, ((Number) parms[13]).byteValue());
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[15], 40);
               }
               stmt.setString(14, (String)parms[16], 1);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[20]).byteValue());
               }
               stmt.setInt(17, ((Number) parms[21]).intValue());
               stmt.setDate(18, (java.util.Date)parms[22]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[14], 2);
               }
               stmt.setString(15, (String)parms[15], 16);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

