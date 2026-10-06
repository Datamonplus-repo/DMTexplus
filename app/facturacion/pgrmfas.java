package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgrmfas extends GXProcedure
{
   public pgrmfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgrmfas.class ), "" );
   }

   public pgrmfas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             long[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             java.util.Date[] aP5 ,
                             java.util.Date[] aP6 )
   {
      pgrmfas.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        long[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        java.util.Date[] aP5 ,
                        java.util.Date[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             long[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             java.util.Date[] aP5 ,
                             java.util.Date[] aP6 ,
                             String[] aP7 )
   {
      pgrmfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgrmfas.this.AV53AlbProCodi = aP1[0];
      this.aP1 = aP1;
      pgrmfas.this.AV54AlbProCodf = aP2[0];
      this.aP2 = aP2;
      pgrmfas.this.AV58CliCodini = aP3[0];
      this.aP3 = aP3;
      pgrmfas.this.AV59CliCodfin = aP4[0];
      this.aP4 = aP4;
      pgrmfas.this.AV51AlbProFchi = aP5[0];
      this.aP5 = aP5;
      pgrmfas.this.AV52AlbProFchf = aP6[0];
      this.aP6 = aP6;
      pgrmfas.this.AV57AlbProPri = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV45Moda21 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      pgrmfas.this.GXt_int1 = GXv_int2[0] ;
      AV45Moda21 = GXt_int1 ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "GRAHDR", "") ;
      GXv_int5[0] = AV48ContVal ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_int5) ;
      pgrmfas.this.A396EmprCod = GXv_char3[0] ;
      pgrmfas.this.AV48ContVal = GXv_int5[0] ;
      AV49GraHdr = (short)(AV48ContVal) ;
      AV38OrdLin = (short)(0) ;
      AV41BarAcc = httpContext.getMessage( "N", "") ;
      AV63ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV63ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV63ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV63ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV63ProgressIndicator.show();
      AV62CantidadRegistrosAProcesar = (short)(0) ;
      /* Optimized group. */
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Long.valueOf(AV53AlbProCodi) ,
                                           Long.valueOf(AV54AlbProCodf) ,
                                           Integer.valueOf(AV58CliCodini) ,
                                           Integer.valueOf(AV59CliCodfin) ,
                                           AV51AlbProFchi ,
                                           AV52AlbProFchf ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A34AlbProfch ,
                                           A396EmprCod ,
                                           AV57AlbProPri } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor P02XV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV57AlbProPri, Long.valueOf(AV53AlbProCodi), Long.valueOf(AV54AlbProCodf), Integer.valueOf(AV58CliCodini), Integer.valueOf(AV59CliCodfin), AV51AlbProFchi, AV52AlbProFchf});
      cV62CantidadRegistrosAProcesar = P02XV2_AV62CantidadRegistrosAProcesar[0] ;
      pr_default.close(0);
      AV62CantidadRegistrosAProcesar = (short)(AV62CantidadRegistrosAProcesar+cV62CantidadRegistrosAProcesar*1) ;
      /* End optimized group. */
      if ( AV62CantidadRegistrosAProcesar == 0 )
      {
         AV62CantidadRegistrosAProcesar = (short)(1) ;
      }
      AV64CantidadRegistrosProcesados = (short)(0) ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Long.valueOf(AV53AlbProCodi) ,
                                           Long.valueOf(AV54AlbProCodf) ,
                                           Integer.valueOf(AV58CliCodini) ,
                                           Integer.valueOf(AV59CliCodfin) ,
                                           AV51AlbProFchi ,
                                           AV52AlbProFchf ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A34AlbProfch ,
                                           A39AlbProPri ,
                                           AV57AlbProPri ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P02XV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV57AlbProPri, Long.valueOf(AV53AlbProCodi), Long.valueOf(AV54AlbProCodf), Integer.valueOf(AV58CliCodini), Integer.valueOf(AV59CliCodfin), AV51AlbProFchi, AV52AlbProFchf});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1253EmprGuiRem = P02XV3_A1253EmprGuiRem[0] ;
         A30AlbProCod = P02XV3_A30AlbProCod[0] ;
         A39AlbProPri = P02XV3_A39AlbProPri[0] ;
         A34AlbProfch = P02XV3_A34AlbProfch[0] ;
         A1243GuiRemCli = P02XV3_A1243GuiRemCli[0] ;
         A1244GuiRemCln = P02XV3_A1244GuiRemCln[0] ;
         A1244GuiRemCln = P02XV3_A1244GuiRemCln[0] ;
         /* Using cursor P02XV5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A130BarCodPar = P02XV5_A130BarCodPar[0] ;
            A132BarCodReo = P02XV5_A132BarCodReo[0] ;
            A129BarCod = P02XV5_A129BarCod[0] ;
            A5019AlbHdrgm2 = P02XV5_A5019AlbHdrgm2[0] ;
            A3271AlbHdrAnc = P02XV5_A3271AlbHdrAnc[0] ;
            A1909BarGraAca = P02XV5_A1909BarGraAca[0] ;
            A125BarAncAca1 = P02XV5_A125BarAncAca1[0] ;
            A5253BarAcc = P02XV5_A5253BarAcc[0] ;
            A1261BarAlbKgmE = P02XV5_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P02XV5_A1263BarAlbMtrE[0] ;
            A184BarMtr = P02XV5_A184BarMtr[0] ;
            n184BarMtr = P02XV5_n184BarMtr[0] ;
            A1909BarGraAca = P02XV5_A1909BarGraAca[0] ;
            A125BarAncAca1 = P02XV5_A125BarAncAca1[0] ;
            A5253BarAcc = P02XV5_A5253BarAcc[0] ;
            A184BarMtr = P02XV5_A184BarMtr[0] ;
            n184BarMtr = P02XV5_n184BarMtr[0] ;
            AV50BarGraAca = A5019AlbHdrgm2 ;
            AV55BarAncAca1 = A3271AlbHdrAnc ;
            if ( (0==AV50BarGraAca) )
            {
               AV50BarGraAca = A1909BarGraAca ;
            }
            if ( (0==AV55BarAncAca1) )
            {
               AV55BarAncAca1 = A125BarAncAca1 ;
            }
            AV41BarAcc = A5253BarAcc ;
            AV60BarAlbKgmE = A1261BarAlbKgmE ;
            AV56Ancho = DecimalUtil.doubleToDec(AV55BarAncAca1/ (double) (100)) ;
            if ( (DecimalUtil.doubleToDec(AV50BarGraAca).multiply(AV56Ancho)).doubleValue() > 0 )
            {
               A1263BarAlbMtrE = (AV60BarAlbKgmE.divide((DecimalUtil.doubleToDec(AV50BarGraAca).multiply(AV56Ancho)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) ;
               AV28FasMtr = A1263BarAlbMtrE ;
            }
            else
            {
               A1263BarAlbMtrE = A184BarMtr ;
               AV28FasMtr = A184BarMtr ;
            }
            /* Using cursor P02XV6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A252CliCod = P02XV6_A252CliCod[0] ;
               n252CliCod = P02XV6_n252CliCod[0] ;
               A457FasCod = P02XV6_A457FasCod[0] ;
               A4903FasAcab = P02XV6_A4903FasAcab[0] ;
               n4903FasAcab = P02XV6_n4903FasAcab[0] ;
               A1275FasKgm = P02XV6_A1275FasKgm[0] ;
               A1241GuiFasPKg = P02XV6_A1241GuiFasPKg[0] ;
               A1276FasMtr = P02XV6_A1276FasMtr[0] ;
               A467FasPreMtr = P02XV6_A467FasPreMtr[0] ;
               n467FasPreMtr = P02XV6_n467FasPreMtr[0] ;
               A1242GuiFasPMt = P02XV6_A1242GuiFasPMt[0] ;
               A466FasPreKgm = P02XV6_A466FasPreKgm[0] ;
               n466FasPreKgm = P02XV6_n466FasPreKgm[0] ;
               A1240GuiFasLin = P02XV6_A1240GuiFasLin[0] ;
               A4903FasAcab = P02XV6_A4903FasAcab[0] ;
               n4903FasAcab = P02XV6_n4903FasAcab[0] ;
               A252CliCod = P02XV6_A252CliCod[0] ;
               n252CliCod = P02XV6_n252CliCod[0] ;
               A467FasPreMtr = P02XV6_A467FasPreMtr[0] ;
               n467FasPreMtr = P02XV6_n467FasPreMtr[0] ;
               A466FasPreKgm = P02XV6_A466FasPreKgm[0] ;
               n466FasPreKgm = P02XV6_n466FasPreKgm[0] ;
               if ( GXutil.strcmp(A457FasCod, "618     ") == 0 )
               {
               }
               else
               {
                  if ( ( AV45Moda21 == 1 ) && ( GXutil.strcmp(AV41BarAcc, httpContext.getMessage( "N", "")) == 0 ) )
                  {
                     if ( GXutil.strcmp(A4903FasAcab, httpContext.getMessage( "S", "")) == 0 )
                     {
                        if ( AV50BarGraAca <= AV49GraHdr )
                        {
                           A1275FasKgm = DecimalUtil.doubleToDec(0) ;
                           A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
                           A1276FasMtr = AV28FasMtr ;
                           A1242GuiFasPMt = A467FasPreMtr ;
                        }
                        else
                        {
                           A1275FasKgm = AV60BarAlbKgmE ;
                           A1241GuiFasPKg = A466FasPreKgm ;
                           A1276FasMtr = DecimalUtil.doubleToDec(0) ;
                           A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
                        }
                     }
                     else
                     {
                        A1275FasKgm = AV60BarAlbKgmE ;
                        A1241GuiFasPKg = A466FasPreKgm ;
                        A1276FasMtr = DecimalUtil.doubleToDec(0) ;
                        A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
                     }
                  }
               }
               /* Using cursor P02XV7 */
               pr_default.execute(4, new Object[] {A1275FasKgm, A1241GuiFasPKg, A1276FasMtr, A1242GuiFasPMt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Using cursor P02XV8 */
            pr_default.execute(5, new Object[] {A1263BarAlbMtrE, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV64CantidadRegistrosProcesados = (short)(AV64CantidadRegistrosProcesados+1) ;
         AV65Porcentaje = (short)((AV64CantidadRegistrosProcesados/ (double) (AV62CantidadRegistrosAProcesar))*100) ;
         AV63ProgressIndicator.setgxTv_SdtProgress_Value( AV65Porcentaje );
         AV63ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando Registro %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV64CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV62CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( GXutil.str( A1243GuiRemCli, 6, 0)), GXutil.trim( A1244GuiRemCln), "", "", "", "", ""));
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV63ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV63ProgressIndicator.hide();
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgrmfas.this.A396EmprCod;
      this.aP1[0] = pgrmfas.this.AV53AlbProCodi;
      this.aP2[0] = pgrmfas.this.AV54AlbProCodf;
      this.aP3[0] = pgrmfas.this.AV58CliCodini;
      this.aP4[0] = pgrmfas.this.AV59CliCodfin;
      this.aP5[0] = pgrmfas.this.AV51AlbProFchi;
      this.aP6[0] = pgrmfas.this.AV52AlbProFchf;
      this.aP7[0] = pgrmfas.this.AV57AlbProPri;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pgrmfas");
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
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      AV41BarAcc = "" ;
      AV63ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      P02XV2_AV62CantidadRegistrosAProcesar = new short[1] ;
      A39AlbProPri = "" ;
      P02XV3_A1253EmprGuiRem = new String[] {""} ;
      P02XV3_A396EmprCod = new String[] {""} ;
      P02XV3_A30AlbProCod = new long[1] ;
      P02XV3_A39AlbProPri = new String[] {""} ;
      P02XV3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P02XV3_A1243GuiRemCli = new int[1] ;
      P02XV3_A1244GuiRemCln = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A1244GuiRemCln = "" ;
      P02XV5_A396EmprCod = new String[] {""} ;
      P02XV5_A30AlbProCod = new long[1] ;
      P02XV5_A130BarCodPar = new String[] {""} ;
      P02XV5_A132BarCodReo = new byte[1] ;
      P02XV5_A129BarCod = new int[1] ;
      P02XV5_A5019AlbHdrgm2 = new short[1] ;
      P02XV5_A3271AlbHdrAnc = new short[1] ;
      P02XV5_A1909BarGraAca = new short[1] ;
      P02XV5_A125BarAncAca1 = new short[1] ;
      P02XV5_A5253BarAcc = new String[] {""} ;
      P02XV5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XV5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XV5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XV5_n184BarMtr = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A5253BarAcc = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV60BarAlbKgmE = DecimalUtil.ZERO ;
      AV56Ancho = DecimalUtil.ZERO ;
      AV28FasMtr = DecimalUtil.ZERO ;
      P02XV6_A252CliCod = new int[1] ;
      P02XV6_n252CliCod = new boolean[] {false} ;
      P02XV6_A396EmprCod = new String[] {""} ;
      P02XV6_A30AlbProCod = new long[1] ;
      P02XV6_A129BarCod = new int[1] ;
      P02XV6_A132BarCodReo = new byte[1] ;
      P02XV6_A130BarCodPar = new String[] {""} ;
      P02XV6_A457FasCod = new String[] {""} ;
      P02XV6_A4903FasAcab = new String[] {""} ;
      P02XV6_n4903FasAcab = new boolean[] {false} ;
      P02XV6_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XV6_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XV6_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XV6_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XV6_n467FasPreMtr = new boolean[] {false} ;
      P02XV6_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XV6_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XV6_n466FasPreKgm = new boolean[] {false} ;
      P02XV6_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A4903FasAcab = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pgrmfas__default(),
         new Object[] {
             new Object[] {
            P02XV2_AV62CantidadRegistrosAProcesar
            }
            , new Object[] {
            P02XV3_A1253EmprGuiRem, P02XV3_A396EmprCod, P02XV3_A30AlbProCod, P02XV3_A39AlbProPri, P02XV3_A34AlbProfch, P02XV3_A1243GuiRemCli, P02XV3_A1244GuiRemCln
            }
            , new Object[] {
            P02XV5_A396EmprCod, P02XV5_A30AlbProCod, P02XV5_A130BarCodPar, P02XV5_A132BarCodReo, P02XV5_A129BarCod, P02XV5_A5019AlbHdrgm2, P02XV5_A3271AlbHdrAnc, P02XV5_A1909BarGraAca, P02XV5_A125BarAncAca1, P02XV5_A5253BarAcc,
            P02XV5_A1261BarAlbKgmE, P02XV5_A1263BarAlbMtrE, P02XV5_A184BarMtr, P02XV5_n184BarMtr
            }
            , new Object[] {
            P02XV6_A252CliCod, P02XV6_n252CliCod, P02XV6_A396EmprCod, P02XV6_A30AlbProCod, P02XV6_A129BarCod, P02XV6_A132BarCodReo, P02XV6_A130BarCodPar, P02XV6_A457FasCod, P02XV6_A4903FasAcab, P02XV6_n4903FasAcab,
            P02XV6_A1275FasKgm, P02XV6_A1241GuiFasPKg, P02XV6_A1276FasMtr, P02XV6_A467FasPreMtr, P02XV6_n467FasPreMtr, P02XV6_A1242GuiFasPMt, P02XV6_A466FasPreKgm, P02XV6_n466FasPreKgm, P02XV6_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV45Moda21 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private short AV49GraHdr ;
   private short AV38OrdLin ;
   private short AV62CantidadRegistrosAProcesar ;
   private short cV62CantidadRegistrosAProcesar ;
   private short AV64CantidadRegistrosProcesados ;
   private short A5019AlbHdrgm2 ;
   private short A3271AlbHdrAnc ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short AV50BarGraAca ;
   private short AV55BarAncAca1 ;
   private short A1240GuiFasLin ;
   private short AV65Porcentaje ;
   private short Gx_err ;
   private int AV58CliCodini ;
   private int AV59CliCodfin ;
   private int AV48ContVal ;
   private int GXv_int5[] ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private int A252CliCod ;
   private long AV53AlbProCodi ;
   private long AV54AlbProCodf ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV60BarAlbKgmE ;
   private java.math.BigDecimal AV56Ancho ;
   private java.math.BigDecimal AV28FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A466FasPreKgm ;
   private String A396EmprCod ;
   private String AV57AlbProPri ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV41BarAcc ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String A1253EmprGuiRem ;
   private String A1244GuiRemCln ;
   private String A130BarCodPar ;
   private String A5253BarAcc ;
   private String A457FasCod ;
   private String A4903FasAcab ;
   private java.util.Date AV51AlbProFchi ;
   private java.util.Date AV52AlbProFchf ;
   private java.util.Date A34AlbProfch ;
   private boolean n184BarMtr ;
   private boolean n252CliCod ;
   private boolean n4903FasAcab ;
   private boolean n467FasPreMtr ;
   private boolean n466FasPreKgm ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV63ProgressIndicator ;
   private String[] aP7 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private long[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private java.util.Date[] aP5 ;
   private java.util.Date[] aP6 ;
   private IDataStoreProvider pr_default ;
   private short[] P02XV2_AV62CantidadRegistrosAProcesar ;
   private String[] P02XV3_A1253EmprGuiRem ;
   private String[] P02XV3_A396EmprCod ;
   private long[] P02XV3_A30AlbProCod ;
   private String[] P02XV3_A39AlbProPri ;
   private java.util.Date[] P02XV3_A34AlbProfch ;
   private int[] P02XV3_A1243GuiRemCli ;
   private String[] P02XV3_A1244GuiRemCln ;
   private String[] P02XV5_A396EmprCod ;
   private long[] P02XV5_A30AlbProCod ;
   private String[] P02XV5_A130BarCodPar ;
   private byte[] P02XV5_A132BarCodReo ;
   private int[] P02XV5_A129BarCod ;
   private short[] P02XV5_A5019AlbHdrgm2 ;
   private short[] P02XV5_A3271AlbHdrAnc ;
   private short[] P02XV5_A1909BarGraAca ;
   private short[] P02XV5_A125BarAncAca1 ;
   private String[] P02XV5_A5253BarAcc ;
   private java.math.BigDecimal[] P02XV5_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P02XV5_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P02XV5_A184BarMtr ;
   private boolean[] P02XV5_n184BarMtr ;
   private int[] P02XV6_A252CliCod ;
   private boolean[] P02XV6_n252CliCod ;
   private String[] P02XV6_A396EmprCod ;
   private long[] P02XV6_A30AlbProCod ;
   private int[] P02XV6_A129BarCod ;
   private byte[] P02XV6_A132BarCodReo ;
   private String[] P02XV6_A130BarCodPar ;
   private String[] P02XV6_A457FasCod ;
   private String[] P02XV6_A4903FasAcab ;
   private boolean[] P02XV6_n4903FasAcab ;
   private java.math.BigDecimal[] P02XV6_A1275FasKgm ;
   private java.math.BigDecimal[] P02XV6_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P02XV6_A1276FasMtr ;
   private java.math.BigDecimal[] P02XV6_A467FasPreMtr ;
   private boolean[] P02XV6_n467FasPreMtr ;
   private java.math.BigDecimal[] P02XV6_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P02XV6_A466FasPreKgm ;
   private boolean[] P02XV6_n466FasPreKgm ;
   private short[] P02XV6_A1240GuiFasLin ;
}

final  class pgrmfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P02XV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV53AlbProCodi ,
                                          long AV54AlbProCodf ,
                                          int AV58CliCodini ,
                                          int AV59CliCodfin ,
                                          java.util.Date AV51AlbProFchi ,
                                          java.util.Date AV52AlbProFchf ,
                                          long A30AlbProCod ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A396EmprCod ,
                                          String AV57AlbProPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[8];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProPri = ?)");
      if ( ! (0==AV53AlbProCodi) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV54AlbProCodf) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV58CliCodini) )
      {
         addWhere(sWhereString, "(GuiRemCli >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV59CliCodfin) )
      {
         addWhere(sWhereString, "(GuiRemCli <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51AlbProFchi)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52AlbProFchf)) )
      {
         addWhere(sWhereString, "(AlbProfch <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P02XV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV53AlbProCodi ,
                                          long AV54AlbProCodf ,
                                          int AV58CliCodini ,
                                          int AV59CliCodfin ,
                                          java.util.Date AV51AlbProFchi ,
                                          java.util.Date AV52AlbProFchf ,
                                          long A30AlbProCod ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A39AlbProPri ,
                                          String AV57AlbProPri ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[8];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProCod, T1.AlbProPri, T1.AlbProfch, T1.GuiRemCli AS GuiRemCli, T2.CliNom AS GuiRemCln FROM (TXPCALPRD T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV53AlbProCodi) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV54AlbProCodf) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV58CliCodini) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV59CliCodfin) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51AlbProFchi)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52AlbProFchf)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P02XV2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).intValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] );
            case 1 :
                  return conditional_P02XV3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).intValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XV5", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbHdrgm2, T1.AlbHdrAnc, T2.BarGraAca, T2.BarAncAca1, T2.BarAcc, T1.BarAlbKgmE, T1.BarAlbMtrE, COALESCE( T3.BarMtr, 0) AS BarMtr FROM (((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XV6", "SELECT T4.CliCod, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod, T2.FasAcab, T1.FasKgm, T1.GuiFasPKg, T1.FasMtr, T5.FasPreMtr, T1.GuiFasPMt, T5.FasPreKgm, T1.GuiFasLin FROM ((((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) INNER JOIN TXPBARCAD T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPPREFAS T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T4.CliCod AND T5.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02XV7", "UPDATE TXPALBFAS SET FasKgm=?, GuiFasPKg=?, FasMtr=?, GuiFasPMt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P02XV8", "UPDATE TXPALBBAR SET BarAlbMtrE=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

