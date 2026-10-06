package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consumoscolorservice_wcexport extends GXProcedure
{
   public consumoscolorservice_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consumoscolorservice_wcexport.class ), "" );
   }

   public consumoscolorservice_wcexport( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consumoscolorservice_wcexport.this.aP1 = new String[] {""};
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
      consumoscolorservice_wcexport.this.aP0 = aP0;
      consumoscolorservice_wcexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
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
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "ConsumosColorService_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFWP_ID) && (0==AV35TFWP_ID_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "ID", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFWP_ID );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFWP_ID_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV36TFWP_Start) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Date Time Start", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV36TFWP_Start );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV38TFWP_Date) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Date Time", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV38TFWP_Date );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFWP_BatchCode_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Batch Code", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFWP_BatchCode_Sel, GXv_char5) ;
         consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFWP_BatchCode)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Batch Code", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFWP_BatchCode, GXv_char5) ;
            consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV42TFWP_CallOffCSv) && (0==AV43TFWP_CallOffCSv_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Call Off", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFWP_CallOffCSv );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFWP_CallOffCSv_To );
      }
      if ( ! ( (0==AV44TFWP_ReDyeCSv) && (0==AV45TFWP_ReDyeCSv_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Re Dye", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFWP_ReDyeCSv );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFWP_ReDyeCSv_To );
      }
      if ( ! ( (GXutil.strcmp("", AV47TFWP_MachineCode_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Machine", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFWP_MachineCode_Sel, GXv_char5) ;
         consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFWP_MachineCode)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Machine", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFWP_MachineCode, GXv_char5) ;
            consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV48TFWP_TankCode) && (0==AV49TFWP_TankCode_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tank", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFWP_TankCode );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFWP_TankCode_To );
      }
      if ( ! ( (GXutil.strcmp("", AV51TFWP_ProductCSv_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Product", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFWP_ProductCSv_Sel, GXv_char5) ;
         consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFWP_ProductCSv)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Product", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFWP_ProductCSv, GXv_char5) ;
            consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFWP_ToDose)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFWP_ToDose_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "To Dose", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFWP_ToDose)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFWP_ToDose_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFWP_Dosed)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFWP_Dosed_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dosed", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54TFWP_Dosed)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV55TFWP_Dosed_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV57TFWP_ProdBatchCode_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Batch", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFWP_ProdBatchCode_Sel, GXv_char5) ;
         consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFWP_ProdBatchCode)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Batch", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFWP_ProdBatchCode, GXv_char5) ;
            consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV58TFWP_DosingOrigin) && (0==AV59TFWP_DosingOrigin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dosing Origin", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV58TFWP_DosingOrigin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV59TFWP_DosingOrigin_To );
      }
      if ( ! ( (0==AV60TFWP_StatusCSv) && (0==AV61TFWP_StatusCSv_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Status", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV60TFWP_StatusCSv );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoscolorservice_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV61TFWP_StatusCSv_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ConsumosColorService_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.ConsumosColorService_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV74GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV76Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV63WP_Batchcode ;
      AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV18FilterFullText ;
      AV78Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV34TFWP_ID ;
      AV79Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV35TFWP_ID_To ;
      AV80Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV36TFWP_Start ;
      AV81Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV38TFWP_Date ;
      AV82Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV40TFWP_BatchCode ;
      AV83Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV41TFWP_BatchCode_Sel ;
      AV84Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV42TFWP_CallOffCSv ;
      AV85Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV43TFWP_CallOffCSv_To ;
      AV86Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV44TFWP_ReDyeCSv ;
      AV87Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV45TFWP_ReDyeCSv_To ;
      AV88Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV46TFWP_MachineCode ;
      AV89Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV47TFWP_MachineCode_Sel ;
      AV90Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV48TFWP_TankCode ;
      AV91Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV49TFWP_TankCode_To ;
      AV92Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV50TFWP_ProductCSv ;
      AV93Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV51TFWP_ProductCSv_Sel ;
      AV94Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV52TFWP_ToDose ;
      AV95Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV53TFWP_ToDose_To ;
      AV96Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV54TFWP_Dosed ;
      AV97Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV55TFWP_Dosed_To ;
      AV98Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV56TFWP_ProdBatchCode ;
      AV99Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV57TFWP_ProdBatchCode_Sel ;
      AV100Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV58TFWP_DosingOrigin ;
      AV101Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV59TFWP_DosingOrigin_To ;
      AV102Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV60TFWP_StatusCSv ;
      AV103Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV61TFWP_StatusCSv_To ;
      pr_colorservice.dynParam(0, new Object[]{ new Object[]{
                                           AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                           Long.valueOf(AV78Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) ,
                                           Long.valueOf(AV79Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) ,
                                           AV80Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                           AV81Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                           AV83Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                           AV82Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                           Integer.valueOf(AV84Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) ,
                                           Integer.valueOf(AV85Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) ,
                                           Integer.valueOf(AV86Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) ,
                                           Integer.valueOf(AV87Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) ,
                                           AV89Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                           AV88Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                           Integer.valueOf(AV90Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) ,
                                           Integer.valueOf(AV91Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) ,
                                           AV93Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                           AV92Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                           AV94Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                           AV95Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                           AV96Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                           AV97Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                           AV99Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                           AV98Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                           Integer.valueOf(AV100Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) ,
                                           Integer.valueOf(AV101Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) ,
                                           Integer.valueOf(AV102Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) ,
                                           Integer.valueOf(AV103Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) ,
                                           Long.valueOf(A13948WP_ID) ,
                                           A13951WP_BatchCo ,
                                           Integer.valueOf(A13952WP_CallOff) ,
                                           Integer.valueOf(A13953WP_ReDyeCS) ,
                                           A13954WP_Machine ,
                                           Integer.valueOf(A13955WP_TankCod) ,
                                           A13956WP_Product ,
                                           A13957WP_ToDose ,
                                           A13958WP_Dosed ,
                                           A13959WP_ProdBat ,
                                           Integer.valueOf(A13960WP_DosingO) ,
                                           Integer.valueOf(A13961WP_StatusC) ,
                                           A13949WP_Start ,
                                           A13950WP_Date ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV76Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode ,
                                           Integer.valueOf(AV69colorserviceID) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV82Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = GXutil.concat( GXutil.rtrim( AV82Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode), "%", "") ;
      lV88Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = GXutil.concat( GXutil.rtrim( AV88Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode), "%", "") ;
      lV92Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = GXutil.concat( GXutil.rtrim( AV92Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv), "%", "") ;
      lV98Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = GXutil.concat( GXutil.rtrim( AV98Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode), "%", "") ;
      /* Using cursor P09EP2 */
      pr_colorservice.execute(0, new Object[] {Integer.valueOf(AV69colorserviceID), AV76Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode, lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, Long.valueOf(AV78Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id), Long.valueOf(AV79Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to), AV80Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start, AV81Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date, lV82Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode, AV83Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel, Integer.valueOf(AV84Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv), Integer.valueOf(AV85Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to), Integer.valueOf(AV86Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv), Integer.valueOf(AV87Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to), lV88Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode, AV89Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel, Integer.valueOf(AV90Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode), Integer.valueOf(AV91Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to), lV92Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv, AV93Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel, AV94Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose, AV95Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to, AV96Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed, AV97Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to, lV98Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode, AV99Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel, Integer.valueOf(AV100Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin), Integer.valueOf(AV101Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to), Integer.valueOf(AV102Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv), Integer.valueOf(AV103Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to)});
      while ( (pr_colorservice.getStatus(0) != 101) )
      {
         A13961WP_StatusC = P09EP2_A13961WP_StatusC[0] ;
         A13960WP_DosingO = P09EP2_A13960WP_DosingO[0] ;
         A13959WP_ProdBat = P09EP2_A13959WP_ProdBat[0] ;
         A13958WP_Dosed = P09EP2_A13958WP_Dosed[0] ;
         A13957WP_ToDose = P09EP2_A13957WP_ToDose[0] ;
         A13956WP_Product = P09EP2_A13956WP_Product[0] ;
         A13955WP_TankCod = P09EP2_A13955WP_TankCod[0] ;
         A13954WP_Machine = P09EP2_A13954WP_Machine[0] ;
         A13953WP_ReDyeCS = P09EP2_A13953WP_ReDyeCS[0] ;
         A13952WP_CallOff = P09EP2_A13952WP_CallOff[0] ;
         A13950WP_Date = P09EP2_A13950WP_Date[0] ;
         A13949WP_Start = P09EP2_A13949WP_Start[0] ;
         A13948WP_ID = P09EP2_A13948WP_ID[0] ;
         A13951WP_BatchCo = P09EP2_A13951WP_BatchCo[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_colorservice.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13948WP_ID );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A13949WP_Start );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A13950WP_Date );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13951WP_BatchCo, GXv_char5) ;
            consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13952WP_CallOff );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13953WP_ReDyeCS );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13954WP_Machine, GXv_char5) ;
            consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13955WP_TankCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13956WP_Product, GXv_char5) ;
            consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13957WP_ToDose)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13958WP_Dosed)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13959WP_ProdBat, GXv_char5) ;
            consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13960WP_DosingO );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV70comentario = ((0==A13960WP_DosingO) ? httpContext.getMessage( "Acerto", "") : "") ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70comentario, GXv_char5) ;
            consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13961WP_StatusC );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV104Recfornro = (byte)(A13952WP_CallOff) ;
            AV105Productcode = A13956WP_Product ;
            AV71RecLin = (short)(0) ;
            /* Using cursor P09EP3 */
            pr_default.execute(0, new Object[] {AV64emprcod, Integer.valueOf(AV65barcod), Byte.valueOf(AV66barcodreo), AV67barcodpar, Short.valueOf(AV68reclinmaq)});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A2804RecLinMaq = P09EP3_A2804RecLinMaq[0] ;
               A130BarCodPar = P09EP3_A130BarCodPar[0] ;
               A132BarCodReo = P09EP3_A132BarCodReo[0] ;
               A129BarCod = P09EP3_A129BarCod[0] ;
               A396EmprCod = P09EP3_A396EmprCod[0] ;
               A872RecPrdNum = P09EP3_A872RecPrdNum[0] ;
               A2394RecForNro = P09EP3_A2394RecForNro[0] ;
               A811RecLin = P09EP3_A811RecLin[0] ;
               A1273RecLinPro = P09EP3_A1273RecLinPro[0] ;
               if ( ( AV104Recfornro == A2394RecForNro ) && ( GXutil.strcmp(A872RecPrdNum, GXutil.trim( AV105Productcode)) == 0 ) )
               {
                  AV71RecLin = A811RecLin ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(0);
            }
            pr_default.close(0);
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV71RecLin );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_colorservice.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_colorservice.readNext(0);
      }
      pr_colorservice.close(0);
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
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_ID", "", "ID", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_Start", "", "Date Time Start", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_Date", "", "Date Time", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_BatchCode", "", "Batch Code", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_CallOffCSv", "", "Call Off", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_ReDyeCSv", "", "Re Dye", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_MachineCode", "", "Machine", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_TankCode", "", "Tank", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_ProductCSv", "", "Product", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_ToDose", "", "To Dose", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_Dosed", "", "Dosed", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_ProdBatchCode", "", "Batch", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_DosingOrigin", "", "Dosing Origin", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&comentario", "", "", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "WP_StatusCSv", "", "Status", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&RecLin", "", "Txp", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ConsumosColorService_WCColumnsSelector", GXv_char5) ;
      consumoscolorservice_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ConsumosColorService_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ConsumosColorService_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FormulacionTinte.ConsumosColorService_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV107GXV2 = 1 ;
      while ( AV107GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV107GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_ID") == 0 )
         {
            AV34TFWP_ID = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV35TFWP_ID_To = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_START") == 0 )
         {
            AV36TFWP_Start = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_DATE") == 0 )
         {
            AV38TFWP_Date = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_BATCHCODE") == 0 )
         {
            AV40TFWP_BatchCode = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_BATCHCODE_SEL") == 0 )
         {
            AV41TFWP_BatchCode_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_CALLOFFCSV") == 0 )
         {
            AV42TFWP_CallOffCSv = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFWP_CallOffCSv_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_REDYECSV") == 0 )
         {
            AV44TFWP_ReDyeCSv = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFWP_ReDyeCSv_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_MACHINECODE") == 0 )
         {
            AV46TFWP_MachineCode = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_MACHINECODE_SEL") == 0 )
         {
            AV47TFWP_MachineCode_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_TANKCODE") == 0 )
         {
            AV48TFWP_TankCode = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFWP_TankCode_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODUCTCSV") == 0 )
         {
            AV50TFWP_ProductCSv = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODUCTCSV_SEL") == 0 )
         {
            AV51TFWP_ProductCSv_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_TODOSE") == 0 )
         {
            AV52TFWP_ToDose = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFWP_ToDose_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_DOSED") == 0 )
         {
            AV54TFWP_Dosed = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFWP_Dosed_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODBATCHCODE") == 0 )
         {
            AV56TFWP_ProdBatchCode = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODBATCHCODE_SEL") == 0 )
         {
            AV57TFWP_ProdBatchCode_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_DOSINGORIGIN") == 0 )
         {
            AV58TFWP_DosingOrigin = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFWP_DosingOrigin_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_STATUSCSV") == 0 )
         {
            AV60TFWP_StatusCSv = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFWP_StatusCSv_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&WP_BATCHCODE") == 0 )
         {
            AV63WP_Batchcode = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV64emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV65barcod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV66barcodreo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV67barcodpar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV68reclinmaq = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV107GXV2 = (int)(AV107GXV2+1) ;
      }
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = consumoscolorservice_wcexport.this.AV11Filename;
      this.aP1[0] = consumoscolorservice_wcexport.this.AV12ErrorMessage;
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
      AV18FilterFullText = "" ;
      AV36TFWP_Start = GXutil.resetTime( GXutil.nullDate() );
      AV38TFWP_Date = GXutil.resetTime( GXutil.nullDate() );
      AV41TFWP_BatchCode_Sel = "" ;
      AV40TFWP_BatchCode = "" ;
      AV47TFWP_MachineCode_Sel = "" ;
      AV46TFWP_MachineCode = "" ;
      AV51TFWP_ProductCSv_Sel = "" ;
      AV50TFWP_ProductCSv = "" ;
      AV52TFWP_ToDose = DecimalUtil.ZERO ;
      AV53TFWP_ToDose_To = DecimalUtil.ZERO ;
      AV54TFWP_Dosed = DecimalUtil.ZERO ;
      AV55TFWP_Dosed_To = DecimalUtil.ZERO ;
      AV57TFWP_ProdBatchCode_Sel = "" ;
      AV56TFWP_ProdBatchCode = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13949WP_Start = GXutil.resetTime( GXutil.nullDate() );
      A13950WP_Date = GXutil.resetTime( GXutil.nullDate() );
      A13951WP_BatchCo = "" ;
      A13954WP_Machine = "" ;
      A13956WP_Product = "" ;
      A13957WP_ToDose = DecimalUtil.ZERO ;
      A13958WP_Dosed = DecimalUtil.ZERO ;
      A13959WP_ProdBat = "" ;
      AV76Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = "" ;
      AV63WP_Batchcode = "" ;
      AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = "" ;
      AV80Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = GXutil.resetTime( GXutil.nullDate() );
      AV81Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = GXutil.resetTime( GXutil.nullDate() );
      AV82Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = "" ;
      AV83Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = "" ;
      AV88Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = "" ;
      AV89Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = "" ;
      AV92Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = "" ;
      AV93Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = "" ;
      AV94Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = DecimalUtil.ZERO ;
      AV95Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = DecimalUtil.ZERO ;
      AV96Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = DecimalUtil.ZERO ;
      AV97Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = DecimalUtil.ZERO ;
      AV98Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = "" ;
      AV99Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = "" ;
      scmdbuf = "" ;
      lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = "" ;
      lV82Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = "" ;
      lV88Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = "" ;
      lV92Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = "" ;
      lV98Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = "" ;
      P09EP2_A13961WP_StatusC = new int[1] ;
      P09EP2_A13960WP_DosingO = new int[1] ;
      P09EP2_A13959WP_ProdBat = new String[] {""} ;
      P09EP2_A13958WP_Dosed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EP2_A13957WP_ToDose = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EP2_A13956WP_Product = new String[] {""} ;
      P09EP2_A13955WP_TankCod = new int[1] ;
      P09EP2_A13954WP_Machine = new String[] {""} ;
      P09EP2_A13953WP_ReDyeCS = new int[1] ;
      P09EP2_A13952WP_CallOff = new int[1] ;
      P09EP2_A13950WP_Date = new java.util.Date[] {GXutil.nullDate()} ;
      P09EP2_A13949WP_Start = new java.util.Date[] {GXutil.nullDate()} ;
      P09EP2_A13948WP_ID = new long[1] ;
      P09EP2_A13951WP_BatchCo = new String[] {""} ;
      AV70comentario = "" ;
      AV105Productcode = "" ;
      AV64emprcod = "" ;
      AV67barcodpar = "" ;
      P09EP3_A2804RecLinMaq = new short[1] ;
      P09EP3_A130BarCodPar = new String[] {""} ;
      P09EP3_A132BarCodReo = new byte[1] ;
      P09EP3_A129BarCod = new int[1] ;
      P09EP3_A396EmprCod = new String[] {""} ;
      P09EP3_A872RecPrdNum = new String[] {""} ;
      P09EP3_A2394RecForNro = new byte[1] ;
      P09EP3_A811RecLin = new short[1] ;
      P09EP3_A1273RecLinPro = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A872RecPrdNum = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consumoscolorservice_wcexport__default(),
         new Object[] {
             new Object[] {
            P09EP3_A2804RecLinMaq, P09EP3_A130BarCodPar, P09EP3_A132BarCodReo, P09EP3_A129BarCod, P09EP3_A396EmprCod, P09EP3_A872RecPrdNum, P09EP3_A2394RecForNro, P09EP3_A811RecLin, P09EP3_A1273RecLinPro
            }
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consumoscolorservice_wcexport__colorservice(),
         new Object[] {
             new Object[] {
            P09EP2_A13961WP_StatusC, P09EP2_A13960WP_DosingO, P09EP2_A13959WP_ProdBat, P09EP2_A13958WP_Dosed, P09EP2_A13957WP_ToDose, P09EP2_A13956WP_Product, P09EP2_A13955WP_TankCod, P09EP2_A13954WP_Machine, P09EP2_A13953WP_ReDyeCS, P09EP2_A13952WP_CallOff,
            P09EP2_A13950WP_Date, P09EP2_A13949WP_Start, P09EP2_A13948WP_ID, P09EP2_A13951WP_BatchCo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV104Recfornro ;
   private byte AV66barcodreo ;
   private byte A132BarCodReo ;
   private byte A2394RecForNro ;
   private byte A1273RecLinPro ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short AV71RecLin ;
   private short AV68reclinmaq ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV42TFWP_CallOffCSv ;
   private int AV43TFWP_CallOffCSv_To ;
   private int AV44TFWP_ReDyeCSv ;
   private int AV45TFWP_ReDyeCSv_To ;
   private int AV48TFWP_TankCode ;
   private int AV49TFWP_TankCode_To ;
   private int AV58TFWP_DosingOrigin ;
   private int AV59TFWP_DosingOrigin_To ;
   private int AV60TFWP_StatusCSv ;
   private int AV61TFWP_StatusCSv_To ;
   private int AV74GXV1 ;
   private int A13952WP_CallOff ;
   private int A13953WP_ReDyeCS ;
   private int A13955WP_TankCod ;
   private int A13960WP_DosingO ;
   private int A13961WP_StatusC ;
   private int AV84Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv ;
   private int AV85Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to ;
   private int AV86Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv ;
   private int AV87Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to ;
   private int AV90Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode ;
   private int AV91Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to ;
   private int AV100Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin ;
   private int AV101Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to ;
   private int AV102Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv ;
   private int AV103Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to ;
   private int AV69colorserviceID ;
   private int AV65barcod ;
   private int A129BarCod ;
   private int AV107GXV2 ;
   private long AV34TFWP_ID ;
   private long AV35TFWP_ID_To ;
   private long AV31VisibleColumnCount ;
   private long A13948WP_ID ;
   private long AV78Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id ;
   private long AV79Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to ;
   private java.math.BigDecimal AV52TFWP_ToDose ;
   private java.math.BigDecimal AV53TFWP_ToDose_To ;
   private java.math.BigDecimal AV54TFWP_Dosed ;
   private java.math.BigDecimal AV55TFWP_Dosed_To ;
   private java.math.BigDecimal A13957WP_ToDose ;
   private java.math.BigDecimal A13958WP_Dosed ;
   private java.math.BigDecimal AV94Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ;
   private java.math.BigDecimal AV95Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ;
   private java.math.BigDecimal AV96Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ;
   private java.math.BigDecimal AV97Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ;
   private String scmdbuf ;
   private String AV70comentario ;
   private String AV64emprcod ;
   private String AV67barcodpar ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A872RecPrdNum ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV36TFWP_Start ;
   private java.util.Date AV38TFWP_Date ;
   private java.util.Date A13949WP_Start ;
   private java.util.Date A13950WP_Date ;
   private java.util.Date AV80Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ;
   private java.util.Date AV81Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV41TFWP_BatchCode_Sel ;
   private String AV40TFWP_BatchCode ;
   private String AV47TFWP_MachineCode_Sel ;
   private String AV46TFWP_MachineCode ;
   private String AV51TFWP_ProductCSv_Sel ;
   private String AV50TFWP_ProductCSv ;
   private String AV57TFWP_ProdBatchCode_Sel ;
   private String AV56TFWP_ProdBatchCode ;
   private String A13951WP_BatchCo ;
   private String A13954WP_Machine ;
   private String A13956WP_Product ;
   private String A13959WP_ProdBat ;
   private String AV76Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode ;
   private String AV63WP_Batchcode ;
   private String AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ;
   private String AV82Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ;
   private String AV83Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ;
   private String AV88Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ;
   private String AV89Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ;
   private String AV92Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ;
   private String AV93Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ;
   private String AV98Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ;
   private String AV99Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ;
   private String lV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ;
   private String lV82Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ;
   private String lV88Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ;
   private String lV92Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ;
   private String lV98Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ;
   private String AV105Productcode ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_colorservice ;
   private int[] P09EP2_A13961WP_StatusC ;
   private int[] P09EP2_A13960WP_DosingO ;
   private String[] P09EP2_A13959WP_ProdBat ;
   private java.math.BigDecimal[] P09EP2_A13958WP_Dosed ;
   private java.math.BigDecimal[] P09EP2_A13957WP_ToDose ;
   private String[] P09EP2_A13956WP_Product ;
   private int[] P09EP2_A13955WP_TankCod ;
   private String[] P09EP2_A13954WP_Machine ;
   private int[] P09EP2_A13953WP_ReDyeCS ;
   private int[] P09EP2_A13952WP_CallOff ;
   private java.util.Date[] P09EP2_A13950WP_Date ;
   private java.util.Date[] P09EP2_A13949WP_Start ;
   private long[] P09EP2_A13948WP_ID ;
   private String[] P09EP2_A13951WP_BatchCo ;
   private IDataStoreProvider pr_default ;
   private short[] P09EP3_A2804RecLinMaq ;
   private String[] P09EP3_A130BarCodPar ;
   private byte[] P09EP3_A132BarCodReo ;
   private int[] P09EP3_A129BarCod ;
   private String[] P09EP3_A396EmprCod ;
   private String[] P09EP3_A872RecPrdNum ;
   private byte[] P09EP3_A2394RecForNro ;
   private short[] P09EP3_A811RecLin ;
   private byte[] P09EP3_A1273RecLinPro ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class consumoscolorservice_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EP3", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecPrdNum, RecForNro, RecLin, RecLinPro FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

final  class consumoscolorservice_wcexport__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                          long AV78Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id ,
                                          long AV79Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to ,
                                          java.util.Date AV80Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                          java.util.Date AV81Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                          String AV83Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                          String AV82Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                          int AV84Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv ,
                                          int AV85Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to ,
                                          int AV86Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv ,
                                          int AV87Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to ,
                                          String AV89Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                          String AV88Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                          int AV90Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode ,
                                          int AV91Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to ,
                                          String AV93Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                          String AV92Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                          java.math.BigDecimal AV94Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                          java.math.BigDecimal AV95Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                          java.math.BigDecimal AV96Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                          java.math.BigDecimal AV97Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                          String AV99Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                          String AV98Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                          int AV100Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin ,
                                          int AV101Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to ,
                                          int AV102Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv ,
                                          int AV103Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to ,
                                          long A13948WP_ID ,
                                          String A13951WP_BatchCo ,
                                          int A13952WP_CallOff ,
                                          int A13953WP_ReDyeCS ,
                                          String A13954WP_Machine ,
                                          int A13955WP_TankCod ,
                                          String A13956WP_Product ,
                                          java.math.BigDecimal A13957WP_ToDose ,
                                          java.math.BigDecimal A13958WP_Dosed ,
                                          String A13959WP_ProdBat ,
                                          int A13960WP_DosingO ,
                                          int A13961WP_StatusC ,
                                          java.util.Date A13949WP_Start ,
                                          java.util.Date A13950WP_Date ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV76Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode ,
                                          int AV69colorserviceID )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[40];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT [Status], [DosingOrigin], [ProductBatchCode], [Dosed], [ToDose], [ProductCode], [TankCode], [MachineCode], [ReDye], [CallOff], [DateTime], [DateTimeStart]," ;
      scmdbuf += " [id], [BatchCode] FROM [TXPWeightProduct] WITH (NOLOCK)" ;
      addWhere(sWhereString, "([id] > ?)");
      addWhere(sWhereString, "([BatchCode] = ?)");
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( CONVERT( char(12), CAST([id] AS decimal(12,0))) like '%' + ?) or ( UPPER([BatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([CallOff] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([ReDye] AS decimal(5,0))) like '%' + ?) or ( UPPER([MachineCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([TankCode] AS decimal(5,0))) like '%' + ?) or ( UPPER([ProductCode]) like '%' + UPPER(?)) or ( CONVERT( char(10), CAST([ToDose] AS decimal(10,2))) like '%' + ?) or ( CONVERT( char(10), CAST([Dosed] AS decimal(10,2))) like '%' + ?) or ( UPPER([ProductBatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([DosingOrigin] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([Status] AS decimal(5,0))) like '%' + ?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) )
      {
         addWhere(sWhereString, "([id] >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) )
      {
         addWhere(sWhereString, "([id] <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV80Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start) )
      {
         addWhere(sWhereString, "([DateTimeStart] >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date) )
      {
         addWhere(sWhereString, "([DateTime] >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([BatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) )
      {
         addWhere(sWhereString, "([BatchCode] = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) )
      {
         addWhere(sWhereString, "([CallOff] >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) )
      {
         addWhere(sWhereString, "([CallOff] <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) )
      {
         addWhere(sWhereString, "([ReDye] >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) )
      {
         addWhere(sWhereString, "([ReDye] <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) && ( ! (GXutil.strcmp("", AV88Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([MachineCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) )
      {
         addWhere(sWhereString, "([MachineCode] = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) )
      {
         addWhere(sWhereString, "([TankCode] >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV91Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) )
      {
         addWhere(sWhereString, "([TankCode] <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) && ( ! (GXutil.strcmp("", AV92Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) )
      {
         addWhere(sWhereString, "([ProductCode] = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose)==0) )
      {
         addWhere(sWhereString, "([ToDose] >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to)==0) )
      {
         addWhere(sWhereString, "([ToDose] <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed)==0) )
      {
         addWhere(sWhereString, "([Dosed] >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to)==0) )
      {
         addWhere(sWhereString, "([Dosed] <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductBatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) )
      {
         addWhere(sWhereString, "([ProductBatchCode] = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) )
      {
         addWhere(sWhereString, "([DosingOrigin] >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV101Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) )
      {
         addWhere(sWhereString, "([DosingOrigin] <= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) )
      {
         addWhere(sWhereString, "([Status] >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) )
      {
         addWhere(sWhereString, "([Status] <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode]" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [CallOff]" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [CallOff] DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [id]" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [id] DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [DateTimeStart]" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [DateTimeStart] DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [DateTime]" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [DateTime] DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [ReDye]" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [ReDye] DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [MachineCode]" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [MachineCode] DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [TankCode]" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [TankCode] DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [ProductCode]" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [ProductCode] DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [ToDose]" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [ToDose] DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [Dosed]" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [Dosed] DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [ProductBatchCode]" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [ProductBatchCode] DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [DosingOrigin]" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [DosingOrigin] DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [Status]" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [Status] DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P09EP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((long[]) buf[12])[0] = rslt.getLong(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[54]).longValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[55]).longValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[56], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

