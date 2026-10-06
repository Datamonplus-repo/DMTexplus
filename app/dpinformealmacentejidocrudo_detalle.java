package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpinformealmacentejidocrudo_detalle extends GXProcedure
{
   public dpinformealmacentejidocrudo_detalle( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpinformealmacentejidocrudo_detalle.class ), "" );
   }

   public dpinformealmacentejidocrudo_detalle( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle> executeUdp( String aP0 ,
                                                                                    java.util.Date aP1 ,
                                                                                    java.util.Date aP2 ,
                                                                                    int aP3 ,
                                                                                    int aP4 ,
                                                                                    String aP5 ,
                                                                                    String aP6 ,
                                                                                    short aP7 ,
                                                                                    short aP8 ,
                                                                                    byte aP9 ,
                                                                                    byte aP10 ,
                                                                                    String aP11 ,
                                                                                    String aP12 ,
                                                                                    short aP13 ,
                                                                                    String aP14 )
   {
      dpinformealmacentejidocrudo_detalle.this.aP15 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        int aP4 ,
                        String aP5 ,
                        String aP6 ,
                        short aP7 ,
                        short aP8 ,
                        byte aP9 ,
                        byte aP10 ,
                        String aP11 ,
                        String aP12 ,
                        short aP13 ,
                        String aP14 ,
                        GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle>[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             int aP4 ,
                             String aP5 ,
                             String aP6 ,
                             short aP7 ,
                             short aP8 ,
                             byte aP9 ,
                             byte aP10 ,
                             String aP11 ,
                             String aP12 ,
                             short aP13 ,
                             String aP14 ,
                             GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle>[] aP15 )
   {
      dpinformealmacentejidocrudo_detalle.this.AV15Emprcod = aP0;
      dpinformealmacentejidocrudo_detalle.this.AV7AlbRFen = aP1;
      dpinformealmacentejidocrudo_detalle.this.AV8AlbRFen_to = aP2;
      dpinformealmacentejidocrudo_detalle.this.AV11CliCod = aP3;
      dpinformealmacentejidocrudo_detalle.this.AV12CliCod_to = aP4;
      dpinformealmacentejidocrudo_detalle.this.AV5AlbRef = aP5;
      dpinformealmacentejidocrudo_detalle.this.AV6AlbRef_to = aP6;
      dpinformealmacentejidocrudo_detalle.this.AV9AlbRTartC = aP7;
      dpinformealmacentejidocrudo_detalle.this.AV10AlbRTartC_to = aP8;
      dpinformealmacentejidocrudo_detalle.this.AV17Albrestfrom = aP9;
      dpinformealmacentejidocrudo_detalle.this.AV16Albrestto = aP10;
      dpinformealmacentejidocrudo_detalle.this.AV21AlbREntfrom = aP11;
      dpinformealmacentejidocrudo_detalle.this.AV20AlbREntto = aP12;
      dpinformealmacentejidocrudo_detalle.this.AV19TipEntCod = aP13;
      dpinformealmacentejidocrudo_detalle.this.AV18Tipo = aP14;
      dpinformealmacentejidocrudo_detalle.this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV21AlbREntfrom ,
                                           AV20AlbREntto ,
                                           A46AlbREnt ,
                                           A49AlbRFen ,
                                           AV7AlbRFen ,
                                           AV8AlbRFen_to ,
                                           A45AlbRef ,
                                           AV6AlbRef_to ,
                                           Short.valueOf(A6263AlbRTartC) ,
                                           Short.valueOf(AV9AlbRTartC) ,
                                           Short.valueOf(AV10AlbRTartC_to) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV17Albrestfrom) ,
                                           Byte.valueOf(AV16Albrestto) ,
                                           A55AlbRReo ,
                                           AV18Tipo ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV19TipEntCod) ,
                                           AV15Emprcod ,
                                           Integer.valueOf(AV11CliCod) ,
                                           AV5AlbRef ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV12CliCod_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor P001Y2 */
      pr_default.execute(0, new Object[] {AV15Emprcod, Integer.valueOf(AV11CliCod), AV5AlbRef, AV7AlbRFen, AV8AlbRFen_to, AV6AlbRef_to, Short.valueOf(AV9AlbRTartC), Short.valueOf(AV10AlbRTartC_to), Byte.valueOf(AV17Albrestfrom), Byte.valueOf(AV16Albrestto), Short.valueOf(AV19TipEntCod), Short.valueOf(AV19TipEntCod), Integer.valueOf(AV12CliCod_to), AV21AlbREntfrom, AV20AlbREntto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1Y2 = false ;
         A840TrnCod = P001Y2_A840TrnCod[0] ;
         n840TrnCod = P001Y2_n840TrnCod[0] ;
         A970ProceCod = P001Y2_A970ProceCod[0] ;
         n970ProceCod = P001Y2_n970ProceCod[0] ;
         A45AlbRef = P001Y2_A45AlbRef[0] ;
         A3613AlbRefDsc = P001Y2_A3613AlbRefDsc[0] ;
         A44AlbRecCod = P001Y2_A44AlbRecCod[0] ;
         A49AlbRFen = P001Y2_A49AlbRFen[0] ;
         A46AlbREnt = P001Y2_A46AlbREnt[0] ;
         A5806AlbREnt2 = P001Y2_A5806AlbREnt2[0] ;
         A56AlbRUni = P001Y2_A56AlbRUni[0] ;
         A58AlbRUniEnt = P001Y2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P001Y2_A60AlbRUniUti[0] ;
         A50AlbRLoc = P001Y2_A50AlbRLoc[0] ;
         A6463AlbRLote = P001Y2_A6463AlbRLote[0] ;
         A971ProceNom = P001Y2_A971ProceNom[0] ;
         n971ProceNom = P001Y2_n971ProceNom[0] ;
         A841TrnNom = P001Y2_A841TrnNom[0] ;
         n841TrnNom = P001Y2_n841TrnNom[0] ;
         A3359AlbRDisCli = P001Y2_A3359AlbRDisCli[0] ;
         A252CliCod = P001Y2_A252CliCod[0] ;
         A396EmprCod = P001Y2_A396EmprCod[0] ;
         A1211TipEntCod = P001Y2_A1211TipEntCod[0] ;
         n1211TipEntCod = P001Y2_n1211TipEntCod[0] ;
         A55AlbRReo = P001Y2_A55AlbRReo[0] ;
         A47AlbREst = P001Y2_A47AlbREst[0] ;
         A6263AlbRTartC = P001Y2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P001Y2_n6263AlbRTartC[0] ;
         A279CliNom = P001Y2_A279CliNom[0] ;
         A54AlbRPieUti = P001Y2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P001Y2_A52AlbRPieEnt[0] ;
         A279CliNom = P001Y2_A279CliNom[0] ;
         A841TrnNom = P001Y2_A841TrnNom[0] ;
         n841TrnNom = P001Y2_n841TrnNom[0] ;
         A971ProceNom = P001Y2_A971ProceNom[0] ;
         n971ProceNom = P001Y2_n971ProceNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV18Tipo) == 0 ) || ( GXutil.strcmp(AV18Tipo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            Gxm1sdtinformealmacentejidocrudo_detalle = (app.SdtSDTInformeAlmacenTejidoCrudo_Detalle)new app.SdtSDTInformeAlmacenTejidoCrudo_Detalle(remoteHandle, context);
            Gxm2rootcol.add(Gxm1sdtinformealmacentejidocrudo_detalle, 0);
            Gxm1sdtinformealmacentejidocrudo_detalle.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod( A252CliCod );
            Gxm1sdtinformealmacentejidocrudo_detalle.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom( A279CliNom );
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001Y2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001Y2_A252CliCod[0] == A252CliCod ) )
            {
               brk1Y2 = false ;
               A840TrnCod = P001Y2_A840TrnCod[0] ;
               n840TrnCod = P001Y2_n840TrnCod[0] ;
               A970ProceCod = P001Y2_A970ProceCod[0] ;
               n970ProceCod = P001Y2_n970ProceCod[0] ;
               A45AlbRef = P001Y2_A45AlbRef[0] ;
               A3613AlbRefDsc = P001Y2_A3613AlbRefDsc[0] ;
               A44AlbRecCod = P001Y2_A44AlbRecCod[0] ;
               A49AlbRFen = P001Y2_A49AlbRFen[0] ;
               A46AlbREnt = P001Y2_A46AlbREnt[0] ;
               A5806AlbREnt2 = P001Y2_A5806AlbREnt2[0] ;
               A56AlbRUni = P001Y2_A56AlbRUni[0] ;
               A58AlbRUniEnt = P001Y2_A58AlbRUniEnt[0] ;
               A60AlbRUniUti = P001Y2_A60AlbRUniUti[0] ;
               A50AlbRLoc = P001Y2_A50AlbRLoc[0] ;
               A6463AlbRLote = P001Y2_A6463AlbRLote[0] ;
               A971ProceNom = P001Y2_A971ProceNom[0] ;
               n971ProceNom = P001Y2_n971ProceNom[0] ;
               A841TrnNom = P001Y2_A841TrnNom[0] ;
               n841TrnNom = P001Y2_n841TrnNom[0] ;
               A3359AlbRDisCli = P001Y2_A3359AlbRDisCli[0] ;
               A54AlbRPieUti = P001Y2_A54AlbRPieUti[0] ;
               A52AlbRPieEnt = P001Y2_A52AlbRPieEnt[0] ;
               A841TrnNom = P001Y2_A841TrnNom[0] ;
               n841TrnNom = P001Y2_n841TrnNom[0] ;
               A971ProceNom = P001Y2_A971ProceNom[0] ;
               n971ProceNom = P001Y2_n971ProceNom[0] ;
               A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas = (app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea)new app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea(remoteHandle, context);
               Gxm1sdtinformealmacentejidocrudo_detalle.getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas().add(Gxm3sdtinformealmacentejidocrudo_detalle_lineas, 0);
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref( A45AlbRef );
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_char2) ;
               dpinformealmacentejidocrudo_detalle.this.GXt_char1 = GXv_char2[0] ;
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc( ((GXutil.strcmp("", A3613AlbRefDsc)==0) ? GXt_char1 : A3613AlbRefDsc) );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod( A44AlbRecCod );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen( A49AlbRFen );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran( ((GXutil.strcmp("", A5806AlbREnt2)==0) ? A46AlbREnt : A5806AlbREnt2) );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni( A56AlbRUni );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient( A58AlbRUniEnt );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti( A60AlbRUniUti );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres( (A58AlbRUniEnt.subtract(A60AlbRUniUti)) );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent( A52AlbRPieEnt );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti( A54AlbRPieUti );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis( A51AlbRPieDis );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc( A50AlbRLoc );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote( A6463AlbRLote );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom( A971ProceNom );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom( A841TrnNom );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli( A3359AlbRDisCli );
               AV13UnidadesExpedidas = DecimalUtil.ZERO ;
               AV14PiezasExpedidas = (short)(0) ;
               /* Using cursor P001Y3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A183BarMetLan = P001Y3_A183BarMetLan[0] ;
                  A170BarKilLan = P001Y3_A170BarKilLan[0] ;
                  A1271BarPieLzd = P001Y3_A1271BarPieLzd[0] ;
                  A200BarPieCod = P001Y3_A200BarPieCod[0] ;
                  A129BarCod = P001Y3_A129BarCod[0] ;
                  A132BarCodReo = P001Y3_A132BarCodReo[0] ;
                  A130BarCodPar = P001Y3_A130BarCodPar[0] ;
                  AV13UnidadesExpedidas = AV13UnidadesExpedidas.add(((GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", ""))==0) ? A170BarKilLan : A183BarMetLan)) ;
                  AV14PiezasExpedidas = (short)(AV14PiezasExpedidas+A1271BarPieLzd) ;
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas( AV13UnidadesExpedidas );
               Gxm3sdtinformealmacentejidocrudo_detalle_lineas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas( AV14PiezasExpedidas );
               brk1Y2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk1Y2 )
         {
            brk1Y2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP15[0] = dpinformealmacentejidocrudo_detalle.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle>(app.SdtSDTInformeAlmacenTejidoCrudo_Detalle.class, "SDTInformeAlmacenTejidoCrudo_Detalle", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A46AlbREnt = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A55AlbRReo = "" ;
      A396EmprCod = "" ;
      P001Y2_A840TrnCod = new short[1] ;
      P001Y2_n840TrnCod = new boolean[] {false} ;
      P001Y2_A970ProceCod = new short[1] ;
      P001Y2_n970ProceCod = new boolean[] {false} ;
      P001Y2_A45AlbRef = new String[] {""} ;
      P001Y2_A3613AlbRefDsc = new String[] {""} ;
      P001Y2_A44AlbRecCod = new int[1] ;
      P001Y2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P001Y2_A46AlbREnt = new String[] {""} ;
      P001Y2_A5806AlbREnt2 = new String[] {""} ;
      P001Y2_A56AlbRUni = new String[] {""} ;
      P001Y2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001Y2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001Y2_A50AlbRLoc = new String[] {""} ;
      P001Y2_A6463AlbRLote = new String[] {""} ;
      P001Y2_A971ProceNom = new String[] {""} ;
      P001Y2_n971ProceNom = new boolean[] {false} ;
      P001Y2_A841TrnNom = new String[] {""} ;
      P001Y2_n841TrnNom = new boolean[] {false} ;
      P001Y2_A3359AlbRDisCli = new String[] {""} ;
      P001Y2_A252CliCod = new int[1] ;
      P001Y2_A396EmprCod = new String[] {""} ;
      P001Y2_A1211TipEntCod = new short[1] ;
      P001Y2_n1211TipEntCod = new boolean[] {false} ;
      P001Y2_A55AlbRReo = new String[] {""} ;
      P001Y2_A47AlbREst = new byte[1] ;
      P001Y2_A6263AlbRTartC = new short[1] ;
      P001Y2_n6263AlbRTartC = new boolean[] {false} ;
      P001Y2_A279CliNom = new String[] {""} ;
      P001Y2_A54AlbRPieUti = new int[1] ;
      P001Y2_A52AlbRPieEnt = new int[1] ;
      A3613AlbRefDsc = "" ;
      A5806AlbREnt2 = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      A6463AlbRLote = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A3359AlbRDisCli = "" ;
      A279CliNom = "" ;
      Gxm1sdtinformealmacentejidocrudo_detalle = new app.SdtSDTInformeAlmacenTejidoCrudo_Detalle(remoteHandle, context);
      Gxm3sdtinformealmacentejidocrudo_detalle_lineas = new app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV13UnidadesExpedidas = DecimalUtil.ZERO ;
      P001Y3_A396EmprCod = new String[] {""} ;
      P001Y3_A44AlbRecCod = new int[1] ;
      P001Y3_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001Y3_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001Y3_A1271BarPieLzd = new int[1] ;
      P001Y3_A200BarPieCod = new String[] {""} ;
      P001Y3_A129BarCod = new int[1] ;
      P001Y3_A132BarCodReo = new byte[1] ;
      P001Y3_A130BarCodPar = new String[] {""} ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpinformealmacentejidocrudo_detalle__default(),
         new Object[] {
             new Object[] {
            P001Y2_A840TrnCod, P001Y2_n840TrnCod, P001Y2_A970ProceCod, P001Y2_n970ProceCod, P001Y2_A45AlbRef, P001Y2_A3613AlbRefDsc, P001Y2_A44AlbRecCod, P001Y2_A49AlbRFen, P001Y2_A46AlbREnt, P001Y2_A5806AlbREnt2,
            P001Y2_A56AlbRUni, P001Y2_A58AlbRUniEnt, P001Y2_A60AlbRUniUti, P001Y2_A50AlbRLoc, P001Y2_A6463AlbRLote, P001Y2_A971ProceNom, P001Y2_n971ProceNom, P001Y2_A841TrnNom, P001Y2_n841TrnNom, P001Y2_A3359AlbRDisCli,
            P001Y2_A252CliCod, P001Y2_A396EmprCod, P001Y2_A1211TipEntCod, P001Y2_n1211TipEntCod, P001Y2_A55AlbRReo, P001Y2_A47AlbREst, P001Y2_A6263AlbRTartC, P001Y2_n6263AlbRTartC, P001Y2_A279CliNom, P001Y2_A54AlbRPieUti,
            P001Y2_A52AlbRPieEnt
            }
            , new Object[] {
            P001Y3_A396EmprCod, P001Y3_A44AlbRecCod, P001Y3_A183BarMetLan, P001Y3_A170BarKilLan, P001Y3_A1271BarPieLzd, P001Y3_A200BarPieCod, P001Y3_A129BarCod, P001Y3_A132BarCodReo, P001Y3_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Albrestfrom ;
   private byte AV16Albrestto ;
   private byte A47AlbREst ;
   private byte A132BarCodReo ;
   private short AV9AlbRTartC ;
   private short AV10AlbRTartC_to ;
   private short AV19TipEntCod ;
   private short A6263AlbRTartC ;
   private short A1211TipEntCod ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short AV14PiezasExpedidas ;
   private short Gx_err ;
   private int AV11CliCod ;
   private int AV12CliCod_to ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int A1271BarPieLzd ;
   private int A129BarCod ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV13UnidadesExpedidas ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private String AV15Emprcod ;
   private String AV5AlbRef ;
   private String AV6AlbRef_to ;
   private String AV21AlbREntfrom ;
   private String AV20AlbREntto ;
   private String AV18Tipo ;
   private String scmdbuf ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A55AlbRReo ;
   private String A396EmprCod ;
   private String A3613AlbRefDsc ;
   private String A5806AlbREnt2 ;
   private String A56AlbRUni ;
   private String A50AlbRLoc ;
   private String A6463AlbRLote ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String A3359AlbRDisCli ;
   private String A279CliNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private java.util.Date AV7AlbRFen ;
   private java.util.Date AV8AlbRFen_to ;
   private java.util.Date A49AlbRFen ;
   private boolean brk1Y2 ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle>[] aP15 ;
   private IDataStoreProvider pr_default ;
   private short[] P001Y2_A840TrnCod ;
   private boolean[] P001Y2_n840TrnCod ;
   private short[] P001Y2_A970ProceCod ;
   private boolean[] P001Y2_n970ProceCod ;
   private String[] P001Y2_A45AlbRef ;
   private String[] P001Y2_A3613AlbRefDsc ;
   private int[] P001Y2_A44AlbRecCod ;
   private java.util.Date[] P001Y2_A49AlbRFen ;
   private String[] P001Y2_A46AlbREnt ;
   private String[] P001Y2_A5806AlbREnt2 ;
   private String[] P001Y2_A56AlbRUni ;
   private java.math.BigDecimal[] P001Y2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P001Y2_A60AlbRUniUti ;
   private String[] P001Y2_A50AlbRLoc ;
   private String[] P001Y2_A6463AlbRLote ;
   private String[] P001Y2_A971ProceNom ;
   private boolean[] P001Y2_n971ProceNom ;
   private String[] P001Y2_A841TrnNom ;
   private boolean[] P001Y2_n841TrnNom ;
   private String[] P001Y2_A3359AlbRDisCli ;
   private int[] P001Y2_A252CliCod ;
   private String[] P001Y2_A396EmprCod ;
   private short[] P001Y2_A1211TipEntCod ;
   private boolean[] P001Y2_n1211TipEntCod ;
   private String[] P001Y2_A55AlbRReo ;
   private byte[] P001Y2_A47AlbREst ;
   private short[] P001Y2_A6263AlbRTartC ;
   private boolean[] P001Y2_n6263AlbRTartC ;
   private String[] P001Y2_A279CliNom ;
   private int[] P001Y2_A54AlbRPieUti ;
   private int[] P001Y2_A52AlbRPieEnt ;
   private String[] P001Y3_A396EmprCod ;
   private int[] P001Y3_A44AlbRecCod ;
   private java.math.BigDecimal[] P001Y3_A183BarMetLan ;
   private java.math.BigDecimal[] P001Y3_A170BarKilLan ;
   private int[] P001Y3_A1271BarPieLzd ;
   private String[] P001Y3_A200BarPieCod ;
   private int[] P001Y3_A129BarCod ;
   private byte[] P001Y3_A132BarCodReo ;
   private String[] P001Y3_A130BarCodPar ;
   private GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle> Gxm2rootcol ;
   private app.SdtSDTInformeAlmacenTejidoCrudo_Detalle Gxm1sdtinformealmacentejidocrudo_detalle ;
   private app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea Gxm3sdtinformealmacentejidocrudo_detalle_lineas ;
}

final  class dpinformealmacentejidocrudo_detalle__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P001Y2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV21AlbREntfrom ,
                                          String AV20AlbREntto ,
                                          String A46AlbREnt ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date AV7AlbRFen ,
                                          java.util.Date AV8AlbRFen_to ,
                                          String A45AlbRef ,
                                          String AV6AlbRef_to ,
                                          short A6263AlbRTartC ,
                                          short AV9AlbRTartC ,
                                          short AV10AlbRTartC_to ,
                                          byte A47AlbREst ,
                                          byte AV17Albrestfrom ,
                                          byte AV16Albrestto ,
                                          String A55AlbRReo ,
                                          String AV18Tipo ,
                                          short A1211TipEntCod ,
                                          short AV19TipEntCod ,
                                          String AV15Emprcod ,
                                          int AV11CliCod ,
                                          String AV5AlbRef ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          int AV12CliCod_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[15];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT T1.TrnCod, T1.ProceCod, T1.AlbRef, T1.AlbRefDsc, T1.AlbRecCod, T1.AlbRFen, T1.AlbREnt, T1.AlbREnt2, T1.AlbRUni, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRLoc," ;
      scmdbuf += " T1.AlbRLote, T4.ProceNom, T3.TrnNom, T1.AlbRDisCli, T1.CliCod, T1.EmprCod, T1.TipEntCod, T1.AlbRReo, T1.AlbREst, T1.AlbRTartC, T2.CliNom, T1.AlbRPieUti, T1.AlbRPieEnt" ;
      scmdbuf += " FROM (((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod >= ? and T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRTartC >= ?)");
      addWhere(sWhereString, "(T1.AlbRTartC <= ?)");
      addWhere(sWhereString, "(T1.AlbREst >= ?)");
      addWhere(sWhereString, "(T1.AlbREst <= ?)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      if ( ! (GXutil.strcmp("", AV21AlbREntfrom)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt >= ?)");
      }
      else
      {
         GXv_int3[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV20AlbREntto)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt <= ?)");
      }
      else
      {
         GXv_int3[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
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
                  return conditional_P001Y2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001Y3", "SELECT EmprCod, AlbRecCod, BarMetLan, BarKilLan, BarPieLzd, BarPieCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(3, 16);
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[13])[0] = rslt.getString(12, 10);
               ((String[]) buf[14])[0] = rslt.getString(13, 20);
               ((String[]) buf[15])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 20);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 3);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(20, 2);
               ((byte[]) buf[25])[0] = rslt.getByte(21);
               ((short[]) buf[26])[0] = rslt.getShort(22);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(23, 30);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
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
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

