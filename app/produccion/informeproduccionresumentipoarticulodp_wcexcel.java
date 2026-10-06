package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproduccionresumentipoarticulodp_wcexcel extends GXProcedure
{
   public informeproduccionresumentipoarticulodp_wcexcel( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumentipoarticulodp_wcexcel.class ), "" );
   }

   public informeproduccionresumentipoarticulodp_wcexcel( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String[] aP1 )
   {
      informeproduccionresumentipoarticulodp_wcexcel.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      informeproduccionresumentipoarticulodp_wcexcel.this.AV24SDTInformeProduccionResumenTipoArticuloJSon = aP0;
      informeproduccionresumentipoarticulodp_wcexcel.this.aP1 = aP1;
      informeproduccionresumentipoarticulodp_wcexcel.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22SDTInformeProduccionResumenTipoArticulo.fromJSonString(AV24SDTInformeProduccionResumenTipoArticuloJSon, null);
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV8CellRow = 1 ;
      AV13FirstColumn = 1 ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
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
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S171 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV21Random = (int)(GXutil.random( )*10000) ;
      AV12Filename = "InformeProduccionResumenTipoArticuloDP_WCExport-" + GXutil.trim( GXutil.str( AV21Random, 8, 0)) + ".xlsx" ;
      AV11ExcelDocument.Open(AV12Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV11ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setColor( 11 );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Tipo Articulo", "") );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+1, 1, 1).setColor( 11 );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Descripción", "") );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+2, 1, 1).setBold( (short)(1) );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+2, 1, 1).setColor( 11 );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+3, 1, 1).setBold( (short)(1) );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+3, 1, 1).setColor( 11 );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+3, 1, 1).setText( "%" );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+4, 1, 1).setBold( (short)(1) );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+4, 1, 1).setColor( 11 );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+5, 1, 1).setBold( (short)(1) );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+5, 1, 1).setColor( 11 );
      AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+5, 1, 1).setText( "%" );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV29GXV1 = 1 ;
      while ( AV29GXV1 <= AV22SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().size() )
      {
         AV23SDTInformeProduccionResumenTipoArticuloItem = (app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV22SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV29GXV1));
         AV8CellRow = (int)(AV8CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S151 ();
         if (returnInSub) return;
         AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+0, 1, 1).setNumber( AV23SDTInformeProduccionResumenTipoArticuloItem.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip() );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV23SDTInformeProduccionResumenTipoArticuloItem.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc(), GXv_char2) ;
         informeproduccionresumentipoarticulodp_wcexcel.this.GXt_char1 = GXv_char2[0] ;
         AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+1, 1, 1).setText( GXt_char1 );
         AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+2, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23SDTInformeProduccionResumenTipoArticuloItem.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr())) );
         AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23SDTInformeProduccionResumenTipoArticuloItem.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo())) );
         AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23SDTInformeProduccionResumenTipoArticuloItem.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr())) );
         AV11ExcelDocument.Cells(AV8CellRow, AV13FirstColumn+5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23SDTInformeProduccionResumenTipoArticuloItem.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro())) );
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S161 ();
         if (returnInSub) return;
         AV29GXV1 = (int)(AV29GXV1+1) ;
      }
   }

   public void S171( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV11ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV11ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV11ExcelDocument.getErrCode() != 0 )
      {
         AV12Filename = "" ;
         AV10ErrorMessage = AV11ExcelDocument.getErrDescription() ;
         AV11ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S181( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("Produccion.InformeProduccionResumenTipoArticuloDP_WCGridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.InformeProduccionResumenTipoArticuloDP_WCGridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV25Session.getValue("Produccion.InformeProduccionResumenTipoArticuloDP_WCGridState"), null, null);
      }
      AV30GXV2 = 1 ;
      while ( AV30GXV2 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV30GXV2));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV9Emprcod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISESTREO") == 0 )
         {
            AV16HisEstReo = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD1") == 0 )
         {
            AV19MaqCod1 = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD2") == 0 )
         {
            AV20MaqCod2 = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROFEC1") == 0 )
         {
            AV17HisProFec1 = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROFEC2") == 0 )
         {
            AV18HisProFec2 = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV30GXV2 = (int)(AV30GXV2+1) ;
      }
   }

   public void S151( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S161( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = informeproduccionresumentipoarticulodp_wcexcel.this.AV12Filename;
      this.aP2[0] = informeproduccionresumentipoarticulodp_wcexcel.this.AV10ErrorMessage;
      CloseOpenCursors();
      AV11ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Filename = "" ;
      AV10ErrorMessage = "" ;
      AV22SDTInformeProduccionResumenTipoArticulo = new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo(remoteHandle, context);
      AV11ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV23SDTInformeProduccionResumenTipoArticuloItem = new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV25Session = httpContext.getWebSession();
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV9Emprcod = "" ;
      AV19MaqCod1 = "" ;
      AV20MaqCod2 = "" ;
      AV17HisProFec1 = GXutil.nullDate() ;
      AV18HisProFec2 = GXutil.nullDate() ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16HisEstReo ;
   private short Gx_err ;
   private int AV8CellRow ;
   private int AV13FirstColumn ;
   private int AV21Random ;
   private int AV29GXV1 ;
   private int AV30GXV2 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV9Emprcod ;
   private String AV19MaqCod1 ;
   private String AV20MaqCod2 ;
   private java.util.Date AV17HisProFec1 ;
   private java.util.Date AV18HisProFec2 ;
   private boolean returnInSub ;
   private String AV24SDTInformeProduccionResumenTipoArticuloJSon ;
   private String AV12Filename ;
   private String AV10ErrorMessage ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP2 ;
   private String[] aP1 ;
   private com.genexus.gxoffice.ExcelDoc AV11ExcelDocument ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoArticulo AV22SDTInformeProduccionResumenTipoArticulo ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem AV23SDTInformeProduccionResumenTipoArticuloItem ;
}

