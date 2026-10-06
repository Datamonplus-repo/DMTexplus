package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class resumendatospedido_impl extends GXWebReport
{
   public resumendatospedido_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV13ContextoDISPOS = "RegistrarDISPOS" ;
         GXt_char1 = AV27Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         resumendatospedido_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Station = GXt_char1 ;
         GXv_char2[0] = AV19EmprCod ;
         GXv_char3[0] = AV20EmprNom ;
         GXv_char4[0] = AV28UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
         resumendatospedido_impl.this.AV19EmprCod = GXv_char2[0] ;
         resumendatospedido_impl.this.AV20EmprNom = GXv_char3[0] ;
         resumendatospedido_impl.this.AV28UsurCod = GXv_char4[0] ;
         AV12Contexto = "CapturaDatosPedidosCliente" ;
         AV15DatosPedidoJSON = AV11WebSession.getValue(AV12Contexto) ;
         AV26SdtEnCabezadoPedido.fromJSonString(AV15DatosPedidoJSON, null);
         AV24SdtArticuloPedidos = AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Articulopedido() ;
         GXt_char1 = AV29CadenaTexto ;
         GXv_char4[0] = GXt_char1 ;
         new app.pclinom(remoteHandle, context).execute( AV19EmprCod, AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod(), GXv_char4) ;
         resumendatospedido_impl.this.GXt_char1 = GXv_char4[0] ;
         AV29CadenaTexto = "Cliente " + GXutil.str( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod(), 6, 0) + " - " + GXt_char1 ;
         AV29CadenaTexto = GXutil.trim( AV29CadenaTexto) + " Pedido Cliente " + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disenccli()) ;
         h8870( false, 17) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CadenaTexto, "")), 50, Gx_line+0, 572, Gx_line+15, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV29CadenaTexto = "Fecha Disposicion " + localUtil.dtoc( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfec(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         AV29CadenaTexto += " Fec Cliente " + localUtil.dtoc( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfeccli(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         AV29CadenaTexto += " Entrega " + localUtil.dtoc( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfecent(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         AV29CadenaTexto += " Reclamacion? " + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Albrreo()) ;
         AV29CadenaTexto += " Muestras? " + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Displa()) ;
         h8870( false, 17) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CadenaTexto, "")), 50, Gx_line+0, 572, Gx_line+15, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV29CadenaTexto = "Color" + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnom()) ;
         AV29CadenaTexto += " N° Color" + GXutil.str( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnum(), 6, 0) ;
         AV29CadenaTexto += " Tipo Colorante" + GXutil.str( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Distipcol(), 2, 0) ;
         AV29CadenaTexto += " Colección" + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disobs()) ;
         AV29CadenaTexto += " Nombre Col Cliente" + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnomcli()) ;
         AV29CadenaTexto += " N° Col Cliente" + GXutil.str( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnumcli(), 6, 0) ;
         h8870( false, 17) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CadenaTexto, "")), 50, Gx_line+0, 572, Gx_line+15, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV29CadenaTexto = "Clear to Wear" + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Cod_idtx()) ;
         AV29CadenaTexto += " Subst Restritas na Fabric?" + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_modelo()) ;
         AV29CadenaTexto += " Relat Anal. da Compo da Malha?" + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_statio()) ;
         h8870( false, 17) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CadenaTexto, "")), 50, Gx_line+0, 572, Gx_line+15, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV29CadenaTexto = "Exportación " + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disexp()) ;
         AV29CadenaTexto += " Enc Cliente " + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_artcli()) ;
         AV29CadenaTexto += " N° Pedido Cliente " + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disitem3()) ;
         AV29CadenaTexto += " N° Partida " + GXutil.str( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Dispart(), 4, 0) ;
         AV29CadenaTexto += " Gots? " + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst01()) ;
         AV29CadenaTexto += " Ogs? " + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst02()) ;
         AV29CadenaTexto += " Rgs? " + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst03()) ;
         h8870( false, 17) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CadenaTexto, "")), 50, Gx_line+0, 572, Gx_line+15, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV29CadenaTexto = "Procedencia" + GXutil.str( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Procecod(), 4, 0) ;
         AV29CadenaTexto += " P.O." + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disordcomp()) ;
         AV29CadenaTexto += " No conforme?" + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disrec()) ;
         if ( GXutil.strcmp(AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disrec(), "S") == 0 )
         {
            AV29CadenaTexto += " Motivo No Conforme" + GXutil.trim( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disdest()) ;
         }
         h8870( false, 17) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CadenaTexto, "")), 50, Gx_line+0, 572, Gx_line+15, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         if ( ! (GXutil.strcmp("", AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Observaciones())==0) )
         {
            AV29CadenaTexto = " ********** OBSERVACIONES **********" ;
            h8870( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CadenaTexto, "")), 50, Gx_line+0, 572, Gx_line+15, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV18DisObsULin = (byte)(GXutil.gxmlines( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Observaciones(), (short)(60))) ;
            if ( AV18DisObsULin > 9 )
            {
               AV18DisObsULin = (byte)(9) ;
            }
            AV21K = (short)(1) ;
            while ( AV21K <= AV18DisObsULin )
            {
               AV17DisObsTxt = GXutil.gxgetmli( AV26SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Observaciones(), AV21K, (short)(60)) ;
               h8870( false, 19) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17DisObsTxt, "")), 140, Gx_line+0, 640, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21K), "ZZZ9")), 100, Gx_line+0, 126, Gx_line+17, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               AV21K = (short)(AV21K+1) ;
            }
         }
         if ( AV24SdtArticuloPedidos.size() > 0 )
         {
            AV29CadenaTexto = " ********** ARTICULOS **********" ;
            h8870( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CadenaTexto, "")), 50, Gx_line+0, 572, Gx_line+15, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV32GXV1 = 1 ;
            while ( AV32GXV1 <= AV24SdtArticuloPedidos.size() )
            {
               AV23SdtArticuloPedido = (app.SdtSdtArticuloPedido)((app.SdtSdtArticuloPedido)AV24SdtArticuloPedidos.elementAt(-1+AV32GXV1));
               AV29CadenaTexto = "Articulo " + GXutil.trim( AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disartcod()) + " - " + GXutil.trim( AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Artdsc()) ;
               AV29CadenaTexto += " Proceso " + GXutil.trim( AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Procod()) + " - " + GXutil.trim( AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Prodsc()) ;
               h8870( false, 17) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CadenaTexto, "")), 50, Gx_line+0, 572, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV29CadenaTexto = "          Piezas " + GXutil.str( AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disnumpie(), 4, 0) ;
               AV29CadenaTexto += " Kg " + GXutil.str( AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Kilos(), 9, 2) ;
               AV29CadenaTexto += " Mt " + GXutil.str( AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Metros(), 9, 2) ;
               AV29CadenaTexto += " Ancho(cm) " + GXutil.str( AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disartanh(), 3, 0) ;
               AV29CadenaTexto += " Grm2 " + GXutil.str( AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disgraaca(), 4, 0) ;
               h8870( false, 17) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CadenaTexto, "")), 50, Gx_line+0, 572, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               if ( AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Fases().size() > 0 )
               {
                  AV33GXV2 = 1 ;
                  while ( AV33GXV2 <= AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Fases().size() )
                  {
                     AV8SdtFasePedido = (app.SdtSdtFasePedido)((app.SdtSdtFasePedido)AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Fases().elementAt(-1+AV33GXV2));
                     AV29CadenaTexto = "N° " + GXutil.str( AV8SdtFasePedido.getgxTv_SdtSdtFasePedido_Disfaslin(), 4, 0) ;
                     AV29CadenaTexto += " Fase " + GXutil.trim( AV8SdtFasePedido.getgxTv_SdtSdtFasePedido_Fascod()) + " - " + GXutil.trim( AV8SdtFasePedido.getgxTv_SdtSdtFasePedido_Fasdsc()) ;
                     h8870( false, 17) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CadenaTexto, "")), 100, Gx_line+0, 622, Gx_line+15, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                     AV33GXV2 = (int)(AV33GXV2+1) ;
                  }
               }
               if ( AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Consultaalmacen().size() > 0 )
               {
                  AV34GXV3 = 1 ;
                  while ( AV34GXV3 <= AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Consultaalmacen().size() )
                  {
                     AV10SdtRecepcionPedido = (app.SdtSdtRecepcionPedido)((app.SdtSdtRecepcionPedido)AV23SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Consultaalmacen().elementAt(-1+AV34GXV3));
                     if ( AV10SdtRecepcionPedido.getgxTv_SdtSdtRecepcionPedido_Detalle().size() > 0 )
                     {
                        AV35GXV4 = 1 ;
                        while ( AV35GXV4 <= AV10SdtRecepcionPedido.getgxTv_SdtSdtRecepcionPedido_Detalle().size() )
                        {
                           AV9SdtPiezasPedido = (app.SdtSdtPiezasPedido)((app.SdtSdtPiezasPedido)AV10SdtRecepcionPedido.getgxTv_SdtSdtRecepcionPedido_Detalle().elementAt(-1+AV35GXV4));
                           AV35GXV4 = (int)(AV35GXV4+1) ;
                        }
                     }
                     AV34GXV3 = (int)(AV34GXV3+1) ;
                  }
               }
               AV32GXV1 = (int)(AV32GXV1+1) ;
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h8870( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void h8870( boolean bFoot ,
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV13ContextoDISPOS = "" ;
      AV27Station = "" ;
      AV19EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV20EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV28UsurCod = "" ;
      AV12Contexto = "" ;
      AV15DatosPedidoJSON = "" ;
      AV11WebSession = httpContext.getWebSession();
      AV26SdtEnCabezadoPedido = new app.SdtSdtEncabezadoPedido(remoteHandle, context);
      AV24SdtArticuloPedidos = new GXBaseCollection<app.SdtSdtArticuloPedido>(app.SdtSdtArticuloPedido.class, "SdtArticuloPedido", "TexplusNET", remoteHandle);
      AV29CadenaTexto = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV17DisObsTxt = "" ;
      AV23SdtArticuloPedido = new app.SdtSdtArticuloPedido(remoteHandle, context);
      AV8SdtFasePedido = new app.SdtSdtFasePedido(remoteHandle, context);
      AV10SdtRecepcionPedido = new app.SdtSdtRecepcionPedido(remoteHandle, context);
      AV9SdtPiezasPedido = new app.SdtSdtPiezasPedido(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV18DisObsULin ;
   private short gxcookieaux ;
   private short AV21K ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV32GXV1 ;
   private int AV33GXV2 ;
   private int AV34GXV3 ;
   private int AV35GXV4 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV27Station ;
   private String AV19EmprCod ;
   private String GXv_char2[] ;
   private String AV20EmprNom ;
   private String GXv_char3[] ;
   private String AV28UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private String AV13ContextoDISPOS ;
   private String AV12Contexto ;
   private String AV15DatosPedidoJSON ;
   private String AV29CadenaTexto ;
   private String AV17DisObsTxt ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private GXBaseCollection<app.SdtSdtArticuloPedido> AV24SdtArticuloPedidos ;
   private app.SdtSdtFasePedido AV8SdtFasePedido ;
   private app.SdtSdtPiezasPedido AV9SdtPiezasPedido ;
   private app.SdtSdtRecepcionPedido AV10SdtRecepcionPedido ;
   private app.SdtSdtArticuloPedido AV23SdtArticuloPedido ;
   private app.SdtSdtEncabezadoPedido AV26SdtEnCabezadoPedido ;
}

