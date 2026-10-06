package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apfocus02 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apfocus02 pgm = new apfocus02 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apfocus02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apfocus02.class ), "" );
   }

   public apfocus02( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apfocus02.this.AV10EmprCod = GXv_char1[0] ;
      apfocus02.this.AV11EmprNom = GXv_char2[0] ;
      apfocus02.this.AV8UsurCod = GXv_char3[0] ;
      GXt_char4 = AV31Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "FOCUS", ""), GXv_char3) ;
      apfocus02.this.GXt_char4 = GXv_char3[0] ;
      AV31Carpeta = GXt_char4 ;
      AV52Hhmmss = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV33NomInf = httpContext.getMessage( "BUFFERS_PT_", "") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV52Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 4)), (short)(4), "0") + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV52Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV52Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + "_" ;
      AV33NomInf += GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV52Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV52Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV52Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") ;
      AV41NomInf2 = httpContext.getMessage( "BUFFERS_PT_DETAIL_", "") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV52Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 4)), (short)(4), "0") + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV52Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV52Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + "_" ;
      AV41NomInf2 += GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV52Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV52Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV52Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") ;
      AV34File = ((GXutil.strcmp(AV31Carpeta, "")==0) ? httpContext.getMessage( "C:\\Informes_acatex\\Informes", "")+"\\"+GXutil.trim( AV33NomInf)+httpContext.getMessage( ".csv", "") : GXutil.trim( AV31Carpeta)+"\\"+GXutil.trim( AV33NomInf)+httpContext.getMessage( ".csv", "")) ;
      AV40File2 = ((GXutil.strcmp(AV31Carpeta, "")==0) ? httpContext.getMessage( "C:\\Informes_acatex\\Informes", "")+"\\"+GXutil.trim( AV41NomInf2)+httpContext.getMessage( ".csv", "") : GXutil.trim( AV31Carpeta)+"\\"+GXutil.trim( AV41NomInf2)+httpContext.getMessage( ".csv", "")) ;
      GXt_int5 = AV36hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV34File, GXv_int6) ;
      apfocus02.this.GXt_int5 = GXv_int6[0] ;
      AV36hnd = GXt_int5 ;
      GXt_int5 = AV38Hnd2 ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV40File2, GXv_int6) ;
      apfocus02.this.GXt_int5 = GXv_int6[0] ;
      AV38Hnd2 = GXt_int5 ;
      AV17Control = httpContext.getMessage( "Articulo_Color", "") + ";" + httpContext.getMessage( "Descrip_color", "") + ";" + httpContext.getMessage( "Bodega de Almace", "") + ";" + httpContext.getMessage( "Familia", "") + ";" + httpContext.getMessage( "Ubicac_Origen", "") + ";" + httpContext.getMessage( "Reposic_minima", "") + ";" + httpContext.getMessage( "MTS/MTO", "") + ";" + httpContext.getMessage( "U_empaque", "") + ";" + httpContext.getMessage( "Tiempo Reabs", "") + ";" + httpContext.getMessage( "Stock minimo(kg)", "") + ";" + httpContext.getMessage( "Stock en sitio", "") + ";" + httpContext.getMessage( "Coste_kg", "") + ";" + httpContext.getMessage( "Precio_kg", "") + ";" + httpContext.getMessage( "Kg producido", "") + ";" + httpContext.getMessage( "Kg Asignados a Tinte", "") + ";" + httpContext.getMessage( "Kg en transito", "") + ";" + httpContext.getMessage( "Kg en produccion", "") + ";" + httpContext.getMessage( "Kg en compras", "") + ";" ;
      AV17Control += httpContext.getMessage( "Fecha actualizacion", "") + ";" + httpContext.getMessage( "Hora actualizacion", "") ;
      GXt_int7 = AV37Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV36hnd, AV17Control, GXv_int8) ;
      apfocus02.this.GXt_int7 = GXv_int8[0] ;
      AV37Stat = GXt_int7 ;
      AV85Control2 = httpContext.getMessage( "Hdr", "") + ";" + httpContext.getMessage( "Fecha Hdr", "") + ";" + httpContext.getMessage( "Articulo", "") + ";" + httpContext.getMessage( "Color", "") + ";" + httpContext.getMessage( "MTO/MTS", "") + ";" + httpContext.getMessage( "#Orden", "") + ";" + httpContext.getMessage( "Fase Anterior", "") + ";" + httpContext.getMessage( "Estado", "") + ";" + httpContext.getMessage( "Kilos Producidos", "") + ";" + httpContext.getMessage( "Kilos en Produccion", "") + ";" + httpContext.getMessage( "N Remito", "") + ";" + httpContext.getMessage( "Kilos remisionados", "") + ";" + httpContext.getMessage( "Kilos en Sitio", "") + ";" + httpContext.getMessage( "Suspendida", "") + ";" ;
      AV85Control2 += httpContext.getMessage( "Fecha Lectura BARFAS/ALBBAR", "") + ";" + httpContext.getMessage( "Fecha-Hora actualizacion", "") ;
      GXt_int7 = AV39Stat2 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV38Hnd2, AV85Control2, GXv_int8) ;
      apfocus02.this.GXt_int7 = GXv_int8[0] ;
      AV39Stat2 = GXt_int7 ;
      AV55FecAct = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Actualizo Array Hdrs-Remisiones Pdtes Envio FOCUS", "") ;
      System.out.println( AV17Control );
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV12Tab_hdrs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV76Tab_artcod[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV77Tab_color[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV72Tab_kgssitio[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV74Tab_kgsprd[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV75Tab_kgsenprd[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV73Tab_mtsvalor[GX_I-1] = (byte)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV13i = 1 ;
      /* Using cursor P057W3 */
      pr_default.execute(0, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P057W3_A396EmprCod[0] ;
         A130BarCodPar = P057W3_A130BarCodPar[0] ;
         A132BarCodReo = P057W3_A132BarCodReo[0] ;
         A129BarCod = P057W3_A129BarCod[0] ;
         A213BarSit = P057W3_A213BarSit[0] ;
         A11852Nxt_ArtCl2 = P057W3_A11852Nxt_ArtCl2[0] ;
         A5058BarEnvLaw = P057W3_A5058BarEnvLaw[0] ;
         A252CliCod = P057W3_A252CliCod[0] ;
         n252CliCod = P057W3_n252CliCod[0] ;
         A212BarSer = P057W3_A212BarSer[0] ;
         A135BarColNom = P057W3_A135BarColNom[0] ;
         A136BarColNum = P057W3_A136BarColNum[0] ;
         A218BarTipCol = P057W3_A218BarTipCol[0] ;
         A166BarKgm = P057W3_A166BarKgm[0] ;
         n166BarKgm = P057W3_n166BarKgm[0] ;
         A166BarKgm = P057W3_A166BarKgm[0] ;
         n166BarKgm = P057W3_n166BarKgm[0] ;
         if ( ( GXutil.strcmp(A5058BarEnvLaw, httpContext.getMessage( "S", "")) != 0 ) || ( ( GXutil.strcmp(A5058BarEnvLaw, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A11852Nxt_ArtCl2, localUtil.ttoc( AV55FecAct, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) != 0 ) && ! (GXutil.strcmp("", A11852Nxt_ArtCl2)==0) ) )
         {
            AV14Barcod = A129BarCod ;
            AV15Barcodreo = A132BarCodReo ;
            AV16barcodpar = A130BarCodPar ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int9[0] = A252CliCod ;
            GXv_char2[0] = A212BarSer ;
            GXv_char1[0] = A135BarColNom ;
            GXv_int10[0] = A136BarColNum ;
            GXv_int8[0] = A218BarTipCol ;
            GXv_int11[0] = AV66Formt ;
            new app.pmtsvalor(remoteHandle, context).execute( GXv_char3, GXv_int9, GXv_char2, GXv_char1, GXv_int10, GXv_int8, GXv_int11) ;
            apfocus02.this.A396EmprCod = GXv_char3[0] ;
            apfocus02.this.A252CliCod = GXv_int9[0] ;
            apfocus02.this.A212BarSer = GXv_char2[0] ;
            apfocus02.this.A135BarColNom = GXv_char1[0] ;
            apfocus02.this.A136BarColNum = GXv_int10[0] ;
            apfocus02.this.A218BarTipCol = GXv_int8[0] ;
            apfocus02.this.AV66Formt = GXv_int11[0] ;
            if ( AV66Formt == 0 )
            {
               /* Execute user subroutine: 'ALBBAR' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV60Albbar == 0 )
               {
                  if ( AV13i > 200000 )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 200000 Hdrs ¡¡¡", ""));
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV22BarOrdlin = (short)(0) ;
                  AV21Procod = "" ;
                  AV61Kgssitio = DecimalUtil.doubleToDec(0) ;
                  AV25Kgsprd = DecimalUtil.doubleToDec(0) ;
                  AV26Kgsenprd = DecimalUtil.doubleToDec(0) ;
                  AV94productoterminado = (byte)(0) ;
                  /* Using cursor P057W4 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A457FasCod = P057W4_A457FasCod[0] ;
                     A194BarOrdLin = P057W4_A194BarOrdLin[0] ;
                     A758ProCod = P057W4_A758ProCod[0] ;
                     AV22BarOrdlin = A194BarOrdLin ;
                     AV21Procod = A758ProCod ;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
                  if ( AV22BarOrdlin > 0 )
                  {
                     /* Using cursor P057W5 */
                     pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV22BarOrdlin)});
                     while ( (pr_default.getStatus(2) != 101) )
                     {
                        A194BarOrdLin = P057W5_A194BarOrdLin[0] ;
                        A153BarFasEst = P057W5_A153BarFasEst[0] ;
                        A152BarFasCon = P057W5_A152BarFasCon[0] ;
                        A758ProCod = P057W5_A758ProCod[0] ;
                        if ( ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 ) && ( A153BarFasEst < 2 ) )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                        if ( ( A153BarFasEst > 0 ) && ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 ) )
                        {
                           AV22BarOrdlin = A194BarOrdLin ;
                           AV21Procod = A758ProCod ;
                           AV61Kgssitio = A166BarKgm ;
                           AV94productoterminado = (byte)(1) ;
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                        pr_default.readNext(2);
                     }
                     pr_default.close(2);
                  }
                  AV63Stp_Est = (byte)(0) ;
                  /* Using cursor P057W6 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV14Barcod), Byte.valueOf(AV15Barcodreo), AV16barcodpar});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A10746Stp_hdr = P057W6_A10746Stp_hdr[0] ;
                     A10747Stp_r = P057W6_A10747Stp_r[0] ;
                     A10748Stp_p = P057W6_A10748Stp_p[0] ;
                     A10755Stp_Est = P057W6_A10755Stp_Est[0] ;
                     A10750Stp_Lin = P057W6_A10750Stp_Lin[0] ;
                     AV63Stp_Est = A10755Stp_Est ;
                     pr_default.readNext(3);
                  }
                  pr_default.close(3);
                  AV61Kgssitio = ((AV63Stp_Est==1) ? DecimalUtil.doubleToDec(0) : AV61Kgssitio) ;
                  AV94productoterminado = (byte)(((AV94productoterminado==1)&&(AV61Kgssitio.doubleValue()==0) ? 0 : AV94productoterminado)) ;
                  if ( AV94productoterminado == 0 )
                  {
                     /* Execute user subroutine: 'KILOSPROD' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(0);
                        pr_default.close(0);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     if ( AV23Barfasest == 2 )
                     {
                        AV25Kgsprd = A166BarKgm ;
                     }
                     else
                     {
                        AV26Kgsenprd = A166BarKgm ;
                     }
                  }
                  GXv_char3[0] = A396EmprCod ;
                  GXv_int10[0] = A252CliCod ;
                  GXv_char2[0] = A212BarSer ;
                  GXv_char1[0] = A135BarColNom ;
                  GXv_int9[0] = A136BarColNum ;
                  GXv_int11[0] = A218BarTipCol ;
                  GXv_int8[0] = AV66Formt ;
                  new app.pmtsvalor(remoteHandle, context).execute( GXv_char3, GXv_int10, GXv_char2, GXv_char1, GXv_int9, GXv_int11, GXv_int8) ;
                  apfocus02.this.A396EmprCod = GXv_char3[0] ;
                  apfocus02.this.A252CliCod = GXv_int10[0] ;
                  apfocus02.this.A212BarSer = GXv_char2[0] ;
                  apfocus02.this.A135BarColNom = GXv_char1[0] ;
                  apfocus02.this.A136BarColNum = GXv_int9[0] ;
                  apfocus02.this.A218BarTipCol = GXv_int11[0] ;
                  apfocus02.this.AV66Formt = GXv_int8[0] ;
                  AV12Tab_hdrs[AV13i-1] = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                  AV76Tab_artcod[AV13i-1] = A212BarSer ;
                  AV77Tab_color[AV13i-1] = A135BarColNom ;
                  AV72Tab_kgssitio[AV13i-1] = AV61Kgssitio ;
                  AV74Tab_kgsprd[AV13i-1] = AV25Kgsprd ;
                  AV75Tab_kgsenprd[AV13i-1] = AV26Kgsenprd ;
                  AV73Tab_mtsvalor[AV13i-1] = AV66Formt ;
                  AV13i = (int)(AV13i+1) ;
                  AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Procesando HDR ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Registro ", "") + GXutil.str( AV13i, 6, 0) + " " + GXutil.str( AV61Kgssitio, 10, 2) + " " + GXutil.str( AV25Kgsprd, 9, 2) + " " + GXutil.str( AV26Kgsenprd, 9, 2) ;
                  System.out.println( AV17Control );
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV13i = (int)(AV13i-1) ;
      AV48Nrgtos1 = AV13i ;
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Registros Procesados Hdrs ", "") + GXutil.str( AV48Nrgtos1, 6, 0) ;
      System.out.println( AV17Control );
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV46Tab_hdrsd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV78Tab_artcodd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV79Tab_colord[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV80Tab_kgssitiod[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV81Tab_kgsprdd[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV82Tab_kgsenprdd[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV83Tab_kgsdp[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV84Tab_mtsvalord[GX_I-1] = (byte)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV13i = 1 ;
      /* Using cursor P057W7 */
      pr_default.execute(4, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P057W7_A396EmprCod[0] ;
         A30AlbProCod = P057W7_A30AlbProCod[0] ;
         A34AlbProfch = P057W7_A34AlbProfch[0] ;
         if ( ( ( GXutil.ddiff( GXutil.today( ) , A34AlbProfch ) ) <= 2 ) )
         {
            /* Using cursor P057W8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A7993AlbMqTj = P057W8_A7993AlbMqTj[0] ;
               A1459BarAlbFor = P057W8_A1459BarAlbFor[0] ;
               n1459BarAlbFor = P057W8_n1459BarAlbFor[0] ;
               A252CliCod = P057W8_A252CliCod[0] ;
               n252CliCod = P057W8_n252CliCod[0] ;
               A212BarSer = P057W8_A212BarSer[0] ;
               A135BarColNom = P057W8_A135BarColNom[0] ;
               A136BarColNum = P057W8_A136BarColNum[0] ;
               A218BarTipCol = P057W8_A218BarTipCol[0] ;
               A1261BarAlbKgmE = P057W8_A1261BarAlbKgmE[0] ;
               A130BarCodPar = P057W8_A130BarCodPar[0] ;
               A132BarCodReo = P057W8_A132BarCodReo[0] ;
               A129BarCod = P057W8_A129BarCod[0] ;
               A252CliCod = P057W8_A252CliCod[0] ;
               n252CliCod = P057W8_n252CliCod[0] ;
               A212BarSer = P057W8_A212BarSer[0] ;
               A135BarColNom = P057W8_A135BarColNom[0] ;
               A136BarColNum = P057W8_A136BarColNum[0] ;
               A218BarTipCol = P057W8_A218BarTipCol[0] ;
               if ( ( GXutil.strcmp(A1459BarAlbFor, httpContext.getMessage( "S", "")) != 0 ) || ( ( GXutil.strcmp(A1459BarAlbFor, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A7993AlbMqTj, localUtil.ttoc( AV55FecAct, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) != 0 ) && ! (GXutil.strcmp("", A7993AlbMqTj)==0) ) )
               {
                  GXv_char3[0] = A396EmprCod ;
                  GXv_int10[0] = A252CliCod ;
                  GXv_char2[0] = A212BarSer ;
                  GXv_char1[0] = A135BarColNom ;
                  GXv_int9[0] = A136BarColNum ;
                  GXv_int11[0] = A218BarTipCol ;
                  GXv_int8[0] = AV66Formt ;
                  new app.pmtsvalor(remoteHandle, context).execute( GXv_char3, GXv_int10, GXv_char2, GXv_char1, GXv_int9, GXv_int11, GXv_int8) ;
                  apfocus02.this.A396EmprCod = GXv_char3[0] ;
                  apfocus02.this.A252CliCod = GXv_int10[0] ;
                  apfocus02.this.A212BarSer = GXv_char2[0] ;
                  apfocus02.this.A135BarColNom = GXv_char1[0] ;
                  apfocus02.this.A136BarColNum = GXv_int9[0] ;
                  apfocus02.this.A218BarTipCol = GXv_int11[0] ;
                  apfocus02.this.AV66Formt = GXv_int8[0] ;
                  if ( AV66Formt == 0 )
                  {
                     AV24KgsDp = A1261BarAlbKgmE ;
                     if ( AV13i > 200000 )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 200000 Hdrs ¡¡¡", ""));
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                     AV46Tab_hdrsd[AV13i-1] = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.str( A30AlbProCod, 10, 0) ;
                     AV78Tab_artcodd[AV13i-1] = A212BarSer ;
                     AV79Tab_colord[AV13i-1] = A135BarColNom ;
                     AV80Tab_kgssitiod[AV13i-1] = DecimalUtil.doubleToDec(0) ;
                     AV81Tab_kgsprdd[AV13i-1] = DecimalUtil.doubleToDec(0) ;
                     AV82Tab_kgsenprdd[AV13i-1] = DecimalUtil.doubleToDec(0) ;
                     AV83Tab_kgsdp[AV13i-1] = AV24KgsDp ;
                     AV84Tab_mtsvalord[AV13i-1] = AV66Formt ;
                     AV13i = (int)(AV13i+1) ;
                     AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Procesando Remito-HDR ", "") + GXutil.str( A30AlbProCod, 10, 0) + " " + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Registro ", "") + GXutil.str( AV13i, 6, 0) ;
                     System.out.println( AV17Control );
                  }
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV13i = (int)(AV13i-1) ;
      AV49Nrgtos2 = AV13i ;
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Registros Procesados Remitos-Hdrs ", "") + GXutil.str( AV49Nrgtos2, 6, 0) ;
      System.out.println( AV17Control );
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Lectura ARRAY de HDRs, actualizo ARRAY de Referencia_color", "") + GXutil.str( AV48Nrgtos1, 6, 0) ;
      System.out.println( AV17Control );
      AV13i = 1 ;
      AV19j = 1 ;
      AV20z = 1 ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV18RefColor[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV35Tab_kdp[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV30Tab_kep[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV29Tab_kp[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV62Tab_ks[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV68Tab_mt[GX_I-1] = (byte)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      while ( AV13i <= 200000 )
      {
         if ( GXutil.strcmp(AV12Tab_hdrs[AV13i-1], "") == 0 )
         {
            if (true) break;
         }
         AV24KgsDp = DecimalUtil.doubleToDec(0) ;
         AV47albprocod = 0 ;
         AV14Barcod = (int)(GXutil.lval( GXutil.substring( AV12Tab_hdrs[AV13i-1], 1, 8))) ;
         AV15Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV12Tab_hdrs[AV13i-1], 9, 1))) ;
         AV16barcodpar = (GXutil.substring( AV12Tab_hdrs[AV13i-1], 10, 1)) ;
         AV61Kgssitio = AV72Tab_kgssitio[AV13i-1] ;
         AV25Kgsprd = AV74Tab_kgsprd[AV13i-1] ;
         AV26Kgsenprd = AV75Tab_kgsenprd[AV13i-1] ;
         AV66Formt = AV73Tab_mtsvalor[AV13i-1] ;
         AV27ArtColor = AV76Tab_artcod[AV13i-1] + "_" + AV77Tab_color[AV13i-1] ;
         /* Execute user subroutine: 'REFCOLOR' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV13i = (int)(AV13i+1) ;
      }
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Lectura ARRAY de Remitos-HDRs, actualizo ARRAY de Referencia_color", "") + GXutil.str( AV49Nrgtos2, 6, 0) ;
      System.out.println( AV17Control );
      AV13i = 1 ;
      AV19j = 1 ;
      while ( AV13i <= 200000 )
      {
         if ( GXutil.strcmp(AV46Tab_hdrsd[AV13i-1], "") == 0 )
         {
            if (true) break;
         }
         AV14Barcod = (int)(GXutil.lval( GXutil.substring( AV46Tab_hdrsd[AV13i-1], 1, 8))) ;
         AV15Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV46Tab_hdrsd[AV13i-1], 9, 1))) ;
         AV16barcodpar = (GXutil.substring( AV46Tab_hdrsd[AV13i-1], 10, 1)) ;
         AV47albprocod = GXutil.lval( GXutil.substring( AV46Tab_hdrsd[AV13i-1], 11, 10)) ;
         AV61Kgssitio = AV80Tab_kgssitiod[AV13i-1] ;
         AV25Kgsprd = AV81Tab_kgsprdd[AV13i-1] ;
         AV26Kgsenprd = AV82Tab_kgsenprdd[AV13i-1] ;
         AV24KgsDp = AV83Tab_kgsdp[AV13i-1] ;
         AV66Formt = AV84Tab_mtsvalord[AV13i-1] ;
         AV42fascod = "" ;
         AV43FasDsc = "" ;
         AV23Barfasest = (byte)(0) ;
         AV45FecControl = GXutil.resetTime( GXutil.nullDate() );
         AV27ArtColor = AV78Tab_artcodd[AV13i-1] + "_" + AV79Tab_colord[AV13i-1] ;
         /* Execute user subroutine: 'REFCOLOR' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV13i = (int)(AV13i+1) ;
      }
      AV44Nrgtos = (int)(AV20z-1) ;
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Inciamos actualizacion ", "") + GXutil.trim( AV34File) ;
      System.out.println( AV17Control );
      AV13i = 1 ;
      while ( AV13i <= 200000 )
      {
         if ( GXutil.strcmp(AV18RefColor[AV13i-1], "") == 0 )
         {
            if (true) break;
         }
         AV27ArtColor = AV18RefColor[AV13i-1] ;
         AV25Kgsprd = AV29Tab_kp[AV13i-1] ;
         AV26Kgsenprd = AV30Tab_kep[AV13i-1] ;
         AV24KgsDp = AV35Tab_kdp[AV13i-1] ;
         AV61Kgssitio = AV62Tab_ks[AV13i-1] ;
         AV56Artcod = GXutil.substring( AV18RefColor[AV13i-1], 1, 16) ;
         AV64ForNomCli = GXutil.substring( AV18RefColor[AV13i-1], 18, 13) ;
         AV70ReferenciaColor = GXutil.trim( AV56Artcod) + "_" + GXutil.trim( AV64ForNomCli) ;
         AV57ArtMt = (byte)(0) ;
         AV58ArtTRabs = (byte)(0) ;
         AV59ArtKgMn = DecimalUtil.doubleToDec(0) ;
         AV65Cformu = (byte)(0) ;
         AV71ColorNomcli = httpContext.getMessage( "NO EXISTE COLOR", "") ;
         /* Using cursor P057W9 */
         pr_default.execute(6, new Object[] {AV10EmprCod, AV56Artcod, AV64ForNomCli});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A396EmprCod = P057W9_A396EmprCod[0] ;
            A494ForSer = P057W9_A494ForSer[0] ;
            A482ForColNom = P057W9_A482ForColNom[0] ;
            A1191ForNomCli = P057W9_A1191ForNomCli[0] ;
            n1191ForNomCli = P057W9_n1191ForNomCli[0] ;
            A12399ForMT = P057W9_A12399ForMT[0] ;
            n12399ForMT = P057W9_n12399ForMT[0] ;
            A12400ForTRabs = P057W9_A12400ForTRabs[0] ;
            n12400ForTRabs = P057W9_n12400ForTRabs[0] ;
            A12401ForKgMn = P057W9_A12401ForKgMn[0] ;
            n12401ForKgMn = P057W9_n12401ForKgMn[0] ;
            A252CliCod = P057W9_A252CliCod[0] ;
            n252CliCod = P057W9_n252CliCod[0] ;
            A483ForColNum = P057W9_A483ForColNum[0] ;
            A831TipColCod = P057W9_A831TipColCod[0] ;
            AV71ColorNomcli = A1191ForNomCli ;
            AV57ArtMt = A12399ForMT ;
            AV58ArtTRabs = A12400ForTRabs ;
            AV59ArtKgMn = A12401ForKgMn ;
            AV65Cformu = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         if ( AV65Cformu == 0 )
         {
            /* Using cursor P057W10 */
            pr_default.execute(7, new Object[] {AV10EmprCod, AV56Artcod});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A396EmprCod = P057W10_A396EmprCod[0] ;
               A65ArtCod = P057W10_A65ArtCod[0] ;
               A12364ArtMT = P057W10_A12364ArtMT[0] ;
               n12364ArtMT = P057W10_n12364ArtMT[0] ;
               A12365ArtTRabs = P057W10_A12365ArtTRabs[0] ;
               n12365ArtTRabs = P057W10_n12365ArtTRabs[0] ;
               A12366ArtKgMn = P057W10_A12366ArtKgMn[0] ;
               n12366ArtKgMn = P057W10_n12366ArtKgMn[0] ;
               A252CliCod = P057W10_A252CliCod[0] ;
               n252CliCod = P057W10_n252CliCod[0] ;
               AV57ArtMt = A12364ArtMT ;
               AV58ArtTRabs = A12365ArtTRabs ;
               AV59ArtKgMn = A12366ArtKgMn ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(7);
            }
            pr_default.close(7);
         }
         if ( ( GXutil.strcmp(AV71ColorNomcli, httpContext.getMessage( "NO EXISTE COLOR", "")) == 0 ) || ( AV57ArtMt == 1 ) )
         {
         }
         else
         {
            AV87FecAlfa = localUtil.ttoc( AV55FecAct, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV88Anyo = (short)(GXutil.lval( GXutil.substring( AV87FecAlfa, 7, 4))) ;
            AV90mes = (byte)(GXutil.lval( GXutil.substring( AV87FecAlfa, 4, 2))) ;
            AV91mesalfa = GXutil.padl( GXutil.trim( GXutil.str( AV90mes, 2, 0)), (short)(2), "0") ;
            AV89dia = (byte)(GXutil.lval( GXutil.substring( AV87FecAlfa, 1, 2))) ;
            AV92diaalfa = GXutil.padl( GXutil.trim( GXutil.str( AV89dia, 2, 0)), (short)(2), "0") ;
            AV87FecAlfa = AV92diaalfa + "/" + AV91mesalfa + "/" + GXutil.str( AV88Anyo, 4, 0) ;
            AV86Fec1 = localUtil.ctod( AV87FecAlfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV17Control = AV70ReferenciaColor + ";" + AV71ColorNomcli + ";" + httpContext.getMessage( "PT", "") + ";" + httpContext.getMessage( "ESTANDAR", "") + ";" + httpContext.getMessage( "CRUDO", "") + ";" + "1" + ";" + GXutil.str( AV57ArtMt, 1, 0) + ";" + "0" + ";" + GXutil.str( AV58ArtTRabs, 2, 0) + ";" + GXutil.str( AV59ArtKgMn, 9, 2) + ";" + GXutil.str( AV61Kgssitio, 10, 2) + ";" + "0" + ";" + "1" + ";" + GXutil.str( AV25Kgsprd, 9, 2) + ";" ;
            AV17Control += GXutil.str( AV24KgsDp, 9, 2) + ";" + "0" + ";" + GXutil.str( AV26Kgsenprd, 9, 2) + ";" + "0" + ";" ;
            AV17Control += AV87FecAlfa + ";" + localUtil.ttoc( AV55FecAct, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            GXt_int7 = AV37Stat ;
            GXv_int11[0] = GXt_int7 ;
            new app.core.fputs(remoteHandle, context).execute( AV36hnd, AV17Control, GXv_int11) ;
            apfocus02.this.GXt_int7 = GXv_int11[0] ;
            AV37Stat = GXt_int7 ;
            AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + GXutil.trim( AV33NomInf) + httpContext.getMessage( " Registro Procesado ", "") + GXutil.trim( GXutil.str( AV13i, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV44Nrgtos, 6, 0)) ;
            System.out.println( AV17Control );
         }
         AV13i = (int)(AV13i+1) ;
      }
      AV69Dif = (int)(GXutil.dtdiff( GXutil.serverNow( context, remoteHandle, pr_default), AV55FecAct)) ;
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " FIN Actualizacion fichero", "") + GXutil.trim( AV34File) ;
      System.out.println( AV17Control );
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Tiempo empleado (segundos)", "") + GXutil.str( AV69Dif, 6, 0) ;
      System.out.println( AV17Control );
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Actualizamos TABLA BARCAD segun ARRAY, Registros a procesar ", "") + GXutil.trim( GXutil.str( AV48Nrgtos1, 6, 0)) ;
      System.out.println( AV17Control );
      AV55FecAct = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV13i = 1 ;
      AV19j = 1 ;
      AV20z = 1 ;
      while ( AV13i <= 200000 )
      {
         if ( GXutil.strcmp(AV12Tab_hdrs[AV13i-1], "") == 0 )
         {
            if (true) break;
         }
         AV24KgsDp = DecimalUtil.doubleToDec(0) ;
         AV47albprocod = 0 ;
         AV14Barcod = (int)(GXutil.lval( GXutil.substring( AV12Tab_hdrs[AV13i-1], 1, 8))) ;
         AV15Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV12Tab_hdrs[AV13i-1], 9, 1))) ;
         AV16barcodpar = (GXutil.substring( AV12Tab_hdrs[AV13i-1], 10, 1)) ;
         /* Using cursor P057W14 */
         pr_default.execute(8, new Object[] {AV10EmprCod, Integer.valueOf(AV14Barcod), Byte.valueOf(AV15Barcodreo), AV16barcodpar});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A130BarCodPar = P057W14_A130BarCodPar[0] ;
            A132BarCodReo = P057W14_A132BarCodReo[0] ;
            A129BarCod = P057W14_A129BarCod[0] ;
            A396EmprCod = P057W14_A396EmprCod[0] ;
            A5058BarEnvLaw = P057W14_A5058BarEnvLaw[0] ;
            A11852Nxt_ArtCl2 = P057W14_A11852Nxt_ArtCl2[0] ;
            A1234BarNomCli = P057W14_A1234BarNomCli[0] ;
            A135BarColNom = P057W14_A135BarColNom[0] ;
            A212BarSer = P057W14_A212BarSer[0] ;
            A159BarFecGen = P057W14_A159BarFecGen[0] ;
            A151BarFasCod = P057W14_A151BarFasCod[0] ;
            n151BarFasCod = P057W14_n151BarFasCod[0] ;
            A154BarFasLin = P057W14_A154BarFasLin[0] ;
            n154BarFasLin = P057W14_n154BarFasLin[0] ;
            A151BarFasCod = P057W14_A151BarFasCod[0] ;
            n151BarFasCod = P057W14_n151BarFasCod[0] ;
            A154BarFasLin = P057W14_A154BarFasLin[0] ;
            n154BarFasLin = P057W14_n154BarFasLin[0] ;
            A5058BarEnvLaw = httpContext.getMessage( "S", "") ;
            A11852Nxt_ArtCl2 = localUtil.ttoc( AV55FecAct, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Tabla HDRS.Registro Procesado ", "") + GXutil.trim( GXutil.str( AV13i, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV48Nrgtos1, 6, 0)) ;
            System.out.println( AV17Control );
            AV67mtoMts = ((AV66Formt==0) ? httpContext.getMessage( "MTS", "") : httpContext.getMessage( "MTO", "")) ;
            GXt_char4 = AV43FasDsc ;
            GXv_char3[0] = GXt_char4 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A151BarFasCod, GXv_char3) ;
            apfocus02.this.GXt_char4 = GXv_char3[0] ;
            AV43FasDsc = GXt_char4 ;
            AV85Control2 = GXutil.str( AV14Barcod, 8, 0) + "-" + GXutil.str( AV15Barcodreo, 1, 0) + AV16barcodpar + ";" + localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + A212BarSer + ";" + A135BarColNom + "/" + A1234BarNomCli + ";" + AV67mtoMts + ";" + GXutil.str( A154BarFasLin, 4, 0) + ";" + A151BarFasCod + "-" + AV43FasDsc + ";" + GXutil.str( AV23Barfasest, 1, 0) + ";" + GXutil.str( AV25Kgsprd, 9, 2) + ";" + GXutil.str( AV26Kgsenprd, 9, 2) + ";" ;
            AV85Control2 += GXutil.str( AV47albprocod, 10, 0) + ";" + GXutil.str( AV24KgsDp, 9, 2) + ";" + GXutil.str( AV61Kgssitio, 10, 2) + ";" + GXutil.str( AV63Stp_Est, 1, 0) + ";" + localUtil.ttoc( AV45FecControl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + ";" + localUtil.ttoc( AV55FecAct, 10, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            GXt_int7 = AV39Stat2 ;
            GXv_int11[0] = GXt_int7 ;
            new app.core.fputs(remoteHandle, context).execute( AV38Hnd2, AV85Control2, GXv_int11) ;
            apfocus02.this.GXt_int7 = GXv_int11[0] ;
            AV39Stat2 = GXt_int7 ;
            /* Using cursor P057W15 */
            pr_default.execute(9, new Object[] {A5058BarEnvLaw, A11852Nxt_ArtCl2, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
         AV13i = (int)(AV13i+1) ;
      }
      new app.pcommit(remoteHandle, context).execute( ) ;
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " FIN Actualizacion fichero BARCAD, registros procesados", "") + GXutil.trim( GXutil.str( AV48Nrgtos1, 6, 0)) ;
      System.out.println( AV17Control );
      AV69Dif = (int)(GXutil.dtdiff( GXutil.serverNow( context, remoteHandle, pr_default), AV55FecAct)) ;
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Tiempo empleado (segundos)", "") + GXutil.str( AV69Dif, 6, 0) ;
      System.out.println( AV17Control );
      AV55FecAct = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Actualizamos TABLA ALBBAR segun ARRAY, Registros a procesar ", "") + GXutil.trim( GXutil.str( AV49Nrgtos2, 6, 0)) ;
      System.out.println( AV17Control );
      AV55FecAct = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV13i = 1 ;
      AV19j = 1 ;
      while ( AV13i <= 200000 )
      {
         if ( GXutil.strcmp(AV46Tab_hdrsd[AV13i-1], "") == 0 )
         {
            if (true) break;
         }
         AV14Barcod = (int)(GXutil.lval( GXutil.substring( AV46Tab_hdrsd[AV13i-1], 1, 8))) ;
         AV15Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV46Tab_hdrsd[AV13i-1], 9, 1))) ;
         AV16barcodpar = (GXutil.substring( AV46Tab_hdrsd[AV13i-1], 10, 1)) ;
         AV47albprocod = GXutil.lval( GXutil.substring( AV46Tab_hdrsd[AV13i-1], 11, 10)) ;
         /* Using cursor P057W16 */
         pr_default.execute(10, new Object[] {AV10EmprCod, Long.valueOf(AV47albprocod), Integer.valueOf(AV14Barcod), Byte.valueOf(AV15Barcodreo), AV16barcodpar});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A130BarCodPar = P057W16_A130BarCodPar[0] ;
            A132BarCodReo = P057W16_A132BarCodReo[0] ;
            A129BarCod = P057W16_A129BarCod[0] ;
            A30AlbProCod = P057W16_A30AlbProCod[0] ;
            A396EmprCod = P057W16_A396EmprCod[0] ;
            A1459BarAlbFor = P057W16_A1459BarAlbFor[0] ;
            n1459BarAlbFor = P057W16_n1459BarAlbFor[0] ;
            A7993AlbMqTj = P057W16_A7993AlbMqTj[0] ;
            A1234BarNomCli = P057W16_A1234BarNomCli[0] ;
            A135BarColNom = P057W16_A135BarColNom[0] ;
            A212BarSer = P057W16_A212BarSer[0] ;
            A159BarFecGen = P057W16_A159BarFecGen[0] ;
            A1234BarNomCli = P057W16_A1234BarNomCli[0] ;
            A135BarColNom = P057W16_A135BarColNom[0] ;
            A212BarSer = P057W16_A212BarSer[0] ;
            A159BarFecGen = P057W16_A159BarFecGen[0] ;
            A1459BarAlbFor = httpContext.getMessage( "S", "") ;
            n1459BarAlbFor = false ;
            A7993AlbMqTj = localUtil.ttoc( AV55FecAct, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV45FecControl = GXutil.serverNow( context, remoteHandle, pr_default) ;
            AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Tabla REMISIONES.Registro Procesado ", "") + GXutil.trim( GXutil.str( AV13i, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV49Nrgtos2, 6, 0)) ;
            System.out.println( AV17Control );
            AV67mtoMts = ((AV66Formt==0) ? httpContext.getMessage( "MTS", "") : httpContext.getMessage( "MTO", "")) ;
            AV22BarOrdlin = (short)(0) ;
            AV42fascod = "" ;
            AV43FasDsc = "" ;
            AV85Control2 = GXutil.str( AV14Barcod, 8, 0) + "-" + GXutil.str( AV15Barcodreo, 1, 0) + AV16barcodpar + ";" + GXutil.trim( localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + A212BarSer + ";" + A135BarColNom + "/" + A1234BarNomCli + ";" + AV67mtoMts + ";" + GXutil.str( AV22BarOrdlin, 4, 0) + ";" + AV42fascod + "-" + AV43FasDsc + ";" + GXutil.str( AV23Barfasest, 1, 0) + ";" ;
            AV85Control2 += GXutil.str( AV25Kgsprd, 9, 2) + ";" + GXutil.str( AV26Kgsenprd, 9, 2) + ";" ;
            AV85Control2 += GXutil.str( AV47albprocod, 10, 0) + ";" + GXutil.str( AV24KgsDp, 9, 2) + ";" + GXutil.str( AV61Kgssitio, 10, 2) + ";" + GXutil.str( AV63Stp_Est, 1, 0) + ";" + GXutil.trim( localUtil.ttoc( AV45FecControl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) + ";" + GXutil.trim( localUtil.ttoc( AV55FecAct, 10, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
            GXt_int7 = AV39Stat2 ;
            GXv_int11[0] = GXt_int7 ;
            new app.core.fputs(remoteHandle, context).execute( AV38Hnd2, AV85Control2, GXv_int11) ;
            apfocus02.this.GXt_int7 = GXv_int11[0] ;
            AV39Stat2 = GXt_int7 ;
            /* Using cursor P057W17 */
            pr_default.execute(11, new Object[] {Boolean.valueOf(n1459BarAlbFor), A1459BarAlbFor, A7993AlbMqTj, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
         AV13i = (int)(AV13i+1) ;
      }
      new app.pcommit(remoteHandle, context).execute( ) ;
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " FIN Actualizacion fichero ALBBAR, registros procesados", "") + GXutil.trim( GXutil.str( AV49Nrgtos2, 6, 0)) ;
      System.out.println( AV17Control );
      AV69Dif = (int)(GXutil.dtdiff( GXutil.serverNow( context, remoteHandle, pr_default), AV55FecAct)) ;
      AV17Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Tiempo empleado (segundos)", "") + GXutil.str( AV69Dif, 6, 0) ;
      System.out.println( AV17Control );
      GXt_int7 = AV37Stat ;
      GXv_int11[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV36hnd, GXv_int11) ;
      apfocus02.this.GXt_int7 = GXv_int11[0] ;
      AV37Stat = GXt_int7 ;
      GXt_int7 = AV39Stat2 ;
      GXv_int11[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV38Hnd2, GXv_int11) ;
      apfocus02.this.GXt_int7 = GXv_int11[0] ;
      AV39Stat2 = GXt_int7 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'KILOSPROD' Routine */
      returnInSub = false ;
      AV23Barfasest = (byte)(0) ;
      AV42fascod = "" ;
      AV43FasDsc = "" ;
      AV45FecControl = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor P057W18 */
      pr_default.execute(12, new Object[] {AV10EmprCod, Integer.valueOf(AV14Barcod), Byte.valueOf(AV15Barcodreo), AV16barcodpar, AV21Procod, Short.valueOf(AV22BarOrdlin)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A396EmprCod = P057W18_A396EmprCod[0] ;
         A129BarCod = P057W18_A129BarCod[0] ;
         A132BarCodReo = P057W18_A132BarCodReo[0] ;
         A130BarCodPar = P057W18_A130BarCodPar[0] ;
         A758ProCod = P057W18_A758ProCod[0] ;
         A152BarFasCon = P057W18_A152BarFasCon[0] ;
         A194BarOrdLin = P057W18_A194BarOrdLin[0] ;
         A153BarFasEst = P057W18_A153BarFasEst[0] ;
         A457FasCod = P057W18_A457FasCod[0] ;
         A460FasDsc = P057W18_A460FasDsc[0] ;
         A460FasDsc = P057W18_A460FasDsc[0] ;
         if ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 )
         {
            AV23Barfasest = A153BarFasEst ;
            AV42fascod = A457FasCod ;
            AV43FasDsc = A460FasDsc ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S121( )
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV60Albbar = (byte)(0) ;
      AV93KgsExp = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P057W19 */
      pr_default.execute(13, new Object[] {AV10EmprCod, Integer.valueOf(AV14Barcod), Byte.valueOf(AV15Barcodreo), AV16barcodpar});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A130BarCodPar = P057W19_A130BarCodPar[0] ;
         A132BarCodReo = P057W19_A132BarCodReo[0] ;
         A129BarCod = P057W19_A129BarCod[0] ;
         A396EmprCod = P057W19_A396EmprCod[0] ;
         A1261BarAlbKgmE = P057W19_A1261BarAlbKgmE[0] ;
         A30AlbProCod = P057W19_A30AlbProCod[0] ;
         AV60Albbar = (byte)(1) ;
         AV93KgsExp = AV93KgsExp.add(A1261BarAlbKgmE) ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void S131( )
   {
      /* 'REFCOLOR' Routine */
      returnInSub = false ;
      AV19j = 1 ;
      AV28Alta = (byte)(0) ;
      while ( AV19j <= 200000 )
      {
         if ( GXutil.strcmp(AV18RefColor[AV19j-1], "") == 0 )
         {
            AV28Alta = (byte)(1) ;
            if (true) break;
         }
         if ( GXutil.strcmp(AV18RefColor[AV19j-1], AV27ArtColor) == 0 )
         {
            AV29Tab_kp[AV19j-1] = AV29Tab_kp[AV19j-1].add(AV25Kgsprd) ;
            AV30Tab_kep[AV19j-1] = AV30Tab_kep[AV19j-1].add(AV26Kgsenprd) ;
            AV35Tab_kdp[AV19j-1] = AV35Tab_kdp[AV19j-1].add(AV24KgsDp) ;
            AV62Tab_ks[AV19j-1] = AV62Tab_ks[AV19j-1].add(AV61Kgssitio) ;
            if (true) break;
         }
         AV19j = (int)(AV19j+1) ;
      }
      if ( AV28Alta == 1 )
      {
         AV18RefColor[AV20z-1] = AV27ArtColor ;
         AV29Tab_kp[AV20z-1] = AV25Kgsprd ;
         AV30Tab_kep[AV20z-1] = AV26Kgsenprd ;
         AV35Tab_kdp[AV20z-1] = AV24KgsDp ;
         AV62Tab_ks[AV20z-1] = AV61Kgssitio ;
         AV68Tab_mt[AV20z-1] = AV66Formt ;
         AV20z = (int)(AV20z+1) ;
      }
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pfocus02.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      AV11EmprNom = "" ;
      AV31Carpeta = "" ;
      AV52Hhmmss = GXutil.resetTime( GXutil.nullDate() );
      AV33NomInf = "" ;
      AV41NomInf2 = "" ;
      AV34File = "" ;
      AV40File2 = "" ;
      GXv_int6 = new long[1] ;
      AV17Control = "" ;
      AV85Control2 = "" ;
      AV55FecAct = GXutil.resetTime( GXutil.nullDate() );
      AV12Tab_hdrs = new String[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV12Tab_hdrs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV76Tab_artcod = new String[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV76Tab_artcod[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV77Tab_color = new String[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV77Tab_color[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV72Tab_kgssitio = new java.math.BigDecimal[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV72Tab_kgssitio[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV74Tab_kgsprd = new java.math.BigDecimal[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV74Tab_kgsprd[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV75Tab_kgsenprd = new java.math.BigDecimal[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV75Tab_kgsenprd[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV73Tab_mtsvalor = new byte[200000] ;
      scmdbuf = "" ;
      P057W3_A396EmprCod = new String[] {""} ;
      P057W3_A130BarCodPar = new String[] {""} ;
      P057W3_A132BarCodReo = new byte[1] ;
      P057W3_A129BarCod = new int[1] ;
      P057W3_A213BarSit = new byte[1] ;
      P057W3_A11852Nxt_ArtCl2 = new String[] {""} ;
      P057W3_A5058BarEnvLaw = new String[] {""} ;
      P057W3_A252CliCod = new int[1] ;
      P057W3_n252CliCod = new boolean[] {false} ;
      P057W3_A212BarSer = new String[] {""} ;
      P057W3_A135BarColNom = new String[] {""} ;
      P057W3_A136BarColNum = new int[1] ;
      P057W3_A218BarTipCol = new byte[1] ;
      P057W3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057W3_n166BarKgm = new boolean[] {false} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A11852Nxt_ArtCl2 = "" ;
      A5058BarEnvLaw = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV16barcodpar = "" ;
      AV21Procod = "" ;
      AV61Kgssitio = DecimalUtil.ZERO ;
      AV25Kgsprd = DecimalUtil.ZERO ;
      AV26Kgsenprd = DecimalUtil.ZERO ;
      P057W4_A396EmprCod = new String[] {""} ;
      P057W4_A129BarCod = new int[1] ;
      P057W4_A132BarCodReo = new byte[1] ;
      P057W4_A130BarCodPar = new String[] {""} ;
      P057W4_A457FasCod = new String[] {""} ;
      P057W4_A194BarOrdLin = new short[1] ;
      P057W4_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      P057W5_A396EmprCod = new String[] {""} ;
      P057W5_A129BarCod = new int[1] ;
      P057W5_A132BarCodReo = new byte[1] ;
      P057W5_A130BarCodPar = new String[] {""} ;
      P057W5_A194BarOrdLin = new short[1] ;
      P057W5_A153BarFasEst = new byte[1] ;
      P057W5_A152BarFasCon = new String[] {""} ;
      P057W5_A758ProCod = new String[] {""} ;
      A152BarFasCon = "" ;
      P057W6_A396EmprCod = new String[] {""} ;
      P057W6_A10746Stp_hdr = new int[1] ;
      P057W6_A10747Stp_r = new byte[1] ;
      P057W6_A10748Stp_p = new String[] {""} ;
      P057W6_A10755Stp_Est = new byte[1] ;
      P057W6_A10750Stp_Lin = new short[1] ;
      A10748Stp_p = "" ;
      AV46Tab_hdrsd = new String[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV46Tab_hdrsd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV78Tab_artcodd = new String[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV78Tab_artcodd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV79Tab_colord = new String[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV79Tab_colord[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV80Tab_kgssitiod = new java.math.BigDecimal[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV80Tab_kgssitiod[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV81Tab_kgsprdd = new java.math.BigDecimal[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV81Tab_kgsprdd[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV82Tab_kgsenprdd = new java.math.BigDecimal[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV82Tab_kgsenprdd[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV83Tab_kgsdp = new java.math.BigDecimal[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV83Tab_kgsdp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV84Tab_mtsvalord = new byte[200000] ;
      P057W7_A396EmprCod = new String[] {""} ;
      P057W7_A30AlbProCod = new long[1] ;
      P057W7_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      P057W8_A396EmprCod = new String[] {""} ;
      P057W8_A30AlbProCod = new long[1] ;
      P057W8_A7993AlbMqTj = new String[] {""} ;
      P057W8_A1459BarAlbFor = new String[] {""} ;
      P057W8_n1459BarAlbFor = new boolean[] {false} ;
      P057W8_A252CliCod = new int[1] ;
      P057W8_n252CliCod = new boolean[] {false} ;
      P057W8_A212BarSer = new String[] {""} ;
      P057W8_A135BarColNom = new String[] {""} ;
      P057W8_A136BarColNum = new int[1] ;
      P057W8_A218BarTipCol = new byte[1] ;
      P057W8_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057W8_A130BarCodPar = new String[] {""} ;
      P057W8_A132BarCodReo = new byte[1] ;
      P057W8_A129BarCod = new int[1] ;
      A7993AlbMqTj = "" ;
      A1459BarAlbFor = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      GXv_int10 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int8 = new byte[1] ;
      AV24KgsDp = DecimalUtil.ZERO ;
      AV18RefColor = new String[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV18RefColor[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV35Tab_kdp = new java.math.BigDecimal[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV35Tab_kdp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV30Tab_kep = new java.math.BigDecimal[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV30Tab_kep[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV29Tab_kp = new java.math.BigDecimal[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV29Tab_kp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV62Tab_ks = new java.math.BigDecimal[200000] ;
      GX_I = 1 ;
      while ( GX_I <= 200000 )
      {
         AV62Tab_ks[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV68Tab_mt = new byte[200000] ;
      AV27ArtColor = "" ;
      AV42fascod = "" ;
      AV43FasDsc = "" ;
      AV45FecControl = GXutil.resetTime( GXutil.nullDate() );
      AV56Artcod = "" ;
      AV64ForNomCli = "" ;
      AV70ReferenciaColor = "" ;
      AV59ArtKgMn = DecimalUtil.ZERO ;
      AV71ColorNomcli = "" ;
      P057W9_A396EmprCod = new String[] {""} ;
      P057W9_A494ForSer = new String[] {""} ;
      P057W9_A482ForColNom = new String[] {""} ;
      P057W9_A1191ForNomCli = new String[] {""} ;
      P057W9_n1191ForNomCli = new boolean[] {false} ;
      P057W9_A12399ForMT = new byte[1] ;
      P057W9_n12399ForMT = new boolean[] {false} ;
      P057W9_A12400ForTRabs = new byte[1] ;
      P057W9_n12400ForTRabs = new boolean[] {false} ;
      P057W9_A12401ForKgMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057W9_n12401ForKgMn = new boolean[] {false} ;
      P057W9_A252CliCod = new int[1] ;
      P057W9_n252CliCod = new boolean[] {false} ;
      P057W9_A483ForColNum = new int[1] ;
      P057W9_A831TipColCod = new byte[1] ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A12401ForKgMn = DecimalUtil.ZERO ;
      P057W10_A396EmprCod = new String[] {""} ;
      P057W10_A65ArtCod = new String[] {""} ;
      P057W10_A12364ArtMT = new byte[1] ;
      P057W10_n12364ArtMT = new boolean[] {false} ;
      P057W10_A12365ArtTRabs = new byte[1] ;
      P057W10_n12365ArtTRabs = new boolean[] {false} ;
      P057W10_A12366ArtKgMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057W10_n12366ArtKgMn = new boolean[] {false} ;
      P057W10_A252CliCod = new int[1] ;
      P057W10_n252CliCod = new boolean[] {false} ;
      A65ArtCod = "" ;
      A12366ArtKgMn = DecimalUtil.ZERO ;
      AV87FecAlfa = "" ;
      AV91mesalfa = "" ;
      AV92diaalfa = "" ;
      AV86Fec1 = GXutil.nullDate() ;
      P057W14_A130BarCodPar = new String[] {""} ;
      P057W14_A132BarCodReo = new byte[1] ;
      P057W14_A129BarCod = new int[1] ;
      P057W14_A396EmprCod = new String[] {""} ;
      P057W14_A5058BarEnvLaw = new String[] {""} ;
      P057W14_A11852Nxt_ArtCl2 = new String[] {""} ;
      P057W14_A1234BarNomCli = new String[] {""} ;
      P057W14_A135BarColNom = new String[] {""} ;
      P057W14_A212BarSer = new String[] {""} ;
      P057W14_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P057W14_A151BarFasCod = new String[] {""} ;
      P057W14_n151BarFasCod = new boolean[] {false} ;
      P057W14_A154BarFasLin = new short[1] ;
      P057W14_n154BarFasLin = new boolean[] {false} ;
      A1234BarNomCli = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A151BarFasCod = "" ;
      AV67mtoMts = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      P057W16_A130BarCodPar = new String[] {""} ;
      P057W16_A132BarCodReo = new byte[1] ;
      P057W16_A129BarCod = new int[1] ;
      P057W16_A30AlbProCod = new long[1] ;
      P057W16_A396EmprCod = new String[] {""} ;
      P057W16_A1459BarAlbFor = new String[] {""} ;
      P057W16_n1459BarAlbFor = new boolean[] {false} ;
      P057W16_A7993AlbMqTj = new String[] {""} ;
      P057W16_A1234BarNomCli = new String[] {""} ;
      P057W16_A135BarColNom = new String[] {""} ;
      P057W16_A212BarSer = new String[] {""} ;
      P057W16_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      GXv_int11 = new byte[1] ;
      P057W18_A396EmprCod = new String[] {""} ;
      P057W18_A129BarCod = new int[1] ;
      P057W18_A132BarCodReo = new byte[1] ;
      P057W18_A130BarCodPar = new String[] {""} ;
      P057W18_A758ProCod = new String[] {""} ;
      P057W18_A152BarFasCon = new String[] {""} ;
      P057W18_A194BarOrdLin = new short[1] ;
      P057W18_A153BarFasEst = new byte[1] ;
      P057W18_A457FasCod = new String[] {""} ;
      P057W18_A460FasDsc = new String[] {""} ;
      A460FasDsc = "" ;
      AV93KgsExp = DecimalUtil.ZERO ;
      P057W19_A130BarCodPar = new String[] {""} ;
      P057W19_A132BarCodReo = new byte[1] ;
      P057W19_A129BarCod = new int[1] ;
      P057W19_A396EmprCod = new String[] {""} ;
      P057W19_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057W19_A30AlbProCod = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apfocus02__default(),
         new Object[] {
             new Object[] {
            P057W3_A396EmprCod, P057W3_A130BarCodPar, P057W3_A132BarCodReo, P057W3_A129BarCod, P057W3_A213BarSit, P057W3_A11852Nxt_ArtCl2, P057W3_A5058BarEnvLaw, P057W3_A252CliCod, P057W3_n252CliCod, P057W3_A212BarSer,
            P057W3_A135BarColNom, P057W3_A136BarColNum, P057W3_A218BarTipCol, P057W3_A166BarKgm, P057W3_n166BarKgm
            }
            , new Object[] {
            P057W4_A396EmprCod, P057W4_A129BarCod, P057W4_A132BarCodReo, P057W4_A130BarCodPar, P057W4_A457FasCod, P057W4_A194BarOrdLin, P057W4_A758ProCod
            }
            , new Object[] {
            P057W5_A396EmprCod, P057W5_A129BarCod, P057W5_A132BarCodReo, P057W5_A130BarCodPar, P057W5_A194BarOrdLin, P057W5_A153BarFasEst, P057W5_A152BarFasCon, P057W5_A758ProCod
            }
            , new Object[] {
            P057W6_A396EmprCod, P057W6_A10746Stp_hdr, P057W6_A10747Stp_r, P057W6_A10748Stp_p, P057W6_A10755Stp_Est, P057W6_A10750Stp_Lin
            }
            , new Object[] {
            P057W7_A396EmprCod, P057W7_A30AlbProCod, P057W7_A34AlbProfch
            }
            , new Object[] {
            P057W8_A396EmprCod, P057W8_A30AlbProCod, P057W8_A7993AlbMqTj, P057W8_A1459BarAlbFor, P057W8_n1459BarAlbFor, P057W8_A252CliCod, P057W8_n252CliCod, P057W8_A212BarSer, P057W8_A135BarColNom, P057W8_A136BarColNum,
            P057W8_A218BarTipCol, P057W8_A1261BarAlbKgmE, P057W8_A130BarCodPar, P057W8_A132BarCodReo, P057W8_A129BarCod
            }
            , new Object[] {
            P057W9_A396EmprCod, P057W9_A494ForSer, P057W9_A482ForColNom, P057W9_A1191ForNomCli, P057W9_n1191ForNomCli, P057W9_A12399ForMT, P057W9_n12399ForMT, P057W9_A12400ForTRabs, P057W9_n12400ForTRabs, P057W9_A12401ForKgMn,
            P057W9_n12401ForKgMn, P057W9_A252CliCod, P057W9_A483ForColNum, P057W9_A831TipColCod
            }
            , new Object[] {
            P057W10_A396EmprCod, P057W10_A65ArtCod, P057W10_A12364ArtMT, P057W10_n12364ArtMT, P057W10_A12365ArtTRabs, P057W10_n12365ArtTRabs, P057W10_A12366ArtKgMn, P057W10_n12366ArtKgMn, P057W10_A252CliCod
            }
            , new Object[] {
            P057W14_A130BarCodPar, P057W14_A132BarCodReo, P057W14_A129BarCod, P057W14_A396EmprCod, P057W14_A5058BarEnvLaw, P057W14_A11852Nxt_ArtCl2, P057W14_A1234BarNomCli, P057W14_A135BarColNom, P057W14_A212BarSer, P057W14_A159BarFecGen,
            P057W14_A151BarFasCod, P057W14_n151BarFasCod, P057W14_A154BarFasLin, P057W14_n154BarFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P057W16_A130BarCodPar, P057W16_A132BarCodReo, P057W16_A129BarCod, P057W16_A30AlbProCod, P057W16_A396EmprCod, P057W16_A1459BarAlbFor, P057W16_n1459BarAlbFor, P057W16_A7993AlbMqTj, P057W16_A1234BarNomCli, P057W16_A135BarColNom,
            P057W16_A212BarSer, P057W16_A159BarFecGen
            }
            , new Object[] {
            }
            , new Object[] {
            P057W18_A396EmprCod, P057W18_A129BarCod, P057W18_A132BarCodReo, P057W18_A130BarCodPar, P057W18_A758ProCod, P057W18_A152BarFasCon, P057W18_A194BarOrdLin, P057W18_A153BarFasEst, P057W18_A457FasCod, P057W18_A460FasDsc
            }
            , new Object[] {
            P057W19_A130BarCodPar, P057W19_A132BarCodReo, P057W19_A129BarCod, P057W19_A396EmprCod, P057W19_A1261BarAlbKgmE, P057W19_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV37Stat ;
   private byte AV39Stat2 ;
   private byte AV73Tab_mtsvalor[] ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV15Barcodreo ;
   private byte AV66Formt ;
   private byte AV60Albbar ;
   private byte AV94productoterminado ;
   private byte A153BarFasEst ;
   private byte AV63Stp_Est ;
   private byte A10747Stp_r ;
   private byte A10755Stp_Est ;
   private byte AV23Barfasest ;
   private byte AV84Tab_mtsvalord[] ;
   private byte GXv_int8[] ;
   private byte AV68Tab_mt[] ;
   private byte AV57ArtMt ;
   private byte AV58ArtTRabs ;
   private byte AV65Cformu ;
   private byte A12399ForMT ;
   private byte A12400ForTRabs ;
   private byte A831TipColCod ;
   private byte A12364ArtMT ;
   private byte A12365ArtTRabs ;
   private byte AV90mes ;
   private byte AV89dia ;
   private byte GXt_int7 ;
   private byte GXv_int11[] ;
   private byte AV28Alta ;
   private short AV22BarOrdlin ;
   private short A194BarOrdLin ;
   private short A10750Stp_Lin ;
   private short AV88Anyo ;
   private short A154BarFasLin ;
   private short Gx_err ;
   private int GX_I ;
   private int AV13i ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV14Barcod ;
   private int A10746Stp_hdr ;
   private int AV48Nrgtos1 ;
   private int GXv_int10[] ;
   private int GXv_int9[] ;
   private int AV49Nrgtos2 ;
   private int AV19j ;
   private int AV20z ;
   private int AV44Nrgtos ;
   private int A483ForColNum ;
   private int AV69Dif ;
   private long AV36hnd ;
   private long AV38Hnd2 ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private long A30AlbProCod ;
   private long AV47albprocod ;
   private java.math.BigDecimal AV72Tab_kgssitio[] ;
   private java.math.BigDecimal AV74Tab_kgsprd[] ;
   private java.math.BigDecimal AV75Tab_kgsenprd[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV61Kgssitio ;
   private java.math.BigDecimal AV25Kgsprd ;
   private java.math.BigDecimal AV26Kgsenprd ;
   private java.math.BigDecimal AV80Tab_kgssitiod[] ;
   private java.math.BigDecimal AV81Tab_kgsprdd[] ;
   private java.math.BigDecimal AV82Tab_kgsenprdd[] ;
   private java.math.BigDecimal AV83Tab_kgsdp[] ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal AV24KgsDp ;
   private java.math.BigDecimal AV35Tab_kdp[] ;
   private java.math.BigDecimal AV30Tab_kep[] ;
   private java.math.BigDecimal AV29Tab_kp[] ;
   private java.math.BigDecimal AV62Tab_ks[] ;
   private java.math.BigDecimal AV59ArtKgMn ;
   private java.math.BigDecimal A12401ForKgMn ;
   private java.math.BigDecimal A12366ArtKgMn ;
   private java.math.BigDecimal AV93KgsExp ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String AV11EmprNom ;
   private String AV31Carpeta ;
   private String AV33NomInf ;
   private String AV41NomInf2 ;
   private String AV12Tab_hdrs[] ;
   private String AV76Tab_artcod[] ;
   private String AV77Tab_color[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A11852Nxt_ArtCl2 ;
   private String A5058BarEnvLaw ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV16barcodpar ;
   private String AV21Procod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A152BarFasCon ;
   private String A10748Stp_p ;
   private String AV46Tab_hdrsd[] ;
   private String AV78Tab_artcodd[] ;
   private String AV79Tab_colord[] ;
   private String A7993AlbMqTj ;
   private String A1459BarAlbFor ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV18RefColor[] ;
   private String AV27ArtColor ;
   private String AV42fascod ;
   private String AV43FasDsc ;
   private String AV56Artcod ;
   private String AV64ForNomCli ;
   private String AV70ReferenciaColor ;
   private String AV71ColorNomcli ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A1191ForNomCli ;
   private String A65ArtCod ;
   private String AV87FecAlfa ;
   private String AV91mesalfa ;
   private String AV92diaalfa ;
   private String A1234BarNomCli ;
   private String A151BarFasCod ;
   private String AV67mtoMts ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String A460FasDsc ;
   private java.util.Date AV52Hhmmss ;
   private java.util.Date AV55FecAct ;
   private java.util.Date AV45FecControl ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV86Fec1 ;
   private java.util.Date A159BarFecGen ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n1459BarAlbFor ;
   private boolean n1191ForNomCli ;
   private boolean n12399ForMT ;
   private boolean n12400ForTRabs ;
   private boolean n12401ForKgMn ;
   private boolean n12364ArtMT ;
   private boolean n12365ArtTRabs ;
   private boolean n12366ArtKgMn ;
   private boolean n151BarFasCod ;
   private boolean n154BarFasLin ;
   private String AV34File ;
   private String AV40File2 ;
   private String AV17Control ;
   private String AV85Control2 ;
   private IDataStoreProvider pr_default ;
   private String[] P057W3_A396EmprCod ;
   private String[] P057W3_A130BarCodPar ;
   private byte[] P057W3_A132BarCodReo ;
   private int[] P057W3_A129BarCod ;
   private byte[] P057W3_A213BarSit ;
   private String[] P057W3_A11852Nxt_ArtCl2 ;
   private String[] P057W3_A5058BarEnvLaw ;
   private int[] P057W3_A252CliCod ;
   private boolean[] P057W3_n252CliCod ;
   private String[] P057W3_A212BarSer ;
   private String[] P057W3_A135BarColNom ;
   private int[] P057W3_A136BarColNum ;
   private byte[] P057W3_A218BarTipCol ;
   private java.math.BigDecimal[] P057W3_A166BarKgm ;
   private boolean[] P057W3_n166BarKgm ;
   private String[] P057W4_A396EmprCod ;
   private int[] P057W4_A129BarCod ;
   private byte[] P057W4_A132BarCodReo ;
   private String[] P057W4_A130BarCodPar ;
   private String[] P057W4_A457FasCod ;
   private short[] P057W4_A194BarOrdLin ;
   private String[] P057W4_A758ProCod ;
   private String[] P057W5_A396EmprCod ;
   private int[] P057W5_A129BarCod ;
   private byte[] P057W5_A132BarCodReo ;
   private String[] P057W5_A130BarCodPar ;
   private short[] P057W5_A194BarOrdLin ;
   private byte[] P057W5_A153BarFasEst ;
   private String[] P057W5_A152BarFasCon ;
   private String[] P057W5_A758ProCod ;
   private String[] P057W6_A396EmprCod ;
   private int[] P057W6_A10746Stp_hdr ;
   private byte[] P057W6_A10747Stp_r ;
   private String[] P057W6_A10748Stp_p ;
   private byte[] P057W6_A10755Stp_Est ;
   private short[] P057W6_A10750Stp_Lin ;
   private String[] P057W7_A396EmprCod ;
   private long[] P057W7_A30AlbProCod ;
   private java.util.Date[] P057W7_A34AlbProfch ;
   private String[] P057W8_A396EmprCod ;
   private long[] P057W8_A30AlbProCod ;
   private String[] P057W8_A7993AlbMqTj ;
   private String[] P057W8_A1459BarAlbFor ;
   private boolean[] P057W8_n1459BarAlbFor ;
   private int[] P057W8_A252CliCod ;
   private boolean[] P057W8_n252CliCod ;
   private String[] P057W8_A212BarSer ;
   private String[] P057W8_A135BarColNom ;
   private int[] P057W8_A136BarColNum ;
   private byte[] P057W8_A218BarTipCol ;
   private java.math.BigDecimal[] P057W8_A1261BarAlbKgmE ;
   private String[] P057W8_A130BarCodPar ;
   private byte[] P057W8_A132BarCodReo ;
   private int[] P057W8_A129BarCod ;
   private String[] P057W9_A396EmprCod ;
   private String[] P057W9_A494ForSer ;
   private String[] P057W9_A482ForColNom ;
   private String[] P057W9_A1191ForNomCli ;
   private boolean[] P057W9_n1191ForNomCli ;
   private byte[] P057W9_A12399ForMT ;
   private boolean[] P057W9_n12399ForMT ;
   private byte[] P057W9_A12400ForTRabs ;
   private boolean[] P057W9_n12400ForTRabs ;
   private java.math.BigDecimal[] P057W9_A12401ForKgMn ;
   private boolean[] P057W9_n12401ForKgMn ;
   private int[] P057W9_A252CliCod ;
   private boolean[] P057W9_n252CliCod ;
   private int[] P057W9_A483ForColNum ;
   private byte[] P057W9_A831TipColCod ;
   private String[] P057W10_A396EmprCod ;
   private String[] P057W10_A65ArtCod ;
   private byte[] P057W10_A12364ArtMT ;
   private boolean[] P057W10_n12364ArtMT ;
   private byte[] P057W10_A12365ArtTRabs ;
   private boolean[] P057W10_n12365ArtTRabs ;
   private java.math.BigDecimal[] P057W10_A12366ArtKgMn ;
   private boolean[] P057W10_n12366ArtKgMn ;
   private int[] P057W10_A252CliCod ;
   private boolean[] P057W10_n252CliCod ;
   private String[] P057W14_A130BarCodPar ;
   private byte[] P057W14_A132BarCodReo ;
   private int[] P057W14_A129BarCod ;
   private String[] P057W14_A396EmprCod ;
   private String[] P057W14_A5058BarEnvLaw ;
   private String[] P057W14_A11852Nxt_ArtCl2 ;
   private String[] P057W14_A1234BarNomCli ;
   private String[] P057W14_A135BarColNom ;
   private String[] P057W14_A212BarSer ;
   private java.util.Date[] P057W14_A159BarFecGen ;
   private String[] P057W14_A151BarFasCod ;
   private boolean[] P057W14_n151BarFasCod ;
   private short[] P057W14_A154BarFasLin ;
   private boolean[] P057W14_n154BarFasLin ;
   private String[] P057W16_A130BarCodPar ;
   private byte[] P057W16_A132BarCodReo ;
   private int[] P057W16_A129BarCod ;
   private long[] P057W16_A30AlbProCod ;
   private String[] P057W16_A396EmprCod ;
   private String[] P057W16_A1459BarAlbFor ;
   private boolean[] P057W16_n1459BarAlbFor ;
   private String[] P057W16_A7993AlbMqTj ;
   private String[] P057W16_A1234BarNomCli ;
   private String[] P057W16_A135BarColNom ;
   private String[] P057W16_A212BarSer ;
   private java.util.Date[] P057W16_A159BarFecGen ;
   private String[] P057W18_A396EmprCod ;
   private int[] P057W18_A129BarCod ;
   private byte[] P057W18_A132BarCodReo ;
   private String[] P057W18_A130BarCodPar ;
   private String[] P057W18_A758ProCod ;
   private String[] P057W18_A152BarFasCon ;
   private short[] P057W18_A194BarOrdLin ;
   private byte[] P057W18_A153BarFasEst ;
   private String[] P057W18_A457FasCod ;
   private String[] P057W18_A460FasDsc ;
   private String[] P057W19_A130BarCodPar ;
   private byte[] P057W19_A132BarCodReo ;
   private int[] P057W19_A129BarCod ;
   private String[] P057W19_A396EmprCod ;
   private java.math.BigDecimal[] P057W19_A1261BarAlbKgmE ;
   private long[] P057W19_A30AlbProCod ;
}

final  class apfocus02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P057W3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSit, T1.Nxt_ArtCl2, T1.BarEnvLaw, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.BarSit < 9) ORDER BY T1.EmprCod, T1.BarSit, T1.BarEnvLaw ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057W4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = '500101') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057W5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasEst, BarFasCon, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin < ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057W6", "SELECT EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Est, Stp_Lin FROM TXPHDSTO1 WHERE EmprCod = ? and Stp_hdr = ? and Stp_r = ? and Stp_p = ? ORDER BY EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Est ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057W7", "SELECT EmprCod, AlbProCod, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? ORDER BY EmprCod, AlbProfch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057W8", "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbMqTj, T1.BarAlbFor, T2.CliCod, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T1.BarAlbKgmE, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057W9", "SELECT * FROM (SELECT EmprCod, ForSer, ForColNom, ForNomCli, ForMT, ForTRabs, ForKgMn, CliCod, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and ForSer = ? and ForColNom = ? ORDER BY EmprCod, ForSer, ForColNom) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057W10", "SELECT * FROM (SELECT EmprCod, ArtCod, ArtMT, ArtTRabs, ArtKgMn, CliCod FROM TXPARTICU WHERE EmprCod = ? and ArtCod = ? ORDER BY EmprCod, ArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057W14", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarEnvLaw, T1.Nxt_ArtCl2, T1.BarNomCli, T1.BarColNom, T1.BarSer, T1.BarFecGen, COALESCE( T2.BarFasCod, ' ') AS BarFasCod, COALESCE( T3.BarFasLin, 0) AS BarFasLin FROM ((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T4.FasCod) AS BarFasCod, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM (TXPBARFAS T4 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) WHERE (T4.BarOrdLin = T5.GXC1) AND (T4.BarFasEst <> 0) GROUP BY T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P057W15", "UPDATE TXPBARCAD SET BarEnvLaw=?, Nxt_ArtCl2=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P057W16", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.EmprCod, T1.BarAlbFor, T1.AlbMqTj, T2.BarNomCli, T2.BarColNom, T2.BarSer, T2.BarFecGen FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P057W17", "UPDATE TXPALBBAR SET BarAlbFor=?, AlbMqTj=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P057W18", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarFasCon, T1.BarOrdLin, T1.BarFasEst, T1.FasCod, T2.FasDsc FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin < ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057W19", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAlbKgmE, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 28);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 13);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 16);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setLong(4, ((Number) parms[4]).longValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

