package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class renss10 extends GXReport
{
   public renss10( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( renss10.class ), "" );
   }

   public renss10( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      renss10.this.aP1 = new int[] {0};
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
      renss10.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      renss10.this.A5532Lb_numero = aP1[0];
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("FICHA ENSAYO H.S.SEGURA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV48Contdsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS010", ""), GXv_char1) ;
         renss10.this.AV48Contdsc = GXv_char1[0] ;
         GXt_char2 = AV19Lit1 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV19Lit1 = GXt_char2 ;
         GXt_char2 = AV20Lit2 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV20Lit2 = GXt_char2 ;
         GXt_char2 = AV22Lit4 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV22Lit4 = GXt_char2 ;
         GXt_char2 = AV23Lit5 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV23Lit5 = GXt_char2 ;
         GXt_char2 = AV24Lit6 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL120_", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV24Lit6 = GXt_char2 ;
         GXt_char2 = AV25Lit7 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV25Lit7 = GXt_char2 ;
         GXt_char2 = AV26Lit8 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV26Lit8 = GXt_char2 ;
         GXt_char2 = AV27Lit9 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV27Lit9 = GXt_char2 ;
         GXt_char2 = AV28Lit10 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1194_", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV28Lit10 = GXt_char2 ;
         GXt_char2 = AV29Lit11 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN236", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV29Lit11 = GXt_char2 ;
         GXt_char2 = AV30Lit12 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1164_", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV30Lit12 = GXt_char2 ;
         GXt_char2 = AV31Lit13 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(9), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV31Lit13 = GXt_char2 ;
         GXt_char2 = AV32Lit14 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1145_", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         GXt_char3 = AV32Lit14 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char4) ;
         renss10.this.GXt_char3 = GXv_char4[0] ;
         AV32Lit14 = GXutil.trim( GXt_char2) + " / " + GXutil.trim( GXt_char3) ;
         GXt_char3 = AV34Lit16 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN176", ""), (byte)(99), GXv_char4) ;
         renss10.this.GXt_char3 = GXv_char4[0] ;
         AV34Lit16 = GXt_char3 ;
         GXt_char3 = AV35Lit17 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN079_", ""), (byte)(99), GXv_char4) ;
         renss10.this.GXt_char3 = GXv_char4[0] ;
         AV35Lit17 = GXt_char3 ;
         GXt_char3 = AV36Lit18 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         renss10.this.GXt_char3 = GXv_char4[0] ;
         AV36Lit18 = GXt_char3 ;
         GXt_char3 = AV37Lit19 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char4) ;
         renss10.this.GXt_char3 = GXv_char4[0] ;
         AV37Lit19 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV38Lit20 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT558_", ""), (byte)(99), GXv_char4) ;
         renss10.this.GXt_char3 = GXv_char4[0] ;
         AV38Lit20 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV39Lit21 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN209", ""), (byte)(99), GXv_char4) ;
         renss10.this.GXt_char3 = GXv_char4[0] ;
         AV39Lit21 = GXutil.trim( GXt_char3) ;
         AV41Lit22 = httpContext.getMessage( "Peso", "") ;
         GXt_char3 = AV42Lit23 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char4) ;
         renss10.this.GXt_char3 = GXv_char4[0] ;
         AV42Lit23 = GXt_char3 ;
         GXt_char3 = AV43Lit24 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN208", ""), (byte)(99), GXv_char4) ;
         renss10.this.GXt_char3 = GXv_char4[0] ;
         AV43Lit24 = GXt_char3 ;
         GXt_char3 = AV49Lit25 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1376_", ""), (byte)(99), GXv_char4) ;
         renss10.this.GXt_char3 = GXv_char4[0] ;
         GXt_char2 = AV49Lit25 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char1) ;
         renss10.this.GXt_char2 = GXv_char1[0] ;
         AV49Lit25 = GXutil.trim( GXt_char3) + " " + GXutil.trim( GXt_char2) ;
         /* Using cursor P07492 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5555Lb_opcion = P07492_A5555Lb_opcion[0] ;
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
            renss10.this.A396EmprCod = GXv_char4[0] ;
            renss10.this.A5532Lb_numero = GXv_int5[0] ;
            renss10.this.A5555Lb_opcion = GXv_char1[0] ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P07493 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A407EmprNom = P07493_A407EmprNom[0] ;
            n407EmprNom = P07493_n407EmprNom[0] ;
            AV18EmprNOm = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr4 = true ;
         /* Using cursor P07494 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5548Lb_Obs = P07494_A5548Lb_Obs[0] ;
            A5535Lb_TipArt = P07494_A5535Lb_TipArt[0] ;
            A5570Lb_Tipo = P07494_A5570Lb_Tipo[0] ;
            A5601Lb_Tempt = P07494_A5601Lb_Tempt[0] ;
            A5610Lb_Temp2 = P07494_A5610Lb_Temp2[0] ;
            A5611Lb_Temp3 = P07494_A5611Lb_Temp3[0] ;
            A5537Lb_ColNum = P07494_A5537Lb_ColNum[0] ;
            A831TipColCod = P07494_A831TipColCod[0] ;
            n831TipColCod = P07494_n831TipColCod[0] ;
            A5547Lb_Rb = P07494_A5547Lb_Rb[0] ;
            A6057Lb_volum = P07494_A6057Lb_volum[0] ;
            A832TipColDsc = P07494_A832TipColDsc[0] ;
            n832TipColDsc = P07494_n832TipColDsc[0] ;
            A5536Lb_ColNom = P07494_A5536Lb_ColNom[0] ;
            A6056Lb_pesom = P07494_A6056Lb_pesom[0] ;
            A5701Lb_Local = P07494_A5701Lb_Local[0] ;
            A5700Lb_Talao = P07494_A5700Lb_Talao[0] ;
            A5594Lb_cartazf = P07494_A5594Lb_cartazf[0] ;
            A5545Lb_HoraM = P07494_A5545Lb_HoraM[0] ;
            A5542Lb_HoraE = P07494_A5542Lb_HoraE[0] ;
            A5546Lb_UsuM = P07494_A5546Lb_UsuM[0] ;
            A5544Lb_FechaM = P07494_A5544Lb_FechaM[0] ;
            A5543Lb_Usuario = P07494_A5543Lb_Usuario[0] ;
            A5541Lb_FechaE = P07494_A5541Lb_FechaE[0] ;
            A584IntDsc = P07494_A584IntDsc[0] ;
            n584IntDsc = P07494_n584IntDsc[0] ;
            A583IntCod = P07494_A583IntCod[0] ;
            n583IntCod = P07494_n583IntCod[0] ;
            A5540Lb_Cartaz = P07494_A5540Lb_Cartaz[0] ;
            A5552Lb_TipArtD = P07494_A5552Lb_TipArtD[0] ;
            A5534Lb_ArtDsc = P07494_A5534Lb_ArtDsc[0] ;
            A5533Lb_ArtCod = P07494_A5533Lb_ArtCod[0] ;
            A279CliNom = P07494_A279CliNom[0] ;
            A252CliCod = P07494_A252CliCod[0] ;
            A279CliNom = P07494_A279CliNom[0] ;
            A584IntDsc = P07494_A584IntDsc[0] ;
            n584IntDsc = P07494_n584IntDsc[0] ;
            A832TipColDsc = P07494_A832TipColDsc[0] ;
            n832TipColDsc = P07494_n832TipColDsc[0] ;
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
            AV74Lb_Temp2 = A5601Lb_Tempt ;
            AV75Lb_Temp3 = A5610Lb_Temp2 ;
            AV73Lb_Tempt = A5611Lb_Temp3 ;
            AV76Lb_ColNum = A5537Lb_ColNum ;
            AV77TipColCod = A831TipColCod ;
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
            /* Using cursor P07495 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A5556Lb_UltLC = P07495_A5556Lb_UltLC[0] ;
               A5565Lb_CosteE = P07495_A5565Lb_CosteE[0] ;
               A5718Lb_numop = P07495_A5718Lb_numop[0] ;
               A5555Lb_opcion = P07495_A5555Lb_opcion[0] ;
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
               if ( AV50Opcion > 6 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV51Mas_Op = " " ;
            if ( AV50Opcion > 6 )
            {
               AV51Mas_Op = "....." ;
               AV50Opcion = (byte)(6) ;
            }
            AV8i = (short)(1) ;
            AV63ProForCod = "" ;
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
               while ( AV50Opcion <= 6 )
               {
                  AV9Ensayo[AV50Opcion-1] = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  if ( (0==AV9Ensayo[AV50Opcion-1]) && ( AV50Opcion > 1 ) )
                  {
                     AV9Ensayo[AV50Opcion-1] = (byte)(AV9Ensayo[AV50Opcion-1-1]+1) ;
                  }
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
                  if ( AV61LinPag > 21 )
                  {
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
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
               AV54Produc = AV58Tab_Prd[AV8i-1] ;
               AV52PrdDsc = AV59Tab_Prn[AV8i-1] ;
               AV16Orden = AV60Tab_Ord[AV8i-1] ;
               if ( AV61LinPag > 21 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
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
               h7490( false, 24) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[4-1], "ZZZZZ.ZZZZZ")), 728, Gx_line+4, 802, Gx_line+20, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[5-1], "ZZZZZ.ZZZZZ")), 860, Gx_line+4, 934, Gx_line+20, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[6-1], "ZZZZZ.ZZZZZ")), 993, Gx_line+4, 1067, Gx_line+20, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(983, Gx_line+0, 983, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(852, Gx_line+0, 852, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(721, Gx_line+0, 721, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(327, Gx_line+0, 327, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(458, Gx_line+0, 458, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[1-1], "ZZZZZ.ZZZZZ")), 330, Gx_line+4, 404, Gx_line+20, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(590, Gx_line+0, 590, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[3-1], "ZZZZZ.ZZZZZ")), 595, Gx_line+4, 669, Gx_line+20, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Cantidad[2-1], "ZZZZZ.ZZZZZ")), 461, Gx_line+4, 535, Gx_line+20, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(1115, Gx_line+0, 1115, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(11, Gx_line+23, 1114, Gx_line+23, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(408, Gx_line+4, 408, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1076, Gx_line+4, 1076, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(945, Gx_line+4, 945, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+4, 811, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(679, Gx_line+4, 679, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(546, Gx_line+4, 546, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Produc, "")), 16, Gx_line+4, 60, Gx_line+20, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Orden, "")), 63, Gx_line+4, 85, Gx_line+20, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52PrdDsc, "")), 86, Gx_line+4, 306, Gx_line+20, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Unidad[1-1], "")), 308, Gx_line+5, 326, Gx_line+20, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
               AV17PrdNumi = AV54Produc ;
               AV8i = (short)(AV8i+1) ;
               AV61LinPag = (byte)(AV61LinPag+1) ;
            }
            while ( AV61LinPag <= 21 )
            {
               h7490( false, 24) ;
               getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(11, Gx_line+23, 1114, Gx_line+23, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(327, Gx_line+0, 327, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(458, Gx_line+0, 458, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(590, Gx_line+0, 590, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(721, Gx_line+0, 721, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(852, Gx_line+0, 852, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(983, Gx_line+0, 983, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1115, Gx_line+0, 1115, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(408, Gx_line+4, 408, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(546, Gx_line+4, 546, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(679, Gx_line+4, 679, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(811, Gx_line+4, 811, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(945, Gx_line+4, 945, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1076, Gx_line+4, 1076, Gx_line+20, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
               AV61LinPag = (byte)(AV61LinPag+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         GxHdr4 = false ;
         h7490( false, 1) ;
         getPrinter().GxDrawLine(11, Gx_line+0, 1114, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+1) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7490( true, 0) ;
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
      /* Using cursor P07496 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV45CliCod), AV46Lb_artcod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A65ArtCod = P07496_A65ArtCod[0] ;
         A252CliCod = P07496_A252CliCod[0] ;
         A105ArtTra1 = P07496_A105ArtTra1[0] ;
         n105ArtTra1 = P07496_n105ArtTra1[0] ;
         A108ArtTraP1 = P07496_A108ArtTraP1[0] ;
         n108ArtTraP1 = P07496_n108ArtTraP1[0] ;
         A106ArtTra2 = P07496_A106ArtTra2[0] ;
         n106ArtTra2 = P07496_n106ArtTra2[0] ;
         A109ArtTraP2 = P07496_A109ArtTraP2[0] ;
         n109ArtTraP2 = P07496_n109ArtTraP2[0] ;
         A107ArtTra3 = P07496_A107ArtTra3[0] ;
         n107ArtTra3 = P07496_n107ArtTra3[0] ;
         A110ArtTraP3 = P07496_A110ArtTraP3[0] ;
         n110ArtTraP3 = P07496_n110ArtTraP3[0] ;
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
      /* Using cursor P07497 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV62Workstat});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A490ForPrdUMe = P07497_A490ForPrdUMe[0] ;
         A910Workstat = P07497_A910Workstat[0] ;
         A719PrdNum = P07497_A719PrdNum[0] ;
         A897EscMDsc = P07497_A897EscMDsc[0] ;
         A4709EscMMdlCod = P07497_A4709EscMMdlCod[0] ;
         A764ProForCod = P07497_A764ProForCod[0] ;
         A4712EscMFacCon = P07497_A4712EscMFacCon[0] ;
         A488ForPrdDsc = P07497_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P07497_n488ForPrdDsc[0] ;
         A887EscMLin = P07497_A887EscMLin[0] ;
         A488ForPrdDsc = P07497_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P07497_n488ForPrdDsc[0] ;
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
      /* Using cursor P07498 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV63ProForCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A764ProForCod = P07498_A764ProForCod[0] ;
         A766ProForDsc = P07498_A766ProForDsc[0] ;
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
      if ( AV8i == 1 )
      {
         h7490( false, 24) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71ProForDsc, "")), 119, Gx_line+3, 286, Gx_line+20, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63ProForCod, "")), 63, Gx_line+3, 113, Gx_line+20, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(11, Gx_line+23, 1114, Gx_line+23, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[1-1]), "ZZ")), 335, Gx_line+4, 350, Gx_line+21, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[2-1]), "ZZ")), 467, Gx_line+4, 482, Gx_line+21, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[3-1]), "ZZ")), 599, Gx_line+4, 614, Gx_line+21, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[4-1]), "ZZ")), 729, Gx_line+4, 744, Gx_line+21, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[5-1]), "ZZ")), 860, Gx_line+4, 875, Gx_line+21, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Ensayo[6-1]), "ZZ")), 992, Gx_line+4, 1007, Gx_line+21, 1, 0, 0, 0) ;
         getPrinter().GxDrawLine(883, Gx_line+0, 883, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(751, Gx_line+0, 751, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(621, Gx_line+0, 621, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(489, Gx_line+0, 489, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(357, Gx_line+0, 357, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(327, Gx_line+0, 327, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(458, Gx_line+0, 458, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(590, Gx_line+0, 590, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(721, Gx_line+0, 721, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(852, Gx_line+0, 852, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(983, Gx_line+0, 983, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(1014, Gx_line+0, 1014, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(983, Gx_line+0, 1014, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(458, Gx_line+0, 489, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(591, Gx_line+0, 622, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(721, Gx_line+0, 752, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(852, Gx_line+0, 883, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(327, Gx_line+0, 358, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+24) ;
      }
      else
      {
         h7490( false, 24) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63ProForCod, "")), 63, Gx_line+3, 113, Gx_line+20, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71ProForDsc, "")), 119, Gx_line+3, 286, Gx_line+20, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(11, Gx_line+23, 1114, Gx_line+23, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(11, Gx_line+0, 1114, Gx_line+0, 2, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+24) ;
      }
      AV61LinPag = (byte)(AV61LinPag+1) ;
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'CAB_LINEA' Routine */
      returnInSub = false ;
      h7490( false, 27) ;
      getPrinter().GxDrawLine(983, Gx_line+0, 983, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[6-1], "ZZZZZ.ZZZZZ")), 1020, Gx_line+7, 1090, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[2-1], "ZZZZZ.ZZZZZ")), 490, Gx_line+7, 560, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[3-1], "ZZZZZ.ZZZZZ")), 622, Gx_line+7, 692, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[4-1], "ZZZZZ.ZZZZZ")), 755, Gx_line+7, 825, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[5-1], "ZZZZZ.ZZZZZ")), 888, Gx_line+7, 958, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(327, Gx_line+0, 327, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit14, "")), 88, Gx_line+6, 223, Gx_line+22, 1, 0, 0, 0) ;
      getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+28, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(458, Gx_line+0, 458, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(590, Gx_line+0, 590, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(721, Gx_line+0, 721, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(852, Gx_line+0, 852, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Tab_cos[1-1], "ZZZZZ.ZZZZZ")), 358, Gx_line+7, 428, Gx_line+23, 1+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(1115, Gx_line+0, 1115, Gx_line+28, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(11, Gx_line+26, 1114, Gx_line+26, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(11, Gx_line+0, 1114, Gx_line+0, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 285, Gx_line+9, 320, Gx_line+24, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+27) ;
   }

   public void h7490( boolean bFoot ,
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
               getPrinter().GxDrawRect(11, Gx_line+6, 212, Gx_line+31, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 123, Gx_line+8, 199, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 113, Gx_line+41, 158, Gx_line+59, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 166, Gx_line+41, 416, Gx_line+58, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 113, Gx_line+80, 246, Gx_line+97, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5534Lb_ArtDsc, "")), 303, Gx_line+80, 520, Gx_line+97, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5552Lb_TipArtD, "")), 303, Gx_line+100, 572, Gx_line+117, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(11, Gx_line+34, 1116, Gx_line+167, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 113, Gx_line+60, 280, Gx_line+77, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), 113, Gx_line+146, 129, Gx_line+164, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A584IntDsc, "")), 136, Gx_line+146, 355, Gx_line+162, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A5541Lb_FechaE, "99/99/99"), 921, Gx_line+122, 971, Gx_line+138, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 1028, Gx_line+104, 1075, Gx_line+120, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5543Lb_Usuario, "")), 1028, Gx_line+122, 1101, Gx_line+138, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5544Lb_FechaM, "99/99/99"), 921, Gx_line+144, 971, Gx_line+160, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5546Lb_UsuM, "")), 1028, Gx_line+144, 1101, Gx_line+157, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5542Lb_HoraE, "99:99"), 984, Gx_line+122, 1020, Gx_line+138, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5545Lb_HoraM, "99:99"), 984, Gx_line+144, 1020, Gx_line+160, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(A5548Lb_Obs, 121, Gx_line+171, 1103, Gx_line+203, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A5594Lb_cartazf, "99/99/99"), 357, Gx_line+60, 410, Gx_line+78, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N.Mezcla", ""), 574, Gx_line+82, 626, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18EmprNOm, "")), 382, Gx_line+8, 633, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 855, Gx_line+16, 913, Gx_line+32, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 968, Gx_line+17, 1026, Gx_line+33, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit4, "")), 24, Gx_line+10, 90, Gx_line+27, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit5, "")), 22, Gx_line+41, 94, Gx_line+57, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit6, "")), 22, Gx_line+61, 94, Gx_line+77, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit7, "")), 22, Gx_line+81, 94, Gx_line+97, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit10, "")), 22, Gx_line+146, 94, Gx_line+162, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit12, "")), 22, Gx_line+171, 111, Gx_line+187, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit18, "")), 928, Gx_line+104, 963, Gx_line+120, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit19, "")), 989, Gx_line+104, 1017, Gx_line+120, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit20, "")), 814, Gx_line+122, 896, Gx_line+138, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit22, "")), 814, Gx_line+48, 844, Gx_line+64, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5700Lb_Talao, "")), 642, Gx_line+81, 700, Gx_line+98, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit23, "")), 563, Gx_line+63, 627, Gx_line+80, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5701Lb_Local, "")), 642, Gx_line+61, 715, Gx_line+78, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit24, "")), 529, Gx_line+42, 625, Gx_line+58, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Texto_e, "")), 642, Gx_line+41, 788, Gx_line+58, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Compo, "")), 113, Gx_line+100, 296, Gx_line+117, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit21, "")), 814, Gx_line+144, 896, Gx_line+160, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha ", ""), 303, Gx_line+60, 343, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 102, Gx_line+41, 106, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 102, Gx_line+81, 106, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 102, Gx_line+60, 106, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 98, Gx_line+10, 102, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit1, "")), 806, Gx_line+16, 841, Gx_line+32, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit2, "")), 926, Gx_line+17, 954, Gx_line+33, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 845, Gx_line+16, 849, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 960, Gx_line+17, 964, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 902, Gx_line+122, 906, Gx_line+138, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 902, Gx_line+144, 906, Gx_line+160, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(803, Gx_line+99, 1114, Gx_line+99, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(803, Gx_line+34, 803, Gx_line+165, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 102, Gx_line+145, 106, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Composicion", ""), 20, Gx_line+101, 98, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 102, Gx_line+101, 106, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 113, Gx_line+171, 117, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Contdsc, "")), 967, Gx_line+0, 1051, Gx_line+11, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1073, Gx_line+19, 1087, Gx_line+32, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 1095, Gx_line+19, 1111, Gx_line+32, 0, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 1090, Gx_line+19, 1094, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6056Lb_pesom, "ZZZZ9.999")), 882, Gx_line+48, 958, Gx_line+68, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(11, Gx_line+121, 804, Gx_line+121, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 113, Gx_line+125, 248, Gx_line+144, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV76Lb_ColNum), "ZZZZZZ")), 255, Gx_line+125, 300, Gx_line+143, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV77TipColCod), "ZZ")), 322, Gx_line+125, 338, Gx_line+142, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 345, Gx_line+125, 568, Gx_line+144, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit8, "")), 22, Gx_line+126, 94, Gx_line+142, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 102, Gx_line+126, 106, Gx_line+142, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 345, Gx_line+60, 349, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6057Lb_volum, "ZZZ9.99")), 890, Gx_line+75, 949, Gx_line+95, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Volumen", ""), 814, Gx_line+78, 865, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "R/Baño :", ""), 1009, Gx_line+78, 1059, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 869, Gx_line+78, 873, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 870, Gx_line+48, 874, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5547Lb_Rb, "ZZZ9.99")), 1072, Gx_line+75, 1131, Gx_line+95, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV73Lb_Tempt), "ZZZZ")), 669, Gx_line+145, 699, Gx_line+163, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV74Lb_Temp2), "ZZZZ")), 702, Gx_line+145, 732, Gx_line+163, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV75Lb_Temp3), "ZZZZ")), 738, Gx_line+145, 768, Gx_line+163, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit11, "")), 591, Gx_line+146, 655, Gx_line+162, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 658, Gx_line+146, 662, Gx_line+162, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 633, Gx_line+41, 637, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 633, Gx_line+81, 637, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 633, Gx_line+61, 637, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "g.", ""), 969, Gx_line+48, 980, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ml.", ""), 961, Gx_line+78, 980, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hoja :", ""), 1039, Gx_line+17, 1073, Gx_line+33, 0+256, 0, 0, 0) ;
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
      this.aP0[0] = renss10.this.A396EmprCod;
      this.aP1[0] = renss10.this.A5532Lb_numero;
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
      GXt_char3 = "" ;
      GXt_char2 = "" ;
      scmdbuf = "" ;
      P07492_A396EmprCod = new String[] {""} ;
      P07492_A5532Lb_numero = new int[1] ;
      P07492_A5555Lb_opcion = new String[] {""} ;
      A5555Lb_opcion = "" ;
      AV62Workstat = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char8 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new short[1] ;
      P07493_A396EmprCod = new String[] {""} ;
      P07493_A407EmprNom = new String[] {""} ;
      P07493_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18EmprNOm = "" ;
      P07494_A5548Lb_Obs = new String[] {""} ;
      P07494_A396EmprCod = new String[] {""} ;
      P07494_A5532Lb_numero = new int[1] ;
      P07494_A5535Lb_TipArt = new short[1] ;
      P07494_A5570Lb_Tipo = new String[] {""} ;
      P07494_A5601Lb_Tempt = new short[1] ;
      P07494_A5610Lb_Temp2 = new short[1] ;
      P07494_A5611Lb_Temp3 = new short[1] ;
      P07494_A5537Lb_ColNum = new int[1] ;
      P07494_A831TipColCod = new byte[1] ;
      P07494_n831TipColCod = new boolean[] {false} ;
      P07494_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07494_A6057Lb_volum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07494_A832TipColDsc = new String[] {""} ;
      P07494_n832TipColDsc = new boolean[] {false} ;
      P07494_A5536Lb_ColNom = new String[] {""} ;
      P07494_A6056Lb_pesom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07494_A5701Lb_Local = new String[] {""} ;
      P07494_A5700Lb_Talao = new String[] {""} ;
      P07494_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P07494_A5545Lb_HoraM = new java.util.Date[] {GXutil.nullDate()} ;
      P07494_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P07494_A5546Lb_UsuM = new String[] {""} ;
      P07494_A5544Lb_FechaM = new java.util.Date[] {GXutil.nullDate()} ;
      P07494_A5543Lb_Usuario = new String[] {""} ;
      P07494_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P07494_A584IntDsc = new String[] {""} ;
      P07494_n584IntDsc = new boolean[] {false} ;
      P07494_A583IntCod = new byte[1] ;
      P07494_n583IntCod = new boolean[] {false} ;
      P07494_A5540Lb_Cartaz = new String[] {""} ;
      P07494_A5552Lb_TipArtD = new String[] {""} ;
      P07494_A5534Lb_ArtDsc = new String[] {""} ;
      P07494_A5533Lb_ArtCod = new String[] {""} ;
      P07494_A279CliNom = new String[] {""} ;
      P07494_A252CliCod = new int[1] ;
      A5548Lb_Obs = "" ;
      A5570Lb_Tipo = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A6057Lb_volum = DecimalUtil.ZERO ;
      A832TipColDsc = "" ;
      A5536Lb_ColNom = "" ;
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
      A5552Lb_TipArtD = "" ;
      A5534Lb_ArtDsc = "" ;
      A5533Lb_ArtCod = "" ;
      A279CliNom = "" ;
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
      P07495_A396EmprCod = new String[] {""} ;
      P07495_A5532Lb_numero = new int[1] ;
      P07495_A5556Lb_UltLC = new short[1] ;
      P07495_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07495_A5718Lb_numop = new byte[1] ;
      P07495_A5555Lb_opcion = new String[] {""} ;
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
      AV17PrdNumi = "" ;
      AV47Compo = "" ;
      P07496_A396EmprCod = new String[] {""} ;
      P07496_A65ArtCod = new String[] {""} ;
      P07496_A252CliCod = new int[1] ;
      P07496_A105ArtTra1 = new String[] {""} ;
      P07496_n105ArtTra1 = new boolean[] {false} ;
      P07496_A108ArtTraP1 = new short[1] ;
      P07496_n108ArtTraP1 = new boolean[] {false} ;
      P07496_A106ArtTra2 = new String[] {""} ;
      P07496_n106ArtTra2 = new boolean[] {false} ;
      P07496_A109ArtTraP2 = new short[1] ;
      P07496_n109ArtTraP2 = new boolean[] {false} ;
      P07496_A107ArtTra3 = new String[] {""} ;
      P07496_n107ArtTra3 = new boolean[] {false} ;
      P07496_A110ArtTraP3 = new short[1] ;
      P07496_n110ArtTraP3 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      P07497_A490ForPrdUMe = new byte[1] ;
      P07497_A396EmprCod = new String[] {""} ;
      P07497_A910Workstat = new String[] {""} ;
      P07497_A719PrdNum = new String[] {""} ;
      P07497_A897EscMDsc = new String[] {""} ;
      P07497_A4709EscMMdlCod = new String[] {""} ;
      P07497_A764ProForCod = new String[] {""} ;
      P07497_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07497_A488ForPrdDsc = new String[] {""} ;
      P07497_n488ForPrdDsc = new boolean[] {false} ;
      P07497_A887EscMLin = new int[1] ;
      A910Workstat = "" ;
      A719PrdNum = "" ;
      A897EscMDsc = "" ;
      A4709EscMMdlCod = "" ;
      A764ProForCod = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      AV68Tab_Tip = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV68Tab_Tip[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV71ProForDsc = "" ;
      P07498_A396EmprCod = new String[] {""} ;
      P07498_A764ProForCod = new String[] {""} ;
      P07498_A766ProForDsc = new String[] {""} ;
      A766ProForDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.renss10__default(),
         new Object[] {
             new Object[] {
            P07492_A396EmprCod, P07492_A5532Lb_numero, P07492_A5555Lb_opcion
            }
            , new Object[] {
            P07493_A396EmprCod, P07493_A407EmprNom, P07493_n407EmprNom
            }
            , new Object[] {
            P07494_A5548Lb_Obs, P07494_A396EmprCod, P07494_A5532Lb_numero, P07494_A5535Lb_TipArt, P07494_A5570Lb_Tipo, P07494_A5601Lb_Tempt, P07494_A5610Lb_Temp2, P07494_A5611Lb_Temp3, P07494_A5537Lb_ColNum, P07494_A831TipColCod,
            P07494_n831TipColCod, P07494_A5547Lb_Rb, P07494_A6057Lb_volum, P07494_A832TipColDsc, P07494_n832TipColDsc, P07494_A5536Lb_ColNom, P07494_A6056Lb_pesom, P07494_A5701Lb_Local, P07494_A5700Lb_Talao, P07494_A5594Lb_cartazf,
            P07494_A5545Lb_HoraM, P07494_A5542Lb_HoraE, P07494_A5546Lb_UsuM, P07494_A5544Lb_FechaM, P07494_A5543Lb_Usuario, P07494_A5541Lb_FechaE, P07494_A584IntDsc, P07494_n584IntDsc, P07494_A583IntCod, P07494_n583IntCod,
            P07494_A5540Lb_Cartaz, P07494_A5552Lb_TipArtD, P07494_A5534Lb_ArtDsc, P07494_A5533Lb_ArtCod, P07494_A279CliNom, P07494_A252CliCod
            }
            , new Object[] {
            P07495_A396EmprCod, P07495_A5532Lb_numero, P07495_A5556Lb_UltLC, P07495_A5565Lb_CosteE, P07495_A5718Lb_numop, P07495_A5555Lb_opcion
            }
            , new Object[] {
            P07496_A396EmprCod, P07496_A65ArtCod, P07496_A252CliCod, P07496_A105ArtTra1, P07496_n105ArtTra1, P07496_A108ArtTraP1, P07496_n108ArtTraP1, P07496_A106ArtTra2, P07496_n106ArtTra2, P07496_A109ArtTraP2,
            P07496_n109ArtTraP2, P07496_A107ArtTra3, P07496_n107ArtTra3, P07496_A110ArtTraP3, P07496_n110ArtTraP3
            }
            , new Object[] {
            P07497_A490ForPrdUMe, P07497_A396EmprCod, P07497_A910Workstat, P07497_A719PrdNum, P07497_A897EscMDsc, P07497_A4709EscMMdlCod, P07497_A764ProForCod, P07497_A4712EscMFacCon, P07497_A488ForPrdDsc, P07497_n488ForPrdDsc,
            P07497_A887EscMLin
            }
            , new Object[] {
            P07498_A396EmprCod, P07498_A764ProForCod, P07498_A766ProForDsc
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

   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV77TipColCod ;
   private byte AV50Opcion ;
   private byte AV10Tab_Opc[][] ;
   private byte A5718Lb_numop ;
   private byte AV69Lb_numop ;
   private byte AV9Ensayo[] ;
   private byte AV61LinPag ;
   private byte A490ForPrdUMe ;
   private short GXv_int10[] ;
   private short A5535Lb_TipArt ;
   private short A5601Lb_Tempt ;
   private short A5610Lb_Temp2 ;
   private short A5611Lb_Temp3 ;
   private short AV74Lb_Temp2 ;
   private short AV75Lb_Temp3 ;
   private short AV73Lb_Tempt ;
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
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int AV45CliCod ;
   private int AV76Lb_ColNum ;
   private int GX_I ;
   private int GX_J ;
   private int AV66Lb_numero ;
   private int Gx_OldLine ;
   private int A887EscMLin ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal A6057Lb_volum ;
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
   private String GXt_char3 ;
   private String GXt_char2 ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String AV62Workstat ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String GXv_char8[] ;
   private String A407EmprNom ;
   private String AV18EmprNOm ;
   private String A5570Lb_Tipo ;
   private String A832TipColDsc ;
   private String A5536Lb_ColNom ;
   private String A5701Lb_Local ;
   private String A5700Lb_Talao ;
   private String A5546Lb_UsuM ;
   private String A5543Lb_Usuario ;
   private String A584IntDsc ;
   private String A5540Lb_Cartaz ;
   private String A5552Lb_TipArtD ;
   private String A5534Lb_ArtDsc ;
   private String A5533Lb_ArtCod ;
   private String A279CliNom ;
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
   private String AV54Produc ;
   private String AV52PrdDsc ;
   private String AV16Orden ;
   private String AV60Tab_Ord[] ;
   private String AV17PrdNumi ;
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
   private String AV68Tab_Tip[] ;
   private String AV71ProForDsc ;
   private String A766ProForDsc ;
   private String Gx_time ;
   private java.util.Date A5545Lb_HoraM ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5544Lb_FechaM ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr4 ;
   private boolean n831TipColCod ;
   private boolean n832TipColDsc ;
   private boolean n584IntDsc ;
   private boolean n583IntCod ;
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
   private String[] P07492_A396EmprCod ;
   private int[] P07492_A5532Lb_numero ;
   private String[] P07492_A5555Lb_opcion ;
   private String[] P07493_A396EmprCod ;
   private String[] P07493_A407EmprNom ;
   private boolean[] P07493_n407EmprNom ;
   private String[] P07494_A5548Lb_Obs ;
   private String[] P07494_A396EmprCod ;
   private int[] P07494_A5532Lb_numero ;
   private short[] P07494_A5535Lb_TipArt ;
   private String[] P07494_A5570Lb_Tipo ;
   private short[] P07494_A5601Lb_Tempt ;
   private short[] P07494_A5610Lb_Temp2 ;
   private short[] P07494_A5611Lb_Temp3 ;
   private int[] P07494_A5537Lb_ColNum ;
   private byte[] P07494_A831TipColCod ;
   private boolean[] P07494_n831TipColCod ;
   private java.math.BigDecimal[] P07494_A5547Lb_Rb ;
   private java.math.BigDecimal[] P07494_A6057Lb_volum ;
   private String[] P07494_A832TipColDsc ;
   private boolean[] P07494_n832TipColDsc ;
   private String[] P07494_A5536Lb_ColNom ;
   private java.math.BigDecimal[] P07494_A6056Lb_pesom ;
   private String[] P07494_A5701Lb_Local ;
   private String[] P07494_A5700Lb_Talao ;
   private java.util.Date[] P07494_A5594Lb_cartazf ;
   private java.util.Date[] P07494_A5545Lb_HoraM ;
   private java.util.Date[] P07494_A5542Lb_HoraE ;
   private String[] P07494_A5546Lb_UsuM ;
   private java.util.Date[] P07494_A5544Lb_FechaM ;
   private String[] P07494_A5543Lb_Usuario ;
   private java.util.Date[] P07494_A5541Lb_FechaE ;
   private String[] P07494_A584IntDsc ;
   private boolean[] P07494_n584IntDsc ;
   private byte[] P07494_A583IntCod ;
   private boolean[] P07494_n583IntCod ;
   private String[] P07494_A5540Lb_Cartaz ;
   private String[] P07494_A5552Lb_TipArtD ;
   private String[] P07494_A5534Lb_ArtDsc ;
   private String[] P07494_A5533Lb_ArtCod ;
   private String[] P07494_A279CliNom ;
   private int[] P07494_A252CliCod ;
   private String[] P07495_A396EmprCod ;
   private int[] P07495_A5532Lb_numero ;
   private short[] P07495_A5556Lb_UltLC ;
   private java.math.BigDecimal[] P07495_A5565Lb_CosteE ;
   private byte[] P07495_A5718Lb_numop ;
   private String[] P07495_A5555Lb_opcion ;
   private String[] P07496_A396EmprCod ;
   private String[] P07496_A65ArtCod ;
   private int[] P07496_A252CliCod ;
   private String[] P07496_A105ArtTra1 ;
   private boolean[] P07496_n105ArtTra1 ;
   private short[] P07496_A108ArtTraP1 ;
   private boolean[] P07496_n108ArtTraP1 ;
   private String[] P07496_A106ArtTra2 ;
   private boolean[] P07496_n106ArtTra2 ;
   private short[] P07496_A109ArtTraP2 ;
   private boolean[] P07496_n109ArtTraP2 ;
   private String[] P07496_A107ArtTra3 ;
   private boolean[] P07496_n107ArtTra3 ;
   private short[] P07496_A110ArtTraP3 ;
   private boolean[] P07496_n110ArtTraP3 ;
   private byte[] P07497_A490ForPrdUMe ;
   private String[] P07497_A396EmprCod ;
   private String[] P07497_A910Workstat ;
   private String[] P07497_A719PrdNum ;
   private String[] P07497_A897EscMDsc ;
   private String[] P07497_A4709EscMMdlCod ;
   private String[] P07497_A764ProForCod ;
   private java.math.BigDecimal[] P07497_A4712EscMFacCon ;
   private String[] P07497_A488ForPrdDsc ;
   private boolean[] P07497_n488ForPrdDsc ;
   private int[] P07497_A887EscMLin ;
   private String[] P07498_A396EmprCod ;
   private String[] P07498_A764ProForCod ;
   private String[] P07498_A766ProForDsc ;
}

final  class renss10__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07492", "SELECT EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07493", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07494", "SELECT T1.Lb_Obs, T1.EmprCod, T1.Lb_numero, T1.Lb_TipArt, T1.Lb_Tipo, T1.Lb_Tempt, T1.Lb_Temp2, T1.Lb_Temp3, T1.Lb_ColNum, T1.TipColCod, T1.Lb_Rb, T1.Lb_volum, T4.TipColDsc, T1.Lb_ColNom, T1.Lb_pesom, T1.Lb_Local, T1.Lb_Talao, T1.Lb_cartazf, T1.Lb_HoraM, T1.Lb_HoraE, T1.Lb_UsuM, T1.Lb_FechaM, T1.Lb_Usuario, T1.Lb_FechaE, T3.IntDsc, T1.IntCod, T1.Lb_Cartaz, T1.Lb_TipArtD, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod FROM (((TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07495", "SELECT EmprCod, Lb_numero, Lb_UltLC, Lb_CosteE, Lb_numop, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07496", "SELECT EmprCod, ArtCod, CliCod, ArtTra1, ArtTraP1, ArtTra2, ArtTraP2, ArtTra3, ArtTraP3 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07497", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Workstat, T1.PrdNum, T1.EscMDsc, T1.EscMMdlCod, T1.ProForCod, T1.EscMFacCon, T2.ForPrdDsc, T1.EscMLin FROM (TXPESCMAN T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat, T1.EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07498", "SELECT EmprCod, ProForCod, ProForDsc FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 13);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,3);
               ((String[]) buf[17])[0] = rslt.getString(16, 10);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(18);
               ((java.util.Date[]) buf[20])[0] = GXutil.resetDate(rslt.getGXDateTime(19));
               ((java.util.Date[]) buf[21])[0] = GXutil.resetDate(rslt.getGXDateTime(20));
               ((String[]) buf[22])[0] = rslt.getString(21, 10);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(22);
               ((String[]) buf[24])[0] = rslt.getString(23, 10);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(24);
               ((String[]) buf[26])[0] = rslt.getString(25, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(27, 20);
               ((String[]) buf[31])[0] = rslt.getString(28, 30);
               ((String[]) buf[32])[0] = rslt.getString(29, 26);
               ((String[]) buf[33])[0] = rslt.getString(30, 16);
               ((String[]) buf[34])[0] = rslt.getString(31, 30);
               ((int[]) buf[35])[0] = rslt.getInt(32);
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

