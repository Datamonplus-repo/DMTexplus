package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entregasresumencliente_wcexport extends GXProcedure
{
   public entregasresumencliente_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entregasresumencliente_wcexport.class ), "" );
   }

   public entregasresumencliente_wcexport( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      entregasresumencliente_wcexport.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      entregasresumencliente_wcexport.this.aP0 = aP0;
      entregasresumencliente_wcexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
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
         AV13CellRow = 1 ;
         AV14FirstColumn = 1 ;
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'WRITEFILTERS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'WRITECOLUMNTITLES' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'WRITEDATA' */
         S161 ();
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
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S211 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'TITULODATOSFILTROS' */
      S221 ();
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
      /* Execute user subroutine: 'WRITEFILTERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
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
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "EntregasResumenCliente_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV30VisibleColumnCount = 0 ;
         if ( GXutil.strcmp(AV17Session.getValue("EntregasResumenCliente_WCColumnsSelector"), "") != 0 )
         {
            AV25ColumnsSelectorXML = AV17Session.getValue("EntregasResumenCliente_WCColumnsSelector") ;
            AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
         }
         else
         {
            /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
            S151 ();
            if (returnInSub) return;
         }
         ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
         ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
         ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
         AV51GXV1 = 1 ;
         while ( AV51GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
         {
            AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV51GXV1));
            if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            AV51GXV1 = (int)(AV51GXV1+1) ;
         }
      }
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV17Session.getValue("EntregasResumenCliente_WCColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV17Session.getValue("EntregasResumenCliente_WCColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( true );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( true );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( true );
      AV52GXV2 = 1 ;
      while ( AV52GXV2 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV52GXV2));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV52GXV2 = (int)(AV52GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV53GXV3 = 1 ;
         while ( AV53GXV3 <= AV21SDTEntregasResumenClientes.size() )
         {
            AV16SDTEntregasResumenClientesItem = (app.SdtSDTEntregasResumenCliente)((app.SdtSDTEntregasResumenCliente)AV21SDTEntregasResumenClientes.elementAt(-1+AV53GXV3));
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S171 ();
            if (returnInSub) return;
            AV30VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( AV16SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Clicod() );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char2 = "" ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Clinom(), GXv_char3) ;
               entregasresumencliente_wcexport.this.GXt_char2 = GXv_char3[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char2 );
               AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S181 ();
            if (returnInSub) return;
            AV53GXV3 = (int)(AV53GXV3+1) ;
         }
      }
      AV21SDTEntregasResumenClientes.fromJSonString(AV34WebSession.getValue("SDTEntregasResumenClientes"), AV35Messages);
      AV54GXV4 = 1 ;
      while ( AV54GXV4 <= AV21SDTEntregasResumenClientes.size() )
      {
         AV16SDTEntregasResumenClientesItem = (app.SdtSDTEntregasResumenCliente)((app.SdtSDTEntregasResumenCliente)AV21SDTEntregasResumenClientes.elementAt(-1+AV54GXV4));
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S171 ();
         if (returnInSub) return;
         AV30VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( AV16SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Clicod() );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Clinom(), GXv_char3) ;
            entregasresumencliente_wcexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV36Totkgs = ((app.SdtSDTEntregasResumenCliente_Level1Item)AV16SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+1)).getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs() ;
         AV37TotMts = ((app.SdtSDTEntregasResumenCliente_Level1Item)AV16SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+1)).getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts() ;
         AV38TotPzs = ((app.SdtSDTEntregasResumenCliente_Level1Item)AV16SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+1)).getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs() ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXutil.str( AV36Totkgs, 10, 2) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXutil.str( AV37TotMts, 10, 2) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXutil.str( AV38TotPzs, 6, 0) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S181 ();
         if (returnInSub) return;
         AV54GXV4 = (int)(AV54GXV4+1) ;
      }
   }

   public void S191( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SDTEntregasResumenClientes__Clicod", "", "Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SDTEntregasResumenClientes__CliNom", "", "Nombre", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&TotKgs", "", "Total Qgs", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&TotMts", "", "Total Mts", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&TotPzs", "", "Total Pcas", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV26UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "EntregasResumenCliente_WCColumnsSelector", GXv_char3) ;
      entregasresumencliente_wcexport.this.GXt_char2 = GXv_char3[0] ;
      AV26UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV17Session.getValue("EntregasResumenCliente_WCGridState"), "") == 0 )
      {
         AV19GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "EntregasResumenCliente_WCGridState"), null, null);
      }
      else
      {
         AV19GridState.fromxml(AV17Session.getValue("EntregasResumenCliente_WCGridState"), null, null);
      }
   }

   public void S171( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S181( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S211( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char2 = AV41Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      entregasresumencliente_wcexport.this.GXt_char2 = GXv_char3[0] ;
      AV41Station = GXt_char2 ;
      GXv_char3[0] = AV42EmprCod ;
      GXv_char6[0] = AV43EmprNom ;
      GXv_char7[0] = AV44UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char3, GXv_char6, GXv_char7) ;
      entregasresumencliente_wcexport.this.AV42EmprCod = GXv_char3[0] ;
      entregasresumencliente_wcexport.this.AV43EmprNom = GXv_char6[0] ;
      entregasresumencliente_wcexport.this.AV44UsurCod = GXv_char7[0] ;
      AV45ALbProfch_char = GXutil.upper( GXutil.trim( AV34WebSession.getValue("InformeAlbaranesProduccionWC_ALbProfch"))) ;
      AV34WebSession.remove("InformeAlbaranesProduccionWC_ALbProfch");
      AV48ALbProfch = localUtil.ctod( AV45ALbProfch_char, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV46ALbProfch_to_char = GXutil.upper( GXutil.trim( AV34WebSession.getValue("InformeAlbaranesProduccionWC_ALbProfch_to"))) ;
      AV34WebSession.remove("InformeAlbaranesProduccionWC_ALbProfch_to");
      AV47ALbProfch_to = localUtil.ctod( AV46ALbProfch_to_char, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
   }

   public void S221( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV43EmprNom+" "+"("+AV55Pgmdesc+")" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Fecha Inicial: ", "")+" "+localUtil.dtoc( AV48ALbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Fecha Final: ", "")+" "+localUtil.dtoc( AV47ALbProfch_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
   }

   protected void cleanup( )
   {
      this.aP0[0] = entregasresumencliente_wcexport.this.AV11Filename;
      this.aP1[0] = entregasresumencliente_wcexport.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV17Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV21SDTEntregasResumenClientes = new GXBaseCollection<app.SdtSDTEntregasResumenCliente>(app.SdtSDTEntregasResumenCliente.class, "SDTEntregasResumenCliente", "TexplusNET", remoteHandle);
      AV16SDTEntregasResumenClientesItem = new app.SdtSDTEntregasResumenCliente(remoteHandle, context);
      AV34WebSession = httpContext.getWebSession();
      AV35Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV36Totkgs = DecimalUtil.ZERO ;
      AV37TotMts = DecimalUtil.ZERO ;
      AV26UserCustomValue = "" ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV19GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV41Station = "" ;
      GXt_char2 = "" ;
      AV42EmprCod = "" ;
      GXv_char3 = new String[1] ;
      AV43EmprNom = "" ;
      GXv_char6 = new String[1] ;
      AV44UsurCod = "" ;
      GXv_char7 = new String[1] ;
      AV45ALbProfch_char = "" ;
      AV48ALbProfch = GXutil.nullDate() ;
      AV46ALbProfch_to_char = "" ;
      AV47ALbProfch_to = GXutil.nullDate() ;
      AV55Pgmdesc = "" ;
      AV55Pgmdesc = httpContext.getMessage( "Entregas Resumen Cliente_WCExport", "") ;
      /* GeneXus formulas. */
      AV55Pgmdesc = httpContext.getMessage( "Entregas Resumen Cliente_WCExport", "") ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV51GXV1 ;
   private int AV52GXV2 ;
   private int AV53GXV3 ;
   private int AV54GXV4 ;
   private int AV38TotPzs ;
   private long AV30VisibleColumnCount ;
   private java.math.BigDecimal AV36Totkgs ;
   private java.math.BigDecimal AV37TotMts ;
   private String AV41Station ;
   private String GXt_char2 ;
   private String AV42EmprCod ;
   private String GXv_char3[] ;
   private String AV43EmprNom ;
   private String GXv_char6[] ;
   private String AV44UsurCod ;
   private String GXv_char7[] ;
   private String AV45ALbProfch_char ;
   private String AV46ALbProfch_to_char ;
   private String AV55Pgmdesc ;
   private java.util.Date AV48ALbProfch ;
   private java.util.Date AV47ALbProfch_to ;
   private boolean returnInSub ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV17Session ;
   private com.genexus.webpanels.WebSession AV34WebSession ;
   private GXBaseCollection<app.SdtSDTEntregasResumenCliente> AV21SDTEntregasResumenClientes ;
   private String[] aP1 ;
   private String[] aP0 ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV35Messages ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.SdtSDTEntregasResumenCliente AV16SDTEntregasResumenClientesItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV19GridState ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

