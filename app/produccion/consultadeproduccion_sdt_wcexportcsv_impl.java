package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_sdt_wcexportcsv_impl extends GXWebProcedure
{
   public consultadeproduccion_sdt_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV146ConsultadeProduccion_SDT_json = AV147websession.getValue(httpContext.getMessage( "&ConsultadeProduccion_SDT_json", "")) ;
      AV30ConsultadeProduccion_SDT.fromJSonString(AV146ConsultadeProduccion_SDT_json, null);
      AV147websession.remove(httpContext.getMessage( "&ConsultadeProduccion_SDT_json", ""));
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S181 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV14Random = (int)(GXutil.random( )*10000) ;
      AV12Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_SDT_WCExportCSV-" + GXutil.trim( GXutil.str( AV14Random, 8, 0)) + ".csv" ;
      AV11TextFile.setSource( AV12Filename );
      AV11TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV11TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV15TextFileLine = "" ;
      if ( GXutil.strcmp(AV20Session.getValue("Produccion.ConsultadeProduccion_SDT_WCColumnsSelector"), "") != 0 )
      {
         AV19ColumnsSelectorXML = AV20Session.getValue("Produccion.ConsultadeProduccion_SDT_WCColumnsSelector") ;
         AV16ColumnsSelector.fromxml(AV19ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "A?", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pedido Cliente", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Art.", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cliente", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Sit.", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Hdr", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Ped. Cli.", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Prev. Ent.", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Salida", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ult. Fase", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Sig. Fase", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ultimo Albaran", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Factura", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros Salidos", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos Salidos", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coleccion", "") : "") ;
      if ( AV148IsAuthorizedConsultadeProduccion_SDT )
      {
         AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cuardeno", "") : "") ;
      }
      if ( AV148IsAuthorizedConsultadeProduccion_SDT )
      {
         AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      }
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "CTW", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      if ( AV148IsAuthorizedConsultadeProduccion_SDT )
      {
         AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Normas Estandars Textiles", "") : "") ;
      }
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usario que creó Dispo.", "") : "") ;
      if ( GXutil.len( AV15TextFileLine) > 0 )
      {
         AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV153GXV1 = 1 ;
      while ( AV153GXV1 <= AV30ConsultadeProduccion_SDT.size() )
      {
         AV10ConsultadeProduccion_SDTItem = (app.produccion.SdtConsultadeProduccion_SDT_Item)((app.produccion.SdtConsultadeProduccion_SDT_Item)AV30ConsultadeProduccion_SDT.elementAt(-1+AV153GXV1));
         AV15TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S161 ();
         if (returnInSub) return;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Clicod(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Clinom(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Baragrest(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barser(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Bartipart(), 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barkgm(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barmtr(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barpie(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barsit(), 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += localUtil.dtoc( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += localUtil.dtoc( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += localUtil.dtoc( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += localUtil.dtoc( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barfascod(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barfassig(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo(), 10, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact(), 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Bargirar(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh(), 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barproper(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barnormas(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod(), ";", ","), GXv_char3) ;
            consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S171 ();
         if (returnInSub) return;
         if ( GXutil.len( AV15TextFileLine) > 0 )
         {
            AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
         }
         AV153GXV1 = (int)(AV153GXV1+1) ;
      }
   }

   public void S181( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      GXt_int4 = (byte)(0) ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV34Emprcod, httpContext.getMessage( "CNOENC", ""), GXv_int5) ;
      consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_int4 = GXv_int5[0] ;
      AV148IsAuthorizedConsultadeProduccion_SDT = (boolean)(((GXt_int4==1))) ;
      AV148IsAuthorizedConsultadeProduccion_SDT = (boolean)(((AV154Cuaderno.doubleValue()==1))) ;
      GXt_int4 = (byte)(0) ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV34Emprcod, httpContext.getMessage( "STNORM", ""), GXv_int5) ;
      consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_int4 = GXv_int5[0] ;
      AV148IsAuthorizedConsultadeProduccion_SDT = (boolean)(((GXt_int4==1))) ;
   }

   public void S191( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV11TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV11TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV28HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV28HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsultadeProduccion_SDT_WCExportCSV.csv");
         }
         AV28HttpResponse.addFile(AV11TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV11TextFile.getErrCode() != 0 )
      {
         AV12Filename = "" ;
         AV13ErrorMessage = AV11TextFile.getErrDescription() ;
         AV11TextFile.close();
         AV28HttpResponse.addString(AV13ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV16ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__Clicod", "", "Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__CliNom", "", "Nombre", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarNHdr", "", "N Hdr", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarAgrEst", "", "A?", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__Barser", "", "Articulo", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__Barserdsc", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarTipArt", "", "Tipo Art.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarTipArtDsc", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__Barcolnom", "", "Color", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__Barcolnum", "", "Numero", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarNomCli", "", "Color Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarKgm", "", "Kilos", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarMtr", "", "Metros", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarPie", "", "Piezas", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarSit", "", "Sit.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarFecgen", "", "Fecha Hdr", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarFecCli", "", "Fecha Ped. Cli.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarFecFpr", "", "Fecha Prev. Ent.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarFecsal", "", "Fecha Salida", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__Barfascod", "", "Ult. Fase", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarFasSig", "", "Sig. Fase", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarAlbUltimo", "", "Ultimo Albaran", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarAlbFact", "", "Factura", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarAlbMts", "", "Metros Salidos", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarAlbKgs", "", "Kilos Salidos", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarGirar", "", "Coleccion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( AV34Emprcod, httpContext.getMessage( "CNOENC", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarAcaAnh", "", "Cuardeno", true, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      if ( AV154Cuaderno.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarCuaderno", "", "Descripcion", true, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarProPer", "", "CTW", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarProPerIdtx", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( AV34Emprcod, httpContext.getMessage( "STNORM", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__BarNormas", "", "Normas Estandars Textiles", true, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ConsultadeProduccion_SDT__DisUsrCod", "", "Usario que creó Dispo.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char2 = AV21UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_SDT_WCColumnsSelector", GXv_char3) ;
      consultadeproduccion_sdt_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV21UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV21UserCustomValue)==0) ) )
      {
         AV17ColumnsSelectorAux.fromxml(AV21UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV17ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV17ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("Produccion.ConsultadeProduccion_SDT_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_SDT_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV20Session.getValue("Produccion.ConsultadeProduccion_SDT_WCGridState"), null, null);
      }
      AV74OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV70OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV155GXV2 = 1 ;
      while ( AV155GXV2 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV155GXV2));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__CLICOD") == 0 )
         {
            AV71TFConsultadeProduccion_SDT__Clicod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV72TFConsultadeProduccion_SDT__Clicod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__CLINOM") == 0 )
         {
            AV75TFConsultadeProduccion_SDT__CliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARNHDR") == 0 )
         {
            AV77TFConsultadeProduccion_SDT__BarNHdr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARNHDR_SEL") == 0 )
         {
            AV78TFConsultadeProduccion_SDT__BarNHdr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARAGREST") == 0 )
         {
            AV79TFConsultadeProduccion_SDT__BarAgrEst = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__PEDIDOCLIENTE") == 0 )
         {
            AV81TFConsultadeProduccion_SDT__PedidoCliente = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARSER") == 0 )
         {
            AV83TFConsultadeProduccion_SDT__Barser = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARSER_SEL") == 0 )
         {
            AV84TFConsultadeProduccion_SDT__Barser_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARSERDSC") == 0 )
         {
            AV85TFConsultadeProduccion_SDT__Barserdsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARTIPART") == 0 )
         {
            AV87TFConsultadeProduccion_SDT__BarTipArt = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV137TFConsultadeProduccion_SDT__BarTipArt_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARTIPARTDSC") == 0 )
         {
            AV89TFConsultadeProduccion_SDT__BarTipArtDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARCOLNOM") == 0 )
         {
            AV91TFConsultadeProduccion_SDT__Barcolnom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARCOLNUM") == 0 )
         {
            AV93TFConsultadeProduccion_SDT__Barcolnum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV138TFConsultadeProduccion_SDT__Barcolnum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARNOMCLI") == 0 )
         {
            AV95TFConsultadeProduccion_SDT__BarNomCli = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARKGM") == 0 )
         {
            AV97TFConsultadeProduccion_SDT__BarKgm = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARKGM_SEL") == 0 )
         {
            AV98TFConsultadeProduccion_SDT__BarKgm_Sel = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARMTR") == 0 )
         {
            AV99TFConsultadeProduccion_SDT__BarMtr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARMTR_SEL") == 0 )
         {
            AV100TFConsultadeProduccion_SDT__BarMtr_Sel = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARPIE") == 0 )
         {
            AV101TFConsultadeProduccion_SDT__BarPie = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARPIE_SEL") == 0 )
         {
            AV102TFConsultadeProduccion_SDT__BarPie_Sel = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARSIT") == 0 )
         {
            AV103TFConsultadeProduccion_SDT__BarSit = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV139TFConsultadeProduccion_SDT__BarSit_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARFECGEN") == 0 )
         {
            AV105TFConsultadeProduccion_SDT__BarFecgen = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV142TFConsultadeProduccion_SDT__BarFecgen_To = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARFECCLI") == 0 )
         {
            AV107TFConsultadeProduccion_SDT__BarFecCli = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV143TFConsultadeProduccion_SDT__BarFecCli_To = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARFECFPR") == 0 )
         {
            AV149TFConsultadeProduccion_SDT__BarFecFpr = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV150TFConsultadeProduccion_SDT__BarFecFpr_To = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARFECSAL") == 0 )
         {
            AV109TFConsultadeProduccion_SDT__BarFecsal = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV145TFConsultadeProduccion_SDT__BarFecsal_To = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARFASCOD") == 0 )
         {
            AV111TFConsultadeProduccion_SDT__Barfascod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARFASSIG") == 0 )
         {
            AV113TFConsultadeProduccion_SDT__BarFasSig = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARALBULTIMO") == 0 )
         {
            AV115TFConsultadeProduccion_SDT__BarAlbUltimo = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV140TFConsultadeProduccion_SDT__BarAlbUltimo_To = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARALBFACT") == 0 )
         {
            AV117TFConsultadeProduccion_SDT__BarAlbFact = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV141TFConsultadeProduccion_SDT__BarAlbFact_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARALBMTS") == 0 )
         {
            AV119TFConsultadeProduccion_SDT__BarAlbMts = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARALBMTS_SEL") == 0 )
         {
            AV120TFConsultadeProduccion_SDT__BarAlbMts_Sel = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARALBKGS") == 0 )
         {
            AV121TFConsultadeProduccion_SDT__BarAlbKgs = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARALBKGS_SEL") == 0 )
         {
            AV122TFConsultadeProduccion_SDT__BarAlbKgs_Sel = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARGIRAR") == 0 )
         {
            AV123TFConsultadeProduccion_SDT__BarGirar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARACAANH") == 0 )
         {
            AV125TFConsultadeProduccion_SDT__BarAcaAnh = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV144TFConsultadeProduccion_SDT__BarAcaAnh_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARCUADERNO") == 0 )
         {
            AV127TFConsultadeProduccion_SDT__BarCuaderno = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARPROPER") == 0 )
         {
            AV129TFConsultadeProduccion_SDT__BarProPer = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARPROPERIDTX") == 0 )
         {
            AV131TFConsultadeProduccion_SDT__BarProPerIdtx = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARNORMAS") == 0 )
         {
            AV133TFConsultadeProduccion_SDT__BarNormas = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__DISUSRCOD") == 0 )
         {
            AV135TFConsultadeProduccion_SDT__DisUsrCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODFROM") == 0 )
         {
            AV35clicodfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODTO") == 0 )
         {
            AV36clicodto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARDISNUMFROM") == 0 )
         {
            AV37bardisnumfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARDISNUMTO") == 0 )
         {
            AV38bardisnumto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGENFROM") == 0 )
         {
            AV39barfecgenfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGENTO") == 0 )
         {
            AV40barfecgento = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSITFROM") == 0 )
         {
            AV41barsitfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSITTO") == 0 )
         {
            AV42barsitto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLIFROM") == 0 )
         {
            AV43barfecclifrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLITO") == 0 )
         {
            AV44barfecclito = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECFPRFROM") == 0 )
         {
            AV45BarFecFprfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECFPRTO") == 0 )
         {
            AV46BarFecFprto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSALFROM") == 0 )
         {
            AV47barfecsalfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSALTO") == 0 )
         {
            AV48barfecsalto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERFROM") == 0 )
         {
            AV49barserfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERTO") == 0 )
         {
            AV50barserto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTFROM") == 0 )
         {
            AV51BarTipArtfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTTO") == 0 )
         {
            AV52BarTipArtto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOMFROM") == 0 )
         {
            AV53BarColNomfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOMTO") == 0 )
         {
            AV54BarColNomto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUMFROM") == 0 )
         {
            AV55BarColNumfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUMTO") == 0 )
         {
            AV56BarColNumto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNOMCLIFROM") == 0 )
         {
            AV57BarNomClifrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNOMCLITO") == 0 )
         {
            AV58BarNomClito = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNUMCLIFROM") == 0 )
         {
            AV59BarNumclifrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNUMCLITO") == 0 )
         {
            AV60barnumclito = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTFROM") == 0 )
         {
            AV51BarTipArtfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTTO") == 0 )
         {
            AV52BarTipArtto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MUESTRAS") == 0 )
         {
            AV61muestras = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODFROM") == 0 )
         {
            AV62barcodfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODTO") == 0 )
         {
            AV63barcodto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOFROM") == 0 )
         {
            AV64barcodreofrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOTO") == 0 )
         {
            AV65barcodreoto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARFROM") == 0 )
         {
            AV66barcodparfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARTO") == 0 )
         {
            AV67barcodparto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COD_IDTX") == 0 )
         {
            AV68Cod_idtx = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARGIRAR") == 0 )
         {
            AV69BarGirar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV155GXV2 = (int)(AV155GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S171( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
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
      AV146ConsultadeProduccion_SDT_json = "" ;
      AV147websession = httpContext.getWebSession();
      AV30ConsultadeProduccion_SDT = new GXBaseCollection<app.produccion.SdtConsultadeProduccion_SDT_Item>(app.produccion.SdtConsultadeProduccion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12Filename = "" ;
      AV11TextFile = new com.genexus.util.GXFile();
      AV15TextFileLine = "" ;
      AV20Session = httpContext.getWebSession();
      AV19ColumnsSelectorXML = "" ;
      AV16ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV10ConsultadeProduccion_SDTItem = new app.produccion.SdtConsultadeProduccion_SDT_Item(remoteHandle, context);
      AV34Emprcod = "" ;
      AV154Cuaderno = DecimalUtil.ZERO ;
      GXv_int5 = new byte[1] ;
      AV28HttpResponse = httpContext.getHttpResponse();
      AV13ErrorMessage = "" ;
      AV21UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV17ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV75TFConsultadeProduccion_SDT__CliNom = "" ;
      AV77TFConsultadeProduccion_SDT__BarNHdr = "" ;
      AV78TFConsultadeProduccion_SDT__BarNHdr_Sel = "" ;
      AV79TFConsultadeProduccion_SDT__BarAgrEst = "" ;
      AV81TFConsultadeProduccion_SDT__PedidoCliente = "" ;
      AV83TFConsultadeProduccion_SDT__Barser = "" ;
      AV84TFConsultadeProduccion_SDT__Barser_Sel = "" ;
      AV85TFConsultadeProduccion_SDT__Barserdsc = "" ;
      AV89TFConsultadeProduccion_SDT__BarTipArtDsc = "" ;
      AV91TFConsultadeProduccion_SDT__Barcolnom = "" ;
      AV95TFConsultadeProduccion_SDT__BarNomCli = "" ;
      AV97TFConsultadeProduccion_SDT__BarKgm = DecimalUtil.ZERO ;
      AV98TFConsultadeProduccion_SDT__BarKgm_Sel = DecimalUtil.ZERO ;
      AV99TFConsultadeProduccion_SDT__BarMtr = DecimalUtil.ZERO ;
      AV100TFConsultadeProduccion_SDT__BarMtr_Sel = DecimalUtil.ZERO ;
      AV105TFConsultadeProduccion_SDT__BarFecgen = GXutil.nullDate() ;
      AV142TFConsultadeProduccion_SDT__BarFecgen_To = GXutil.nullDate() ;
      AV107TFConsultadeProduccion_SDT__BarFecCli = GXutil.nullDate() ;
      AV143TFConsultadeProduccion_SDT__BarFecCli_To = GXutil.nullDate() ;
      AV149TFConsultadeProduccion_SDT__BarFecFpr = GXutil.nullDate() ;
      AV150TFConsultadeProduccion_SDT__BarFecFpr_To = GXutil.nullDate() ;
      AV109TFConsultadeProduccion_SDT__BarFecsal = GXutil.nullDate() ;
      AV145TFConsultadeProduccion_SDT__BarFecsal_To = GXutil.nullDate() ;
      AV111TFConsultadeProduccion_SDT__Barfascod = "" ;
      AV113TFConsultadeProduccion_SDT__BarFasSig = "" ;
      AV119TFConsultadeProduccion_SDT__BarAlbMts = DecimalUtil.ZERO ;
      AV120TFConsultadeProduccion_SDT__BarAlbMts_Sel = DecimalUtil.ZERO ;
      AV121TFConsultadeProduccion_SDT__BarAlbKgs = DecimalUtil.ZERO ;
      AV122TFConsultadeProduccion_SDT__BarAlbKgs_Sel = DecimalUtil.ZERO ;
      AV123TFConsultadeProduccion_SDT__BarGirar = "" ;
      AV127TFConsultadeProduccion_SDT__BarCuaderno = "" ;
      AV129TFConsultadeProduccion_SDT__BarProPer = "" ;
      AV131TFConsultadeProduccion_SDT__BarProPerIdtx = "" ;
      AV133TFConsultadeProduccion_SDT__BarNormas = "" ;
      AV135TFConsultadeProduccion_SDT__DisUsrCod = "" ;
      AV68Cod_idtx = "" ;
      AV69BarGirar = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int4 ;
   private byte GXv_int5[] ;
   private byte AV103TFConsultadeProduccion_SDT__BarSit ;
   private byte AV139TFConsultadeProduccion_SDT__BarSit_To ;
   private short gxcookieaux ;
   private short AV74OrderedBy ;
   private short AV87TFConsultadeProduccion_SDT__BarTipArt ;
   private short AV137TFConsultadeProduccion_SDT__BarTipArt_To ;
   private short AV125TFConsultadeProduccion_SDT__BarAcaAnh ;
   private short AV144TFConsultadeProduccion_SDT__BarAcaAnh_To ;
   private short AV35clicodfrom ;
   private short AV36clicodto ;
   private short AV37bardisnumfrom ;
   private short AV38bardisnumto ;
   private short AV39barfecgenfrom ;
   private short AV40barfecgento ;
   private short AV41barsitfrom ;
   private short AV42barsitto ;
   private short AV43barfecclifrom ;
   private short AV44barfecclito ;
   private short AV45BarFecFprfrom ;
   private short AV46BarFecFprto ;
   private short AV47barfecsalfrom ;
   private short AV48barfecsalto ;
   private short AV49barserfrom ;
   private short AV50barserto ;
   private short AV51BarTipArtfrom ;
   private short AV52BarTipArtto ;
   private short AV53BarColNomfrom ;
   private short AV54BarColNomto ;
   private short AV55BarColNumfrom ;
   private short AV56BarColNumto ;
   private short AV57BarNomClifrom ;
   private short AV58BarNomClito ;
   private short AV59BarNumclifrom ;
   private short AV60barnumclito ;
   private short AV61muestras ;
   private short AV62barcodfrom ;
   private short AV63barcodto ;
   private short AV64barcodreofrom ;
   private short AV65barcodreoto ;
   private short AV66barcodparfrom ;
   private short AV67barcodparto ;
   private short Gx_err ;
   private int AV14Random ;
   private int AV153GXV1 ;
   private int AV155GXV2 ;
   private int AV71TFConsultadeProduccion_SDT__Clicod ;
   private int AV72TFConsultadeProduccion_SDT__Clicod_To ;
   private int AV93TFConsultadeProduccion_SDT__Barcolnum ;
   private int AV138TFConsultadeProduccion_SDT__Barcolnum_To ;
   private int AV101TFConsultadeProduccion_SDT__BarPie ;
   private int AV102TFConsultadeProduccion_SDT__BarPie_Sel ;
   private int AV117TFConsultadeProduccion_SDT__BarAlbFact ;
   private int AV141TFConsultadeProduccion_SDT__BarAlbFact_To ;
   private long AV115TFConsultadeProduccion_SDT__BarAlbUltimo ;
   private long AV140TFConsultadeProduccion_SDT__BarAlbUltimo_To ;
   private java.math.BigDecimal AV154Cuaderno ;
   private java.math.BigDecimal AV97TFConsultadeProduccion_SDT__BarKgm ;
   private java.math.BigDecimal AV98TFConsultadeProduccion_SDT__BarKgm_Sel ;
   private java.math.BigDecimal AV99TFConsultadeProduccion_SDT__BarMtr ;
   private java.math.BigDecimal AV100TFConsultadeProduccion_SDT__BarMtr_Sel ;
   private java.math.BigDecimal AV119TFConsultadeProduccion_SDT__BarAlbMts ;
   private java.math.BigDecimal AV120TFConsultadeProduccion_SDT__BarAlbMts_Sel ;
   private java.math.BigDecimal AV121TFConsultadeProduccion_SDT__BarAlbKgs ;
   private java.math.BigDecimal AV122TFConsultadeProduccion_SDT__BarAlbKgs_Sel ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV34Emprcod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV75TFConsultadeProduccion_SDT__CliNom ;
   private String AV77TFConsultadeProduccion_SDT__BarNHdr ;
   private String AV78TFConsultadeProduccion_SDT__BarNHdr_Sel ;
   private String AV79TFConsultadeProduccion_SDT__BarAgrEst ;
   private String AV81TFConsultadeProduccion_SDT__PedidoCliente ;
   private String AV83TFConsultadeProduccion_SDT__Barser ;
   private String AV84TFConsultadeProduccion_SDT__Barser_Sel ;
   private String AV85TFConsultadeProduccion_SDT__Barserdsc ;
   private String AV89TFConsultadeProduccion_SDT__BarTipArtDsc ;
   private String AV91TFConsultadeProduccion_SDT__Barcolnom ;
   private String AV95TFConsultadeProduccion_SDT__BarNomCli ;
   private String AV111TFConsultadeProduccion_SDT__Barfascod ;
   private String AV113TFConsultadeProduccion_SDT__BarFasSig ;
   private String AV123TFConsultadeProduccion_SDT__BarGirar ;
   private String AV127TFConsultadeProduccion_SDT__BarCuaderno ;
   private String AV129TFConsultadeProduccion_SDT__BarProPer ;
   private String AV131TFConsultadeProduccion_SDT__BarProPerIdtx ;
   private String AV135TFConsultadeProduccion_SDT__DisUsrCod ;
   private String AV68Cod_idtx ;
   private String AV69BarGirar ;
   private java.util.Date AV105TFConsultadeProduccion_SDT__BarFecgen ;
   private java.util.Date AV142TFConsultadeProduccion_SDT__BarFecgen_To ;
   private java.util.Date AV107TFConsultadeProduccion_SDT__BarFecCli ;
   private java.util.Date AV143TFConsultadeProduccion_SDT__BarFecCli_To ;
   private java.util.Date AV149TFConsultadeProduccion_SDT__BarFecFpr ;
   private java.util.Date AV150TFConsultadeProduccion_SDT__BarFecFpr_To ;
   private java.util.Date AV109TFConsultadeProduccion_SDT__BarFecsal ;
   private java.util.Date AV145TFConsultadeProduccion_SDT__BarFecsal_To ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV148IsAuthorizedConsultadeProduccion_SDT ;
   private boolean Cond_result ;
   private boolean AV70OrderedDsc ;
   private String AV146ConsultadeProduccion_SDT_json ;
   private String AV15TextFileLine ;
   private String AV19ColumnsSelectorXML ;
   private String AV21UserCustomValue ;
   private String AV12Filename ;
   private String AV13ErrorMessage ;
   private String AV133TFConsultadeProduccion_SDT__BarNormas ;
   private com.genexus.webpanels.WebSession AV147websession ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.util.GXFile AV11TextFile ;
   private com.genexus.internet.HttpResponse AV28HttpResponse ;
   private GXBaseCollection<app.produccion.SdtConsultadeProduccion_SDT_Item> AV30ConsultadeProduccion_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.produccion.SdtConsultadeProduccion_SDT_Item AV10ConsultadeProduccion_SDTItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

