package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class almacentejidoencrudoclientereferencia_prc extends GXProcedure
{
   public almacentejidoencrudoclientereferencia_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidoencrudoclientereferencia_prc.class ), "" );
   }

   public almacentejidoencrudoclientereferencia_prc( int remoteHandle ,
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
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 )
   {
      almacentejidoencrudoclientereferencia_prc.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
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
                        short[] aP10 ,
                        short[] aP11 ,
                        short[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
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
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      almacentejidoencrudoclientereferencia_prc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      almacentejidoencrudoclientereferencia_prc.this.AV9ImpCod = aP1[0];
      this.aP1 = aP1;
      almacentejidoencrudoclientereferencia_prc.this.AV28PCliente = aP2[0];
      this.aP2 = aP2;
      almacentejidoencrudoclientereferencia_prc.this.AV44UCliente = aP3[0];
      this.aP3 = aP3;
      almacentejidoencrudoclientereferencia_prc.this.AV29PFecha = aP4[0];
      this.aP4 = aP4;
      almacentejidoencrudoclientereferencia_prc.this.AV45UFecha = aP5[0];
      this.aP5 = aP5;
      almacentejidoencrudoclientereferencia_prc.this.AV11AlbRef_i = aP6[0];
      this.aP6 = aP6;
      almacentejidoencrudoclientereferencia_prc.this.AV10AlbRef_f = aP7[0];
      this.aP7 = aP7;
      almacentejidoencrudoclientereferencia_prc.this.AV13Albrenti = aP8[0];
      this.aP8 = aP8;
      almacentejidoencrudoclientereferencia_prc.this.AV12Albrentf = aP9[0];
      this.aP9 = aP9;
      almacentejidoencrudoclientereferencia_prc.this.AV32TipEntcodi = aP10[0];
      this.aP10 = aP10;
      almacentejidoencrudoclientereferencia_prc.this.AV30Tipartcod1 = aP11[0];
      this.aP11 = aP11;
      almacentejidoencrudoclientereferencia_prc.this.AV31Tipartcod2 = aP12[0];
      this.aP12 = aP12;
      almacentejidoencrudoclientereferencia_prc.this.AV22Estado_a = aP13[0];
      this.aP13 = aP13;
      almacentejidoencrudoclientereferencia_prc.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV20ContDsc ;
      new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EM0000", ""), GXv_char1) ;
      almacentejidoencrudoclientereferencia_prc.this.AV20ContDsc = GXv_char1[0] ;
      GXt_int2 = AV25Moda21 ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int3) ;
      almacentejidoencrudoclientereferencia_prc.this.GXt_int2 = GXv_int3[0] ;
      AV25Moda21 = GXt_int2 ;
      GXt_int2 = AV18Cli350 ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int3) ;
      almacentejidoencrudoclientereferencia_prc.this.GXt_int2 = GXv_int3[0] ;
      AV18Cli350 = GXt_int2 ;
      GXt_int4 = AV21ContVal ;
      GXv_int5[0] = GXt_int4 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int5) ;
      almacentejidoencrudoclientereferencia_prc.this.GXt_int4 = GXv_int5[0] ;
      AV21ContVal = GXt_int4 ;
      AV27PAlbRest = (byte)(0) ;
      AV43UALbRest = (byte)(1) ;
      if ( GXutil.strcmp(AV22Estado_a, "0") == 0 )
      {
         AV27PAlbRest = (byte)(0) ;
         AV43UALbRest = (byte)(0) ;
      }
      if ( GXutil.strcmp(AV22Estado_a, "1") == 0 )
      {
         AV27PAlbRest = (byte)(1) ;
         AV43UALbRest = (byte)(1) ;
      }
      AV8AlmacenTejidoencrudoClienteReferencia_SDT.clear();
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV29PFecha ,
                                           AV45UFecha ,
                                           Integer.valueOf(AV28PCliente) ,
                                           Integer.valueOf(AV44UCliente) ,
                                           AV11AlbRef_i ,
                                           AV10AlbRef_f ,
                                           AV13Albrenti ,
                                           AV12Albrentf ,
                                           Short.valueOf(AV30Tipartcod1) ,
                                           Short.valueOf(AV31Tipartcod2) ,
                                           Byte.valueOf(AV27PAlbRest) ,
                                           Byte.valueOf(AV43UALbRest) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A45AlbRef ,
                                           A46AlbREnt ,
                                           Short.valueOf(A6263AlbRTartC) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV32TipEntcodi) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0ATP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV32TipEntcodi), Short.valueOf(AV32TipEntcodi), AV29PFecha, AV45UFecha, Integer.valueOf(AV28PCliente), Integer.valueOf(AV44UCliente), AV11AlbRef_i, AV10AlbRef_f, AV13Albrenti, AV12Albrentf, Short.valueOf(AV30Tipartcod1), Short.valueOf(AV31Tipartcod2), Byte.valueOf(AV27PAlbRest), Byte.valueOf(AV43UALbRest)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkATP2 = false ;
         A49AlbRFen = P0ATP2_A49AlbRFen[0] ;
         A45AlbRef = P0ATP2_A45AlbRef[0] ;
         A46AlbREnt = P0ATP2_A46AlbREnt[0] ;
         A1211TipEntCod = P0ATP2_A1211TipEntCod[0] ;
         n1211TipEntCod = P0ATP2_n1211TipEntCod[0] ;
         A6263AlbRTartC = P0ATP2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P0ATP2_n6263AlbRTartC[0] ;
         A47AlbREst = P0ATP2_A47AlbREst[0] ;
         A58AlbRUniEnt = P0ATP2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P0ATP2_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P0ATP2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P0ATP2_A54AlbRPieUti[0] ;
         A970ProceCod = P0ATP2_A970ProceCod[0] ;
         n970ProceCod = P0ATP2_n970ProceCod[0] ;
         A4295ClasCod = P0ATP2_A4295ClasCod[0] ;
         n4295ClasCod = P0ATP2_n4295ClasCod[0] ;
         A252CliCod = P0ATP2_A252CliCod[0] ;
         A3613AlbRefDsc = P0ATP2_A3613AlbRefDsc[0] ;
         A56AlbRUni = P0ATP2_A56AlbRUni[0] ;
         A279CliNom = P0ATP2_A279CliNom[0] ;
         A44AlbRecCod = P0ATP2_A44AlbRecCod[0] ;
         A279CliNom = P0ATP2_A279CliNom[0] ;
         if ( ( AV25Moda21 == 1 ) && ( A252CliCod == 350 ) && ( AV18Cli350 == 1 ) && ( AV21ContVal == 1 ) )
         {
         }
         else
         {
            AV16ArtCod = A45AlbRef ;
            AV17ArtRef = A3613AlbRefDsc ;
            if ( (GXutil.strcmp("", AV17ArtRef)==0) || ( GXutil.strcmp(GXutil.trim( AV17ArtRef), "") == 0 ) )
            {
               /* Using cursor P0ATP3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV16ArtCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A10030ArtTh = P0ATP3_A10030ArtTh[0] ;
                  n10030ArtTh = P0ATP3_n10030ArtTh[0] ;
                  A65ArtCod = P0ATP3_A65ArtCod[0] ;
                  A69ArtDsc = P0ATP3_A69ArtDsc[0] ;
                  n69ArtDsc = P0ATP3_n69ArtDsc[0] ;
                  AV17ArtRef = A69ArtDsc ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(1);
            }
            AV19CliCod = A252CliCod ;
            AV14AlbUni = A56AlbRUni ;
            AV38TotUniE = DecimalUtil.doubleToDec(0) ;
            AV40TotUniS = DecimalUtil.doubleToDec(0) ;
            AV33TotPzE = 0 ;
            AV36TotPzU = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ATP2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0ATP2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P0ATP2_A45AlbRef[0], A45AlbRef) == 0 ) )
            {
               brkATP2 = false ;
               A49AlbRFen = P0ATP2_A49AlbRFen[0] ;
               A46AlbREnt = P0ATP2_A46AlbREnt[0] ;
               A1211TipEntCod = P0ATP2_A1211TipEntCod[0] ;
               n1211TipEntCod = P0ATP2_n1211TipEntCod[0] ;
               A6263AlbRTartC = P0ATP2_A6263AlbRTartC[0] ;
               n6263AlbRTartC = P0ATP2_n6263AlbRTartC[0] ;
               A47AlbREst = P0ATP2_A47AlbREst[0] ;
               A58AlbRUniEnt = P0ATP2_A58AlbRUniEnt[0] ;
               A60AlbRUniUti = P0ATP2_A60AlbRUniUti[0] ;
               A52AlbRPieEnt = P0ATP2_A52AlbRPieEnt[0] ;
               A54AlbRPieUti = P0ATP2_A54AlbRPieUti[0] ;
               A44AlbRecCod = P0ATP2_A44AlbRecCod[0] ;
               if ( A1211TipEntCod != 9999 )
               {
                  if ( ( A1211TipEntCod == AV32TipEntcodi ) || (0==AV32TipEntcodi) )
                  {
                     AV38TotUniE = AV38TotUniE.add(A58AlbRUniEnt) ;
                     AV40TotUniS = AV40TotUniS.add(A60AlbRUniUti) ;
                     AV33TotPzE = (int)(AV33TotPzE+A52AlbRPieEnt) ;
                     AV36TotPzU = (int)(AV36TotPzU+A54AlbRPieUti) ;
                     AV39TotUniEG = AV39TotUniEG.add(A58AlbRUniEnt) ;
                     AV42TotUniSG = AV42TotUniSG.add(A60AlbRUniUti) ;
                     AV34TotPzEG = (int)(AV34TotPzEG+A52AlbRPieEnt) ;
                     AV37TotPzUG = (int)(AV37TotPzUG+A54AlbRPieUti) ;
                  }
               }
               brkATP2 = true ;
               pr_default.readNext(0);
            }
            AV35TotPzSal = (int)(AV33TotPzE-AV36TotPzU) ;
            AV41TotUniSal = AV38TotUniE.subtract(AV40TotUniS) ;
            AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem = (app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)new app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem(remoteHandle, context);
            AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem.setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod( A252CliCod );
            AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem.setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom( A279CliNom );
            AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem.setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref( AV16ArtCod );
            AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem.setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc( AV17ArtRef );
            AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem.setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni( AV14AlbUni );
            AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem.setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie( AV38TotUniE );
            AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem.setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze( AV33TotPzE );
            AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem.setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis( AV40TotUniS );
            AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem.setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu( AV36TotPzU );
            AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem.setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal( AV41TotUniSal );
            AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem.setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal( AV35TotPzSal );
            AV8AlmacenTejidoencrudoClienteReferencia_SDT.add(AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem, 0);
         }
         if ( ! brkATP2 )
         {
            brkATP2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV24InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTjson = AV8AlmacenTejidoencrudoClienteReferencia_SDT.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = almacentejidoencrudoclientereferencia_prc.this.A396EmprCod;
      this.aP1[0] = almacentejidoencrudoclientereferencia_prc.this.AV9ImpCod;
      this.aP2[0] = almacentejidoencrudoclientereferencia_prc.this.AV28PCliente;
      this.aP3[0] = almacentejidoencrudoclientereferencia_prc.this.AV44UCliente;
      this.aP4[0] = almacentejidoencrudoclientereferencia_prc.this.AV29PFecha;
      this.aP5[0] = almacentejidoencrudoclientereferencia_prc.this.AV45UFecha;
      this.aP6[0] = almacentejidoencrudoclientereferencia_prc.this.AV11AlbRef_i;
      this.aP7[0] = almacentejidoencrudoclientereferencia_prc.this.AV10AlbRef_f;
      this.aP8[0] = almacentejidoencrudoclientereferencia_prc.this.AV13Albrenti;
      this.aP9[0] = almacentejidoencrudoclientereferencia_prc.this.AV12Albrentf;
      this.aP10[0] = almacentejidoencrudoclientereferencia_prc.this.AV32TipEntcodi;
      this.aP11[0] = almacentejidoencrudoclientereferencia_prc.this.AV30Tipartcod1;
      this.aP12[0] = almacentejidoencrudoclientereferencia_prc.this.AV31Tipartcod2;
      this.aP13[0] = almacentejidoencrudoclientereferencia_prc.this.AV22Estado_a;
      this.aP14[0] = almacentejidoencrudoclientereferencia_prc.this.AV24InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTjson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTjson = "" ;
      AV20ContDsc = "" ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int5 = new int[1] ;
      AV8AlmacenTejidoencrudoClienteReferencia_SDT = new GXBaseCollection<app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem>(app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem.class, "AlmacenTejidoencrudoClienteReferencia_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      P0ATP2_A396EmprCod = new String[] {""} ;
      P0ATP2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATP2_A45AlbRef = new String[] {""} ;
      P0ATP2_A46AlbREnt = new String[] {""} ;
      P0ATP2_A1211TipEntCod = new short[1] ;
      P0ATP2_n1211TipEntCod = new boolean[] {false} ;
      P0ATP2_A6263AlbRTartC = new short[1] ;
      P0ATP2_n6263AlbRTartC = new boolean[] {false} ;
      P0ATP2_A47AlbREst = new byte[1] ;
      P0ATP2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATP2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATP2_A52AlbRPieEnt = new int[1] ;
      P0ATP2_A54AlbRPieUti = new int[1] ;
      P0ATP2_A970ProceCod = new short[1] ;
      P0ATP2_n970ProceCod = new boolean[] {false} ;
      P0ATP2_A4295ClasCod = new short[1] ;
      P0ATP2_n4295ClasCod = new boolean[] {false} ;
      P0ATP2_A252CliCod = new int[1] ;
      P0ATP2_A3613AlbRefDsc = new String[] {""} ;
      P0ATP2_A56AlbRUni = new String[] {""} ;
      P0ATP2_A279CliNom = new String[] {""} ;
      P0ATP2_A44AlbRecCod = new int[1] ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A3613AlbRefDsc = "" ;
      A56AlbRUni = "" ;
      A279CliNom = "" ;
      AV16ArtCod = "" ;
      AV17ArtRef = "" ;
      P0ATP3_A396EmprCod = new String[] {""} ;
      P0ATP3_A252CliCod = new int[1] ;
      P0ATP3_A4295ClasCod = new short[1] ;
      P0ATP3_n4295ClasCod = new boolean[] {false} ;
      P0ATP3_A10030ArtTh = new short[1] ;
      P0ATP3_n10030ArtTh = new boolean[] {false} ;
      P0ATP3_A65ArtCod = new String[] {""} ;
      P0ATP3_A69ArtDsc = new String[] {""} ;
      P0ATP3_n69ArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      AV14AlbUni = "" ;
      AV38TotUniE = DecimalUtil.ZERO ;
      AV40TotUniS = DecimalUtil.ZERO ;
      AV39TotUniEG = DecimalUtil.ZERO ;
      AV42TotUniSG = DecimalUtil.ZERO ;
      AV41TotUniSal = DecimalUtil.ZERO ;
      AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem = new app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacentejidoencrudoclientereferencia_prc__default(),
         new Object[] {
             new Object[] {
            P0ATP2_A396EmprCod, P0ATP2_A49AlbRFen, P0ATP2_A45AlbRef, P0ATP2_A46AlbREnt, P0ATP2_A1211TipEntCod, P0ATP2_n1211TipEntCod, P0ATP2_A6263AlbRTartC, P0ATP2_n6263AlbRTartC, P0ATP2_A47AlbREst, P0ATP2_A58AlbRUniEnt,
            P0ATP2_A60AlbRUniUti, P0ATP2_A52AlbRPieEnt, P0ATP2_A54AlbRPieUti, P0ATP2_A970ProceCod, P0ATP2_n970ProceCod, P0ATP2_A4295ClasCod, P0ATP2_n4295ClasCod, P0ATP2_A252CliCod, P0ATP2_A3613AlbRefDsc, P0ATP2_A56AlbRUni,
            P0ATP2_A279CliNom, P0ATP2_A44AlbRecCod
            }
            , new Object[] {
            P0ATP3_A396EmprCod, P0ATP3_A252CliCod, P0ATP3_A4295ClasCod, P0ATP3_n4295ClasCod, P0ATP3_A10030ArtTh, P0ATP3_n10030ArtTh, P0ATP3_A65ArtCod, P0ATP3_A69ArtDsc, P0ATP3_n69ArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25Moda21 ;
   private byte AV18Cli350 ;
   private byte GXt_int2 ;
   private byte GXv_int3[] ;
   private byte AV27PAlbRest ;
   private byte AV43UALbRest ;
   private byte A47AlbREst ;
   private short AV32TipEntcodi ;
   private short AV30Tipartcod1 ;
   private short AV31Tipartcod2 ;
   private short A6263AlbRTartC ;
   private short A1211TipEntCod ;
   private short A970ProceCod ;
   private short A4295ClasCod ;
   private short A10030ArtTh ;
   private short Gx_err ;
   private int AV28PCliente ;
   private int AV44UCliente ;
   private int AV21ContVal ;
   private int GXt_int4 ;
   private int GXv_int5[] ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A44AlbRecCod ;
   private int AV19CliCod ;
   private int AV33TotPzE ;
   private int AV36TotPzU ;
   private int AV34TotPzEG ;
   private int AV37TotPzUG ;
   private int AV35TotPzSal ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV38TotUniE ;
   private java.math.BigDecimal AV40TotUniS ;
   private java.math.BigDecimal AV39TotUniEG ;
   private java.math.BigDecimal AV42TotUniSG ;
   private java.math.BigDecimal AV41TotUniSal ;
   private String A396EmprCod ;
   private String AV9ImpCod ;
   private String AV11AlbRef_i ;
   private String AV10AlbRef_f ;
   private String AV13Albrenti ;
   private String AV12Albrentf ;
   private String AV22Estado_a ;
   private String AV20ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String A3613AlbRefDsc ;
   private String A56AlbRUni ;
   private String A279CliNom ;
   private String AV16ArtCod ;
   private String AV17ArtRef ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String AV14AlbUni ;
   private java.util.Date AV29PFecha ;
   private java.util.Date AV45UFecha ;
   private java.util.Date A49AlbRFen ;
   private boolean brkATP2 ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private boolean n970ProceCod ;
   private boolean n4295ClasCod ;
   private boolean n10030ArtTh ;
   private boolean n69ArtDsc ;
   private String AV24InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTjson ;
   private String[] aP14 ;
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
   private short[] aP10 ;
   private short[] aP11 ;
   private short[] aP12 ;
   private String[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ATP2_A396EmprCod ;
   private java.util.Date[] P0ATP2_A49AlbRFen ;
   private String[] P0ATP2_A45AlbRef ;
   private String[] P0ATP2_A46AlbREnt ;
   private short[] P0ATP2_A1211TipEntCod ;
   private boolean[] P0ATP2_n1211TipEntCod ;
   private short[] P0ATP2_A6263AlbRTartC ;
   private boolean[] P0ATP2_n6263AlbRTartC ;
   private byte[] P0ATP2_A47AlbREst ;
   private java.math.BigDecimal[] P0ATP2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P0ATP2_A60AlbRUniUti ;
   private int[] P0ATP2_A52AlbRPieEnt ;
   private int[] P0ATP2_A54AlbRPieUti ;
   private short[] P0ATP2_A970ProceCod ;
   private boolean[] P0ATP2_n970ProceCod ;
   private short[] P0ATP2_A4295ClasCod ;
   private boolean[] P0ATP2_n4295ClasCod ;
   private int[] P0ATP2_A252CliCod ;
   private String[] P0ATP2_A3613AlbRefDsc ;
   private String[] P0ATP2_A56AlbRUni ;
   private String[] P0ATP2_A279CliNom ;
   private int[] P0ATP2_A44AlbRecCod ;
   private String[] P0ATP3_A396EmprCod ;
   private int[] P0ATP3_A252CliCod ;
   private short[] P0ATP3_A4295ClasCod ;
   private boolean[] P0ATP3_n4295ClasCod ;
   private short[] P0ATP3_A10030ArtTh ;
   private boolean[] P0ATP3_n10030ArtTh ;
   private String[] P0ATP3_A65ArtCod ;
   private String[] P0ATP3_A69ArtDsc ;
   private boolean[] P0ATP3_n69ArtDsc ;
   private GXBaseCollection<app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem> AV8AlmacenTejidoencrudoClienteReferencia_SDT ;
   private app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem AV23InformeAlmacenTejidoCrudo_Cliente_Referencia_SDTItem ;
}

final  class almacentejidoencrudoclientereferencia_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ATP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV29PFecha ,
                                          java.util.Date AV45UFecha ,
                                          int AV28PCliente ,
                                          int AV44UCliente ,
                                          String AV11AlbRef_i ,
                                          String AV10AlbRef_f ,
                                          String AV13Albrenti ,
                                          String AV12Albrentf ,
                                          short AV30Tipartcod1 ,
                                          short AV31Tipartcod2 ,
                                          byte AV27PAlbRest ,
                                          byte AV43UALbRest ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short A6263AlbRTartC ,
                                          byte A47AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV32TipEntcodi ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[15];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRFen, T1.AlbRef, T1.AlbREnt, T1.TipEntCod, T1.AlbRTartC, T1.AlbREst, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt, T1.AlbRPieUti, T1.ProceCod," ;
      scmdbuf += " T1.ClasCod, T1.CliCod, T1.AlbRefDsc, T1.AlbRUni, T2.CliNom, T1.AlbRecCod FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.TipEntCod <> 9999)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29PFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45UFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV28PCliente) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV44UCliente) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11AlbRef_i)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10AlbRef_f)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13Albrenti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12Albrentf)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV30Tipartcod1) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV31Tipartcod2) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV27PAlbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV43UALbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRef" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P0ATP2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATP3", "SELECT * FROM (SELECT EmprCod, CliCod, ClasCod, ArtTh, ArtCod, ArtDsc FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (ClasCod = ?) AND (ArtTh = ?) ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((String[]) buf[18])[0] = rslt.getString(15, 26);
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((String[]) buf[20])[0] = rslt.getString(17, 30);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               return;
      }
   }

}

