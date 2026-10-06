package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informemermasresumen_wcexportcsv_impl extends GXWebProcedure
{
   public informemermasresumen_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV30SDTMermasResumenClientes.fromJSonString(AV57WebSession.getValue(httpContext.getMessage( "SDTMermasResumenClientes", "")), null);
      if ( 1 == 0 )
      {
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
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
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
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'TITULODATOSFILTROS' */
      S211 ();
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
      AV12Filename = "./PrivateTempStorage/" + "InformeMermasResumen_WCExportCSV-" + GXutil.trim( GXutil.str( AV14Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV20Session.getValue("InformeMermasResumen_WCColumnsSelector"), "") != 0 )
      {
         AV19ColumnsSelectorXML = AV20Session.getValue("InformeMermasResumen_WCColumnsSelector") ;
         AV16ColumnsSelector.fromxml(AV19ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Cliente", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Qgs. Entrado", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Qgs. Saidos", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Qgs. Difer", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Qgs. %", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts. Entrado", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts. Saidos", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts. Difer", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts. %", "") : "") ;
      if ( GXutil.len( AV15TextFileLine) > 0 )
      {
         AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV66GXV1 = 1 ;
         while ( AV66GXV1 <= AV30SDTMermasResumenClientes.size() )
         {
            AV10SDTMermasResumenClientesItem = (app.SdtSDTMermasResumenCliente)((app.SdtSDTMermasResumenCliente)AV30SDTMermasResumenClientes.elementAt(-1+AV66GXV1));
            AV15TextFileLine = "" ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S161 ();
            if (returnInSub) return;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV10SDTMermasResumenClientesItem.getgxTv_SdtSDTMermasResumenCliente_Clicod(), 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               GXt_char2 = AV15TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10SDTMermasResumenClientesItem.getgxTv_SdtSDTMermasResumenCliente_Clinom(), ";", ","), GXv_char3) ;
               informemermasresumen_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV15TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV34KilosEnt, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV35KilosExp, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV36DifKilos, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV37PorKilos, 6, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV38MetrosEnt, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV39MetrosExp, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV40DifMetros, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV41PorMetros, 6, 2) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S171 ();
            if (returnInSub) return;
            if ( GXutil.len( AV15TextFileLine) > 0 )
            {
               AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
            }
            AV66GXV1 = (int)(AV66GXV1+1) ;
         }
      }
      AV67GXV2 = 1 ;
      while ( AV67GXV2 <= AV30SDTMermasResumenClientes.size() )
      {
         AV10SDTMermasResumenClientesItem = (app.SdtSDTMermasResumenCliente)((app.SdtSDTMermasResumenCliente)AV30SDTMermasResumenClientes.elementAt(-1+AV67GXV2));
         AV15TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S161 ();
         if (returnInSub) return;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV10SDTMermasResumenClientesItem.getgxTv_SdtSDTMermasResumenCliente_Clicod(), 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            GXt_char2 = AV15TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10SDTMermasResumenClientesItem.getgxTv_SdtSDTMermasResumenCliente_Clinom(), ";", ","), GXv_char3) ;
            informemermasresumen_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV15TextFileLine += GXt_char2 ;
         }
         AV34KilosEnt = ((app.SdtSDTMermasResumenCliente_ResumenItem)AV10SDTMermasResumenClientesItem.getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent() ;
         AV35KilosExp = ((app.SdtSDTMermasResumenCliente_ResumenItem)AV10SDTMermasResumenClientesItem.getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp() ;
         AV36DifKilos = ((app.SdtSDTMermasResumenCliente_ResumenItem)AV10SDTMermasResumenClientesItem.getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos() ;
         AV37PorKilos = ((app.SdtSDTMermasResumenCliente_ResumenItem)AV10SDTMermasResumenClientesItem.getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos() ;
         AV38MetrosEnt = ((app.SdtSDTMermasResumenCliente_ResumenItem)AV10SDTMermasResumenClientesItem.getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent() ;
         AV39MetrosExp = ((app.SdtSDTMermasResumenCliente_ResumenItem)AV10SDTMermasResumenClientesItem.getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp() ;
         AV40DifMetros = ((app.SdtSDTMermasResumenCliente_ResumenItem)AV10SDTMermasResumenClientesItem.getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros() ;
         AV41PorMetros = ((app.SdtSDTMermasResumenCliente_ResumenItem)AV10SDTMermasResumenClientesItem.getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros() ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV34KilosEnt, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV35KilosExp, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV36DifKilos, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV37PorKilos, 6, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV38MetrosEnt, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV39MetrosExp, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV40DifMetros, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV15TextFileLine += ";" ;
            AV15TextFileLine += GXutil.str( AV41PorMetros, 6, 2) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S171 ();
         if (returnInSub) return;
         if ( GXutil.len( AV15TextFileLine) > 0 )
         {
            AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
         }
         AV67GXV2 = (int)(AV67GXV2+1) ;
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
            AV28HttpResponse.addHeader("Content-Disposition", "attachment;filename=InformeMermasResumen_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SDTMermasResumenClientes__Clicod", "", "Codigo Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SDTMermasResumenClientes__CliNom", "", "Nombre Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&KilosEnt", "", "Qgs. Entrado", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&KilosExp", "", "Qgs. Saidos", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&DifKilos", "", "Qgs. Difer", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&PorKilos", "", "Qgs. %", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&MetrosEnt", "", "Mts. Entrado", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&MetrosExp", "", "Mts. Saidos", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&DifMetros", "", "Mts. Difer", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&PorMetros", "", "Mts. %", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV21UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "InformeMermasResumen_WCColumnsSelector", GXv_char3) ;
      informemermasresumen_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV20Session.getValue("InformeMermasResumen_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "InformeMermasResumen_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV20Session.getValue("InformeMermasResumen_WCGridState"), null, null);
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

   public void S201( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char2 = AV59Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      informemermasresumen_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV59Station = GXt_char2 ;
      GXv_char3[0] = AV44Emprcod ;
      GXv_char6[0] = AV60EmprNom ;
      GXv_char7[0] = AV61UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV59Station, GXv_char3, GXv_char6, GXv_char7) ;
      informemermasresumen_wcexportcsv_impl.this.AV44Emprcod = GXv_char3[0] ;
      informemermasresumen_wcexportcsv_impl.this.AV60EmprNom = GXv_char6[0] ;
      informemermasresumen_wcexportcsv_impl.this.AV61UsurCod = GXv_char7[0] ;
      AV62BarFecSal_char = GXutil.upper( GXutil.trim( AV57WebSession.getValue("InformeMermasResumen_WC_BarFecSal"))) ;
      AV57WebSession.remove("InformeMermasResumen_WC_BarFecSal");
      AV63BarFecSal_to_char = GXutil.upper( GXutil.trim( AV57WebSession.getValue("InformeMermasResumen_WC_BarFecSal_to"))) ;
      AV57WebSession.remove("InformeMermasResumen_WC_BarFecSal_to");
   }

   public void S211( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV15TextFileLine += AV60EmprNom + " " + "(" + AV68Pgmdesc + ")" + " " ;
      AV15TextFileLine += httpContext.getMessage( "Fecha Salida Inicial: ", "") + " " + AV62BarFecSal_char + " " ;
      AV15TextFileLine += httpContext.getMessage( "Fecha Salida Final: ", "") + " " + AV63BarFecSal_to_char ;
      if ( GXutil.len( AV15TextFileLine) > 0 )
      {
         AV11TextFile.writeLine(AV15TextFileLine);
         AV11TextFile.writeLine(" ");
      }
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
      AV30SDTMermasResumenClientes = new GXBaseCollection<app.SdtSDTMermasResumenCliente>(app.SdtSDTMermasResumenCliente.class, "SDTMermasResumenCliente", "TexplusNET", remoteHandle);
      AV57WebSession = httpContext.getWebSession();
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12Filename = "" ;
      AV11TextFile = new com.genexus.util.GXFile();
      AV15TextFileLine = "" ;
      AV20Session = httpContext.getWebSession();
      AV19ColumnsSelectorXML = "" ;
      AV16ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV10SDTMermasResumenClientesItem = new app.SdtSDTMermasResumenCliente(remoteHandle, context);
      AV34KilosEnt = DecimalUtil.ZERO ;
      AV35KilosExp = DecimalUtil.ZERO ;
      AV36DifKilos = DecimalUtil.ZERO ;
      AV37PorKilos = DecimalUtil.ZERO ;
      AV38MetrosEnt = DecimalUtil.ZERO ;
      AV39MetrosExp = DecimalUtil.ZERO ;
      AV40DifMetros = DecimalUtil.ZERO ;
      AV41PorMetros = DecimalUtil.ZERO ;
      AV28HttpResponse = httpContext.getHttpResponse();
      AV13ErrorMessage = "" ;
      AV21UserCustomValue = "" ;
      AV17ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV59Station = "" ;
      GXt_char2 = "" ;
      AV44Emprcod = "" ;
      GXv_char3 = new String[1] ;
      AV60EmprNom = "" ;
      GXv_char6 = new String[1] ;
      AV61UsurCod = "" ;
      GXv_char7 = new String[1] ;
      AV62BarFecSal_char = "" ;
      AV63BarFecSal_to_char = "" ;
      AV68Pgmdesc = "" ;
      AV68Pgmdesc = httpContext.getMessage( "Informe Mermas Resumen", "") ;
      /* GeneXus formulas. */
      AV68Pgmdesc = httpContext.getMessage( "Informe Mermas Resumen", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int AV14Random ;
   private int AV66GXV1 ;
   private int AV67GXV2 ;
   private java.math.BigDecimal AV34KilosEnt ;
   private java.math.BigDecimal AV35KilosExp ;
   private java.math.BigDecimal AV36DifKilos ;
   private java.math.BigDecimal AV37PorKilos ;
   private java.math.BigDecimal AV38MetrosEnt ;
   private java.math.BigDecimal AV39MetrosExp ;
   private java.math.BigDecimal AV40DifMetros ;
   private java.math.BigDecimal AV41PorMetros ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV59Station ;
   private String GXt_char2 ;
   private String AV44Emprcod ;
   private String GXv_char3[] ;
   private String AV60EmprNom ;
   private String GXv_char6[] ;
   private String AV61UsurCod ;
   private String GXv_char7[] ;
   private String AV62BarFecSal_char ;
   private String AV63BarFecSal_to_char ;
   private String AV68Pgmdesc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV15TextFileLine ;
   private String AV19ColumnsSelectorXML ;
   private String AV21UserCustomValue ;
   private String AV12Filename ;
   private String AV13ErrorMessage ;
   private com.genexus.webpanels.WebSession AV57WebSession ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.util.GXFile AV11TextFile ;
   private com.genexus.internet.HttpResponse AV28HttpResponse ;
   private GXBaseCollection<app.SdtSDTMermasResumenCliente> AV30SDTMermasResumenClientes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.SdtSDTMermasResumenCliente AV10SDTMermasResumenClientesItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
}

