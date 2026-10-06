package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproduccionresumenturnodp_wcexport extends GXProcedure
{
   public informeproduccionresumenturnodp_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenturnodp_wcexport.class ), "" );
   }

   public informeproduccionresumenturnodp_wcexport( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      informeproduccionresumenturnodp_wcexport.this.aP1 = new String[] {""};
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
      informeproduccionresumenturnodp_wcexport.this.aP0 = aP0;
      informeproduccionresumenturnodp_wcexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34SDTProduccionResumenTurnojson = AV35WebSession.getValue(httpContext.getMessage( "&SDTProduccionResumenTurno", "")) ;
      AV29SDTProduccionResumenTurno.fromJSonString(AV34SDTProduccionResumenTurnojson, null);
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
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "InformeProduccionResumenTurnoDP_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Descripción", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Kgs 1", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV29SDTProduccionResumenTurno.size() )
      {
         AV24SDTProduccionResumenTurnoItem = (app.SdtProduccionResumenTurno_SDT)((app.SdtProduccionResumenTurno_SDT)AV29SDTProduccionResumenTurno.elementAt(-1+AV41GXV1));
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S151 ();
         if (returnInSub) return;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV24SDTProduccionResumenTurnoItem.getgxTv_SdtProduccionResumenTurno_SDT_Maqdsc(), GXv_char3) ;
         informeproduccionresumenturnodp_wcexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char2 );
         AV30TurnoKgs1 = DecimalUtil.ZERO ;
         AV36TurnoKgs2 = DecimalUtil.ZERO ;
         AV37TurnoKgs3 = DecimalUtil.ZERO ;
         AV38TurnoKgs4 = DecimalUtil.ZERO ;
         AV42GXV2 = 1 ;
         while ( AV42GXV2 <= ((app.SdtProduccionResumenTurno_SDT)(AV29SDTProduccionResumenTurno.currentItem())).getgxTv_SdtProduccionResumenTurno_SDT_Turnos().size() )
         {
            AV33SDTProduccionResumenTurno_Turnos = (app.SdtProduccionResumenTurno_SDT_TurnosItem)((app.SdtProduccionResumenTurno_SDT_TurnosItem)((app.SdtProduccionResumenTurno_SDT)(AV29SDTProduccionResumenTurno.currentItem())).getgxTv_SdtProduccionResumenTurno_SDT_Turnos().elementAt(-1+AV42GXV2));
            if ( AV33SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno() == 1 )
            {
               AV30TurnoKgs1 = AV33SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno() ;
            }
            else if ( AV33SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno() == 2 )
            {
               AV36TurnoKgs2 = AV33SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno() ;
            }
            else if ( AV33SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno() == 3 )
            {
               AV37TurnoKgs3 = AV33SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno() ;
            }
            else if ( AV33SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno() == 4 )
            {
               AV38TurnoKgs4 = AV33SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno() ;
            }
            AV42GXV2 = (int)(AV42GXV2+1) ;
         }
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV30TurnoKgs1)) );
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S161 ();
         if (returnInSub) return;
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S171( )
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

   public void S181( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("Produccion.InformeProduccionResumenTurnoDP_WCGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.InformeProduccionResumenTurnoDP_WCGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("Produccion.InformeProduccionResumenTurnoDP_WCGridState"), null, null);
      }
      AV43GXV3 = 1 ;
      while ( AV43GXV3 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV3));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISESTREO") == 0 )
         {
            AV17HisEstReo = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD1") == 0 )
         {
            AV18MaqCod1 = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD2") == 0 )
         {
            AV19MaqCod2 = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROFEC1") == 0 )
         {
            AV20HisProFec1 = localUtil.ctot( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROFEC2") == 0 )
         {
            AV21HisProFec2 = localUtil.ctot( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPERARIOFROM") == 0 )
         {
            AV22OperarioFrom = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPERARIOTO") == 0 )
         {
            AV23OperarioTo = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV43GXV3 = (int)(AV43GXV3+1) ;
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
      this.aP0[0] = informeproduccionresumenturnodp_wcexport.this.AV11Filename;
      this.aP1[0] = informeproduccionresumenturnodp_wcexport.this.AV12ErrorMessage;
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
      AV34SDTProduccionResumenTurnojson = "" ;
      AV35WebSession = httpContext.getWebSession();
      AV29SDTProduccionResumenTurno = new GXBaseCollection<app.SdtProduccionResumenTurno_SDT>(app.SdtProduccionResumenTurno_SDT.class, "ProduccionResumenTurno_SDT", "TexplusNET", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV24SDTProduccionResumenTurnoItem = new app.SdtProduccionResumenTurno_SDT(remoteHandle, context);
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV30TurnoKgs1 = DecimalUtil.ZERO ;
      AV36TurnoKgs2 = DecimalUtil.ZERO ;
      AV37TurnoKgs3 = DecimalUtil.ZERO ;
      AV38TurnoKgs4 = DecimalUtil.ZERO ;
      AV33SDTProduccionResumenTurno_Turnos = new app.SdtProduccionResumenTurno_SDT_TurnosItem(remoteHandle, context);
      AV25Session = httpContext.getWebSession();
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV16Emprcod = "" ;
      AV18MaqCod1 = "" ;
      AV19MaqCod2 = "" ;
      AV20HisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      AV21HisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17HisEstReo ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV41GXV1 ;
   private int AV42GXV2 ;
   private int AV43GXV3 ;
   private int AV22OperarioFrom ;
   private int AV23OperarioTo ;
   private java.math.BigDecimal AV30TurnoKgs1 ;
   private java.math.BigDecimal AV36TurnoKgs2 ;
   private java.math.BigDecimal AV37TurnoKgs3 ;
   private java.math.BigDecimal AV38TurnoKgs4 ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV16Emprcod ;
   private String AV18MaqCod1 ;
   private String AV19MaqCod2 ;
   private java.util.Date AV20HisProFec1 ;
   private java.util.Date AV21HisProFec2 ;
   private boolean returnInSub ;
   private String AV34SDTProduccionResumenTurnojson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV35WebSession ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private GXBaseCollection<app.SdtProduccionResumenTurno_SDT> AV29SDTProduccionResumenTurno ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.SdtProduccionResumenTurno_SDT AV24SDTProduccionResumenTurnoItem ;
   private app.SdtProduccionResumenTurno_SDT_TurnosItem AV33SDTProduccionResumenTurno_Turnos ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
}

