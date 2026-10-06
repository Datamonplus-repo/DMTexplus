package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class resumenfacturacion_wcexport extends GXProcedure
{
   public resumenfacturacion_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( resumenfacturacion_wcexport.class ), "" );
   }

   public resumenfacturacion_wcexport( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      resumenfacturacion_wcexport.this.aP1 = new String[] {""};
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
      resumenfacturacion_wcexport.this.aP0 = aP0;
      resumenfacturacion_wcexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV42ResumenFacturacion_SDT_json = AV41Websession.getValue(httpContext.getMessage( "&ResumenFacturacion_SDT_json", "")) ;
      AV21ResumenFacturacion_SDT.fromJSonString(AV42ResumenFacturacion_SDT_json, null);
      AV41Websession.remove(httpContext.getMessage( "&ResumenFacturacion_SDT_json", ""));
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
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "ResumenFacturacion_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV17Session.getValue("Facturacion.ResumenFacturacion_WCColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV17Session.getValue("Facturacion.ResumenFacturacion_WCColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV48GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV49GXV2 = 1 ;
      while ( AV49GXV2 <= AV21ResumenFacturacion_SDT.size() )
      {
         AV16ResumenFacturacion_SDTItem = (app.facturacion.SdtResumenFacturacion_SDT_Item)((app.facturacion.SdtResumenFacturacion_SDT_Item)AV21ResumenFacturacion_SDT.elementAt(-1+AV49GXV2));
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S171 ();
         if (returnInSub) return;
         AV30VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( AV16ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Faccod() );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime2 = GXutil.resetTime( AV16ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Facfch() );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( GXt_dtime2 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( AV16ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Clicod() );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char3 = "" ;
            GXv_char4[0] = GXt_char3 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Clinom(), GXv_char4) ;
            resumenfacturacion_wcexport.this.GXt_char3 = GXv_char4[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char3 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Facimptot())) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Facimppp())) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Facivaimp())) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Facimpgen())) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Factot())) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra())) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( AV16ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra() );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16ResumenFacturacion_SDTItem.getgxTv_SdtResumenFacturacion_SDT_Item_Pre_medio())) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S181 ();
         if (returnInSub) return;
         AV49GXV2 = (int)(AV49GXV2+1) ;
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
      GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "ResumenFacturacion_SDT__Faccod", "", "Nº Factura", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "ResumenFacturacion_SDT__FacFch", "", "Fecha", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "ResumenFacturacion_SDT__CliCod", "", "Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "ResumenFacturacion_SDT__CliNom", "", "Nombre", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "ResumenFacturacion_SDT__FacImpTot", "", "Valor", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "ResumenFacturacion_SDT__FacImpPP", "", "Imp. Dto. PP", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "ResumenFacturacion_SDT__FacIVAImp", "", "Imp. IVA", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "ResumenFacturacion_SDT__FacImpGen", "", "Imp. Dto. Gral.", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "ResumenFacturacion_SDT__FacTot", "", "TOTAL", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "ResumenFacturacion_SDT__Kgs_Fra", "", "Kgs Fact.", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      if ( AV50Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "ResumenFacturacion_SDT__Pzs_fra", "", "Pcs. Fact.", true, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "", "", "", false, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
      GXv_SdtWWPColumnsSelector5[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "ResumenFacturacion_SDT__Pre_medio", "", "Precio medio p/kg", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXt_char3 = AV26UserCustomValue ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.ResumenFacturacion_WCColumnsSelector", GXv_char4) ;
      resumenfacturacion_wcexport.this.GXt_char3 = GXv_char4[0] ;
      AV26UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, GXv_SdtWWPColumnsSelector6) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector5[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV17Session.getValue("Facturacion.ResumenFacturacion_WCGridState"), "") == 0 )
      {
         AV19GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.ResumenFacturacion_WCGridState"), null, null);
      }
      else
      {
         AV19GridState.fromxml(AV17Session.getValue("Facturacion.ResumenFacturacion_WCGridState"), null, null);
      }
      AV51GXV3 = 1 ;
      while ( AV51GXV3 <= AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV3));
         if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34Emprcod = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODFROM") == 0 )
         {
            AV35ClicodFrom = (short)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODTO") == 0 )
         {
            AV36ClicodTo = (short)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACFCHFROM") == 0 )
         {
            AV37FacFchfrom = (short)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACFCHTO") == 0 )
         {
            AV38FacFchto = (short)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACSERNUM") == 0 )
         {
            AV39FacSerNum = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FACPRI") == 0 )
         {
            AV40FacPri = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SERIEF") == 0 )
         {
            AV45serief = (short)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV51GXV3 = (int)(AV51GXV3+1) ;
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

   protected void cleanup( )
   {
      this.aP0[0] = resumenfacturacion_wcexport.this.AV11Filename;
      this.aP1[0] = resumenfacturacion_wcexport.this.AV12ErrorMessage;
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
      AV42ResumenFacturacion_SDT_json = "" ;
      AV41Websession = httpContext.getWebSession();
      AV21ResumenFacturacion_SDT = new GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item>(app.facturacion.SdtResumenFacturacion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV17Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV16ResumenFacturacion_SDTItem = new app.facturacion.SdtResumenFacturacion_SDT_Item(remoteHandle, context);
      GXt_dtime2 = GXutil.resetTime( GXutil.nullDate() );
      AV50Moda21 = DecimalUtil.ZERO ;
      AV26UserCustomValue = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV19GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV20GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV34Emprcod = "" ;
      AV39FacSerNum = "" ;
      AV40FacPri = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV35ClicodFrom ;
   private short AV36ClicodTo ;
   private short AV37FacFchfrom ;
   private short AV38FacFchto ;
   private short AV45serief ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV48GXV1 ;
   private int AV49GXV2 ;
   private int AV51GXV3 ;
   private long AV30VisibleColumnCount ;
   private java.math.BigDecimal AV50Moda21 ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV34Emprcod ;
   private String AV39FacSerNum ;
   private String AV40FacPri ;
   private java.util.Date GXt_dtime2 ;
   private boolean returnInSub ;
   private String AV42ResumenFacturacion_SDT_json ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV41Websession ;
   private com.genexus.webpanels.WebSession AV17Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item> AV21ResumenFacturacion_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.facturacion.SdtResumenFacturacion_SDT_Item AV16ResumenFacturacion_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV19GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV20GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

