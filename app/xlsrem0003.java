package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class xlsrem0003 extends GXProcedure
{
   public xlsrem0003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( xlsrem0003.class ), "" );
   }

   public xlsrem0003( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             short[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             short[] aP16 ,
                             short[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 )
   {
      xlsrem0003.this.aP20 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
      return aP20[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.util.Date[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        short[] aP11 ,
                        short[] aP12 ,
                        short[] aP13 ,
                        short[] aP14 ,
                        short[] aP15 ,
                        short[] aP16 ,
                        short[] aP17 ,
                        String[] aP18 ,
                        String[] aP19 ,
                        String[] aP20 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             short[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             short[] aP16 ,
                             short[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 )
   {
      xlsrem0003.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      xlsrem0003.this.AV9ImpCod = aP1[0];
      this.aP1 = aP1;
      xlsrem0003.this.AV11PCliente = aP2[0];
      this.aP2 = aP2;
      xlsrem0003.this.AV12UCliente = aP3[0];
      this.aP3 = aP3;
      xlsrem0003.this.AV13PFecha = aP4[0];
      this.aP4 = aP4;
      xlsrem0003.this.AV14UFecha = aP5[0];
      this.aP5 = aP5;
      xlsrem0003.this.AV31AlbRef_i = aP6[0];
      this.aP6 = aP6;
      xlsrem0003.this.AV32AlbRef_f = aP7[0];
      this.aP7 = aP7;
      xlsrem0003.this.AV56Estado_a = aP8[0];
      this.aP8 = aP8;
      xlsrem0003.this.AV59Albrenti = aP9[0];
      this.aP9 = aP9;
      xlsrem0003.this.AV60Albrentf = aP10[0];
      this.aP10 = aP10;
      xlsrem0003.this.AV66TipENtcodi = aP11[0];
      this.aP11 = aP11;
      xlsrem0003.this.AV69Procodi = aP12[0];
      this.aP12 = aP12;
      xlsrem0003.this.AV70Procodf = aP13[0];
      this.aP13 = aP13;
      xlsrem0003.this.AV71trnCodi = aP14[0];
      this.aP14 = aP14;
      xlsrem0003.this.AV72TrnCodf = aP15[0];
      this.aP15 = aP15;
      xlsrem0003.this.AV76Tipartcod1 = aP16[0];
      this.aP16 = aP16;
      xlsrem0003.this.AV77Tipartcod2 = aP17[0];
      this.aP17 = aP17;
      xlsrem0003.this.AV79Unidad = aP18[0];
      this.aP18 = aP18;
      xlsrem0003.this.AV91Filename = aP19[0];
      this.aP19 = aP19;
      xlsrem0003.this.AV89ErrorMessage = aP20[0];
      this.aP20 = aP20;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV30ContDsc ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexidsc(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "EM0000", ""), GXv_char2) ;
      xlsrem0003.this.GXt_char1 = GXv_char2[0] ;
      AV30ContDsc = GXt_char1 ;
      GXt_int3 = AV61Moda21 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int4) ;
      xlsrem0003.this.GXt_int3 = GXv_int4[0] ;
      AV61Moda21 = GXt_int3 ;
      GXt_int3 = AV62Cli350 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int4) ;
      xlsrem0003.this.GXt_int3 = GXv_int4[0] ;
      AV62Cli350 = GXt_int3 ;
      GXt_int5 = AV63Contval ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int6) ;
      xlsrem0003.this.GXt_int5 = GXv_int6[0] ;
      AV63Contval = GXt_int5 ;
      GXt_int3 = AV64Texfina ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int4) ;
      xlsrem0003.this.GXt_int3 = GXv_int4[0] ;
      AV64Texfina = GXt_int3 ;
      GXt_int3 = AV75vts ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "VELLUT", ""), GXv_int4) ;
      xlsrem0003.this.GXt_int3 = GXv_int4[0] ;
      AV75vts = GXt_int3 ;
      AV57PAlbRest = (byte)(0) ;
      AV58UALbRest = (byte)(1) ;
      if ( GXutil.strcmp(AV56Estado_a, "0") == 0 )
      {
         AV57PAlbRest = (byte)(0) ;
         AV58UALbRest = (byte)(0) ;
      }
      if ( GXutil.strcmp(AV56Estado_a, "1") == 0 )
      {
         AV57PAlbRest = (byte)(1) ;
         AV58UALbRest = (byte)(1) ;
      }
      AV92Random = (int)(GXutil.random( )*10000) ;
      AV91Filename = GXutil.trim( AV97Pgmdesc) + "_" + GXutil.trim( GXutil.str( AV92Random, 8, 0)) + ".xlsx" ;
      AV90ExcelDocument.Open(AV91Filename);
      if ( AV90ExcelDocument.getErrCode() != 0 )
      {
         AV91Filename = "" ;
         AV89ErrorMessage = AV90ExcelDocument.getErrDescription() ;
         AV90ExcelDocument.Close();
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV90ExcelDocument.Clear();
      AV93Row = (short)(1) ;
      AV88Col = (short)(1) ;
      while ( AV88Col <= 17 )
      {
         AV90ExcelDocument.Cells(AV93Row, AV88Col, 1, 1).setBold( (short)(1) );
         AV90ExcelDocument.Cells(AV93Row, AV88Col, 1, 1).setColor( 11 );
         AV88Col = (short)(AV88Col+1) ;
      }
      AV90ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV90ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV90ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Referencia", "") );
      AV90ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV90ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Nº Recepcion", "") );
      AV90ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV90ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Nº Documento", "") );
      AV90ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Und", "") );
      AV90ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Und Ent", "") );
      AV90ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Pzs Ent", "") );
      AV90ExcelDocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "Und Uti", "") );
      AV90ExcelDocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "Pzs uti", "") );
      AV90ExcelDocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "Und Stock", "") );
      AV90ExcelDocument.Cells(1, 14, 1, 1).setText( httpContext.getMessage( "Pzs Stock", "") );
      AV90ExcelDocument.Cells(1, 15, 1, 1).setText( httpContext.getMessage( "Localizacion", "") );
      AV90ExcelDocument.Cells(1, 16, 1, 1).setText( httpContext.getMessage( "Procedencia", "") );
      AV90ExcelDocument.Cells(1, 17, 1, 1).setText( httpContext.getMessage( "Transportista", "") );
      AV15TotUniE = DecimalUtil.doubleToDec(0) ;
      AV19TotUniS = DecimalUtil.doubleToDec(0) ;
      AV20TotPzE = 0 ;
      AV21TotPzU = 0 ;
      AV93Row = (short)(2) ;
      /* Using cursor P08512 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV11PCliente), AV31AlbRef_i, AV13PFecha, AV14UFecha, AV32AlbRef_f, Byte.valueOf(AV57PAlbRest), Byte.valueOf(AV58UALbRest), AV59Albrenti, AV60Albrentf, Short.valueOf(AV66TipENtcodi), Short.valueOf(AV66TipENtcodi), Short.valueOf(AV69Procodi), Short.valueOf(AV70Procodf), Short.valueOf(AV76Tipartcod1), Short.valueOf(AV77Tipartcod2), AV79Unidad, AV79Unidad, Integer.valueOf(AV12UCliente)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8512 = false ;
         A840TrnCod = P08512_A840TrnCod[0] ;
         n840TrnCod = P08512_n840TrnCod[0] ;
         A396EmprCod = P08512_A396EmprCod[0] ;
         A47AlbREst = P08512_A47AlbREst[0] ;
         A1211TipEntCod = P08512_A1211TipEntCod[0] ;
         n1211TipEntCod = P08512_n1211TipEntCod[0] ;
         A970ProceCod = P08512_A970ProceCod[0] ;
         n970ProceCod = P08512_n970ProceCod[0] ;
         A6263AlbRTartC = P08512_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08512_n6263AlbRTartC[0] ;
         A3613AlbRefDsc = P08512_A3613AlbRefDsc[0] ;
         A5806AlbREnt2 = P08512_A5806AlbREnt2[0] ;
         A46AlbREnt = P08512_A46AlbREnt[0] ;
         A50AlbRLoc = P08512_A50AlbRLoc[0] ;
         A252CliCod = P08512_A252CliCod[0] ;
         A279CliNom = P08512_A279CliNom[0] ;
         A44AlbRecCod = P08512_A44AlbRecCod[0] ;
         A56AlbRUni = P08512_A56AlbRUni[0] ;
         A971ProceNom = P08512_A971ProceNom[0] ;
         n971ProceNom = P08512_n971ProceNom[0] ;
         A841TrnNom = P08512_A841TrnNom[0] ;
         n841TrnNom = P08512_n841TrnNom[0] ;
         A49AlbRFen = P08512_A49AlbRFen[0] ;
         A45AlbRef = P08512_A45AlbRef[0] ;
         A54AlbRPieUti = P08512_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P08512_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P08512_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P08512_A58AlbRUniEnt[0] ;
         A841TrnNom = P08512_A841TrnNom[0] ;
         n841TrnNom = P08512_n841TrnNom[0] ;
         A971ProceNom = P08512_A971ProceNom[0] ;
         n971ProceNom = P08512_n971ProceNom[0] ;
         A279CliNom = P08512_A279CliNom[0] ;
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
         if ( ( AV61Moda21 == 1 ) && ( A252CliCod == 350 ) && ( AV62Cli350 == 1 ) && ( AV63Contval == 1 ) )
         {
         }
         else
         {
            AV17CliCod = A252CliCod ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08512_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08512_A252CliCod[0] == A252CliCod ) )
            {
               brk8512 = false ;
               A840TrnCod = P08512_A840TrnCod[0] ;
               n840TrnCod = P08512_n840TrnCod[0] ;
               A47AlbREst = P08512_A47AlbREst[0] ;
               A1211TipEntCod = P08512_A1211TipEntCod[0] ;
               n1211TipEntCod = P08512_n1211TipEntCod[0] ;
               A970ProceCod = P08512_A970ProceCod[0] ;
               n970ProceCod = P08512_n970ProceCod[0] ;
               A6263AlbRTartC = P08512_A6263AlbRTartC[0] ;
               n6263AlbRTartC = P08512_n6263AlbRTartC[0] ;
               A3613AlbRefDsc = P08512_A3613AlbRefDsc[0] ;
               A5806AlbREnt2 = P08512_A5806AlbREnt2[0] ;
               A46AlbREnt = P08512_A46AlbREnt[0] ;
               A50AlbRLoc = P08512_A50AlbRLoc[0] ;
               A279CliNom = P08512_A279CliNom[0] ;
               A44AlbRecCod = P08512_A44AlbRecCod[0] ;
               A56AlbRUni = P08512_A56AlbRUni[0] ;
               A971ProceNom = P08512_A971ProceNom[0] ;
               n971ProceNom = P08512_n971ProceNom[0] ;
               A841TrnNom = P08512_A841TrnNom[0] ;
               n841TrnNom = P08512_n841TrnNom[0] ;
               A49AlbRFen = P08512_A49AlbRFen[0] ;
               A45AlbRef = P08512_A45AlbRef[0] ;
               A54AlbRPieUti = P08512_A54AlbRPieUti[0] ;
               A52AlbRPieEnt = P08512_A52AlbRPieEnt[0] ;
               A60AlbRUniUti = P08512_A60AlbRUniUti[0] ;
               A58AlbRUniEnt = P08512_A58AlbRUniEnt[0] ;
               A841TrnNom = P08512_A841TrnNom[0] ;
               n841TrnNom = P08512_n841TrnNom[0] ;
               A971ProceNom = P08512_A971ProceNom[0] ;
               n971ProceNom = P08512_n971ProceNom[0] ;
               A279CliNom = P08512_A279CliNom[0] ;
               if ( GXutil.strcmp(A45AlbRef, AV32AlbRef_f) <= 0 )
               {
                  if ( GXutil.strcmp(A45AlbRef, AV31AlbRef_i) >= 0 )
                  {
                     if ( (( GXutil.resetTime(A49AlbRFen).after( GXutil.resetTime( AV13PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A49AlbRFen), GXutil.resetTime(AV13PFecha)) )) )
                     {
                        if ( GXutil.strcmp(A396EmprCod, AV8EmprCod) == 0 )
                        {
                           if ( (( GXutil.resetTime(A49AlbRFen).before( GXutil.resetTime( AV14UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A49AlbRFen), GXutil.resetTime(AV14UFecha)) )) && ( A252CliCod >= AV11PCliente ) && ( A252CliCod <= AV12UCliente ) )
                           {
                              if ( ( A47AlbREst >= AV57PAlbRest ) && ( A47AlbREst <= AV58UALbRest ) )
                              {
                                 if ( ( GXutil.strcmp(A46AlbREnt, AV59Albrenti) >= 0 ) && ( GXutil.strcmp(A46AlbREnt, AV60Albrentf) <= 0 ) )
                                 {
                                    if ( A1211TipEntCod != 9999 )
                                    {
                                       if ( ( ( A1211TipEntCod == AV66TipENtcodi ) ) || (0==AV66TipENtcodi) )
                                       {
                                          if ( ( A970ProceCod >= AV69Procodi ) && ( A970ProceCod <= AV70Procodf ) )
                                          {
                                             if ( A6263AlbRTartC >= AV76Tipartcod1 )
                                             {
                                                if ( A6263AlbRTartC <= AV77Tipartcod2 )
                                                {
                                                   if ( ( GXutil.strcmp(A56AlbRUni, AV79Unidad) == 0 ) || (GXutil.strcmp("", AV79Unidad)==0) )
                                                   {
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
                                                      if ( ( GXutil.strcmp(AV56Estado_a, "0") == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
                                                      {
                                                      }
                                                      else
                                                      {
                                                         AV67AlbRefDsc = A3613AlbRefDsc ;
                                                         AV94AlbRef = A45AlbRef ;
                                                         if ( (GXutil.strcmp("", A3613AlbRefDsc)==0) || ( GXutil.strcmp(GXutil.trim( A3613AlbRefDsc), "") == 0 ) )
                                                         {
                                                            /* Execute user subroutine: 'ARTICU' */
                                                            S111 ();
                                                            if ( returnInSub )
                                                            {
                                                               pr_default.close(0);
                                                               pr_default.close(0);
                                                               pr_default.close(0);
                                                               pr_default.close(0);
                                                               returnInSub = true;
                                                               cleanup();
                                                               if (true) return;
                                                            }
                                                         }
                                                         AV68AlbREnt2 = GXutil.substring( A5806AlbREnt2, 1, 16) ;
                                                         if ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 )
                                                         {
                                                            AV68AlbREnt2 = A46AlbREnt ;
                                                         }
                                                         AV73AlbRloc5 = GXutil.substring( A50AlbRLoc, 1, 5) ;
                                                         AV90ExcelDocument.Cells(AV93Row, 1, 1, 1).setNumber( A252CliCod );
                                                         AV90ExcelDocument.Cells(AV93Row, 2, 1, 1).setText( A279CliNom );
                                                         AV90ExcelDocument.Cells(AV93Row, 3, 1, 1).setText( A45AlbRef );
                                                         AV90ExcelDocument.Cells(AV93Row, 4, 1, 1).setText( AV67AlbRefDsc );
                                                         AV90ExcelDocument.Cells(AV93Row, 5, 1, 1).setNumber( A44AlbRecCod );
                                                         GXt_dtime7 = GXutil.resetTime( A49AlbRFen );
                                                         AV90ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                         AV90ExcelDocument.Cells(AV93Row, 6, 1, 1).setDate( GXt_dtime7 );
                                                         AV90ExcelDocument.Cells(AV93Row, 7, 1, 1).setText( ((GXutil.strcmp("", A5806AlbREnt2)==0) ? A46AlbREnt : A5806AlbREnt2) );
                                                         AV90ExcelDocument.Cells(AV93Row, 8, 1, 1).setText( A56AlbRUni );
                                                         AV90ExcelDocument.Cells(AV93Row, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A58AlbRUniEnt)) );
                                                         AV90ExcelDocument.Cells(AV93Row, 10, 1, 1).setNumber( A52AlbRPieEnt );
                                                         AV90ExcelDocument.Cells(AV93Row, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A60AlbRUniUti)) );
                                                         AV90ExcelDocument.Cells(AV93Row, 12, 1, 1).setNumber( A54AlbRPieUti );
                                                         AV90ExcelDocument.Cells(AV93Row, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A57AlbRUniDis)) );
                                                         AV90ExcelDocument.Cells(AV93Row, 14, 1, 1).setNumber( A51AlbRPieDis );
                                                         AV90ExcelDocument.Cells(AV93Row, 15, 1, 1).setText( A50AlbRLoc );
                                                         AV90ExcelDocument.Cells(AV93Row, 16, 1, 1).setText( A971ProceNom );
                                                         AV90ExcelDocument.Cells(AV93Row, 17, 1, 1).setText( A841TrnNom );
                                                         AV93Row = (short)(AV93Row+1) ;
                                                         AV15TotUniE = AV15TotUniE.add(A58AlbRUniEnt) ;
                                                         AV19TotUniS = AV19TotUniS.add(A60AlbRUniUti) ;
                                                         AV20TotPzE = (int)(AV20TotPzE+A52AlbRPieEnt) ;
                                                         AV21TotPzU = (int)(AV21TotPzU+A54AlbRPieUti) ;
                                                         AV27TotUniEG = AV27TotUniEG.add(A58AlbRUniEnt) ;
                                                         AV28TotUniSG = AV28TotUniSG.add(A60AlbRUniUti) ;
                                                         AV26TotPzEG = (int)(AV26TotPzEG+A52AlbRPieEnt) ;
                                                         AV29TotPzUG = (int)(AV29TotPzUG+A54AlbRPieUti) ;
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
               brk8512 = true ;
               pr_default.readNext(0);
            }
            AV25TotPzSal = (int)(AV20TotPzE-AV21TotPzU) ;
            AV24TotUniSal = AV15TotUniE.subtract(AV19TotUniS) ;
            AV90ExcelDocument.Cells(AV93Row, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV15TotUniE)) );
            AV90ExcelDocument.Cells(AV93Row, 10, 1, 1).setNumber( AV20TotPzE );
            AV90ExcelDocument.Cells(AV93Row, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV19TotUniS)) );
            AV90ExcelDocument.Cells(AV93Row, 12, 1, 1).setNumber( AV21TotPzU );
            AV90ExcelDocument.Cells(AV93Row, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24TotUniSal)) );
            AV90ExcelDocument.Cells(AV93Row, 14, 1, 1).setNumber( AV25TotPzSal );
            AV15TotUniE = DecimalUtil.doubleToDec(0) ;
            AV19TotUniS = DecimalUtil.doubleToDec(0) ;
            AV20TotPzE = 0 ;
            AV21TotPzU = 0 ;
            AV93Row = (short)(AV93Row+1) ;
         }
         if ( ! brk8512 )
         {
            brk8512 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV25TotPzSal = (int)(AV26TotPzEG-AV29TotPzUG) ;
      AV24TotUniSal = AV27TotUniEG.subtract(AV28TotUniSG) ;
      AV93Row = (short)(AV93Row+1) ;
      AV90ExcelDocument.Cells(AV93Row, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27TotUniEG)) );
      AV90ExcelDocument.Cells(AV93Row, 10, 1, 1).setNumber( AV26TotPzEG );
      AV90ExcelDocument.Cells(AV93Row, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV28TotUniSG)) );
      AV90ExcelDocument.Cells(AV93Row, 12, 1, 1).setNumber( AV29TotPzUG );
      AV90ExcelDocument.Cells(AV93Row, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24TotUniSal)) );
      AV90ExcelDocument.Cells(AV93Row, 14, 1, 1).setNumber( AV25TotPzSal );
      AV90ExcelDocument.Save();
      if ( AV90ExcelDocument.getErrCode() != 0 )
      {
         AV91Filename = "" ;
         AV89ErrorMessage = AV90ExcelDocument.getErrDescription() ;
         AV90ExcelDocument.Close();
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV90ExcelDocument.Close();
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      /* Using cursor P08513 */
      pr_default.execute(1, new Object[] {AV8EmprCod, Integer.valueOf(AV17CliCod), AV94AlbRef});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A65ArtCod = P08513_A65ArtCod[0] ;
         A252CliCod = P08513_A252CliCod[0] ;
         A396EmprCod = P08513_A396EmprCod[0] ;
         A69ArtDsc = P08513_A69ArtDsc[0] ;
         n69ArtDsc = P08513_n69ArtDsc[0] ;
         AV67AlbRefDsc = A69ArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = xlsrem0003.this.AV8EmprCod;
      this.aP1[0] = xlsrem0003.this.AV9ImpCod;
      this.aP2[0] = xlsrem0003.this.AV11PCliente;
      this.aP3[0] = xlsrem0003.this.AV12UCliente;
      this.aP4[0] = xlsrem0003.this.AV13PFecha;
      this.aP5[0] = xlsrem0003.this.AV14UFecha;
      this.aP6[0] = xlsrem0003.this.AV31AlbRef_i;
      this.aP7[0] = xlsrem0003.this.AV32AlbRef_f;
      this.aP8[0] = xlsrem0003.this.AV56Estado_a;
      this.aP9[0] = xlsrem0003.this.AV59Albrenti;
      this.aP10[0] = xlsrem0003.this.AV60Albrentf;
      this.aP11[0] = xlsrem0003.this.AV66TipENtcodi;
      this.aP12[0] = xlsrem0003.this.AV69Procodi;
      this.aP13[0] = xlsrem0003.this.AV70Procodf;
      this.aP14[0] = xlsrem0003.this.AV71trnCodi;
      this.aP15[0] = xlsrem0003.this.AV72TrnCodf;
      this.aP16[0] = xlsrem0003.this.AV76Tipartcod1;
      this.aP17[0] = xlsrem0003.this.AV77Tipartcod2;
      this.aP18[0] = xlsrem0003.this.AV79Unidad;
      this.aP19[0] = xlsrem0003.this.AV91Filename;
      this.aP20[0] = xlsrem0003.this.AV89ErrorMessage;
      CloseOpenCursors();
      AV90ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30ContDsc = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int4 = new byte[1] ;
      AV97Pgmdesc = "" ;
      AV90ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV15TotUniE = DecimalUtil.ZERO ;
      AV19TotUniS = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P08512_A840TrnCod = new short[1] ;
      P08512_n840TrnCod = new boolean[] {false} ;
      P08512_A396EmprCod = new String[] {""} ;
      P08512_A47AlbREst = new byte[1] ;
      P08512_A1211TipEntCod = new short[1] ;
      P08512_n1211TipEntCod = new boolean[] {false} ;
      P08512_A970ProceCod = new short[1] ;
      P08512_n970ProceCod = new boolean[] {false} ;
      P08512_A6263AlbRTartC = new short[1] ;
      P08512_n6263AlbRTartC = new boolean[] {false} ;
      P08512_A3613AlbRefDsc = new String[] {""} ;
      P08512_A5806AlbREnt2 = new String[] {""} ;
      P08512_A46AlbREnt = new String[] {""} ;
      P08512_A50AlbRLoc = new String[] {""} ;
      P08512_A252CliCod = new int[1] ;
      P08512_A279CliNom = new String[] {""} ;
      P08512_A44AlbRecCod = new int[1] ;
      P08512_A56AlbRUni = new String[] {""} ;
      P08512_A971ProceNom = new String[] {""} ;
      P08512_n971ProceNom = new boolean[] {false} ;
      P08512_A841TrnNom = new String[] {""} ;
      P08512_n841TrnNom = new boolean[] {false} ;
      P08512_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08512_A45AlbRef = new String[] {""} ;
      P08512_A54AlbRPieUti = new int[1] ;
      P08512_A52AlbRPieEnt = new int[1] ;
      P08512_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08512_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A3613AlbRefDsc = "" ;
      A5806AlbREnt2 = "" ;
      A46AlbREnt = "" ;
      A50AlbRLoc = "" ;
      A279CliNom = "" ;
      A56AlbRUni = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      AV67AlbRefDsc = "" ;
      AV94AlbRef = "" ;
      AV68AlbREnt2 = "" ;
      AV73AlbRloc5 = "" ;
      GXt_dtime7 = GXutil.resetTime( GXutil.nullDate() );
      AV27TotUniEG = DecimalUtil.ZERO ;
      AV28TotUniSG = DecimalUtil.ZERO ;
      AV24TotUniSal = DecimalUtil.ZERO ;
      P08513_A65ArtCod = new String[] {""} ;
      P08513_A252CliCod = new int[1] ;
      P08513_A396EmprCod = new String[] {""} ;
      P08513_A69ArtDsc = new String[] {""} ;
      P08513_n69ArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.xlsrem0003__default(),
         new Object[] {
             new Object[] {
            P08512_A840TrnCod, P08512_n840TrnCod, P08512_A396EmprCod, P08512_A47AlbREst, P08512_A1211TipEntCod, P08512_n1211TipEntCod, P08512_A970ProceCod, P08512_n970ProceCod, P08512_A6263AlbRTartC, P08512_n6263AlbRTartC,
            P08512_A3613AlbRefDsc, P08512_A5806AlbREnt2, P08512_A46AlbREnt, P08512_A50AlbRLoc, P08512_A252CliCod, P08512_A279CliNom, P08512_A44AlbRecCod, P08512_A56AlbRUni, P08512_A971ProceNom, P08512_n971ProceNom,
            P08512_A841TrnNom, P08512_n841TrnNom, P08512_A49AlbRFen, P08512_A45AlbRef, P08512_A54AlbRPieUti, P08512_A52AlbRPieEnt, P08512_A60AlbRUniUti, P08512_A58AlbRUniEnt
            }
            , new Object[] {
            P08513_A65ArtCod, P08513_A252CliCod, P08513_A396EmprCod, P08513_A69ArtDsc, P08513_n69ArtDsc
            }
         }
      );
      AV97Pgmdesc = httpContext.getMessage( "Listado Entradas Detalle", "") ;
      /* GeneXus formulas. */
      AV97Pgmdesc = httpContext.getMessage( "Listado Entradas Detalle", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV61Moda21 ;
   private byte AV62Cli350 ;
   private byte AV64Texfina ;
   private byte AV75vts ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte AV57PAlbRest ;
   private byte AV58UALbRest ;
   private byte A47AlbREst ;
   private short AV66TipENtcodi ;
   private short AV69Procodi ;
   private short AV70Procodf ;
   private short AV71trnCodi ;
   private short AV72TrnCodf ;
   private short AV76Tipartcod1 ;
   private short AV77Tipartcod2 ;
   private short AV93Row ;
   private short AV88Col ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short A970ProceCod ;
   private short A6263AlbRTartC ;
   private short Gx_err ;
   private int AV11PCliente ;
   private int AV12UCliente ;
   private int AV63Contval ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int AV92Random ;
   private int AV20TotPzE ;
   private int AV21TotPzU ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int AV17CliCod ;
   private int AV26TotPzEG ;
   private int AV29TotPzUG ;
   private int AV25TotPzSal ;
   private java.math.BigDecimal AV15TotUniE ;
   private java.math.BigDecimal AV19TotUniS ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV27TotUniEG ;
   private java.math.BigDecimal AV28TotUniSG ;
   private java.math.BigDecimal AV24TotUniSal ;
   private String AV8EmprCod ;
   private String AV9ImpCod ;
   private String AV31AlbRef_i ;
   private String AV32AlbRef_f ;
   private String AV56Estado_a ;
   private String AV59Albrenti ;
   private String AV60Albrentf ;
   private String AV79Unidad ;
   private String AV30ContDsc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV97Pgmdesc ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A3613AlbRefDsc ;
   private String A5806AlbREnt2 ;
   private String A46AlbREnt ;
   private String A50AlbRLoc ;
   private String A279CliNom ;
   private String A56AlbRUni ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String A45AlbRef ;
   private String AV67AlbRefDsc ;
   private String AV94AlbRef ;
   private String AV68AlbREnt2 ;
   private String AV73AlbRloc5 ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private java.util.Date GXt_dtime7 ;
   private java.util.Date AV13PFecha ;
   private java.util.Date AV14UFecha ;
   private java.util.Date A49AlbRFen ;
   private boolean returnInSub ;
   private boolean brk8512 ;
   private boolean n840TrnCod ;
   private boolean n1211TipEntCod ;
   private boolean n970ProceCod ;
   private boolean n6263AlbRTartC ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private boolean n69ArtDsc ;
   private String AV91Filename ;
   private String AV89ErrorMessage ;
   private String[] aP20 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.util.Date[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private short[] aP11 ;
   private short[] aP12 ;
   private short[] aP13 ;
   private short[] aP14 ;
   private short[] aP15 ;
   private short[] aP16 ;
   private short[] aP17 ;
   private String[] aP18 ;
   private String[] aP19 ;
   private IDataStoreProvider pr_default ;
   private short[] P08512_A840TrnCod ;
   private boolean[] P08512_n840TrnCod ;
   private String[] P08512_A396EmprCod ;
   private byte[] P08512_A47AlbREst ;
   private short[] P08512_A1211TipEntCod ;
   private boolean[] P08512_n1211TipEntCod ;
   private short[] P08512_A970ProceCod ;
   private boolean[] P08512_n970ProceCod ;
   private short[] P08512_A6263AlbRTartC ;
   private boolean[] P08512_n6263AlbRTartC ;
   private String[] P08512_A3613AlbRefDsc ;
   private String[] P08512_A5806AlbREnt2 ;
   private String[] P08512_A46AlbREnt ;
   private String[] P08512_A50AlbRLoc ;
   private int[] P08512_A252CliCod ;
   private String[] P08512_A279CliNom ;
   private int[] P08512_A44AlbRecCod ;
   private String[] P08512_A56AlbRUni ;
   private String[] P08512_A971ProceNom ;
   private boolean[] P08512_n971ProceNom ;
   private String[] P08512_A841TrnNom ;
   private boolean[] P08512_n841TrnNom ;
   private java.util.Date[] P08512_A49AlbRFen ;
   private String[] P08512_A45AlbRef ;
   private int[] P08512_A54AlbRPieUti ;
   private int[] P08512_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08512_A60AlbRUniUti ;
   private java.math.BigDecimal[] P08512_A58AlbRUniEnt ;
   private String[] P08513_A65ArtCod ;
   private int[] P08513_A252CliCod ;
   private String[] P08513_A396EmprCod ;
   private String[] P08513_A69ArtDsc ;
   private boolean[] P08513_n69ArtDsc ;
   private com.genexus.gxoffice.ExcelDoc AV90ExcelDocument ;
}

final  class xlsrem0003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08512", "SELECT T1.TrnCod, T1.EmprCod, T1.AlbREst, T1.TipEntCod, T1.ProceCod, T1.AlbRTartC, T1.AlbRefDsc, T1.AlbREnt2, T1.AlbREnt, T1.AlbRLoc, T1.CliCod, T4.CliNom, T1.AlbRecCod, T1.AlbRUni, T3.ProceNom, T2.TrnNom, T1.AlbRFen, T1.AlbRef, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt FROM (((TXPALBREC T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.AlbRef >= ? and T1.AlbRFen >= ?) AND (T1.AlbRFen <= ?) AND (T1.AlbRef <= ?) AND (T1.AlbREst >= ? and T1.AlbREst <= ?) AND (T1.AlbREnt >= ? and T1.AlbREnt <= ?) AND (T1.TipEntCod <> 9999) AND (( T1.TipEntCod = ?) or (? = 0)) AND (T1.ProceCod >= ? and T1.ProceCod <= ?) AND (T1.AlbRTartC >= ?) AND (T1.AlbRTartC <= ?) AND (T1.AlbRUni = ? or (rtrim(?) IS NULL)) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRef, T1.AlbRFen ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08513", "SELECT ArtCod, CliCod, EmprCod, ArtDsc FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 26);
               ((String[]) buf[11])[0] = rslt.getString(8, 20);
               ((String[]) buf[12])[0] = rslt.getString(9, 8);
               ((String[]) buf[13])[0] = rslt.getString(10, 10);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((String[]) buf[18])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(17);
               ((String[]) buf[23])[0] = rslt.getString(18, 16);
               ((int[]) buf[24])[0] = rslt.getInt(19);
               ((int[]) buf[25])[0] = rslt.getInt(20);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(22,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 8);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

