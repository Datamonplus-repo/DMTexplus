package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmaqui1wwexport extends GXProcedure
{
   public tmaqui1wwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqui1wwexport.class ), "" );
   }

   public tmaqui1wwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmaqui1wwexport.this.aP1 = new String[] {""};
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
      tmaqui1wwexport.this.aP0 = aP0;
      tmaqui1wwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TMAQUI1WWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV91FilterFullText, GXv_char5) ;
      tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV49TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFMaqCod_Sel, GXv_char5) ;
         tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFMaqCod, GXv_char5) ;
            tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFMaqDsc_Sel, GXv_char5) ;
         tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFMaqDsc, GXv_char5) ;
            tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV63TFMaqEst_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFMaqEst_Sel, GXv_char5) ;
         tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFMaqEst)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFMaqEst, GXv_char5) ;
            tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV94TFMaqTinTip_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV94TFMaqTinTip_Sel, GXv_char5) ;
         tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV93TFMaqTinTip)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV93TFMaqTinTip, GXv_char5) ;
            tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV95TFMaqVolMin) && (0==AV96TFMaqVolMin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Vol Min", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV95TFMaqVolMin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV96TFMaqVolMin_To );
      }
      if ( ! ( (0==AV97TFMaqVolMed) && (0==AV98TFMaqVolMed_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Vol Med", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV97TFMaqVolMed );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV98TFMaqVolMed_To );
      }
      if ( ! ( (0==AV99TFMaqVolTop) && (0==AV100TFMaqVolTop_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Vol Tope ( CO )", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV99TFMaqVolTop );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV100TFMaqVolTop_To );
      }
      if ( ! ( (0==AV101TFMaqVolRes) && (0==AV102TFMaqVolRes_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Vol Residual", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV101TFMaqVolRes );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV102TFMaqVolRes_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80TFMaqKgsMax)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81TFMaqKgsMax_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kgs Max", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV80TFMaqKgsMax)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV81TFMaqKgsMax_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFMaqKgsMed)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFMaqKgsMed_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kgs Med", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV78TFMaqKgsMed)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV79TFMaqKgsMed_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFMaqKgsMin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFMaqKgsMin_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kgs Min", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV76TFMaqKgsMin)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV77TFMaqKgsMin_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV71TFTipMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo MQ", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFTipMaqCod_Sel, GXv_char5) ;
         tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV70TFTipMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo MQ", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFTipMaqCod, GXv_char5) ;
            tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV73TFTipMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFTipMaqDsc_Sel, GXv_char5) ;
         tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV72TFTipMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmaqui1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFTipMaqDsc, GXv_char5) ;
            tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV45VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV33Session.getValue("TMAQUI1WWColumnsSelector"), "") != 0 )
      {
         AV40ColumnsSelectorXML = AV33Session.getValue("TMAQUI1WWColumnsSelector") ;
         AV37ColumnsSelector.fromxml(AV40ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV105GXV1 = 1 ;
      while ( AV105GXV1 <= AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV39ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV105GXV1));
         if ( AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setColor( 11 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         AV105GXV1 = (int)(AV105GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV107Tmaqui1wwds_1_filterfulltext = AV91FilterFullText ;
      AV108Tmaqui1wwds_2_tfmaqcod = AV48TFMaqCod ;
      AV109Tmaqui1wwds_3_tfmaqcod_sel = AV49TFMaqCod_Sel ;
      AV110Tmaqui1wwds_4_tfmaqdsc = AV50TFMaqDsc ;
      AV111Tmaqui1wwds_5_tfmaqdsc_sel = AV51TFMaqDsc_Sel ;
      AV112Tmaqui1wwds_6_tfmaqest = AV62TFMaqEst ;
      AV113Tmaqui1wwds_7_tfmaqest_sel = AV63TFMaqEst_Sel ;
      AV114Tmaqui1wwds_8_tfmaqtintip = AV93TFMaqTinTip ;
      AV115Tmaqui1wwds_9_tfmaqtintip_sel = AV94TFMaqTinTip_Sel ;
      AV116Tmaqui1wwds_10_tfmaqvolmin = AV95TFMaqVolMin ;
      AV117Tmaqui1wwds_11_tfmaqvolmin_to = AV96TFMaqVolMin_To ;
      AV118Tmaqui1wwds_12_tfmaqvolmed = AV97TFMaqVolMed ;
      AV119Tmaqui1wwds_13_tfmaqvolmed_to = AV98TFMaqVolMed_To ;
      AV120Tmaqui1wwds_14_tfmaqvoltop = AV99TFMaqVolTop ;
      AV121Tmaqui1wwds_15_tfmaqvoltop_to = AV100TFMaqVolTop_To ;
      AV122Tmaqui1wwds_16_tfmaqvolres = AV101TFMaqVolRes ;
      AV123Tmaqui1wwds_17_tfmaqvolres_to = AV102TFMaqVolRes_To ;
      AV124Tmaqui1wwds_18_tfmaqkgsmax = AV80TFMaqKgsMax ;
      AV125Tmaqui1wwds_19_tfmaqkgsmax_to = AV81TFMaqKgsMax_To ;
      AV126Tmaqui1wwds_20_tfmaqkgsmed = AV78TFMaqKgsMed ;
      AV127Tmaqui1wwds_21_tfmaqkgsmed_to = AV79TFMaqKgsMed_To ;
      AV128Tmaqui1wwds_22_tfmaqkgsmin = AV76TFMaqKgsMin ;
      AV129Tmaqui1wwds_23_tfmaqkgsmin_to = AV77TFMaqKgsMin_To ;
      AV130Tmaqui1wwds_24_tftipmaqcod = AV70TFTipMaqCod ;
      AV131Tmaqui1wwds_25_tftipmaqcod_sel = AV71TFTipMaqCod_Sel ;
      AV132Tmaqui1wwds_26_tftipmaqdsc = AV72TFTipMaqDsc ;
      AV133Tmaqui1wwds_27_tftipmaqdsc_sel = AV73TFTipMaqDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV107Tmaqui1wwds_1_filterfulltext ,
                                           AV109Tmaqui1wwds_3_tfmaqcod_sel ,
                                           AV108Tmaqui1wwds_2_tfmaqcod ,
                                           AV111Tmaqui1wwds_5_tfmaqdsc_sel ,
                                           AV110Tmaqui1wwds_4_tfmaqdsc ,
                                           AV113Tmaqui1wwds_7_tfmaqest_sel ,
                                           AV112Tmaqui1wwds_6_tfmaqest ,
                                           AV115Tmaqui1wwds_9_tfmaqtintip_sel ,
                                           AV114Tmaqui1wwds_8_tfmaqtintip ,
                                           Integer.valueOf(AV116Tmaqui1wwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV117Tmaqui1wwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV118Tmaqui1wwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV119Tmaqui1wwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV120Tmaqui1wwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV121Tmaqui1wwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV122Tmaqui1wwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV123Tmaqui1wwds_17_tfmaqvolres_to) ,
                                           AV124Tmaqui1wwds_18_tfmaqkgsmax ,
                                           AV125Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                           AV126Tmaqui1wwds_20_tfmaqkgsmed ,
                                           AV127Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                           AV128Tmaqui1wwds_22_tfmaqkgsmin ,
                                           AV129Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                           AV131Tmaqui1wwds_25_tftipmaqcod_sel ,
                                           AV130Tmaqui1wwds_24_tftipmaqcod ,
                                           AV133Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                           AV132Tmaqui1wwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A607MaqEst ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A625MaqVolMin) ,
                                           Integer.valueOf(A624MaqVolMed) ,
                                           Integer.valueOf(A2802MaqVolTop) ,
                                           Integer.valueOf(A2801MaqVolRes) ,
                                           A4285MaqKgsMax ,
                                           A4284MaqKgsMed ,
                                           A4283MaqKgsMin ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV107Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV108Tmaqui1wwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV108Tmaqui1wwds_2_tfmaqcod), 6, "%") ;
      lV110Tmaqui1wwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV110Tmaqui1wwds_4_tfmaqdsc), 16, "%") ;
      lV112Tmaqui1wwds_6_tfmaqest = GXutil.padr( GXutil.rtrim( AV112Tmaqui1wwds_6_tfmaqest), 1, "%") ;
      lV114Tmaqui1wwds_8_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV114Tmaqui1wwds_8_tfmaqtintip), 2, "%") ;
      lV130Tmaqui1wwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV130Tmaqui1wwds_24_tftipmaqcod), 4, "%") ;
      lV132Tmaqui1wwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV132Tmaqui1wwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P08312 */
      pr_default.execute(0, new Object[] {lV107Tmaqui1wwds_1_filterfulltext, lV107Tmaqui1wwds_1_filterfulltext, lV107Tmaqui1wwds_1_filterfulltext, lV107Tmaqui1wwds_1_filterfulltext, lV107Tmaqui1wwds_1_filterfulltext, lV107Tmaqui1wwds_1_filterfulltext, lV107Tmaqui1wwds_1_filterfulltext, lV107Tmaqui1wwds_1_filterfulltext, lV107Tmaqui1wwds_1_filterfulltext, lV107Tmaqui1wwds_1_filterfulltext, lV107Tmaqui1wwds_1_filterfulltext, lV107Tmaqui1wwds_1_filterfulltext, lV107Tmaqui1wwds_1_filterfulltext, lV108Tmaqui1wwds_2_tfmaqcod, AV109Tmaqui1wwds_3_tfmaqcod_sel, lV110Tmaqui1wwds_4_tfmaqdsc, AV111Tmaqui1wwds_5_tfmaqdsc_sel, lV112Tmaqui1wwds_6_tfmaqest, AV113Tmaqui1wwds_7_tfmaqest_sel, lV114Tmaqui1wwds_8_tfmaqtintip, AV115Tmaqui1wwds_9_tfmaqtintip_sel, Integer.valueOf(AV116Tmaqui1wwds_10_tfmaqvolmin), Integer.valueOf(AV117Tmaqui1wwds_11_tfmaqvolmin_to), Integer.valueOf(AV118Tmaqui1wwds_12_tfmaqvolmed), Integer.valueOf(AV119Tmaqui1wwds_13_tfmaqvolmed_to), Integer.valueOf(AV120Tmaqui1wwds_14_tfmaqvoltop), Integer.valueOf(AV121Tmaqui1wwds_15_tfmaqvoltop_to), Integer.valueOf(AV122Tmaqui1wwds_16_tfmaqvolres), Integer.valueOf(AV123Tmaqui1wwds_17_tfmaqvolres_to), AV124Tmaqui1wwds_18_tfmaqkgsmax, AV125Tmaqui1wwds_19_tfmaqkgsmax_to, AV126Tmaqui1wwds_20_tfmaqkgsmed, AV127Tmaqui1wwds_21_tfmaqkgsmed_to, AV128Tmaqui1wwds_22_tfmaqkgsmin, AV129Tmaqui1wwds_23_tfmaqkgsmin_to, lV130Tmaqui1wwds_24_tftipmaqcod, AV131Tmaqui1wwds_25_tftipmaqcod_sel, lV132Tmaqui1wwds_26_tftipmaqdsc, AV133Tmaqui1wwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08312_A396EmprCod[0] ;
         A1012TipMaqDsc = P08312_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08312_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P08312_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08312_n1011TipMaqCod[0] ;
         A4283MaqKgsMin = P08312_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P08312_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P08312_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P08312_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P08312_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P08312_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P08312_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P08312_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P08312_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P08312_n2802MaqVolTop[0] ;
         A624MaqVolMed = P08312_A624MaqVolMed[0] ;
         n624MaqVolMed = P08312_n624MaqVolMed[0] ;
         A625MaqVolMin = P08312_A625MaqVolMin[0] ;
         n625MaqVolMin = P08312_n625MaqVolMin[0] ;
         A619MaqTinTip = P08312_A619MaqTinTip[0] ;
         n619MaqTinTip = P08312_n619MaqTinTip[0] ;
         A607MaqEst = P08312_A607MaqEst[0] ;
         n607MaqEst = P08312_n607MaqEst[0] ;
         A606MaqDsc = P08312_A606MaqDsc[0] ;
         n606MaqDsc = P08312_n606MaqDsc[0] ;
         A602MaqCod = P08312_A602MaqCod[0] ;
         A1012TipMaqDsc = P08312_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08312_n1012TipMaqDsc[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV45VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
            tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A606MaqDsc, GXv_char5) ;
            tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A607MaqEst, GXv_char5) ;
            tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A619MaqTinTip, GXv_char5) ;
            tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A625MaqVolMin );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A624MaqVolMed );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A2802MaqVolTop );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A2801MaqVolRes );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4285MaqKgsMax)) );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4284MaqKgsMed)) );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4283MaqKgsMin)) );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1011TipMaqCod, GXv_char5) ;
            tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1012TipMaqDsc, GXv_char5) ;
            tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
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
      AV37ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqCod", "", "Cod.", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqDsc", "", "Descripcion", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqEst", "", "E", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqTinTip", "", "Tipo", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqVolMin", "", "Vol Min", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqVolMed", "", "Vol Med", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqVolTop", "", "Vol Tope ( CO )", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqVolRes", "", "Vol Residual", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqKgsMax", "", "Kgs Max", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqKgsMed", "", "Kgs Med", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqKgsMin", "", "Kgs Min", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipMaqCod", "", "Tipo MQ", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipMaqDsc", "", "Descripción", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV41UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMAQUI1WWColumnsSelector", GXv_char5) ;
      tmaqui1wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV41UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV41UserCustomValue)==0) ) )
      {
         AV38ColumnsSelectorAux.fromxml(AV41UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV38ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV38ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("TMAQUI1WWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMAQUI1WWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("TMAQUI1WWGridState"), null, null);
      }
      AV16OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV134GXV2 = 1 ;
      while ( AV134GXV2 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV134GXV2));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV91FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV48TFMaqCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV49TFMaqCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV50TFMaqDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV51TFMaqDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST") == 0 )
         {
            AV62TFMaqEst = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST_SEL") == 0 )
         {
            AV63TFMaqEst_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP") == 0 )
         {
            AV93TFMaqTinTip = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP_SEL") == 0 )
         {
            AV94TFMaqTinTip_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMIN") == 0 )
         {
            AV95TFMaqVolMin = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV96TFMaqVolMin_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMED") == 0 )
         {
            AV97TFMaqVolMed = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV98TFMaqVolMed_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLTOP") == 0 )
         {
            AV99TFMaqVolTop = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV100TFMaqVolTop_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLRES") == 0 )
         {
            AV101TFMaqVolRes = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV102TFMaqVolRes_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMAX") == 0 )
         {
            AV80TFMaqKgsMax = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV81TFMaqKgsMax_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMED") == 0 )
         {
            AV78TFMaqKgsMed = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV79TFMaqKgsMed_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMIN") == 0 )
         {
            AV76TFMaqKgsMin = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV77TFMaqKgsMin_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV70TFTipMaqCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV71TFTipMaqCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV72TFTipMaqDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV73TFTipMaqDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV134GXV2 = (int)(AV134GXV2+1) ;
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
      this.aP0[0] = tmaqui1wwexport.this.AV11Filename;
      this.aP1[0] = tmaqui1wwexport.this.AV12ErrorMessage;
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
      AV91FilterFullText = "" ;
      AV49TFMaqCod_Sel = "" ;
      AV48TFMaqCod = "" ;
      AV51TFMaqDsc_Sel = "" ;
      AV50TFMaqDsc = "" ;
      AV63TFMaqEst_Sel = "" ;
      AV62TFMaqEst = "" ;
      AV94TFMaqTinTip_Sel = "" ;
      AV93TFMaqTinTip = "" ;
      AV80TFMaqKgsMax = DecimalUtil.ZERO ;
      AV81TFMaqKgsMax_To = DecimalUtil.ZERO ;
      AV78TFMaqKgsMed = DecimalUtil.ZERO ;
      AV79TFMaqKgsMed_To = DecimalUtil.ZERO ;
      AV76TFMaqKgsMin = DecimalUtil.ZERO ;
      AV77TFMaqKgsMin_To = DecimalUtil.ZERO ;
      AV71TFTipMaqCod_Sel = "" ;
      AV70TFTipMaqCod = "" ;
      AV73TFTipMaqDsc_Sel = "" ;
      AV72TFTipMaqDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV33Session = httpContext.getWebSession();
      AV40ColumnsSelectorXML = "" ;
      AV37ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A607MaqEst = "" ;
      A619MaqTinTip = "" ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      AV107Tmaqui1wwds_1_filterfulltext = "" ;
      AV108Tmaqui1wwds_2_tfmaqcod = "" ;
      AV109Tmaqui1wwds_3_tfmaqcod_sel = "" ;
      AV110Tmaqui1wwds_4_tfmaqdsc = "" ;
      AV111Tmaqui1wwds_5_tfmaqdsc_sel = "" ;
      AV112Tmaqui1wwds_6_tfmaqest = "" ;
      AV113Tmaqui1wwds_7_tfmaqest_sel = "" ;
      AV114Tmaqui1wwds_8_tfmaqtintip = "" ;
      AV115Tmaqui1wwds_9_tfmaqtintip_sel = "" ;
      AV124Tmaqui1wwds_18_tfmaqkgsmax = DecimalUtil.ZERO ;
      AV125Tmaqui1wwds_19_tfmaqkgsmax_to = DecimalUtil.ZERO ;
      AV126Tmaqui1wwds_20_tfmaqkgsmed = DecimalUtil.ZERO ;
      AV127Tmaqui1wwds_21_tfmaqkgsmed_to = DecimalUtil.ZERO ;
      AV128Tmaqui1wwds_22_tfmaqkgsmin = DecimalUtil.ZERO ;
      AV129Tmaqui1wwds_23_tfmaqkgsmin_to = DecimalUtil.ZERO ;
      AV130Tmaqui1wwds_24_tftipmaqcod = "" ;
      AV131Tmaqui1wwds_25_tftipmaqcod_sel = "" ;
      AV132Tmaqui1wwds_26_tftipmaqdsc = "" ;
      AV133Tmaqui1wwds_27_tftipmaqdsc_sel = "" ;
      scmdbuf = "" ;
      lV107Tmaqui1wwds_1_filterfulltext = "" ;
      lV108Tmaqui1wwds_2_tfmaqcod = "" ;
      lV110Tmaqui1wwds_4_tfmaqdsc = "" ;
      lV112Tmaqui1wwds_6_tfmaqest = "" ;
      lV114Tmaqui1wwds_8_tfmaqtintip = "" ;
      lV130Tmaqui1wwds_24_tftipmaqcod = "" ;
      lV132Tmaqui1wwds_26_tftipmaqdsc = "" ;
      P08312_A396EmprCod = new String[] {""} ;
      P08312_A1012TipMaqDsc = new String[] {""} ;
      P08312_n1012TipMaqDsc = new boolean[] {false} ;
      P08312_A1011TipMaqCod = new String[] {""} ;
      P08312_n1011TipMaqCod = new boolean[] {false} ;
      P08312_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08312_n4283MaqKgsMin = new boolean[] {false} ;
      P08312_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08312_n4284MaqKgsMed = new boolean[] {false} ;
      P08312_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08312_n4285MaqKgsMax = new boolean[] {false} ;
      P08312_A2801MaqVolRes = new int[1] ;
      P08312_n2801MaqVolRes = new boolean[] {false} ;
      P08312_A2802MaqVolTop = new int[1] ;
      P08312_n2802MaqVolTop = new boolean[] {false} ;
      P08312_A624MaqVolMed = new int[1] ;
      P08312_n624MaqVolMed = new boolean[] {false} ;
      P08312_A625MaqVolMin = new int[1] ;
      P08312_n625MaqVolMin = new boolean[] {false} ;
      P08312_A619MaqTinTip = new String[] {""} ;
      P08312_n619MaqTinTip = new boolean[] {false} ;
      P08312_A607MaqEst = new String[] {""} ;
      P08312_n607MaqEst = new boolean[] {false} ;
      P08312_A606MaqDsc = new String[] {""} ;
      P08312_n606MaqDsc = new boolean[] {false} ;
      P08312_A602MaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV41UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV38ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqui1wwexport__default(),
         new Object[] {
             new Object[] {
            P08312_A396EmprCod, P08312_A1012TipMaqDsc, P08312_n1012TipMaqDsc, P08312_A1011TipMaqCod, P08312_n1011TipMaqCod, P08312_A4283MaqKgsMin, P08312_n4283MaqKgsMin, P08312_A4284MaqKgsMed, P08312_n4284MaqKgsMed, P08312_A4285MaqKgsMax,
            P08312_n4285MaqKgsMax, P08312_A2801MaqVolRes, P08312_n2801MaqVolRes, P08312_A2802MaqVolTop, P08312_n2802MaqVolTop, P08312_A624MaqVolMed, P08312_n624MaqVolMed, P08312_A625MaqVolMin, P08312_n625MaqVolMin, P08312_A619MaqTinTip,
            P08312_n619MaqTinTip, P08312_A607MaqEst, P08312_n607MaqEst, P08312_A606MaqDsc, P08312_n606MaqDsc, P08312_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV95TFMaqVolMin ;
   private int AV96TFMaqVolMin_To ;
   private int AV97TFMaqVolMed ;
   private int AV98TFMaqVolMed_To ;
   private int AV99TFMaqVolTop ;
   private int AV100TFMaqVolTop_To ;
   private int AV101TFMaqVolRes ;
   private int AV102TFMaqVolRes_To ;
   private int AV105GXV1 ;
   private int A625MaqVolMin ;
   private int A624MaqVolMed ;
   private int A2802MaqVolTop ;
   private int A2801MaqVolRes ;
   private int AV116Tmaqui1wwds_10_tfmaqvolmin ;
   private int AV117Tmaqui1wwds_11_tfmaqvolmin_to ;
   private int AV118Tmaqui1wwds_12_tfmaqvolmed ;
   private int AV119Tmaqui1wwds_13_tfmaqvolmed_to ;
   private int AV120Tmaqui1wwds_14_tfmaqvoltop ;
   private int AV121Tmaqui1wwds_15_tfmaqvoltop_to ;
   private int AV122Tmaqui1wwds_16_tfmaqvolres ;
   private int AV123Tmaqui1wwds_17_tfmaqvolres_to ;
   private int AV134GXV2 ;
   private long AV45VisibleColumnCount ;
   private java.math.BigDecimal AV80TFMaqKgsMax ;
   private java.math.BigDecimal AV81TFMaqKgsMax_To ;
   private java.math.BigDecimal AV78TFMaqKgsMed ;
   private java.math.BigDecimal AV79TFMaqKgsMed_To ;
   private java.math.BigDecimal AV76TFMaqKgsMin ;
   private java.math.BigDecimal AV77TFMaqKgsMin_To ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A4284MaqKgsMed ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal AV124Tmaqui1wwds_18_tfmaqkgsmax ;
   private java.math.BigDecimal AV125Tmaqui1wwds_19_tfmaqkgsmax_to ;
   private java.math.BigDecimal AV126Tmaqui1wwds_20_tfmaqkgsmed ;
   private java.math.BigDecimal AV127Tmaqui1wwds_21_tfmaqkgsmed_to ;
   private java.math.BigDecimal AV128Tmaqui1wwds_22_tfmaqkgsmin ;
   private java.math.BigDecimal AV129Tmaqui1wwds_23_tfmaqkgsmin_to ;
   private String AV49TFMaqCod_Sel ;
   private String AV48TFMaqCod ;
   private String AV51TFMaqDsc_Sel ;
   private String AV50TFMaqDsc ;
   private String AV63TFMaqEst_Sel ;
   private String AV62TFMaqEst ;
   private String AV94TFMaqTinTip_Sel ;
   private String AV93TFMaqTinTip ;
   private String AV71TFTipMaqCod_Sel ;
   private String AV70TFTipMaqCod ;
   private String AV73TFTipMaqDsc_Sel ;
   private String AV72TFTipMaqDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A607MaqEst ;
   private String A619MaqTinTip ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private String AV108Tmaqui1wwds_2_tfmaqcod ;
   private String AV109Tmaqui1wwds_3_tfmaqcod_sel ;
   private String AV110Tmaqui1wwds_4_tfmaqdsc ;
   private String AV111Tmaqui1wwds_5_tfmaqdsc_sel ;
   private String AV112Tmaqui1wwds_6_tfmaqest ;
   private String AV113Tmaqui1wwds_7_tfmaqest_sel ;
   private String AV114Tmaqui1wwds_8_tfmaqtintip ;
   private String AV115Tmaqui1wwds_9_tfmaqtintip_sel ;
   private String AV130Tmaqui1wwds_24_tftipmaqcod ;
   private String AV131Tmaqui1wwds_25_tftipmaqcod_sel ;
   private String AV132Tmaqui1wwds_26_tftipmaqdsc ;
   private String AV133Tmaqui1wwds_27_tftipmaqdsc_sel ;
   private String scmdbuf ;
   private String lV108Tmaqui1wwds_2_tfmaqcod ;
   private String lV110Tmaqui1wwds_4_tfmaqdsc ;
   private String lV112Tmaqui1wwds_6_tfmaqest ;
   private String lV114Tmaqui1wwds_8_tfmaqtintip ;
   private String lV130Tmaqui1wwds_24_tftipmaqcod ;
   private String lV132Tmaqui1wwds_26_tftipmaqdsc ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n1012TipMaqDsc ;
   private boolean n1011TipMaqCod ;
   private boolean n4283MaqKgsMin ;
   private boolean n4284MaqKgsMed ;
   private boolean n4285MaqKgsMax ;
   private boolean n2801MaqVolRes ;
   private boolean n2802MaqVolTop ;
   private boolean n624MaqVolMed ;
   private boolean n625MaqVolMin ;
   private boolean n619MaqTinTip ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private String AV40ColumnsSelectorXML ;
   private String AV41UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV91FilterFullText ;
   private String AV107Tmaqui1wwds_1_filterfulltext ;
   private String lV107Tmaqui1wwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08312_A396EmprCod ;
   private String[] P08312_A1012TipMaqDsc ;
   private boolean[] P08312_n1012TipMaqDsc ;
   private String[] P08312_A1011TipMaqCod ;
   private boolean[] P08312_n1011TipMaqCod ;
   private java.math.BigDecimal[] P08312_A4283MaqKgsMin ;
   private boolean[] P08312_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P08312_A4284MaqKgsMed ;
   private boolean[] P08312_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P08312_A4285MaqKgsMax ;
   private boolean[] P08312_n4285MaqKgsMax ;
   private int[] P08312_A2801MaqVolRes ;
   private boolean[] P08312_n2801MaqVolRes ;
   private int[] P08312_A2802MaqVolTop ;
   private boolean[] P08312_n2802MaqVolTop ;
   private int[] P08312_A624MaqVolMed ;
   private boolean[] P08312_n624MaqVolMed ;
   private int[] P08312_A625MaqVolMin ;
   private boolean[] P08312_n625MaqVolMin ;
   private String[] P08312_A619MaqTinTip ;
   private boolean[] P08312_n619MaqTinTip ;
   private String[] P08312_A607MaqEst ;
   private boolean[] P08312_n607MaqEst ;
   private String[] P08312_A606MaqDsc ;
   private boolean[] P08312_n606MaqDsc ;
   private String[] P08312_A602MaqCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV38ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV39ColumnsSelector_Column ;
}

final  class tmaqui1wwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08312( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV107Tmaqui1wwds_1_filterfulltext ,
                                          String AV109Tmaqui1wwds_3_tfmaqcod_sel ,
                                          String AV108Tmaqui1wwds_2_tfmaqcod ,
                                          String AV111Tmaqui1wwds_5_tfmaqdsc_sel ,
                                          String AV110Tmaqui1wwds_4_tfmaqdsc ,
                                          String AV113Tmaqui1wwds_7_tfmaqest_sel ,
                                          String AV112Tmaqui1wwds_6_tfmaqest ,
                                          String AV115Tmaqui1wwds_9_tfmaqtintip_sel ,
                                          String AV114Tmaqui1wwds_8_tfmaqtintip ,
                                          int AV116Tmaqui1wwds_10_tfmaqvolmin ,
                                          int AV117Tmaqui1wwds_11_tfmaqvolmin_to ,
                                          int AV118Tmaqui1wwds_12_tfmaqvolmed ,
                                          int AV119Tmaqui1wwds_13_tfmaqvolmed_to ,
                                          int AV120Tmaqui1wwds_14_tfmaqvoltop ,
                                          int AV121Tmaqui1wwds_15_tfmaqvoltop_to ,
                                          int AV122Tmaqui1wwds_16_tfmaqvolres ,
                                          int AV123Tmaqui1wwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV124Tmaqui1wwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV125Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV126Tmaqui1wwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV127Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV128Tmaqui1wwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV129Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                          String AV131Tmaqui1wwds_25_tftipmaqcod_sel ,
                                          String AV130Tmaqui1wwds_24_tftipmaqcod ,
                                          String AV133Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                          String AV132Tmaqui1wwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A607MaqEst ,
                                          String A619MaqTinTip ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[39];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqTinTip, T1.MaqEst," ;
      scmdbuf += " T1.MaqDsc, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV107Tmaqui1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqEst) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
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
      }
      if ( (GXutil.strcmp("", AV109Tmaqui1wwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV108Tmaqui1wwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tmaqui1wwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tmaqui1wwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Tmaqui1wwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tmaqui1wwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tmaqui1wwds_7_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV112Tmaqui1wwds_6_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tmaqui1wwds_7_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqEst = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tmaqui1wwds_9_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV114Tmaqui1wwds_8_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tmaqui1wwds_9_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV116Tmaqui1wwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV117Tmaqui1wwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV118Tmaqui1wwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV119Tmaqui1wwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV120Tmaqui1wwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV121Tmaqui1wwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV122Tmaqui1wwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV123Tmaqui1wwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Tmaqui1wwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Tmaqui1wwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Tmaqui1wwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Tmaqui1wwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Tmaqui1wwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Tmaqui1wwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tmaqui1wwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV130Tmaqui1wwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tmaqui1wwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Tmaqui1wwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Tmaqui1wwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Tmaqui1wwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqEst" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqTinTip" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqTinTip DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolMin" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolMin DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolMed" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolMed DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolTop" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolTop DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolRes" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolRes DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMax" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMax DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMed" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMed DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMin" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMin DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipMaqCod" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipMaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipMaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipMaqDsc DESC" ;
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
                  return conditional_P08312(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08312", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
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
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               return;
      }
   }

}

