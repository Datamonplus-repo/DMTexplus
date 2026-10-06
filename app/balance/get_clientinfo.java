package app.balance ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_clientinfo extends GXProcedure
{
   public get_clientinfo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_clientinfo.class ), "" );
   }

   public get_clientinfo( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 )
   {
      get_clientinfo.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      get_clientinfo.this.AV216EmprCod = aP0;
      get_clientinfo.this.AV29BarCod = aP1;
      get_clientinfo.this.AV31BarCodReo = aP2;
      get_clientinfo.this.AV30BarCodPar = aP3;
      get_clientinfo.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV375PesSim ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV216EmprCod, httpContext.getMessage( "PESSIM", ""), GXv_int2) ;
      get_clientinfo.this.GXt_int1 = GXv_int2[0] ;
      AV375PesSim = GXt_int1 ;
      GXt_int1 = AV354NoEtiquet ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV216EmprCod, httpContext.getMessage( "NOETIQ", ""), GXv_int2) ;
      get_clientinfo.this.GXt_int1 = GXv_int2[0] ;
      AV354NoEtiquet = GXt_int1 ;
      GXt_int1 = AV264Datamon ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV216EmprCod, httpContext.getMessage( "DATAMO", ""), GXv_int2) ;
      get_clientinfo.this.GXt_int1 = GXv_int2[0] ;
      AV264Datamon = GXt_int1 ;
      GXt_int1 = AV286FlagMfR ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV216EmprCod, httpContext.getMessage( "MTSRDO", ""), GXv_int2) ;
      get_clientinfo.this.GXt_int1 = GXv_int2[0] ;
      AV286FlagMfR = GXt_int1 ;
      GXt_int1 = AV285FlagGm2 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV216EmprCod, httpContext.getMessage( "MTSGM2", ""), GXv_int2) ;
      get_clientinfo.this.GXt_int1 = GXv_int2[0] ;
      AV285FlagGm2 = GXt_int1 ;
      GXt_int1 = AV390Tinamar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV216EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int2) ;
      get_clientinfo.this.GXt_int1 = GXv_int2[0] ;
      AV390Tinamar = GXt_int1 ;
      GXt_int1 = AV277Etm ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV216EmprCod, httpContext.getMessage( "ETM", ""), GXv_int2) ;
      get_clientinfo.this.GXt_int1 = GXv_int2[0] ;
      AV277Etm = GXt_int1 ;
      GXt_int1 = AV253Carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV216EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      get_clientinfo.this.GXt_int1 = GXv_int2[0] ;
      AV253Carvema = GXt_int1 ;
      GXt_int1 = AV341Moda21 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV216EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      get_clientinfo.this.GXt_int1 = GXv_int2[0] ;
      AV341Moda21 = GXt_int1 ;
      GXt_int1 = AV362NumPzsFs ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV216EmprCod, httpContext.getMessage( "NPFF", ""), GXv_int2) ;
      get_clientinfo.this.GXt_int1 = GXv_int2[0] ;
      AV362NumPzsFs = GXt_int1 ;
      GXt_int1 = AV363NumPzsFs2 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV216EmprCod, httpContext.getMessage( "NPFF2", ""), GXv_int2) ;
      get_clientinfo.this.GXt_int1 = GXv_int2[0] ;
      AV363NumPzsFs2 = GXt_int1 ;
      GXt_int1 = AV276Eticvg ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV216EmprCod, httpContext.getMessage( "ETICVG", ""), GXv_int2) ;
      get_clientinfo.this.GXt_int1 = GXv_int2[0] ;
      AV276Eticvg = GXt_int1 ;
      GXt_int3 = AV392TopeK ;
      GXv_char4[0] = AV216EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "TOPEKG", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      get_clientinfo.this.AV216EmprCod = GXv_char4[0] ;
      get_clientinfo.this.GXt_int3 = GXv_int6[0] ;
      AV392TopeK = (short)(GXt_int3) ;
      GXt_int3 = AV393TopeM ;
      GXv_char5[0] = AV216EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "TOPEMT", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int6) ;
      get_clientinfo.this.AV216EmprCod = GXv_char5[0] ;
      get_clientinfo.this.GXt_int3 = GXv_int6[0] ;
      AV393TopeM = (short)(GXt_int3) ;
      GXt_int3 = AV227AutMan ;
      GXv_char5[0] = AV216EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "AUTMAN", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int6) ;
      get_clientinfo.this.AV216EmprCod = GXv_char5[0] ;
      get_clientinfo.this.GXt_int3 = GXv_int6[0] ;
      AV227AutMan = (byte)(GXt_int3) ;
      AV414GXLvl20 = (byte)(0) ;
      /* Using cursor P0AVP3 */
      pr_default.execute(0, new Object[] {AV216EmprCod, Integer.valueOf(AV29BarCod), Byte.valueOf(AV31BarCodReo), AV30BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P0AVP3_A361DisCod[0] ;
         A396EmprCod = P0AVP3_A396EmprCod[0] ;
         A130BarCodPar = P0AVP3_A130BarCodPar[0] ;
         A132BarCodReo = P0AVP3_A132BarCodReo[0] ;
         A129BarCod = P0AVP3_A129BarCod[0] ;
         A125BarAncAca1 = P0AVP3_A125BarAncAca1[0] ;
         A212BarSer = P0AVP3_A212BarSer[0] ;
         A1652BarSerDsc = P0AVP3_A1652BarSerDsc[0] ;
         A135BarColNom = P0AVP3_A135BarColNom[0] ;
         A136BarColNum = P0AVP3_A136BarColNum[0] ;
         A252CliCod = P0AVP3_A252CliCod[0] ;
         n252CliCod = P0AVP3_n252CliCod[0] ;
         A279CliNom = P0AVP3_A279CliNom[0] ;
         A228BarUniMed = P0AVP3_A228BarUniMed[0] ;
         A211BarRdt = P0AVP3_A211BarRdt[0] ;
         A864BarPes = P0AVP3_A864BarPes[0] ;
         A1909BarGraAca = P0AVP3_A1909BarGraAca[0] ;
         A184BarMtr = P0AVP3_A184BarMtr[0] ;
         A166BarKgm = P0AVP3_A166BarKgm[0] ;
         A199BarPie1 = P0AVP3_A199BarPie1[0] ;
         A365DisDes = P0AVP3_A365DisDes[0] ;
         A898BarPieNDes = P0AVP3_A898BarPieNDes[0] ;
         A184BarMtr = P0AVP3_A184BarMtr[0] ;
         A166BarKgm = P0AVP3_A166BarKgm[0] ;
         A199BarPie1 = P0AVP3_A199BarPie1[0] ;
         A898BarPieNDes = P0AVP3_A898BarPieNDes[0] ;
         A279CliNom = P0AVP3_A279CliNom[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV414GXLvl20 = (byte)(1) ;
         AV28BarAncAca1 = A125BarAncAca1 ;
         AV37BarMtr = A184BarMtr ;
         AV211Barkgm = A166BarKgm ;
         AV47BarSer = A212BarSer ;
         AV48BarSerDsc = A1652BarSerDsc ;
         AV32BarColNom = A135BarColNom ;
         AV33BarColNum = A136BarColNum ;
         AV212CliCod = A252CliCod ;
         AV58CliNom = A279CliNom ;
         AV213BarPie = A198BarPie ;
         AV214Discod = A361DisCod ;
         AV215BarUnimed = A228BarUniMed ;
         AV404Uni = A228BarUniMed ;
         AV46BarRdt = A211BarRdt ;
         AV39Barpes = A864BarPes ;
         AV35BarGraAca = A1909BarGraAca ;
         /* Execute user subroutine: 'BARPIE' */
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
         AV94i = (byte)(1) ;
         /* Using cursor P0AVP4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A377DisObsTxt = P0AVP4_A377DisObsTxt[0] ;
            A376DisObsLin = P0AVP4_A376DisObsLin[0] ;
            if ( AV94i < 5 )
            {
               AV210Tab_obs = new GXSimpleCollection<String>(String.class, "internal", "") ;
               AV210Tab_obs.add(A377DisObsTxt, 0);
            }
            AV94i = (byte)(AV94i+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV217IsLoad = true ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV414GXLvl20 == 0 )
      {
         AV217IsLoad = false ;
      }
      if ( AV217IsLoad )
      {
         /* Execute user subroutine: 'LHIPRO' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV28BarAncAca1 == 0 )
         {
            AV218Ancho0 = AV220Cancho ;
            AV219Ancho = (short)(AV220Cancho/ (double) (100)) ;
         }
         else
         {
            AV218Ancho0 = AV28BarAncAca1 ;
            AV219Ancho = (short)(AV28BarAncAca1/ (double) (100)) ;
         }
         if ( AV35BarGraAca == 0 )
         {
            AV221Grm2 = AV222Cgrm2 ;
         }
         else
         {
            AV221Grm2 = AV35BarGraAca ;
         }
         AV8HTML = "" ;
         AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
         AV8HTML += httpContext.getMessage( "width:100%;", "") ;
         AV8HTML += httpContext.getMessage( "max-width:900px;", "") ;
         AV8HTML += httpContext.getMessage( "margin:12px auto;", "") ;
         AV8HTML += httpContext.getMessage( "font-family:Arial,Helvetica,sans-serif;", "") ;
         AV8HTML += httpContext.getMessage( "font-size:13px;", "") ;
         AV8HTML += httpContext.getMessage( "color:#263238;", "") ;
         AV8HTML += httpContext.getMessage( "background:#fff;", "") ;
         AV8HTML += httpContext.getMessage( "border:1px solid #dfe4e8;", "") ;
         AV8HTML += httpContext.getMessage( "border-radius:8px;", "") ;
         AV8HTML += httpContext.getMessage( "overflow:hidden;", "") ;
         AV8HTML += httpContext.getMessage( "box-shadow:0 2px 8px rgba(0,0,0,.06);", "") ;
         AV8HTML += "\">" ;
         AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
         AV8HTML += httpContext.getMessage( "display:flex;", "") ;
         AV8HTML += httpContext.getMessage( "justify-content:space-between;", "") ;
         AV8HTML += httpContext.getMessage( "align-items:center;", "") ;
         AV8HTML += httpContext.getMessage( "padding:10px 14px;", "") ;
         AV8HTML += httpContext.getMessage( "background:#6e090a;", "") ;
         AV8HTML += httpContext.getMessage( "color:#fff;", "") ;
         AV8HTML += "\">" ;
         AV8HTML += httpContext.getMessage( "<span style=\"font-size:15px;font-weight:bold;\">", "") ;
         AV8HTML += httpContext.getMessage( "Ordem de Serviço", "") ;
         AV8HTML += httpContext.getMessage( "</span>", "") ;
         AV8HTML += httpContext.getMessage( "<span style=\"", "") ;
         AV8HTML += httpContext.getMessage( "background:#fff;", "") ;
         AV8HTML += httpContext.getMessage( "color:#263f52;", "") ;
         AV8HTML += httpContext.getMessage( "padding:5px 10px;", "") ;
         AV8HTML += httpContext.getMessage( "border-radius:4px;", "") ;
         AV8HTML += httpContext.getMessage( "font-size:12px;", "") ;
         AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
         AV8HTML += "\">" ;
         AV8HTML += GXutil.trim( GXutil.str( AV31BarCodReo, 10, 0)) ;
         AV8HTML += httpContext.getMessage( "</span>", "") ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"padding:12px;\">", "") ;
         AV8HTML += httpContext.getMessage( "<table style=\"", "") ;
         AV8HTML += httpContext.getMessage( "width:100%;", "") ;
         AV8HTML += httpContext.getMessage( "border-collapse:separate;", "") ;
         AV8HTML += httpContext.getMessage( "border-spacing:6px;", "") ;
         AV8HTML += "\">" ;
         AV8HTML += httpContext.getMessage( "<tr>", "") ;
         AV8HTML += httpContext.getMessage( "<td style=\"", "") ;
         AV8HTML += httpContext.getMessage( "width:50%;", "") ;
         AV8HTML += httpContext.getMessage( "vertical-align:top;", "") ;
         AV8HTML += httpContext.getMessage( "border:1px solid #e1e5e8;", "") ;
         AV8HTML += httpContext.getMessage( "border-radius:6px;", "") ;
         AV8HTML += httpContext.getMessage( "padding:11px;", "") ;
         AV8HTML += httpContext.getMessage( "background:#fafbfc;", "") ;
         AV8HTML += "\">" ;
         AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
         AV8HTML += httpContext.getMessage( "font-size:10px;", "") ;
         AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
         AV8HTML += httpContext.getMessage( "color:#526675;", "") ;
         AV8HTML += httpContext.getMessage( "text-transform:uppercase;", "") ;
         AV8HTML += httpContext.getMessage( "margin-bottom:8px;", "") ;
         AV8HTML += httpContext.getMessage( "\">Identificação</div>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"margin-bottom:7px;\">", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"font-size:10px;font-weight:bold;color:#60727e;margin-bottom:2px;\">Cliente</div>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"background:#fff;border:1px solid #ccd4da;border-radius:4px;padding:6px 8px;\">", "") ;
         AV8HTML += GXutil.trim( AV58CliNom) ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"margin-bottom:7px;\">", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"font-size:10px;font-weight:bold;color:#60727e;margin-bottom:2px;\">Artigo</div>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"background:#fff;border:1px solid #ccd4da;border-radius:4px;padding:6px 8px;\">", "") ;
         AV8HTML += GXutil.trim( AV47BarSer) ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"margin-bottom:7px;\">", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"font-size:10px;font-weight:bold;color:#60727e;margin-bottom:2px;\">Cor</div>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"background:#fff;border:1px solid #ccd4da;border-radius:4px;padding:6px 8px;\">", "") ;
         AV8HTML += GXutil.trim( AV32BarColNom) ;
         if ( ! (0==AV33BarColNum) )
         {
            AV8HTML += httpContext.getMessage( " <span style=\"color:#78909c;\">(", "") ;
            AV8HTML += GXutil.trim( GXutil.str( AV33BarColNum, 6, 0)) ;
            AV8HTML += httpContext.getMessage( ")</span>", "") ;
         }
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "<div>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"font-size:10px;font-weight:bold;color:#60727e;margin-bottom:2px;\">Referência</div>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"background:#fff;border:1px solid #ccd4da;border-radius:4px;padding:6px 8px;\">", "") ;
         AV8HTML += GXutil.trim( AV48BarSerDsc) ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</td>", "") ;
         AV8HTML += httpContext.getMessage( "<td style=\"", "") ;
         AV8HTML += httpContext.getMessage( "width:50%;", "") ;
         AV8HTML += httpContext.getMessage( "vertical-align:top;", "") ;
         AV8HTML += httpContext.getMessage( "border:1px solid #e1e5e8;", "") ;
         AV8HTML += httpContext.getMessage( "border-radius:6px;", "") ;
         AV8HTML += httpContext.getMessage( "padding:11px;", "") ;
         AV8HTML += httpContext.getMessage( "background:#fafbfc;", "") ;
         AV8HTML += "\">" ;
         AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
         AV8HTML += httpContext.getMessage( "font-size:10px;", "") ;
         AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
         AV8HTML += httpContext.getMessage( "color:#526675;", "") ;
         AV8HTML += httpContext.getMessage( "text-transform:uppercase;", "") ;
         AV8HTML += httpContext.getMessage( "margin-bottom:8px;", "") ;
         AV8HTML += httpContext.getMessage( "\">Dados Técnicos</div>", "") ;
         AV8HTML += httpContext.getMessage( "<table style=\"width:100%;border-collapse:collapse;margin-bottom:7px;\">", "") ;
         AV8HTML += httpContext.getMessage( "<tr>", "") ;
         AV8HTML += httpContext.getMessage( "<td style=\"width:50%;padding-right:3px;\">", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"font-size:10px;font-weight:bold;color:#60727e;margin-bottom:2px;\">Grm²</div>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"background:#fff;border:1px solid #ccd4da;border-radius:4px;padding:6px 8px;\">", "") ;
         AV8HTML += GXutil.trim( GXutil.str( AV221Grm2, 10, 2)) ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</td>", "") ;
         AV8HTML += httpContext.getMessage( "<td style=\"width:50%;padding-left:3px;\">", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"font-size:10px;font-weight:bold;color:#60727e;margin-bottom:2px;\">Largura</div>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"background:#fff;border:1px solid #ccd4da;border-radius:4px;padding:6px 8px;\">", "") ;
         AV8HTML += GXutil.trim( GXutil.str( AV218Ancho0, 10, 2)) ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</td>", "") ;
         AV8HTML += httpContext.getMessage( "</tr>", "") ;
         AV8HTML += httpContext.getMessage( "</table>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"font-size:10px;font-weight:bold;color:#60727e;margin-bottom:2px;\">Quantidade</div>", "") ;
         AV8HTML += httpContext.getMessage( "<table style=\"width:100%;border-collapse:collapse;\">", "") ;
         AV8HTML += httpContext.getMessage( "<tr>", "") ;
         AV8HTML += httpContext.getMessage( "<td style=\"width:33.33%;padding-right:3px;\">", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"background:#fff;border:1px solid #ccd4da;border-radius:4px;padding:6px 7px;text-align:center;\">", "") ;
         AV8HTML += GXutil.trim( GXutil.str( AV100Kilos, 10, 2)) ;
         AV8HTML += httpContext.getMessage( "<span style=\"font-size:9px;color:#78909c;margin-left:3px;\">Kgs</span>", "") ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</td>", "") ;
         AV8HTML += httpContext.getMessage( "<td style=\"width:33.33%;padding:0 3px;\">", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"background:#fff;border:1px solid #ccd4da;border-radius:4px;padding:6px 7px;text-align:center;\">", "") ;
         AV8HTML += GXutil.trim( GXutil.str( AV139Metros, 10, 2)) ;
         AV8HTML += httpContext.getMessage( "<span style=\"font-size:9px;color:#78909c;margin-left:3px;\">Mts</span>", "") ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</td>", "") ;
         AV8HTML += httpContext.getMessage( "<td style=\"width:33.33%;padding-left:3px;\">", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"background:#fff;border:1px solid #ccd4da;border-radius:4px;padding:6px 7px;text-align:center;\">", "") ;
         AV8HTML += GXutil.trim( GXutil.str( AV155Nr, 10, 2)) ;
         AV8HTML += httpContext.getMessage( "<span style=\"font-size:9px;color:#78909c;margin-left:3px;\">Pzs</span>", "") ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</td>", "") ;
         AV8HTML += httpContext.getMessage( "</tr>", "") ;
         AV8HTML += httpContext.getMessage( "</table>", "") ;
         AV8HTML += httpContext.getMessage( "</td>", "") ;
         AV8HTML += httpContext.getMessage( "</tr>", "") ;
         AV8HTML += httpContext.getMessage( "<tr>", "") ;
         AV8HTML += httpContext.getMessage( "<td colspan=\"2\" style=\"", "") ;
         AV8HTML += httpContext.getMessage( "border:1px solid #e1e5e8;", "") ;
         AV8HTML += httpContext.getMessage( "border-radius:6px;", "") ;
         AV8HTML += httpContext.getMessage( "padding:10px;", "") ;
         AV8HTML += httpContext.getMessage( "background:#fafbfc;", "") ;
         AV8HTML += "\">" ;
         AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
         AV8HTML += httpContext.getMessage( "font-size:10px;", "") ;
         AV8HTML += httpContext.getMessage( "font-weight:bold;", "") ;
         AV8HTML += httpContext.getMessage( "color:#526675;", "") ;
         AV8HTML += httpContext.getMessage( "text-transform:uppercase;", "") ;
         AV8HTML += httpContext.getMessage( "margin-bottom:6px;", "") ;
         AV8HTML += httpContext.getMessage( "\">Observações / Composição</div>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
         AV8HTML += httpContext.getMessage( "background:#fff;", "") ;
         AV8HTML += httpContext.getMessage( "border:1px solid #ccd4da;", "") ;
         AV8HTML += httpContext.getMessage( "border-radius:4px;", "") ;
         AV8HTML += httpContext.getMessage( "padding:8px;", "") ;
         AV8HTML += httpContext.getMessage( "font-size:11px;", "") ;
         AV8HTML += httpContext.getMessage( "line-height:1.4;", "") ;
         AV8HTML += "\">" ;
         AV94i = (byte)(1) ;
         while ( AV94i <= AV210Tab_obs.size() )
         {
            if ( AV94i > 1 )
            {
               AV8HTML += httpContext.getMessage( "<br>", "") ;
            }
            AV8HTML += (String)AV210Tab_obs.elementAt(-1+AV94i) ;
            AV94i = (byte)(AV94i+1) ;
         }
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</td>", "") ;
         AV8HTML += httpContext.getMessage( "</tr>", "") ;
         AV8HTML += httpContext.getMessage( "</table>", "") ;
         AV8HTML += httpContext.getMessage( "<div style=\"", "") ;
         AV8HTML += httpContext.getMessage( "display:flex;", "") ;
         AV8HTML += httpContext.getMessage( "justify-content:flex-end;", "") ;
         AV8HTML += httpContext.getMessage( "border-top:1px solid #e5e8eb;", "") ;
         AV8HTML += httpContext.getMessage( "margin-top:6px;", "") ;
         AV8HTML += httpContext.getMessage( "padding-top:9px;", "") ;
         AV8HTML += "\">" ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
         AV8HTML += httpContext.getMessage( "</div>", "") ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BARPIE' Routine */
      returnInSub = false ;
      AV100Kilos = DecimalUtil.doubleToDec(0) ;
      AV139Metros = DecimalUtil.doubleToDec(0) ;
      AV181Recc = 0 ;
      AV155Nr = (short)(0) ;
      /* Using cursor P0AVP5 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV29BarCod), Byte.valueOf(AV31BarCodReo), AV30BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P0AVP5_A130BarCodPar[0] ;
         A132BarCodReo = P0AVP5_A132BarCodReo[0] ;
         A129BarCod = P0AVP5_A129BarCod[0] ;
         A203BarPieKil = P0AVP5_A203BarPieKil[0] ;
         A205BarPieMet = P0AVP5_A205BarPieMet[0] ;
         A44AlbRecCod = P0AVP5_A44AlbRecCod[0] ;
         A396EmprCod = P0AVP5_A396EmprCod[0] ;
         A200BarPieCod = P0AVP5_A200BarPieCod[0] ;
         if ( A44AlbRecCod != AV181Recc )
         {
            AV155Nr = (short)(AV155Nr+1) ;
         }
         AV100Kilos = AV100Kilos.add(A203BarPieKil) ;
         AV139Metros = AV139Metros.add(A205BarPieMet) ;
         AV181Recc = A44AlbRecCod ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'LHIPRO' Routine */
      returnInSub = false ;
      AV306Lhipro = (byte)(0) ;
      /* Using cursor P0AVP6 */
      pr_default.execute(3, new Object[] {AV216EmprCod, Integer.valueOf(AV411Barcada), Byte.valueOf(AV31BarCodReo), AV30BarCodPar, Short.valueOf(AV239barOrdlin), AV330MaqCod, AV305Lecfec});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = P0AVP6_A396EmprCod[0] ;
         A129BarCod = P0AVP6_A129BarCod[0] ;
         A132BarCodReo = P0AVP6_A132BarCodReo[0] ;
         A130BarCodPar = P0AVP6_A130BarCodPar[0] ;
         A194BarOrdLin = P0AVP6_A194BarOrdLin[0] ;
         A602MaqCod = P0AVP6_A602MaqCod[0] ;
         A558HisProFec = P0AVP6_A558HisProFec[0] ;
         A656ParCod = P0AVP6_A656ParCod[0] ;
         n656ParCod = P0AVP6_n656ParCod[0] ;
         A561HisProLin = P0AVP6_A561HisProLin[0] ;
         AV293HisProlin = A561HisProLin ;
         AV306Lhipro = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP4[0] = get_clientinfo.this.AV8HTML;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8HTML = "" ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      scmdbuf = "" ;
      P0AVP3_A361DisCod = new int[1] ;
      P0AVP3_A396EmprCod = new String[] {""} ;
      P0AVP3_A130BarCodPar = new String[] {""} ;
      P0AVP3_A132BarCodReo = new byte[1] ;
      P0AVP3_A129BarCod = new int[1] ;
      P0AVP3_A125BarAncAca1 = new short[1] ;
      P0AVP3_A212BarSer = new String[] {""} ;
      P0AVP3_A1652BarSerDsc = new String[] {""} ;
      P0AVP3_A135BarColNom = new String[] {""} ;
      P0AVP3_A136BarColNum = new int[1] ;
      P0AVP3_A252CliCod = new int[1] ;
      P0AVP3_n252CliCod = new boolean[] {false} ;
      P0AVP3_A279CliNom = new String[] {""} ;
      P0AVP3_A228BarUniMed = new String[] {""} ;
      P0AVP3_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AVP3_A864BarPes = new short[1] ;
      P0AVP3_A1909BarGraAca = new short[1] ;
      P0AVP3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AVP3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AVP3_A199BarPie1 = new short[1] ;
      P0AVP3_A365DisDes = new String[] {""} ;
      P0AVP3_A898BarPieNDes = new int[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A279CliNom = "" ;
      A228BarUniMed = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV37BarMtr = DecimalUtil.ZERO ;
      AV211Barkgm = DecimalUtil.ZERO ;
      AV47BarSer = "" ;
      AV48BarSerDsc = "" ;
      AV32BarColNom = "" ;
      AV58CliNom = "" ;
      AV215BarUnimed = "" ;
      AV404Uni = "" ;
      AV46BarRdt = DecimalUtil.ZERO ;
      P0AVP4_A396EmprCod = new String[] {""} ;
      P0AVP4_A361DisCod = new int[1] ;
      P0AVP4_A377DisObsTxt = new String[] {""} ;
      P0AVP4_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV210Tab_obs = new GXSimpleCollection<String>(String.class, "internal", "");
      AV100Kilos = DecimalUtil.ZERO ;
      AV139Metros = DecimalUtil.ZERO ;
      P0AVP5_A130BarCodPar = new String[] {""} ;
      P0AVP5_A132BarCodReo = new byte[1] ;
      P0AVP5_A129BarCod = new int[1] ;
      P0AVP5_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AVP5_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AVP5_A44AlbRecCod = new int[1] ;
      P0AVP5_A396EmprCod = new String[] {""} ;
      P0AVP5_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV330MaqCod = "" ;
      AV305Lecfec = GXutil.nullDate() ;
      P0AVP6_A396EmprCod = new String[] {""} ;
      P0AVP6_A129BarCod = new int[1] ;
      P0AVP6_A132BarCodReo = new byte[1] ;
      P0AVP6_A130BarCodPar = new String[] {""} ;
      P0AVP6_A194BarOrdLin = new short[1] ;
      P0AVP6_A602MaqCod = new String[] {""} ;
      P0AVP6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AVP6_A656ParCod = new short[1] ;
      P0AVP6_n656ParCod = new boolean[] {false} ;
      P0AVP6_A561HisProLin = new int[1] ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.balance.get_clientinfo__default(),
         new Object[] {
             new Object[] {
            P0AVP3_A361DisCod, P0AVP3_A396EmprCod, P0AVP3_A130BarCodPar, P0AVP3_A132BarCodReo, P0AVP3_A129BarCod, P0AVP3_A125BarAncAca1, P0AVP3_A212BarSer, P0AVP3_A1652BarSerDsc, P0AVP3_A135BarColNom, P0AVP3_A136BarColNum,
            P0AVP3_A252CliCod, P0AVP3_n252CliCod, P0AVP3_A279CliNom, P0AVP3_A228BarUniMed, P0AVP3_A211BarRdt, P0AVP3_A864BarPes, P0AVP3_A1909BarGraAca, P0AVP3_A184BarMtr, P0AVP3_A166BarKgm, P0AVP3_A199BarPie1,
            P0AVP3_A365DisDes, P0AVP3_A898BarPieNDes
            }
            , new Object[] {
            P0AVP4_A396EmprCod, P0AVP4_A361DisCod, P0AVP4_A377DisObsTxt, P0AVP4_A376DisObsLin
            }
            , new Object[] {
            P0AVP5_A130BarCodPar, P0AVP5_A132BarCodReo, P0AVP5_A129BarCod, P0AVP5_A203BarPieKil, P0AVP5_A205BarPieMet, P0AVP5_A44AlbRecCod, P0AVP5_A396EmprCod, P0AVP5_A200BarPieCod
            }
            , new Object[] {
            P0AVP6_A396EmprCod, P0AVP6_A129BarCod, P0AVP6_A132BarCodReo, P0AVP6_A130BarCodPar, P0AVP6_A194BarOrdLin, P0AVP6_A602MaqCod, P0AVP6_A558HisProFec, P0AVP6_A656ParCod, P0AVP6_n656ParCod, P0AVP6_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV31BarCodReo ;
   private byte AV375PesSim ;
   private byte AV354NoEtiquet ;
   private byte AV264Datamon ;
   private byte AV286FlagMfR ;
   private byte AV285FlagGm2 ;
   private byte AV390Tinamar ;
   private byte AV277Etm ;
   private byte AV253Carvema ;
   private byte AV341Moda21 ;
   private byte AV362NumPzsFs ;
   private byte AV363NumPzsFs2 ;
   private byte AV276Eticvg ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV227AutMan ;
   private byte AV414GXLvl20 ;
   private byte A132BarCodReo ;
   private byte AV94i ;
   private byte A376DisObsLin ;
   private byte AV306Lhipro ;
   private short AV392TopeK ;
   private short AV393TopeM ;
   private short A125BarAncAca1 ;
   private short A864BarPes ;
   private short A1909BarGraAca ;
   private short A199BarPie1 ;
   private short AV28BarAncAca1 ;
   private short AV39Barpes ;
   private short AV35BarGraAca ;
   private short AV218Ancho0 ;
   private short AV220Cancho ;
   private short AV219Ancho ;
   private short AV221Grm2 ;
   private short AV222Cgrm2 ;
   private short AV155Nr ;
   private short AV239barOrdlin ;
   private short A194BarOrdLin ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV29BarCod ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV33BarColNum ;
   private int AV212CliCod ;
   private int AV213BarPie ;
   private int AV214Discod ;
   private int AV181Recc ;
   private int A44AlbRecCod ;
   private int AV411Barcada ;
   private int A561HisProLin ;
   private int AV293HisProlin ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV37BarMtr ;
   private java.math.BigDecimal AV211Barkgm ;
   private java.math.BigDecimal AV46BarRdt ;
   private java.math.BigDecimal AV100Kilos ;
   private java.math.BigDecimal AV139Metros ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private String AV216EmprCod ;
   private String AV30BarCodPar ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A279CliNom ;
   private String A228BarUniMed ;
   private String A365DisDes ;
   private String AV47BarSer ;
   private String AV48BarSerDsc ;
   private String AV32BarColNom ;
   private String AV58CliNom ;
   private String AV215BarUnimed ;
   private String AV404Uni ;
   private String A377DisObsTxt ;
   private String A200BarPieCod ;
   private String AV330MaqCod ;
   private String A602MaqCod ;
   private java.util.Date AV305Lecfec ;
   private java.util.Date A558HisProFec ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean AV217IsLoad ;
   private boolean n656ParCod ;
   private String AV8HTML ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AVP3_A361DisCod ;
   private String[] P0AVP3_A396EmprCod ;
   private String[] P0AVP3_A130BarCodPar ;
   private byte[] P0AVP3_A132BarCodReo ;
   private int[] P0AVP3_A129BarCod ;
   private short[] P0AVP3_A125BarAncAca1 ;
   private String[] P0AVP3_A212BarSer ;
   private String[] P0AVP3_A1652BarSerDsc ;
   private String[] P0AVP3_A135BarColNom ;
   private int[] P0AVP3_A136BarColNum ;
   private int[] P0AVP3_A252CliCod ;
   private boolean[] P0AVP3_n252CliCod ;
   private String[] P0AVP3_A279CliNom ;
   private String[] P0AVP3_A228BarUniMed ;
   private java.math.BigDecimal[] P0AVP3_A211BarRdt ;
   private short[] P0AVP3_A864BarPes ;
   private short[] P0AVP3_A1909BarGraAca ;
   private java.math.BigDecimal[] P0AVP3_A184BarMtr ;
   private java.math.BigDecimal[] P0AVP3_A166BarKgm ;
   private short[] P0AVP3_A199BarPie1 ;
   private String[] P0AVP3_A365DisDes ;
   private int[] P0AVP3_A898BarPieNDes ;
   private String[] P0AVP4_A396EmprCod ;
   private int[] P0AVP4_A361DisCod ;
   private String[] P0AVP4_A377DisObsTxt ;
   private byte[] P0AVP4_A376DisObsLin ;
   private String[] P0AVP5_A130BarCodPar ;
   private byte[] P0AVP5_A132BarCodReo ;
   private int[] P0AVP5_A129BarCod ;
   private java.math.BigDecimal[] P0AVP5_A203BarPieKil ;
   private java.math.BigDecimal[] P0AVP5_A205BarPieMet ;
   private int[] P0AVP5_A44AlbRecCod ;
   private String[] P0AVP5_A396EmprCod ;
   private String[] P0AVP5_A200BarPieCod ;
   private String[] P0AVP6_A396EmprCod ;
   private int[] P0AVP6_A129BarCod ;
   private byte[] P0AVP6_A132BarCodReo ;
   private String[] P0AVP6_A130BarCodPar ;
   private short[] P0AVP6_A194BarOrdLin ;
   private String[] P0AVP6_A602MaqCod ;
   private java.util.Date[] P0AVP6_A558HisProFec ;
   private short[] P0AVP6_A656ParCod ;
   private boolean[] P0AVP6_n656ParCod ;
   private int[] P0AVP6_A561HisProLin ;
   private GXSimpleCollection<String> AV210Tab_obs ;
}

final  class get_clientinfo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AVP3", "SELECT T1.DisCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarAncAca1, T1.BarSer, T1.BarSerDsc, T1.BarColNom, T1.BarColNum, T1.CliCod, T3.CliNom, T1.BarUniMed, T1.BarRdt, T1.BarPes, T1.BarGraAca, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AVP4", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AVP5", "SELECT BarCodPar, BarCodReo, BarCod, BarPieKil, BarPieMet, AlbRecCod, EmprCod, BarPieCod FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AVP6", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, MaqCod, HisProFec, ParCod, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and MaqCod = ? and HisProFec = ?) AND (ParCod = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, MaqCod, HisProFec, HisProLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setDate(7, (java.util.Date)parms[6]);
               return;
      }
   }

}

