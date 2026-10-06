package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dupnlabconopcion extends GXProcedure
{
   public dupnlabconopcion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dupnlabconopcion.class ), "" );
   }

   public dupnlabconopcion( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      dupnlabconopcion.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      dupnlabconopcion.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      dupnlabconopcion.this.AV9Lb_numeroi = aP1[0];
      this.aP1 = aP1;
      dupnlabconopcion.this.AV8Lb_numero = aP2[0];
      this.aP2 = aP2;
      dupnlabconopcion.this.AV10usurcod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV11FlagModa ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      dupnlabconopcion.this.GXt_int1 = GXv_int2[0] ;
      AV11FlagModa = GXt_int1 ;
      AV14Creo_e = (byte)(0) ;
      if ( AV9Lb_numeroi > 0 )
      {
         GXv_int3[0] = AV8Lb_numero ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS000", ""), GXv_int3) ;
         dupnlabconopcion.this.AV8Lb_numero = GXv_int3[0] ;
         AV14Creo_e = (byte)(1) ;
         /* Using cursor P09OY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Lb_numeroi)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5548Lb_Obs = P09OY2_A5548Lb_Obs[0] ;
            A5717Lb_numopu = P09OY2_A5717Lb_numopu[0] ;
            A5569Lb_EstEns = P09OY2_A5569Lb_EstEns[0] ;
            A5549Lb_UltOp = P09OY2_A5549Lb_UltOp[0] ;
            A5546Lb_UsuM = P09OY2_A5546Lb_UsuM[0] ;
            A5545Lb_HoraM = P09OY2_A5545Lb_HoraM[0] ;
            A5544Lb_FechaM = P09OY2_A5544Lb_FechaM[0] ;
            A5543Lb_Usuario = P09OY2_A5543Lb_Usuario[0] ;
            A5542Lb_HoraE = P09OY2_A5542Lb_HoraE[0] ;
            A5541Lb_FechaE = P09OY2_A5541Lb_FechaE[0] ;
            A5537Lb_ColNum = P09OY2_A5537Lb_ColNum[0] ;
            A5532Lb_numero = P09OY2_A5532Lb_numero[0] ;
            A14087IluminaID = P09OY2_A14087IluminaID[0] ;
            n14087IluminaID = P09OY2_n14087IluminaID[0] ;
            A14090Lb_CliDest = P09OY2_A14090Lb_CliDest[0] ;
            n14090Lb_CliDest = P09OY2_n14090Lb_CliDest[0] ;
            A14089Lb_WebCode = P09OY2_A14089Lb_WebCode[0] ;
            n14089Lb_WebCode = P09OY2_n14089Lb_WebCode[0] ;
            A14088Lb_Gots = P09OY2_A14088Lb_Gots[0] ;
            n14088Lb_Gots = P09OY2_n14088Lb_Gots[0] ;
            A13323Lb_Branco1 = P09OY2_A13323Lb_Branco1[0] ;
            A13303Lb_PrecioP = P09OY2_A13303Lb_PrecioP[0] ;
            A13299Lb_PquiID = P09OY2_A13299Lb_PquiID[0] ;
            n13299Lb_PquiID = P09OY2_n13299Lb_PquiID[0] ;
            A12524Lb_staLb = P09OY2_A12524Lb_staLb[0] ;
            n12524Lb_staLb = P09OY2_n12524Lb_staLb[0] ;
            A10883Lb_obsLb = P09OY2_A10883Lb_obsLb[0] ;
            A9900Lb_obsCl = P09OY2_A9900Lb_obsCl[0] ;
            A8954Lb_diasER = P09OY2_A8954Lb_diasER[0] ;
            A8953Lb_FecR = P09OY2_A8953Lb_FecR[0] ;
            A8952Lb_FecN = P09OY2_A8952Lb_FecN[0] ;
            A8951Lb_FecE = P09OY2_A8951Lb_FecE[0] ;
            A8950Lb_NOpN = P09OY2_A8950Lb_NOpN[0] ;
            A8949Lb_NOpE = P09OY2_A8949Lb_NOpE[0] ;
            A8948Lb_NCoE = P09OY2_A8948Lb_NCoE[0] ;
            A8947Lb_NOpR = P09OY2_A8947Lb_NOpR[0] ;
            A8946Lb_NCoS = P09OY2_A8946Lb_NCoS[0] ;
            A7780Lb_Hila = P09OY2_A7780Lb_Hila[0] ;
            A6847Lb_TraP6 = P09OY2_A6847Lb_TraP6[0] ;
            A6846Lb_Tra6 = P09OY2_A6846Lb_Tra6[0] ;
            A6845Lb_TraP5 = P09OY2_A6845Lb_TraP5[0] ;
            A6844Lb_Tra5 = P09OY2_A6844Lb_Tra5[0] ;
            A6843Lb_TraP4 = P09OY2_A6843Lb_TraP4[0] ;
            A6842Lb_Tra4 = P09OY2_A6842Lb_Tra4[0] ;
            A6658Lb_TraP3 = P09OY2_A6658Lb_TraP3[0] ;
            A6657Lb_Tra3 = P09OY2_A6657Lb_Tra3[0] ;
            A6656Lb_TraP2 = P09OY2_A6656Lb_TraP2[0] ;
            A6655Lb_Tra2 = P09OY2_A6655Lb_Tra2[0] ;
            A6654Lb_TraP1 = P09OY2_A6654Lb_TraP1[0] ;
            A6653Lb_Tra1 = P09OY2_A6653Lb_Tra1[0] ;
            A6644Lb_PriEns = P09OY2_A6644Lb_PriEns[0] ;
            A6618Lb_PedCod = P09OY2_A6618Lb_PedCod[0] ;
            A6546Lb_Pantone = P09OY2_A6546Lb_Pantone[0] ;
            A1514MacProCod = P09OY2_A1514MacProCod[0] ;
            n1514MacProCod = P09OY2_n1514MacProCod[0] ;
            A6057Lb_volum = P09OY2_A6057Lb_volum[0] ;
            A6056Lb_pesom = P09OY2_A6056Lb_pesom[0] ;
            A5988Lb_nfibras = P09OY2_A5988Lb_nfibras[0] ;
            A5098TipDisCod = P09OY2_A5098TipDisCod[0] ;
            n5098TipDisCod = P09OY2_n5098TipDisCod[0] ;
            A5901Lab_desvio = P09OY2_A5901Lab_desvio[0] ;
            A5801Lab_CodCau = P09OY2_A5801Lab_CodCau[0] ;
            n5801Lab_CodCau = P09OY2_n5801Lab_CodCau[0] ;
            A5701Lb_Local = P09OY2_A5701Lb_Local[0] ;
            A5700Lb_Talao = P09OY2_A5700Lb_Talao[0] ;
            A5699Lb_EstLab = P09OY2_A5699Lb_EstLab[0] ;
            A5611Lb_Temp3 = P09OY2_A5611Lb_Temp3[0] ;
            A5610Lb_Temp2 = P09OY2_A5610Lb_Temp2[0] ;
            A5601Lb_Tempt = P09OY2_A5601Lb_Tempt[0] ;
            A5600Lb_IDM = P09OY2_A5600Lb_IDM[0] ;
            A5599Lb_RGB = P09OY2_A5599Lb_RGB[0] ;
            A5598Lb_impreso = P09OY2_A5598Lb_impreso[0] ;
            A5597Lb_TipRec = P09OY2_A5597Lb_TipRec[0] ;
            A5596Lb_reprod = P09OY2_A5596Lb_reprod[0] ;
            A5595Lb_malha = P09OY2_A5595Lb_malha[0] ;
            A5594Lb_cartazf = P09OY2_A5594Lb_cartazf[0] ;
            A5570Lb_Tipo = P09OY2_A5570Lb_Tipo[0] ;
            A5552Lb_TipArtD = P09OY2_A5552Lb_TipArtD[0] ;
            A5550Lb_UltlPq = P09OY2_A5550Lb_UltlPq[0] ;
            A3316CodSol = P09OY2_A3316CodSol[0] ;
            n3316CodSol = P09OY2_n3316CodSol[0] ;
            A626MatCod = P09OY2_A626MatCod[0] ;
            n626MatCod = P09OY2_n626MatCod[0] ;
            A583IntCod = P09OY2_A583IntCod[0] ;
            n583IntCod = P09OY2_n583IntCod[0] ;
            A5547Lb_Rb = P09OY2_A5547Lb_Rb[0] ;
            A5540Lb_Cartaz = P09OY2_A5540Lb_Cartaz[0] ;
            A5539Lb_ColNumC = P09OY2_A5539Lb_ColNumC[0] ;
            A5538Lb_ColNomC = P09OY2_A5538Lb_ColNomC[0] ;
            A831TipColCod = P09OY2_A831TipColCod[0] ;
            n831TipColCod = P09OY2_n831TipColCod[0] ;
            A5536Lb_ColNom = P09OY2_A5536Lb_ColNom[0] ;
            A5535Lb_TipArt = P09OY2_A5535Lb_TipArt[0] ;
            A5534Lb_ArtDsc = P09OY2_A5534Lb_ArtDsc[0] ;
            A5533Lb_ArtCod = P09OY2_A5533Lb_ArtCod[0] ;
            A252CliCod = P09OY2_A252CliCod[0] ;
            W396EmprCod = A396EmprCod ;
            W5532Lb_numero = A5532Lb_numero ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int3[0] = A252CliCod ;
            GXv_int5[0] = AV17Lb_rclastn ;
            GXv_int6[0] = AV18Lb_prox ;
            new app.pregcor4(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int5, GXv_int6) ;
            dupnlabconopcion.this.A396EmprCod = GXv_char4[0] ;
            dupnlabconopcion.this.A252CliCod = GXv_int3[0] ;
            dupnlabconopcion.this.AV17Lb_rclastn = GXv_int5[0] ;
            dupnlabconopcion.this.AV18Lb_prox = GXv_int6[0] ;
            /*
               INSERT RECORD ON TABLE TXPENS001

            */
            W396EmprCod = A396EmprCod ;
            W5532Lb_numero = A5532Lb_numero ;
            W252CliCod = A252CliCod ;
            W5533Lb_ArtCod = A5533Lb_ArtCod ;
            W5534Lb_ArtDsc = A5534Lb_ArtDsc ;
            W5535Lb_TipArt = A5535Lb_TipArt ;
            W5536Lb_ColNom = A5536Lb_ColNom ;
            W5537Lb_ColNum = A5537Lb_ColNum ;
            W831TipColCod = A831TipColCod ;
            n831TipColCod = false ;
            W5538Lb_ColNomC = A5538Lb_ColNomC ;
            W5539Lb_ColNumC = A5539Lb_ColNumC ;
            W5540Lb_Cartaz = A5540Lb_Cartaz ;
            W5541Lb_FechaE = A5541Lb_FechaE ;
            W5542Lb_HoraE = A5542Lb_HoraE ;
            W5543Lb_Usuario = A5543Lb_Usuario ;
            W5544Lb_FechaM = A5544Lb_FechaM ;
            W5545Lb_HoraM = A5545Lb_HoraM ;
            W5546Lb_UsuM = A5546Lb_UsuM ;
            W5547Lb_Rb = A5547Lb_Rb ;
            W583IntCod = A583IntCod ;
            n583IntCod = false ;
            W626MatCod = A626MatCod ;
            n626MatCod = false ;
            W3316CodSol = A3316CodSol ;
            n3316CodSol = false ;
            W5548Lb_Obs = A5548Lb_Obs ;
            W5550Lb_UltlPq = A5550Lb_UltlPq ;
            W5552Lb_TipArtD = A5552Lb_TipArtD ;
            W5570Lb_Tipo = A5570Lb_Tipo ;
            W5569Lb_EstEns = A5569Lb_EstEns ;
            W5594Lb_cartazf = A5594Lb_cartazf ;
            W5595Lb_malha = A5595Lb_malha ;
            W5596Lb_reprod = A5596Lb_reprod ;
            W5597Lb_TipRec = A5597Lb_TipRec ;
            W5598Lb_impreso = A5598Lb_impreso ;
            W5599Lb_RGB = A5599Lb_RGB ;
            W5600Lb_IDM = A5600Lb_IDM ;
            W5601Lb_Tempt = A5601Lb_Tempt ;
            W5611Lb_Temp3 = A5611Lb_Temp3 ;
            W5610Lb_Temp2 = A5610Lb_Temp2 ;
            W5701Lb_Local = A5701Lb_Local ;
            W5700Lb_Talao = A5700Lb_Talao ;
            W5699Lb_EstLab = A5699Lb_EstLab ;
            W5801Lab_CodCau = A5801Lab_CodCau ;
            n5801Lab_CodCau = false ;
            W5901Lab_desvio = A5901Lab_desvio ;
            W5988Lb_nfibras = A5988Lb_nfibras ;
            W5098TipDisCod = A5098TipDisCod ;
            n5098TipDisCod = false ;
            W6056Lb_pesom = A6056Lb_pesom ;
            W6057Lb_volum = A6057Lb_volum ;
            W1514MacProCod = A1514MacProCod ;
            n1514MacProCod = false ;
            W5549Lb_UltOp = A5549Lb_UltOp ;
            W5717Lb_numopu = A5717Lb_numopu ;
            W6546Lb_Pantone = A6546Lb_Pantone ;
            W6618Lb_PedCod = A6618Lb_PedCod ;
            W6653Lb_Tra1 = A6653Lb_Tra1 ;
            W6655Lb_Tra2 = A6655Lb_Tra2 ;
            W6657Lb_Tra3 = A6657Lb_Tra3 ;
            W6654Lb_TraP1 = A6654Lb_TraP1 ;
            W6656Lb_TraP2 = A6656Lb_TraP2 ;
            W6658Lb_TraP3 = A6658Lb_TraP3 ;
            A5532Lb_numero = AV8Lb_numero ;
            A5537Lb_ColNum = AV8Lb_numero ;
            n831TipColCod = false ;
            A5541Lb_FechaE = GXutil.today( ) ;
            A5542Lb_HoraE = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
            A5543Lb_Usuario = AV10usurcod ;
            A5544Lb_FechaM = GXutil.nullDate() ;
            A5545Lb_HoraM = GXutil.resetTime( GXutil.nullDate() );
            A5546Lb_UsuM = " " ;
            n583IntCod = false ;
            n626MatCod = false ;
            n3316CodSol = false ;
            A5569Lb_EstEns = (byte)(0) ;
            n5801Lab_CodCau = false ;
            n5098TipDisCod = false ;
            n1514MacProCod = false ;
            A5549Lb_UltOp = httpContext.getMessage( "A", "") ;
            A5717Lb_numopu = (byte)(1) ;
            /* Using cursor P09OY3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Integer.valueOf(A252CliCod), A5533Lb_ArtCod, A5534Lb_ArtDsc, Short.valueOf(A5535Lb_TipArt), A5536Lb_ColNom, Integer.valueOf(A5537Lb_ColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A5538Lb_ColNomC, Integer.valueOf(A5539Lb_ColNumC), A5540Lb_Cartaz, A5541Lb_FechaE, A5542Lb_HoraE, A5543Lb_Usuario, A5544Lb_FechaM, A5545Lb_HoraM, A5546Lb_UsuM, A5547Lb_Rb, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n626MatCod), Short.valueOf(A626MatCod), Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol), A5548Lb_Obs, A5549Lb_UltOp, Short.valueOf(A5550Lb_UltlPq), A5552Lb_TipArtD, Byte.valueOf(A5569Lb_EstEns), A5570Lb_Tipo, A5594Lb_cartazf, Byte.valueOf(A5595Lb_malha), Byte.valueOf(A5596Lb_reprod), Byte.valueOf(A5597Lb_TipRec), Byte.valueOf(A5598Lb_impreso), Long.valueOf(A5599Lb_RGB), Integer.valueOf(A5600Lb_IDM), Short.valueOf(A5601Lb_Tempt), Short.valueOf(A5610Lb_Temp2), Short.valueOf(A5611Lb_Temp3), Byte.valueOf(A5699Lb_EstLab), A5700Lb_Talao, A5701Lb_Local, Byte.valueOf(A5717Lb_numopu), Boolean.valueOf(n5801Lab_CodCau), Short.valueOf(A5801Lab_CodCau), Short.valueOf(A5901Lab_desvio), Boolean.valueOf(n5098TipDisCod), A5098TipDisCod, Byte.valueOf(A5988Lb_nfibras), A6056Lb_pesom, A6057Lb_volum, Boolean.valueOf(n1514MacProCod), A1514MacProCod, A6546Lb_Pantone, A6618Lb_PedCod, A6644Lb_PriEns, A6653Lb_Tra1, Short.valueOf(A6654Lb_TraP1), A6655Lb_Tra2, Short.valueOf(A6656Lb_TraP2), A6657Lb_Tra3, Short.valueOf(A6658Lb_TraP3), A6842Lb_Tra4, Short.valueOf(A6843Lb_TraP4), A6844Lb_Tra5, Short.valueOf(A6845Lb_TraP5), A6846Lb_Tra6, Short.valueOf(A6847Lb_TraP6), A7780Lb_Hila, Integer.valueOf(A8946Lb_NCoS), Integer.valueOf(A8947Lb_NOpR), Integer.valueOf(A8948Lb_NCoE), Integer.valueOf(A8949Lb_NOpE), Integer.valueOf(A8950Lb_NOpN), A8951Lb_FecE, A8952Lb_FecN, A8953Lb_FecR, Integer.valueOf(A8954Lb_diasER), A9900Lb_obsCl, A10883Lb_obsLb, Boolean.valueOf(n12524Lb_staLb), A12524Lb_staLb, Boolean.valueOf(n13299Lb_PquiID), A13299Lb_PquiID, A13303Lb_PrecioP, A13323Lb_Branco1, Boolean.valueOf(n14088Lb_Gots), A14088Lb_Gots, Boolean.valueOf(n14089Lb_WebCode), A14089Lb_WebCode, Boolean.valueOf(n14090Lb_CliDest), Integer.valueOf(A14090Lb_CliDest), Boolean.valueOf(n14087IluminaID), Short.valueOf(A14087IluminaID)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
            if ( (pr_default.getStatus(1) == 1) )
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
            A5532Lb_numero = W5532Lb_numero ;
            A252CliCod = W252CliCod ;
            A5533Lb_ArtCod = W5533Lb_ArtCod ;
            A5534Lb_ArtDsc = W5534Lb_ArtDsc ;
            A5535Lb_TipArt = W5535Lb_TipArt ;
            A5536Lb_ColNom = W5536Lb_ColNom ;
            A5537Lb_ColNum = W5537Lb_ColNum ;
            A831TipColCod = W831TipColCod ;
            n831TipColCod = false ;
            A5538Lb_ColNomC = W5538Lb_ColNomC ;
            A5539Lb_ColNumC = W5539Lb_ColNumC ;
            A5540Lb_Cartaz = W5540Lb_Cartaz ;
            A5541Lb_FechaE = W5541Lb_FechaE ;
            A5542Lb_HoraE = W5542Lb_HoraE ;
            A5543Lb_Usuario = W5543Lb_Usuario ;
            A5544Lb_FechaM = W5544Lb_FechaM ;
            A5545Lb_HoraM = W5545Lb_HoraM ;
            A5546Lb_UsuM = W5546Lb_UsuM ;
            A5547Lb_Rb = W5547Lb_Rb ;
            A583IntCod = W583IntCod ;
            n583IntCod = false ;
            A626MatCod = W626MatCod ;
            n626MatCod = false ;
            A3316CodSol = W3316CodSol ;
            n3316CodSol = false ;
            A5548Lb_Obs = W5548Lb_Obs ;
            A5550Lb_UltlPq = W5550Lb_UltlPq ;
            A5552Lb_TipArtD = W5552Lb_TipArtD ;
            A5570Lb_Tipo = W5570Lb_Tipo ;
            A5569Lb_EstEns = W5569Lb_EstEns ;
            A5594Lb_cartazf = W5594Lb_cartazf ;
            A5595Lb_malha = W5595Lb_malha ;
            A5596Lb_reprod = W5596Lb_reprod ;
            A5597Lb_TipRec = W5597Lb_TipRec ;
            A5598Lb_impreso = W5598Lb_impreso ;
            A5599Lb_RGB = W5599Lb_RGB ;
            A5600Lb_IDM = W5600Lb_IDM ;
            A5601Lb_Tempt = W5601Lb_Tempt ;
            A5611Lb_Temp3 = W5611Lb_Temp3 ;
            A5610Lb_Temp2 = W5610Lb_Temp2 ;
            A5701Lb_Local = W5701Lb_Local ;
            A5700Lb_Talao = W5700Lb_Talao ;
            A5699Lb_EstLab = W5699Lb_EstLab ;
            A5801Lab_CodCau = W5801Lab_CodCau ;
            n5801Lab_CodCau = false ;
            A5901Lab_desvio = W5901Lab_desvio ;
            A5988Lb_nfibras = W5988Lb_nfibras ;
            A5098TipDisCod = W5098TipDisCod ;
            n5098TipDisCod = false ;
            A6056Lb_pesom = W6056Lb_pesom ;
            A6057Lb_volum = W6057Lb_volum ;
            A1514MacProCod = W1514MacProCod ;
            n1514MacProCod = false ;
            A5549Lb_UltOp = W5549Lb_UltOp ;
            A5717Lb_numopu = W5717Lb_numopu ;
            A6546Lb_Pantone = W6546Lb_Pantone ;
            A6618Lb_PedCod = W6618Lb_PedCod ;
            A6653Lb_Tra1 = W6653Lb_Tra1 ;
            A6655Lb_Tra2 = W6655Lb_Tra2 ;
            A6657Lb_Tra3 = W6657Lb_Tra3 ;
            A6654Lb_TraP1 = W6654Lb_TraP1 ;
            A6656Lb_TraP2 = W6656Lb_TraP2 ;
            A6658Lb_TraP3 = W6658Lb_TraP3 ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A5532Lb_numero = W5532Lb_numero ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P09OY4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV9Lb_numeroi)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5532Lb_numero = P09OY4_A5532Lb_numero[0] ;
            A8621Lb_Envio = P09OY4_A8621Lb_Envio[0] ;
            A6372Lb_RecPip = P09OY4_A6372Lb_RecPip[0] ;
            A5553Lb_ForCod = P09OY4_A5553Lb_ForCod[0] ;
            A5551Lb_lineaPq = P09OY4_A5551Lb_lineaPq[0] ;
            W396EmprCod = A396EmprCod ;
            W5532Lb_numero = A5532Lb_numero ;
            /*
               INSERT RECORD ON TABLE TXPENS000

            */
            W396EmprCod = A396EmprCod ;
            W5532Lb_numero = A5532Lb_numero ;
            W5551Lb_lineaPq = A5551Lb_lineaPq ;
            W5553Lb_ForCod = A5553Lb_ForCod ;
            W6372Lb_RecPip = A6372Lb_RecPip ;
            A5532Lb_numero = AV8Lb_numero ;
            /* Using cursor P09OY5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq), A5553Lb_ForCod, A6372Lb_RecPip, A8621Lb_Envio});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS000");
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
            A5532Lb_numero = W5532Lb_numero ;
            A5551Lb_lineaPq = W5551Lb_lineaPq ;
            A5553Lb_ForCod = W5553Lb_ForCod ;
            A6372Lb_RecPip = W6372Lb_RecPip ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A5532Lb_numero = W5532Lb_numero ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV16Lb_Opcion = "" ;
         /* Using cursor P09OY6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV9Lb_numeroi)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A5563Lb_FechaR = P09OY6_A5563Lb_FechaR[0] ;
            A5566Lb_Estado = P09OY6_A5566Lb_Estado[0] ;
            A5532Lb_numero = P09OY6_A5532Lb_numero[0] ;
            A5555Lb_opcion = P09OY6_A5555Lb_opcion[0] ;
            AV16Lb_Opcion = A5555Lb_opcion ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( GXutil.strcmp(AV16Lb_Opcion, "") == 0 )
         {
            /* Using cursor P09OY7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV9Lb_numeroi)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A5532Lb_numero = P09OY7_A5532Lb_numero[0] ;
               A5555Lb_opcion = P09OY7_A5555Lb_opcion[0] ;
               AV16Lb_Opcion = A5555Lb_opcion ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(5);
            }
            pr_default.close(5);
         }
         /* Using cursor P09OY8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV9Lb_numeroi), AV16Lb_Opcion});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A12731Lb_ObsFac = P09OY8_A12731Lb_ObsFac[0] ;
            A12526Lb_opFc = P09OY8_A12526Lb_opFc[0] ;
            n12526Lb_opFc = P09OY8_n12526Lb_opFc[0] ;
            A12525Lb_opSt = P09OY8_A12525Lb_opSt[0] ;
            n12525Lb_opSt = P09OY8_n12525Lb_opSt[0] ;
            A10082Lb_hhnoa1 = P09OY8_A10082Lb_hhnoa1[0] ;
            A10081Lb_hhent1 = P09OY8_A10081Lb_hhent1[0] ;
            A6631Lb_ProvDef = P09OY8_A6631Lb_ProvDef[0] ;
            A6461Lb_FecNoa1 = P09OY8_A6461Lb_FecNoa1[0] ;
            A6460Lb_FecEnt1 = P09OY8_A6460Lb_FecEnt1[0] ;
            A6192Lb_FecPre = P09OY8_A6192Lb_FecPre[0] ;
            A5989Lb_PreKg = P09OY8_A5989Lb_PreKg[0] ;
            A5718Lb_numop = P09OY8_A5718Lb_numop[0] ;
            A5568Lb_HoraEn = P09OY8_A5568Lb_HoraEn[0] ;
            A5567Lb_FechaEn = P09OY8_A5567Lb_FechaEn[0] ;
            A5566Lb_Estado = P09OY8_A5566Lb_Estado[0] ;
            A5564Lb_HoraR = P09OY8_A5564Lb_HoraR[0] ;
            A5563Lb_FechaR = P09OY8_A5563Lb_FechaR[0] ;
            A5555Lb_opcion = P09OY8_A5555Lb_opcion[0] ;
            A5532Lb_numero = P09OY8_A5532Lb_numero[0] ;
            A13459Lb_UltLinC = P09OY8_A13459Lb_UltLinC[0] ;
            n13459Lb_UltLinC = P09OY8_n13459Lb_UltLinC[0] ;
            A10822Lb_ObsCR = P09OY8_A10822Lb_ObsCR[0] ;
            A10083Lb_PreMt = P09OY8_A10083Lb_PreMt[0] ;
            A1127Lb_CosteC = P09OY8_A1127Lb_CosteC[0] ;
            A8622Lb_IntCod = P09OY8_A8622Lb_IntCod[0] ;
            A7395Lb_NumAux = P09OY8_A7395Lb_NumAux[0] ;
            A6375Lb_famc3 = P09OY8_A6375Lb_famc3[0] ;
            A6374Lb_famc2 = P09OY8_A6374Lb_famc2[0] ;
            A6373Lb_famc1 = P09OY8_A6373Lb_famc1[0] ;
            A6310Lb_TaAuxC = P09OY8_A6310Lb_TaAuxC[0] ;
            n6310Lb_TaAuxC = P09OY8_n6310Lb_TaAuxC[0] ;
            A5565Lb_CosteE = P09OY8_A5565Lb_CosteE[0] ;
            A5559Lb_UltlP = P09OY8_A5559Lb_UltlP[0] ;
            A5556Lb_UltLC = P09OY8_A5556Lb_UltLC[0] ;
            W396EmprCod = A396EmprCod ;
            W5532Lb_numero = A5532Lb_numero ;
            W5555Lb_opcion = A5555Lb_opcion ;
            AV12LB_ULTOP = httpContext.getMessage( "A", "") ;
            AV13LB_NUMOPU = (byte)(1) ;
            /*
               INSERT RECORD ON TABLE TXPENS002

            */
            W396EmprCod = A396EmprCod ;
            W5532Lb_numero = A5532Lb_numero ;
            W5555Lb_opcion = A5555Lb_opcion ;
            W5556Lb_UltLC = A5556Lb_UltLC ;
            W5559Lb_UltlP = A5559Lb_UltlP ;
            W5563Lb_FechaR = A5563Lb_FechaR ;
            W5564Lb_HoraR = A5564Lb_HoraR ;
            W5565Lb_CosteE = A5565Lb_CosteE ;
            W5566Lb_Estado = A5566Lb_Estado ;
            W5567Lb_FechaEn = A5567Lb_FechaEn ;
            W5568Lb_HoraEn = A5568Lb_HoraEn ;
            W5718Lb_numop = A5718Lb_numop ;
            W5989Lb_PreKg = A5989Lb_PreKg ;
            W6192Lb_FecPre = A6192Lb_FecPre ;
            W6310Lb_TaAuxC = A6310Lb_TaAuxC ;
            n6310Lb_TaAuxC = false ;
            W6375Lb_famc3 = A6375Lb_famc3 ;
            W6374Lb_famc2 = A6374Lb_famc2 ;
            W6373Lb_famc1 = A6373Lb_famc1 ;
            W6460Lb_FecEnt1 = A6460Lb_FecEnt1 ;
            W6461Lb_FecNoa1 = A6461Lb_FecNoa1 ;
            W6631Lb_ProvDef = A6631Lb_ProvDef ;
            W6631Lb_ProvDef = A6631Lb_ProvDef ;
            W10081Lb_hhent1 = A10081Lb_hhent1 ;
            W10082Lb_hhnoa1 = A10082Lb_hhnoa1 ;
            W12525Lb_opSt = A12525Lb_opSt ;
            n12525Lb_opSt = false ;
            W12526Lb_opFc = A12526Lb_opFc ;
            n12526Lb_opFc = false ;
            W12731Lb_ObsFac = A12731Lb_ObsFac ;
            A5532Lb_numero = AV8Lb_numero ;
            A5555Lb_opcion = httpContext.getMessage( "A", "") ;
            A5563Lb_FechaR = GXutil.nullDate() ;
            A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
            A5566Lb_Estado = (byte)(0) ;
            A5567Lb_FechaEn = GXutil.nullDate() ;
            A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
            A5718Lb_numop = (byte)(1) ;
            A5989Lb_PreKg = DecimalUtil.doubleToDec(0) ;
            A6192Lb_FecPre = GXutil.nullDate() ;
            n6310Lb_TaAuxC = false ;
            A6460Lb_FecEnt1 = GXutil.today( ) ;
            A6461Lb_FecNoa1 = GXutil.nullDate() ;
            if ( AV11FlagModa == 1 )
            {
               A6631Lb_ProvDef = httpContext.getMessage( "D", "") ;
            }
            else
            {
            }
            A10081Lb_hhent1 = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
            A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
            A12525Lb_opSt = "*" ;
            n12525Lb_opSt = false ;
            A12526Lb_opFc = GXutil.nullDate() ;
            n12526Lb_opFc = false ;
            A12731Lb_ObsFac = " " ;
            /* Using cursor P09OY9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5556Lb_UltLC), Short.valueOf(A5559Lb_UltlP), A5563Lb_FechaR, A5564Lb_HoraR, A5565Lb_CosteE, Byte.valueOf(A5566Lb_Estado), A5567Lb_FechaEn, A5568Lb_HoraEn, Byte.valueOf(A5718Lb_numop), A5989Lb_PreKg, A6192Lb_FecPre, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, Byte.valueOf(A6373Lb_famc1), Byte.valueOf(A6374Lb_famc2), Byte.valueOf(A6375Lb_famc3), A6460Lb_FecEnt1, A6461Lb_FecNoa1, A6631Lb_ProvDef, Byte.valueOf(A7395Lb_NumAux), Byte.valueOf(A8622Lb_IntCod), A1127Lb_CosteC, A10081Lb_hhent1, A10082Lb_hhnoa1, A10083Lb_PreMt, A10822Lb_ObsCR, Boolean.valueOf(n12525Lb_opSt), A12525Lb_opSt, Boolean.valueOf(n12526Lb_opFc), A12526Lb_opFc, A12731Lb_ObsFac, Boolean.valueOf(n13459Lb_UltLinC), Short.valueOf(A13459Lb_UltLinC)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
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
            A5532Lb_numero = W5532Lb_numero ;
            A5555Lb_opcion = W5555Lb_opcion ;
            A5556Lb_UltLC = W5556Lb_UltLC ;
            A5559Lb_UltlP = W5559Lb_UltlP ;
            A5563Lb_FechaR = W5563Lb_FechaR ;
            A5564Lb_HoraR = W5564Lb_HoraR ;
            A5565Lb_CosteE = W5565Lb_CosteE ;
            A5566Lb_Estado = W5566Lb_Estado ;
            A5567Lb_FechaEn = W5567Lb_FechaEn ;
            A5568Lb_HoraEn = W5568Lb_HoraEn ;
            A5718Lb_numop = W5718Lb_numop ;
            A5989Lb_PreKg = W5989Lb_PreKg ;
            A6192Lb_FecPre = W6192Lb_FecPre ;
            A6310Lb_TaAuxC = W6310Lb_TaAuxC ;
            n6310Lb_TaAuxC = false ;
            A6375Lb_famc3 = W6375Lb_famc3 ;
            A6374Lb_famc2 = W6374Lb_famc2 ;
            A6373Lb_famc1 = W6373Lb_famc1 ;
            A6460Lb_FecEnt1 = W6460Lb_FecEnt1 ;
            A6461Lb_FecNoa1 = W6461Lb_FecNoa1 ;
            A6631Lb_ProvDef = W6631Lb_ProvDef ;
            A6631Lb_ProvDef = W6631Lb_ProvDef ;
            A10081Lb_hhent1 = W10081Lb_hhent1 ;
            A10082Lb_hhnoa1 = W10082Lb_hhnoa1 ;
            A12525Lb_opSt = W12525Lb_opSt ;
            n12525Lb_opSt = false ;
            A12526Lb_opFc = W12526Lb_opFc ;
            n12526Lb_opFc = false ;
            A12731Lb_ObsFac = W12731Lb_ObsFac ;
            /* End Insert */
            /* Using cursor P09OY10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A14096Lb_fibra = P09OY10_A14096Lb_fibra[0] ;
               A6544Lb_PTinC = P09OY10_A6544Lb_PTinC[0] ;
               A6058Lb_soluc = P09OY10_A6058Lb_soluc[0] ;
               A5558LB_CantC = P09OY10_A5558LB_CantC[0] ;
               A490ForPrdUMe = P09OY10_A490ForPrdUMe[0] ;
               A719PrdNum = P09OY10_A719PrdNum[0] ;
               A5557Lb_LineaC = P09OY10_A5557Lb_LineaC[0] ;
               W396EmprCod = A396EmprCod ;
               W5532Lb_numero = A5532Lb_numero ;
               W5555Lb_opcion = A5555Lb_opcion ;
               /*
                  INSERT RECORD ON TABLE TXPENS003

               */
               W396EmprCod = A396EmprCod ;
               W5532Lb_numero = A5532Lb_numero ;
               W5555Lb_opcion = A5555Lb_opcion ;
               W5557Lb_LineaC = A5557Lb_LineaC ;
               W719PrdNum = A719PrdNum ;
               W490ForPrdUMe = A490ForPrdUMe ;
               W5558LB_CantC = A5558LB_CantC ;
               W6058Lb_soluc = A6058Lb_soluc ;
               W6544Lb_PTinC = A6544Lb_PTinC ;
               A5532Lb_numero = AV8Lb_numero ;
               A5555Lb_opcion = httpContext.getMessage( "A", "") ;
               /* Using cursor P09OY11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A5558LB_CantC, Integer.valueOf(A6058Lb_soluc), Byte.valueOf(A6544Lb_PTinC), A14096Lb_fibra});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
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
               A5532Lb_numero = W5532Lb_numero ;
               A5555Lb_opcion = W5555Lb_opcion ;
               A5557Lb_LineaC = W5557Lb_LineaC ;
               A719PrdNum = W719PrdNum ;
               A490ForPrdUMe = W490ForPrdUMe ;
               A5558LB_CantC = W5558LB_CantC ;
               A6058Lb_soluc = W6058Lb_soluc ;
               A6544Lb_PTinC = W6544Lb_PTinC ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A5532Lb_numero = W5532Lb_numero ;
               A5555Lb_opcion = W5555Lb_opcion ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
            /* Using cursor P09OY12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A6545Lb_PTinP = P09OY12_A6545Lb_PTinP[0] ;
               A6059Lb_solup = P09OY12_A6059Lb_solup[0] ;
               A5562Lb_orden = P09OY12_A5562Lb_orden[0] ;
               A5561LB_CantP = P09OY12_A5561LB_CantP[0] ;
               A490ForPrdUMe = P09OY12_A490ForPrdUMe[0] ;
               A719PrdNum = P09OY12_A719PrdNum[0] ;
               A5560Lb_LineaPr = P09OY12_A5560Lb_LineaPr[0] ;
               W396EmprCod = A396EmprCod ;
               W5532Lb_numero = A5532Lb_numero ;
               W5555Lb_opcion = A5555Lb_opcion ;
               /*
                  INSERT RECORD ON TABLE TXPENS004

               */
               W396EmprCod = A396EmprCod ;
               W5532Lb_numero = A5532Lb_numero ;
               W5555Lb_opcion = A5555Lb_opcion ;
               W5560Lb_LineaPr = A5560Lb_LineaPr ;
               W719PrdNum = A719PrdNum ;
               W490ForPrdUMe = A490ForPrdUMe ;
               W5561LB_CantP = A5561LB_CantP ;
               W5562Lb_orden = A5562Lb_orden ;
               W6059Lb_solup = A6059Lb_solup ;
               W6545Lb_PTinP = A6545Lb_PTinP ;
               A5532Lb_numero = AV8Lb_numero ;
               A5555Lb_opcion = httpContext.getMessage( "A", "") ;
               /* Using cursor P09OY13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A5561LB_CantP, Short.valueOf(A5562Lb_orden), Integer.valueOf(A6059Lb_solup), Byte.valueOf(A6545Lb_PTinP)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS004");
               if ( (pr_default.getStatus(11) == 1) )
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
               A5532Lb_numero = W5532Lb_numero ;
               A5555Lb_opcion = W5555Lb_opcion ;
               A5560Lb_LineaPr = W5560Lb_LineaPr ;
               A719PrdNum = W719PrdNum ;
               A490ForPrdUMe = W490ForPrdUMe ;
               A5561LB_CantP = W5561LB_CantP ;
               A5562Lb_orden = W5562Lb_orden ;
               A6059Lb_solup = W6059Lb_solup ;
               A6545Lb_PTinP = W6545Lb_PTinP ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A5532Lb_numero = W5532Lb_numero ;
               A5555Lb_opcion = W5555Lb_opcion ;
               pr_default.readNext(10);
            }
            pr_default.close(10);
            A396EmprCod = W396EmprCod ;
            A5532Lb_numero = W5532Lb_numero ;
            A5555Lb_opcion = W5555Lb_opcion ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
         Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.dupnlabconopcion");
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.dupnlabconopcion");
      if ( AV14Creo_e == 1 )
      {
         /* Using cursor P09OY14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV8Lb_numero)});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A5532Lb_numero = P09OY14_A5532Lb_numero[0] ;
            A5549Lb_UltOp = P09OY14_A5549Lb_UltOp[0] ;
            A5717Lb_numopu = P09OY14_A5717Lb_numopu[0] ;
            A252CliCod = P09OY14_A252CliCod[0] ;
            A5549Lb_UltOp = AV12LB_ULTOP ;
            A5717Lb_numopu = AV13LB_NUMOPU ;
            new app.pregcor5(remoteHandle, context).execute( A396EmprCod, A252CliCod, AV8Lb_numero) ;
            /* Using cursor P09OY15 */
            pr_default.execute(13, new Object[] {A5549Lb_UltOp, Byte.valueOf(A5717Lb_numopu), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(12);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = dupnlabconopcion.this.A396EmprCod;
      this.aP1[0] = dupnlabconopcion.this.AV9Lb_numeroi;
      this.aP2[0] = dupnlabconopcion.this.AV8Lb_numero;
      this.aP3[0] = dupnlabconopcion.this.AV10usurcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.dupnlabconopcion");
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
      scmdbuf = "" ;
      P09OY2_A5548Lb_Obs = new String[] {""} ;
      P09OY2_A396EmprCod = new String[] {""} ;
      P09OY2_A5717Lb_numopu = new byte[1] ;
      P09OY2_A5569Lb_EstEns = new byte[1] ;
      P09OY2_A5549Lb_UltOp = new String[] {""} ;
      P09OY2_A5546Lb_UsuM = new String[] {""} ;
      P09OY2_A5545Lb_HoraM = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY2_A5544Lb_FechaM = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY2_A5543Lb_Usuario = new String[] {""} ;
      P09OY2_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY2_A5537Lb_ColNum = new int[1] ;
      P09OY2_A5532Lb_numero = new int[1] ;
      P09OY2_A14087IluminaID = new short[1] ;
      P09OY2_n14087IluminaID = new boolean[] {false} ;
      P09OY2_A14090Lb_CliDest = new int[1] ;
      P09OY2_n14090Lb_CliDest = new boolean[] {false} ;
      P09OY2_A14089Lb_WebCode = new String[] {""} ;
      P09OY2_n14089Lb_WebCode = new boolean[] {false} ;
      P09OY2_A14088Lb_Gots = new String[] {""} ;
      P09OY2_n14088Lb_Gots = new boolean[] {false} ;
      P09OY2_A13323Lb_Branco1 = new String[] {""} ;
      P09OY2_A13303Lb_PrecioP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OY2_A13299Lb_PquiID = new String[] {""} ;
      P09OY2_n13299Lb_PquiID = new boolean[] {false} ;
      P09OY2_A12524Lb_staLb = new String[] {""} ;
      P09OY2_n12524Lb_staLb = new boolean[] {false} ;
      P09OY2_A10883Lb_obsLb = new String[] {""} ;
      P09OY2_A9900Lb_obsCl = new String[] {""} ;
      P09OY2_A8954Lb_diasER = new int[1] ;
      P09OY2_A8953Lb_FecR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY2_A8952Lb_FecN = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY2_A8951Lb_FecE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY2_A8950Lb_NOpN = new int[1] ;
      P09OY2_A8949Lb_NOpE = new int[1] ;
      P09OY2_A8948Lb_NCoE = new int[1] ;
      P09OY2_A8947Lb_NOpR = new int[1] ;
      P09OY2_A8946Lb_NCoS = new int[1] ;
      P09OY2_A7780Lb_Hila = new String[] {""} ;
      P09OY2_A6847Lb_TraP6 = new short[1] ;
      P09OY2_A6846Lb_Tra6 = new String[] {""} ;
      P09OY2_A6845Lb_TraP5 = new short[1] ;
      P09OY2_A6844Lb_Tra5 = new String[] {""} ;
      P09OY2_A6843Lb_TraP4 = new short[1] ;
      P09OY2_A6842Lb_Tra4 = new String[] {""} ;
      P09OY2_A6658Lb_TraP3 = new short[1] ;
      P09OY2_A6657Lb_Tra3 = new String[] {""} ;
      P09OY2_A6656Lb_TraP2 = new short[1] ;
      P09OY2_A6655Lb_Tra2 = new String[] {""} ;
      P09OY2_A6654Lb_TraP1 = new short[1] ;
      P09OY2_A6653Lb_Tra1 = new String[] {""} ;
      P09OY2_A6644Lb_PriEns = new String[] {""} ;
      P09OY2_A6618Lb_PedCod = new String[] {""} ;
      P09OY2_A6546Lb_Pantone = new String[] {""} ;
      P09OY2_A1514MacProCod = new String[] {""} ;
      P09OY2_n1514MacProCod = new boolean[] {false} ;
      P09OY2_A6057Lb_volum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OY2_A6056Lb_pesom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OY2_A5988Lb_nfibras = new byte[1] ;
      P09OY2_A5098TipDisCod = new String[] {""} ;
      P09OY2_n5098TipDisCod = new boolean[] {false} ;
      P09OY2_A5901Lab_desvio = new short[1] ;
      P09OY2_A5801Lab_CodCau = new short[1] ;
      P09OY2_n5801Lab_CodCau = new boolean[] {false} ;
      P09OY2_A5701Lb_Local = new String[] {""} ;
      P09OY2_A5700Lb_Talao = new String[] {""} ;
      P09OY2_A5699Lb_EstLab = new byte[1] ;
      P09OY2_A5611Lb_Temp3 = new short[1] ;
      P09OY2_A5610Lb_Temp2 = new short[1] ;
      P09OY2_A5601Lb_Tempt = new short[1] ;
      P09OY2_A5600Lb_IDM = new int[1] ;
      P09OY2_A5599Lb_RGB = new long[1] ;
      P09OY2_A5598Lb_impreso = new byte[1] ;
      P09OY2_A5597Lb_TipRec = new byte[1] ;
      P09OY2_A5596Lb_reprod = new byte[1] ;
      P09OY2_A5595Lb_malha = new byte[1] ;
      P09OY2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY2_A5570Lb_Tipo = new String[] {""} ;
      P09OY2_A5552Lb_TipArtD = new String[] {""} ;
      P09OY2_A5550Lb_UltlPq = new short[1] ;
      P09OY2_A3316CodSol = new short[1] ;
      P09OY2_n3316CodSol = new boolean[] {false} ;
      P09OY2_A626MatCod = new short[1] ;
      P09OY2_n626MatCod = new boolean[] {false} ;
      P09OY2_A583IntCod = new byte[1] ;
      P09OY2_n583IntCod = new boolean[] {false} ;
      P09OY2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OY2_A5540Lb_Cartaz = new String[] {""} ;
      P09OY2_A5539Lb_ColNumC = new int[1] ;
      P09OY2_A5538Lb_ColNomC = new String[] {""} ;
      P09OY2_A831TipColCod = new byte[1] ;
      P09OY2_n831TipColCod = new boolean[] {false} ;
      P09OY2_A5536Lb_ColNom = new String[] {""} ;
      P09OY2_A5535Lb_TipArt = new short[1] ;
      P09OY2_A5534Lb_ArtDsc = new String[] {""} ;
      P09OY2_A5533Lb_ArtCod = new String[] {""} ;
      P09OY2_A252CliCod = new int[1] ;
      A5548Lb_Obs = "" ;
      A5549Lb_UltOp = "" ;
      A5546Lb_UsuM = "" ;
      A5545Lb_HoraM = GXutil.resetTime( GXutil.nullDate() );
      A5544Lb_FechaM = GXutil.nullDate() ;
      A5543Lb_Usuario = "" ;
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      A5541Lb_FechaE = GXutil.nullDate() ;
      A14089Lb_WebCode = "" ;
      A14088Lb_Gots = "" ;
      A13323Lb_Branco1 = "" ;
      A13303Lb_PrecioP = DecimalUtil.ZERO ;
      A13299Lb_PquiID = "" ;
      A12524Lb_staLb = "" ;
      A10883Lb_obsLb = "" ;
      A9900Lb_obsCl = "" ;
      A8953Lb_FecR = GXutil.nullDate() ;
      A8952Lb_FecN = GXutil.nullDate() ;
      A8951Lb_FecE = GXutil.nullDate() ;
      A7780Lb_Hila = "" ;
      A6846Lb_Tra6 = "" ;
      A6844Lb_Tra5 = "" ;
      A6842Lb_Tra4 = "" ;
      A6657Lb_Tra3 = "" ;
      A6655Lb_Tra2 = "" ;
      A6653Lb_Tra1 = "" ;
      A6644Lb_PriEns = "" ;
      A6618Lb_PedCod = "" ;
      A6546Lb_Pantone = "" ;
      A1514MacProCod = "" ;
      A6057Lb_volum = DecimalUtil.ZERO ;
      A6056Lb_pesom = DecimalUtil.ZERO ;
      A5098TipDisCod = "" ;
      A5701Lb_Local = "" ;
      A5700Lb_Talao = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5570Lb_Tipo = "" ;
      A5552Lb_TipArtD = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5540Lb_Cartaz = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A5534Lb_ArtDsc = "" ;
      A5533Lb_ArtCod = "" ;
      W396EmprCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new int[1] ;
      W5533Lb_ArtCod = "" ;
      W5534Lb_ArtDsc = "" ;
      W5536Lb_ColNom = "" ;
      W5538Lb_ColNomC = "" ;
      W5540Lb_Cartaz = "" ;
      W5541Lb_FechaE = GXutil.nullDate() ;
      W5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      W5543Lb_Usuario = "" ;
      W5544Lb_FechaM = GXutil.nullDate() ;
      W5545Lb_HoraM = GXutil.resetTime( GXutil.nullDate() );
      W5546Lb_UsuM = "" ;
      W5547Lb_Rb = DecimalUtil.ZERO ;
      W5548Lb_Obs = "" ;
      W5552Lb_TipArtD = "" ;
      W5570Lb_Tipo = "" ;
      W5594Lb_cartazf = GXutil.nullDate() ;
      W5701Lb_Local = "" ;
      W5700Lb_Talao = "" ;
      W5098TipDisCod = "" ;
      W6056Lb_pesom = DecimalUtil.ZERO ;
      W6057Lb_volum = DecimalUtil.ZERO ;
      W1514MacProCod = "" ;
      W5549Lb_UltOp = "" ;
      W6546Lb_Pantone = "" ;
      W6618Lb_PedCod = "" ;
      W6653Lb_Tra1 = "" ;
      W6655Lb_Tra2 = "" ;
      W6657Lb_Tra3 = "" ;
      Gx_emsg = "" ;
      P09OY4_A396EmprCod = new String[] {""} ;
      P09OY4_A5532Lb_numero = new int[1] ;
      P09OY4_A8621Lb_Envio = new String[] {""} ;
      P09OY4_A6372Lb_RecPip = new String[] {""} ;
      P09OY4_A5553Lb_ForCod = new String[] {""} ;
      P09OY4_A5551Lb_lineaPq = new short[1] ;
      A8621Lb_Envio = "" ;
      A6372Lb_RecPip = "" ;
      A5553Lb_ForCod = "" ;
      W5553Lb_ForCod = "" ;
      W6372Lb_RecPip = "" ;
      AV16Lb_Opcion = "" ;
      P09OY6_A396EmprCod = new String[] {""} ;
      P09OY6_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY6_A5566Lb_Estado = new byte[1] ;
      P09OY6_A5532Lb_numero = new int[1] ;
      P09OY6_A5555Lb_opcion = new String[] {""} ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      P09OY7_A396EmprCod = new String[] {""} ;
      P09OY7_A5532Lb_numero = new int[1] ;
      P09OY7_A5555Lb_opcion = new String[] {""} ;
      P09OY8_A396EmprCod = new String[] {""} ;
      P09OY8_A12731Lb_ObsFac = new String[] {""} ;
      P09OY8_A12526Lb_opFc = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY8_n12526Lb_opFc = new boolean[] {false} ;
      P09OY8_A12525Lb_opSt = new String[] {""} ;
      P09OY8_n12525Lb_opSt = new boolean[] {false} ;
      P09OY8_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY8_A10081Lb_hhent1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY8_A6631Lb_ProvDef = new String[] {""} ;
      P09OY8_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY8_A6460Lb_FecEnt1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY8_A6192Lb_FecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY8_A5989Lb_PreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OY8_A5718Lb_numop = new byte[1] ;
      P09OY8_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY8_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY8_A5566Lb_Estado = new byte[1] ;
      P09OY8_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY8_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OY8_A5555Lb_opcion = new String[] {""} ;
      P09OY8_A5532Lb_numero = new int[1] ;
      P09OY8_A13459Lb_UltLinC = new short[1] ;
      P09OY8_n13459Lb_UltLinC = new boolean[] {false} ;
      P09OY8_A10822Lb_ObsCR = new String[] {""} ;
      P09OY8_A10083Lb_PreMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OY8_A1127Lb_CosteC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OY8_A8622Lb_IntCod = new byte[1] ;
      P09OY8_A7395Lb_NumAux = new byte[1] ;
      P09OY8_A6375Lb_famc3 = new byte[1] ;
      P09OY8_A6374Lb_famc2 = new byte[1] ;
      P09OY8_A6373Lb_famc1 = new byte[1] ;
      P09OY8_A6310Lb_TaAuxC = new String[] {""} ;
      P09OY8_n6310Lb_TaAuxC = new boolean[] {false} ;
      P09OY8_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OY8_A5559Lb_UltlP = new short[1] ;
      P09OY8_A5556Lb_UltLC = new short[1] ;
      A12731Lb_ObsFac = "" ;
      A12526Lb_opFc = GXutil.nullDate() ;
      A12525Lb_opSt = "" ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      A10081Lb_hhent1 = GXutil.resetTime( GXutil.nullDate() );
      A6631Lb_ProvDef = "" ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A6460Lb_FecEnt1 = GXutil.nullDate() ;
      A6192Lb_FecPre = GXutil.nullDate() ;
      A5989Lb_PreKg = DecimalUtil.ZERO ;
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      A10822Lb_ObsCR = "" ;
      A10083Lb_PreMt = DecimalUtil.ZERO ;
      A1127Lb_CosteC = DecimalUtil.ZERO ;
      A6310Lb_TaAuxC = "" ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      W5555Lb_opcion = "" ;
      AV12LB_ULTOP = "" ;
      W5563Lb_FechaR = GXutil.nullDate() ;
      W5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      W5565Lb_CosteE = DecimalUtil.ZERO ;
      W5567Lb_FechaEn = GXutil.nullDate() ;
      W5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      W5989Lb_PreKg = DecimalUtil.ZERO ;
      W6192Lb_FecPre = GXutil.nullDate() ;
      W6310Lb_TaAuxC = "" ;
      W6460Lb_FecEnt1 = GXutil.nullDate() ;
      W6461Lb_FecNoa1 = GXutil.nullDate() ;
      W6631Lb_ProvDef = "" ;
      W10081Lb_hhent1 = GXutil.resetTime( GXutil.nullDate() );
      W10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      W12525Lb_opSt = "" ;
      W12526Lb_opFc = GXutil.nullDate() ;
      W12731Lb_ObsFac = "" ;
      P09OY10_A396EmprCod = new String[] {""} ;
      P09OY10_A5532Lb_numero = new int[1] ;
      P09OY10_A5555Lb_opcion = new String[] {""} ;
      P09OY10_A14096Lb_fibra = new String[] {""} ;
      P09OY10_A6544Lb_PTinC = new byte[1] ;
      P09OY10_A6058Lb_soluc = new int[1] ;
      P09OY10_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OY10_A490ForPrdUMe = new byte[1] ;
      P09OY10_A719PrdNum = new String[] {""} ;
      P09OY10_A5557Lb_LineaC = new short[1] ;
      A14096Lb_fibra = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      W719PrdNum = "" ;
      W5558LB_CantC = DecimalUtil.ZERO ;
      P09OY12_A396EmprCod = new String[] {""} ;
      P09OY12_A5532Lb_numero = new int[1] ;
      P09OY12_A5555Lb_opcion = new String[] {""} ;
      P09OY12_A6545Lb_PTinP = new byte[1] ;
      P09OY12_A6059Lb_solup = new int[1] ;
      P09OY12_A5562Lb_orden = new short[1] ;
      P09OY12_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OY12_A490ForPrdUMe = new byte[1] ;
      P09OY12_A719PrdNum = new String[] {""} ;
      P09OY12_A5560Lb_LineaPr = new short[1] ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      W5561LB_CantP = DecimalUtil.ZERO ;
      P09OY14_A396EmprCod = new String[] {""} ;
      P09OY14_A5532Lb_numero = new int[1] ;
      P09OY14_A5549Lb_UltOp = new String[] {""} ;
      P09OY14_A5717Lb_numopu = new byte[1] ;
      P09OY14_A252CliCod = new int[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.dupnlabconopcion__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.dupnlabconopcion__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.dupnlabconopcion__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.dupnlabconopcion__default(),
         new Object[] {
             new Object[] {
            P09OY2_A5548Lb_Obs, P09OY2_A396EmprCod, P09OY2_A5717Lb_numopu, P09OY2_A5569Lb_EstEns, P09OY2_A5549Lb_UltOp, P09OY2_A5546Lb_UsuM, P09OY2_A5545Lb_HoraM, P09OY2_A5544Lb_FechaM, P09OY2_A5543Lb_Usuario, P09OY2_A5542Lb_HoraE,
            P09OY2_A5541Lb_FechaE, P09OY2_A5537Lb_ColNum, P09OY2_A5532Lb_numero, P09OY2_A14087IluminaID, P09OY2_n14087IluminaID, P09OY2_A14090Lb_CliDest, P09OY2_n14090Lb_CliDest, P09OY2_A14089Lb_WebCode, P09OY2_n14089Lb_WebCode, P09OY2_A14088Lb_Gots,
            P09OY2_n14088Lb_Gots, P09OY2_A13323Lb_Branco1, P09OY2_A13303Lb_PrecioP, P09OY2_A13299Lb_PquiID, P09OY2_n13299Lb_PquiID, P09OY2_A12524Lb_staLb, P09OY2_n12524Lb_staLb, P09OY2_A10883Lb_obsLb, P09OY2_A9900Lb_obsCl, P09OY2_A8954Lb_diasER,
            P09OY2_A8953Lb_FecR, P09OY2_A8952Lb_FecN, P09OY2_A8951Lb_FecE, P09OY2_A8950Lb_NOpN, P09OY2_A8949Lb_NOpE, P09OY2_A8948Lb_NCoE, P09OY2_A8947Lb_NOpR, P09OY2_A8946Lb_NCoS, P09OY2_A7780Lb_Hila, P09OY2_A6847Lb_TraP6,
            P09OY2_A6846Lb_Tra6, P09OY2_A6845Lb_TraP5, P09OY2_A6844Lb_Tra5, P09OY2_A6843Lb_TraP4, P09OY2_A6842Lb_Tra4, P09OY2_A6658Lb_TraP3, P09OY2_A6657Lb_Tra3, P09OY2_A6656Lb_TraP2, P09OY2_A6655Lb_Tra2, P09OY2_A6654Lb_TraP1,
            P09OY2_A6653Lb_Tra1, P09OY2_A6644Lb_PriEns, P09OY2_A6618Lb_PedCod, P09OY2_A6546Lb_Pantone, P09OY2_A1514MacProCod, P09OY2_n1514MacProCod, P09OY2_A6057Lb_volum, P09OY2_A6056Lb_pesom, P09OY2_A5988Lb_nfibras, P09OY2_A5098TipDisCod,
            P09OY2_n5098TipDisCod, P09OY2_A5901Lab_desvio, P09OY2_A5801Lab_CodCau, P09OY2_n5801Lab_CodCau, P09OY2_A5701Lb_Local, P09OY2_A5700Lb_Talao, P09OY2_A5699Lb_EstLab, P09OY2_A5611Lb_Temp3, P09OY2_A5610Lb_Temp2, P09OY2_A5601Lb_Tempt,
            P09OY2_A5600Lb_IDM, P09OY2_A5599Lb_RGB, P09OY2_A5598Lb_impreso, P09OY2_A5597Lb_TipRec, P09OY2_A5596Lb_reprod, P09OY2_A5595Lb_malha, P09OY2_A5594Lb_cartazf, P09OY2_A5570Lb_Tipo, P09OY2_A5552Lb_TipArtD, P09OY2_A5550Lb_UltlPq,
            P09OY2_A3316CodSol, P09OY2_n3316CodSol, P09OY2_A626MatCod, P09OY2_n626MatCod, P09OY2_A583IntCod, P09OY2_n583IntCod, P09OY2_A5547Lb_Rb, P09OY2_A5540Lb_Cartaz, P09OY2_A5539Lb_ColNumC, P09OY2_A5538Lb_ColNomC,
            P09OY2_A831TipColCod, P09OY2_n831TipColCod, P09OY2_A5536Lb_ColNom, P09OY2_A5535Lb_TipArt, P09OY2_A5534Lb_ArtDsc, P09OY2_A5533Lb_ArtCod, P09OY2_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P09OY4_A396EmprCod, P09OY4_A5532Lb_numero, P09OY4_A8621Lb_Envio, P09OY4_A6372Lb_RecPip, P09OY4_A5553Lb_ForCod, P09OY4_A5551Lb_lineaPq
            }
            , new Object[] {
            }
            , new Object[] {
            P09OY6_A396EmprCod, P09OY6_A5563Lb_FechaR, P09OY6_A5566Lb_Estado, P09OY6_A5532Lb_numero, P09OY6_A5555Lb_opcion
            }
            , new Object[] {
            P09OY7_A396EmprCod, P09OY7_A5532Lb_numero, P09OY7_A5555Lb_opcion
            }
            , new Object[] {
            P09OY8_A396EmprCod, P09OY8_A12731Lb_ObsFac, P09OY8_A12526Lb_opFc, P09OY8_n12526Lb_opFc, P09OY8_A12525Lb_opSt, P09OY8_n12525Lb_opSt, P09OY8_A10082Lb_hhnoa1, P09OY8_A10081Lb_hhent1, P09OY8_A6631Lb_ProvDef, P09OY8_A6461Lb_FecNoa1,
            P09OY8_A6460Lb_FecEnt1, P09OY8_A6192Lb_FecPre, P09OY8_A5989Lb_PreKg, P09OY8_A5718Lb_numop, P09OY8_A5568Lb_HoraEn, P09OY8_A5567Lb_FechaEn, P09OY8_A5566Lb_Estado, P09OY8_A5564Lb_HoraR, P09OY8_A5563Lb_FechaR, P09OY8_A5555Lb_opcion,
            P09OY8_A5532Lb_numero, P09OY8_A13459Lb_UltLinC, P09OY8_n13459Lb_UltLinC, P09OY8_A10822Lb_ObsCR, P09OY8_A10083Lb_PreMt, P09OY8_A1127Lb_CosteC, P09OY8_A8622Lb_IntCod, P09OY8_A7395Lb_NumAux, P09OY8_A6375Lb_famc3, P09OY8_A6374Lb_famc2,
            P09OY8_A6373Lb_famc1, P09OY8_A6310Lb_TaAuxC, P09OY8_n6310Lb_TaAuxC, P09OY8_A5565Lb_CosteE, P09OY8_A5559Lb_UltlP, P09OY8_A5556Lb_UltLC
            }
            , new Object[] {
            }
            , new Object[] {
            P09OY10_A396EmprCod, P09OY10_A5532Lb_numero, P09OY10_A5555Lb_opcion, P09OY10_A14096Lb_fibra, P09OY10_A6544Lb_PTinC, P09OY10_A6058Lb_soluc, P09OY10_A5558LB_CantC, P09OY10_A490ForPrdUMe, P09OY10_A719PrdNum, P09OY10_A5557Lb_LineaC
            }
            , new Object[] {
            }
            , new Object[] {
            P09OY12_A396EmprCod, P09OY12_A5532Lb_numero, P09OY12_A5555Lb_opcion, P09OY12_A6545Lb_PTinP, P09OY12_A6059Lb_solup, P09OY12_A5562Lb_orden, P09OY12_A5561LB_CantP, P09OY12_A490ForPrdUMe, P09OY12_A719PrdNum, P09OY12_A5560Lb_LineaPr
            }
            , new Object[] {
            }
            , new Object[] {
            P09OY14_A396EmprCod, P09OY14_A5532Lb_numero, P09OY14_A5549Lb_UltOp, P09OY14_A5717Lb_numopu, P09OY14_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11FlagModa ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV14Creo_e ;
   private byte A5717Lb_numopu ;
   private byte A5569Lb_EstEns ;
   private byte A5988Lb_nfibras ;
   private byte A5699Lb_EstLab ;
   private byte A5598Lb_impreso ;
   private byte A5597Lb_TipRec ;
   private byte A5596Lb_reprod ;
   private byte A5595Lb_malha ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte W831TipColCod ;
   private byte W583IntCod ;
   private byte W5569Lb_EstEns ;
   private byte W5595Lb_malha ;
   private byte W5596Lb_reprod ;
   private byte W5597Lb_TipRec ;
   private byte W5598Lb_impreso ;
   private byte W5699Lb_EstLab ;
   private byte W5988Lb_nfibras ;
   private byte W5717Lb_numopu ;
   private byte A5566Lb_Estado ;
   private byte A5718Lb_numop ;
   private byte A8622Lb_IntCod ;
   private byte A7395Lb_NumAux ;
   private byte A6375Lb_famc3 ;
   private byte A6374Lb_famc2 ;
   private byte A6373Lb_famc1 ;
   private byte AV13LB_NUMOPU ;
   private byte W5566Lb_Estado ;
   private byte W5718Lb_numop ;
   private byte W6375Lb_famc3 ;
   private byte W6374Lb_famc2 ;
   private byte W6373Lb_famc1 ;
   private byte A6544Lb_PTinC ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private byte W6544Lb_PTinC ;
   private byte A6545Lb_PTinP ;
   private byte W6545Lb_PTinP ;
   private short A14087IluminaID ;
   private short A6847Lb_TraP6 ;
   private short A6845Lb_TraP5 ;
   private short A6843Lb_TraP4 ;
   private short A6658Lb_TraP3 ;
   private short A6656Lb_TraP2 ;
   private short A6654Lb_TraP1 ;
   private short A5901Lab_desvio ;
   private short A5801Lab_CodCau ;
   private short A5611Lb_Temp3 ;
   private short A5610Lb_Temp2 ;
   private short A5601Lb_Tempt ;
   private short A5550Lb_UltlPq ;
   private short A3316CodSol ;
   private short A626MatCod ;
   private short A5535Lb_TipArt ;
   private short W5535Lb_TipArt ;
   private short W626MatCod ;
   private short W3316CodSol ;
   private short W5550Lb_UltlPq ;
   private short W5601Lb_Tempt ;
   private short W5611Lb_Temp3 ;
   private short W5610Lb_Temp2 ;
   private short W5801Lab_CodCau ;
   private short W5901Lab_desvio ;
   private short W6654Lb_TraP1 ;
   private short W6656Lb_TraP2 ;
   private short W6658Lb_TraP3 ;
   private short Gx_err ;
   private short A5551Lb_lineaPq ;
   private short W5551Lb_lineaPq ;
   private short A13459Lb_UltLinC ;
   private short A5559Lb_UltlP ;
   private short A5556Lb_UltLC ;
   private short W5556Lb_UltLC ;
   private short W5559Lb_UltlP ;
   private short A5557Lb_LineaC ;
   private short W5557Lb_LineaC ;
   private short A5562Lb_orden ;
   private short A5560Lb_LineaPr ;
   private short W5560Lb_LineaPr ;
   private short W5562Lb_orden ;
   private int AV9Lb_numeroi ;
   private int AV8Lb_numero ;
   private int A5537Lb_ColNum ;
   private int A5532Lb_numero ;
   private int A14090Lb_CliDest ;
   private int A8954Lb_diasER ;
   private int A8950Lb_NOpN ;
   private int A8949Lb_NOpE ;
   private int A8948Lb_NCoE ;
   private int A8947Lb_NOpR ;
   private int A8946Lb_NCoS ;
   private int A5600Lb_IDM ;
   private int A5539Lb_ColNumC ;
   private int A252CliCod ;
   private int W5532Lb_numero ;
   private int GXv_int3[] ;
   private int AV17Lb_rclastn ;
   private int GXv_int5[] ;
   private int AV18Lb_prox ;
   private int GXv_int6[] ;
   private int GX_INS817 ;
   private int W252CliCod ;
   private int W5537Lb_ColNum ;
   private int W5539Lb_ColNumC ;
   private int W5600Lb_IDM ;
   private int GX_INS818 ;
   private int GX_INS819 ;
   private int A6058Lb_soluc ;
   private int GX_INS820 ;
   private int W6058Lb_soluc ;
   private int A6059Lb_solup ;
   private int GX_INS821 ;
   private int W6059Lb_solup ;
   private long A5599Lb_RGB ;
   private long W5599Lb_RGB ;
   private java.math.BigDecimal A13303Lb_PrecioP ;
   private java.math.BigDecimal A6057Lb_volum ;
   private java.math.BigDecimal A6056Lb_pesom ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal W5547Lb_Rb ;
   private java.math.BigDecimal W6056Lb_pesom ;
   private java.math.BigDecimal W6057Lb_volum ;
   private java.math.BigDecimal A5989Lb_PreKg ;
   private java.math.BigDecimal A10083Lb_PreMt ;
   private java.math.BigDecimal A1127Lb_CosteC ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal W5565Lb_CosteE ;
   private java.math.BigDecimal W5989Lb_PreKg ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal W5558LB_CantC ;
   private java.math.BigDecimal A5561LB_CantP ;
   private java.math.BigDecimal W5561LB_CantP ;
   private String A396EmprCod ;
   private String AV10usurcod ;
   private String scmdbuf ;
   private String A5549Lb_UltOp ;
   private String A5546Lb_UsuM ;
   private String A5543Lb_Usuario ;
   private String A14089Lb_WebCode ;
   private String A14088Lb_Gots ;
   private String A13323Lb_Branco1 ;
   private String A13299Lb_PquiID ;
   private String A12524Lb_staLb ;
   private String A7780Lb_Hila ;
   private String A6846Lb_Tra6 ;
   private String A6844Lb_Tra5 ;
   private String A6842Lb_Tra4 ;
   private String A6657Lb_Tra3 ;
   private String A6655Lb_Tra2 ;
   private String A6653Lb_Tra1 ;
   private String A6644Lb_PriEns ;
   private String A6618Lb_PedCod ;
   private String A6546Lb_Pantone ;
   private String A1514MacProCod ;
   private String A5098TipDisCod ;
   private String A5701Lb_Local ;
   private String A5700Lb_Talao ;
   private String A5570Lb_Tipo ;
   private String A5552Lb_TipArtD ;
   private String A5540Lb_Cartaz ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A5534Lb_ArtDsc ;
   private String A5533Lb_ArtCod ;
   private String W396EmprCod ;
   private String GXv_char4[] ;
   private String W5533Lb_ArtCod ;
   private String W5534Lb_ArtDsc ;
   private String W5536Lb_ColNom ;
   private String W5538Lb_ColNomC ;
   private String W5540Lb_Cartaz ;
   private String W5543Lb_Usuario ;
   private String W5546Lb_UsuM ;
   private String W5552Lb_TipArtD ;
   private String W5570Lb_Tipo ;
   private String W5701Lb_Local ;
   private String W5700Lb_Talao ;
   private String W5098TipDisCod ;
   private String W1514MacProCod ;
   private String W5549Lb_UltOp ;
   private String W6546Lb_Pantone ;
   private String W6618Lb_PedCod ;
   private String W6653Lb_Tra1 ;
   private String W6655Lb_Tra2 ;
   private String W6657Lb_Tra3 ;
   private String Gx_emsg ;
   private String A8621Lb_Envio ;
   private String A6372Lb_RecPip ;
   private String A5553Lb_ForCod ;
   private String W5553Lb_ForCod ;
   private String W6372Lb_RecPip ;
   private String AV16Lb_Opcion ;
   private String A5555Lb_opcion ;
   private String A12525Lb_opSt ;
   private String A6631Lb_ProvDef ;
   private String A6310Lb_TaAuxC ;
   private String W5555Lb_opcion ;
   private String AV12LB_ULTOP ;
   private String W6310Lb_TaAuxC ;
   private String W6631Lb_ProvDef ;
   private String W12525Lb_opSt ;
   private String A14096Lb_fibra ;
   private String A719PrdNum ;
   private String W719PrdNum ;
   private java.util.Date A5545Lb_HoraM ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date W5542Lb_HoraE ;
   private java.util.Date W5545Lb_HoraM ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date A10081Lb_hhent1 ;
   private java.util.Date A5568Lb_HoraEn ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date W5564Lb_HoraR ;
   private java.util.Date W5568Lb_HoraEn ;
   private java.util.Date W10081Lb_hhent1 ;
   private java.util.Date W10082Lb_hhnoa1 ;
   private java.util.Date A5544Lb_FechaM ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A8953Lb_FecR ;
   private java.util.Date A8952Lb_FecN ;
   private java.util.Date A8951Lb_FecE ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date W5541Lb_FechaE ;
   private java.util.Date W5544Lb_FechaM ;
   private java.util.Date W5594Lb_cartazf ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A12526Lb_opFc ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date A6460Lb_FecEnt1 ;
   private java.util.Date A6192Lb_FecPre ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date W5563Lb_FechaR ;
   private java.util.Date W5567Lb_FechaEn ;
   private java.util.Date W6192Lb_FecPre ;
   private java.util.Date W6460Lb_FecEnt1 ;
   private java.util.Date W6461Lb_FecNoa1 ;
   private java.util.Date W12526Lb_opFc ;
   private boolean n14087IluminaID ;
   private boolean n14090Lb_CliDest ;
   private boolean n14089Lb_WebCode ;
   private boolean n14088Lb_Gots ;
   private boolean n13299Lb_PquiID ;
   private boolean n12524Lb_staLb ;
   private boolean n1514MacProCod ;
   private boolean n5098TipDisCod ;
   private boolean n5801Lab_CodCau ;
   private boolean n3316CodSol ;
   private boolean n626MatCod ;
   private boolean n583IntCod ;
   private boolean n831TipColCod ;
   private boolean n12526Lb_opFc ;
   private boolean n12525Lb_opSt ;
   private boolean n13459Lb_UltLinC ;
   private boolean n6310Lb_TaAuxC ;
   private String A5548Lb_Obs ;
   private String W5548Lb_Obs ;
   private String A10883Lb_obsLb ;
   private String A9900Lb_obsCl ;
   private String A12731Lb_ObsFac ;
   private String A10822Lb_ObsCR ;
   private String W12731Lb_ObsFac ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09OY2_A5548Lb_Obs ;
   private String[] P09OY2_A396EmprCod ;
   private byte[] P09OY2_A5717Lb_numopu ;
   private byte[] P09OY2_A5569Lb_EstEns ;
   private String[] P09OY2_A5549Lb_UltOp ;
   private String[] P09OY2_A5546Lb_UsuM ;
   private java.util.Date[] P09OY2_A5545Lb_HoraM ;
   private java.util.Date[] P09OY2_A5544Lb_FechaM ;
   private String[] P09OY2_A5543Lb_Usuario ;
   private java.util.Date[] P09OY2_A5542Lb_HoraE ;
   private java.util.Date[] P09OY2_A5541Lb_FechaE ;
   private int[] P09OY2_A5537Lb_ColNum ;
   private int[] P09OY2_A5532Lb_numero ;
   private short[] P09OY2_A14087IluminaID ;
   private boolean[] P09OY2_n14087IluminaID ;
   private int[] P09OY2_A14090Lb_CliDest ;
   private boolean[] P09OY2_n14090Lb_CliDest ;
   private String[] P09OY2_A14089Lb_WebCode ;
   private boolean[] P09OY2_n14089Lb_WebCode ;
   private String[] P09OY2_A14088Lb_Gots ;
   private boolean[] P09OY2_n14088Lb_Gots ;
   private String[] P09OY2_A13323Lb_Branco1 ;
   private java.math.BigDecimal[] P09OY2_A13303Lb_PrecioP ;
   private String[] P09OY2_A13299Lb_PquiID ;
   private boolean[] P09OY2_n13299Lb_PquiID ;
   private String[] P09OY2_A12524Lb_staLb ;
   private boolean[] P09OY2_n12524Lb_staLb ;
   private String[] P09OY2_A10883Lb_obsLb ;
   private String[] P09OY2_A9900Lb_obsCl ;
   private int[] P09OY2_A8954Lb_diasER ;
   private java.util.Date[] P09OY2_A8953Lb_FecR ;
   private java.util.Date[] P09OY2_A8952Lb_FecN ;
   private java.util.Date[] P09OY2_A8951Lb_FecE ;
   private int[] P09OY2_A8950Lb_NOpN ;
   private int[] P09OY2_A8949Lb_NOpE ;
   private int[] P09OY2_A8948Lb_NCoE ;
   private int[] P09OY2_A8947Lb_NOpR ;
   private int[] P09OY2_A8946Lb_NCoS ;
   private String[] P09OY2_A7780Lb_Hila ;
   private short[] P09OY2_A6847Lb_TraP6 ;
   private String[] P09OY2_A6846Lb_Tra6 ;
   private short[] P09OY2_A6845Lb_TraP5 ;
   private String[] P09OY2_A6844Lb_Tra5 ;
   private short[] P09OY2_A6843Lb_TraP4 ;
   private String[] P09OY2_A6842Lb_Tra4 ;
   private short[] P09OY2_A6658Lb_TraP3 ;
   private String[] P09OY2_A6657Lb_Tra3 ;
   private short[] P09OY2_A6656Lb_TraP2 ;
   private String[] P09OY2_A6655Lb_Tra2 ;
   private short[] P09OY2_A6654Lb_TraP1 ;
   private String[] P09OY2_A6653Lb_Tra1 ;
   private String[] P09OY2_A6644Lb_PriEns ;
   private String[] P09OY2_A6618Lb_PedCod ;
   private String[] P09OY2_A6546Lb_Pantone ;
   private String[] P09OY2_A1514MacProCod ;
   private boolean[] P09OY2_n1514MacProCod ;
   private java.math.BigDecimal[] P09OY2_A6057Lb_volum ;
   private java.math.BigDecimal[] P09OY2_A6056Lb_pesom ;
   private byte[] P09OY2_A5988Lb_nfibras ;
   private String[] P09OY2_A5098TipDisCod ;
   private boolean[] P09OY2_n5098TipDisCod ;
   private short[] P09OY2_A5901Lab_desvio ;
   private short[] P09OY2_A5801Lab_CodCau ;
   private boolean[] P09OY2_n5801Lab_CodCau ;
   private String[] P09OY2_A5701Lb_Local ;
   private String[] P09OY2_A5700Lb_Talao ;
   private byte[] P09OY2_A5699Lb_EstLab ;
   private short[] P09OY2_A5611Lb_Temp3 ;
   private short[] P09OY2_A5610Lb_Temp2 ;
   private short[] P09OY2_A5601Lb_Tempt ;
   private int[] P09OY2_A5600Lb_IDM ;
   private long[] P09OY2_A5599Lb_RGB ;
   private byte[] P09OY2_A5598Lb_impreso ;
   private byte[] P09OY2_A5597Lb_TipRec ;
   private byte[] P09OY2_A5596Lb_reprod ;
   private byte[] P09OY2_A5595Lb_malha ;
   private java.util.Date[] P09OY2_A5594Lb_cartazf ;
   private String[] P09OY2_A5570Lb_Tipo ;
   private String[] P09OY2_A5552Lb_TipArtD ;
   private short[] P09OY2_A5550Lb_UltlPq ;
   private short[] P09OY2_A3316CodSol ;
   private boolean[] P09OY2_n3316CodSol ;
   private short[] P09OY2_A626MatCod ;
   private boolean[] P09OY2_n626MatCod ;
   private byte[] P09OY2_A583IntCod ;
   private boolean[] P09OY2_n583IntCod ;
   private java.math.BigDecimal[] P09OY2_A5547Lb_Rb ;
   private String[] P09OY2_A5540Lb_Cartaz ;
   private int[] P09OY2_A5539Lb_ColNumC ;
   private String[] P09OY2_A5538Lb_ColNomC ;
   private byte[] P09OY2_A831TipColCod ;
   private boolean[] P09OY2_n831TipColCod ;
   private String[] P09OY2_A5536Lb_ColNom ;
   private short[] P09OY2_A5535Lb_TipArt ;
   private String[] P09OY2_A5534Lb_ArtDsc ;
   private String[] P09OY2_A5533Lb_ArtCod ;
   private int[] P09OY2_A252CliCod ;
   private String[] P09OY4_A396EmprCod ;
   private int[] P09OY4_A5532Lb_numero ;
   private String[] P09OY4_A8621Lb_Envio ;
   private String[] P09OY4_A6372Lb_RecPip ;
   private String[] P09OY4_A5553Lb_ForCod ;
   private short[] P09OY4_A5551Lb_lineaPq ;
   private String[] P09OY6_A396EmprCod ;
   private java.util.Date[] P09OY6_A5563Lb_FechaR ;
   private byte[] P09OY6_A5566Lb_Estado ;
   private int[] P09OY6_A5532Lb_numero ;
   private String[] P09OY6_A5555Lb_opcion ;
   private String[] P09OY7_A396EmprCod ;
   private int[] P09OY7_A5532Lb_numero ;
   private String[] P09OY7_A5555Lb_opcion ;
   private String[] P09OY8_A396EmprCod ;
   private String[] P09OY8_A12731Lb_ObsFac ;
   private java.util.Date[] P09OY8_A12526Lb_opFc ;
   private boolean[] P09OY8_n12526Lb_opFc ;
   private String[] P09OY8_A12525Lb_opSt ;
   private boolean[] P09OY8_n12525Lb_opSt ;
   private java.util.Date[] P09OY8_A10082Lb_hhnoa1 ;
   private java.util.Date[] P09OY8_A10081Lb_hhent1 ;
   private String[] P09OY8_A6631Lb_ProvDef ;
   private java.util.Date[] P09OY8_A6461Lb_FecNoa1 ;
   private java.util.Date[] P09OY8_A6460Lb_FecEnt1 ;
   private java.util.Date[] P09OY8_A6192Lb_FecPre ;
   private java.math.BigDecimal[] P09OY8_A5989Lb_PreKg ;
   private byte[] P09OY8_A5718Lb_numop ;
   private java.util.Date[] P09OY8_A5568Lb_HoraEn ;
   private java.util.Date[] P09OY8_A5567Lb_FechaEn ;
   private byte[] P09OY8_A5566Lb_Estado ;
   private java.util.Date[] P09OY8_A5564Lb_HoraR ;
   private java.util.Date[] P09OY8_A5563Lb_FechaR ;
   private String[] P09OY8_A5555Lb_opcion ;
   private int[] P09OY8_A5532Lb_numero ;
   private short[] P09OY8_A13459Lb_UltLinC ;
   private boolean[] P09OY8_n13459Lb_UltLinC ;
   private String[] P09OY8_A10822Lb_ObsCR ;
   private java.math.BigDecimal[] P09OY8_A10083Lb_PreMt ;
   private java.math.BigDecimal[] P09OY8_A1127Lb_CosteC ;
   private byte[] P09OY8_A8622Lb_IntCod ;
   private byte[] P09OY8_A7395Lb_NumAux ;
   private byte[] P09OY8_A6375Lb_famc3 ;
   private byte[] P09OY8_A6374Lb_famc2 ;
   private byte[] P09OY8_A6373Lb_famc1 ;
   private String[] P09OY8_A6310Lb_TaAuxC ;
   private boolean[] P09OY8_n6310Lb_TaAuxC ;
   private java.math.BigDecimal[] P09OY8_A5565Lb_CosteE ;
   private short[] P09OY8_A5559Lb_UltlP ;
   private short[] P09OY8_A5556Lb_UltLC ;
   private String[] P09OY10_A396EmprCod ;
   private int[] P09OY10_A5532Lb_numero ;
   private String[] P09OY10_A5555Lb_opcion ;
   private String[] P09OY10_A14096Lb_fibra ;
   private byte[] P09OY10_A6544Lb_PTinC ;
   private int[] P09OY10_A6058Lb_soluc ;
   private java.math.BigDecimal[] P09OY10_A5558LB_CantC ;
   private byte[] P09OY10_A490ForPrdUMe ;
   private String[] P09OY10_A719PrdNum ;
   private short[] P09OY10_A5557Lb_LineaC ;
   private String[] P09OY12_A396EmprCod ;
   private int[] P09OY12_A5532Lb_numero ;
   private String[] P09OY12_A5555Lb_opcion ;
   private byte[] P09OY12_A6545Lb_PTinP ;
   private int[] P09OY12_A6059Lb_solup ;
   private short[] P09OY12_A5562Lb_orden ;
   private java.math.BigDecimal[] P09OY12_A5561LB_CantP ;
   private byte[] P09OY12_A490ForPrdUMe ;
   private String[] P09OY12_A719PrdNum ;
   private short[] P09OY12_A5560Lb_LineaPr ;
   private String[] P09OY14_A396EmprCod ;
   private int[] P09OY14_A5532Lb_numero ;
   private String[] P09OY14_A5549Lb_UltOp ;
   private byte[] P09OY14_A5717Lb_numopu ;
   private int[] P09OY14_A252CliCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class dupnlabconopcion__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class dupnlabconopcion__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class dupnlabconopcion__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class dupnlabconopcion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OY2", "SELECT Lb_Obs, EmprCod, Lb_numopu, Lb_EstEns, Lb_UltOp, Lb_UsuM, Lb_HoraM, Lb_FechaM, Lb_Usuario, Lb_HoraE, Lb_FechaE, Lb_ColNum, Lb_numero, IluminaID, Lb_CliDest, Lb_WebCode, Lb_Gots, Lb_Branco1, Lb_PrecioP, Lb_PquiID, Lb_staLb, Lb_obsLb, Lb_obsCl, Lb_diasER, Lb_FecR, Lb_FecN, Lb_FecE, Lb_NOpN, Lb_NOpE, Lb_NCoE, Lb_NOpR, Lb_NCoS, Lb_Hila, Lb_TraP6, Lb_Tra6, Lb_TraP5, Lb_Tra5, Lb_TraP4, Lb_Tra4, Lb_TraP3, Lb_Tra3, Lb_TraP2, Lb_Tra2, Lb_TraP1, Lb_Tra1, Lb_PriEns, Lb_PedCod, Lb_Pantone, MacProCod, Lb_volum, Lb_pesom, Lb_nfibras, TipDisCod, Lab_desvio, Lab_CodCau, Lb_Local, Lb_Talao, Lb_EstLab, Lb_Temp3, Lb_Temp2, Lb_Tempt, Lb_IDM, Lb_RGB, Lb_impreso, Lb_TipRec, Lb_reprod, Lb_malha, Lb_cartazf, Lb_Tipo, Lb_TipArtD, Lb_UltlPq, CodSol, MatCod, IntCod, Lb_Rb, Lb_Cartaz, Lb_ColNumC, Lb_ColNomC, TipColCod, Lb_ColNom, Lb_TipArt, Lb_ArtDsc, Lb_ArtCod, CliCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09OY3", "INSERT INTO TXPENS001(EmprCod, Lb_numero, CliCod, Lb_ArtCod, Lb_ArtDsc, Lb_TipArt, Lb_ColNom, Lb_ColNum, TipColCod, Lb_ColNomC, Lb_ColNumC, Lb_Cartaz, Lb_FechaE, Lb_HoraE, Lb_Usuario, Lb_FechaM, Lb_HoraM, Lb_UsuM, Lb_Rb, IntCod, MatCod, CodSol, Lb_Obs, Lb_UltOp, Lb_UltlPq, Lb_TipArtD, Lb_EstEns, Lb_Tipo, Lb_cartazf, Lb_malha, Lb_reprod, Lb_TipRec, Lb_impreso, Lb_RGB, Lb_IDM, Lb_Tempt, Lb_Temp2, Lb_Temp3, Lb_EstLab, Lb_Talao, Lb_Local, Lb_numopu, Lab_CodCau, Lab_desvio, TipDisCod, Lb_nfibras, Lb_pesom, Lb_volum, MacProCod, Lb_Pantone, Lb_PedCod, Lb_PriEns, Lb_Tra1, Lb_TraP1, Lb_Tra2, Lb_TraP2, Lb_Tra3, Lb_TraP3, Lb_Tra4, Lb_TraP4, Lb_Tra5, Lb_TraP5, Lb_Tra6, Lb_TraP6, Lb_Hila, Lb_NCoS, Lb_NOpR, Lb_NCoE, Lb_NOpE, Lb_NOpN, Lb_FecE, Lb_FecN, Lb_FecR, Lb_diasER, Lb_obsCl, Lb_obsLb, Lb_staLb, Lb_PquiID, Lb_PrecioP, Lb_Branco1, Lb_Gots, Lb_WebCode, Lb_CliDest, IluminaID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
         ,new ForEachCursor("P09OY4", "SELECT EmprCod, Lb_numero, Lb_Envio, Lb_RecPip, Lb_ForCod, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09OY5", "INSERT INTO TXPENS000(EmprCod, Lb_numero, Lb_lineaPq, Lb_ForCod, Lb_RecPip, Lb_Envio) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS000")
         ,new ForEachCursor("P09OY6", "SELECT * FROM (SELECT EmprCod, Lb_FechaR, Lb_Estado, Lb_numero, Lb_opcion FROM TXPENS002 WHERE (EmprCod = ? and Lb_numero = ?) AND (Not (Lb_FechaR = TO_DATE('0001-01-01', 'YYYY-MM-DD'))) AND (Lb_Estado = 2) ORDER BY EmprCod, Lb_numero, Lb_opcion) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09OY7", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09OY8", "SELECT EmprCod, Lb_ObsFac, Lb_opFc, Lb_opSt, Lb_hhnoa1, Lb_hhent1, Lb_ProvDef, Lb_FecNoa1, Lb_FecEnt1, Lb_FecPre, Lb_PreKg, Lb_numop, Lb_HoraEn, Lb_FechaEn, Lb_Estado, Lb_HoraR, Lb_FechaR, Lb_opcion, Lb_numero, Lb_UltLinC, Lb_ObsCR, Lb_PreMt, Lb_CosteC, Lb_IntCod, Lb_NumAux, Lb_famc3, Lb_famc2, Lb_famc1, Lb_TaAuxC, Lb_CosteE, Lb_UltlP, Lb_UltLC FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09OY9", "INSERT INTO TXPENS002(EmprCod, Lb_numero, Lb_opcion, Lb_UltLC, Lb_UltlP, Lb_FechaR, Lb_HoraR, Lb_CosteE, Lb_Estado, Lb_FechaEn, Lb_HoraEn, Lb_numop, Lb_PreKg, Lb_FecPre, Lb_TaAuxC, Lb_famc1, Lb_famc2, Lb_famc3, Lb_FecEnt1, Lb_FecNoa1, Lb_ProvDef, Lb_NumAux, Lb_IntCod, Lb_CosteC, Lb_hhent1, Lb_hhnoa1, Lb_PreMt, Lb_ObsCR, Lb_opSt, Lb_opFc, Lb_ObsFac, Lb_UltLinC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
         ,new ForEachCursor("P09OY10", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_fibra, Lb_PTinC, Lb_soluc, LB_CantC, ForPrdUMe, PrdNum, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09OY11", "INSERT INTO TXPENS003(EmprCod, Lb_numero, Lb_opcion, Lb_LineaC, PrdNum, ForPrdUMe, LB_CantC, Lb_soluc, Lb_PTinC, Lb_fibra) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS003")
         ,new ForEachCursor("P09OY12", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_PTinP, Lb_solup, Lb_orden, LB_CantP, ForPrdUMe, PrdNum, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09OY13", "INSERT INTO TXPENS004(EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr, PrdNum, ForPrdUMe, LB_CantP, Lb_orden, Lb_solup, Lb_PTinP) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS004")
         ,new ForEachCursor("P09OY14", "SELECT EmprCod, Lb_numero, Lb_UltOp, Lb_numopu, CliCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09OY15", "UPDATE TXPENS001 SET Lb_UltOp=?, Lb_numopu=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((java.util.Date[]) buf[9])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 60);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 30);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,5);
               ((String[]) buf[23])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(22);
               ((String[]) buf[28])[0] = rslt.getVarchar(23);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(25);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(26);
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(27);
               ((int[]) buf[33])[0] = rslt.getInt(28);
               ((int[]) buf[34])[0] = rslt.getInt(29);
               ((int[]) buf[35])[0] = rslt.getInt(30);
               ((int[]) buf[36])[0] = rslt.getInt(31);
               ((int[]) buf[37])[0] = rslt.getInt(32);
               ((String[]) buf[38])[0] = rslt.getString(33, 20);
               ((short[]) buf[39])[0] = rslt.getShort(34);
               ((String[]) buf[40])[0] = rslt.getString(35, 4);
               ((short[]) buf[41])[0] = rslt.getShort(36);
               ((String[]) buf[42])[0] = rslt.getString(37, 4);
               ((short[]) buf[43])[0] = rslt.getShort(38);
               ((String[]) buf[44])[0] = rslt.getString(39, 4);
               ((short[]) buf[45])[0] = rslt.getShort(40);
               ((String[]) buf[46])[0] = rslt.getString(41, 4);
               ((short[]) buf[47])[0] = rslt.getShort(42);
               ((String[]) buf[48])[0] = rslt.getString(43, 4);
               ((short[]) buf[49])[0] = rslt.getShort(44);
               ((String[]) buf[50])[0] = rslt.getString(45, 4);
               ((String[]) buf[51])[0] = rslt.getString(46, 1);
               ((String[]) buf[52])[0] = rslt.getString(47, 50);
               ((String[]) buf[53])[0] = rslt.getString(48, 100);
               ((String[]) buf[54])[0] = rslt.getString(49, 6);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(50,2);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(51,3);
               ((byte[]) buf[58])[0] = rslt.getByte(52);
               ((String[]) buf[59])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(54);
               ((short[]) buf[62])[0] = rslt.getShort(55);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(56, 10);
               ((String[]) buf[65])[0] = rslt.getString(57, 20);
               ((byte[]) buf[66])[0] = rslt.getByte(58);
               ((short[]) buf[67])[0] = rslt.getShort(59);
               ((short[]) buf[68])[0] = rslt.getShort(60);
               ((short[]) buf[69])[0] = rslt.getShort(61);
               ((int[]) buf[70])[0] = rslt.getInt(62);
               ((long[]) buf[71])[0] = rslt.getLong(63);
               ((byte[]) buf[72])[0] = rslt.getByte(64);
               ((byte[]) buf[73])[0] = rslt.getByte(65);
               ((byte[]) buf[74])[0] = rslt.getByte(66);
               ((byte[]) buf[75])[0] = rslt.getByte(67);
               ((java.util.Date[]) buf[76])[0] = rslt.getGXDate(68);
               ((String[]) buf[77])[0] = rslt.getString(69, 1);
               ((String[]) buf[78])[0] = rslt.getString(70, 30);
               ((short[]) buf[79])[0] = rslt.getShort(71);
               ((short[]) buf[80])[0] = rslt.getShort(72);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((short[]) buf[82])[0] = rslt.getShort(73);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((byte[]) buf[84])[0] = rslt.getByte(74);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(75,2);
               ((String[]) buf[87])[0] = rslt.getString(76, 20);
               ((int[]) buf[88])[0] = rslt.getInt(77);
               ((String[]) buf[89])[0] = rslt.getString(78, 13);
               ((byte[]) buf[90])[0] = rslt.getByte(79);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(80, 13);
               ((short[]) buf[93])[0] = rslt.getShort(81);
               ((String[]) buf[94])[0] = rslt.getString(82, 26);
               ((String[]) buf[95])[0] = rslt.getString(83, 16);
               ((int[]) buf[96])[0] = rslt.getInt(84);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((java.util.Date[]) buf[14])[0] = GXutil.resetDate(rslt.getGXDateTime(13));
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((java.util.Date[]) buf[17])[0] = GXutil.resetDate(rslt.getGXDateTime(16));
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(21);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(23,5);
               ((byte[]) buf[26])[0] = rslt.getByte(24);
               ((byte[]) buf[27])[0] = rslt.getByte(25);
               ((byte[]) buf[28])[0] = rslt.getByte(26);
               ((byte[]) buf[29])[0] = rslt.getByte(27);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 4);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(30,5);
               ((short[]) buf[34])[0] = rslt.getShort(31);
               ((short[]) buf[35])[0] = rslt.getShort(32);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 26);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 13);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[9]).byteValue());
               }
               stmt.setString(10, (String)parms[10], 13);
               stmt.setInt(11, ((Number) parms[11]).intValue());
               stmt.setString(12, (String)parms[12], 20);
               stmt.setDate(13, (java.util.Date)parms[13]);
               stmt.setDateTime(14, (java.util.Date)parms[14], true);
               stmt.setString(15, (String)parms[15], 10);
               stmt.setDate(16, (java.util.Date)parms[16]);
               stmt.setDateTime(17, (java.util.Date)parms[17], true);
               stmt.setString(18, (String)parms[18], 10);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 2);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[25]).shortValue());
               }
               stmt.setLongVarchar(23, (String)parms[26], false);
               stmt.setString(24, (String)parms[27], 1);
               stmt.setShort(25, ((Number) parms[28]).shortValue());
               stmt.setString(26, (String)parms[29], 30);
               stmt.setByte(27, ((Number) parms[30]).byteValue());
               stmt.setString(28, (String)parms[31], 1);
               stmt.setDate(29, (java.util.Date)parms[32]);
               stmt.setByte(30, ((Number) parms[33]).byteValue());
               stmt.setByte(31, ((Number) parms[34]).byteValue());
               stmt.setByte(32, ((Number) parms[35]).byteValue());
               stmt.setByte(33, ((Number) parms[36]).byteValue());
               stmt.setLong(34, ((Number) parms[37]).longValue());
               stmt.setInt(35, ((Number) parms[38]).intValue());
               stmt.setShort(36, ((Number) parms[39]).shortValue());
               stmt.setShort(37, ((Number) parms[40]).shortValue());
               stmt.setShort(38, ((Number) parms[41]).shortValue());
               stmt.setByte(39, ((Number) parms[42]).byteValue());
               stmt.setString(40, (String)parms[43], 20);
               stmt.setString(41, (String)parms[44], 10);
               stmt.setByte(42, ((Number) parms[45]).byteValue());
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[47]).shortValue());
               }
               stmt.setShort(44, ((Number) parms[48]).shortValue());
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[50], 1);
               }
               stmt.setByte(46, ((Number) parms[51]).byteValue());
               stmt.setBigDecimal(47, (java.math.BigDecimal)parms[52], 3);
               stmt.setBigDecimal(48, (java.math.BigDecimal)parms[53], 2);
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[55], 6);
               }
               stmt.setString(50, (String)parms[56], 100);
               stmt.setString(51, (String)parms[57], 50);
               stmt.setString(52, (String)parms[58], 1);
               stmt.setString(53, (String)parms[59], 4);
               stmt.setShort(54, ((Number) parms[60]).shortValue());
               stmt.setString(55, (String)parms[61], 4);
               stmt.setShort(56, ((Number) parms[62]).shortValue());
               stmt.setString(57, (String)parms[63], 4);
               stmt.setShort(58, ((Number) parms[64]).shortValue());
               stmt.setString(59, (String)parms[65], 4);
               stmt.setShort(60, ((Number) parms[66]).shortValue());
               stmt.setString(61, (String)parms[67], 4);
               stmt.setShort(62, ((Number) parms[68]).shortValue());
               stmt.setString(63, (String)parms[69], 4);
               stmt.setShort(64, ((Number) parms[70]).shortValue());
               stmt.setString(65, (String)parms[71], 20);
               stmt.setInt(66, ((Number) parms[72]).intValue());
               stmt.setInt(67, ((Number) parms[73]).intValue());
               stmt.setInt(68, ((Number) parms[74]).intValue());
               stmt.setInt(69, ((Number) parms[75]).intValue());
               stmt.setInt(70, ((Number) parms[76]).intValue());
               stmt.setDate(71, (java.util.Date)parms[77]);
               stmt.setDate(72, (java.util.Date)parms[78]);
               stmt.setDate(73, (java.util.Date)parms[79]);
               stmt.setInt(74, ((Number) parms[80]).intValue());
               stmt.setVarchar(75, (String)parms[81], 300, false);
               stmt.setVarchar(76, (String)parms[82], 300, false);
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[84], 1);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[86], 6);
               }
               stmt.setBigDecimal(79, (java.math.BigDecimal)parms[87], 5);
               stmt.setString(80, (String)parms[88], 30);
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[90], 1);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[92], 60);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(83, ((Number) parms[94]).intValue());
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(84, ((Number) parms[96]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setDateTime(7, (java.util.Date)parms[6], true);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setDate(10, (java.util.Date)parms[9]);
               stmt.setDateTime(11, (java.util.Date)parms[10], true);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 5);
               stmt.setDate(14, (java.util.Date)parms[13]);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[15], 4);
               }
               stmt.setByte(16, ((Number) parms[16]).byteValue());
               stmt.setByte(17, ((Number) parms[17]).byteValue());
               stmt.setByte(18, ((Number) parms[18]).byteValue());
               stmt.setDate(19, (java.util.Date)parms[19]);
               stmt.setDate(20, (java.util.Date)parms[20]);
               stmt.setString(21, (String)parms[21], 1);
               stmt.setByte(22, ((Number) parms[22]).byteValue());
               stmt.setByte(23, ((Number) parms[23]).byteValue());
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[24], 5);
               stmt.setDateTime(25, (java.util.Date)parms[25], true);
               stmt.setDateTime(26, (java.util.Date)parms[26], true);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[27], 5);
               stmt.setVarchar(28, (String)parms[28], 300, false);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DATE );
               }
               else
               {
                  stmt.setDate(30, (java.util.Date)parms[32]);
               }
               stmt.setVarchar(31, (String)parms[33], 200, false);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[35]).shortValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 4);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

