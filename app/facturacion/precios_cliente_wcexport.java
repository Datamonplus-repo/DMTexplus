package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precios_cliente_wcexport extends GXProcedure
{
   public precios_cliente_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precios_cliente_wcexport.class ), "" );
   }

   public precios_cliente_wcexport( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      precios_cliente_wcexport.this.aP1 = new String[] {""};
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
      precios_cliente_wcexport.this.aP0 = aP0;
      precios_cliente_wcexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV40Precios_cliente_Json = AV41WebSession.getValue("&Precios_cliente_Json") ;
      AV22Precios_cliente_SDT.fromJSonString(AV40Precios_cliente_Json, null);
      AV41WebSession.remove("&Precios_cliente_Json");
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
      AV11Filename = "./PrivateTempStorage/" + "Precios_cliente_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("Facturacion.Precios_cliente_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV18Session.getValue("Facturacion.Precios_cliente_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV48GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV49GXV2 = 1 ;
      while ( AV49GXV2 <= AV22Precios_cliente_SDT.size() )
      {
         AV16Precios_cliente_SDTItem = (app.facturacion.SdtPrecios_cliente_SDT_Item)((app.facturacion.SdtPrecios_cliente_SDT_Item)AV22Precios_cliente_SDT.elementAt(-1+AV49GXV2));
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S171 ();
         if (returnInSub) return;
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXutil.booltostr( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar()) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Forser(), GXv_char3) ;
            precios_cliente_wcexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Forserdsc(), GXv_char3) ;
            precios_cliente_wcexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum() );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod() );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnom(), GXv_char3) ;
            precios_cliente_wcexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Fornomcli(), GXv_char3) ;
            precios_cliente_wcexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Intdsc(), GXv_char3) ;
            precios_cliente_wcexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Grdtipart() );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Cr())) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Forcan())) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Pc())) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Mv())) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Pv())) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm())) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Obs(), GXv_char3) ;
            precios_cliente_wcexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime4 = GXutil.resetTime( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Forprefec() );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime4 = GXutil.resetTime( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Forfecant() );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_C_m())) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Cm())) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Fi())) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Ti() );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Mc())) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_F_i())) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Precios_cliente_SDTItem.getgxTv_SdtPrecios_cliente_SDT_Item_Forrelban())) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Seleccionar", "", "Op", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Forser", "", "Artigo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__ForSerdsc", "", "Descriçao", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Forcolnum", "", "Numero Côr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Tipcolcod", "", "TC", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Forcolnom", "", "Côr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__ForNomcli", "", "Côr Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__IntDsc", "", "Intensidade", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Grdtipart", "", "Classe", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Cr", "", "Custo da receita", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Forcan", "", "Concentração de corante", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__PC", "", "Preço de custo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__MV", "", "Margem na venda", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__PV", "", "Preço de venda", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__NewPreKgm", "", "Preço", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Obs", "", "Obs", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__ForPrefec", "", "Data Actual", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__ForFecant", "", "Data Ultima", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__C_M", "", "Custo por minuto com amortização", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Cm", "", "Custo por minuto sem amortização", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Fi", "", "Fator de ineficiência", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Ti", "", "Ti", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__Mc", "", "Mc", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__F_i", "", "Fi", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXv_SdtWWPColumnsSelector5[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, "Precios_cliente_SDT__ForRelban", "", "Rb", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      GXt_char2 = AV27UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.Precios_cliente_WCColumnsSelector", GXv_char3) ;
      precios_cliente_wcexport.this.GXt_char2 = GXv_char3[0] ;
      AV27UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector5[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector5, GXv_SdtWWPColumnsSelector6) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector5[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("Facturacion.Precios_cliente_WCGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.Precios_cliente_WCGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("Facturacion.Precios_cliente_WCGridState"), null, null);
      }
      AV44OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV43OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV50GXV3 = 1 ;
      while ( AV50GXV3 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV50GXV3));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV35Emprcod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV36Clicod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV39CliNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV37ForcolNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SP") == 0 )
         {
            AV38SP = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORBLO") == 0 )
         {
            AV45ForBlo = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV50GXV3 = (int)(AV50GXV3+1) ;
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
      this.aP0[0] = precios_cliente_wcexport.this.AV11Filename;
      this.aP1[0] = precios_cliente_wcexport.this.AV12ErrorMessage;
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
      AV40Precios_cliente_Json = "" ;
      AV41WebSession = httpContext.getWebSession();
      AV22Precios_cliente_SDT = new GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item>(app.facturacion.SdtPrecios_cliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV18Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV16Precios_cliente_SDTItem = new app.facturacion.SdtPrecios_cliente_SDT_Item(remoteHandle, context);
      GXt_dtime4 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV35Emprcod = "" ;
      AV39CliNom = "" ;
      AV45ForBlo = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV44OrderedBy ;
   private short AV38SP ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV48GXV1 ;
   private int AV49GXV2 ;
   private int AV50GXV3 ;
   private int AV36Clicod ;
   private int AV37ForcolNum ;
   private long AV31VisibleColumnCount ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV35Emprcod ;
   private String AV39CliNom ;
   private String AV45ForBlo ;
   private java.util.Date GXt_dtime4 ;
   private boolean returnInSub ;
   private boolean AV43OrderedDsc ;
   private String AV40Precios_cliente_Json ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV41WebSession ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item> AV22Precios_cliente_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.facturacion.SdtPrecios_cliente_SDT_Item AV16Precios_cliente_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

