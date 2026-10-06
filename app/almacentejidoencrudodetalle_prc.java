package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class almacentejidoencrudodetalle_prc extends GXProcedure
{
   public almacentejidoencrudodetalle_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidoencrudodetalle_prc.class ), "" );
   }

   public almacentejidoencrudodetalle_prc( int remoteHandle ,
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
                             String[] aP18 )
   {
      almacentejidoencrudodetalle_prc.this.aP19 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19);
      return aP19[0];
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
                        String[] aP19 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19);
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
                             String[] aP19 )
   {
      almacentejidoencrudodetalle_prc.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      almacentejidoencrudodetalle_prc.this.AV9ImpCod = aP1[0];
      this.aP1 = aP1;
      almacentejidoencrudodetalle_prc.this.AV10PCliente = aP2[0];
      this.aP2 = aP2;
      almacentejidoencrudodetalle_prc.this.AV11UCliente = aP3[0];
      this.aP3 = aP3;
      almacentejidoencrudodetalle_prc.this.AV12PFecha = aP4[0];
      this.aP4 = aP4;
      almacentejidoencrudodetalle_prc.this.AV13UFecha = aP5[0];
      this.aP5 = aP5;
      almacentejidoencrudodetalle_prc.this.AV14AlbRef_i = aP6[0];
      this.aP6 = aP6;
      almacentejidoencrudodetalle_prc.this.AV15AlbRef_f = aP7[0];
      this.aP7 = aP7;
      almacentejidoencrudodetalle_prc.this.AV16Estado_a = aP8[0];
      this.aP8 = aP8;
      almacentejidoencrudodetalle_prc.this.AV17Albrenti = aP9[0];
      this.aP9 = aP9;
      almacentejidoencrudodetalle_prc.this.AV18Albrentf = aP10[0];
      this.aP10 = aP10;
      almacentejidoencrudodetalle_prc.this.AV19TipENtcodi = aP11[0];
      this.aP11 = aP11;
      almacentejidoencrudodetalle_prc.this.AV20Procodi = aP12[0];
      this.aP12 = aP12;
      almacentejidoencrudodetalle_prc.this.AV21Procodf = aP13[0];
      this.aP13 = aP13;
      almacentejidoencrudodetalle_prc.this.AV22trnCodi = aP14[0];
      this.aP14 = aP14;
      almacentejidoencrudodetalle_prc.this.AV23TrnCodf = aP15[0];
      this.aP15 = aP15;
      almacentejidoencrudodetalle_prc.this.AV24Tipartcod1 = aP16[0];
      this.aP16 = aP16;
      almacentejidoencrudodetalle_prc.this.AV25Tipartcod2 = aP17[0];
      this.aP17 = aP17;
      almacentejidoencrudodetalle_prc.this.AV26Unidad = aP18[0];
      this.aP18 = aP18;
      almacentejidoencrudodetalle_prc.this.aP19 = aP19;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV29ContDsc ;
      new app.pexidsc(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "EM0000", ""), GXv_char1) ;
      almacentejidoencrudodetalle_prc.this.AV29ContDsc = GXv_char1[0] ;
      GXt_int2 = (byte)(AV39Moda21) ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int3) ;
      almacentejidoencrudodetalle_prc.this.GXt_int2 = GXv_int3[0] ;
      AV39Moda21 = GXt_int2 ;
      GXt_int2 = (byte)(AV40Cli350) ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int3) ;
      almacentejidoencrudodetalle_prc.this.GXt_int2 = GXv_int3[0] ;
      AV40Cli350 = GXt_int2 ;
      GXt_int4 = AV30ContVal ;
      GXv_int5[0] = GXt_int4 ;
      new app.pbuscon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int5) ;
      almacentejidoencrudodetalle_prc.this.GXt_int4 = GXv_int5[0] ;
      AV30ContVal = GXt_int4 ;
      AV27PAlbRest = (byte)(0) ;
      AV28UALbRest = (byte)(1) ;
      if ( GXutil.strcmp(AV16Estado_a, "0") == 0 )
      {
         AV27PAlbRest = (byte)(0) ;
         AV28UALbRest = (byte)(0) ;
      }
      if ( GXutil.strcmp(AV16Estado_a, "1") == 0 )
      {
         AV27PAlbRest = (byte)(1) ;
         AV28UALbRest = (byte)(1) ;
      }
      AV36AlmacenTejidoencrudoDetalle_SDT.clear();
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV12PFecha ,
                                           AV13UFecha ,
                                           Integer.valueOf(AV10PCliente) ,
                                           Integer.valueOf(AV11UCliente) ,
                                           AV14AlbRef_i ,
                                           AV15AlbRef_f ,
                                           AV17Albrenti ,
                                           AV18Albrentf ,
                                           Short.valueOf(AV24Tipartcod1) ,
                                           Short.valueOf(AV25Tipartcod2) ,
                                           Byte.valueOf(AV27PAlbRest) ,
                                           Byte.valueOf(AV28UALbRest) ,
                                           Short.valueOf(AV20Procodi) ,
                                           Short.valueOf(AV21Procodf) ,
                                           Short.valueOf(AV22trnCodi) ,
                                           Short.valueOf(AV23TrnCodf) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A45AlbRef ,
                                           A46AlbREnt ,
                                           Short.valueOf(A6263AlbRTartC) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(A840TrnCod) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV19TipENtcodi) ,
                                           A56AlbRUni ,
                                           AV26Unidad ,
                                           AV8EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0ATV2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Short.valueOf(AV19TipENtcodi), Short.valueOf(AV19TipENtcodi), AV26Unidad, AV26Unidad, AV12PFecha, AV13UFecha, Integer.valueOf(AV10PCliente), Integer.valueOf(AV11UCliente), AV14AlbRef_i, AV15AlbRef_f, AV17Albrenti, AV18Albrentf, Short.valueOf(AV24Tipartcod1), Short.valueOf(AV25Tipartcod2), Byte.valueOf(AV27PAlbRest), Byte.valueOf(AV28UALbRest), Short.valueOf(AV20Procodi), Short.valueOf(AV21Procodf), Short.valueOf(AV22trnCodi), Short.valueOf(AV23TrnCodf)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkATV2 = false ;
         A396EmprCod = P0ATV2_A396EmprCod[0] ;
         A1211TipEntCod = P0ATV2_A1211TipEntCod[0] ;
         n1211TipEntCod = P0ATV2_n1211TipEntCod[0] ;
         A6263AlbRTartC = P0ATV2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P0ATV2_n6263AlbRTartC[0] ;
         A47AlbREst = P0ATV2_A47AlbREst[0] ;
         A3613AlbRefDsc = P0ATV2_A3613AlbRefDsc[0] ;
         A252CliCod = P0ATV2_A252CliCod[0] ;
         A5806AlbREnt2 = P0ATV2_A5806AlbREnt2[0] ;
         A46AlbREnt = P0ATV2_A46AlbREnt[0] ;
         A50AlbRLoc = P0ATV2_A50AlbRLoc[0] ;
         A279CliNom = P0ATV2_A279CliNom[0] ;
         A44AlbRecCod = P0ATV2_A44AlbRecCod[0] ;
         A56AlbRUni = P0ATV2_A56AlbRUni[0] ;
         A970ProceCod = P0ATV2_A970ProceCod[0] ;
         n970ProceCod = P0ATV2_n970ProceCod[0] ;
         A971ProceNom = P0ATV2_A971ProceNom[0] ;
         n971ProceNom = P0ATV2_n971ProceNom[0] ;
         A840TrnCod = P0ATV2_A840TrnCod[0] ;
         n840TrnCod = P0ATV2_n840TrnCod[0] ;
         A841TrnNom = P0ATV2_A841TrnNom[0] ;
         n841TrnNom = P0ATV2_n841TrnNom[0] ;
         A49AlbRFen = P0ATV2_A49AlbRFen[0] ;
         A45AlbRef = P0ATV2_A45AlbRef[0] ;
         A54AlbRPieUti = P0ATV2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0ATV2_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P0ATV2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0ATV2_A58AlbRUniEnt[0] ;
         A279CliNom = P0ATV2_A279CliNom[0] ;
         A971ProceNom = P0ATV2_A971ProceNom[0] ;
         n971ProceNom = P0ATV2_n971ProceNom[0] ;
         A841TrnNom = P0ATV2_A841TrnNom[0] ;
         n841TrnNom = P0ATV2_n841TrnNom[0] ;
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
         if ( ( AV39Moda21 == 1 ) && ( A252CliCod == 350 ) && ( AV40Cli350 == 1 ) && ( AV30ContVal == 1 ) )
         {
         }
         else
         {
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ATV2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0ATV2_A252CliCod[0] == A252CliCod ) )
            {
               brkATV2 = false ;
               A1211TipEntCod = P0ATV2_A1211TipEntCod[0] ;
               n1211TipEntCod = P0ATV2_n1211TipEntCod[0] ;
               A6263AlbRTartC = P0ATV2_A6263AlbRTartC[0] ;
               n6263AlbRTartC = P0ATV2_n6263AlbRTartC[0] ;
               A47AlbREst = P0ATV2_A47AlbREst[0] ;
               A3613AlbRefDsc = P0ATV2_A3613AlbRefDsc[0] ;
               A5806AlbREnt2 = P0ATV2_A5806AlbREnt2[0] ;
               A46AlbREnt = P0ATV2_A46AlbREnt[0] ;
               A50AlbRLoc = P0ATV2_A50AlbRLoc[0] ;
               A279CliNom = P0ATV2_A279CliNom[0] ;
               A44AlbRecCod = P0ATV2_A44AlbRecCod[0] ;
               A56AlbRUni = P0ATV2_A56AlbRUni[0] ;
               A970ProceCod = P0ATV2_A970ProceCod[0] ;
               n970ProceCod = P0ATV2_n970ProceCod[0] ;
               A971ProceNom = P0ATV2_A971ProceNom[0] ;
               n971ProceNom = P0ATV2_n971ProceNom[0] ;
               A840TrnCod = P0ATV2_A840TrnCod[0] ;
               n840TrnCod = P0ATV2_n840TrnCod[0] ;
               A841TrnNom = P0ATV2_A841TrnNom[0] ;
               n841TrnNom = P0ATV2_n841TrnNom[0] ;
               A49AlbRFen = P0ATV2_A49AlbRFen[0] ;
               A45AlbRef = P0ATV2_A45AlbRef[0] ;
               A54AlbRPieUti = P0ATV2_A54AlbRPieUti[0] ;
               A52AlbRPieEnt = P0ATV2_A52AlbRPieEnt[0] ;
               A60AlbRUniUti = P0ATV2_A60AlbRUniUti[0] ;
               A58AlbRUniEnt = P0ATV2_A58AlbRUniEnt[0] ;
               A279CliNom = P0ATV2_A279CliNom[0] ;
               A971ProceNom = P0ATV2_A971ProceNom[0] ;
               n971ProceNom = P0ATV2_n971ProceNom[0] ;
               A841TrnNom = P0ATV2_A841TrnNom[0] ;
               n841TrnNom = P0ATV2_n841TrnNom[0] ;
               if ( GXutil.strcmp(A396EmprCod, AV8EmprCod) == 0 )
               {
                  if ( A1211TipEntCod != 9999 )
                  {
                     if ( ( A1211TipEntCod == AV19TipENtcodi ) || (0==AV19TipENtcodi) )
                     {
                        if ( ( GXutil.strcmp(A56AlbRUni, AV26Unidad) == 0 ) || (GXutil.strcmp("", AV26Unidad)==0) )
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
                           if ( ( GXutil.strcmp(AV16Estado_a, "0") == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
                           {
                           }
                           else
                           {
                              AV32AlbRefDsc = A3613AlbRefDsc ;
                              AV33CliCod = A252CliCod ;
                              AV34ArtCod = A45AlbRef ;
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
                              AV35AlbREnt2 = GXutil.substring( A5806AlbREnt2, 1, 16) ;
                              if ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 )
                              {
                                 AV35AlbREnt2 = A46AlbREnt ;
                              }
                              AV45Albrloc5 = GXutil.substring( A50AlbRLoc, 1, 5) ;
                              AV37AlmacenTejidoencrudoDetalle_SDTItem = (app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)new app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem(remoteHandle, context);
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clicod( A252CliCod );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clinom( A279CliNom );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albref( A45AlbRef );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrefdsc( AV32AlbRefDsc );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albreccod( A44AlbRecCod );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrfen( A49AlbRFen );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrent2( AV35AlbREnt2 );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni( A56AlbRUni );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunient( A58AlbRUniEnt );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieent( A52AlbRPieEnt );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruniuti( A60AlbRUniUti );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieuti( A54AlbRPieUti );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunidis( A57AlbRUniDis );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpiedis( A51AlbRPieDis );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procecod( A970ProceCod );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procenom( A971ProceNom );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trncod( A840TrnCod );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trnnom( A841TrnNom );
                              AV37AlmacenTejidoencrudoDetalle_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrloc( A50AlbRLoc );
                              AV36AlmacenTejidoencrudoDetalle_SDT.add(AV37AlmacenTejidoencrudoDetalle_SDTItem, 0);
                           }
                        }
                     }
                  }
               }
               brkATV2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brkATV2 )
         {
            brkATV2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV38AlmacenTejidoencrudoDetalle_SDTJson = AV36AlmacenTejidoencrudoDetalle_SDT.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV32AlbRefDsc = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV10PCliente) ,
                                           Integer.valueOf(AV11UCliente) ,
                                           Integer.valueOf(A252CliCod) ,
                                           AV8EmprCod ,
                                           Integer.valueOf(AV33CliCod) ,
                                           AV34ArtCod ,
                                           A396EmprCod ,
                                           A65ArtCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0ATV3 */
      pr_default.execute(1, new Object[] {AV8EmprCod, Integer.valueOf(AV33CliCod), AV34ArtCod, Integer.valueOf(AV10PCliente), Integer.valueOf(AV11UCliente)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A65ArtCod = P0ATV3_A65ArtCod[0] ;
         A252CliCod = P0ATV3_A252CliCod[0] ;
         A396EmprCod = P0ATV3_A396EmprCod[0] ;
         A69ArtDsc = P0ATV3_A69ArtDsc[0] ;
         n69ArtDsc = P0ATV3_n69ArtDsc[0] ;
         AV32AlbRefDsc = A69ArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = almacentejidoencrudodetalle_prc.this.AV8EmprCod;
      this.aP1[0] = almacentejidoencrudodetalle_prc.this.AV9ImpCod;
      this.aP2[0] = almacentejidoencrudodetalle_prc.this.AV10PCliente;
      this.aP3[0] = almacentejidoencrudodetalle_prc.this.AV11UCliente;
      this.aP4[0] = almacentejidoencrudodetalle_prc.this.AV12PFecha;
      this.aP5[0] = almacentejidoencrudodetalle_prc.this.AV13UFecha;
      this.aP6[0] = almacentejidoencrudodetalle_prc.this.AV14AlbRef_i;
      this.aP7[0] = almacentejidoencrudodetalle_prc.this.AV15AlbRef_f;
      this.aP8[0] = almacentejidoencrudodetalle_prc.this.AV16Estado_a;
      this.aP9[0] = almacentejidoencrudodetalle_prc.this.AV17Albrenti;
      this.aP10[0] = almacentejidoencrudodetalle_prc.this.AV18Albrentf;
      this.aP11[0] = almacentejidoencrudodetalle_prc.this.AV19TipENtcodi;
      this.aP12[0] = almacentejidoencrudodetalle_prc.this.AV20Procodi;
      this.aP13[0] = almacentejidoencrudodetalle_prc.this.AV21Procodf;
      this.aP14[0] = almacentejidoencrudodetalle_prc.this.AV22trnCodi;
      this.aP15[0] = almacentejidoencrudodetalle_prc.this.AV23TrnCodf;
      this.aP16[0] = almacentejidoencrudodetalle_prc.this.AV24Tipartcod1;
      this.aP17[0] = almacentejidoencrudodetalle_prc.this.AV25Tipartcod2;
      this.aP18[0] = almacentejidoencrudodetalle_prc.this.AV26Unidad;
      this.aP19[0] = almacentejidoencrudodetalle_prc.this.AV38AlmacenTejidoencrudoDetalle_SDTJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38AlmacenTejidoencrudoDetalle_SDTJson = "" ;
      AV29ContDsc = "" ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int5 = new int[1] ;
      AV36AlmacenTejidoencrudoDetalle_SDT = new GXBaseCollection<app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem>(app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem.class, "AlmacenTejidoencrudoDetalle_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      A56AlbRUni = "" ;
      A396EmprCod = "" ;
      P0ATV2_A396EmprCod = new String[] {""} ;
      P0ATV2_A1211TipEntCod = new short[1] ;
      P0ATV2_n1211TipEntCod = new boolean[] {false} ;
      P0ATV2_A6263AlbRTartC = new short[1] ;
      P0ATV2_n6263AlbRTartC = new boolean[] {false} ;
      P0ATV2_A47AlbREst = new byte[1] ;
      P0ATV2_A3613AlbRefDsc = new String[] {""} ;
      P0ATV2_A252CliCod = new int[1] ;
      P0ATV2_A5806AlbREnt2 = new String[] {""} ;
      P0ATV2_A46AlbREnt = new String[] {""} ;
      P0ATV2_A50AlbRLoc = new String[] {""} ;
      P0ATV2_A279CliNom = new String[] {""} ;
      P0ATV2_A44AlbRecCod = new int[1] ;
      P0ATV2_A56AlbRUni = new String[] {""} ;
      P0ATV2_A970ProceCod = new short[1] ;
      P0ATV2_n970ProceCod = new boolean[] {false} ;
      P0ATV2_A971ProceNom = new String[] {""} ;
      P0ATV2_n971ProceNom = new boolean[] {false} ;
      P0ATV2_A840TrnCod = new short[1] ;
      P0ATV2_n840TrnCod = new boolean[] {false} ;
      P0ATV2_A841TrnNom = new String[] {""} ;
      P0ATV2_n841TrnNom = new boolean[] {false} ;
      P0ATV2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATV2_A45AlbRef = new String[] {""} ;
      P0ATV2_A54AlbRPieUti = new int[1] ;
      P0ATV2_A52AlbRPieEnt = new int[1] ;
      P0ATV2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATV2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3613AlbRefDsc = "" ;
      A5806AlbREnt2 = "" ;
      A50AlbRLoc = "" ;
      A279CliNom = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      AV32AlbRefDsc = "" ;
      AV34ArtCod = "" ;
      AV35AlbREnt2 = "" ;
      AV45Albrloc5 = "" ;
      AV37AlmacenTejidoencrudoDetalle_SDTItem = new app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem(remoteHandle, context);
      A65ArtCod = "" ;
      P0ATV3_A65ArtCod = new String[] {""} ;
      P0ATV3_A252CliCod = new int[1] ;
      P0ATV3_A396EmprCod = new String[] {""} ;
      P0ATV3_A69ArtDsc = new String[] {""} ;
      P0ATV3_n69ArtDsc = new boolean[] {false} ;
      A69ArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacentejidoencrudodetalle_prc__default(),
         new Object[] {
             new Object[] {
            P0ATV2_A396EmprCod, P0ATV2_A1211TipEntCod, P0ATV2_n1211TipEntCod, P0ATV2_A6263AlbRTartC, P0ATV2_n6263AlbRTartC, P0ATV2_A47AlbREst, P0ATV2_A3613AlbRefDsc, P0ATV2_A252CliCod, P0ATV2_A5806AlbREnt2, P0ATV2_A46AlbREnt,
            P0ATV2_A50AlbRLoc, P0ATV2_A279CliNom, P0ATV2_A44AlbRecCod, P0ATV2_A56AlbRUni, P0ATV2_A970ProceCod, P0ATV2_n970ProceCod, P0ATV2_A971ProceNom, P0ATV2_n971ProceNom, P0ATV2_A840TrnCod, P0ATV2_n840TrnCod,
            P0ATV2_A841TrnNom, P0ATV2_n841TrnNom, P0ATV2_A49AlbRFen, P0ATV2_A45AlbRef, P0ATV2_A54AlbRPieUti, P0ATV2_A52AlbRPieEnt, P0ATV2_A60AlbRUniUti, P0ATV2_A58AlbRUniEnt
            }
            , new Object[] {
            P0ATV3_A65ArtCod, P0ATV3_A252CliCod, P0ATV3_A396EmprCod, P0ATV3_A69ArtDsc, P0ATV3_n69ArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int2 ;
   private byte GXv_int3[] ;
   private byte AV27PAlbRest ;
   private byte AV28UALbRest ;
   private byte A47AlbREst ;
   private short AV19TipENtcodi ;
   private short AV20Procodi ;
   private short AV21Procodf ;
   private short AV22trnCodi ;
   private short AV23TrnCodf ;
   private short AV24Tipartcod1 ;
   private short AV25Tipartcod2 ;
   private short AV39Moda21 ;
   private short AV40Cli350 ;
   private short A6263AlbRTartC ;
   private short A970ProceCod ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV10PCliente ;
   private int AV11UCliente ;
   private int AV30ContVal ;
   private int GXt_int4 ;
   private int GXv_int5[] ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int AV33CliCod ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String AV8EmprCod ;
   private String AV9ImpCod ;
   private String AV14AlbRef_i ;
   private String AV15AlbRef_f ;
   private String AV16Estado_a ;
   private String AV17Albrenti ;
   private String AV18Albrentf ;
   private String AV26Unidad ;
   private String AV29ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String A56AlbRUni ;
   private String A396EmprCod ;
   private String A3613AlbRefDsc ;
   private String A5806AlbREnt2 ;
   private String A50AlbRLoc ;
   private String A279CliNom ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String AV32AlbRefDsc ;
   private String AV34ArtCod ;
   private String AV35AlbREnt2 ;
   private String AV45Albrloc5 ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private java.util.Date AV12PFecha ;
   private java.util.Date AV13UFecha ;
   private java.util.Date A49AlbRFen ;
   private boolean brkATV2 ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n840TrnCod ;
   private boolean n841TrnNom ;
   private boolean returnInSub ;
   private boolean n69ArtDsc ;
   private String AV38AlmacenTejidoencrudoDetalle_SDTJson ;
   private String[] aP19 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P0ATV2_A396EmprCod ;
   private short[] P0ATV2_A1211TipEntCod ;
   private boolean[] P0ATV2_n1211TipEntCod ;
   private short[] P0ATV2_A6263AlbRTartC ;
   private boolean[] P0ATV2_n6263AlbRTartC ;
   private byte[] P0ATV2_A47AlbREst ;
   private String[] P0ATV2_A3613AlbRefDsc ;
   private int[] P0ATV2_A252CliCod ;
   private String[] P0ATV2_A5806AlbREnt2 ;
   private String[] P0ATV2_A46AlbREnt ;
   private String[] P0ATV2_A50AlbRLoc ;
   private String[] P0ATV2_A279CliNom ;
   private int[] P0ATV2_A44AlbRecCod ;
   private String[] P0ATV2_A56AlbRUni ;
   private short[] P0ATV2_A970ProceCod ;
   private boolean[] P0ATV2_n970ProceCod ;
   private String[] P0ATV2_A971ProceNom ;
   private boolean[] P0ATV2_n971ProceNom ;
   private short[] P0ATV2_A840TrnCod ;
   private boolean[] P0ATV2_n840TrnCod ;
   private String[] P0ATV2_A841TrnNom ;
   private boolean[] P0ATV2_n841TrnNom ;
   private java.util.Date[] P0ATV2_A49AlbRFen ;
   private String[] P0ATV2_A45AlbRef ;
   private int[] P0ATV2_A54AlbRPieUti ;
   private int[] P0ATV2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P0ATV2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0ATV2_A58AlbRUniEnt ;
   private String[] P0ATV3_A65ArtCod ;
   private int[] P0ATV3_A252CliCod ;
   private String[] P0ATV3_A396EmprCod ;
   private String[] P0ATV3_A69ArtDsc ;
   private boolean[] P0ATV3_n69ArtDsc ;
   private GXBaseCollection<app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem> AV36AlmacenTejidoencrudoDetalle_SDT ;
   private app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem AV37AlmacenTejidoencrudoDetalle_SDTItem ;
}

final  class almacentejidoencrudodetalle_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ATV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV12PFecha ,
                                          java.util.Date AV13UFecha ,
                                          int AV10PCliente ,
                                          int AV11UCliente ,
                                          String AV14AlbRef_i ,
                                          String AV15AlbRef_f ,
                                          String AV17Albrenti ,
                                          String AV18Albrentf ,
                                          short AV24Tipartcod1 ,
                                          short AV25Tipartcod2 ,
                                          byte AV27PAlbRest ,
                                          byte AV28UALbRest ,
                                          short AV20Procodi ,
                                          short AV21Procodf ,
                                          short AV22trnCodi ,
                                          short AV23TrnCodf ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short A6263AlbRTartC ,
                                          byte A47AlbREst ,
                                          short A970ProceCod ,
                                          short A840TrnCod ,
                                          short A1211TipEntCod ,
                                          short AV19TipENtcodi ,
                                          String A56AlbRUni ,
                                          String AV26Unidad ,
                                          String AV8EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[21];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.TipEntCod, T1.AlbRTartC, T1.AlbREst, T1.AlbRefDsc, T1.CliCod, T1.AlbREnt2, T1.AlbREnt, T1.AlbRLoc, T2.CliNom, T1.AlbRecCod, T1.AlbRUni, T1.ProceCod," ;
      scmdbuf += " T3.ProceNom, T1.TrnCod, T4.TrnNom, T1.AlbRFen, T1.AlbRef, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt FROM (((TXPALBREC T1 INNER JOIN TXPCLIENT T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T1.ProceCod) LEFT JOIN TXPTRANSP T4 ON" ;
      scmdbuf += " T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.TipEntCod <> 9999)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.AlbRUni = ? or (rtrim(?) IS NULL))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12PFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13UFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV10PCliente) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV11UCliente) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV14AlbRef_i)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15AlbRef_f)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17Albrenti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18Albrentf)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV24Tipartcod1) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV25Tipartcod2) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV27PAlbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV28UALbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV20Procodi) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV21Procodf) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV22trnCodi) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV23TrnCodf) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRef, T1.AlbRFen" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0ATV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV10PCliente ,
                                          int AV11UCliente ,
                                          int A252CliCod ,
                                          String AV8EmprCod ,
                                          int AV33CliCod ,
                                          String AV34ArtCod ,
                                          String A396EmprCod ,
                                          String A65ArtCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[5];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT ArtCod, CliCod, EmprCod, ArtDsc FROM TXPARTICU" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and ArtCod = ?)");
      if ( ! (0==AV10PCliente) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV11UCliente) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, ArtCod" ;
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
                  return conditional_P0ATV2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P0ATV3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 20);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((String[]) buf[10])[0] = rslt.getString(9, 10);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
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
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               return;
      }
   }

}

