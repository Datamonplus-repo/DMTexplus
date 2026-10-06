package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmaquinwwexport extends GXProcedure
{
   public tmaquinwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaquinwwexport.class ), "" );
   }

   public tmaquinwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmaquinwwexport.this.aP1 = new String[] {""};
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
      tmaquinwwexport.this.aP0 = aP0;
      tmaquinwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TMAQUINWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFMaqCod_Sel, GXv_char5) ;
         tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "") ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFMaqCod, GXv_char5) ;
            tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFMaqDsc_Sel, GXv_char5) ;
         tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "") ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFMaqDsc, GXv_char5) ;
            tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFMaqTinTip_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFMaqTinTip_Sel, GXv_char5) ;
         tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFMaqTinTip)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFMaqTinTip, GXv_char5) ;
            tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV40TFMaqVolMax) && (0==AV41TFMaqVolMax_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Volumen Maximo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFMaqVolMax );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFMaqVolMax_To );
      }
      if ( ! ( (0==AV42TFMaqVolMin) && (0==AV43TFMaqVolMin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Volumen Minimo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFMaqVolMin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFMaqVolMin_To );
      }
      if ( ! ( (0==AV44TFMaqVolMed) && (0==AV45TFMaqVolMed_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Volumen Medio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFMaqVolMed );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFMaqVolMed_To );
      }
      if ( ! ( (0==AV46TFMaqVolTop) && (0==AV47TFMaqVolTop_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Volumen Baño", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFMaqVolTop );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFMaqVolTop_To );
      }
      if ( ! ( (0==AV48TFMaqVolRes) && (0==AV49TFMaqVolRes_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Volumen Residual", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFMaqVolRes );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFMaqVolRes_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFMaqKgsMax)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFMaqKgsMax_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos Maximos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFMaqKgsMax)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFMaqKgsMax_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFMaqKgsMed)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFMaqKgsMed_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos Medios", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFMaqKgsMed)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFMaqKgsMed_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFMaqKgsMin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFMaqKgsMin_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos Minimos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54TFMaqKgsMin)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV55TFMaqKgsMin_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV57TFTipMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo de Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFTipMaqCod_Sel, GXv_char5) ;
         tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFTipMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo de Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFTipMaqCod, GXv_char5) ;
            tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFTipMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFTipMaqDsc_Sel, GXv_char5) ;
         tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFTipMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmaquinwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFTipMaqDsc, GXv_char5) ;
            tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("TMAQUINWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("TMAQUINWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV63GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV65Tmaquinwwds_1_filterfulltext = AV18FilterFullText ;
      AV66Tmaquinwwds_2_tfmaqcod = AV34TFMaqCod ;
      AV67Tmaquinwwds_3_tfmaqcod_sel = AV35TFMaqCod_Sel ;
      AV68Tmaquinwwds_4_tfmaqdsc = AV36TFMaqDsc ;
      AV69Tmaquinwwds_5_tfmaqdsc_sel = AV37TFMaqDsc_Sel ;
      AV70Tmaquinwwds_6_tfmaqtintip = AV38TFMaqTinTip ;
      AV71Tmaquinwwds_7_tfmaqtintip_sel = AV39TFMaqTinTip_Sel ;
      AV72Tmaquinwwds_8_tfmaqvolmax = AV40TFMaqVolMax ;
      AV73Tmaquinwwds_9_tfmaqvolmax_to = AV41TFMaqVolMax_To ;
      AV74Tmaquinwwds_10_tfmaqvolmin = AV42TFMaqVolMin ;
      AV75Tmaquinwwds_11_tfmaqvolmin_to = AV43TFMaqVolMin_To ;
      AV76Tmaquinwwds_12_tfmaqvolmed = AV44TFMaqVolMed ;
      AV77Tmaquinwwds_13_tfmaqvolmed_to = AV45TFMaqVolMed_To ;
      AV78Tmaquinwwds_14_tfmaqvoltop = AV46TFMaqVolTop ;
      AV79Tmaquinwwds_15_tfmaqvoltop_to = AV47TFMaqVolTop_To ;
      AV80Tmaquinwwds_16_tfmaqvolres = AV48TFMaqVolRes ;
      AV81Tmaquinwwds_17_tfmaqvolres_to = AV49TFMaqVolRes_To ;
      AV82Tmaquinwwds_18_tfmaqkgsmax = AV50TFMaqKgsMax ;
      AV83Tmaquinwwds_19_tfmaqkgsmax_to = AV51TFMaqKgsMax_To ;
      AV84Tmaquinwwds_20_tfmaqkgsmed = AV52TFMaqKgsMed ;
      AV85Tmaquinwwds_21_tfmaqkgsmed_to = AV53TFMaqKgsMed_To ;
      AV86Tmaquinwwds_22_tfmaqkgsmin = AV54TFMaqKgsMin ;
      AV87Tmaquinwwds_23_tfmaqkgsmin_to = AV55TFMaqKgsMin_To ;
      AV88Tmaquinwwds_24_tftipmaqcod = AV56TFTipMaqCod ;
      AV89Tmaquinwwds_25_tftipmaqcod_sel = AV57TFTipMaqCod_Sel ;
      AV90Tmaquinwwds_26_tftipmaqdsc = AV58TFTipMaqDsc ;
      AV91Tmaquinwwds_27_tftipmaqdsc_sel = AV59TFTipMaqDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Tmaquinwwds_1_filterfulltext ,
                                           AV67Tmaquinwwds_3_tfmaqcod_sel ,
                                           AV66Tmaquinwwds_2_tfmaqcod ,
                                           AV69Tmaquinwwds_5_tfmaqdsc_sel ,
                                           AV68Tmaquinwwds_4_tfmaqdsc ,
                                           AV71Tmaquinwwds_7_tfmaqtintip_sel ,
                                           AV70Tmaquinwwds_6_tfmaqtintip ,
                                           Integer.valueOf(AV72Tmaquinwwds_8_tfmaqvolmax) ,
                                           Integer.valueOf(AV73Tmaquinwwds_9_tfmaqvolmax_to) ,
                                           Integer.valueOf(AV74Tmaquinwwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV75Tmaquinwwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV76Tmaquinwwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV77Tmaquinwwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV78Tmaquinwwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV79Tmaquinwwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV80Tmaquinwwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV81Tmaquinwwds_17_tfmaqvolres_to) ,
                                           AV82Tmaquinwwds_18_tfmaqkgsmax ,
                                           AV83Tmaquinwwds_19_tfmaqkgsmax_to ,
                                           AV84Tmaquinwwds_20_tfmaqkgsmed ,
                                           AV85Tmaquinwwds_21_tfmaqkgsmed_to ,
                                           AV86Tmaquinwwds_22_tfmaqkgsmin ,
                                           AV87Tmaquinwwds_23_tfmaqkgsmin_to ,
                                           AV89Tmaquinwwds_25_tftipmaqcod_sel ,
                                           AV88Tmaquinwwds_24_tftipmaqcod ,
                                           AV91Tmaquinwwds_27_tftipmaqdsc_sel ,
                                           AV90Tmaquinwwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A623MaqVolMax) ,
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
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV66Tmaquinwwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV66Tmaquinwwds_2_tfmaqcod), 6, "%") ;
      lV68Tmaquinwwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV68Tmaquinwwds_4_tfmaqdsc), 16, "%") ;
      lV70Tmaquinwwds_6_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV70Tmaquinwwds_6_tfmaqtintip), 2, "%") ;
      lV88Tmaquinwwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV88Tmaquinwwds_24_tftipmaqcod), 4, "%") ;
      lV90Tmaquinwwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV90Tmaquinwwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P0A7W2 */
      pr_default.execute(0, new Object[] {lV65Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_1_filterfulltext, lV66Tmaquinwwds_2_tfmaqcod, AV67Tmaquinwwds_3_tfmaqcod_sel, lV68Tmaquinwwds_4_tfmaqdsc, AV69Tmaquinwwds_5_tfmaqdsc_sel, lV70Tmaquinwwds_6_tfmaqtintip, AV71Tmaquinwwds_7_tfmaqtintip_sel, Integer.valueOf(AV72Tmaquinwwds_8_tfmaqvolmax), Integer.valueOf(AV73Tmaquinwwds_9_tfmaqvolmax_to), Integer.valueOf(AV74Tmaquinwwds_10_tfmaqvolmin), Integer.valueOf(AV75Tmaquinwwds_11_tfmaqvolmin_to), Integer.valueOf(AV76Tmaquinwwds_12_tfmaqvolmed), Integer.valueOf(AV77Tmaquinwwds_13_tfmaqvolmed_to), Integer.valueOf(AV78Tmaquinwwds_14_tfmaqvoltop), Integer.valueOf(AV79Tmaquinwwds_15_tfmaqvoltop_to), Integer.valueOf(AV80Tmaquinwwds_16_tfmaqvolres), Integer.valueOf(AV81Tmaquinwwds_17_tfmaqvolres_to), AV82Tmaquinwwds_18_tfmaqkgsmax, AV83Tmaquinwwds_19_tfmaqkgsmax_to, AV84Tmaquinwwds_20_tfmaqkgsmed, AV85Tmaquinwwds_21_tfmaqkgsmed_to, AV86Tmaquinwwds_22_tfmaqkgsmin, AV87Tmaquinwwds_23_tfmaqkgsmin_to, lV88Tmaquinwwds_24_tftipmaqcod, AV89Tmaquinwwds_25_tftipmaqcod_sel, lV90Tmaquinwwds_26_tftipmaqdsc, AV91Tmaquinwwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0A7W2_A396EmprCod[0] ;
         A1012TipMaqDsc = P0A7W2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7W2_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P0A7W2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P0A7W2_n1011TipMaqCod[0] ;
         A4283MaqKgsMin = P0A7W2_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P0A7W2_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P0A7W2_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P0A7W2_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P0A7W2_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P0A7W2_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P0A7W2_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P0A7W2_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P0A7W2_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P0A7W2_n2802MaqVolTop[0] ;
         A624MaqVolMed = P0A7W2_A624MaqVolMed[0] ;
         n624MaqVolMed = P0A7W2_n624MaqVolMed[0] ;
         A625MaqVolMin = P0A7W2_A625MaqVolMin[0] ;
         n625MaqVolMin = P0A7W2_n625MaqVolMin[0] ;
         A623MaqVolMax = P0A7W2_A623MaqVolMax[0] ;
         n623MaqVolMax = P0A7W2_n623MaqVolMax[0] ;
         A619MaqTinTip = P0A7W2_A619MaqTinTip[0] ;
         n619MaqTinTip = P0A7W2_n619MaqTinTip[0] ;
         A606MaqDsc = P0A7W2_A606MaqDsc[0] ;
         n606MaqDsc = P0A7W2_n606MaqDsc[0] ;
         A602MaqCod = P0A7W2_A602MaqCod[0] ;
         A1012TipMaqDsc = P0A7W2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7W2_n1012TipMaqDsc[0] ;
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
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
            tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A606MaqDsc, GXv_char5) ;
            tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A619MaqTinTip, GXv_char5) ;
            tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A623MaqVolMax );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A625MaqVolMin );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A624MaqVolMed );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2802MaqVolTop );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2801MaqVolRes );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4285MaqKgsMax)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4284MaqKgsMed)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4283MaqKgsMin)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1011TipMaqCod, GXv_char5) ;
            tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1012TipMaqDsc, GXv_char5) ;
            tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqCod", "", "", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqDsc", "", "", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqTinTip", "", "Tipo Maquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqVolMax", "", "Volumen Maximo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqVolMin", "", "Volumen Minimo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqVolMed", "", "Volumen Medio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqVolTop", "", "Volumen Baño", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqVolRes", "", "Volumen Residual", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqKgsMax", "", "Kilos Maximos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqKgsMed", "", "Kilos Medios", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqKgsMin", "", "Kilos Minimos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipMaqCod", "", "Tipo de Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipMaqDsc", "", "Descripción", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMAQUINWWColumnsSelector", GXv_char5) ;
      tmaquinwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMAQUINWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMAQUINWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("TMAQUINWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV92GXV2 = 1 ;
      while ( AV92GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV34TFMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV35TFMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV36TFMaqDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV37TFMaqDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP") == 0 )
         {
            AV38TFMaqTinTip = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP_SEL") == 0 )
         {
            AV39TFMaqTinTip_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMAX") == 0 )
         {
            AV40TFMaqVolMax = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFMaqVolMax_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMIN") == 0 )
         {
            AV42TFMaqVolMin = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFMaqVolMin_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMED") == 0 )
         {
            AV44TFMaqVolMed = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFMaqVolMed_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLTOP") == 0 )
         {
            AV46TFMaqVolTop = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFMaqVolTop_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLRES") == 0 )
         {
            AV48TFMaqVolRes = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFMaqVolRes_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMAX") == 0 )
         {
            AV50TFMaqKgsMax = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFMaqKgsMax_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMED") == 0 )
         {
            AV52TFMaqKgsMed = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFMaqKgsMed_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMIN") == 0 )
         {
            AV54TFMaqKgsMin = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFMaqKgsMin_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV56TFTipMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV57TFTipMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV58TFTipMaqDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV59TFTipMaqDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV92GXV2 = (int)(AV92GXV2+1) ;
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
      this.aP0[0] = tmaquinwwexport.this.AV11Filename;
      this.aP1[0] = tmaquinwwexport.this.AV12ErrorMessage;
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
      AV35TFMaqCod_Sel = "" ;
      AV34TFMaqCod = "" ;
      AV37TFMaqDsc_Sel = "" ;
      AV36TFMaqDsc = "" ;
      AV39TFMaqTinTip_Sel = "" ;
      AV38TFMaqTinTip = "" ;
      AV50TFMaqKgsMax = DecimalUtil.ZERO ;
      AV51TFMaqKgsMax_To = DecimalUtil.ZERO ;
      AV52TFMaqKgsMed = DecimalUtil.ZERO ;
      AV53TFMaqKgsMed_To = DecimalUtil.ZERO ;
      AV54TFMaqKgsMin = DecimalUtil.ZERO ;
      AV55TFMaqKgsMin_To = DecimalUtil.ZERO ;
      AV57TFTipMaqCod_Sel = "" ;
      AV56TFTipMaqCod = "" ;
      AV59TFTipMaqDsc_Sel = "" ;
      AV58TFTipMaqDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A619MaqTinTip = "" ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      AV65Tmaquinwwds_1_filterfulltext = "" ;
      AV66Tmaquinwwds_2_tfmaqcod = "" ;
      AV67Tmaquinwwds_3_tfmaqcod_sel = "" ;
      AV68Tmaquinwwds_4_tfmaqdsc = "" ;
      AV69Tmaquinwwds_5_tfmaqdsc_sel = "" ;
      AV70Tmaquinwwds_6_tfmaqtintip = "" ;
      AV71Tmaquinwwds_7_tfmaqtintip_sel = "" ;
      AV82Tmaquinwwds_18_tfmaqkgsmax = DecimalUtil.ZERO ;
      AV83Tmaquinwwds_19_tfmaqkgsmax_to = DecimalUtil.ZERO ;
      AV84Tmaquinwwds_20_tfmaqkgsmed = DecimalUtil.ZERO ;
      AV85Tmaquinwwds_21_tfmaqkgsmed_to = DecimalUtil.ZERO ;
      AV86Tmaquinwwds_22_tfmaqkgsmin = DecimalUtil.ZERO ;
      AV87Tmaquinwwds_23_tfmaqkgsmin_to = DecimalUtil.ZERO ;
      AV88Tmaquinwwds_24_tftipmaqcod = "" ;
      AV89Tmaquinwwds_25_tftipmaqcod_sel = "" ;
      AV90Tmaquinwwds_26_tftipmaqdsc = "" ;
      AV91Tmaquinwwds_27_tftipmaqdsc_sel = "" ;
      scmdbuf = "" ;
      lV65Tmaquinwwds_1_filterfulltext = "" ;
      lV66Tmaquinwwds_2_tfmaqcod = "" ;
      lV68Tmaquinwwds_4_tfmaqdsc = "" ;
      lV70Tmaquinwwds_6_tfmaqtintip = "" ;
      lV88Tmaquinwwds_24_tftipmaqcod = "" ;
      lV90Tmaquinwwds_26_tftipmaqdsc = "" ;
      P0A7W2_A396EmprCod = new String[] {""} ;
      P0A7W2_A1012TipMaqDsc = new String[] {""} ;
      P0A7W2_n1012TipMaqDsc = new boolean[] {false} ;
      P0A7W2_A1011TipMaqCod = new String[] {""} ;
      P0A7W2_n1011TipMaqCod = new boolean[] {false} ;
      P0A7W2_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7W2_n4283MaqKgsMin = new boolean[] {false} ;
      P0A7W2_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7W2_n4284MaqKgsMed = new boolean[] {false} ;
      P0A7W2_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7W2_n4285MaqKgsMax = new boolean[] {false} ;
      P0A7W2_A2801MaqVolRes = new int[1] ;
      P0A7W2_n2801MaqVolRes = new boolean[] {false} ;
      P0A7W2_A2802MaqVolTop = new int[1] ;
      P0A7W2_n2802MaqVolTop = new boolean[] {false} ;
      P0A7W2_A624MaqVolMed = new int[1] ;
      P0A7W2_n624MaqVolMed = new boolean[] {false} ;
      P0A7W2_A625MaqVolMin = new int[1] ;
      P0A7W2_n625MaqVolMin = new boolean[] {false} ;
      P0A7W2_A623MaqVolMax = new int[1] ;
      P0A7W2_n623MaqVolMax = new boolean[] {false} ;
      P0A7W2_A619MaqTinTip = new String[] {""} ;
      P0A7W2_n619MaqTinTip = new boolean[] {false} ;
      P0A7W2_A606MaqDsc = new String[] {""} ;
      P0A7W2_n606MaqDsc = new boolean[] {false} ;
      P0A7W2_A602MaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaquinwwexport__default(),
         new Object[] {
             new Object[] {
            P0A7W2_A396EmprCod, P0A7W2_A1012TipMaqDsc, P0A7W2_n1012TipMaqDsc, P0A7W2_A1011TipMaqCod, P0A7W2_n1011TipMaqCod, P0A7W2_A4283MaqKgsMin, P0A7W2_n4283MaqKgsMin, P0A7W2_A4284MaqKgsMed, P0A7W2_n4284MaqKgsMed, P0A7W2_A4285MaqKgsMax,
            P0A7W2_n4285MaqKgsMax, P0A7W2_A2801MaqVolRes, P0A7W2_n2801MaqVolRes, P0A7W2_A2802MaqVolTop, P0A7W2_n2802MaqVolTop, P0A7W2_A624MaqVolMed, P0A7W2_n624MaqVolMed, P0A7W2_A625MaqVolMin, P0A7W2_n625MaqVolMin, P0A7W2_A623MaqVolMax,
            P0A7W2_n623MaqVolMax, P0A7W2_A619MaqTinTip, P0A7W2_n619MaqTinTip, P0A7W2_A606MaqDsc, P0A7W2_n606MaqDsc, P0A7W2_A602MaqCod
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
   private int AV40TFMaqVolMax ;
   private int AV41TFMaqVolMax_To ;
   private int AV42TFMaqVolMin ;
   private int AV43TFMaqVolMin_To ;
   private int AV44TFMaqVolMed ;
   private int AV45TFMaqVolMed_To ;
   private int AV46TFMaqVolTop ;
   private int AV47TFMaqVolTop_To ;
   private int AV48TFMaqVolRes ;
   private int AV49TFMaqVolRes_To ;
   private int AV63GXV1 ;
   private int A623MaqVolMax ;
   private int A625MaqVolMin ;
   private int A624MaqVolMed ;
   private int A2802MaqVolTop ;
   private int A2801MaqVolRes ;
   private int AV72Tmaquinwwds_8_tfmaqvolmax ;
   private int AV73Tmaquinwwds_9_tfmaqvolmax_to ;
   private int AV74Tmaquinwwds_10_tfmaqvolmin ;
   private int AV75Tmaquinwwds_11_tfmaqvolmin_to ;
   private int AV76Tmaquinwwds_12_tfmaqvolmed ;
   private int AV77Tmaquinwwds_13_tfmaqvolmed_to ;
   private int AV78Tmaquinwwds_14_tfmaqvoltop ;
   private int AV79Tmaquinwwds_15_tfmaqvoltop_to ;
   private int AV80Tmaquinwwds_16_tfmaqvolres ;
   private int AV81Tmaquinwwds_17_tfmaqvolres_to ;
   private int AV92GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV50TFMaqKgsMax ;
   private java.math.BigDecimal AV51TFMaqKgsMax_To ;
   private java.math.BigDecimal AV52TFMaqKgsMed ;
   private java.math.BigDecimal AV53TFMaqKgsMed_To ;
   private java.math.BigDecimal AV54TFMaqKgsMin ;
   private java.math.BigDecimal AV55TFMaqKgsMin_To ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A4284MaqKgsMed ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal AV82Tmaquinwwds_18_tfmaqkgsmax ;
   private java.math.BigDecimal AV83Tmaquinwwds_19_tfmaqkgsmax_to ;
   private java.math.BigDecimal AV84Tmaquinwwds_20_tfmaqkgsmed ;
   private java.math.BigDecimal AV85Tmaquinwwds_21_tfmaqkgsmed_to ;
   private java.math.BigDecimal AV86Tmaquinwwds_22_tfmaqkgsmin ;
   private java.math.BigDecimal AV87Tmaquinwwds_23_tfmaqkgsmin_to ;
   private String AV35TFMaqCod_Sel ;
   private String AV34TFMaqCod ;
   private String AV37TFMaqDsc_Sel ;
   private String AV36TFMaqDsc ;
   private String AV39TFMaqTinTip_Sel ;
   private String AV38TFMaqTinTip ;
   private String AV57TFTipMaqCod_Sel ;
   private String AV56TFTipMaqCod ;
   private String AV59TFTipMaqDsc_Sel ;
   private String AV58TFTipMaqDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A619MaqTinTip ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private String AV66Tmaquinwwds_2_tfmaqcod ;
   private String AV67Tmaquinwwds_3_tfmaqcod_sel ;
   private String AV68Tmaquinwwds_4_tfmaqdsc ;
   private String AV69Tmaquinwwds_5_tfmaqdsc_sel ;
   private String AV70Tmaquinwwds_6_tfmaqtintip ;
   private String AV71Tmaquinwwds_7_tfmaqtintip_sel ;
   private String AV88Tmaquinwwds_24_tftipmaqcod ;
   private String AV89Tmaquinwwds_25_tftipmaqcod_sel ;
   private String AV90Tmaquinwwds_26_tftipmaqdsc ;
   private String AV91Tmaquinwwds_27_tftipmaqdsc_sel ;
   private String scmdbuf ;
   private String lV66Tmaquinwwds_2_tfmaqcod ;
   private String lV68Tmaquinwwds_4_tfmaqdsc ;
   private String lV70Tmaquinwwds_6_tfmaqtintip ;
   private String lV88Tmaquinwwds_24_tftipmaqcod ;
   private String lV90Tmaquinwwds_26_tftipmaqdsc ;
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
   private boolean n623MaqVolMax ;
   private boolean n619MaqTinTip ;
   private boolean n606MaqDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV65Tmaquinwwds_1_filterfulltext ;
   private String lV65Tmaquinwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A7W2_A396EmprCod ;
   private String[] P0A7W2_A1012TipMaqDsc ;
   private boolean[] P0A7W2_n1012TipMaqDsc ;
   private String[] P0A7W2_A1011TipMaqCod ;
   private boolean[] P0A7W2_n1011TipMaqCod ;
   private java.math.BigDecimal[] P0A7W2_A4283MaqKgsMin ;
   private boolean[] P0A7W2_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P0A7W2_A4284MaqKgsMed ;
   private boolean[] P0A7W2_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P0A7W2_A4285MaqKgsMax ;
   private boolean[] P0A7W2_n4285MaqKgsMax ;
   private int[] P0A7W2_A2801MaqVolRes ;
   private boolean[] P0A7W2_n2801MaqVolRes ;
   private int[] P0A7W2_A2802MaqVolTop ;
   private boolean[] P0A7W2_n2802MaqVolTop ;
   private int[] P0A7W2_A624MaqVolMed ;
   private boolean[] P0A7W2_n624MaqVolMed ;
   private int[] P0A7W2_A625MaqVolMin ;
   private boolean[] P0A7W2_n625MaqVolMin ;
   private int[] P0A7W2_A623MaqVolMax ;
   private boolean[] P0A7W2_n623MaqVolMax ;
   private String[] P0A7W2_A619MaqTinTip ;
   private boolean[] P0A7W2_n619MaqTinTip ;
   private String[] P0A7W2_A606MaqDsc ;
   private boolean[] P0A7W2_n606MaqDsc ;
   private String[] P0A7W2_A602MaqCod ;
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

final  class tmaquinwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A7W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Tmaquinwwds_1_filterfulltext ,
                                          String AV67Tmaquinwwds_3_tfmaqcod_sel ,
                                          String AV66Tmaquinwwds_2_tfmaqcod ,
                                          String AV69Tmaquinwwds_5_tfmaqdsc_sel ,
                                          String AV68Tmaquinwwds_4_tfmaqdsc ,
                                          String AV71Tmaquinwwds_7_tfmaqtintip_sel ,
                                          String AV70Tmaquinwwds_6_tfmaqtintip ,
                                          int AV72Tmaquinwwds_8_tfmaqvolmax ,
                                          int AV73Tmaquinwwds_9_tfmaqvolmax_to ,
                                          int AV74Tmaquinwwds_10_tfmaqvolmin ,
                                          int AV75Tmaquinwwds_11_tfmaqvolmin_to ,
                                          int AV76Tmaquinwwds_12_tfmaqvolmed ,
                                          int AV77Tmaquinwwds_13_tfmaqvolmed_to ,
                                          int AV78Tmaquinwwds_14_tfmaqvoltop ,
                                          int AV79Tmaquinwwds_15_tfmaqvoltop_to ,
                                          int AV80Tmaquinwwds_16_tfmaqvolres ,
                                          int AV81Tmaquinwwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV82Tmaquinwwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV83Tmaquinwwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV84Tmaquinwwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV85Tmaquinwwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV86Tmaquinwwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV87Tmaquinwwds_23_tfmaqkgsmin_to ,
                                          String AV89Tmaquinwwds_25_tftipmaqcod_sel ,
                                          String AV88Tmaquinwwds_24_tftipmaqcod ,
                                          String AV91Tmaquinwwds_27_tftipmaqdsc_sel ,
                                          String AV90Tmaquinwwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A619MaqTinTip ,
                                          int A623MaqVolMax ,
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
      scmdbuf = "SELECT T1.EmprCod, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqVolMax, T1.MaqTinTip," ;
      scmdbuf += " T1.MaqDsc, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV65Tmaquinwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMax,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV67Tmaquinwwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV66Tmaquinwwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tmaquinwwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Tmaquinwwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Tmaquinwwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tmaquinwwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tmaquinwwds_7_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV70Tmaquinwwds_6_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tmaquinwwds_7_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Tmaquinwwds_8_tfmaqvolmax) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Tmaquinwwds_9_tfmaqvolmax_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Tmaquinwwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV75Tmaquinwwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV76Tmaquinwwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV77Tmaquinwwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV78Tmaquinwwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV79Tmaquinwwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV80Tmaquinwwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV81Tmaquinwwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Tmaquinwwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Tmaquinwwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tmaquinwwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tmaquinwwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Tmaquinwwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Tmaquinwwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tmaquinwwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Tmaquinwwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tmaquinwwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tmaquinwwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Tmaquinwwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tmaquinwwds_27_tftipmaqdsc_sel)==0) )
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
         scmdbuf += " ORDER BY T1.MaqTinTip" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqTinTip DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolMax" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolMax DESC" ;
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
                  return conditional_P0A7W2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A7W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 2);
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
                  stmt.setString(sIdx, (String)parms[56], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
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

