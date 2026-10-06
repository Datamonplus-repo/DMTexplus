package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens009d extends GXProcedure
{
   public pens009d( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens009d.class ), "" );
   }

   public pens009d( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             long[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 ,
                             int[] aP9 )
   {
      pens009d.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        long[] aP5 ,
                        byte[] aP6 ,
                        byte[] aP7 ,
                        byte[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             long[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      pens009d.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens009d.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens009d.this.AV63Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens009d.this.AV62Lb_fechaR = aP3[0];
      this.aP3 = aP3;
      pens009d.this.AV64Lb_costeE = aP4[0];
      this.aP4 = aP4;
      pens009d.this.AV70Lb_rgb = aP5[0];
      this.aP5 = aP5;
      pens009d.this.AV67F_cformu = aP6[0];
      this.aP6 = aP6;
      pens009d.this.AV68F_ldform = aP7[0];
      this.aP7 = aP7;
      pens009d.this.AV69F_lprfor = aP8[0];
      this.aP8 = aP8;
      pens009d.this.AV81Num_col = aP9[0];
      this.aP9 = aP9;
      pens009d.this.AV105ForPro = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV79Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pens009d.this.GXt_char1 = GXv_char2[0] ;
      AV79Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV80EmprNom ;
      GXv_char4[0] = AV78Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char2, GXv_char3, GXv_char4) ;
      pens009d.this.A396EmprCod = GXv_char2[0] ;
      pens009d.this.AV80EmprNom = GXv_char3[0] ;
      pens009d.this.AV78Usurcod = GXv_char4[0] ;
      GXt_int5 = AV85HdrLab ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRLAB", ""), GXv_int6) ;
      pens009d.this.GXt_int5 = GXv_int6[0] ;
      AV85HdrLab = GXt_int5 ;
      GXt_int5 = AV86Pervafil ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int6) ;
      pens009d.this.GXt_int5 = GXv_int6[0] ;
      AV86Pervafil = GXt_int5 ;
      GXt_int5 = AV87Tinamar ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      pens009d.this.GXt_int5 = GXv_int6[0] ;
      AV87Tinamar = GXt_int5 ;
      GXt_int5 = AV88Carvema ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      pens009d.this.GXt_int5 = GXv_int6[0] ;
      AV88Carvema = GXt_int5 ;
      GXt_int5 = AV91ProLab ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PROLAB", ""), GXv_int6) ;
      pens009d.this.GXt_int5 = GXv_int6[0] ;
      AV91ProLab = GXt_int5 ;
      GXt_int5 = AV92EnsPrf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENSPRF", ""), GXv_int6) ;
      pens009d.this.GXt_int5 = GXv_int6[0] ;
      AV92EnsPrf = GXt_int5 ;
      GXt_int5 = AV93Hss ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int6) ;
      pens009d.this.GXt_int5 = GXv_int6[0] ;
      AV93Hss = GXt_int5 ;
      GXt_int5 = AV101Hidro ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HIDRO", ""), GXv_int6) ;
      pens009d.this.GXt_int5 = GXv_int6[0] ;
      AV101Hidro = GXt_int5 ;
      GXt_int5 = AV115Magosa ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int6) ;
      pens009d.this.GXt_int5 = GXv_int6[0] ;
      AV115Magosa = GXt_int5 ;
      GXt_int5 = AV118Texfina ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int6) ;
      pens009d.this.GXt_int5 = GXv_int6[0] ;
      AV118Texfina = GXt_int5 ;
      GXt_int5 = AV120HilasaLote ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HILLOT", ""), GXv_int6) ;
      pens009d.this.GXt_int5 = GXv_int6[0] ;
      AV120HilasaLote = GXt_int5 ;
      GXt_int5 = AV122Filasur ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FILASU", ""), GXv_int6) ;
      pens009d.this.GXt_int5 = GXv_int6[0] ;
      AV122Filasur = GXt_int5 ;
      AV82Lb_preKg = DecimalUtil.doubleToDec(0) ;
      AV116LB_NUMOP = (byte)(0) ;
      AV117LB_NUMAUX = (byte)(0) ;
      /* Using cursor P03NT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV63Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5555Lb_opcion = P03NT2_A5555Lb_opcion[0] ;
         A5989Lb_PreKg = P03NT2_A5989Lb_PreKg[0] ;
         A5718Lb_numop = P03NT2_A5718Lb_numop[0] ;
         A7395Lb_NumAux = P03NT2_A7395Lb_NumAux[0] ;
         A12731Lb_ObsFac = P03NT2_A12731Lb_ObsFac[0] ;
         AV82Lb_preKg = A5989Lb_PreKg ;
         AV116LB_NUMOP = A5718Lb_numop ;
         AV117LB_NUMAUX = A7395Lb_NumAux ;
         if ( (0==A7395Lb_NumAux) || ( A7395Lb_NumAux == 0 ) )
         {
            AV117LB_NUMAUX = A5718Lb_numop ;
         }
         AV124Lb_obsfac = A12731Lb_ObsFac ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P03NT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P03NT3_A252CliCod[0] ;
         A5533Lb_ArtCod = P03NT3_A5533Lb_ArtCod[0] ;
         A5536Lb_ColNom = P03NT3_A5536Lb_ColNom[0] ;
         A5537Lb_ColNum = P03NT3_A5537Lb_ColNum[0] ;
         A831TipColCod = P03NT3_A831TipColCod[0] ;
         n831TipColCod = P03NT3_n831TipColCod[0] ;
         A583IntCod = P03NT3_A583IntCod[0] ;
         n583IntCod = P03NT3_n583IntCod[0] ;
         A626MatCod = P03NT3_A626MatCod[0] ;
         n626MatCod = P03NT3_n626MatCod[0] ;
         A1514MacProCod = P03NT3_A1514MacProCod[0] ;
         n1514MacProCod = P03NT3_n1514MacProCod[0] ;
         A5547Lb_Rb = P03NT3_A5547Lb_Rb[0] ;
         A5540Lb_Cartaz = P03NT3_A5540Lb_Cartaz[0] ;
         A5538Lb_ColNomC = P03NT3_A5538Lb_ColNomC[0] ;
         A5539Lb_ColNumC = P03NT3_A5539Lb_ColNumC[0] ;
         A5535Lb_TipArt = P03NT3_A5535Lb_TipArt[0] ;
         A5541Lb_FechaE = P03NT3_A5541Lb_FechaE[0] ;
         A7780Lb_Hila = P03NT3_A7780Lb_Hila[0] ;
         AV71CliCod = A252CliCod ;
         AV72ForSer = A5533Lb_ArtCod ;
         AV73ForColNom = A5536Lb_ColNom ;
         AV74ForColNum = A5537Lb_ColNum ;
         AV75TipColCod = A831TipColCod ;
         AV89IntCod = A583IntCod ;
         AV94MatCod = A626MatCod ;
         AV90MacProcod = A1514MacProCod ;
         AV95Lb_Rb = A5547Lb_Rb ;
         AV96Lb_Cartaz = A5540Lb_Cartaz ;
         AV97Lb_numero = A5532Lb_numero ;
         AV99Lb_ColNomC = A5538Lb_ColNomC ;
         AV100Lb_ColNumC = A5539Lb_ColNumC ;
         AV104Lb_TipArt = A5535Lb_TipArt ;
         AV119lb_fechae = A5541Lb_FechaE ;
         AV121Lb_hila = A7780Lb_Hila ;
         /* Execute user subroutine: 'CFORMU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV130Json_Inc_Obs = "" ;
      /* Using cursor P03NT4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV71CliCod), AV72ForSer, AV73ForColNom, Integer.valueOf(AV74ForColNum), Byte.valueOf(AV75TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = P03NT4_A831TipColCod[0] ;
         n831TipColCod = P03NT4_n831TipColCod[0] ;
         A483ForColNum = P03NT4_A483ForColNum[0] ;
         A482ForColNom = P03NT4_A482ForColNom[0] ;
         A494ForSer = P03NT4_A494ForSer[0] ;
         A252CliCod = P03NT4_A252CliCod[0] ;
         A486ForNumCol = P03NT4_A486ForNumCol[0] ;
         A651ObsUltLin = P03NT4_A651ObsUltLin[0] ;
         n651ObsUltLin = P03NT4_n651ObsUltLin[0] ;
         A3558ForFecApr = P03NT4_A3558ForFecApr[0] ;
         n3558ForFecApr = P03NT4_n3558ForFecApr[0] ;
         A3560ForOpcCli = P03NT4_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P03NT4_n3560ForOpcCli[0] ;
         A583IntCod = P03NT4_A583IntCod[0] ;
         n583IntCod = P03NT4_n583IntCod[0] ;
         A1514MacProCod = P03NT4_A1514MacProCod[0] ;
         n1514MacProCod = P03NT4_n1514MacProCod[0] ;
         A3315ForNumArc = P03NT4_A3315ForNumArc[0] ;
         n3315ForNumArc = P03NT4_n3315ForNumArc[0] ;
         A1191ForNomCli = P03NT4_A1191ForNomCli[0] ;
         n1191ForNomCli = P03NT4_n1191ForNomCli[0] ;
         A1192ForNumCli = P03NT4_A1192ForNumCli[0] ;
         n1192ForNumCli = P03NT4_n1192ForNumCli[0] ;
         A995ForTonal = P03NT4_A995ForTonal[0] ;
         n995ForTonal = P03NT4_n995ForTonal[0] ;
         A4380ForCosForm = P03NT4_A4380ForCosForm[0] ;
         n4380ForCosForm = P03NT4_n4380ForCosForm[0] ;
         A7537ForOpNum = P03NT4_A7537ForOpNum[0] ;
         n7537ForOpNum = P03NT4_n7537ForOpNum[0] ;
         A6379ForNomCli2 = P03NT4_A6379ForNomCli2[0] ;
         n6379ForNomCli2 = P03NT4_n6379ForNomCli2[0] ;
         AV61ForNumCol = A486ForNumCol ;
         AV112OBSULTLIN = (short)(A651ObsUltLin+1) ;
         if ( AV88Carvema == 1 )
         {
            A3558ForFecApr = AV62Lb_fechaR ;
            n3558ForFecApr = false ;
            A3560ForOpcCli = AV63Lb_opcion ;
            n3560ForOpcCli = false ;
            A583IntCod = AV89IntCod ;
            n583IntCod = false ;
            A1514MacProCod = AV90MacProcod ;
            n1514MacProCod = false ;
         }
         A3315ForNumArc = AV97Lb_numero ;
         n3315ForNumArc = false ;
         A3560ForOpcCli = AV63Lb_opcion ;
         n3560ForOpcCli = false ;
         A1191ForNomCli = AV99Lb_ColNomC ;
         n1191ForNomCli = false ;
         A1192ForNumCli = AV100Lb_ColNumC ;
         n1192ForNumCli = false ;
         A995ForTonal = AV96Lb_Cartaz ;
         n995ForTonal = false ;
         A3558ForFecApr = AV62Lb_fechaR ;
         n3558ForFecApr = false ;
         if ( AV118Texfina == 1 )
         {
            A4380ForCosForm = AV64Lb_costeE ;
            n4380ForCosForm = false ;
            A7537ForOpNum = AV117LB_NUMAUX ;
            n7537ForOpNum = false ;
         }
         if ( AV120HilasaLote == 1 )
         {
            A6379ForNomCli2 = AV121Lb_hila ;
            n6379ForNomCli2 = false ;
         }
         if ( ( AV87Tinamar == 1 ) || ( AV88Carvema == 1 ) || ( AV92EnsPrf == 1 ) )
         {
            AV127nprocesos = (short)(0) ;
            AV128Col_Inc_Obs.clear();
            /* Using cursor P03NT5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV71CliCod), AV72ForSer, AV73ForColNom, Integer.valueOf(AV74ForColNum), Byte.valueOf(AV75TipColCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A831TipColCod = P03NT5_A831TipColCod[0] ;
               n831TipColCod = P03NT5_n831TipColCod[0] ;
               A483ForColNum = P03NT5_A483ForColNum[0] ;
               A482ForColNom = P03NT5_A482ForColNom[0] ;
               A494ForSer = P03NT5_A494ForSer[0] ;
               A252CliCod = P03NT5_A252CliCod[0] ;
               A764ProForCod = P03NT5_A764ProForCod[0] ;
               A1160ProForL = P03NT5_A1160ProForL[0] ;
               AV129Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
               AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Delete LFORMU", "")+GXutil.newLine( ) );
               AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Cliente  = ", "")+GXutil.trim( GXutil.str( A252CliCod, 6, 0))+GXutil.newLine( ) );
               AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Articulo = ", "")+GXutil.trim( A494ForSer)+GXutil.newLine( ) );
               AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Color    = ", "")+GXutil.trim( A482ForColNom)+GXutil.newLine( ) );
               AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Numero   = ", "")+GXutil.trim( GXutil.str( A483ForColNum, 6, 0))+GXutil.newLine( ) );
               AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Tc       = ", "")+GXutil.trim( GXutil.str( A831TipColCod, 2, 0))+GXutil.newLine( ) );
               AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Proceso  = ", "")+GXutil.trim( A764ProForCod)+GXutil.newLine( ) );
               AV128Col_Inc_Obs.add(AV129Item_Col_Inc_Obs, 0);
               /* Using cursor P03NT6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
               AV127nprocesos = (short)(AV127nprocesos+1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( AV128Col_Inc_Obs.size() > 0 )
            {
               AV130Json_Inc_Obs = AV128Col_Inc_Obs.toJSonString(false) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV137Pgmname, AV78Usurcod, AV79Station, AV130Json_Inc_Obs, AV61ForNumCol, (byte)(0), " ") ;
            }
         }
         AV130Json_Inc_Obs = "" ;
         AV128Col_Inc_Obs.clear();
         AV129Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Update CFORMU", "")+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Cliente  = ", "")+GXutil.trim( GXutil.str( A252CliCod, 6, 0))+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Articulo = ", "")+GXutil.trim( A494ForSer)+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Color    = ", "")+GXutil.trim( A482ForColNom)+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Numero   = ", "")+GXutil.trim( GXutil.str( A483ForColNum, 6, 0))+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Tc       = ", "")+GXutil.trim( GXutil.str( A831TipColCod, 2, 0))+GXutil.newLine( ) );
         AV128Col_Inc_Obs.add(AV129Item_Col_Inc_Obs, 0);
         AV130Json_Inc_Obs = AV128Col_Inc_Obs.toJSonString(false) ;
         /* Using cursor P03NT7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n3558ForFecApr), A3558ForFecApr, Boolean.valueOf(n3560ForOpcCli), A3560ForOpcCli, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n1514MacProCod), A1514MacProCod, Boolean.valueOf(n3315ForNumArc), Integer.valueOf(A3315ForNumArc), Boolean.valueOf(n1191ForNomCli), A1191ForNomCli, Boolean.valueOf(n1192ForNumCli), Integer.valueOf(A1192ForNumCli), Boolean.valueOf(n995ForTonal), A995ForTonal, Boolean.valueOf(n4380ForCosForm), A4380ForCosForm, Boolean.valueOf(n7537ForOpNum), Byte.valueOf(A7537ForOpNum), Boolean.valueOf(n6379ForNomCli2), A6379ForNomCli2, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV128Col_Inc_Obs.size() > 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV137Pgmname, AV78Usurcod, AV79Station, AV130Json_Inc_Obs, AV61ForNumCol, (byte)(0), " ") ;
      }
      AV128Col_Inc_Obs.clear();
      /* Using cursor P03NT8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV61ForNumCol)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A486ForNumCol = P03NT8_A486ForNumCol[0] ;
         A719PrdNum = P03NT8_A719PrdNum[0] ;
         A481ForCan = P03NT8_A481ForCan[0] ;
         A488ForPrdDsc = P03NT8_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P03NT8_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P03NT8_A490ForPrdUMe[0] ;
         A309ColLin = P03NT8_A309ColLin[0] ;
         A488ForPrdDsc = P03NT8_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P03NT8_n488ForPrdDsc[0] ;
         AV129Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Delete LDFORM", "")+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Formula= ", "")+GXutil.trim( GXutil.str( A486ForNumCol, 8, 0))+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Prdnum   = ", "")+GXutil.trim( A719PrdNum)+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Cant     = ", "")+GXutil.trim( GXutil.str( A481ForCan, 11, 5))+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Unidad   = ", "")+GXutil.str( A490ForPrdUMe, 1, 0)+" "+GXutil.trim( A488ForPrdDsc) );
         AV128Col_Inc_Obs.add(AV129Item_Col_Inc_Obs, 0);
         AV125colorantes = (short)(AV125colorantes+1) ;
         /* Using cursor P03NT9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( AV128Col_Inc_Obs.size() > 0 )
      {
         AV130Json_Inc_Obs = AV128Col_Inc_Obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV137Pgmname, AV78Usurcod, AV79Station, AV130Json_Inc_Obs, AV61ForNumCol, (byte)(0), " ") ;
      }
      AV128Col_Inc_Obs.clear();
      /* Using cursor P03NT10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV61ForNumCol)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A486ForNumCol = P03NT10_A486ForNumCol[0] ;
         A719PrdNum = P03NT10_A719PrdNum[0] ;
         A487ForPrdCan = P03NT10_A487ForPrdCan[0] ;
         A488ForPrdDsc = P03NT10_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P03NT10_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P03NT10_A490ForPrdUMe[0] ;
         A489ForPrdNor = P03NT10_A489ForPrdNor[0] ;
         A715PrdLin = P03NT10_A715PrdLin[0] ;
         A488ForPrdDsc = P03NT10_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P03NT10_n488ForPrdDsc[0] ;
         AV129Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Delete LPRFOR", "")+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Formula= ", "")+GXutil.trim( GXutil.str( A486ForNumCol, 8, 0))+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Prdnum   = ", "")+GXutil.trim( A719PrdNum)+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Cant     = ", "")+GXutil.trim( GXutil.str( A487ForPrdCan, 11, 5))+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Unidad   = ", "")+GXutil.str( A490ForPrdUMe, 1, 0)+" "+GXutil.trim( A488ForPrdDsc)+GXutil.newLine( ) );
         AV129Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV129Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "oRDEN    = ", "")+GXutil.trim( GXutil.str( A489ForPrdNor, 4, 0)) );
         AV128Col_Inc_Obs.add(AV129Item_Col_Inc_Obs, 0);
         /* Using cursor P03NT11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( AV128Col_Inc_Obs.size() > 0 )
      {
         AV130Json_Inc_Obs = AV128Col_Inc_Obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV137Pgmname, AV78Usurcod, AV79Station, AV130Json_Inc_Obs, AV61ForNumCol, (byte)(0), " ") ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens009d.this.A396EmprCod;
      this.aP1[0] = pens009d.this.A5532Lb_numero;
      this.aP2[0] = pens009d.this.AV63Lb_opcion;
      this.aP3[0] = pens009d.this.AV62Lb_fechaR;
      this.aP4[0] = pens009d.this.AV64Lb_costeE;
      this.aP5[0] = pens009d.this.AV70Lb_rgb;
      this.aP6[0] = pens009d.this.AV67F_cformu;
      this.aP7[0] = pens009d.this.AV68F_ldform;
      this.aP8[0] = pens009d.this.AV69F_lprfor;
      this.aP9[0] = pens009d.this.AV81Num_col;
      this.aP10[0] = pens009d.this.AV105ForPro;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens009d");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV79Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV80EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV78Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV82Lb_preKg = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P03NT2_A396EmprCod = new String[] {""} ;
      P03NT2_A5532Lb_numero = new int[1] ;
      P03NT2_A5555Lb_opcion = new String[] {""} ;
      P03NT2_A5989Lb_PreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NT2_A5718Lb_numop = new byte[1] ;
      P03NT2_A7395Lb_NumAux = new byte[1] ;
      P03NT2_A12731Lb_ObsFac = new String[] {""} ;
      A5555Lb_opcion = "" ;
      A5989Lb_PreKg = DecimalUtil.ZERO ;
      A12731Lb_ObsFac = "" ;
      AV124Lb_obsfac = "" ;
      P03NT3_A396EmprCod = new String[] {""} ;
      P03NT3_A5532Lb_numero = new int[1] ;
      P03NT3_A252CliCod = new int[1] ;
      P03NT3_A5533Lb_ArtCod = new String[] {""} ;
      P03NT3_A5536Lb_ColNom = new String[] {""} ;
      P03NT3_A5537Lb_ColNum = new int[1] ;
      P03NT3_A831TipColCod = new byte[1] ;
      P03NT3_n831TipColCod = new boolean[] {false} ;
      P03NT3_A583IntCod = new byte[1] ;
      P03NT3_n583IntCod = new boolean[] {false} ;
      P03NT3_A626MatCod = new short[1] ;
      P03NT3_n626MatCod = new boolean[] {false} ;
      P03NT3_A1514MacProCod = new String[] {""} ;
      P03NT3_n1514MacProCod = new boolean[] {false} ;
      P03NT3_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NT3_A5540Lb_Cartaz = new String[] {""} ;
      P03NT3_A5538Lb_ColNomC = new String[] {""} ;
      P03NT3_A5539Lb_ColNumC = new int[1] ;
      P03NT3_A5535Lb_TipArt = new short[1] ;
      P03NT3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P03NT3_A7780Lb_Hila = new String[] {""} ;
      A5533Lb_ArtCod = "" ;
      A5536Lb_ColNom = "" ;
      A1514MacProCod = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5540Lb_Cartaz = "" ;
      A5538Lb_ColNomC = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A7780Lb_Hila = "" ;
      AV72ForSer = "" ;
      AV73ForColNom = "" ;
      AV90MacProcod = "" ;
      AV95Lb_Rb = DecimalUtil.ZERO ;
      AV96Lb_Cartaz = "" ;
      AV99Lb_ColNomC = "" ;
      AV119lb_fechae = GXutil.nullDate() ;
      AV121Lb_hila = "" ;
      AV130Json_Inc_Obs = "" ;
      P03NT4_A396EmprCod = new String[] {""} ;
      P03NT4_A831TipColCod = new byte[1] ;
      P03NT4_n831TipColCod = new boolean[] {false} ;
      P03NT4_A483ForColNum = new int[1] ;
      P03NT4_A482ForColNom = new String[] {""} ;
      P03NT4_A494ForSer = new String[] {""} ;
      P03NT4_A252CliCod = new int[1] ;
      P03NT4_A486ForNumCol = new int[1] ;
      P03NT4_A651ObsUltLin = new short[1] ;
      P03NT4_n651ObsUltLin = new boolean[] {false} ;
      P03NT4_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P03NT4_n3558ForFecApr = new boolean[] {false} ;
      P03NT4_A3560ForOpcCli = new String[] {""} ;
      P03NT4_n3560ForOpcCli = new boolean[] {false} ;
      P03NT4_A583IntCod = new byte[1] ;
      P03NT4_n583IntCod = new boolean[] {false} ;
      P03NT4_A1514MacProCod = new String[] {""} ;
      P03NT4_n1514MacProCod = new boolean[] {false} ;
      P03NT4_A3315ForNumArc = new int[1] ;
      P03NT4_n3315ForNumArc = new boolean[] {false} ;
      P03NT4_A1191ForNomCli = new String[] {""} ;
      P03NT4_n1191ForNomCli = new boolean[] {false} ;
      P03NT4_A1192ForNumCli = new int[1] ;
      P03NT4_n1192ForNumCli = new boolean[] {false} ;
      P03NT4_A995ForTonal = new String[] {""} ;
      P03NT4_n995ForTonal = new boolean[] {false} ;
      P03NT4_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NT4_n4380ForCosForm = new boolean[] {false} ;
      P03NT4_A7537ForOpNum = new byte[1] ;
      P03NT4_n7537ForOpNum = new boolean[] {false} ;
      P03NT4_A6379ForNomCli2 = new String[] {""} ;
      P03NT4_n6379ForNomCli2 = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      A3560ForOpcCli = "" ;
      A1191ForNomCli = "" ;
      A995ForTonal = "" ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A6379ForNomCli2 = "" ;
      AV128Col_Inc_Obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      P03NT5_A396EmprCod = new String[] {""} ;
      P03NT5_A831TipColCod = new byte[1] ;
      P03NT5_n831TipColCod = new boolean[] {false} ;
      P03NT5_A483ForColNum = new int[1] ;
      P03NT5_A482ForColNom = new String[] {""} ;
      P03NT5_A494ForSer = new String[] {""} ;
      P03NT5_A252CliCod = new int[1] ;
      P03NT5_A764ProForCod = new String[] {""} ;
      P03NT5_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      AV129Item_Col_Inc_Obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV137Pgmname = "" ;
      P03NT8_A396EmprCod = new String[] {""} ;
      P03NT8_A486ForNumCol = new int[1] ;
      P03NT8_A719PrdNum = new String[] {""} ;
      P03NT8_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NT8_A488ForPrdDsc = new String[] {""} ;
      P03NT8_n488ForPrdDsc = new boolean[] {false} ;
      P03NT8_A490ForPrdUMe = new byte[1] ;
      P03NT8_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      P03NT10_A396EmprCod = new String[] {""} ;
      P03NT10_A486ForNumCol = new int[1] ;
      P03NT10_A719PrdNum = new String[] {""} ;
      P03NT10_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NT10_A488ForPrdDsc = new String[] {""} ;
      P03NT10_n488ForPrdDsc = new boolean[] {false} ;
      P03NT10_A490ForPrdUMe = new byte[1] ;
      P03NT10_A489ForPrdNor = new short[1] ;
      P03NT10_A715PrdLin = new short[1] ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens009d__default(),
         new Object[] {
             new Object[] {
            P03NT2_A396EmprCod, P03NT2_A5532Lb_numero, P03NT2_A5555Lb_opcion, P03NT2_A5989Lb_PreKg, P03NT2_A5718Lb_numop, P03NT2_A7395Lb_NumAux, P03NT2_A12731Lb_ObsFac
            }
            , new Object[] {
            P03NT3_A396EmprCod, P03NT3_A5532Lb_numero, P03NT3_A252CliCod, P03NT3_A5533Lb_ArtCod, P03NT3_A5536Lb_ColNom, P03NT3_A5537Lb_ColNum, P03NT3_A831TipColCod, P03NT3_n831TipColCod, P03NT3_A583IntCod, P03NT3_n583IntCod,
            P03NT3_A626MatCod, P03NT3_n626MatCod, P03NT3_A1514MacProCod, P03NT3_n1514MacProCod, P03NT3_A5547Lb_Rb, P03NT3_A5540Lb_Cartaz, P03NT3_A5538Lb_ColNomC, P03NT3_A5539Lb_ColNumC, P03NT3_A5535Lb_TipArt, P03NT3_A5541Lb_FechaE,
            P03NT3_A7780Lb_Hila
            }
            , new Object[] {
            P03NT4_A396EmprCod, P03NT4_A831TipColCod, P03NT4_A483ForColNum, P03NT4_A482ForColNom, P03NT4_A494ForSer, P03NT4_A252CliCod, P03NT4_A486ForNumCol, P03NT4_A651ObsUltLin, P03NT4_n651ObsUltLin, P03NT4_A3558ForFecApr,
            P03NT4_n3558ForFecApr, P03NT4_A3560ForOpcCli, P03NT4_n3560ForOpcCli, P03NT4_A583IntCod, P03NT4_A1514MacProCod, P03NT4_n1514MacProCod, P03NT4_A3315ForNumArc, P03NT4_n3315ForNumArc, P03NT4_A1191ForNomCli, P03NT4_n1191ForNomCli,
            P03NT4_A1192ForNumCli, P03NT4_n1192ForNumCli, P03NT4_A995ForTonal, P03NT4_n995ForTonal, P03NT4_A4380ForCosForm, P03NT4_n4380ForCosForm, P03NT4_A7537ForOpNum, P03NT4_n7537ForOpNum, P03NT4_A6379ForNomCli2, P03NT4_n6379ForNomCli2
            }
            , new Object[] {
            P03NT5_A396EmprCod, P03NT5_A831TipColCod, P03NT5_A483ForColNum, P03NT5_A482ForColNom, P03NT5_A494ForSer, P03NT5_A252CliCod, P03NT5_A764ProForCod, P03NT5_A1160ProForL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03NT8_A396EmprCod, P03NT8_A486ForNumCol, P03NT8_A719PrdNum, P03NT8_A481ForCan, P03NT8_A488ForPrdDsc, P03NT8_n488ForPrdDsc, P03NT8_A490ForPrdUMe, P03NT8_A309ColLin
            }
            , new Object[] {
            }
            , new Object[] {
            P03NT10_A396EmprCod, P03NT10_A486ForNumCol, P03NT10_A719PrdNum, P03NT10_A487ForPrdCan, P03NT10_A488ForPrdDsc, P03NT10_n488ForPrdDsc, P03NT10_A490ForPrdUMe, P03NT10_A489ForPrdNor, P03NT10_A715PrdLin
            }
            , new Object[] {
            }
         }
      );
      AV137Pgmname = "GestionLaboratorio.PENS009d" ;
      /* GeneXus formulas. */
      AV137Pgmname = "GestionLaboratorio.PENS009d" ;
      Gx_err = (short)(0) ;
   }

   private byte AV67F_cformu ;
   private byte AV68F_ldform ;
   private byte AV69F_lprfor ;
   private byte AV85HdrLab ;
   private byte AV86Pervafil ;
   private byte AV87Tinamar ;
   private byte AV88Carvema ;
   private byte AV91ProLab ;
   private byte AV92EnsPrf ;
   private byte AV93Hss ;
   private byte AV101Hidro ;
   private byte AV115Magosa ;
   private byte AV118Texfina ;
   private byte AV120HilasaLote ;
   private byte AV122Filasur ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV116LB_NUMOP ;
   private byte AV117LB_NUMAUX ;
   private byte A5718Lb_numop ;
   private byte A7395Lb_NumAux ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV75TipColCod ;
   private byte AV89IntCod ;
   private byte A7537ForOpNum ;
   private byte A490ForPrdUMe ;
   private short A626MatCod ;
   private short A5535Lb_TipArt ;
   private short AV94MatCod ;
   private short AV104Lb_TipArt ;
   private short A651ObsUltLin ;
   private short AV112OBSULTLIN ;
   private short AV127nprocesos ;
   private short A1160ProForL ;
   private short A309ColLin ;
   private short AV125colorantes ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int AV81Num_col ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int A5539Lb_ColNumC ;
   private int AV71CliCod ;
   private int AV74ForColNum ;
   private int AV97Lb_numero ;
   private int AV100Lb_ColNumC ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int A3315ForNumArc ;
   private int A1192ForNumCli ;
   private int AV61ForNumCol ;
   private long AV70Lb_rgb ;
   private java.math.BigDecimal AV64Lb_costeE ;
   private java.math.BigDecimal AV82Lb_preKg ;
   private java.math.BigDecimal A5989Lb_PreKg ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV95Lb_Rb ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private String A396EmprCod ;
   private String AV63Lb_opcion ;
   private String AV105ForPro ;
   private String AV79Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV80EmprNom ;
   private String GXv_char3[] ;
   private String AV78Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String A5533Lb_ArtCod ;
   private String A5536Lb_ColNom ;
   private String A1514MacProCod ;
   private String A5540Lb_Cartaz ;
   private String A5538Lb_ColNomC ;
   private String A7780Lb_Hila ;
   private String AV72ForSer ;
   private String AV73ForColNom ;
   private String AV90MacProcod ;
   private String AV96Lb_Cartaz ;
   private String AV99Lb_ColNomC ;
   private String AV121Lb_hila ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A3560ForOpcCli ;
   private String A1191ForNomCli ;
   private String A995ForTonal ;
   private String A6379ForNomCli2 ;
   private String A764ProForCod ;
   private String AV137Pgmname ;
   private String A719PrdNum ;
   private String A488ForPrdDsc ;
   private java.util.Date AV62Lb_fechaR ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV119lb_fechae ;
   private java.util.Date A3558ForFecApr ;
   private boolean n831TipColCod ;
   private boolean n583IntCod ;
   private boolean n626MatCod ;
   private boolean n1514MacProCod ;
   private boolean returnInSub ;
   private boolean n651ObsUltLin ;
   private boolean n3558ForFecApr ;
   private boolean n3560ForOpcCli ;
   private boolean n3315ForNumArc ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n995ForTonal ;
   private boolean n4380ForCosForm ;
   private boolean n7537ForOpNum ;
   private boolean n6379ForNomCli2 ;
   private boolean n488ForPrdDsc ;
   private String A12731Lb_ObsFac ;
   private String AV124Lb_obsfac ;
   private String AV130Json_Inc_Obs ;
   private String[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private long[] aP5 ;
   private byte[] aP6 ;
   private byte[] aP7 ;
   private byte[] aP8 ;
   private int[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P03NT2_A396EmprCod ;
   private int[] P03NT2_A5532Lb_numero ;
   private String[] P03NT2_A5555Lb_opcion ;
   private java.math.BigDecimal[] P03NT2_A5989Lb_PreKg ;
   private byte[] P03NT2_A5718Lb_numop ;
   private byte[] P03NT2_A7395Lb_NumAux ;
   private String[] P03NT2_A12731Lb_ObsFac ;
   private String[] P03NT3_A396EmprCod ;
   private int[] P03NT3_A5532Lb_numero ;
   private int[] P03NT3_A252CliCod ;
   private String[] P03NT3_A5533Lb_ArtCod ;
   private String[] P03NT3_A5536Lb_ColNom ;
   private int[] P03NT3_A5537Lb_ColNum ;
   private byte[] P03NT3_A831TipColCod ;
   private boolean[] P03NT3_n831TipColCod ;
   private byte[] P03NT3_A583IntCod ;
   private boolean[] P03NT3_n583IntCod ;
   private short[] P03NT3_A626MatCod ;
   private boolean[] P03NT3_n626MatCod ;
   private String[] P03NT3_A1514MacProCod ;
   private boolean[] P03NT3_n1514MacProCod ;
   private java.math.BigDecimal[] P03NT3_A5547Lb_Rb ;
   private String[] P03NT3_A5540Lb_Cartaz ;
   private String[] P03NT3_A5538Lb_ColNomC ;
   private int[] P03NT3_A5539Lb_ColNumC ;
   private short[] P03NT3_A5535Lb_TipArt ;
   private java.util.Date[] P03NT3_A5541Lb_FechaE ;
   private String[] P03NT3_A7780Lb_Hila ;
   private String[] P03NT4_A396EmprCod ;
   private byte[] P03NT4_A831TipColCod ;
   private boolean[] P03NT4_n831TipColCod ;
   private int[] P03NT4_A483ForColNum ;
   private String[] P03NT4_A482ForColNom ;
   private String[] P03NT4_A494ForSer ;
   private int[] P03NT4_A252CliCod ;
   private int[] P03NT4_A486ForNumCol ;
   private short[] P03NT4_A651ObsUltLin ;
   private boolean[] P03NT4_n651ObsUltLin ;
   private java.util.Date[] P03NT4_A3558ForFecApr ;
   private boolean[] P03NT4_n3558ForFecApr ;
   private String[] P03NT4_A3560ForOpcCli ;
   private boolean[] P03NT4_n3560ForOpcCli ;
   private byte[] P03NT4_A583IntCod ;
   private boolean[] P03NT4_n583IntCod ;
   private String[] P03NT4_A1514MacProCod ;
   private boolean[] P03NT4_n1514MacProCod ;
   private int[] P03NT4_A3315ForNumArc ;
   private boolean[] P03NT4_n3315ForNumArc ;
   private String[] P03NT4_A1191ForNomCli ;
   private boolean[] P03NT4_n1191ForNomCli ;
   private int[] P03NT4_A1192ForNumCli ;
   private boolean[] P03NT4_n1192ForNumCli ;
   private String[] P03NT4_A995ForTonal ;
   private boolean[] P03NT4_n995ForTonal ;
   private java.math.BigDecimal[] P03NT4_A4380ForCosForm ;
   private boolean[] P03NT4_n4380ForCosForm ;
   private byte[] P03NT4_A7537ForOpNum ;
   private boolean[] P03NT4_n7537ForOpNum ;
   private String[] P03NT4_A6379ForNomCli2 ;
   private boolean[] P03NT4_n6379ForNomCli2 ;
   private String[] P03NT5_A396EmprCod ;
   private byte[] P03NT5_A831TipColCod ;
   private boolean[] P03NT5_n831TipColCod ;
   private int[] P03NT5_A483ForColNum ;
   private String[] P03NT5_A482ForColNom ;
   private String[] P03NT5_A494ForSer ;
   private int[] P03NT5_A252CliCod ;
   private String[] P03NT5_A764ProForCod ;
   private short[] P03NT5_A1160ProForL ;
   private String[] P03NT8_A396EmprCod ;
   private int[] P03NT8_A486ForNumCol ;
   private String[] P03NT8_A719PrdNum ;
   private java.math.BigDecimal[] P03NT8_A481ForCan ;
   private String[] P03NT8_A488ForPrdDsc ;
   private boolean[] P03NT8_n488ForPrdDsc ;
   private byte[] P03NT8_A490ForPrdUMe ;
   private short[] P03NT8_A309ColLin ;
   private String[] P03NT10_A396EmprCod ;
   private int[] P03NT10_A486ForNumCol ;
   private String[] P03NT10_A719PrdNum ;
   private java.math.BigDecimal[] P03NT10_A487ForPrdCan ;
   private String[] P03NT10_A488ForPrdDsc ;
   private boolean[] P03NT10_n488ForPrdDsc ;
   private byte[] P03NT10_A490ForPrdUMe ;
   private short[] P03NT10_A489ForPrdNor ;
   private short[] P03NT10_A715PrdLin ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV128Col_Inc_Obs ;
   private app.SdtIncidenciasObservaciones_SDT AV129Item_Col_Inc_Obs ;
}

final  class pens009d__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03NT2", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_PreKg, Lb_numop, Lb_NumAux, Lb_ObsFac FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03NT3", "SELECT EmprCod, Lb_numero, CliCod, Lb_ArtCod, Lb_ColNom, Lb_ColNum, TipColCod, IntCod, MatCod, MacProCod, Lb_Rb, Lb_Cartaz, Lb_ColNomC, Lb_ColNumC, Lb_TipArt, Lb_FechaE, Lb_Hila FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03NT4", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol, ObsUltLin, ForFecApr, ForOpcCli, IntCod, MacProCod, ForNumArc, ForNomCli, ForNumCli, ForTonal, ForCosForm, ForOpNum, ForNomCli2 FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03NT5", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ProForCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03NT6", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new UpdateCursor("P03NT7", "UPDATE TXPCFORMU SET ForFecApr=?, ForOpcCli=?, IntCod=?, MacProCod=?, ForNumArc=?, ForNomCli=?, ForNumCli=?, ForTonal=?, ForCosForm=?, ForOpNum=?, ForNomCli2=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
         ,new ForEachCursor("P03NT8", "SELECT T1.EmprCod, T1.ForNumCol, T1.PrdNum, T1.ForCan, T2.ForPrdDsc, T1.ForPrdUMe, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03NT9", "DELETE FROM TXPLDFORM  WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
         ,new ForEachCursor("P03NT10", "SELECT T1.EmprCod, T1.ForNumCol, T1.PrdNum, T1.ForPrdCan, T2.ForPrdDsc, T1.ForPrdUMe, T1.ForPrdNor, T1.PrdLin FROM (TXPLPRFOR T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.PrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03NT11", "DELETE FROM TXPLPRFOR  WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRFOR")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[15])[0] = rslt.getString(12, 20);
               ((String[]) buf[16])[0] = rslt.getString(13, 13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(16);
               ((String[]) buf[20])[0] = rslt.getString(17, 20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(18);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 13);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 5);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 20);
               }
               stmt.setString(12, (String)parms[22], 3);
               stmt.setInt(13, ((Number) parms[23]).intValue());
               stmt.setString(14, (String)parms[24], 16);
               stmt.setString(15, (String)parms[25], 13);
               stmt.setInt(16, ((Number) parms[26]).intValue());
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[28]).byteValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

