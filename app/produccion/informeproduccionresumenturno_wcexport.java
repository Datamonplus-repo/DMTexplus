package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproduccionresumenturno_wcexport extends GXProcedure
{
   public informeproduccionresumenturno_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenturno_wcexport.class ), "" );
   }

   public informeproduccionresumenturno_wcexport( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             int aP6 ,
                             int aP7 ,
                             String[] aP8 )
   {
      informeproduccionresumenturno_wcexport.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String aP2 ,
                        String aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        int aP6 ,
                        int aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             int aP6 ,
                             int aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      informeproduccionresumenturno_wcexport.this.AV27Emprcod = aP0;
      informeproduccionresumenturno_wcexport.this.AV28HisEstReo = aP1;
      informeproduccionresumenturno_wcexport.this.AV29MaqCod1 = aP2;
      informeproduccionresumenturno_wcexport.this.AV30MaqCod2 = aP3;
      informeproduccionresumenturno_wcexport.this.AV34Hisprodti = aP4;
      informeproduccionresumenturno_wcexport.this.AV35Hisprodtf = aP5;
      informeproduccionresumenturno_wcexport.this.AV36OperarioFrom = aP6;
      informeproduccionresumenturno_wcexport.this.AV37OperarioTo = aP7;
      informeproduccionresumenturno_wcexport.this.aP8 = aP8;
      informeproduccionresumenturno_wcexport.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_objcol_SdtProduccionResumenTurno_SDT1 = AV21SDTProduccionResumenTurno ;
      GXv_objcol_SdtProduccionResumenTurno_SDT2[0] = GXt_objcol_SdtProduccionResumenTurno_SDT1 ;
      new app.produccionresumenturno_dp(remoteHandle, context).execute( AV27Emprcod, AV28HisEstReo, AV29MaqCod1, AV30MaqCod2, AV34Hisprodti, AV35Hisprodtf, AV36OperarioFrom, AV37OperarioTo, GXv_objcol_SdtProduccionResumenTurno_SDT2) ;
      GXt_objcol_SdtProduccionResumenTurno_SDT1 = GXv_objcol_SdtProduccionResumenTurno_SDT2[0] ;
      AV21SDTProduccionResumenTurno = GXt_objcol_SdtProduccionResumenTurno_SDT1 ;
      GXv_SdtWWPContext3[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext3) ;
      AV9WWPContext = GXv_SdtWWPContext3[0] ;
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
      AV11Filename = "./PrivateTempStorage/" + "InformeProduccionResumenTurno_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      AV25VisibleColumnCount = (short)(0) ;
      if ( 1 == 2 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Descripción", "") );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Descripción", "") );
      }
      AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Columnname( " " );
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Isvisible( true );
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Displayname( " " );
      AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().add(AV24ColumnsSelector_Column, 0);
      AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Columnname( httpContext.getMessage( "Descripcion", "") );
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Isvisible( true );
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Displayname( httpContext.getMessage( "Maquina", "") );
      AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().add(AV24ColumnsSelector_Column, 0);
      AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Columnname( httpContext.getMessage( "TurnoKgs1", "") );
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Isvisible( true );
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Displayname( httpContext.getMessage( "Kgs 1", "") );
      AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().add(AV24ColumnsSelector_Column, 0);
      AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Columnname( httpContext.getMessage( "TurnoKgs2", "") );
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Isvisible( true );
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Displayname( httpContext.getMessage( "Kgs 2", "") );
      AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().add(AV24ColumnsSelector_Column, 0);
      AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Columnname( httpContext.getMessage( "TurnoKgs3", "") );
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Isvisible( true );
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Displayname( httpContext.getMessage( "Kgs 3", "") );
      AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().add(AV24ColumnsSelector_Column, 0);
      AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Columnname( httpContext.getMessage( "TurnoKgs4", "") );
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Isvisible( true );
      AV24ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Displayname( httpContext.getMessage( "Kgs 4", "") );
      AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().add(AV24ColumnsSelector_Column, 0);
      AV40GXV1 = 1 ;
      while ( AV40GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV40GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+AV25VisibleColumnCount, 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+AV25VisibleColumnCount, 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+AV25VisibleColumnCount, 1, 1).setColor( 11 );
            AV25VisibleColumnCount = (short)(AV25VisibleColumnCount+1) ;
         }
         AV40GXV1 = (int)(AV40GXV1+1) ;
      }
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      if ( 1 == 2 )
      {
         AV41GXV2 = 1 ;
         while ( AV41GXV2 <= AV21SDTProduccionResumenTurno.size() )
         {
            AV16SDTProduccionResumenTurnoItem = (app.SdtProduccionResumenTurno_SDT)((app.SdtProduccionResumenTurno_SDT)AV21SDTProduccionResumenTurno.elementAt(-1+AV41GXV2));
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S151 ();
            if (returnInSub) return;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16SDTProduccionResumenTurnoItem.getgxTv_SdtProduccionResumenTurno_SDT_Maqdsc(), GXv_char5) ;
            informeproduccionresumenturno_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char4 );
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S161 ();
            if (returnInSub) return;
            AV41GXV2 = (int)(AV41GXV2+1) ;
         }
      }
      AV42GXV3 = 1 ;
      while ( AV42GXV3 <= AV21SDTProduccionResumenTurno.size() )
      {
         AV16SDTProduccionResumenTurnoItem = (app.SdtProduccionResumenTurno_SDT)((app.SdtProduccionResumenTurno_SDT)AV21SDTProduccionResumenTurno.elementAt(-1+AV42GXV3));
         AV13CellRow = (int)(AV13CellRow+1) ;
         AV33Col = (short)(0) ;
         AV10ExcelDocument.Cells(AV13CellRow, 1, 1, 1).setText( " " );
         AV43GXV4 = 1 ;
         while ( AV43GXV4 <= AV16SDTProduccionResumenTurnoItem.getgxTv_SdtProduccionResumenTurno_SDT_Turnos().size() )
         {
            AV26SDTProduccionResumenTurnoMaquina = (app.SdtProduccionResumenTurno_SDT_TurnosItem)((app.SdtProduccionResumenTurno_SDT_TurnosItem)AV16SDTProduccionResumenTurnoItem.getgxTv_SdtProduccionResumenTurno_SDT_Turnos().elementAt(-1+AV43GXV4));
            AV33Col = (short)(AV33Col+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S151 ();
            if (returnInSub) return;
            AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setText( AV16SDTProduccionResumenTurnoItem.getgxTv_SdtProduccionResumenTurno_SDT_Maqdsc() );
            if ( AV26SDTProduccionResumenTurnoMaquina.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno() == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, 3, 1, 1).setText( GXutil.str( AV26SDTProduccionResumenTurnoMaquina.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno(), 9, 2) );
            }
            else if ( AV26SDTProduccionResumenTurnoMaquina.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno() == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, 4, 1, 1).setText( GXutil.str( AV26SDTProduccionResumenTurnoMaquina.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno(), 9, 2) );
            }
            else if ( AV26SDTProduccionResumenTurnoMaquina.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno() == 3 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, 5, 1, 1).setText( GXutil.str( AV26SDTProduccionResumenTurnoMaquina.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno(), 9, 2) );
            }
            else if ( AV26SDTProduccionResumenTurnoMaquina.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno() == 4 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, 6, 1, 1).setText( GXutil.str( AV26SDTProduccionResumenTurnoMaquina.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno(), 9, 2) );
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S161 ();
            if (returnInSub) return;
            AV43GXV4 = (int)(AV43GXV4+1) ;
         }
         AV42GXV3 = (int)(AV42GXV3+1) ;
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
      if ( GXutil.strcmp(AV17Session.getValue("Produccion.InformeProduccionResumenTurno_WCGridState"), "") == 0 )
      {
         AV19GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.InformeProduccionResumenTurno_WCGridState"), null, null);
      }
      else
      {
         AV19GridState.fromxml(AV17Session.getValue("Produccion.InformeProduccionResumenTurno_WCGridState"), null, null);
      }
      AV44GXV5 = 1 ;
      while ( AV44GXV5 <= AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV44GXV5));
         if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV27Emprcod = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISESTREO") == 0 )
         {
            AV28HisEstReo = (byte)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD1") == 0 )
         {
            AV29MaqCod1 = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD2") == 0 )
         {
            AV30MaqCod2 = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROFEC1") == 0 )
         {
            AV31HisProFec1 = localUtil.ctod( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROFEC2") == 0 )
         {
            AV32HisProFec2 = localUtil.ctod( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPERARIOFROM") == 0 )
         {
            AV36OperarioFrom = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPERARIOTO") == 0 )
         {
            AV37OperarioTo = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV44GXV5 = (int)(AV44GXV5+1) ;
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
      this.aP8[0] = informeproduccionresumenturno_wcexport.this.AV11Filename;
      this.aP9[0] = informeproduccionresumenturno_wcexport.this.AV12ErrorMessage;
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
      AV21SDTProduccionResumenTurno = new GXBaseCollection<app.SdtProduccionResumenTurno_SDT>(app.SdtProduccionResumenTurno_SDT.class, "ProduccionResumenTurno_SDT", "TexplusNET", remoteHandle);
      GXt_objcol_SdtProduccionResumenTurno_SDT1 = new GXBaseCollection<app.SdtProduccionResumenTurno_SDT>(app.SdtProduccionResumenTurno_SDT.class, "ProduccionResumenTurno_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtProduccionResumenTurno_SDT2 = new GXBaseCollection[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext3 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV16SDTProduccionResumenTurnoItem = new app.SdtProduccionResumenTurno_SDT(remoteHandle, context);
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV26SDTProduccionResumenTurnoMaquina = new app.SdtProduccionResumenTurno_SDT_TurnosItem(remoteHandle, context);
      AV17Session = httpContext.getWebSession();
      AV19GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV20GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV31HisProFec1 = GXutil.nullDate() ;
      AV32HisProFec2 = GXutil.nullDate() ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV28HisEstReo ;
   private short AV25VisibleColumnCount ;
   private short AV33Col ;
   private short Gx_err ;
   private int AV36OperarioFrom ;
   private int AV37OperarioTo ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV40GXV1 ;
   private int AV41GXV2 ;
   private int AV42GXV3 ;
   private int AV43GXV4 ;
   private int AV44GXV5 ;
   private String AV27Emprcod ;
   private String AV29MaqCod1 ;
   private String AV30MaqCod2 ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV34Hisprodti ;
   private java.util.Date AV35Hisprodtf ;
   private java.util.Date AV31HisProFec1 ;
   private java.util.Date AV32HisProFec2 ;
   private boolean returnInSub ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV17Session ;
   private String[] aP9 ;
   private String[] aP8 ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private GXBaseCollection<app.SdtProduccionResumenTurno_SDT> AV21SDTProduccionResumenTurno ;
   private GXBaseCollection<app.SdtProduccionResumenTurno_SDT> GXt_objcol_SdtProduccionResumenTurno_SDT1 ;
   private GXBaseCollection<app.SdtProduccionResumenTurno_SDT> GXv_objcol_SdtProduccionResumenTurno_SDT2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext3[] ;
   private app.SdtProduccionResumenTurno_SDT AV16SDTProduccionResumenTurnoItem ;
   private app.SdtProduccionResumenTurno_SDT_TurnosItem AV26SDTProduccionResumenTurnoMaquina ;
   private app.wwpbaseobjects.SdtWWPGridState AV19GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV20GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

