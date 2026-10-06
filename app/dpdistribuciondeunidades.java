package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpdistribuciondeunidades extends GXProcedure
{
   public dpdistribuciondeunidades( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpdistribuciondeunidades.class ), "" );
   }

   public dpdistribuciondeunidades( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTDistribuciondeUnidades> executeUdp( String aP0 ,
                                                                         int aP1 ,
                                                                         int aP2 ,
                                                                         java.util.Date aP3 ,
                                                                         java.util.Date aP4 ,
                                                                         String aP5 ,
                                                                         String aP6 ,
                                                                         byte aP7 )
   {
      dpdistribuciondeunidades.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTDistribuciondeUnidades>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        String aP6 ,
                        byte aP7 ,
                        GXBaseCollection<app.SdtSDTDistribuciondeUnidades>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             byte aP7 ,
                             GXBaseCollection<app.SdtSDTDistribuciondeUnidades>[] aP8 )
   {
      dpdistribuciondeunidades.this.AV10Emprcod = aP0;
      dpdistribuciondeunidades.this.AV9ClienteInicial = aP1;
      dpdistribuciondeunidades.this.AV8ClienteFinal = aP2;
      dpdistribuciondeunidades.this.AV12FechaInicial = aP3;
      dpdistribuciondeunidades.this.AV11FechaFinal = aP4;
      dpdistribuciondeunidades.this.AV7ArticuloInicial = aP5;
      dpdistribuciondeunidades.this.AV6ArticuloFinal = aP6;
      dpdistribuciondeunidades.this.AV5Albrest = aP7;
      dpdistribuciondeunidades.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00192 */
      pr_default.execute(0, new Object[] {AV10Emprcod, Integer.valueOf(AV9ClienteInicial), AV12FechaInicial, AV7ArticuloInicial, AV6ArticuloFinal, AV11FechaFinal, Byte.valueOf(AV5Albrest), Byte.valueOf(AV5Albrest), Integer.valueOf(AV8ClienteFinal)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A840TrnCod = P00192_A840TrnCod[0] ;
         n840TrnCod = P00192_n840TrnCod[0] ;
         A970ProceCod = P00192_A970ProceCod[0] ;
         n970ProceCod = P00192_n970ProceCod[0] ;
         A396EmprCod = P00192_A396EmprCod[0] ;
         A44AlbRecCod = P00192_A44AlbRecCod[0] ;
         A47AlbREst = P00192_A47AlbREst[0] ;
         A49AlbRFen = P00192_A49AlbRFen[0] ;
         A45AlbRef = P00192_A45AlbRef[0] ;
         A252CliCod = P00192_A252CliCod[0] ;
         A279CliNom = P00192_A279CliNom[0] ;
         A3613AlbRefDsc = P00192_A3613AlbRefDsc[0] ;
         A5806AlbREnt2 = P00192_A5806AlbREnt2[0] ;
         A46AlbREnt = P00192_A46AlbREnt[0] ;
         A56AlbRUni = P00192_A56AlbRUni[0] ;
         A50AlbRLoc = P00192_A50AlbRLoc[0] ;
         A971ProceNom = P00192_A971ProceNom[0] ;
         n971ProceNom = P00192_n971ProceNom[0] ;
         A841TrnNom = P00192_A841TrnNom[0] ;
         n841TrnNom = P00192_n841TrnNom[0] ;
         A54AlbRPieUti = P00192_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P00192_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P00192_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P00192_A58AlbRUniEnt[0] ;
         A841TrnNom = P00192_A841TrnNom[0] ;
         n841TrnNom = P00192_n841TrnNom[0] ;
         A971ProceNom = P00192_A971ProceNom[0] ;
         n971ProceNom = P00192_n971ProceNom[0] ;
         A279CliNom = P00192_A279CliNom[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         Gxm1sdtdistribuciondeunidades = (app.SdtSDTDistribuciondeUnidades)new app.SdtSDTDistribuciondeUnidades(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtdistribuciondeunidades, 0);
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Clicod( A252CliCod );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Clinom( A279CliNom );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Albref( A45AlbRef );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Albrefdsc( A3613AlbRefDsc );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Albreccod( A44AlbRecCod );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Albrfen( A49AlbRFen );
         GXt_char1 = "" ;
         GXv_char2[0] = A46AlbREnt ;
         GXv_char3[0] = A5806AlbREnt2 ;
         GXv_char4[0] = GXt_char1 ;
         new app.proc_albrent2(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         dpdistribuciondeunidades.this.A46AlbREnt = GXv_char2[0] ;
         dpdistribuciondeunidades.this.A5806AlbREnt2 = GXv_char3[0] ;
         dpdistribuciondeunidades.this.GXt_char1 = GXv_char4[0] ;
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Albrent2( GXt_char1 );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Albruni( A56AlbRUni );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Albrunient( A58AlbRUniEnt );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Albrpieent( A52AlbRPieEnt );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Albrunidis( A57AlbRUniDis );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Albrpiedis( A51AlbRPieDis );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Albrloc( A50AlbRLoc );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Procenom( A971ProceNom );
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Trnnom( A841TrnNom );
         AV13Obs = "" ;
         /* Using cursor P00193 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1300AlbRObs = P00193_A1300AlbRObs[0] ;
            A1299AlbRLin = P00193_A1299AlbRLin[0] ;
            AV13Obs += A1300AlbRObs + GXutil.newLine( ) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         Gxm1sdtdistribuciondeunidades.setgxTv_SdtSDTDistribuciondeUnidades_Obs( AV13Obs );
         /* Using cursor P00195 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A159BarFecGen = P00195_A159BarFecGen[0] ;
            A212BarSer = P00195_A212BarSer[0] ;
            A1652BarSerDsc = P00195_A1652BarSerDsc[0] ;
            A135BarColNom = P00195_A135BarColNom[0] ;
            A136BarColNum = P00195_A136BarColNum[0] ;
            A1234BarNomCli = P00195_A1234BarNomCli[0] ;
            A1235BarNumCli = P00195_A1235BarNumCli[0] ;
            A166BarKgm = P00195_A166BarKgm[0] ;
            A184BarMtr = P00195_A184BarMtr[0] ;
            A130BarCodPar = P00195_A130BarCodPar[0] ;
            A132BarCodReo = P00195_A132BarCodReo[0] ;
            A129BarCod = P00195_A129BarCod[0] ;
            A200BarPieCod = P00195_A200BarPieCod[0] ;
            A159BarFecGen = P00195_A159BarFecGen[0] ;
            A212BarSer = P00195_A212BarSer[0] ;
            A1652BarSerDsc = P00195_A1652BarSerDsc[0] ;
            A135BarColNom = P00195_A135BarColNom[0] ;
            A136BarColNum = P00195_A136BarColNum[0] ;
            A1234BarNomCli = P00195_A1234BarNomCli[0] ;
            A1235BarNumCli = P00195_A1235BarNumCli[0] ;
            A166BarKgm = P00195_A166BarKgm[0] ;
            A184BarMtr = P00195_A184BarMtr[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            Gxm3sdtdistribuciondeunidades_hdrs = (app.SdtSDTDistribuciondeUnidades_HdrsItem)new app.SdtSDTDistribuciondeUnidades_HdrsItem(remoteHandle, context);
            Gxm1sdtdistribuciondeunidades.getgxTv_SdtSDTDistribuciondeUnidades_Hdrs().add(Gxm3sdtdistribuciondeunidades_hdrs, 0);
            Gxm3sdtdistribuciondeunidades_hdrs.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr( A13696BarNHdr );
            Gxm3sdtdistribuciondeunidades_hdrs.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr( A159BarFecGen );
            Gxm3sdtdistribuciondeunidades_hdrs.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo( A212BarSer );
            Gxm3sdtdistribuciondeunidades_hdrs.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion( A1652BarSerDsc );
            Gxm3sdtdistribuciondeunidades_hdrs.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color( A135BarColNom );
            Gxm3sdtdistribuciondeunidades_hdrs.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero( A136BarColNum );
            Gxm3sdtdistribuciondeunidades_hdrs.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente( A1234BarNomCli );
            Gxm3sdtdistribuciondeunidades_hdrs.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente( A1235BarNumCli );
            Gxm3sdtdistribuciondeunidades_hdrs.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr( A166BarKgm );
            Gxm3sdtdistribuciondeunidades_hdrs.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr( A184BarMtr );
            /* Using cursor P00196 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A30AlbProCod = P00196_A30AlbProCod[0] ;
               A34AlbProfch = P00196_A34AlbProfch[0] ;
               A1261BarAlbKgmE = P00196_A1261BarAlbKgmE[0] ;
               A1263BarAlbMtrE = P00196_A1263BarAlbMtrE[0] ;
               A1265BarAlbPie = P00196_A1265BarAlbPie[0] ;
               A34AlbProfch = P00196_A34AlbProfch[0] ;
               Gxm4sdtdistribuciondeunidades_hdrs_albaranes = (app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem)new app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem(remoteHandle, context);
               Gxm3sdtdistribuciondeunidades_hdrs.getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes().add(Gxm4sdtdistribuciondeunidades_hdrs_albaranes, 0);
               Gxm4sdtdistribuciondeunidades_hdrs_albaranes.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran( A30AlbProCod );
               Gxm4sdtdistribuciondeunidades_hdrs_albaranes.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran( A34AlbProfch );
               Gxm4sdtdistribuciondeunidades_hdrs_albaranes.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb( A1261BarAlbKgmE );
               Gxm4sdtdistribuciondeunidades_hdrs_albaranes.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb( A1263BarAlbMtrE );
               Gxm4sdtdistribuciondeunidades_hdrs_albaranes.setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb( A1265BarAlbPie );
               pr_default.readNext(3);
            }
            pr_default.close(3);
            pr_default.readNext(2);
         }
         pr_default.close(2);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = dpdistribuciondeunidades.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTDistribuciondeUnidades>(app.SdtSDTDistribuciondeUnidades.class, "SDTDistribuciondeUnidades", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00192_A840TrnCod = new short[1] ;
      P00192_n840TrnCod = new boolean[] {false} ;
      P00192_A970ProceCod = new short[1] ;
      P00192_n970ProceCod = new boolean[] {false} ;
      P00192_A396EmprCod = new String[] {""} ;
      P00192_A44AlbRecCod = new int[1] ;
      P00192_A47AlbREst = new byte[1] ;
      P00192_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P00192_A45AlbRef = new String[] {""} ;
      P00192_A252CliCod = new int[1] ;
      P00192_A279CliNom = new String[] {""} ;
      P00192_A3613AlbRefDsc = new String[] {""} ;
      P00192_A5806AlbREnt2 = new String[] {""} ;
      P00192_A46AlbREnt = new String[] {""} ;
      P00192_A56AlbRUni = new String[] {""} ;
      P00192_A50AlbRLoc = new String[] {""} ;
      P00192_A971ProceNom = new String[] {""} ;
      P00192_n971ProceNom = new boolean[] {false} ;
      P00192_A841TrnNom = new String[] {""} ;
      P00192_n841TrnNom = new boolean[] {false} ;
      P00192_A54AlbRPieUti = new int[1] ;
      P00192_A52AlbRPieEnt = new int[1] ;
      P00192_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00192_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A279CliNom = "" ;
      A3613AlbRefDsc = "" ;
      A5806AlbREnt2 = "" ;
      A46AlbREnt = "" ;
      A56AlbRUni = "" ;
      A50AlbRLoc = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      Gxm1sdtdistribuciondeunidades = new app.SdtSDTDistribuciondeUnidades(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV13Obs = "" ;
      P00193_A396EmprCod = new String[] {""} ;
      P00193_A44AlbRecCod = new int[1] ;
      P00193_A1300AlbRObs = new String[] {""} ;
      P00193_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      P00195_A396EmprCod = new String[] {""} ;
      P00195_A44AlbRecCod = new int[1] ;
      P00195_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P00195_A212BarSer = new String[] {""} ;
      P00195_A1652BarSerDsc = new String[] {""} ;
      P00195_A135BarColNom = new String[] {""} ;
      P00195_A136BarColNum = new int[1] ;
      P00195_A1234BarNomCli = new String[] {""} ;
      P00195_A1235BarNumCli = new int[1] ;
      P00195_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00195_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00195_A130BarCodPar = new String[] {""} ;
      P00195_A132BarCodReo = new byte[1] ;
      P00195_A129BarCod = new int[1] ;
      P00195_A200BarPieCod = new String[] {""} ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      A13696BarNHdr = "" ;
      Gxm3sdtdistribuciondeunidades_hdrs = new app.SdtSDTDistribuciondeUnidades_HdrsItem(remoteHandle, context);
      P00196_A396EmprCod = new String[] {""} ;
      P00196_A129BarCod = new int[1] ;
      P00196_A132BarCodReo = new byte[1] ;
      P00196_A130BarCodPar = new String[] {""} ;
      P00196_A30AlbProCod = new long[1] ;
      P00196_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P00196_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00196_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00196_A1265BarAlbPie = new int[1] ;
      A34AlbProfch = GXutil.nullDate() ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      Gxm4sdtdistribuciondeunidades_hdrs_albaranes = new app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpdistribuciondeunidades__default(),
         new Object[] {
             new Object[] {
            P00192_A840TrnCod, P00192_n840TrnCod, P00192_A970ProceCod, P00192_n970ProceCod, P00192_A396EmprCod, P00192_A44AlbRecCod, P00192_A47AlbREst, P00192_A49AlbRFen, P00192_A45AlbRef, P00192_A252CliCod,
            P00192_A279CliNom, P00192_A3613AlbRefDsc, P00192_A5806AlbREnt2, P00192_A46AlbREnt, P00192_A56AlbRUni, P00192_A50AlbRLoc, P00192_A971ProceNom, P00192_n971ProceNom, P00192_A841TrnNom, P00192_n841TrnNom,
            P00192_A54AlbRPieUti, P00192_A52AlbRPieEnt, P00192_A60AlbRUniUti, P00192_A58AlbRUniEnt
            }
            , new Object[] {
            P00193_A396EmprCod, P00193_A44AlbRecCod, P00193_A1300AlbRObs, P00193_A1299AlbRLin
            }
            , new Object[] {
            P00195_A396EmprCod, P00195_A44AlbRecCod, P00195_A159BarFecGen, P00195_A212BarSer, P00195_A1652BarSerDsc, P00195_A135BarColNom, P00195_A136BarColNum, P00195_A1234BarNomCli, P00195_A1235BarNumCli, P00195_A166BarKgm,
            P00195_A184BarMtr, P00195_A130BarCodPar, P00195_A132BarCodReo, P00195_A129BarCod, P00195_A200BarPieCod
            }
            , new Object[] {
            P00196_A396EmprCod, P00196_A129BarCod, P00196_A132BarCodReo, P00196_A130BarCodPar, P00196_A30AlbProCod, P00196_A34AlbProfch, P00196_A1261BarAlbKgmE, P00196_A1263BarAlbMtrE, P00196_A1265BarAlbPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV5Albrest ;
   private byte A47AlbREst ;
   private byte A1299AlbRLin ;
   private byte A132BarCodReo ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int AV9ClienteInicial ;
   private int AV8ClienteFinal ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private String AV10Emprcod ;
   private String AV7ArticuloInicial ;
   private String AV6ArticuloFinal ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String A279CliNom ;
   private String A3613AlbRefDsc ;
   private String A5806AlbREnt2 ;
   private String A46AlbREnt ;
   private String A56AlbRUni ;
   private String A50AlbRLoc ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String A1300AlbRObs ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String A13696BarNHdr ;
   private java.util.Date AV12FechaInicial ;
   private java.util.Date AV11FechaFinal ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A34AlbProfch ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private String AV13Obs ;
   private GXBaseCollection<app.SdtSDTDistribuciondeUnidades>[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P00192_A840TrnCod ;
   private boolean[] P00192_n840TrnCod ;
   private short[] P00192_A970ProceCod ;
   private boolean[] P00192_n970ProceCod ;
   private String[] P00192_A396EmprCod ;
   private int[] P00192_A44AlbRecCod ;
   private byte[] P00192_A47AlbREst ;
   private java.util.Date[] P00192_A49AlbRFen ;
   private String[] P00192_A45AlbRef ;
   private int[] P00192_A252CliCod ;
   private String[] P00192_A279CliNom ;
   private String[] P00192_A3613AlbRefDsc ;
   private String[] P00192_A5806AlbREnt2 ;
   private String[] P00192_A46AlbREnt ;
   private String[] P00192_A56AlbRUni ;
   private String[] P00192_A50AlbRLoc ;
   private String[] P00192_A971ProceNom ;
   private boolean[] P00192_n971ProceNom ;
   private String[] P00192_A841TrnNom ;
   private boolean[] P00192_n841TrnNom ;
   private int[] P00192_A54AlbRPieUti ;
   private int[] P00192_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P00192_A60AlbRUniUti ;
   private java.math.BigDecimal[] P00192_A58AlbRUniEnt ;
   private String[] P00193_A396EmprCod ;
   private int[] P00193_A44AlbRecCod ;
   private String[] P00193_A1300AlbRObs ;
   private byte[] P00193_A1299AlbRLin ;
   private String[] P00195_A396EmprCod ;
   private int[] P00195_A44AlbRecCod ;
   private java.util.Date[] P00195_A159BarFecGen ;
   private String[] P00195_A212BarSer ;
   private String[] P00195_A1652BarSerDsc ;
   private String[] P00195_A135BarColNom ;
   private int[] P00195_A136BarColNum ;
   private String[] P00195_A1234BarNomCli ;
   private int[] P00195_A1235BarNumCli ;
   private java.math.BigDecimal[] P00195_A166BarKgm ;
   private java.math.BigDecimal[] P00195_A184BarMtr ;
   private String[] P00195_A130BarCodPar ;
   private byte[] P00195_A132BarCodReo ;
   private int[] P00195_A129BarCod ;
   private String[] P00195_A200BarPieCod ;
   private String[] P00196_A396EmprCod ;
   private int[] P00196_A129BarCod ;
   private byte[] P00196_A132BarCodReo ;
   private String[] P00196_A130BarCodPar ;
   private long[] P00196_A30AlbProCod ;
   private java.util.Date[] P00196_A34AlbProfch ;
   private java.math.BigDecimal[] P00196_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P00196_A1263BarAlbMtrE ;
   private int[] P00196_A1265BarAlbPie ;
   private GXBaseCollection<app.SdtSDTDistribuciondeUnidades> Gxm2rootcol ;
   private app.SdtSDTDistribuciondeUnidades Gxm1sdtdistribuciondeunidades ;
   private app.SdtSDTDistribuciondeUnidades_HdrsItem Gxm3sdtdistribuciondeunidades_hdrs ;
   private app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem Gxm4sdtdistribuciondeunidades_hdrs_albaranes ;
}

final  class dpdistribuciondeunidades__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00192", "SELECT T1.TrnCod, T1.ProceCod, T1.EmprCod, T1.AlbRecCod, T1.AlbREst, T1.AlbRFen, T1.AlbRef, T1.CliCod, T4.CliNom, T1.AlbRefDsc, T1.AlbREnt2, T1.AlbREnt, T1.AlbRUni, T1.AlbRLoc, T3.ProceNom, T2.TrnNom, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt FROM (((TXPALBREC T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.AlbRFen >= ? and T1.AlbRef >= ?) AND (T1.AlbRef <= ?) AND (T1.AlbRFen <= ?) AND (T1.AlbREst = ? or ? = 9) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRFen, T1.AlbRef ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00193", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00195", "SELECT T1.EmprCod, T1.AlbRecCod, T2.BarFecGen, T2.BarSer, T2.BarSerDsc, T2.BarColNom, T2.BarColNum, T2.BarNomCli, T2.BarNumCli, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarPieCod FROM ((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00196", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbProCod, T2.AlbProfch, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((String[]) buf[13])[0] = rslt.getString(12, 8);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 10);
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

