package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apfocus04 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apfocus04 pgm = new apfocus04 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apfocus04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apfocus04.class ), "" );
   }

   public apfocus04( int remoteHandle ,
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
      AV43UsurCod = " " ;
      AV44Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV29emprcod ;
      GXv_char2[0] = AV45EmprNom ;
      GXv_char3[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV44Station, GXv_char1, GXv_char2, GXv_char3) ;
      apfocus04.this.AV29emprcod = GXv_char1[0] ;
      apfocus04.this.AV45EmprNom = GXv_char2[0] ;
      apfocus04.this.AV43UsurCod = GXv_char3[0] ;
      GXt_char4 = AV8Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV29emprcod, httpContext.getMessage( "FOCUS", ""), GXv_char3) ;
      apfocus04.this.GXt_char4 = GXv_char3[0] ;
      AV8Carpeta = GXt_char4 ;
      GXt_char4 = AV8Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      apfocus04.this.GXt_char4 = GXv_char3[0] ;
      AV8Carpeta = ((GXutil.strcmp("", AV8Carpeta)==0) ? GXt_char4 : AV8Carpeta) ;
      AV14Hhmmss = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV17NomInf = httpContext.getMessage( "PRODUCTION_ORDERS_", "") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV14Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 4)), (short)(4), "0") + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV14Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV14Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + "_" ;
      AV17NomInf += GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV14Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV14Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV14Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") ;
      AV11File = GXutil.trim( AV8Carpeta) + "\\" + GXutil.trim( AV17NomInf) + httpContext.getMessage( ".csv", "") ;
      GXt_int5 = AV15hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV11File, GXv_int6) ;
      apfocus04.this.GXt_int5 = GXv_int6[0] ;
      AV15hnd = GXt_int5 ;
      AV9Control = httpContext.getMessage( "Código OP", "") + ";" + httpContext.getMessage( "SKU", "") + ";" + httpContext.getMessage( "Tipo", "") + ";" + httpContext.getMessage( "Destino", "") + ";" + httpContext.getMessage( "Fecha Prometida de Entrega", "") + ";" + httpContext.getMessage( "Fecha Real de Liberación", "") + ";" + httpContext.getMessage( "Familia de Producción", "") + ";" + httpContext.getMessage( "Grupo", "") + ";" + httpContext.getMessage( "Cantidad Total", "") + ";" + httpContext.getMessage( "Cantidad Pendiente", "") + ";" + httpContext.getMessage( "Fecha de Actualización", "") + ";" ;
      AV9Control += httpContext.getMessage( "Recurso actual", "") + ";" + httpContext.getMessage( "Remisión", "") + ";" + httpContext.getMessage( "Valor de la Orden", "") + ";" + httpContext.getMessage( "Descripción Color", "") + ";" + httpContext.getMessage( "Maquina", "") + ";" + httpContext.getMessage( "Descripción articulo", "") + ";" + httpContext.getMessage( "Tipo fibra", "") + ";" + httpContext.getMessage( "Código de color", "") + ";" + httpContext.getMessage( "Agrupración", "") + ";" + httpContext.getMessage( "Nombre Maquina", "") + ";" + httpContext.getMessage( "HDR agrupadas", "") + ";" ;
      AV9Control += httpContext.getMessage( "Piezas", "") + ";" + httpContext.getMessage( "Localización", "") + ";" + httpContext.getMessage( "Prefijado", "") + ";" + httpContext.getMessage( "Baño", "") + ";" + httpContext.getMessage( "Estado", "") + ";" + httpContext.getMessage( "Órdenes por color", "") + ";" + httpContext.getMessage( "Familia Resource", "") ;
      GXt_int7 = AV22Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV15hnd, AV9Control, GXv_int8) ;
      apfocus04.this.GXt_int7 = GXv_int8[0] ;
      AV22Stat = GXt_int7 ;
      System.out.println( AV9Control );
      AV25FecAct = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV9Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Actualizo PRODUCCIONES Pdtes Envio FOCUS", "") ;
      System.out.println( AV9Control );
      /* Using cursor P05MA3 */
      pr_default.execute(0, new Object[] {AV29emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05MA3_A396EmprCod[0] ;
         A130BarCodPar = P05MA3_A130BarCodPar[0] ;
         A132BarCodReo = P05MA3_A132BarCodReo[0] ;
         A129BarCod = P05MA3_A129BarCod[0] ;
         A213BarSit = P05MA3_A213BarSit[0] ;
         A11850Nxt_Mdlo2 = P05MA3_A11850Nxt_Mdlo2[0] ;
         A3787BarEnvRec = P05MA3_A3787BarEnvRec[0] ;
         n3787BarEnvRec = P05MA3_n3787BarEnvRec[0] ;
         A252CliCod = P05MA3_A252CliCod[0] ;
         n252CliCod = P05MA3_n252CliCod[0] ;
         A212BarSer = P05MA3_A212BarSer[0] ;
         A135BarColNom = P05MA3_A135BarColNom[0] ;
         A136BarColNum = P05MA3_A136BarColNum[0] ;
         A218BarTipCol = P05MA3_A218BarTipCol[0] ;
         A279CliNom = P05MA3_A279CliNom[0] ;
         A192BarNumUni = P05MA3_A192BarNumUni[0] ;
         A217BarTipArt = P05MA3_A217BarTipArt[0] ;
         n217BarTipArt = P05MA3_n217BarTipArt[0] ;
         A180BarMaqCod = P05MA3_A180BarMaqCod[0] ;
         A158BarFecFpr = P05MA3_A158BarFecFpr[0] ;
         A3870BarFecLRe = P05MA3_A3870BarFecLRe[0] ;
         A1234BarNomCli = P05MA3_A1234BarNomCli[0] ;
         A4812BarEncCli = P05MA3_A4812BarEncCli[0] ;
         A120BarAgrEst = P05MA3_A120BarAgrEst[0] ;
         A166BarKgm = P05MA3_A166BarKgm[0] ;
         A199BarPie1 = P05MA3_A199BarPie1[0] ;
         A365DisDes = P05MA3_A365DisDes[0] ;
         A898BarPieNDes = P05MA3_A898BarPieNDes[0] ;
         A166BarKgm = P05MA3_A166BarKgm[0] ;
         A199BarPie1 = P05MA3_A199BarPie1[0] ;
         A898BarPieNDes = P05MA3_A898BarPieNDes[0] ;
         A279CliNom = P05MA3_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A3787BarEnvRec, httpContext.getMessage( "S", "")) != 0 ) || ( ( GXutil.strcmp(A3787BarEnvRec, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A11850Nxt_Mdlo2, localUtil.ttoc( AV25FecAct, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) != 0 ) && ! (GXutil.strcmp("", A11850Nxt_Mdlo2)==0) ) )
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            AV26barcod = A129BarCod ;
            AV27barcodreo = A132BarCodReo ;
            AV28barcodpar = A130BarCodPar ;
            /* Execute user subroutine: 'BARFAS' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV30BarFasest < 2 )
            {
               /* Execute user subroutine: 'PREFIJADO' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV46clicod = A252CliCod ;
               AV47Barser = A212BarSer ;
               /* Execute user subroutine: 'ARTICU' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               GXv_char3[0] = A396EmprCod ;
               GXv_int9[0] = A129BarCod ;
               GXv_int8[0] = A132BarCodReo ;
               GXv_char2[0] = A130BarCodPar ;
               GXv_char1[0] = A135BarColNom ;
               GXv_int6[0] = AV42nhdrs ;
               new app.pprc133(remoteHandle, context).execute( GXv_char3, GXv_int9, GXv_int8, GXv_char2, GXv_char1, GXv_int6) ;
               apfocus04.this.A396EmprCod = GXv_char3[0] ;
               apfocus04.this.A129BarCod = GXv_int9[0] ;
               apfocus04.this.A132BarCodReo = GXv_int8[0] ;
               apfocus04.this.A130BarCodPar = GXv_char2[0] ;
               apfocus04.this.A135BarColNom = GXv_char1[0] ;
               apfocus04.this.AV42nhdrs = GXv_int6[0] ;
               GXv_char3[0] = A396EmprCod ;
               GXv_int9[0] = A252CliCod ;
               GXv_char2[0] = A212BarSer ;
               GXv_char1[0] = A135BarColNom ;
               GXv_int10[0] = A136BarColNum ;
               GXv_int8[0] = A218BarTipCol ;
               GXv_int11[0] = AV31Formt ;
               new app.pmtsvalor(remoteHandle, context).execute( GXv_char3, GXv_int9, GXv_char2, GXv_char1, GXv_int10, GXv_int8, GXv_int11) ;
               apfocus04.this.A396EmprCod = GXv_char3[0] ;
               apfocus04.this.A252CliCod = GXv_int9[0] ;
               apfocus04.this.A212BarSer = GXv_char2[0] ;
               apfocus04.this.A135BarColNom = GXv_char1[0] ;
               apfocus04.this.A136BarColNum = GXv_int10[0] ;
               apfocus04.this.A218BarTipCol = GXv_int8[0] ;
               apfocus04.this.AV31Formt = GXv_int11[0] ;
               AV32Tipo = ((AV31Formt==1) ? httpContext.getMessage( "O", "") : httpContext.getMessage( "S", "")) ;
               AV33Destino = ((GXutil.strcmp(AV32Tipo, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "PT", "") : A279CliNom) ;
               AV36canttotal = ((A166BarKgm.doubleValue()==0) ? A192BarNumUni : A166BarKgm) ;
               AV37Cantpdte = A166BarKgm ;
               AV48Fascodarealizar = " " ;
               /* Execute user subroutine: 'FASESIGUIENTE' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               GXt_char4 = AV35TipArtDsc ;
               GXv_char3[0] = GXt_char4 ;
               new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char3) ;
               apfocus04.this.GXt_char4 = GXv_char3[0] ;
               AV35TipArtDsc = GXt_char4 ;
               GXt_char4 = AV38MaqDsc ;
               GXv_char3[0] = A396EmprCod ;
               GXv_char2[0] = A180BarMaqCod ;
               GXv_char1[0] = GXt_char4 ;
               new app.pmaqdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
               apfocus04.this.A396EmprCod = GXv_char3[0] ;
               apfocus04.this.A180BarMaqCod = GXv_char2[0] ;
               apfocus04.this.GXt_char4 = GXv_char1[0] ;
               AV38MaqDsc = GXt_char4 ;
               AV38MaqDsc = ((GXutil.strcmp("", A180BarMaqCod)==0) ? "" : AV38MaqDsc) ;
               AV39HdrAgrupadas = "" ;
               /* Using cursor P05MA4 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A122BarAgrPar = P05MA4_A122BarAgrPar[0] ;
                  A124BarAgrReo = P05MA4_A124BarAgrReo[0] ;
                  A119BarAgrCod = P05MA4_A119BarAgrCod[0] ;
                  if ( GXutil.strcmp(AV39HdrAgrupadas, "") == 0 )
                  {
                     AV39HdrAgrupadas = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
                  }
                  else
                  {
                     AV39HdrAgrupadas += "," + GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
                  }
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               AV40AlbRLoc = "" ;
               /* Using cursor P05MA5 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A44AlbRecCod = P05MA5_A44AlbRecCod[0] ;
                  A203BarPieKil = P05MA5_A203BarPieKil[0] ;
                  A50AlbRLoc = P05MA5_A50AlbRLoc[0] ;
                  A200BarPieCod = P05MA5_A200BarPieCod[0] ;
                  A50AlbRLoc = P05MA5_A50AlbRLoc[0] ;
                  AV40AlbRLoc = ((GXutil.strcmp(A50AlbRLoc, " ")!=0) ? A50AlbRLoc : AV40AlbRLoc) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               AV53anyo = (short)(GXutil.year( A158BarFecFpr)) ;
               AV52BarFecfpralfa = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A158BarFecFpr)) ? " " : GXutil.padl( GXutil.trim( GXutil.substring( localUtil.dtoc( A158BarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2)), (short)(2), "0")+"/"+GXutil.padl( GXutil.trim( GXutil.substring( localUtil.dtoc( A158BarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2)), (short)(2), "0")+"/"+GXutil.str( AV53anyo, 4, 0)) ;
               AV53anyo = (short)(GXutil.year( A3870BarFecLRe)) ;
               AV54BarFecLRealfa = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3870BarFecLRe)) ? " " : GXutil.padl( GXutil.trim( GXutil.substring( localUtil.dtoc( A3870BarFecLRe, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2)), (short)(2), "0")+"/"+GXutil.padl( GXutil.trim( GXutil.substring( localUtil.dtoc( A3870BarFecLRe, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2)), (short)(2), "0")+"/"+GXutil.str( AV53anyo, 4, 0)) ;
               AV25FecAct = GXutil.serverNow( context, remoteHandle, pr_default) ;
               AV55Fechaalfa = localUtil.ttoc( AV25FecAct, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV56Familiaproduccion = httpContext.getMessage( "TTESTANDAR", "") ;
               /* Using cursor P05MA6 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A457FasCod = P05MA6_A457FasCod[0] ;
                  A758ProCod = P05MA6_A758ProCod[0] ;
                  A194BarOrdLin = P05MA6_A194BarOrdLin[0] ;
                  AV56Familiaproduccion = ((GXutil.strcmp(A457FasCod, "300103")==0) ? httpContext.getMessage( "TTESPECIAL", "") : AV56Familiaproduccion) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               AV49ArticuloColor = GXutil.trim( A212BarSer) + "_" + GXutil.trim( A135BarColNom) ;
               AV9Control = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + GXutil.trim( A130BarCodPar) + ";" + GXutil.trim( AV49ArticuloColor) + ";" + GXutil.trim( AV32Tipo) + ";" + GXutil.trim( AV33Destino) + ";" + (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A158BarFecFpr)) ? " " : AV52BarFecfpralfa) + ";" + (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3870BarFecLRe)) ? " " : AV54BarFecLRealfa) + ";" ;
               AV9Control += GXutil.trim( AV56Familiaproduccion) + ";" + GXutil.trim( AV35TipArtDsc) + ";" + GXutil.str( AV36canttotal, 9, 2) + ";" ;
               AV9Control += GXutil.str( AV36canttotal, 9, 2) + ";" + GXutil.trim( AV55Fechaalfa) + ";" + GXutil.trim( AV48Fascodarealizar) + ";" + GXutil.trim( A4812BarEncCli) + ";" + GXutil.str( AV36canttotal, 9, 2) + ";" + GXutil.trim( A1234BarNomCli) + ";" + GXutil.trim( A180BarMaqCod) + ";" + GXutil.trim( A212BarSer) + ";" + GXutil.trim( AV35TipArtDsc) + ";" + GXutil.trim( A135BarColNom) + ";" ;
               AV9Control += A120BarAgrEst + ";" + GXutil.trim( AV38MaqDsc) + ";" + GXutil.trim( AV39HdrAgrupadas) + ";" ;
               AV9Control += GXutil.str( A198BarPie, 6, 0) + ";" + GXutil.trim( AV40AlbRLoc) + ";" + GXutil.trim( AV41Pref) + ";" + "" + ";" + " " + ";" + GXutil.trim( GXutil.str( AV42nhdrs, 10, 0)) + ";" + " " ;
               GXt_int7 = AV22Stat ;
               GXv_int11[0] = GXt_int7 ;
               new app.core.fputs(remoteHandle, context).execute( AV15hnd, AV9Control, GXv_int11) ;
               apfocus04.this.GXt_int7 = GXv_int11[0] ;
               AV22Stat = GXt_int7 ;
               System.out.println( AV9Control );
               A3787BarEnvRec = httpContext.getMessage( "S", "") ;
               n3787BarEnvRec = false ;
               A11850Nxt_Mdlo2 = localUtil.ttoc( AV25FecAct, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            /* Using cursor P05MA7 */
            pr_default.execute(4, new Object[] {A11850Nxt_Mdlo2, Boolean.valueOf(n3787BarEnvRec), A3787BarEnvRec, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_int7 = AV22Stat ;
      GXv_int11[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV15hnd, GXv_int11) ;
      apfocus04.this.GXt_int7 = GXv_int11[0] ;
      AV22Stat = GXt_int7 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV34Clascod = (short)(0) ;
      /* Using cursor P05MA8 */
      pr_default.execute(5, new Object[] {AV29emprcod, Integer.valueOf(AV46clicod), AV47Barser});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A65ArtCod = P05MA8_A65ArtCod[0] ;
         A252CliCod = P05MA8_A252CliCod[0] ;
         n252CliCod = P05MA8_n252CliCod[0] ;
         A396EmprCod = P05MA8_A396EmprCod[0] ;
         A4295ClasCod = P05MA8_A4295ClasCod[0] ;
         n4295ClasCod = P05MA8_n4295ClasCod[0] ;
         AV34Clascod = A4295ClasCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S121( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV30BarFasest = (byte)(0) ;
      /* Using cursor P05MA9 */
      pr_default.execute(6, new Object[] {AV29emprcod, Integer.valueOf(AV26barcod), Byte.valueOf(AV27barcodreo), AV28barcodpar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A396EmprCod = P05MA9_A396EmprCod[0] ;
         A129BarCod = P05MA9_A129BarCod[0] ;
         A132BarCodReo = P05MA9_A132BarCodReo[0] ;
         A130BarCodPar = P05MA9_A130BarCodPar[0] ;
         A152BarFasCon = P05MA9_A152BarFasCon[0] ;
         A153BarFasEst = P05MA9_A153BarFasEst[0] ;
         A194BarOrdLin = P05MA9_A194BarOrdLin[0] ;
         A758ProCod = P05MA9_A758ProCod[0] ;
         if ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 )
         {
            AV30BarFasest = A153BarFasEst ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S131( )
   {
      /* 'FASESIGUIENTE' Routine */
      returnInSub = false ;
      /* Using cursor P05MA10 */
      pr_default.execute(7, new Object[] {AV29emprcod, Integer.valueOf(AV26barcod), Byte.valueOf(AV27barcodreo), AV28barcodpar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A153BarFasEst = P05MA10_A153BarFasEst[0] ;
         A152BarFasCon = P05MA10_A152BarFasCon[0] ;
         A130BarCodPar = P05MA10_A130BarCodPar[0] ;
         A132BarCodReo = P05MA10_A132BarCodReo[0] ;
         A129BarCod = P05MA10_A129BarCod[0] ;
         A396EmprCod = P05MA10_A396EmprCod[0] ;
         A457FasCod = P05MA10_A457FasCod[0] ;
         A194BarOrdLin = P05MA10_A194BarOrdLin[0] ;
         A758ProCod = P05MA10_A758ProCod[0] ;
         if ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 )
         {
            AV48Fascodarealizar = A457FasCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S141( )
   {
      /* 'PREFIJADO' Routine */
      returnInSub = false ;
      AV41Pref = httpContext.getMessage( "N", "") ;
      /* Using cursor P05MA11 */
      pr_default.execute(8, new Object[] {AV29emprcod, Integer.valueOf(AV26barcod), Byte.valueOf(AV27barcodreo), AV28barcodpar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A457FasCod = P05MA11_A457FasCod[0] ;
         A130BarCodPar = P05MA11_A130BarCodPar[0] ;
         A132BarCodReo = P05MA11_A132BarCodReo[0] ;
         A129BarCod = P05MA11_A129BarCod[0] ;
         A396EmprCod = P05MA11_A396EmprCod[0] ;
         A153BarFasEst = P05MA11_A153BarFasEst[0] ;
         A194BarOrdLin = P05MA11_A194BarOrdLin[0] ;
         A758ProCod = P05MA11_A758ProCod[0] ;
         AV41Pref = httpContext.getMessage( "N", "") ;
         if ( A153BarFasEst == 2 )
         {
            AV41Pref = httpContext.getMessage( "S", "") ;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pfocus04.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apfocus04");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV43UsurCod = "" ;
      AV44Station = "" ;
      AV29emprcod = "" ;
      AV45EmprNom = "" ;
      AV8Carpeta = "" ;
      AV14Hhmmss = GXutil.resetTime( GXutil.nullDate() );
      AV17NomInf = "" ;
      AV11File = "" ;
      AV9Control = "" ;
      AV25FecAct = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P05MA3_A396EmprCod = new String[] {""} ;
      P05MA3_A130BarCodPar = new String[] {""} ;
      P05MA3_A132BarCodReo = new byte[1] ;
      P05MA3_A129BarCod = new int[1] ;
      P05MA3_A213BarSit = new byte[1] ;
      P05MA3_A11850Nxt_Mdlo2 = new String[] {""} ;
      P05MA3_A3787BarEnvRec = new String[] {""} ;
      P05MA3_n3787BarEnvRec = new boolean[] {false} ;
      P05MA3_A252CliCod = new int[1] ;
      P05MA3_n252CliCod = new boolean[] {false} ;
      P05MA3_A212BarSer = new String[] {""} ;
      P05MA3_A135BarColNom = new String[] {""} ;
      P05MA3_A136BarColNum = new int[1] ;
      P05MA3_A218BarTipCol = new byte[1] ;
      P05MA3_A279CliNom = new String[] {""} ;
      P05MA3_A192BarNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MA3_A217BarTipArt = new short[1] ;
      P05MA3_n217BarTipArt = new boolean[] {false} ;
      P05MA3_A180BarMaqCod = new String[] {""} ;
      P05MA3_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P05MA3_A3870BarFecLRe = new java.util.Date[] {GXutil.nullDate()} ;
      P05MA3_A1234BarNomCli = new String[] {""} ;
      P05MA3_A4812BarEncCli = new String[] {""} ;
      P05MA3_A120BarAgrEst = new String[] {""} ;
      P05MA3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MA3_A199BarPie1 = new short[1] ;
      P05MA3_A365DisDes = new String[] {""} ;
      P05MA3_A898BarPieNDes = new int[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A11850Nxt_Mdlo2 = "" ;
      A3787BarEnvRec = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A279CliNom = "" ;
      A192BarNumUni = DecimalUtil.ZERO ;
      A180BarMaqCod = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A3870BarFecLRe = GXutil.nullDate() ;
      A1234BarNomCli = "" ;
      A4812BarEncCli = "" ;
      A120BarAgrEst = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV28barcodpar = "" ;
      AV47Barser = "" ;
      GXv_int6 = new long[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new byte[1] ;
      AV32Tipo = "" ;
      AV33Destino = "" ;
      AV36canttotal = DecimalUtil.ZERO ;
      AV37Cantpdte = DecimalUtil.ZERO ;
      AV48Fascodarealizar = "" ;
      AV35TipArtDsc = "" ;
      AV38MaqDsc = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      AV39HdrAgrupadas = "" ;
      P05MA4_A396EmprCod = new String[] {""} ;
      P05MA4_A129BarCod = new int[1] ;
      P05MA4_A132BarCodReo = new byte[1] ;
      P05MA4_A130BarCodPar = new String[] {""} ;
      P05MA4_A122BarAgrPar = new String[] {""} ;
      P05MA4_A124BarAgrReo = new byte[1] ;
      P05MA4_A119BarAgrCod = new int[1] ;
      A122BarAgrPar = "" ;
      AV40AlbRLoc = "" ;
      P05MA5_A44AlbRecCod = new int[1] ;
      P05MA5_A396EmprCod = new String[] {""} ;
      P05MA5_A129BarCod = new int[1] ;
      P05MA5_A132BarCodReo = new byte[1] ;
      P05MA5_A130BarCodPar = new String[] {""} ;
      P05MA5_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MA5_A50AlbRLoc = new String[] {""} ;
      P05MA5_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      A200BarPieCod = "" ;
      AV52BarFecfpralfa = "" ;
      AV54BarFecLRealfa = "" ;
      AV55Fechaalfa = "" ;
      AV56Familiaproduccion = "" ;
      P05MA6_A396EmprCod = new String[] {""} ;
      P05MA6_A129BarCod = new int[1] ;
      P05MA6_A132BarCodReo = new byte[1] ;
      P05MA6_A130BarCodPar = new String[] {""} ;
      P05MA6_A457FasCod = new String[] {""} ;
      P05MA6_A758ProCod = new String[] {""} ;
      P05MA6_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV49ArticuloColor = "" ;
      AV41Pref = "" ;
      GXv_int11 = new byte[1] ;
      P05MA8_A65ArtCod = new String[] {""} ;
      P05MA8_A252CliCod = new int[1] ;
      P05MA8_n252CliCod = new boolean[] {false} ;
      P05MA8_A396EmprCod = new String[] {""} ;
      P05MA8_A4295ClasCod = new short[1] ;
      P05MA8_n4295ClasCod = new boolean[] {false} ;
      A65ArtCod = "" ;
      P05MA9_A396EmprCod = new String[] {""} ;
      P05MA9_A129BarCod = new int[1] ;
      P05MA9_A132BarCodReo = new byte[1] ;
      P05MA9_A130BarCodPar = new String[] {""} ;
      P05MA9_A152BarFasCon = new String[] {""} ;
      P05MA9_A153BarFasEst = new byte[1] ;
      P05MA9_A194BarOrdLin = new short[1] ;
      P05MA9_A758ProCod = new String[] {""} ;
      A152BarFasCon = "" ;
      P05MA10_A153BarFasEst = new byte[1] ;
      P05MA10_A152BarFasCon = new String[] {""} ;
      P05MA10_A130BarCodPar = new String[] {""} ;
      P05MA10_A132BarCodReo = new byte[1] ;
      P05MA10_A129BarCod = new int[1] ;
      P05MA10_A396EmprCod = new String[] {""} ;
      P05MA10_A457FasCod = new String[] {""} ;
      P05MA10_A194BarOrdLin = new short[1] ;
      P05MA10_A758ProCod = new String[] {""} ;
      P05MA11_A457FasCod = new String[] {""} ;
      P05MA11_A130BarCodPar = new String[] {""} ;
      P05MA11_A132BarCodReo = new byte[1] ;
      P05MA11_A129BarCod = new int[1] ;
      P05MA11_A396EmprCod = new String[] {""} ;
      P05MA11_A153BarFasEst = new byte[1] ;
      P05MA11_A194BarOrdLin = new short[1] ;
      P05MA11_A758ProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apfocus04__default(),
         new Object[] {
             new Object[] {
            P05MA3_A396EmprCod, P05MA3_A130BarCodPar, P05MA3_A132BarCodReo, P05MA3_A129BarCod, P05MA3_A213BarSit, P05MA3_A11850Nxt_Mdlo2, P05MA3_A3787BarEnvRec, P05MA3_n3787BarEnvRec, P05MA3_A252CliCod, P05MA3_n252CliCod,
            P05MA3_A212BarSer, P05MA3_A135BarColNom, P05MA3_A136BarColNum, P05MA3_A218BarTipCol, P05MA3_A279CliNom, P05MA3_A192BarNumUni, P05MA3_A217BarTipArt, P05MA3_n217BarTipArt, P05MA3_A180BarMaqCod, P05MA3_A158BarFecFpr,
            P05MA3_A3870BarFecLRe, P05MA3_A1234BarNomCli, P05MA3_A4812BarEncCli, P05MA3_A120BarAgrEst, P05MA3_A166BarKgm, P05MA3_A199BarPie1, P05MA3_A365DisDes, P05MA3_A898BarPieNDes
            }
            , new Object[] {
            P05MA4_A396EmprCod, P05MA4_A129BarCod, P05MA4_A132BarCodReo, P05MA4_A130BarCodPar, P05MA4_A122BarAgrPar, P05MA4_A124BarAgrReo, P05MA4_A119BarAgrCod
            }
            , new Object[] {
            P05MA5_A44AlbRecCod, P05MA5_A396EmprCod, P05MA5_A129BarCod, P05MA5_A132BarCodReo, P05MA5_A130BarCodPar, P05MA5_A203BarPieKil, P05MA5_A50AlbRLoc, P05MA5_A200BarPieCod
            }
            , new Object[] {
            P05MA6_A396EmprCod, P05MA6_A129BarCod, P05MA6_A132BarCodReo, P05MA6_A130BarCodPar, P05MA6_A457FasCod, P05MA6_A758ProCod, P05MA6_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            P05MA8_A65ArtCod, P05MA8_A252CliCod, P05MA8_A396EmprCod, P05MA8_A4295ClasCod, P05MA8_n4295ClasCod
            }
            , new Object[] {
            P05MA9_A396EmprCod, P05MA9_A129BarCod, P05MA9_A132BarCodReo, P05MA9_A130BarCodPar, P05MA9_A152BarFasCon, P05MA9_A153BarFasEst, P05MA9_A194BarOrdLin, P05MA9_A758ProCod
            }
            , new Object[] {
            P05MA10_A153BarFasEst, P05MA10_A152BarFasCon, P05MA10_A130BarCodPar, P05MA10_A132BarCodReo, P05MA10_A129BarCod, P05MA10_A396EmprCod, P05MA10_A457FasCod, P05MA10_A194BarOrdLin, P05MA10_A758ProCod
            }
            , new Object[] {
            P05MA11_A457FasCod, P05MA11_A130BarCodPar, P05MA11_A132BarCodReo, P05MA11_A129BarCod, P05MA11_A396EmprCod, P05MA11_A153BarFasEst, P05MA11_A194BarOrdLin, P05MA11_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22Stat ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV27barcodreo ;
   private byte AV30BarFasest ;
   private byte GXv_int8[] ;
   private byte AV31Formt ;
   private byte A124BarAgrReo ;
   private byte GXt_int7 ;
   private byte GXv_int11[] ;
   private byte A153BarFasEst ;
   private short A217BarTipArt ;
   private short A199BarPie1 ;
   private short AV53anyo ;
   private short A194BarOrdLin ;
   private short AV34Clascod ;
   private short A4295ClasCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV26barcod ;
   private int AV46clicod ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private int A119BarAgrCod ;
   private int A44AlbRecCod ;
   private long AV15hnd ;
   private long GXt_int5 ;
   private long AV42nhdrs ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A192BarNumUni ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV36canttotal ;
   private java.math.BigDecimal AV37Cantpdte ;
   private java.math.BigDecimal A203BarPieKil ;
   private String AV43UsurCod ;
   private String AV44Station ;
   private String AV29emprcod ;
   private String AV45EmprNom ;
   private String AV8Carpeta ;
   private String AV17NomInf ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A11850Nxt_Mdlo2 ;
   private String A3787BarEnvRec ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A279CliNom ;
   private String A180BarMaqCod ;
   private String A1234BarNomCli ;
   private String A4812BarEncCli ;
   private String A120BarAgrEst ;
   private String A365DisDes ;
   private String AV28barcodpar ;
   private String AV47Barser ;
   private String AV32Tipo ;
   private String AV33Destino ;
   private String AV48Fascodarealizar ;
   private String AV35TipArtDsc ;
   private String AV38MaqDsc ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV39HdrAgrupadas ;
   private String A122BarAgrPar ;
   private String AV40AlbRLoc ;
   private String A50AlbRLoc ;
   private String A200BarPieCod ;
   private String AV52BarFecfpralfa ;
   private String AV54BarFecLRealfa ;
   private String AV55Fechaalfa ;
   private String AV56Familiaproduccion ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV49ArticuloColor ;
   private String AV41Pref ;
   private String A65ArtCod ;
   private String A152BarFasCon ;
   private java.util.Date AV14Hhmmss ;
   private java.util.Date AV25FecAct ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A3870BarFecLRe ;
   private boolean n3787BarEnvRec ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private boolean n4295ClasCod ;
   private String AV11File ;
   private String AV9Control ;
   private IDataStoreProvider pr_default ;
   private String[] P05MA3_A396EmprCod ;
   private String[] P05MA3_A130BarCodPar ;
   private byte[] P05MA3_A132BarCodReo ;
   private int[] P05MA3_A129BarCod ;
   private byte[] P05MA3_A213BarSit ;
   private String[] P05MA3_A11850Nxt_Mdlo2 ;
   private String[] P05MA3_A3787BarEnvRec ;
   private boolean[] P05MA3_n3787BarEnvRec ;
   private int[] P05MA3_A252CliCod ;
   private boolean[] P05MA3_n252CliCod ;
   private String[] P05MA3_A212BarSer ;
   private String[] P05MA3_A135BarColNom ;
   private int[] P05MA3_A136BarColNum ;
   private byte[] P05MA3_A218BarTipCol ;
   private String[] P05MA3_A279CliNom ;
   private java.math.BigDecimal[] P05MA3_A192BarNumUni ;
   private short[] P05MA3_A217BarTipArt ;
   private boolean[] P05MA3_n217BarTipArt ;
   private String[] P05MA3_A180BarMaqCod ;
   private java.util.Date[] P05MA3_A158BarFecFpr ;
   private java.util.Date[] P05MA3_A3870BarFecLRe ;
   private String[] P05MA3_A1234BarNomCli ;
   private String[] P05MA3_A4812BarEncCli ;
   private String[] P05MA3_A120BarAgrEst ;
   private java.math.BigDecimal[] P05MA3_A166BarKgm ;
   private short[] P05MA3_A199BarPie1 ;
   private String[] P05MA3_A365DisDes ;
   private int[] P05MA3_A898BarPieNDes ;
   private String[] P05MA4_A396EmprCod ;
   private int[] P05MA4_A129BarCod ;
   private byte[] P05MA4_A132BarCodReo ;
   private String[] P05MA4_A130BarCodPar ;
   private String[] P05MA4_A122BarAgrPar ;
   private byte[] P05MA4_A124BarAgrReo ;
   private int[] P05MA4_A119BarAgrCod ;
   private int[] P05MA5_A44AlbRecCod ;
   private String[] P05MA5_A396EmprCod ;
   private int[] P05MA5_A129BarCod ;
   private byte[] P05MA5_A132BarCodReo ;
   private String[] P05MA5_A130BarCodPar ;
   private java.math.BigDecimal[] P05MA5_A203BarPieKil ;
   private String[] P05MA5_A50AlbRLoc ;
   private String[] P05MA5_A200BarPieCod ;
   private String[] P05MA6_A396EmprCod ;
   private int[] P05MA6_A129BarCod ;
   private byte[] P05MA6_A132BarCodReo ;
   private String[] P05MA6_A130BarCodPar ;
   private String[] P05MA6_A457FasCod ;
   private String[] P05MA6_A758ProCod ;
   private short[] P05MA6_A194BarOrdLin ;
   private String[] P05MA8_A65ArtCod ;
   private int[] P05MA8_A252CliCod ;
   private boolean[] P05MA8_n252CliCod ;
   private String[] P05MA8_A396EmprCod ;
   private short[] P05MA8_A4295ClasCod ;
   private boolean[] P05MA8_n4295ClasCod ;
   private String[] P05MA9_A396EmprCod ;
   private int[] P05MA9_A129BarCod ;
   private byte[] P05MA9_A132BarCodReo ;
   private String[] P05MA9_A130BarCodPar ;
   private String[] P05MA9_A152BarFasCon ;
   private byte[] P05MA9_A153BarFasEst ;
   private short[] P05MA9_A194BarOrdLin ;
   private String[] P05MA9_A758ProCod ;
   private byte[] P05MA10_A153BarFasEst ;
   private String[] P05MA10_A152BarFasCon ;
   private String[] P05MA10_A130BarCodPar ;
   private byte[] P05MA10_A132BarCodReo ;
   private int[] P05MA10_A129BarCod ;
   private String[] P05MA10_A396EmprCod ;
   private String[] P05MA10_A457FasCod ;
   private short[] P05MA10_A194BarOrdLin ;
   private String[] P05MA10_A758ProCod ;
   private String[] P05MA11_A457FasCod ;
   private String[] P05MA11_A130BarCodPar ;
   private byte[] P05MA11_A132BarCodReo ;
   private int[] P05MA11_A129BarCod ;
   private String[] P05MA11_A396EmprCod ;
   private byte[] P05MA11_A153BarFasEst ;
   private short[] P05MA11_A194BarOrdLin ;
   private String[] P05MA11_A758ProCod ;
}

final  class apfocus04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05MA3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSit, T1.Nxt_Mdlo2, T1.BarEnvRec, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T3.CliNom, T1.BarNumUni, T1.BarTipArt, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecLRe, T1.BarNomCli, T1.BarEncCli, T1.BarAgrEst, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE (T1.EmprCod = ?) AND (T1.BarSit < 6) ORDER BY T1.EmprCod, T1.BarSit, T1.BarEnvRec ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MA4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MA5", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieKil, T2.AlbRLoc, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MA6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05MA7", "UPDATE TXPBARCAD SET Nxt_Mdlo2=?, BarEnvRec=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P05MA8", "SELECT ArtCod, CliCod, EmprCod, ClasCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05MA9", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasCon, BarFasEst, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MA10", "SELECT BarFasEst, BarFasCon, BarCodPar, BarCodReo, BarCod, EmprCod, FasCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst < 2) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MA11", "SELECT FasCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarFasEst, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = '300101  ') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 30);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(16, 6);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(17);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 13);
               ((String[]) buf[22])[0] = rslt.getString(20, 20);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,2);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 30);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

