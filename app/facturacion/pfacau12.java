package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacau12 extends GXProcedure
{
   public pfacau12( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacau12.class ), "" );
   }

   public pfacau12( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          long[] aP1 ,
                          int[] aP2 ,
                          byte[] aP3 ,
                          String[] aP4 ,
                          int[] aP5 ,
                          int[] aP6 ,
                          String[] aP7 ,
                          byte[] aP8 ,
                          short[] aP9 )
   {
      pfacau12.this.aP10 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 ,
                        short[] aP9 ,
                        int[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 ,
                             short[] aP9 ,
                             int[] aP10 )
   {
      pfacau12.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacau12.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pfacau12.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pfacau12.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pfacau12.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pfacau12.this.AV23NumFac = aP5[0];
      this.aP5 = aP5;
      pfacau12.this.AV24NumLin = aP6[0];
      this.aP6 = aP6;
      pfacau12.this.AV38ArtObsFac = aP7[0];
      this.aP7 = aP7;
      pfacau12.this.AV74FlagSal = aP8[0];
      this.aP8 = aP8;
      pfacau12.this.AV102TotAlb = aP9[0];
      this.aP9 = aP9;
      pfacau12.this.AV75CliFac = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV107PLinea = (byte)(0) ;
      GXv_int1[0] = AV107PLinea ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int1) ;
      pfacau12.this.AV107PLinea = GXv_int1[0] ;
      GXv_int1[0] = AV108Magosa ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int1) ;
      pfacau12.this.AV108Magosa = GXv_int1[0] ;
      /* Using cursor P01UP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Using cursor P01UP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A212BarSer = P01UP3_A212BarSer[0] ;
            A460FasDsc = P01UP3_A460FasDsc[0] ;
            A1458BarAlbBul = P01UP3_A1458BarAlbBul[0] ;
            A1503BarPart = P01UP3_A1503BarPart[0] ;
            A457FasCod = P01UP3_A457FasCod[0] ;
            A4812BarEncCli = P01UP3_A4812BarEncCli[0] ;
            A1276FasMtr = P01UP3_A1276FasMtr[0] ;
            A1275FasKgm = P01UP3_A1275FasKgm[0] ;
            A12193FasUnd = P01UP3_A12193FasUnd[0] ;
            A1241GuiFasPKg = P01UP3_A1241GuiFasPKg[0] ;
            A1242GuiFasPMt = P01UP3_A1242GuiFasPMt[0] ;
            A12194FasPreUnd = P01UP3_A12194FasPreUnd[0] ;
            A1240GuiFasLin = P01UP3_A1240GuiFasLin[0] ;
            A460FasDsc = P01UP3_A460FasDsc[0] ;
            A212BarSer = P01UP3_A212BarSer[0] ;
            A1503BarPart = P01UP3_A1503BarPart[0] ;
            A4812BarEncCli = P01UP3_A4812BarEncCli[0] ;
            A1458BarAlbBul = P01UP3_A1458BarAlbBul[0] ;
            AV24NumLin = (int)(AV24NumLin+1) ;
            AV33Metros = A1276FasMtr ;
            AV34Kilos = A1275FasKgm ;
            AV110Unidades = A12193FasUnd ;
            AV35PrecioKg = A1241GuiFasPKg ;
            AV36PrecioMt = A1242GuiFasPMt ;
            AV109PrecioUn = A12194FasPreUnd ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33Metros)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36PrecioMt)==0) )
            {
               AV36PrecioMt = DecimalUtil.ZERO ;
            }
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34Kilos)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35PrecioKg)==0) )
            {
               AV35PrecioKg = DecimalUtil.ZERO ;
            }
            if ( AV108Magosa == 1 )
            {
               AV35PrecioKg = DecimalUtil.doubleToDec(0) ;
               AV36PrecioMt = DecimalUtil.doubleToDec(0) ;
               AV33Metros = DecimalUtil.doubleToDec(0) ;
               AV34Kilos = DecimalUtil.doubleToDec(0) ;
            }
            /*
               INSERT RECORD ON TABLE TXPLFAVEN

            */
            A430FacCod = AV23NumFac ;
            A446FacLin = AV24NumLin ;
            A427FacAlbCod = A30AlbProCod ;
            A1294FacBarCod = A129BarCod ;
            A1295FacBarReo = A132BarCodReo ;
            A1296FacBarPar = A130BarCodPar ;
            A428FacAlbTip = (byte)(1) ;
            A454FacSer = A212BarSer ;
            A448FacPreKgs = AV35PrecioKg ;
            A449FacPreMts = AV36PrecioMt ;
            A12198FacPreUnd = AV109PrecioUn ;
            A444FacKgs = AV34Kilos ;
            A447FacMts = AV33Metros ;
            A12197FacUnds = AV110Unidades ;
            A432FacDsc = A460FasDsc ;
            if ( (0==AV74FlagSal) && (0==AV107PLinea) )
            {
               A1498FacDisNum = AV40BarDisNum ;
            }
            else
            {
               A1498FacDisNum = GXutil.str( A1458BarAlbBul, 4, 0) ;
            }
            A3303FacNPart = A1503BarPart ;
            A3397FacFasCod = A457FasCod ;
            if ( ( AV94Texknit == 1 ) || ( AV103Martex == 1 ) )
            {
               A3097FacTipPro = httpContext.getMessage( "F", "") ;
            }
            A4814FacEncCli = A4812BarEncCli ;
            A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
            A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
            A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
            A3883FacCliCod = AV75CliFac ;
            /* Using cursor P01UP4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, A3097FacTipPro, Short.valueOf(A3303FacNPart), A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin, Integer.valueOf(A12197FacUnds), A12198FacPreUnd});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            GXt_decimal2 = DecimalUtil.doubleToDec(AV102TotAlb) ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = AV23NumFac ;
            GXv_int5[0] = AV24NumLin ;
            GXv_decimal6[0] = GXt_decimal2 ;
            new app.pfacimli(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_decimal6) ;
            pfacau12.this.A396EmprCod = GXv_char3[0] ;
            pfacau12.this.AV23NumFac = GXv_int4[0] ;
            pfacau12.this.AV24NumLin = GXv_int5[0] ;
            pfacau12.this.GXt_decimal2 = GXv_decimal6[0] ;
            AV102TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV102TotAlb).add((GXt_decimal2)))) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P01UP5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A212BarSer = P01UP5_A212BarSer[0] ;
            A2765AlbHdrTxt = P01UP5_A2765AlbHdrTxt[0] ;
            A1503BarPart = P01UP5_A1503BarPart[0] ;
            A4812BarEncCli = P01UP5_A4812BarEncCli[0] ;
            A2770ALbHdrMts = P01UP5_A2770ALbHdrMts[0] ;
            A2768AlbHdrKgs = P01UP5_A2768AlbHdrKgs[0] ;
            A2767AlbHdrPKg = P01UP5_A2767AlbHdrPKg[0] ;
            A2769AlbHdrPMt = P01UP5_A2769AlbHdrPMt[0] ;
            A2764AlbHdrLin = P01UP5_A2764AlbHdrLin[0] ;
            A212BarSer = P01UP5_A212BarSer[0] ;
            A1503BarPart = P01UP5_A1503BarPart[0] ;
            A4812BarEncCli = P01UP5_A4812BarEncCli[0] ;
            AV24NumLin = (int)(AV24NumLin+1) ;
            AV33Metros = A2770ALbHdrMts ;
            AV34Kilos = A2768AlbHdrKgs ;
            AV35PrecioKg = A2767AlbHdrPKg ;
            AV36PrecioMt = A2769AlbHdrPMt ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33Metros)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36PrecioMt)==0) )
            {
               AV36PrecioMt = DecimalUtil.ZERO ;
            }
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34Kilos)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35PrecioKg)==0) )
            {
               AV35PrecioKg = DecimalUtil.ZERO ;
            }
            /*
               INSERT RECORD ON TABLE TXPLFAVEN

            */
            A430FacCod = AV23NumFac ;
            A446FacLin = AV24NumLin ;
            A427FacAlbCod = A30AlbProCod ;
            A1294FacBarCod = A129BarCod ;
            A1295FacBarReo = A132BarCodReo ;
            A1296FacBarPar = A130BarCodPar ;
            A428FacAlbTip = (byte)(1) ;
            A454FacSer = A212BarSer ;
            A448FacPreKgs = AV35PrecioKg ;
            A449FacPreMts = AV36PrecioMt ;
            A444FacKgs = AV34Kilos ;
            A447FacMts = AV33Metros ;
            A432FacDsc = A2765AlbHdrTxt ;
            A1498FacDisNum = AV40BarDisNum ;
            A3303FacNPart = A1503BarPart ;
            A3397FacFasCod = httpContext.getMessage( "ZZZZZZZZ", "") ;
            A4814FacEncCli = A4812BarEncCli ;
            A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
            A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
            A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
            A3883FacCliCod = AV75CliFac ;
            /* Using cursor P01UP6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
            if ( (pr_default.getStatus(4) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            GXt_decimal2 = DecimalUtil.doubleToDec(AV102TotAlb) ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int5[0] = AV23NumFac ;
            GXv_int4[0] = AV24NumLin ;
            GXv_decimal6[0] = GXt_decimal2 ;
            new app.pfacimli(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int4, GXv_decimal6) ;
            pfacau12.this.A396EmprCod = GXv_char3[0] ;
            pfacau12.this.AV23NumFac = GXv_int5[0] ;
            pfacau12.this.AV24NumLin = GXv_int4[0] ;
            pfacau12.this.GXt_decimal2 = GXv_decimal6[0] ;
            AV102TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV102TotAlb).add((GXt_decimal2)))) ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacau12.this.A396EmprCod;
      this.aP1[0] = pfacau12.this.A30AlbProCod;
      this.aP2[0] = pfacau12.this.A129BarCod;
      this.aP3[0] = pfacau12.this.A132BarCodReo;
      this.aP4[0] = pfacau12.this.A130BarCodPar;
      this.aP5[0] = pfacau12.this.AV23NumFac;
      this.aP6[0] = pfacau12.this.AV24NumLin;
      this.aP7[0] = pfacau12.this.AV38ArtObsFac;
      this.aP8[0] = pfacau12.this.AV74FlagSal;
      this.aP9[0] = pfacau12.this.AV102TotAlb;
      this.aP10[0] = pfacau12.this.AV75CliFac;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pfacau12");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P01UP2_A396EmprCod = new String[] {""} ;
      P01UP2_A30AlbProCod = new long[1] ;
      P01UP2_A129BarCod = new int[1] ;
      P01UP2_A132BarCodReo = new byte[1] ;
      P01UP2_A130BarCodPar = new String[] {""} ;
      P01UP3_A396EmprCod = new String[] {""} ;
      P01UP3_A30AlbProCod = new long[1] ;
      P01UP3_A129BarCod = new int[1] ;
      P01UP3_A132BarCodReo = new byte[1] ;
      P01UP3_A130BarCodPar = new String[] {""} ;
      P01UP3_A212BarSer = new String[] {""} ;
      P01UP3_A460FasDsc = new String[] {""} ;
      P01UP3_A1458BarAlbBul = new short[1] ;
      P01UP3_A1503BarPart = new short[1] ;
      P01UP3_A457FasCod = new String[] {""} ;
      P01UP3_A4812BarEncCli = new String[] {""} ;
      P01UP3_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UP3_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UP3_A12193FasUnd = new int[1] ;
      P01UP3_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UP3_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UP3_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UP3_A1240GuiFasLin = new short[1] ;
      A212BarSer = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A4812BarEncCli = "" ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A12194FasPreUnd = DecimalUtil.ZERO ;
      AV33Metros = DecimalUtil.ZERO ;
      AV34Kilos = DecimalUtil.ZERO ;
      AV35PrecioKg = DecimalUtil.ZERO ;
      AV36PrecioMt = DecimalUtil.ZERO ;
      AV109PrecioUn = DecimalUtil.ZERO ;
      A1296FacBarPar = "" ;
      A454FacSer = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A1498FacDisNum = "" ;
      AV40BarDisNum = "" ;
      A3397FacFasCod = "" ;
      A3097FacTipPro = "" ;
      A4814FacEncCli = "" ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P01UP5_A396EmprCod = new String[] {""} ;
      P01UP5_A30AlbProCod = new long[1] ;
      P01UP5_A129BarCod = new int[1] ;
      P01UP5_A132BarCodReo = new byte[1] ;
      P01UP5_A130BarCodPar = new String[] {""} ;
      P01UP5_A212BarSer = new String[] {""} ;
      P01UP5_A2765AlbHdrTxt = new String[] {""} ;
      P01UP5_A1503BarPart = new short[1] ;
      P01UP5_A4812BarEncCli = new String[] {""} ;
      P01UP5_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UP5_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UP5_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UP5_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UP5_A2764AlbHdrLin = new short[1] ;
      A2765AlbHdrTxt = "" ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      GXt_decimal2 = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int4 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pfacau12__default(),
         new Object[] {
             new Object[] {
            P01UP2_A396EmprCod, P01UP2_A30AlbProCod, P01UP2_A129BarCod, P01UP2_A132BarCodReo, P01UP2_A130BarCodPar
            }
            , new Object[] {
            P01UP3_A396EmprCod, P01UP3_A30AlbProCod, P01UP3_A129BarCod, P01UP3_A132BarCodReo, P01UP3_A130BarCodPar, P01UP3_A212BarSer, P01UP3_A460FasDsc, P01UP3_A1458BarAlbBul, P01UP3_A1503BarPart, P01UP3_A457FasCod,
            P01UP3_A4812BarEncCli, P01UP3_A1276FasMtr, P01UP3_A1275FasKgm, P01UP3_A12193FasUnd, P01UP3_A1241GuiFasPKg, P01UP3_A1242GuiFasPMt, P01UP3_A12194FasPreUnd, P01UP3_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P01UP5_A396EmprCod, P01UP5_A30AlbProCod, P01UP5_A129BarCod, P01UP5_A132BarCodReo, P01UP5_A130BarCodPar, P01UP5_A212BarSer, P01UP5_A2765AlbHdrTxt, P01UP5_A1503BarPart, P01UP5_A4812BarEncCli, P01UP5_A2770ALbHdrMts,
            P01UP5_A2768AlbHdrKgs, P01UP5_A2767AlbHdrPKg, P01UP5_A2769AlbHdrPMt, P01UP5_A2764AlbHdrLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV74FlagSal ;
   private byte AV107PLinea ;
   private byte AV108Magosa ;
   private byte GXv_int1[] ;
   private byte A1295FacBarReo ;
   private byte A428FacAlbTip ;
   private byte AV94Texknit ;
   private byte AV103Martex ;
   private short AV102TotAlb ;
   private short A1458BarAlbBul ;
   private short A1503BarPart ;
   private short A1240GuiFasLin ;
   private short A3303FacNPart ;
   private short Gx_err ;
   private short A2764AlbHdrLin ;
   private int A129BarCod ;
   private int AV23NumFac ;
   private int AV24NumLin ;
   private int AV75CliFac ;
   private int A12193FasUnd ;
   private int AV110Unidades ;
   private int GX_INS44 ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int A1294FacBarCod ;
   private int A12197FacUnds ;
   private int A3883FacCliCod ;
   private int GXv_int5[] ;
   private int GXv_int4[] ;
   private long A30AlbProCod ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A12194FasPreUnd ;
   private java.math.BigDecimal AV33Metros ;
   private java.math.BigDecimal AV34Kilos ;
   private java.math.BigDecimal AV35PrecioKg ;
   private java.math.BigDecimal AV36PrecioMt ;
   private java.math.BigDecimal AV109PrecioUn ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal GXt_decimal2 ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV38ArtObsFac ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A4812BarEncCli ;
   private String A1296FacBarPar ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String A1498FacDisNum ;
   private String AV40BarDisNum ;
   private String A3397FacFasCod ;
   private String A3097FacTipPro ;
   private String A4814FacEncCli ;
   private String Gx_emsg ;
   private String A2765AlbHdrTxt ;
   private String GXv_char3[] ;
   private int[] aP10 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private byte[] aP8 ;
   private short[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P01UP2_A396EmprCod ;
   private long[] P01UP2_A30AlbProCod ;
   private int[] P01UP2_A129BarCod ;
   private byte[] P01UP2_A132BarCodReo ;
   private String[] P01UP2_A130BarCodPar ;
   private String[] P01UP3_A396EmprCod ;
   private long[] P01UP3_A30AlbProCod ;
   private int[] P01UP3_A129BarCod ;
   private byte[] P01UP3_A132BarCodReo ;
   private String[] P01UP3_A130BarCodPar ;
   private String[] P01UP3_A212BarSer ;
   private String[] P01UP3_A460FasDsc ;
   private short[] P01UP3_A1458BarAlbBul ;
   private short[] P01UP3_A1503BarPart ;
   private String[] P01UP3_A457FasCod ;
   private String[] P01UP3_A4812BarEncCli ;
   private java.math.BigDecimal[] P01UP3_A1276FasMtr ;
   private java.math.BigDecimal[] P01UP3_A1275FasKgm ;
   private int[] P01UP3_A12193FasUnd ;
   private java.math.BigDecimal[] P01UP3_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P01UP3_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P01UP3_A12194FasPreUnd ;
   private short[] P01UP3_A1240GuiFasLin ;
   private String[] P01UP5_A396EmprCod ;
   private long[] P01UP5_A30AlbProCod ;
   private int[] P01UP5_A129BarCod ;
   private byte[] P01UP5_A132BarCodReo ;
   private String[] P01UP5_A130BarCodPar ;
   private String[] P01UP5_A212BarSer ;
   private String[] P01UP5_A2765AlbHdrTxt ;
   private short[] P01UP5_A1503BarPart ;
   private String[] P01UP5_A4812BarEncCli ;
   private java.math.BigDecimal[] P01UP5_A2770ALbHdrMts ;
   private java.math.BigDecimal[] P01UP5_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] P01UP5_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] P01UP5_A2769AlbHdrPMt ;
   private short[] P01UP5_A2764AlbHdrLin ;
}

final  class pfacau12__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01UP2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01UP3", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarSer, T2.FasDsc, T4.BarAlbBul, T3.BarPart, T1.FasCod, T3.BarEncCli, T1.FasMtr, T1.FasKgm, T1.FasUnd, T1.GuiFasPKg, T1.GuiFasPMt, T1.FasPreUnd, T1.GuiFasLin FROM (((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) INNER JOIN TXPALBBAR T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbProCod = T1.AlbProCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01UP4", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacTipPro, FacNPart, FacFasCod, FacCliCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacUnds, FacPreUnd, FacRec, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P01UP5", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarSer, T1.AlbHdrTxt, T2.BarPart, T2.BarEncCli, T1.ALbHdrMts, T1.AlbHdrKgs, T1.AlbHdrPKg, T1.AlbHdrPMt, T1.AlbHdrLin FROM (TXPALBTXT T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01UP6", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacCliCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacRec, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,5);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((short[]) buf[13])[0] = rslt.getShort(14);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setString(18, (String)parms[17], 8);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 20);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 2);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 5);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 20);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               return;
      }
   }

}

