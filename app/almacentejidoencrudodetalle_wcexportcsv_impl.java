package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class almacentejidoencrudodetalle_wcexportcsv_impl extends GXWebProcedure
{
   public almacentejidoencrudodetalle_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV52AlmacenTejidoencrudoDetalle_SDTJson = AV53websession.getValue(httpContext.getMessage( "&AlmacenTejidoencrudoDetalle_SDT", "")) ;
      AV30AlmacenTejidoencrudoDetalle_SDT.fromJSonString(AV52AlmacenTejidoencrudoDetalle_SDTJson, null);
      AV53websession.remove(httpContext.getMessage( "&AlmacenTejidoencrudoDetalle_SDT", ""));
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
      S191 ();
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
      S181 ();
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
      AV12Filename = "./PrivateTempStorage/" + "AlmacenTejidoencrudoDetalle_WCExportCSV-" + GXutil.trim( GXutil.str( AV14Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV20Session.getValue("AlmacenTejidoencrudoDetalle_WCColumnsSelector"), "") != 0 )
      {
         AV19ColumnsSelectorXML = AV20Session.getValue("AlmacenTejidoencrudoDetalle_WCColumnsSelector") ;
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
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Referencia", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Recepcion", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Entrada", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Albaran", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unds. Ent.", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pzs. Ent.", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unds. Uti.", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pzs. Uti.", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unds. Disp.", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pzs. Disp.", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Procedencia", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Transportista", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Localizacion", "") : "") ;
      if ( GXutil.len( AV15TextFileLine) > 0 )
      {
         AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV56GXV1 = 1 ;
      while ( AV56GXV1 <= AV30AlmacenTejidoencrudoDetalle_SDT.size() )
      {
         AV10AlmacenTejidoencrudoDetalle_SDTItem = (app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV30AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV56GXV1));
         AV15TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S161 ();
         if (returnInSub) return;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clicod(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clinom(), ";", ","), GXv_char3) ;
            almacentejidoencrudodetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albref(), ";", ","), GXv_char3) ;
            almacentejidoencrudodetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrefdsc(), ";", ","), GXv_char3) ;
            almacentejidoencrudodetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albreccod(), 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += localUtil.dtoc( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrfen(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrent2(), ";", ","), GXv_char3) ;
            almacentejidoencrudodetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            if ( GXutil.strcmp(GXutil.trim( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni()), "K") == 0 )
            {
               AV15TextFileLine += httpContext.getMessage( "K", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni()), "M") == 0 )
            {
               AV15TextFileLine += httpContext.getMessage( "M", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunient(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieent(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruniuti(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieuti(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunidis(), 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpiedis(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procecod(), 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procenom(), ";", ","), GXv_char3) ;
            almacentejidoencrudodetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trncod(), 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trnnom(), ";", ","), GXv_char3) ;
            almacentejidoencrudodetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrloc(), ";", ","), GXv_char3) ;
            almacentejidoencrudodetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S171 ();
         if (returnInSub) return;
         if ( GXutil.len( AV15TextFileLine) > 0 )
         {
            AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
         }
         AV56GXV1 = (int)(AV56GXV1+1) ;
      }
   }

   public void S181( )
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
            AV28HttpResponse.addHeader("Content-Disposition", "attachment;filename=AlmacenTejidoencrudoDetalle_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__Clicod", "", "Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__CliNom", "", "Nombre", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albref", "", "Referencia", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albrefdsc", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albreccod", "", "N Recepcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albrfen", "", "Fecha Entrada", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albrent2", "", "Nº Albaran", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albruni", "", "Unidad", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albrunient", "", "Unds. Ent.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albrpieent", "", "Pzs. Ent.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albruniuti", "", "Unds. Uti.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albrpieuti", "", "Pzs. Uti.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albrunidis", "", "Unds. Disp.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albrpiedis", "", "Pzs. Disp.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__ProceCod", "", "Procedencia", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__Procenom", "", "Nombre", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__trncod", "", "Transportista", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__trnnom", "", "Nombre", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlmacenTejidoencrudoDetalle_SDT__albrloc", "", "Localizacion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV21UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AlmacenTejidoencrudoDetalle_WCColumnsSelector", GXv_char3) ;
      almacentejidoencrudodetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV21UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV21UserCustomValue)==0) ) )
      {
         AV17ColumnsSelectorAux.fromxml(AV21UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV17ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV17ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("AlmacenTejidoencrudoDetalle_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AlmacenTejidoencrudoDetalle_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV20Session.getValue("AlmacenTejidoencrudoDetalle_WCGridState"), null, null);
      }
      AV57GXV2 = 1 ;
      while ( AV57GXV2 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV57GXV2));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV29FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34EmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCLIENTE") == 0 )
         {
            AV35PCliente = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&UCLIENTE") == 0 )
         {
            AV36UCliente = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PFECHA") == 0 )
         {
            AV37PFecha = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&UFECHA") == 0 )
         {
            AV38UFecha = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREF_I") == 0 )
         {
            AV39AlbRef_i = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREF_F") == 0 )
         {
            AV40AlbRef_f = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ESTADO_A") == 0 )
         {
            AV41Estado_a = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRENTI") == 0 )
         {
            AV42Albrenti = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRENTF") == 0 )
         {
            AV43Albrentf = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPENTCODI") == 0 )
         {
            AV44TipENtcodi = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCODI") == 0 )
         {
            AV45Procodi = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCODF") == 0 )
         {
            AV46Procodf = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TRNCODI") == 0 )
         {
            AV47trnCodi = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TRNCODF") == 0 )
         {
            AV48TrnCodf = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCOD1") == 0 )
         {
            AV49Tipartcod1 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCOD2") == 0 )
         {
            AV50Tipartcod2 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&UNIDAD") == 0 )
         {
            AV51Unidad = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV57GXV2 = (int)(AV57GXV2+1) ;
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
      AV52AlmacenTejidoencrudoDetalle_SDTJson = "" ;
      AV53websession = httpContext.getWebSession();
      AV30AlmacenTejidoencrudoDetalle_SDT = new GXBaseCollection<app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem>(app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem.class, "AlmacenTejidoencrudoDetalle_SDTItem", "TexplusNET", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12Filename = "" ;
      AV11TextFile = new com.genexus.util.GXFile();
      AV15TextFileLine = "" ;
      AV20Session = httpContext.getWebSession();
      AV19ColumnsSelectorXML = "" ;
      AV16ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV10AlmacenTejidoencrudoDetalle_SDTItem = new app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem(remoteHandle, context);
      AV28HttpResponse = httpContext.getHttpResponse();
      AV13ErrorMessage = "" ;
      AV21UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV17ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV29FilterFullText = "" ;
      AV34EmprCod = "" ;
      AV37PFecha = GXutil.nullDate() ;
      AV38UFecha = GXutil.nullDate() ;
      AV39AlbRef_i = "" ;
      AV40AlbRef_f = "" ;
      AV41Estado_a = "" ;
      AV42Albrenti = "" ;
      AV43Albrentf = "" ;
      AV51Unidad = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV44TipENtcodi ;
   private short AV45Procodi ;
   private short AV46Procodf ;
   private short AV47trnCodi ;
   private short AV48TrnCodf ;
   private short AV49Tipartcod1 ;
   private short AV50Tipartcod2 ;
   private short Gx_err ;
   private int AV14Random ;
   private int AV56GXV1 ;
   private int AV57GXV2 ;
   private int AV35PCliente ;
   private int AV36UCliente ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV34EmprCod ;
   private String AV39AlbRef_i ;
   private String AV40AlbRef_f ;
   private String AV41Estado_a ;
   private String AV42Albrenti ;
   private String AV43Albrentf ;
   private String AV51Unidad ;
   private java.util.Date AV37PFecha ;
   private java.util.Date AV38UFecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV52AlmacenTejidoencrudoDetalle_SDTJson ;
   private String AV15TextFileLine ;
   private String AV19ColumnsSelectorXML ;
   private String AV21UserCustomValue ;
   private String AV12Filename ;
   private String AV13ErrorMessage ;
   private String AV29FilterFullText ;
   private com.genexus.webpanels.WebSession AV53websession ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.util.GXFile AV11TextFile ;
   private com.genexus.internet.HttpResponse AV28HttpResponse ;
   private GXBaseCollection<app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem> AV30AlmacenTejidoencrudoDetalle_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem AV10AlmacenTejidoencrudoDetalle_SDTItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

