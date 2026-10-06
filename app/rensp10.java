package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rensp10 extends GXReport
{
   public rensp10( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rensp10.class ), "" );
   }

   public rensp10( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      rensp10.this.aP1 = new int[] {0};
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
      rensp10.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rensp10.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("FICHA ENSAYO PERVAFIL") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV48Contdsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS010", ""), GXv_char1) ;
         rensp10.this.AV48Contdsc = GXv_char1[0] ;
         GXt_char2 = AV19Lit1 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV19Lit1 = GXt_char2 ;
         GXt_char2 = AV20Lit2 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV20Lit2 = GXt_char2 ;
         GXt_char2 = AV22Lit4 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV22Lit4 = GXt_char2 ;
         GXt_char2 = AV23Lit5 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV23Lit5 = GXt_char2 ;
         GXt_char2 = AV24Lit6 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV24Lit6 = GXt_char2 ;
         GXt_char2 = AV25Lit7 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV25Lit7 = GXt_char2 ;
         GXt_char2 = AV26Lit8 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2065_", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV26Lit8 = GXt_char2 ;
         GXt_char2 = AV27Lit9 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV27Lit9 = GXt_char2 ;
         GXt_char2 = AV28Lit10 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1194_", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV28Lit10 = GXt_char2 ;
         GXt_char2 = AV29Lit11 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN236", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV29Lit11 = GXt_char2 ;
         GXt_char2 = AV30Lit12 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1164_", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV30Lit12 = GXt_char2 ;
         GXt_char2 = AV31Lit13 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(9), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV31Lit13 = GXt_char2 ;
         GXt_char2 = AV32Lit14 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1145_", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         GXt_char3 = AV32Lit14 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char4) ;
         rensp10.this.GXt_char3 = GXv_char4[0] ;
         AV32Lit14 = GXutil.trim( GXt_char2) + " / " + GXutil.trim( GXt_char3) ;
         GXt_char3 = AV34Lit16 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN176", ""), (byte)(99), GXv_char4) ;
         rensp10.this.GXt_char3 = GXv_char4[0] ;
         AV34Lit16 = GXt_char3 ;
         GXt_char3 = AV35Lit17 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN079_", ""), (byte)(99), GXv_char4) ;
         rensp10.this.GXt_char3 = GXv_char4[0] ;
         AV35Lit17 = GXt_char3 ;
         GXt_char3 = AV36Lit18 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rensp10.this.GXt_char3 = GXv_char4[0] ;
         AV36Lit18 = GXt_char3 ;
         GXt_char3 = AV37Lit19 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char4) ;
         rensp10.this.GXt_char3 = GXv_char4[0] ;
         AV37Lit19 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV38Lit20 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT558_", ""), (byte)(99), GXv_char4) ;
         rensp10.this.GXt_char3 = GXv_char4[0] ;
         AV38Lit20 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV39Lit21 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN209", ""), (byte)(99), GXv_char4) ;
         rensp10.this.GXt_char3 = GXv_char4[0] ;
         AV39Lit21 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV41Lit22 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN153_", ""), (byte)(99), GXv_char4) ;
         rensp10.this.GXt_char3 = GXv_char4[0] ;
         AV41Lit22 = GXutil.trim( GXt_char3) + httpContext.getMessage( " Barcada", "") ;
         GXt_char3 = AV42Lit23 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char4) ;
         rensp10.this.GXt_char3 = GXv_char4[0] ;
         AV42Lit23 = GXt_char3 ;
         GXt_char3 = AV43Lit24 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN208", ""), (byte)(99), GXv_char4) ;
         rensp10.this.GXt_char3 = GXv_char4[0] ;
         AV43Lit24 = GXt_char3 ;
         GXt_char3 = AV49Lit25 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1376_", ""), (byte)(99), GXv_char4) ;
         rensp10.this.GXt_char3 = GXv_char4[0] ;
         GXt_char2 = AV49Lit25 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char1) ;
         rensp10.this.GXt_char2 = GXv_char1[0] ;
         AV49Lit25 = GXutil.trim( GXt_char3) + " " + GXutil.trim( GXt_char2) ;
         /* Using cursor P072V2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5555Lb_opcion = P072V2_A5555Lb_opcion[0] ;
            AV62Workstat = GXutil.str( A5532Lb_numero, 8, 0) + A5555Lb_opcion ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int5[0] = A5532Lb_numero ;
            GXv_char1[0] = A5555Lb_opcion ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(1) ;
            GXv_decimal7[0] = DecimalUtil.doubleToDec(1) ;
            GXv_char8[0] = " " ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
            GXv_int10[0] = (short)(0) ;
            new app.pens035(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char1, GXv_decimal6, GXv_decimal7, GXv_char8, GXv_decimal9, GXv_int10) ;
            rensp10.this.A396EmprCod = GXv_char4[0] ;
            rensp10.this.A5532Lb_numero = GXv_int5[0] ;
            rensp10.this.A5555Lb_opcion = GXv_char1[0] ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P072V3 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A407EmprNom = P072V3_A407EmprNom[0] ;
            n407EmprNom = P072V3_n407EmprNom[0] ;
            AV18EmprNOm = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr4 = true ;
         /* Using cursor P072V4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5548Lb_Obs = P072V4_A5548Lb_Obs[0] ;
            A5535Lb_TipArt = P072V4_A5535Lb_TipArt[0] ;
            A5595Lb_malha = P072V4_A5595Lb_malha[0] ;
            A5570Lb_Tipo = P072V4_A5570Lb_Tipo[0] ;
            A6056Lb_pesom = P072V4_A6056Lb_pesom[0] ;
            A3316CodSol = P072V4_A3316CodSol[0] ;
            n3316CodSol = P072V4_n3316CodSol[0] ;
            A5701Lb_Local = P072V4_A5701Lb_Local[0] ;
            A5700Lb_Talao = P072V4_A5700Lb_Talao[0] ;
            A5600Lb_IDM = P072V4_A5600Lb_IDM[0] ;
            A5594Lb_cartazf = P072V4_A5594Lb_cartazf[0] ;
            A5545Lb_HoraM = P072V4_A5545Lb_HoraM[0] ;
            A5542Lb_HoraE = P072V4_A5542Lb_HoraE[0] ;
            A5546Lb_UsuM = P072V4_A5546Lb_UsuM[0] ;
            A5544Lb_FechaM = P072V4_A5544Lb_FechaM[0] ;
            A5543Lb_Usuario = P072V4_A5543Lb_Usuario[0] ;
            A5541Lb_FechaE = P072V4_A5541Lb_FechaE[0] ;
            A584IntDsc = P072V4_A584IntDsc[0] ;
            n584IntDsc = P072V4_n584IntDsc[0] ;
            A583IntCod = P072V4_A583IntCod[0] ;
            n583IntCod = P072V4_n583IntCod[0] ;
            A5540Lb_Cartaz = P072V4_A5540Lb_Cartaz[0] ;
            A832TipColDsc = P072V4_A832TipColDsc[0] ;
            n832TipColDsc = P072V4_n832TipColDsc[0] ;
            A831TipColCod = P072V4_A831TipColCod[0] ;
            n831TipColCod = P072V4_n831TipColCod[0] ;
            A5537Lb_ColNum = P072V4_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = P072V4_A5536Lb_ColNom[0] ;
            A5552Lb_TipArtD = P072V4_A5552Lb_TipArtD[0] ;
            A5534Lb_ArtDsc = P072V4_A5534Lb_ArtDsc[0] ;
            A5533Lb_ArtCod = P072V4_A5533Lb_ArtCod[0] ;
            A279CliNom = P072V4_A279CliNom[0] ;
            A252CliCod = P072V4_A252CliCod[0] ;
            A279CliNom = P072V4_A279CliNom[0] ;
            A584IntDsc = P072V4_A584IntDsc[0] ;
            n584IntDsc = P072V4_n584IntDsc[0] ;
            A832TipColDsc = P072V4_A832TipColDsc[0] ;
            n832TipColDsc = P072V4_n832TipColDsc[0] ;
            if ( A5595Lb_malha == 1 )
            {
               AV40Texto_m = httpContext.getMessage( "Cliente", "") ;
            }
            else if ( A5595Lb_malha == 2 )
            {
               AV40Texto_m = httpContext.getMessage( "Producción", "") ;
            }
            else if ( A5595Lb_malha == 3 )
            {
               AV40Texto_m = httpContext.getMessage( "Provisional", "") ;
            }
            else if ( A5595Lb_malha == 4 )
            {
               AV40Texto_m = httpContext.getMessage( "En espera", "") ;
            }
            else
            {
               AV40Texto_m = "" ;
            }
            if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "C", "")) == 0 )
            {
               AV44Texto_e = httpContext.getMessage( "CONTRATIPO", "") ;
            }
            else if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "P", "")) == 0 )
            {
               AV44Texto_e = httpContext.getMessage( "PRODUCCION", "") ;
            }
            else if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "M", "")) == 0 )
            {
               AV44Texto_e = httpContext.getMessage( "MUESTRARIO", "") ;
            }
            else if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "R", "")) == 0 )
            {
               AV44Texto_e = httpContext.getMessage( "REOPERADOS", "") ;
            }
            else
            {
               AV44Texto_e = "" ;
            }
            AV45CliCod = A252CliCod ;
            AV46Lb_artcod = A5533Lb_ArtCod ;
            /* Execute user subroutine: 'ARTICU' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV50Opcion = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV15Tab_cos[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               GX_J = 1 ;
               while ( GX_J <= 10 )
               {
                  AV10Tab_Opc[GX_I-1][GX_J-1] = (byte)(0) ;
                  GX_J = (int)(GX_J+1) ;
               }
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV58Tab_Prd[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV59Tab_Prn[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               GX_J = 1 ;
               while ( GX_J <= 10 )
               {
                  AV11Tab_Ctn[GX_I-1][GX_J-1] = DecimalUtil.doubleToDec(0) ;
                  GX_J = (int)(GX_J+1) ;
               }
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P072V5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A5556Lb_UltLC = P072V5_A5556Lb_UltLC[0] ;
               A5565Lb_CosteE = P072V5_A5565Lb_CosteE[0] ;
               A5718Lb_numop = P072V5_A5718Lb_numop[0] ;
               A5555Lb_opcion = P072V5_A5555Lb_opcion[0] ;
               AV15Tab_cos[AV50Opcion-1] = A5565Lb_CosteE ;
               AV13Lb_opcion = A5555Lb_opcion ;
               AV66Lb_numero = A5532Lb_numero ;
               AV69Lb_numop = A5718Lb_numop ;
               /* Execute user subroutine: 'ESCMAN' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(2);
                  pr_default.close(2);
                  pr_default.close(2);
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV50Opcion = (byte)(AV50Opcion+1) ;
               if ( AV50Opcion > 7 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV51Mas_Op = " " ;
            if ( AV50Opcion > 7 )
            {
               AV51Mas_Op = "....." ;
               AV50Opcion = (byte)(7) ;
            }
            AV8i = (short)(1) ;
            AV63ProForCod = "" ;
            AV67TxtProceso = (byte)(0) ;
            while ( AV8i <= AV53Lin )
            {
               AV50Opcion = (byte)(1) ;
               GX_I = 1 ;
               while ( GX_I <= 10 )
               {
                  AV9Ensayo[GX_I-1] = (byte)(0) ;
                  GX_I = (int)(GX_I+1) ;
               }
               GX_I = 1 ;
               while ( GX_I <= 10 )
               {
                  AV57Cantidad[GX_I-1] = DecimalUtil.ZERO ;
                  GX_I = (int)(GX_I+1) ;
               }
               GX_I = 1 ;
               while ( GX_I <= 10 )
               {
                  AV55Unidad[GX_I-1] = "" ;
                  GX_I = (int)(GX_I+1) ;
               }
               while ( AV50Opcion <= 7 )
               {
                  AV9Ensayo[AV50Opcion-1] = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV57Cantidad[AV50Opcion-1] = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV55Unidad[AV50Opcion-1] = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  AV50Opcion = (byte)(AV50Opcion+1) ;
               }
               if ( GXutil.strcmp(AV63ProForCod, AV70Tab_Pro[AV8i-1]) != 0 )
               {
                  AV63ProForCod = AV70Tab_Pro[AV8i-1] ;
                  /* Execute user subroutine: 'PROCESO' */
                  S131 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(2);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  /* Execute user subroutine: 'LINEA_PROCESO' */
                  S141 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(2);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               if ( AV8i == 1 )
               {
                  /* Execute user subroutine: 'CAB_LINEA' */
                  S151 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(2);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               if ( ( GXutil.strcmp(GXutil.substring( AV58Tab_Prd[AV8i-1], 1, 1), GXutil.substring( AV17PrdNumi, 1, 1)) != 0 ) && ! (GXutil.strcmp("", AV17PrdNumi)==0) )
               {
                  h72V0( false, 1) ;
                  getPrinter().GxDrawLine(11, Gx_line+0, 1119, Gx_line+0, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+1) ;
               }
               AV54Produc = AV58Tab_Prd[AV8i-1] ;
               AV52PrdDsc = AV59Tab_Prn[AV8i-1] ;
               AV16Orden = AV60Tab_Ord[AV8i-1] ;
               if ( GXutil.strcmp(AV68Tab_Tip[AV8i-1], httpContext.getMessage( "P", "")) == 0 )
               {
                  h72V0( false, 24) ;
                  getPrinter().GxAttris("Arial", 8, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[4-1], "ZZZZZ.ZZZZZ")), 645, Gx_line+4, 725, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[4-1], "")), 731, Gx_line+5, 758, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[5-1], "")), 851, Gx_line+5, 878, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[5-1], "ZZZZZ.ZZZZZ")), 765, Gx_line+4, 845, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[6-1], "")), 970, Gx_line+5, 997, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[6-1], "ZZZZZ.ZZZZZ")), 883, Gx_line+4, 963, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxDrawLine(999, Gx_line+0, 999, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(879, Gx_line+0, 879, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(760, Gx_line+0, 760, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(641, Gx_line+0, 641, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Produc, "")), 17, Gx_line+4, 61, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52PrdDsc, "")), 91, Gx_line+4, 281, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+24, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(284, Gx_line+0, 284, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(402, Gx_line+0, 402, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Orden, "")), 64, Gx_line+4, 86, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[1-1], "ZZZZZ.ZZZZZ")), 288, Gx_line+4, 368, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[1-1], "")), 374, Gx_line+5, 401, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(521, Gx_line+0, 521, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[3-1], "")), 611, Gx_line+5, 638, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[3-1], "ZZZZZ.ZZZZZ")), 525, Gx_line+4, 605, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[2-1], "")), 492, Gx_line+5, 519, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[2-1], "ZZZZZ.ZZZZZ")), 405, Gx_line+4, 485, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxDrawLine(1120, Gx_line+0, 1120, Gx_line+24, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[7-1], "ZZZZZ.ZZZZZ")), 1003, Gx_line+4, 1083, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[7-1], "")), 1090, Gx_line+5, 1117, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+23, 1119, Gx_line+23, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+24) ;
               }
               else
               {
                  h72V0( false, 24) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[2-1], "")), 492, Gx_line+5, 519, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[3-1], "ZZZZZ.ZZZZZ")), 525, Gx_line+4, 605, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[3-1], "")), 611, Gx_line+5, 638, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[4-1], "ZZZZZ.ZZZZZ")), 645, Gx_line+4, 725, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[4-1], "")), 731, Gx_line+5, 758, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(641, Gx_line+0, 641, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(521, Gx_line+0, 521, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(760, Gx_line+0, 760, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(879, Gx_line+0, 879, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(999, Gx_line+0, 999, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[6-1], "ZZZZZ.ZZZZZ")), 883, Gx_line+4, 963, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[6-1], "")), 970, Gx_line+5, 997, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[5-1], "ZZZZZ.ZZZZZ")), 765, Gx_line+4, 845, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[5-1], "")), 851, Gx_line+5, 878, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Produc, "")), 17, Gx_line+4, 61, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52PrdDsc, "")), 91, Gx_line+4, 281, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+24, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(284, Gx_line+0, 284, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(402, Gx_line+0, 402, Gx_line+24, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Orden, "")), 64, Gx_line+4, 86, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[1-1], "ZZZZZ.ZZZZZ")), 288, Gx_line+4, 368, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[1-1], "")), 374, Gx_line+5, 401, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[2-1], "ZZZZZ.ZZZZZ")), 405, Gx_line+4, 485, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxDrawLine(1120, Gx_line+0, 1120, Gx_line+24, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[7-1], "ZZZZZ.ZZZZZ")), 1003, Gx_line+4, 1083, Gx_line+20, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[7-1], "")), 1090, Gx_line+5, 1117, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+23, 1119, Gx_line+23, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+24) ;
               }
               AV17PrdNumi = AV54Produc ;
               AV8i = (short)(AV8i+1) ;
               AV61LinPag = (byte)(AV61LinPag+1) ;
               if ( AV61LinPag > 20 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  AV67TxtProceso = (byte)(0) ;
                  /* Execute user subroutine: 'LINEA_PROCESO' */
                  S141 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(2);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  /* Execute user subroutine: 'CAB_LINEA' */
                  S151 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(2);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
            }
            h72V0( false, 1) ;
            getPrinter().GxDrawLine(11, Gx_line+0, 1119, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            while ( AV61LinPag <= 20 )
            {
               h72V0( false, 24) ;
               getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(13, Gx_line+23, 1121, Gx_line+23, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(284, Gx_line+0, 284, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(402, Gx_line+0, 402, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(521, Gx_line+0, 521, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(641, Gx_line+0, 641, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(760, Gx_line+0, 760, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(879, Gx_line+0, 879, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(999, Gx_line+0, 999, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1120, Gx_line+0, 1120, Gx_line+24, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
               AV61LinPag = (byte)(AV61LinPag+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         GxHdr4 = false ;
         h72V0( false, 1) ;
         getPrinter().GxDrawLine(11, Gx_line+0, 1119, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+1) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h72V0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV47Compo = "" ;
      /* Using cursor P072V6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV45CliCod), AV46Lb_artcod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A65ArtCod = P072V6_A65ArtCod[0] ;
         A252CliCod = P072V6_A252CliCod[0] ;
         A105ArtTra1 = P072V6_A105ArtTra1[0] ;
         n105ArtTra1 = P072V6_n105ArtTra1[0] ;
         A108ArtTraP1 = P072V6_A108ArtTraP1[0] ;
         n108ArtTraP1 = P072V6_n108ArtTraP1[0] ;
         A106ArtTra2 = P072V6_A106ArtTra2[0] ;
         n106ArtTra2 = P072V6_n106ArtTra2[0] ;
         A109ArtTraP2 = P072V6_A109ArtTraP2[0] ;
         n109ArtTraP2 = P072V6_n109ArtTraP2[0] ;
         A107ArtTra3 = P072V6_A107ArtTra3[0] ;
         n107ArtTra3 = P072V6_n107ArtTra3[0] ;
         A110ArtTraP3 = P072V6_A110ArtTraP3[0] ;
         n110ArtTraP3 = P072V6_n110ArtTraP3[0] ;
         if ( ! (GXutil.strcmp("", A105ArtTra1)==0) )
         {
            AV47Compo = GXutil.trim( A105ArtTra1) + " " + GXutil.trim( GXutil.str( A108ArtTraP1, 3, 0)) + "% " ;
            if ( ! (GXutil.strcmp("", A106ArtTra2)==0) )
            {
               AV47Compo += GXutil.trim( A106ArtTra2) + " " + GXutil.trim( GXutil.str( A109ArtTraP2, 3, 0)) + "% " ;
            }
            if ( ! (GXutil.strcmp("", A107ArtTra3)==0) )
            {
               AV47Compo += GXutil.trim( A107ArtTra3) + " " + GXutil.trim( GXutil.str( A110ArtTraP3, 3, 0)) + "% " ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ESCMAN' Routine */
      returnInSub = false ;
      AV62Workstat = GXutil.str( AV66Lb_numero, 8, 0) + AV13Lb_opcion ;
      /* Using cursor P072V7 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV62Workstat});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A490ForPrdUMe = P072V7_A490ForPrdUMe[0] ;
         A910Workstat = P072V7_A910Workstat[0] ;
         A719PrdNum = P072V7_A719PrdNum[0] ;
         A897EscMDsc = P072V7_A897EscMDsc[0] ;
         A4709EscMMdlCod = P072V7_A4709EscMMdlCod[0] ;
         A764ProForCod = P072V7_A764ProForCod[0] ;
         A4712EscMFacCon = P072V7_A4712EscMFacCon[0] ;
         A488ForPrdDsc = P072V7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P072V7_n488ForPrdDsc[0] ;
         A887EscMLin = P072V7_A887EscMLin[0] ;
         A488ForPrdDsc = P072V7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P072V7_n488ForPrdDsc[0] ;
         AV53Lin = (short)(A887EscMLin) ;
         AV58Tab_Prd[AV53Lin-1] = A719PrdNum ;
         AV59Tab_Prn[AV53Lin-1] = A897EscMDsc ;
         AV68Tab_Tip[AV53Lin-1] = A4709EscMMdlCod ;
         AV70Tab_Pro[AV53Lin-1] = A764ProForCod ;
         AV10Tab_Opc[AV53Lin-1][AV50Opcion-1] = AV69Lb_numop ;
         AV11Tab_Ctn[AV53Lin-1][AV50Opcion-1] = A4712EscMFacCon ;
         AV56Tab_Uni[AV53Lin-1][AV50Opcion-1] = A488ForPrdDsc ;
         AV60Tab_Ord[AV53Lin-1] = " " ;
         if ( GXutil.strcmp(GXutil.substring( A4709EscMMdlCod, 1, 1), "#") == 0 )
         {
            AV60Tab_Ord[AV53Lin-1] = GXutil.substring( A4709EscMMdlCod, 1, 3) ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PROCESO' Routine */
      returnInSub = false ;
      AV71ProForDsc = "" ;
      /* Using cursor P072V8 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV63ProForCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A764ProForCod = P072V8_A764ProForCod[0] ;
         A766ProForDsc = P072V8_A766ProForDsc[0] ;
         AV71ProForDsc = A766ProForDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'LINEA_PROCESO' Routine */
      returnInSub = false ;
      AV31Lit13 = "" ;
      if ( AV67TxtProceso == 0 )
      {
         GXt_char3 = AV31Lit13 ;
         GXv_char8[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(9), GXv_char8) ;
         rensp10.this.GXt_char3 = GXv_char8[0] ;
         AV31Lit13 = GXt_char3 ;
      }
      AV67TxtProceso = (byte)(1) ;
      h72V0( false, 20) ;
      getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71ProForDsc, "")), 218, Gx_line+1, 375, Gx_line+18, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63ProForCod, "")), 140, Gx_line+1, 210, Gx_line+18, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit13, "")), 26, Gx_line+1, 95, Gx_line+17, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(11, Gx_line+19, 1119, Gx_line+19, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+20) ;
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'CAB_LINEA' Routine */
      returnInSub = false ;
      h72V0( false, 27) ;
      getPrinter().GxDrawLine(999, Gx_line+0, 999, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(879, Gx_line+0, 879, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[6-1], "ZZZZZ.ZZZZZ")), 883, Gx_line+7, 953, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[6-1]), "ZZ")), 970, Gx_line+6, 986, Gx_line+24, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[5-1]), "ZZ")), 851, Gx_line+6, 867, Gx_line+24, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[1-1]), "ZZ")), 374, Gx_line+7, 390, Gx_line+25, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[2-1]), "ZZ")), 492, Gx_line+6, 508, Gx_line+24, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[2-1], "ZZZZZ.ZZZZZ")), 405, Gx_line+7, 475, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[3-1]), "ZZ")), 611, Gx_line+6, 627, Gx_line+24, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[3-1], "ZZZZZ.ZZZZZ")), 525, Gx_line+7, 595, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[4-1]), "ZZ")), 731, Gx_line+6, 747, Gx_line+24, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[4-1], "ZZZZZ.ZZZZZ")), 645, Gx_line+7, 715, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[5-1], "ZZZZZ.ZZZZZ")), 765, Gx_line+7, 835, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(284, Gx_line+0, 284, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit14, "")), 80, Gx_line+6, 215, Gx_line+22, 1, 0, 0, 0) ;
      getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+28, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(402, Gx_line+0, 402, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(521, Gx_line+0, 521, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(641, Gx_line+0, 641, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(760, Gx_line+0, 760, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[1-1], "ZZZZZ.ZZZZZ")), 288, Gx_line+7, 358, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[7-1]), "ZZ")), 1083, Gx_line+6, 1099, Gx_line+24, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[7-1], "ZZZZZ.ZZZZZ")), 1003, Gx_line+7, 1073, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(1120, Gx_line+0, 1120, Gx_line+28, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Mas_Op, "")), 1101, Gx_line+6, 1117, Gx_line+22, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(11, Gx_line+26, 1119, Gx_line+26, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(11, Gx_line+0, 1119, Gx_line+0, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+27) ;
   }

   public void h72V0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if ( GxHdr4 )
            {
               getPrinter().GxDrawRect(11, Gx_line+3, 212, Gx_line+32, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 123, Gx_line+7, 199, Gx_line+28, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 111, Gx_line+53, 155, Gx_line+69, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 163, Gx_line+53, 382, Gx_line+69, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 111, Gx_line+114, 228, Gx_line+130, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5534Lb_ArtDsc, "")), 232, Gx_line+110, 503, Gx_line+129, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5552Lb_TipArtD, "")), 333, Gx_line+133, 552, Gx_line+149, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(11, Gx_line+44, 1120, Gx_line+159, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 111, Gx_line+72, 246, Gx_line+91, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9")), 254, Gx_line+72, 310, Gx_line+91, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 321, Gx_line+72, 340, Gx_line+91, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 344, Gx_line+72, 567, Gx_line+91, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 111, Gx_line+93, 257, Gx_line+109, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), 369, Gx_line+93, 384, Gx_line+109, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A584IntDsc, "")), 386, Gx_line+93, 605, Gx_line+109, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5541Lb_FechaE, "99/99/99"), 899, Gx_line+115, 957, Gx_line+131, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 1006, Gx_line+97, 1053, Gx_line+113, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5543Lb_Usuario, "")), 1006, Gx_line+115, 1079, Gx_line+131, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5544Lb_FechaM, "99/99/99"), 899, Gx_line+134, 957, Gx_line+150, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5546Lb_UsuM, "")), 1006, Gx_line+134, 1079, Gx_line+150, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5542Lb_HoraE, "99:99"), 964, Gx_line+115, 1000, Gx_line+131, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5545Lb_HoraM, "99:99"), 964, Gx_line+134, 1000, Gx_line+150, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(A5548Lb_Obs, 135, Gx_line+161, 1117, Gx_line+201, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A5594Lb_cartazf, "99/99/99"), 704, Gx_line+71, 769, Gx_line+91, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5600Lb_IDM), "ZZZZZZZ9")), 1049, Gx_line+71, 1107, Gx_line+87, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N.Hilo", ""), 567, Gx_line+114, 601, Gx_line+130, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18EmprNOm, "")), 442, Gx_line+13, 693, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 915, Gx_line+17, 973, Gx_line+33, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1043, Gx_line+17, 1101, Gx_line+33, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit4, "")), 24, Gx_line+9, 90, Gx_line+26, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit5, "")), 21, Gx_line+53, 93, Gx_line+69, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit6, "")), 21, Gx_line+93, 93, Gx_line+109, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit7, "")), 21, Gx_line+114, 93, Gx_line+130, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit8, "")), 21, Gx_line+73, 93, Gx_line+89, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit10, "")), 277, Gx_line+93, 349, Gx_line+109, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit12, "")), 21, Gx_line+161, 110, Gx_line+177, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit18, "")), 910, Gx_line+97, 945, Gx_line+113, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit19, "")), 968, Gx_line+97, 996, Gx_line+113, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit20, "")), 793, Gx_line+115, 875, Gx_line+131, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Texto_m, "")), 793, Gx_line+71, 939, Gx_line+87, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit22, "")), 1034, Gx_line+53, 1116, Gx_line+69, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5700Lb_Talao, "")), 567, Gx_line+133, 625, Gx_line+149, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit23, "")), 945, Gx_line+53, 1027, Gx_line+69, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5701Lb_Local, "")), 945, Gx_line+71, 1018, Gx_line+87, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit24, "")), 578, Gx_line+53, 686, Gx_line+69, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Texto_e, "")), 578, Gx_line+71, 698, Gx_line+91, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Compo, "")), 111, Gx_line+133, 330, Gx_line+149, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit25, "")), 793, Gx_line+53, 875, Gx_line+69, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit21, "")), 793, Gx_line+134, 875, Gx_line+150, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrega", ""), 694, Gx_line+53, 779, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 101, Gx_line+53, 105, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 101, Gx_line+114, 105, Gx_line+130, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 101, Gx_line+93, 105, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 98, Gx_line+9, 102, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit1, "")), 861, Gx_line+17, 896, Gx_line+33, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit2, "")), 1001, Gx_line+17, 1029, Gx_line+33, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 904, Gx_line+17, 908, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 1035, Gx_line+17, 1039, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3316CodSol), "ZZ9")), 1088, Gx_line+115, 1104, Gx_line+131, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("(", 1081, Gx_line+116, 1086, Gx_line+130, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(")", 1105, Gx_line+116, 1110, Gx_line+130, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 880, Gx_line+115, 884, Gx_line+131, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 880, Gx_line+134, 884, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(785, Gx_line+93, 1120, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(785, Gx_line+46, 785, Gx_line+159, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 101, Gx_line+73, 105, Gx_line+89, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 355, Gx_line+93, 359, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Composicion", ""), 21, Gx_line+133, 99, Gx_line+149, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 101, Gx_line+133, 105, Gx_line+149, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 113, Gx_line+161, 117, Gx_line+177, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Contdsc, "")), 967, Gx_line+1, 1051, Gx_line+12, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1053, Gx_line+0, 1071, Gx_line+13, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 1079, Gx_line+0, 1095, Gx_line+13, 0, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 1074, Gx_line+0, 1078, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6056Lb_pesom, "ZZZZ9.999")), 651, Gx_line+133, 717, Gx_line+149, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Gramos Muestra", ""), 641, Gx_line+114, 741, Gx_line+130, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("999999", 331, Gx_line+2, 388, Gx_line+22, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+205) ;
               AV61LinPag = (byte)(0) ;
            }
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   protected void cleanup( )
   {
      this.aP0[0] = rensp10.this.A396EmprCod;
      this.aP1[0] = rensp10.this.A5532Lb_numero;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV48Contdsc = "" ;
      AV19Lit1 = "" ;
      AV20Lit2 = "" ;
      AV22Lit4 = "" ;
      AV23Lit5 = "" ;
      AV24Lit6 = "" ;
      AV25Lit7 = "" ;
      AV26Lit8 = "" ;
      AV27Lit9 = "" ;
      AV28Lit10 = "" ;
      AV29Lit11 = "" ;
      AV30Lit12 = "" ;
      AV31Lit13 = "" ;
      AV32Lit14 = "" ;
      AV34Lit16 = "" ;
      AV35Lit17 = "" ;
      AV36Lit18 = "" ;
      AV37Lit19 = "" ;
      AV38Lit20 = "" ;
      AV39Lit21 = "" ;
      AV41Lit22 = "" ;
      AV42Lit23 = "" ;
      AV43Lit24 = "" ;
      AV49Lit25 = "" ;
      GXt_char2 = "" ;
      scmdbuf = "" ;
      P072V2_A396EmprCod = new String[] {""} ;
      P072V2_A5532Lb_numero = new int[1] ;
      P072V2_A5555Lb_opcion = new String[] {""} ;
      A5555Lb_opcion = "" ;
      AV62Workstat = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new short[1] ;
      P072V3_A396EmprCod = new String[] {""} ;
      P072V3_A407EmprNom = new String[] {""} ;
      P072V3_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18EmprNOm = "" ;
      P072V4_A5548Lb_Obs = new String[] {""} ;
      P072V4_A396EmprCod = new String[] {""} ;
      P072V4_A5532Lb_numero = new int[1] ;
      P072V4_A5535Lb_TipArt = new short[1] ;
      P072V4_A5595Lb_malha = new byte[1] ;
      P072V4_A5570Lb_Tipo = new String[] {""} ;
      P072V4_A6056Lb_pesom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P072V4_A3316CodSol = new short[1] ;
      P072V4_n3316CodSol = new boolean[] {false} ;
      P072V4_A5701Lb_Local = new String[] {""} ;
      P072V4_A5700Lb_Talao = new String[] {""} ;
      P072V4_A5600Lb_IDM = new int[1] ;
      P072V4_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P072V4_A5545Lb_HoraM = new java.util.Date[] {GXutil.nullDate()} ;
      P072V4_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P072V4_A5546Lb_UsuM = new String[] {""} ;
      P072V4_A5544Lb_FechaM = new java.util.Date[] {GXutil.nullDate()} ;
      P072V4_A5543Lb_Usuario = new String[] {""} ;
      P072V4_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P072V4_A584IntDsc = new String[] {""} ;
      P072V4_n584IntDsc = new boolean[] {false} ;
      P072V4_A583IntCod = new byte[1] ;
      P072V4_n583IntCod = new boolean[] {false} ;
      P072V4_A5540Lb_Cartaz = new String[] {""} ;
      P072V4_A832TipColDsc = new String[] {""} ;
      P072V4_n832TipColDsc = new boolean[] {false} ;
      P072V4_A831TipColCod = new byte[1] ;
      P072V4_n831TipColCod = new boolean[] {false} ;
      P072V4_A5537Lb_ColNum = new int[1] ;
      P072V4_A5536Lb_ColNom = new String[] {""} ;
      P072V4_A5552Lb_TipArtD = new String[] {""} ;
      P072V4_A5534Lb_ArtDsc = new String[] {""} ;
      P072V4_A5533Lb_ArtCod = new String[] {""} ;
      P072V4_A279CliNom = new String[] {""} ;
      P072V4_A252CliCod = new int[1] ;
      A5548Lb_Obs = "" ;
      A5570Lb_Tipo = "" ;
      A6056Lb_pesom = DecimalUtil.ZERO ;
      A5701Lb_Local = "" ;
      A5700Lb_Talao = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5545Lb_HoraM = GXutil.resetTime( GXutil.nullDate() );
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      A5546Lb_UsuM = "" ;
      A5544Lb_FechaM = GXutil.nullDate() ;
      A5543Lb_Usuario = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A584IntDsc = "" ;
      A5540Lb_Cartaz = "" ;
      A832TipColDsc = "" ;
      A5536Lb_ColNom = "" ;
      A5552Lb_TipArtD = "" ;
      A5534Lb_ArtDsc = "" ;
      A5533Lb_ArtCod = "" ;
      A279CliNom = "" ;
      AV40Texto_m = "" ;
      AV44Texto_e = "" ;
      AV46Lb_artcod = "" ;
      AV15Tab_cos = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV15Tab_cos[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV10Tab_Opc = new byte[100][10] ;
      AV58Tab_Prd = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV58Tab_Prd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV59Tab_Prn = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV59Tab_Prn[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV11Tab_Ctn = new java.math.BigDecimal[100][10] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV11Tab_Ctn[GX_I-1][GX_J-1] = DecimalUtil.ZERO ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      P072V5_A396EmprCod = new String[] {""} ;
      P072V5_A5532Lb_numero = new int[1] ;
      P072V5_A5556Lb_UltLC = new short[1] ;
      P072V5_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P072V5_A5718Lb_numop = new byte[1] ;
      P072V5_A5555Lb_opcion = new String[] {""} ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      AV13Lb_opcion = "" ;
      AV51Mas_Op = "" ;
      AV63ProForCod = "" ;
      AV9Ensayo = new byte[10] ;
      AV57Cantidad = new java.math.BigDecimal[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV57Cantidad[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV55Unidad = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV55Unidad[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV56Tab_Uni = new String[100][10] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV56Tab_Uni[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV70Tab_Pro = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV70Tab_Pro[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV17PrdNumi = "" ;
      AV54Produc = "" ;
      AV52PrdDsc = "" ;
      AV16Orden = "" ;
      AV60Tab_Ord = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV60Tab_Ord[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV68Tab_Tip = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV68Tab_Tip[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV47Compo = "" ;
      P072V6_A396EmprCod = new String[] {""} ;
      P072V6_A65ArtCod = new String[] {""} ;
      P072V6_A252CliCod = new int[1] ;
      P072V6_A105ArtTra1 = new String[] {""} ;
      P072V6_n105ArtTra1 = new boolean[] {false} ;
      P072V6_A108ArtTraP1 = new short[1] ;
      P072V6_n108ArtTraP1 = new boolean[] {false} ;
      P072V6_A106ArtTra2 = new String[] {""} ;
      P072V6_n106ArtTra2 = new boolean[] {false} ;
      P072V6_A109ArtTraP2 = new short[1] ;
      P072V6_n109ArtTraP2 = new boolean[] {false} ;
      P072V6_A107ArtTra3 = new String[] {""} ;
      P072V6_n107ArtTra3 = new boolean[] {false} ;
      P072V6_A110ArtTraP3 = new short[1] ;
      P072V6_n110ArtTraP3 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      P072V7_A490ForPrdUMe = new byte[1] ;
      P072V7_A396EmprCod = new String[] {""} ;
      P072V7_A910Workstat = new String[] {""} ;
      P072V7_A719PrdNum = new String[] {""} ;
      P072V7_A897EscMDsc = new String[] {""} ;
      P072V7_A4709EscMMdlCod = new String[] {""} ;
      P072V7_A764ProForCod = new String[] {""} ;
      P072V7_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P072V7_A488ForPrdDsc = new String[] {""} ;
      P072V7_n488ForPrdDsc = new boolean[] {false} ;
      P072V7_A887EscMLin = new int[1] ;
      A910Workstat = "" ;
      A719PrdNum = "" ;
      A897EscMDsc = "" ;
      A4709EscMMdlCod = "" ;
      A764ProForCod = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      AV71ProForDsc = "" ;
      P072V8_A396EmprCod = new String[] {""} ;
      P072V8_A764ProForCod = new String[] {""} ;
      P072V8_A766ProForDsc = new String[] {""} ;
      A766ProForDsc = "" ;
      GXt_char3 = "" ;
      GXv_char8 = new String[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rensp10__default(),
         new Object[] {
             new Object[] {
            P072V2_A396EmprCod, P072V2_A5532Lb_numero, P072V2_A5555Lb_opcion
            }
            , new Object[] {
            P072V3_A396EmprCod, P072V3_A407EmprNom, P072V3_n407EmprNom
            }
            , new Object[] {
            P072V4_A5548Lb_Obs, P072V4_A396EmprCod, P072V4_A5532Lb_numero, P072V4_A5535Lb_TipArt, P072V4_A5595Lb_malha, P072V4_A5570Lb_Tipo, P072V4_A6056Lb_pesom, P072V4_A3316CodSol, P072V4_n3316CodSol, P072V4_A5701Lb_Local,
            P072V4_A5700Lb_Talao, P072V4_A5600Lb_IDM, P072V4_A5594Lb_cartazf, P072V4_A5545Lb_HoraM, P072V4_A5542Lb_HoraE, P072V4_A5546Lb_UsuM, P072V4_A5544Lb_FechaM, P072V4_A5543Lb_Usuario, P072V4_A5541Lb_FechaE, P072V4_A584IntDsc,
            P072V4_n584IntDsc, P072V4_A583IntCod, P072V4_n583IntCod, P072V4_A5540Lb_Cartaz, P072V4_A832TipColDsc, P072V4_n832TipColDsc, P072V4_A831TipColCod, P072V4_n831TipColCod, P072V4_A5537Lb_ColNum, P072V4_A5536Lb_ColNom,
            P072V4_A5552Lb_TipArtD, P072V4_A5534Lb_ArtDsc, P072V4_A5533Lb_ArtCod, P072V4_A279CliNom, P072V4_A252CliCod
            }
            , new Object[] {
            P072V5_A396EmprCod, P072V5_A5532Lb_numero, P072V5_A5556Lb_UltLC, P072V5_A5565Lb_CosteE, P072V5_A5718Lb_numop, P072V5_A5555Lb_opcion
            }
            , new Object[] {
            P072V6_A396EmprCod, P072V6_A65ArtCod, P072V6_A252CliCod, P072V6_A105ArtTra1, P072V6_n105ArtTra1, P072V6_A108ArtTraP1, P072V6_n108ArtTraP1, P072V6_A106ArtTra2, P072V6_n106ArtTra2, P072V6_A109ArtTraP2,
            P072V6_n109ArtTraP2, P072V6_A107ArtTra3, P072V6_n107ArtTra3, P072V6_A110ArtTraP3, P072V6_n110ArtTraP3
            }
            , new Object[] {
            P072V7_A490ForPrdUMe, P072V7_A396EmprCod, P072V7_A910Workstat, P072V7_A719PrdNum, P072V7_A897EscMDsc, P072V7_A4709EscMMdlCod, P072V7_A764ProForCod, P072V7_A4712EscMFacCon, P072V7_A488ForPrdDsc, P072V7_n488ForPrdDsc,
            P072V7_A887EscMLin
            }
            , new Object[] {
            P072V8_A396EmprCod, P072V8_A764ProForCod, P072V8_A766ProForDsc
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A5595Lb_malha ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte AV50Opcion ;
   private byte AV10Tab_Opc[][] ;
   private byte A5718Lb_numop ;
   private byte AV69Lb_numop ;
   private byte AV67TxtProceso ;
   private byte AV9Ensayo[] ;
   private byte AV61LinPag ;
   private byte A490ForPrdUMe ;
   private short GXv_int10[] ;
   private short A5535Lb_TipArt ;
   private short A3316CodSol ;
   private short A5556Lb_UltLC ;
   private short AV8i ;
   private short AV53Lin ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GXv_int5[] ;
   private int A5600Lb_IDM ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int AV45CliCod ;
   private int GX_I ;
   private int GX_J ;
   private int AV66Lb_numero ;
   private int Gx_OldLine ;
   private int A887EscMLin ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal A6056Lb_pesom ;
   private java.math.BigDecimal AV15Tab_cos[] ;
   private java.math.BigDecimal AV11Tab_Ctn[][] ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal AV57Cantidad[] ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private String A396EmprCod ;
   private String AV48Contdsc ;
   private String AV19Lit1 ;
   private String AV20Lit2 ;
   private String AV22Lit4 ;
   private String AV23Lit5 ;
   private String AV24Lit6 ;
   private String AV25Lit7 ;
   private String AV26Lit8 ;
   private String AV27Lit9 ;
   private String AV28Lit10 ;
   private String AV29Lit11 ;
   private String AV30Lit12 ;
   private String AV31Lit13 ;
   private String AV32Lit14 ;
   private String AV34Lit16 ;
   private String AV35Lit17 ;
   private String AV36Lit18 ;
   private String AV37Lit19 ;
   private String AV38Lit20 ;
   private String AV39Lit21 ;
   private String AV41Lit22 ;
   private String AV42Lit23 ;
   private String AV43Lit24 ;
   private String AV49Lit25 ;
   private String GXt_char2 ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String AV62Workstat ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String A407EmprNom ;
   private String AV18EmprNOm ;
   private String A5570Lb_Tipo ;
   private String A5701Lb_Local ;
   private String A5700Lb_Talao ;
   private String A5546Lb_UsuM ;
   private String A5543Lb_Usuario ;
   private String A584IntDsc ;
   private String A5540Lb_Cartaz ;
   private String A832TipColDsc ;
   private String A5536Lb_ColNom ;
   private String A5552Lb_TipArtD ;
   private String A5534Lb_ArtDsc ;
   private String A5533Lb_ArtCod ;
   private String A279CliNom ;
   private String AV40Texto_m ;
   private String AV44Texto_e ;
   private String AV46Lb_artcod ;
   private String AV58Tab_Prd[] ;
   private String AV59Tab_Prn[] ;
   private String AV13Lb_opcion ;
   private String AV51Mas_Op ;
   private String AV63ProForCod ;
   private String AV55Unidad[] ;
   private String AV56Tab_Uni[][] ;
   private String AV70Tab_Pro[] ;
   private String AV17PrdNumi ;
   private String AV54Produc ;
   private String AV52PrdDsc ;
   private String AV16Orden ;
   private String AV60Tab_Ord[] ;
   private String AV68Tab_Tip[] ;
   private String AV47Compo ;
   private String A65ArtCod ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A910Workstat ;
   private String A719PrdNum ;
   private String A897EscMDsc ;
   private String A4709EscMMdlCod ;
   private String A764ProForCod ;
   private String A488ForPrdDsc ;
   private String AV71ProForDsc ;
   private String A766ProForDsc ;
   private String GXt_char3 ;
   private String GXv_char8[] ;
   private String Gx_time ;
   private java.util.Date A5545Lb_HoraM ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5544Lb_FechaM ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr4 ;
   private boolean n3316CodSol ;
   private boolean n584IntDsc ;
   private boolean n583IntCod ;
   private boolean n832TipColDsc ;
   private boolean n831TipColCod ;
   private boolean returnInSub ;
   private boolean n105ArtTra1 ;
   private boolean n108ArtTraP1 ;
   private boolean n106ArtTra2 ;
   private boolean n109ArtTraP2 ;
   private boolean n107ArtTra3 ;
   private boolean n110ArtTraP3 ;
   private boolean n488ForPrdDsc ;
   private String A5548Lb_Obs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P072V2_A396EmprCod ;
   private int[] P072V2_A5532Lb_numero ;
   private String[] P072V2_A5555Lb_opcion ;
   private String[] P072V3_A396EmprCod ;
   private String[] P072V3_A407EmprNom ;
   private boolean[] P072V3_n407EmprNom ;
   private String[] P072V4_A5548Lb_Obs ;
   private String[] P072V4_A396EmprCod ;
   private int[] P072V4_A5532Lb_numero ;
   private short[] P072V4_A5535Lb_TipArt ;
   private byte[] P072V4_A5595Lb_malha ;
   private String[] P072V4_A5570Lb_Tipo ;
   private java.math.BigDecimal[] P072V4_A6056Lb_pesom ;
   private short[] P072V4_A3316CodSol ;
   private boolean[] P072V4_n3316CodSol ;
   private String[] P072V4_A5701Lb_Local ;
   private String[] P072V4_A5700Lb_Talao ;
   private int[] P072V4_A5600Lb_IDM ;
   private java.util.Date[] P072V4_A5594Lb_cartazf ;
   private java.util.Date[] P072V4_A5545Lb_HoraM ;
   private java.util.Date[] P072V4_A5542Lb_HoraE ;
   private String[] P072V4_A5546Lb_UsuM ;
   private java.util.Date[] P072V4_A5544Lb_FechaM ;
   private String[] P072V4_A5543Lb_Usuario ;
   private java.util.Date[] P072V4_A5541Lb_FechaE ;
   private String[] P072V4_A584IntDsc ;
   private boolean[] P072V4_n584IntDsc ;
   private byte[] P072V4_A583IntCod ;
   private boolean[] P072V4_n583IntCod ;
   private String[] P072V4_A5540Lb_Cartaz ;
   private String[] P072V4_A832TipColDsc ;
   private boolean[] P072V4_n832TipColDsc ;
   private byte[] P072V4_A831TipColCod ;
   private boolean[] P072V4_n831TipColCod ;
   private int[] P072V4_A5537Lb_ColNum ;
   private String[] P072V4_A5536Lb_ColNom ;
   private String[] P072V4_A5552Lb_TipArtD ;
   private String[] P072V4_A5534Lb_ArtDsc ;
   private String[] P072V4_A5533Lb_ArtCod ;
   private String[] P072V4_A279CliNom ;
   private int[] P072V4_A252CliCod ;
   private String[] P072V5_A396EmprCod ;
   private int[] P072V5_A5532Lb_numero ;
   private short[] P072V5_A5556Lb_UltLC ;
   private java.math.BigDecimal[] P072V5_A5565Lb_CosteE ;
   private byte[] P072V5_A5718Lb_numop ;
   private String[] P072V5_A5555Lb_opcion ;
   private String[] P072V6_A396EmprCod ;
   private String[] P072V6_A65ArtCod ;
   private int[] P072V6_A252CliCod ;
   private String[] P072V6_A105ArtTra1 ;
   private boolean[] P072V6_n105ArtTra1 ;
   private short[] P072V6_A108ArtTraP1 ;
   private boolean[] P072V6_n108ArtTraP1 ;
   private String[] P072V6_A106ArtTra2 ;
   private boolean[] P072V6_n106ArtTra2 ;
   private short[] P072V6_A109ArtTraP2 ;
   private boolean[] P072V6_n109ArtTraP2 ;
   private String[] P072V6_A107ArtTra3 ;
   private boolean[] P072V6_n107ArtTra3 ;
   private short[] P072V6_A110ArtTraP3 ;
   private boolean[] P072V6_n110ArtTraP3 ;
   private byte[] P072V7_A490ForPrdUMe ;
   private String[] P072V7_A396EmprCod ;
   private String[] P072V7_A910Workstat ;
   private String[] P072V7_A719PrdNum ;
   private String[] P072V7_A897EscMDsc ;
   private String[] P072V7_A4709EscMMdlCod ;
   private String[] P072V7_A764ProForCod ;
   private java.math.BigDecimal[] P072V7_A4712EscMFacCon ;
   private String[] P072V7_A488ForPrdDsc ;
   private boolean[] P072V7_n488ForPrdDsc ;
   private int[] P072V7_A887EscMLin ;
   private String[] P072V8_A396EmprCod ;
   private String[] P072V8_A764ProForCod ;
   private String[] P072V8_A766ProForDsc ;
}

final  class rensp10__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P072V2", "SELECT EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P072V3", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P072V4", "SELECT T1.Lb_Obs, T1.EmprCod, T1.Lb_numero, T1.Lb_TipArt, T1.Lb_malha, T1.Lb_Tipo, T1.Lb_pesom, T1.CodSol, T1.Lb_Local, T1.Lb_Talao, T1.Lb_IDM, T1.Lb_cartazf, T1.Lb_HoraM, T1.Lb_HoraE, T1.Lb_UsuM, T1.Lb_FechaM, T1.Lb_Usuario, T1.Lb_FechaE, T3.IntDsc, T1.IntCod, T1.Lb_Cartaz, T4.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_TipArtD, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod FROM (((TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P072V5", "SELECT EmprCod, Lb_numero, Lb_UltLC, Lb_CosteE, Lb_numop, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P072V6", "SELECT EmprCod, ArtCod, CliCod, ArtTra1, ArtTraP1, ArtTra2, ArtTraP2, ArtTra3, ArtTraP3 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P072V7", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Workstat, T1.PrdNum, T1.EscMDsc, T1.EscMMdlCod, T1.ProForCod, T1.EscMFacCon, T2.ForPrdDsc, T1.EscMLin FROM (TXPESCMAN T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat, T1.EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P072V8", "SELECT EmprCod, ProForCod, ProForDsc FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 10);
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[13])[0] = GXutil.resetDate(rslt.getGXDateTime(13));
               ((java.util.Date[]) buf[14])[0] = GXutil.resetDate(rslt.getGXDateTime(14));
               ((String[]) buf[15])[0] = rslt.getString(15, 10);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 10);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 20);
               ((String[]) buf[24])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(23);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(24);
               ((String[]) buf[29])[0] = rslt.getString(25, 13);
               ((String[]) buf[30])[0] = rslt.getString(26, 30);
               ((String[]) buf[31])[0] = rslt.getString(27, 26);
               ((String[]) buf[32])[0] = rslt.getString(28, 16);
               ((String[]) buf[33])[0] = rslt.getString(29, 30);
               ((int[]) buf[34])[0] = rslt.getInt(30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

