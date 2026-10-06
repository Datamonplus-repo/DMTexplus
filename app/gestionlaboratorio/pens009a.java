package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens009a extends GXProcedure
{
   public pens009a( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens009a.class ), "" );
   }

   public pens009a( int remoteHandle ,
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
      pens009a.this.aP10 = new String[] {""};
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
      pens009a.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens009a.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens009a.this.AV63Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens009a.this.AV62Lb_fechaR = aP3[0];
      this.aP3 = aP3;
      pens009a.this.AV64Lb_costeE = aP4[0];
      this.aP4 = aP4;
      pens009a.this.AV70Lb_rgb = aP5[0];
      this.aP5 = aP5;
      pens009a.this.AV67F_cformu = aP6[0];
      this.aP6 = aP6;
      pens009a.this.AV68F_ldform = aP7[0];
      this.aP7 = aP7;
      pens009a.this.AV69F_lprfor = aP8[0];
      this.aP8 = aP8;
      pens009a.this.AV81Num_col = aP9[0];
      this.aP9 = aP9;
      pens009a.this.AV105ForPro = aP10[0];
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
      pens009a.this.GXt_char1 = GXv_char2[0] ;
      AV79Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV80EmprNom ;
      GXv_char4[0] = AV78Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char2, GXv_char3, GXv_char4) ;
      pens009a.this.A396EmprCod = GXv_char2[0] ;
      pens009a.this.AV80EmprNom = GXv_char3[0] ;
      pens009a.this.AV78Usurcod = GXv_char4[0] ;
      GXt_int5 = AV85HdrLab ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRLAB", ""), GXv_int6) ;
      pens009a.this.GXt_int5 = GXv_int6[0] ;
      AV85HdrLab = GXt_int5 ;
      GXt_int5 = AV86Pervafil ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int6) ;
      pens009a.this.GXt_int5 = GXv_int6[0] ;
      AV86Pervafil = GXt_int5 ;
      GXt_int5 = AV87Tinamar ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      pens009a.this.GXt_int5 = GXv_int6[0] ;
      AV87Tinamar = GXt_int5 ;
      GXt_int5 = AV88Carvema ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      pens009a.this.GXt_int5 = GXv_int6[0] ;
      AV88Carvema = GXt_int5 ;
      GXt_int5 = AV91ProLab ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PROLAB", ""), GXv_int6) ;
      pens009a.this.GXt_int5 = GXv_int6[0] ;
      AV91ProLab = GXt_int5 ;
      GXt_int5 = AV92EnsPrf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENSPRF", ""), GXv_int6) ;
      pens009a.this.GXt_int5 = GXv_int6[0] ;
      AV92EnsPrf = GXt_int5 ;
      GXt_int5 = AV93Hss ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int6) ;
      pens009a.this.GXt_int5 = GXv_int6[0] ;
      AV93Hss = GXt_int5 ;
      GXt_int5 = AV101Hidro ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HIDRO", ""), GXv_int6) ;
      pens009a.this.GXt_int5 = GXv_int6[0] ;
      AV101Hidro = GXt_int5 ;
      GXt_int5 = AV115Magosa ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int6) ;
      pens009a.this.GXt_int5 = GXv_int6[0] ;
      AV115Magosa = GXt_int5 ;
      GXt_int5 = AV118Texfina ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int6) ;
      pens009a.this.GXt_int5 = GXv_int6[0] ;
      AV118Texfina = GXt_int5 ;
      GXt_int5 = AV120HilasaLote ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HILLOT", ""), GXv_int6) ;
      pens009a.this.GXt_int5 = GXv_int6[0] ;
      AV120HilasaLote = GXt_int5 ;
      GXt_int5 = AV122Filasur ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FILASU", ""), GXv_int6) ;
      pens009a.this.GXt_int5 = GXv_int6[0] ;
      AV122Filasur = GXt_int5 ;
      AV82Lb_preKg = DecimalUtil.doubleToDec(0) ;
      AV116LB_NUMOP = (byte)(0) ;
      AV117LB_NUMAUX = (byte)(0) ;
      /* Using cursor P03NU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV63Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5555Lb_opcion = P03NU2_A5555Lb_opcion[0] ;
         A5989Lb_PreKg = P03NU2_A5989Lb_PreKg[0] ;
         A5718Lb_numop = P03NU2_A5718Lb_numop[0] ;
         A7395Lb_NumAux = P03NU2_A7395Lb_NumAux[0] ;
         A12731Lb_ObsFac = P03NU2_A12731Lb_ObsFac[0] ;
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
      /* Using cursor P03NU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P03NU3_A252CliCod[0] ;
         A5533Lb_ArtCod = P03NU3_A5533Lb_ArtCod[0] ;
         A5536Lb_ColNom = P03NU3_A5536Lb_ColNom[0] ;
         A5537Lb_ColNum = P03NU3_A5537Lb_ColNum[0] ;
         A831TipColCod = P03NU3_A831TipColCod[0] ;
         n831TipColCod = P03NU3_n831TipColCod[0] ;
         A583IntCod = P03NU3_A583IntCod[0] ;
         n583IntCod = P03NU3_n583IntCod[0] ;
         A626MatCod = P03NU3_A626MatCod[0] ;
         n626MatCod = P03NU3_n626MatCod[0] ;
         A1514MacProCod = P03NU3_A1514MacProCod[0] ;
         n1514MacProCod = P03NU3_n1514MacProCod[0] ;
         A5547Lb_Rb = P03NU3_A5547Lb_Rb[0] ;
         A5540Lb_Cartaz = P03NU3_A5540Lb_Cartaz[0] ;
         A5538Lb_ColNomC = P03NU3_A5538Lb_ColNomC[0] ;
         A5539Lb_ColNumC = P03NU3_A5539Lb_ColNumC[0] ;
         A5535Lb_TipArt = P03NU3_A5535Lb_TipArt[0] ;
         A5541Lb_FechaE = P03NU3_A5541Lb_FechaE[0] ;
         A7780Lb_Hila = P03NU3_A7780Lb_Hila[0] ;
         W396EmprCod = A396EmprCod ;
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
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV87Tinamar == 1 ) || ( AV88Carvema == 1 ) || ( AV92EnsPrf == 1 ) )
         {
            AV66i = (short)(10) ;
            /* Using cursor P03NU4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A5553Lb_ForCod = P03NU4_A5553Lb_ForCod[0] ;
               A5551Lb_lineaPq = P03NU4_A5551Lb_lineaPq[0] ;
               W396EmprCod = A396EmprCod ;
               AV83Lb_ForCod = A5553Lb_ForCod ;
               AV84Lb_ProFor = A5553Lb_ForCod ;
               if ( AV91ProLab == 1 )
               {
                  /* Execute user subroutine: 'PROCESO' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(1);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               /*
                  INSERT RECORD ON TABLE TXPLFORMU

               */
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W831TipColCod = A831TipColCod ;
               n831TipColCod = false ;
               A494ForSer = A5533Lb_ArtCod ;
               A482ForColNom = A5536Lb_ColNom ;
               A483ForColNum = AV81Num_col ;
               n831TipColCod = false ;
               A1160ProForL = AV66i ;
               A764ProForCod = AV84Lb_ProFor ;
               A6549ProForFR = httpContext.getMessage( "R", "") ;
               /* Using cursor P03NU5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL), A764ProForCod, A6549ProForFR});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
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
               A252CliCod = W252CliCod ;
               A831TipColCod = W831TipColCod ;
               n831TipColCod = false ;
               /* End Insert */
               AV66i = (short)(AV66i+10) ;
               AV123Inc_obs = httpContext.getMessage( "Alta despues Delete LFORMU", "") + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "N Ensayo = ", "") + GXutil.str( A5532Lb_numero, 8, 0) + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Cliente  = ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Articulo = ", "") + A5533Lb_ArtCod + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Color    = ", "") + A5536Lb_ColNom + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Numero   = ", "") + GXutil.str( A5537Lb_ColNum, 6, 0) + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Tc       = ", "") + GXutil.str( A831TipColCod, 2, 0) + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Proceso  = ", "") + AV84Lb_ProFor ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV130Pgmname, AV78Usurcod, AV79Station, AV123Inc_obs, A5532Lb_numero, (byte)(0), " ") ;
               A396EmprCod = W396EmprCod ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         /* Using cursor P03NU6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV63Lb_opcion});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A5555Lb_opcion = P03NU6_A5555Lb_opcion[0] ;
            A5556Lb_UltLC = P03NU6_A5556Lb_UltLC[0] ;
            A5559Lb_UltlP = P03NU6_A5559Lb_UltlP[0] ;
            AV76Lb_ultlc = A5556Lb_UltLC ;
            AV77Lb_ultlp = A5559Lb_UltlP ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         /* Optimized UPDATE. */
         /* Using cursor P03NU7 */
         short AV77Lb_ultlp741Aux;
         AV77Lb_ultlp741Aux = AV77Lb_ultlp ;
         short AV76Lb_ultlc310Aux;
         AV76Lb_ultlc310Aux = AV76Lb_ultlc ;
         pr_default.execute(5, new Object[] {Short.valueOf(AV77Lb_ultlp741Aux), Short.valueOf(AV76Lb_ultlc310Aux), A396EmprCod, Integer.valueOf(AV61ForNumCol)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
         /* End optimized UPDATE. */
         /* Using cursor P03NU8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV63Lb_opcion});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A5557Lb_LineaC = P03NU8_A5557Lb_LineaC[0] ;
            A5558LB_CantC = P03NU8_A5558LB_CantC[0] ;
            A490ForPrdUMe = P03NU8_A490ForPrdUMe[0] ;
            A719PrdNum = P03NU8_A719PrdNum[0] ;
            A5555Lb_opcion = P03NU8_A5555Lb_opcion[0] ;
            A488ForPrdDsc = P03NU8_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P03NU8_n488ForPrdDsc[0] ;
            A488ForPrdDsc = P03NU8_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P03NU8_n488ForPrdDsc[0] ;
            W396EmprCod = A396EmprCod ;
            if ( A5558LB_CantC.doubleValue() == 0 )
            {
            }
            else
            {
               /*
                  INSERT RECORD ON TABLE TXPLDFORM

               */
               W396EmprCod = A396EmprCod ;
               W719PrdNum = A719PrdNum ;
               W490ForPrdUMe = A490ForPrdUMe ;
               A486ForNumCol = AV61ForNumCol ;
               A309ColLin = A5557Lb_LineaC ;
               A481ForCan = A5558LB_CantC ;
               /* Using cursor P03NU9 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A481ForCan});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
               if ( (pr_default.getStatus(7) == 1) )
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
               A719PrdNum = W719PrdNum ;
               A490ForPrdUMe = W490ForPrdUMe ;
               /* End Insert */
               AV123Inc_obs = httpContext.getMessage( "Alta despues Delete LDFORM", "") + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "N Ensayo = ", "") + GXutil.str( A5532Lb_numero, 8, 0) + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Opcion   = ", "") + AV63Lb_opcion + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "N Formula= ", "") + GXutil.str( AV61ForNumCol, 8, 0) + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Prdnum   = ", "") + A719PrdNum + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Cant     = ", "") + GXutil.str( A5558LB_CantC, 11, 5) + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Unidad   = ", "") + GXutil.str( A490ForPrdUMe, 1, 0) + " " + GXutil.trim( A488ForPrdDsc) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV130Pgmname, AV78Usurcod, AV79Station, AV123Inc_obs, A5532Lb_numero, (byte)(0), " ") ;
            }
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         /* Using cursor P03NU10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV63Lb_opcion});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A5560Lb_LineaPr = P03NU10_A5560Lb_LineaPr[0] ;
            A5561LB_CantP = P03NU10_A5561LB_CantP[0] ;
            A5562Lb_orden = P03NU10_A5562Lb_orden[0] ;
            A490ForPrdUMe = P03NU10_A490ForPrdUMe[0] ;
            A719PrdNum = P03NU10_A719PrdNum[0] ;
            A5555Lb_opcion = P03NU10_A5555Lb_opcion[0] ;
            A488ForPrdDsc = P03NU10_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P03NU10_n488ForPrdDsc[0] ;
            A488ForPrdDsc = P03NU10_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P03NU10_n488ForPrdDsc[0] ;
            W396EmprCod = A396EmprCod ;
            if ( A5561LB_CantP.doubleValue() == 0 )
            {
            }
            else
            {
               /*
                  INSERT RECORD ON TABLE TXPLPRFOR

               */
               W396EmprCod = A396EmprCod ;
               W719PrdNum = A719PrdNum ;
               W490ForPrdUMe = A490ForPrdUMe ;
               A486ForNumCol = AV61ForNumCol ;
               A715PrdLin = A5560Lb_LineaPr ;
               A487ForPrdCan = A5561LB_CantP ;
               A489ForPrdNor = A5562Lb_orden ;
               /* Using cursor P03NU11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin), A719PrdNum, A487ForPrdCan, Byte.valueOf(A490ForPrdUMe), Short.valueOf(A489ForPrdNor)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
               if ( (pr_default.getStatus(9) == 1) )
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
               A719PrdNum = W719PrdNum ;
               A490ForPrdUMe = W490ForPrdUMe ;
               /* End Insert */
               AV123Inc_obs = httpContext.getMessage( "Alta despues Delete LPRFOR", "") + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "N Ensayo = ", "") + GXutil.str( A5532Lb_numero, 8, 0) + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Opcion   = ", "") + AV63Lb_opcion + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "N Formula= ", "") + GXutil.str( AV61ForNumCol, 8, 0) + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Prdnum   = ", "") + A719PrdNum + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Cant     = ", "") + GXutil.str( A5561LB_CantP, 11, 5) + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Unidad   = ", "") + GXutil.str( A490ForPrdUMe, 1, 0) + " " + GXutil.trim( A488ForPrdDsc) + GXutil.newLine( ) ;
               AV123Inc_obs += httpContext.getMessage( "Orden    = ", "") + GXutil.str( A5562Lb_orden, 4, 0) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV130Pgmname, AV78Usurcod, AV79Station, AV123Inc_obs, A5532Lb_numero, (byte)(0), " ") ;
            }
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'PROCESO' Routine */
      returnInSub = false ;
      AV84Lb_ProFor = "" ;
      /* Using cursor P03NU12 */
      pr_default.execute(10, new Object[] {A396EmprCod, AV83Lb_ForCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A6061ProForLab = P03NU12_A6061ProForLab[0] ;
         A764ProForCod = P03NU12_A764ProForCod[0] ;
         if ( GXutil.strcmp(A764ProForCod, A6061ProForLab) != 0 )
         {
            AV84Lb_ProFor = A764ProForCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(10);
      }
      pr_default.close(10);
      if ( (GXutil.strcmp("", AV84Lb_ProFor)==0) )
      {
         AV84Lb_ProFor = AV83Lb_ForCod ;
      }
   }

   public void S121( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      /* Using cursor P03NU13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV71CliCod), AV72ForSer, AV73ForColNom, Integer.valueOf(AV74ForColNum), Byte.valueOf(AV75TipColCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A831TipColCod = P03NU13_A831TipColCod[0] ;
         n831TipColCod = P03NU13_n831TipColCod[0] ;
         A483ForColNum = P03NU13_A483ForColNum[0] ;
         A482ForColNom = P03NU13_A482ForColNom[0] ;
         A494ForSer = P03NU13_A494ForSer[0] ;
         A252CliCod = P03NU13_A252CliCod[0] ;
         A486ForNumCol = P03NU13_A486ForNumCol[0] ;
         A651ObsUltLin = P03NU13_A651ObsUltLin[0] ;
         n651ObsUltLin = P03NU13_n651ObsUltLin[0] ;
         A3558ForFecApr = P03NU13_A3558ForFecApr[0] ;
         n3558ForFecApr = P03NU13_n3558ForFecApr[0] ;
         A3560ForOpcCli = P03NU13_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P03NU13_n3560ForOpcCli[0] ;
         A583IntCod = P03NU13_A583IntCod[0] ;
         n583IntCod = P03NU13_n583IntCod[0] ;
         A1514MacProCod = P03NU13_A1514MacProCod[0] ;
         n1514MacProCod = P03NU13_n1514MacProCod[0] ;
         A2838ForRelBan = P03NU13_A2838ForRelBan[0] ;
         n2838ForRelBan = P03NU13_n2838ForRelBan[0] ;
         A995ForTonal = P03NU13_A995ForTonal[0] ;
         n995ForTonal = P03NU13_n995ForTonal[0] ;
         A626MatCod = P03NU13_A626MatCod[0] ;
         n626MatCod = P03NU13_n626MatCod[0] ;
         A4339ForRGB = P03NU13_A4339ForRGB[0] ;
         n4339ForRGB = P03NU13_n4339ForRGB[0] ;
         A4380ForCosForm = P03NU13_A4380ForCosForm[0] ;
         n4380ForCosForm = P03NU13_n4380ForCosForm[0] ;
         A492ForPreKgm = P03NU13_A492ForPreKgm[0] ;
         n492ForPreKgm = P03NU13_n492ForPreKgm[0] ;
         A12732ForObsFac = P03NU13_A12732ForObsFac[0] ;
         n12732ForObsFac = P03NU13_n12732ForObsFac[0] ;
         A3315ForNumArc = P03NU13_A3315ForNumArc[0] ;
         n3315ForNumArc = P03NU13_n3315ForNumArc[0] ;
         A1191ForNomCli = P03NU13_A1191ForNomCli[0] ;
         n1191ForNomCli = P03NU13_n1191ForNomCli[0] ;
         A1192ForNumCli = P03NU13_A1192ForNumCli[0] ;
         n1192ForNumCli = P03NU13_n1192ForNumCli[0] ;
         A7537ForOpNum = P03NU13_A7537ForOpNum[0] ;
         n7537ForOpNum = P03NU13_n7537ForOpNum[0] ;
         A6379ForNomCli2 = P03NU13_A6379ForNomCli2[0] ;
         n6379ForNomCli2 = P03NU13_n6379ForNomCli2[0] ;
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
         if ( AV93Hss == 1 )
         {
            A3558ForFecApr = AV62Lb_fechaR ;
            n3558ForFecApr = false ;
            A2838ForRelBan = AV95Lb_Rb ;
            n2838ForRelBan = false ;
            A995ForTonal = AV96Lb_Cartaz ;
            n995ForTonal = false ;
            A583IntCod = AV89IntCod ;
            n583IntCod = false ;
            A626MatCod = AV94MatCod ;
            n626MatCod = false ;
            A4339ForRGB = AV70Lb_rgb ;
            n4339ForRGB = false ;
            A4380ForCosForm = AV64Lb_costeE ;
            n4380ForCosForm = false ;
            A492ForPreKgm = AV82Lb_preKg ;
            n492ForPreKgm = false ;
            A12732ForObsFac = AV124Lb_obsfac ;
            n12732ForObsFac = false ;
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
         AV123Inc_obs = httpContext.getMessage( "Update despues Delete CFORMU", "") + GXutil.newLine( ) ;
         AV123Inc_obs += httpContext.getMessage( "Cliente  = ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) ;
         AV123Inc_obs += httpContext.getMessage( "Articulo = ", "") + A494ForSer + GXutil.newLine( ) ;
         AV123Inc_obs += httpContext.getMessage( "Color    = ", "") + A482ForColNom + GXutil.newLine( ) ;
         AV123Inc_obs += httpContext.getMessage( "Numero   = ", "") + GXutil.str( A483ForColNum, 6, 0) + GXutil.newLine( ) ;
         AV123Inc_obs += httpContext.getMessage( "Tc       = ", "") + GXutil.str( A831TipColCod, 2, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV130Pgmname, AV78Usurcod, AV79Station, AV123Inc_obs, A486ForNumCol, (byte)(0), " ") ;
         /* Using cursor P03NU14 */
         pr_default.execute(12, new Object[] {Boolean.valueOf(n3558ForFecApr), A3558ForFecApr, Boolean.valueOf(n3560ForOpcCli), A3560ForOpcCli, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n1514MacProCod), A1514MacProCod, Boolean.valueOf(n2838ForRelBan), A2838ForRelBan, Boolean.valueOf(n995ForTonal), A995ForTonal, Boolean.valueOf(n626MatCod), Short.valueOf(A626MatCod), Boolean.valueOf(n4339ForRGB), Long.valueOf(A4339ForRGB), Boolean.valueOf(n4380ForCosForm), A4380ForCosForm, Boolean.valueOf(n492ForPreKgm), A492ForPreKgm, Boolean.valueOf(n12732ForObsFac), A12732ForObsFac, Boolean.valueOf(n3315ForNumArc), Integer.valueOf(A3315ForNumArc), Boolean.valueOf(n1191ForNomCli), A1191ForNomCli, Boolean.valueOf(n1192ForNumCli), Integer.valueOf(A1192ForNumCli), Boolean.valueOf(n7537ForOpNum), Byte.valueOf(A7537ForOpNum), Boolean.valueOf(n6379ForNomCli2), A6379ForNomCli2, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens009a.this.A396EmprCod;
      this.aP1[0] = pens009a.this.A5532Lb_numero;
      this.aP2[0] = pens009a.this.AV63Lb_opcion;
      this.aP3[0] = pens009a.this.AV62Lb_fechaR;
      this.aP4[0] = pens009a.this.AV64Lb_costeE;
      this.aP5[0] = pens009a.this.AV70Lb_rgb;
      this.aP6[0] = pens009a.this.AV67F_cformu;
      this.aP7[0] = pens009a.this.AV68F_ldform;
      this.aP8[0] = pens009a.this.AV69F_lprfor;
      this.aP9[0] = pens009a.this.AV81Num_col;
      this.aP10[0] = pens009a.this.AV105ForPro;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens009a");
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
      P03NU2_A396EmprCod = new String[] {""} ;
      P03NU2_A5532Lb_numero = new int[1] ;
      P03NU2_A5555Lb_opcion = new String[] {""} ;
      P03NU2_A5989Lb_PreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NU2_A5718Lb_numop = new byte[1] ;
      P03NU2_A7395Lb_NumAux = new byte[1] ;
      P03NU2_A12731Lb_ObsFac = new String[] {""} ;
      A5555Lb_opcion = "" ;
      A5989Lb_PreKg = DecimalUtil.ZERO ;
      A12731Lb_ObsFac = "" ;
      AV124Lb_obsfac = "" ;
      P03NU3_A396EmprCod = new String[] {""} ;
      P03NU3_A5532Lb_numero = new int[1] ;
      P03NU3_A252CliCod = new int[1] ;
      P03NU3_A5533Lb_ArtCod = new String[] {""} ;
      P03NU3_A5536Lb_ColNom = new String[] {""} ;
      P03NU3_A5537Lb_ColNum = new int[1] ;
      P03NU3_A831TipColCod = new byte[1] ;
      P03NU3_n831TipColCod = new boolean[] {false} ;
      P03NU3_A583IntCod = new byte[1] ;
      P03NU3_n583IntCod = new boolean[] {false} ;
      P03NU3_A626MatCod = new short[1] ;
      P03NU3_n626MatCod = new boolean[] {false} ;
      P03NU3_A1514MacProCod = new String[] {""} ;
      P03NU3_n1514MacProCod = new boolean[] {false} ;
      P03NU3_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NU3_A5540Lb_Cartaz = new String[] {""} ;
      P03NU3_A5538Lb_ColNomC = new String[] {""} ;
      P03NU3_A5539Lb_ColNumC = new int[1] ;
      P03NU3_A5535Lb_TipArt = new short[1] ;
      P03NU3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P03NU3_A7780Lb_Hila = new String[] {""} ;
      A5533Lb_ArtCod = "" ;
      A5536Lb_ColNom = "" ;
      A1514MacProCod = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5540Lb_Cartaz = "" ;
      A5538Lb_ColNomC = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A7780Lb_Hila = "" ;
      W396EmprCod = "" ;
      AV72ForSer = "" ;
      AV73ForColNom = "" ;
      AV90MacProcod = "" ;
      AV95Lb_Rb = DecimalUtil.ZERO ;
      AV96Lb_Cartaz = "" ;
      AV99Lb_ColNomC = "" ;
      AV119lb_fechae = GXutil.nullDate() ;
      AV121Lb_hila = "" ;
      P03NU4_A396EmprCod = new String[] {""} ;
      P03NU4_A5532Lb_numero = new int[1] ;
      P03NU4_A5553Lb_ForCod = new String[] {""} ;
      P03NU4_A5551Lb_lineaPq = new short[1] ;
      A5553Lb_ForCod = "" ;
      AV83Lb_ForCod = "" ;
      AV84Lb_ProFor = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A764ProForCod = "" ;
      A6549ProForFR = "" ;
      Gx_emsg = "" ;
      AV123Inc_obs = "" ;
      AV130Pgmname = "" ;
      P03NU6_A396EmprCod = new String[] {""} ;
      P03NU6_A5532Lb_numero = new int[1] ;
      P03NU6_A5555Lb_opcion = new String[] {""} ;
      P03NU6_A5556Lb_UltLC = new short[1] ;
      P03NU6_A5559Lb_UltlP = new short[1] ;
      P03NU8_A396EmprCod = new String[] {""} ;
      P03NU8_A5532Lb_numero = new int[1] ;
      P03NU8_A5557Lb_LineaC = new short[1] ;
      P03NU8_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NU8_A490ForPrdUMe = new byte[1] ;
      P03NU8_A719PrdNum = new String[] {""} ;
      P03NU8_A5555Lb_opcion = new String[] {""} ;
      P03NU8_A488ForPrdDsc = new String[] {""} ;
      P03NU8_n488ForPrdDsc = new boolean[] {false} ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A488ForPrdDsc = "" ;
      W719PrdNum = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      P03NU10_A396EmprCod = new String[] {""} ;
      P03NU10_A5532Lb_numero = new int[1] ;
      P03NU10_A5560Lb_LineaPr = new short[1] ;
      P03NU10_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NU10_A5562Lb_orden = new short[1] ;
      P03NU10_A490ForPrdUMe = new byte[1] ;
      P03NU10_A719PrdNum = new String[] {""} ;
      P03NU10_A5555Lb_opcion = new String[] {""} ;
      P03NU10_A488ForPrdDsc = new String[] {""} ;
      P03NU10_n488ForPrdDsc = new boolean[] {false} ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      P03NU12_A396EmprCod = new String[] {""} ;
      P03NU12_A6061ProForLab = new String[] {""} ;
      P03NU12_A764ProForCod = new String[] {""} ;
      A6061ProForLab = "" ;
      P03NU13_A396EmprCod = new String[] {""} ;
      P03NU13_A831TipColCod = new byte[1] ;
      P03NU13_n831TipColCod = new boolean[] {false} ;
      P03NU13_A483ForColNum = new int[1] ;
      P03NU13_A482ForColNom = new String[] {""} ;
      P03NU13_A494ForSer = new String[] {""} ;
      P03NU13_A252CliCod = new int[1] ;
      P03NU13_A486ForNumCol = new int[1] ;
      P03NU13_A651ObsUltLin = new short[1] ;
      P03NU13_n651ObsUltLin = new boolean[] {false} ;
      P03NU13_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P03NU13_n3558ForFecApr = new boolean[] {false} ;
      P03NU13_A3560ForOpcCli = new String[] {""} ;
      P03NU13_n3560ForOpcCli = new boolean[] {false} ;
      P03NU13_A583IntCod = new byte[1] ;
      P03NU13_n583IntCod = new boolean[] {false} ;
      P03NU13_A1514MacProCod = new String[] {""} ;
      P03NU13_n1514MacProCod = new boolean[] {false} ;
      P03NU13_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NU13_n2838ForRelBan = new boolean[] {false} ;
      P03NU13_A995ForTonal = new String[] {""} ;
      P03NU13_n995ForTonal = new boolean[] {false} ;
      P03NU13_A626MatCod = new short[1] ;
      P03NU13_n626MatCod = new boolean[] {false} ;
      P03NU13_A4339ForRGB = new long[1] ;
      P03NU13_n4339ForRGB = new boolean[] {false} ;
      P03NU13_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NU13_n4380ForCosForm = new boolean[] {false} ;
      P03NU13_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NU13_n492ForPreKgm = new boolean[] {false} ;
      P03NU13_A12732ForObsFac = new String[] {""} ;
      P03NU13_n12732ForObsFac = new boolean[] {false} ;
      P03NU13_A3315ForNumArc = new int[1] ;
      P03NU13_n3315ForNumArc = new boolean[] {false} ;
      P03NU13_A1191ForNomCli = new String[] {""} ;
      P03NU13_n1191ForNomCli = new boolean[] {false} ;
      P03NU13_A1192ForNumCli = new int[1] ;
      P03NU13_n1192ForNumCli = new boolean[] {false} ;
      P03NU13_A7537ForOpNum = new byte[1] ;
      P03NU13_n7537ForOpNum = new boolean[] {false} ;
      P03NU13_A6379ForNomCli2 = new String[] {""} ;
      P03NU13_n6379ForNomCli2 = new boolean[] {false} ;
      A3558ForFecApr = GXutil.nullDate() ;
      A3560ForOpcCli = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A995ForTonal = "" ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A12732ForObsFac = "" ;
      A1191ForNomCli = "" ;
      A6379ForNomCli2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens009a__default(),
         new Object[] {
             new Object[] {
            P03NU2_A396EmprCod, P03NU2_A5532Lb_numero, P03NU2_A5555Lb_opcion, P03NU2_A5989Lb_PreKg, P03NU2_A5718Lb_numop, P03NU2_A7395Lb_NumAux, P03NU2_A12731Lb_ObsFac
            }
            , new Object[] {
            P03NU3_A396EmprCod, P03NU3_A5532Lb_numero, P03NU3_A252CliCod, P03NU3_A5533Lb_ArtCod, P03NU3_A5536Lb_ColNom, P03NU3_A5537Lb_ColNum, P03NU3_A831TipColCod, P03NU3_n831TipColCod, P03NU3_A583IntCod, P03NU3_n583IntCod,
            P03NU3_A626MatCod, P03NU3_n626MatCod, P03NU3_A1514MacProCod, P03NU3_n1514MacProCod, P03NU3_A5547Lb_Rb, P03NU3_A5540Lb_Cartaz, P03NU3_A5538Lb_ColNomC, P03NU3_A5539Lb_ColNumC, P03NU3_A5535Lb_TipArt, P03NU3_A5541Lb_FechaE,
            P03NU3_A7780Lb_Hila
            }
            , new Object[] {
            P03NU4_A396EmprCod, P03NU4_A5532Lb_numero, P03NU4_A5553Lb_ForCod, P03NU4_A5551Lb_lineaPq
            }
            , new Object[] {
            }
            , new Object[] {
            P03NU6_A396EmprCod, P03NU6_A5532Lb_numero, P03NU6_A5555Lb_opcion, P03NU6_A5556Lb_UltLC, P03NU6_A5559Lb_UltlP
            }
            , new Object[] {
            }
            , new Object[] {
            P03NU8_A396EmprCod, P03NU8_A5532Lb_numero, P03NU8_A5557Lb_LineaC, P03NU8_A5558LB_CantC, P03NU8_A490ForPrdUMe, P03NU8_A719PrdNum, P03NU8_A5555Lb_opcion, P03NU8_A488ForPrdDsc, P03NU8_n488ForPrdDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P03NU10_A396EmprCod, P03NU10_A5532Lb_numero, P03NU10_A5560Lb_LineaPr, P03NU10_A5561LB_CantP, P03NU10_A5562Lb_orden, P03NU10_A490ForPrdUMe, P03NU10_A719PrdNum, P03NU10_A5555Lb_opcion, P03NU10_A488ForPrdDsc, P03NU10_n488ForPrdDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P03NU12_A396EmprCod, P03NU12_A6061ProForLab, P03NU12_A764ProForCod
            }
            , new Object[] {
            P03NU13_A396EmprCod, P03NU13_A831TipColCod, P03NU13_A483ForColNum, P03NU13_A482ForColNom, P03NU13_A494ForSer, P03NU13_A252CliCod, P03NU13_A486ForNumCol, P03NU13_A651ObsUltLin, P03NU13_n651ObsUltLin, P03NU13_A3558ForFecApr,
            P03NU13_n3558ForFecApr, P03NU13_A3560ForOpcCli, P03NU13_n3560ForOpcCli, P03NU13_A583IntCod, P03NU13_A1514MacProCod, P03NU13_n1514MacProCod, P03NU13_A2838ForRelBan, P03NU13_n2838ForRelBan, P03NU13_A995ForTonal, P03NU13_n995ForTonal,
            P03NU13_A626MatCod, P03NU13_A4339ForRGB, P03NU13_n4339ForRGB, P03NU13_A4380ForCosForm, P03NU13_n4380ForCosForm, P03NU13_A492ForPreKgm, P03NU13_n492ForPreKgm, P03NU13_A12732ForObsFac, P03NU13_n12732ForObsFac, P03NU13_A3315ForNumArc,
            P03NU13_n3315ForNumArc, P03NU13_A1191ForNomCli, P03NU13_n1191ForNomCli, P03NU13_A1192ForNumCli, P03NU13_n1192ForNumCli, P03NU13_A7537ForOpNum, P03NU13_n7537ForOpNum, P03NU13_A6379ForNomCli2, P03NU13_n6379ForNomCli2
            }
            , new Object[] {
            }
         }
      );
      AV130Pgmname = "GestionLaboratorio.PENS009a" ;
      /* GeneXus formulas. */
      AV130Pgmname = "GestionLaboratorio.PENS009a" ;
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
   private byte W831TipColCod ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private byte A7537ForOpNum ;
   private short A626MatCod ;
   private short A5535Lb_TipArt ;
   private short AV94MatCod ;
   private short AV104Lb_TipArt ;
   private short AV66i ;
   private short A5551Lb_lineaPq ;
   private short A1160ProForL ;
   private short Gx_err ;
   private short A5556Lb_UltLC ;
   private short A5559Lb_UltlP ;
   private short AV76Lb_ultlc ;
   private short AV77Lb_ultlp ;
   private short A741PrdUltLin ;
   private short A310ColUltLin ;
   private short A5557Lb_LineaC ;
   private short A309ColLin ;
   private short A5560Lb_LineaPr ;
   private short A5562Lb_orden ;
   private short A715PrdLin ;
   private short A489ForPrdNor ;
   private short A651ObsUltLin ;
   private short AV112OBSULTLIN ;
   private int A5532Lb_numero ;
   private int AV81Num_col ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int A5539Lb_ColNumC ;
   private int AV71CliCod ;
   private int AV74ForColNum ;
   private int AV97Lb_numero ;
   private int AV100Lb_ColNumC ;
   private int GX_INS154 ;
   private int W252CliCod ;
   private int A483ForColNum ;
   private int AV61ForNumCol ;
   private int GX_INS33 ;
   private int A486ForNumCol ;
   private int GX_INS82 ;
   private int A3315ForNumArc ;
   private int A1192ForNumCli ;
   private long AV70Lb_rgb ;
   private long A4339ForRGB ;
   private java.math.BigDecimal AV64Lb_costeE ;
   private java.math.BigDecimal AV82Lb_preKg ;
   private java.math.BigDecimal A5989Lb_PreKg ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV95Lb_Rb ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal A5561LB_CantP ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A492ForPreKgm ;
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
   private String W396EmprCod ;
   private String AV72ForSer ;
   private String AV73ForColNom ;
   private String AV90MacProcod ;
   private String AV96Lb_Cartaz ;
   private String AV99Lb_ColNomC ;
   private String AV121Lb_hila ;
   private String A5553Lb_ForCod ;
   private String AV83Lb_ForCod ;
   private String AV84Lb_ProFor ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A764ProForCod ;
   private String A6549ProForFR ;
   private String Gx_emsg ;
   private String AV130Pgmname ;
   private String A719PrdNum ;
   private String A488ForPrdDsc ;
   private String W719PrdNum ;
   private String A6061ProForLab ;
   private String A3560ForOpcCli ;
   private String A995ForTonal ;
   private String A1191ForNomCli ;
   private String A6379ForNomCli2 ;
   private java.util.Date AV62Lb_fechaR ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV119lb_fechae ;
   private java.util.Date A3558ForFecApr ;
   private boolean n831TipColCod ;
   private boolean n583IntCod ;
   private boolean n626MatCod ;
   private boolean n1514MacProCod ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private boolean n651ObsUltLin ;
   private boolean n3558ForFecApr ;
   private boolean n3560ForOpcCli ;
   private boolean n2838ForRelBan ;
   private boolean n995ForTonal ;
   private boolean n4339ForRGB ;
   private boolean n4380ForCosForm ;
   private boolean n492ForPreKgm ;
   private boolean n12732ForObsFac ;
   private boolean n3315ForNumArc ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n7537ForOpNum ;
   private boolean n6379ForNomCli2 ;
   private String A12731Lb_ObsFac ;
   private String AV124Lb_obsfac ;
   private String AV123Inc_obs ;
   private String A12732ForObsFac ;
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
   private String[] P03NU2_A396EmprCod ;
   private int[] P03NU2_A5532Lb_numero ;
   private String[] P03NU2_A5555Lb_opcion ;
   private java.math.BigDecimal[] P03NU2_A5989Lb_PreKg ;
   private byte[] P03NU2_A5718Lb_numop ;
   private byte[] P03NU2_A7395Lb_NumAux ;
   private String[] P03NU2_A12731Lb_ObsFac ;
   private String[] P03NU3_A396EmprCod ;
   private int[] P03NU3_A5532Lb_numero ;
   private int[] P03NU3_A252CliCod ;
   private String[] P03NU3_A5533Lb_ArtCod ;
   private String[] P03NU3_A5536Lb_ColNom ;
   private int[] P03NU3_A5537Lb_ColNum ;
   private byte[] P03NU3_A831TipColCod ;
   private boolean[] P03NU3_n831TipColCod ;
   private byte[] P03NU3_A583IntCod ;
   private boolean[] P03NU3_n583IntCod ;
   private short[] P03NU3_A626MatCod ;
   private boolean[] P03NU3_n626MatCod ;
   private String[] P03NU3_A1514MacProCod ;
   private boolean[] P03NU3_n1514MacProCod ;
   private java.math.BigDecimal[] P03NU3_A5547Lb_Rb ;
   private String[] P03NU3_A5540Lb_Cartaz ;
   private String[] P03NU3_A5538Lb_ColNomC ;
   private int[] P03NU3_A5539Lb_ColNumC ;
   private short[] P03NU3_A5535Lb_TipArt ;
   private java.util.Date[] P03NU3_A5541Lb_FechaE ;
   private String[] P03NU3_A7780Lb_Hila ;
   private String[] P03NU4_A396EmprCod ;
   private int[] P03NU4_A5532Lb_numero ;
   private String[] P03NU4_A5553Lb_ForCod ;
   private short[] P03NU4_A5551Lb_lineaPq ;
   private String[] P03NU6_A396EmprCod ;
   private int[] P03NU6_A5532Lb_numero ;
   private String[] P03NU6_A5555Lb_opcion ;
   private short[] P03NU6_A5556Lb_UltLC ;
   private short[] P03NU6_A5559Lb_UltlP ;
   private String[] P03NU8_A396EmprCod ;
   private int[] P03NU8_A5532Lb_numero ;
   private short[] P03NU8_A5557Lb_LineaC ;
   private java.math.BigDecimal[] P03NU8_A5558LB_CantC ;
   private byte[] P03NU8_A490ForPrdUMe ;
   private String[] P03NU8_A719PrdNum ;
   private String[] P03NU8_A5555Lb_opcion ;
   private String[] P03NU8_A488ForPrdDsc ;
   private boolean[] P03NU8_n488ForPrdDsc ;
   private String[] P03NU10_A396EmprCod ;
   private int[] P03NU10_A5532Lb_numero ;
   private short[] P03NU10_A5560Lb_LineaPr ;
   private java.math.BigDecimal[] P03NU10_A5561LB_CantP ;
   private short[] P03NU10_A5562Lb_orden ;
   private byte[] P03NU10_A490ForPrdUMe ;
   private String[] P03NU10_A719PrdNum ;
   private String[] P03NU10_A5555Lb_opcion ;
   private String[] P03NU10_A488ForPrdDsc ;
   private boolean[] P03NU10_n488ForPrdDsc ;
   private String[] P03NU12_A396EmprCod ;
   private String[] P03NU12_A6061ProForLab ;
   private String[] P03NU12_A764ProForCod ;
   private String[] P03NU13_A396EmprCod ;
   private byte[] P03NU13_A831TipColCod ;
   private boolean[] P03NU13_n831TipColCod ;
   private int[] P03NU13_A483ForColNum ;
   private String[] P03NU13_A482ForColNom ;
   private String[] P03NU13_A494ForSer ;
   private int[] P03NU13_A252CliCod ;
   private int[] P03NU13_A486ForNumCol ;
   private short[] P03NU13_A651ObsUltLin ;
   private boolean[] P03NU13_n651ObsUltLin ;
   private java.util.Date[] P03NU13_A3558ForFecApr ;
   private boolean[] P03NU13_n3558ForFecApr ;
   private String[] P03NU13_A3560ForOpcCli ;
   private boolean[] P03NU13_n3560ForOpcCli ;
   private byte[] P03NU13_A583IntCod ;
   private boolean[] P03NU13_n583IntCod ;
   private String[] P03NU13_A1514MacProCod ;
   private boolean[] P03NU13_n1514MacProCod ;
   private java.math.BigDecimal[] P03NU13_A2838ForRelBan ;
   private boolean[] P03NU13_n2838ForRelBan ;
   private String[] P03NU13_A995ForTonal ;
   private boolean[] P03NU13_n995ForTonal ;
   private short[] P03NU13_A626MatCod ;
   private boolean[] P03NU13_n626MatCod ;
   private long[] P03NU13_A4339ForRGB ;
   private boolean[] P03NU13_n4339ForRGB ;
   private java.math.BigDecimal[] P03NU13_A4380ForCosForm ;
   private boolean[] P03NU13_n4380ForCosForm ;
   private java.math.BigDecimal[] P03NU13_A492ForPreKgm ;
   private boolean[] P03NU13_n492ForPreKgm ;
   private String[] P03NU13_A12732ForObsFac ;
   private boolean[] P03NU13_n12732ForObsFac ;
   private int[] P03NU13_A3315ForNumArc ;
   private boolean[] P03NU13_n3315ForNumArc ;
   private String[] P03NU13_A1191ForNomCli ;
   private boolean[] P03NU13_n1191ForNomCli ;
   private int[] P03NU13_A1192ForNumCli ;
   private boolean[] P03NU13_n1192ForNumCli ;
   private byte[] P03NU13_A7537ForOpNum ;
   private boolean[] P03NU13_n7537ForOpNum ;
   private String[] P03NU13_A6379ForNomCli2 ;
   private boolean[] P03NU13_n6379ForNomCli2 ;
}

final  class pens009a__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03NU2", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_PreKg, Lb_numop, Lb_NumAux, Lb_ObsFac FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03NU3", "SELECT EmprCod, Lb_numero, CliCod, Lb_ArtCod, Lb_ColNom, Lb_ColNum, TipColCod, IntCod, MatCod, MacProCod, Lb_Rb, Lb_Cartaz, Lb_ColNomC, Lb_ColNumC, Lb_TipArt, Lb_FechaE, Lb_Hila FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03NU4", "SELECT EmprCod, Lb_numero, Lb_ForCod, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03NU5", "INSERT INTO TXPLFORMU(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForCod, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, ProforFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new ForEachCursor("P03NU6", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_UltLC, Lb_UltlP FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03NU7", "UPDATE TXPCDFORM SET PrdUltLin=?, CosKgm=0, ContNum=10, ColUltLin=?  WHERE EmprCod = ? and ForNumCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDFORM")
         ,new ForEachCursor("P03NU8", "SELECT T1.EmprCod, T1.Lb_numero, T1.Lb_LineaC, T1.LB_CantC, T1.ForPrdUMe, T1.PrdNum, T1.Lb_opcion, T2.ForPrdDsc FROM (TXPENS003 T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03NU9", "INSERT INTO TXPLDFORM(EmprCod, ForNumCol, ColLin, PrdNum, ForPrdUMe, ForCan, TotLinCol, ForClaCol, ColFibra) VALUES(?, ?, ?, ?, ?, ?, 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
         ,new ForEachCursor("P03NU10", "SELECT T1.EmprCod, T1.Lb_numero, T1.Lb_LineaPr, T1.LB_CantP, T1.Lb_orden, T1.ForPrdUMe, T1.PrdNum, T1.Lb_opcion, T2.ForPrdDsc FROM (TXPENS004 T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03NU11", "INSERT INTO TXPLPRFOR(EmprCod, ForNumCol, PrdLin, PrdNum, ForPrdCan, ForPrdUMe, ForPrdNor) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRFOR")
         ,new ForEachCursor("P03NU12", "SELECT EmprCod, ProForLab, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForLab = ? ORDER BY EmprCod, ProForLab ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03NU13", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol, ObsUltLin, ForFecApr, ForOpcCli, IntCod, MacProCod, ForRelBan, ForTonal, MatCod, ForRGB, ForCosForm, ForPreKgm, ForObsFac, ForNumArc, ForNomCli, ForNumCli, ForOpNum, ForNomCli2 FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03NU14", "UPDATE TXPCFORMU SET ForFecApr=?, ForOpcCli=?, IntCod=?, MacProCod=?, ForRelBan=?, ForTonal=?, MatCod=?, ForRGB=?, ForCosForm=?, ForPreKgm=?, ForObsFac=?, ForNumArc=?, ForNomCli=?, ForNumCli=?, ForOpNum=?, ForNomCli2=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 11 :
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
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(15);
               ((long[]) buf[21])[0] = rslt.getLong(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 13);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(22);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(23);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
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
               return;
            case 3 :
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
               stmt.setString(8, (String)parms[8], 6);
               stmt.setString(9, (String)parms[9], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 12 :
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
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[15]).longValue());
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
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 5);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 200);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 13);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 20);
               }
               stmt.setString(17, (String)parms[32], 3);
               stmt.setInt(18, ((Number) parms[33]).intValue());
               stmt.setString(19, (String)parms[34], 16);
               stmt.setString(20, (String)parms[35], 13);
               stmt.setInt(21, ((Number) parms[36]).intValue());
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[38]).byteValue());
               }
               return;
      }
   }

}

