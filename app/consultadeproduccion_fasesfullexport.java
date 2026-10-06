package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_fasesfullexport extends GXProcedure
{
   public consultadeproduccion_fasesfullexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_fasesfullexport.class ), "" );
   }

   public consultadeproduccion_fasesfullexport( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consultadeproduccion_fasesfullexport.this.aP1 = new String[] {""};
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
      consultadeproduccion_fasesfullexport.this.aP0 = aP0;
      consultadeproduccion_fasesfullexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV63Var_Hdr = AV61WebSession.getValue("&Var_Hdr") ;
      AV57EmprCod = GXutil.substring( AV63Var_Hdr, 1, 3) ;
      AV58BarCod = (int)(GXutil.lval( GXutil.substring( AV63Var_Hdr, 4, 8))) ;
      AV59BarCodReo = (byte)(GXutil.lval( GXutil.substring( AV63Var_Hdr, 12, 1))) ;
      AV60BarCodPar = GXutil.substring( AV63Var_Hdr, 13, 1) ;
      AV61WebSession.remove("&Var_Hdr");
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
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
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S211 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_FasesFullExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (0==AV35TFBarOrdLin) && (0==AV36TFBarOrdLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV35TFBarOrdLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV36TFBarOrdLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV38TFFasCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFFasCod_Sel, GXv_char5) ;
         consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV37TFFasCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFFasCod, GXv_char5) ;
            consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV40TFFasDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion de Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFFasDsc_Sel, GXv_char5) ;
         consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFFasDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion de Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFFasDsc, GXv_char5) ;
            consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV42TFMaqCodBis_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFMaqCodBis_Sel, GXv_char5) ;
         consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFMaqCodBis)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFMaqCodBis, GXv_char5) ;
            consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV43TFBarFasDTI) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Inicio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV43TFBarFasDTI );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFBarTieRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFBarTieRea_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "HhMm", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFBarTieRea)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFBarTieRea_To)) );
      }
      if ( ! ( ( AV50TFBarFasEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         AV56i = 1 ;
         AV79GXV1 = 1 ;
         while ( AV79GXV1 <= AV50TFBarFasEst_Sels.size() )
         {
            AV51TFBarFasEst_Sel = ((Number) AV50TFBarFasEst_Sels.elementAt(-1+AV79GXV1)).byteValue() ;
            if ( AV56i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV51TFBarFasEst_Sel == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pendiente", "") );
            }
            else if ( AV51TFBarFasEst_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "En Proceso", "") );
            }
            else if ( AV51TFBarFasEst_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Finalizada", "") );
            }
            AV56i = (long)(AV56i+1) ;
            AV79GXV1 = (int)(AV79GXV1+1) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFBarFasKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarFasKgm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFBarFasKgm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFBarFasKgm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFBarFasMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFBarFasMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54TFBarFasMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV55TFBarFasMtr_To)) );
      }
      if ( ! ( (0==AV67TFBarFasPri) && (0==AV68TFBarFasPri_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "PP", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV67TFBarFasPri );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_fasesfullexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV68TFBarFasPri_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV32VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("ConsultadeProduccion_FasesFullColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV18Session.getValue("ConsultadeProduccion_FasesFullColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV80GXV2 = 1 ;
      while ( AV80GXV2 <= AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV26ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV80GXV2));
         if ( AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setColor( 11 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         AV80GXV2 = (int)(AV80GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV82Consultadeproduccion_fasesfullds_1_emprcod = AV57EmprCod ;
         AV83Consultadeproduccion_fasesfullds_2_barcod = AV58BarCod ;
         AV84Consultadeproduccion_fasesfullds_3_barcodreo = AV59BarCodReo ;
         AV85Consultadeproduccion_fasesfullds_4_barcodpar = AV60BarCodPar ;
         AV86Consultadeproduccion_fasesfullds_5_tfbarordlin = AV35TFBarOrdLin ;
         AV87Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV36TFBarOrdLin_To ;
         AV88Consultadeproduccion_fasesfullds_7_tffascod = AV37TFFasCod ;
         AV89Consultadeproduccion_fasesfullds_8_tffascod_sel = AV38TFFasCod_Sel ;
         AV90Consultadeproduccion_fasesfullds_9_tffasdsc = AV39TFFasDsc ;
         AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV40TFFasDsc_Sel ;
         AV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV41TFMaqCodBis ;
         AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV42TFMaqCodBis_Sel ;
         AV94Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV43TFBarFasDTI ;
         AV95Consultadeproduccion_fasesfullds_14_tfbartierea = AV47TFBarTieRea ;
         AV96Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV48TFBarTieRea_To ;
         AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV50TFBarFasEst_Sels ;
         AV98Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV52TFBarFasKgm ;
         AV99Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV53TFBarFasKgm_To ;
         AV100Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV54TFBarFasMtr ;
         AV101Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV55TFBarFasMtr_To ;
         AV102Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV67TFBarFasPri ;
         AV103Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV68TFBarFasPri_To ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A153BarFasEst) ,
                                              AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                              Short.valueOf(AV86Consultadeproduccion_fasesfullds_5_tfbarordlin) ,
                                              Short.valueOf(AV87Consultadeproduccion_fasesfullds_6_tfbarordlin_to) ,
                                              AV89Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                              AV88Consultadeproduccion_fasesfullds_7_tffascod ,
                                              AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                              AV90Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                              AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                              AV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                              AV94Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                              AV95Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                              AV96Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                              Integer.valueOf(AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels.size()) ,
                                              AV98Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                              AV99Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                              AV100Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                              AV101Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                              Byte.valueOf(AV102Consultadeproduccion_fasesfullds_21_tfbarfaspri) ,
                                              Byte.valueOf(AV103Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A603MaqCodBis ,
                                              A4442BarFasDTI ,
                                              A215BarTieRea ,
                                              A3837BarFasKgm ,
                                              A3838BarFasMtr ,
                                              Byte.valueOf(A3836BarFasPri) ,
                                              Short.valueOf(AV16OrderedBy) ,
                                              Boolean.valueOf(AV17OrderedDsc) ,
                                              A396EmprCod ,
                                              AV57EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV58BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV59BarCodReo) ,
                                              A130BarCodPar ,
                                              AV60BarCodPar ,
                                              AV82Consultadeproduccion_fasesfullds_1_emprcod ,
                                              Integer.valueOf(AV83Consultadeproduccion_fasesfullds_2_barcod) ,
                                              Byte.valueOf(AV84Consultadeproduccion_fasesfullds_3_barcodreo) ,
                                              AV85Consultadeproduccion_fasesfullds_4_barcodpar } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV88Consultadeproduccion_fasesfullds_7_tffascod = GXutil.padr( GXutil.rtrim( AV88Consultadeproduccion_fasesfullds_7_tffascod), 8, "%") ;
         lV90Consultadeproduccion_fasesfullds_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV90Consultadeproduccion_fasesfullds_9_tffasdsc), 28, "%") ;
         lV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis), 6, "%") ;
         /* Using cursor P0A3Y2 */
         pr_default.execute(0, new Object[] {AV82Consultadeproduccion_fasesfullds_1_emprcod, Integer.valueOf(AV83Consultadeproduccion_fasesfullds_2_barcod), Byte.valueOf(AV84Consultadeproduccion_fasesfullds_3_barcodreo), AV85Consultadeproduccion_fasesfullds_4_barcodpar, AV57EmprCod, Integer.valueOf(AV58BarCod), Byte.valueOf(AV59BarCodReo), AV60BarCodPar, Short.valueOf(AV86Consultadeproduccion_fasesfullds_5_tfbarordlin), Short.valueOf(AV87Consultadeproduccion_fasesfullds_6_tfbarordlin_to), lV88Consultadeproduccion_fasesfullds_7_tffascod, AV89Consultadeproduccion_fasesfullds_8_tffascod_sel, lV90Consultadeproduccion_fasesfullds_9_tffasdsc, AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel, lV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis, AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel, AV94Consultadeproduccion_fasesfullds_13_tfbarfasdti, AV95Consultadeproduccion_fasesfullds_14_tfbartierea, AV96Consultadeproduccion_fasesfullds_15_tfbartierea_to, AV98Consultadeproduccion_fasesfullds_17_tfbarfaskgm, AV99Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to, AV100Consultadeproduccion_fasesfullds_19_tfbarfasmtr, AV101Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to, Byte.valueOf(AV102Consultadeproduccion_fasesfullds_21_tfbarfaspri), Byte.valueOf(AV103Consultadeproduccion_fasesfullds_22_tfbarfaspri_to)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P0A3Y2_A396EmprCod[0] ;
            A129BarCod = P0A3Y2_A129BarCod[0] ;
            n129BarCod = P0A3Y2_n129BarCod[0] ;
            A132BarCodReo = P0A3Y2_A132BarCodReo[0] ;
            n132BarCodReo = P0A3Y2_n132BarCodReo[0] ;
            A130BarCodPar = P0A3Y2_A130BarCodPar[0] ;
            n130BarCodPar = P0A3Y2_n130BarCodPar[0] ;
            A3836BarFasPri = P0A3Y2_A3836BarFasPri[0] ;
            A3838BarFasMtr = P0A3Y2_A3838BarFasMtr[0] ;
            n3838BarFasMtr = P0A3Y2_n3838BarFasMtr[0] ;
            A3837BarFasKgm = P0A3Y2_A3837BarFasKgm[0] ;
            n3837BarFasKgm = P0A3Y2_n3837BarFasKgm[0] ;
            A153BarFasEst = P0A3Y2_A153BarFasEst[0] ;
            A215BarTieRea = P0A3Y2_A215BarTieRea[0] ;
            A4442BarFasDTI = P0A3Y2_A4442BarFasDTI[0] ;
            n4442BarFasDTI = P0A3Y2_n4442BarFasDTI[0] ;
            A603MaqCodBis = P0A3Y2_A603MaqCodBis[0] ;
            A460FasDsc = P0A3Y2_A460FasDsc[0] ;
            A457FasCod = P0A3Y2_A457FasCod[0] ;
            A194BarOrdLin = P0A3Y2_A194BarOrdLin[0] ;
            A4443BarFasDTF = P0A3Y2_A4443BarFasDTF[0] ;
            n4443BarFasDTF = P0A3Y2_n4443BarFasDTF[0] ;
            A2265BarExt = P0A3Y2_A2265BarExt[0] ;
            n2265BarExt = P0A3Y2_n2265BarExt[0] ;
            A148BarEstReo = P0A3Y2_A148BarEstReo[0] ;
            A6173BarFasSec = P0A3Y2_A6173BarFasSec[0] ;
            n6173BarFasSec = P0A3Y2_n6173BarFasSec[0] ;
            A934BarReoCod = P0A3Y2_A934BarReoCod[0] ;
            A936BarReoReo = P0A3Y2_A936BarReoReo[0] ;
            A935BarReoPar = P0A3Y2_A935BarReoPar[0] ;
            A758ProCod = P0A3Y2_A758ProCod[0] ;
            A2265BarExt = P0A3Y2_A2265BarExt[0] ;
            n2265BarExt = P0A3Y2_n2265BarExt[0] ;
            A148BarEstReo = P0A3Y2_A148BarEstReo[0] ;
            A934BarReoCod = P0A3Y2_A934BarReoCod[0] ;
            A936BarReoReo = P0A3Y2_A936BarReoReo[0] ;
            A935BarReoPar = P0A3Y2_A935BarReoPar[0] ;
            A460FasDsc = P0A3Y2_A460FasDsc[0] ;
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV32VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A194BarOrdLin );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A457FasCod, GXv_char5) ;
               consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A460FasDsc, GXv_char5) ;
               consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A603MaqCodBis, GXv_char5) ;
               consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = AV22MaqDsc ;
               GXv_char5[0] = A396EmprCod ;
               GXv_char6[0] = A603MaqCodBis ;
               GXv_char7[0] = GXt_char4 ;
               new app.pmaqdsc(remoteHandle, context).execute( GXv_char5, GXv_char6, GXv_char7) ;
               consultadeproduccion_fasesfullexport.this.A396EmprCod = GXv_char5[0] ;
               consultadeproduccion_fasesfullexport.this.A603MaqCodBis = GXv_char6[0] ;
               consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char7[0] ;
               AV22MaqDsc = GXt_char4 ;
               GXt_char4 = "" ;
               GXv_char7[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV22MaqDsc, GXv_char7) ;
               consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char7[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setDate( A4442BarFasDTI );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV72BarFasDTF = "" ;
               if ( ( ( A153BarFasEst > 0 ) ) || ( ! (0==A3836BarFasPri) ) )
               {
                  if ( ! GXutil.dateCompare(GXutil.nullDate(), A4442BarFasDTI) )
                  {
                     AV72BarFasDTF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                  }
               }
               if ( ( ( A153BarFasEst >= 2 ) ) || ( ! (0==A3836BarFasPri) ) )
               {
                  AV72BarFasDTF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               }
               if ( A2265BarExt != 0 )
               {
                  AV76Lexmvh = (short)(0) ;
                  /* Using cursor P0A3Y3 */
                  pr_default.execute(1, new Object[] {AV57EmprCod, Integer.valueOf(AV58BarCod), Byte.valueOf(AV59BarCodReo), AV60BarCodPar, AV74FasCod});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A396EmprCod = P0A3Y3_A396EmprCod[0] ;
                     A129BarCod = P0A3Y3_A129BarCod[0] ;
                     n129BarCod = P0A3Y3_n129BarCod[0] ;
                     A132BarCodReo = P0A3Y3_A132BarCodReo[0] ;
                     n132BarCodReo = P0A3Y3_n132BarCodReo[0] ;
                     A130BarCodPar = P0A3Y3_A130BarCodPar[0] ;
                     n130BarCodPar = P0A3Y3_n130BarCodPar[0] ;
                     A2689ExHdrFas = P0A3Y3_A2689ExHdrFas[0] ;
                     A2697ExHdrFeE = P0A3Y3_A2697ExHdrFeE[0] ;
                     n2697ExHdrFeE = P0A3Y3_n2697ExHdrFeE[0] ;
                     A2700ExHdrFeR = P0A3Y3_A2700ExHdrFeR[0] ;
                     n2700ExHdrFeR = P0A3Y3_n2700ExHdrFeR[0] ;
                     A2248ManCod = P0A3Y3_A2248ManCod[0] ;
                     A2692ExHdrLin = P0A3Y3_A2692ExHdrLin[0] ;
                     AV75ExHdrFeE = A2697ExHdrFeE ;
                     AV73ExHdrFeR = A2700ExHdrFeR ;
                     AV76Lexmvh = (short)(1) ;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
                  AV72BarFasDTF = (!GXutil.dateCompare(GXutil.nullDate(), A4443BarFasDTF) ? localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.dtoc( AV73ExHdrFeR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
               }
               GXt_char4 = "" ;
               GXv_char7[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72BarFasDTF, GXv_char7) ;
               consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char7[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A215BarTieRea)) );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( "" );
               if ( A153BarFasEst == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pendiente", "") );
               }
               else if ( A153BarFasEst == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "En Proceso", "") );
               }
               else if ( A153BarFasEst == 2 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Finalizada", "") );
               }
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3837BarFasKgm)) );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3838BarFasMtr)) );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               if ( ( GXutil.strcmp(A6173BarFasSec, httpContext.getMessage( "OR", "")) == 0 ) && ( A148BarEstReo == 1 ) )
               {
                  GXt_char4 = AV23OpeNom ;
                  GXv_char7[0] = A396EmprCod ;
                  GXv_int8[0] = A934BarReoCod ;
                  GXv_int9[0] = A936BarReoReo ;
                  GXv_char6[0] = A935BarReoPar ;
                  GXv_int3[0] = A194BarOrdLin ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.pjln001(remoteHandle, context).execute( GXv_char7, GXv_int8, GXv_int9, GXv_char6, GXv_int3, GXv_char5) ;
                  consultadeproduccion_fasesfullexport.this.A396EmprCod = GXv_char7[0] ;
                  consultadeproduccion_fasesfullexport.this.A934BarReoCod = GXv_int8[0] ;
                  consultadeproduccion_fasesfullexport.this.A936BarReoReo = GXv_int9[0] ;
                  consultadeproduccion_fasesfullexport.this.A935BarReoPar = GXv_char6[0] ;
                  consultadeproduccion_fasesfullexport.this.A194BarOrdLin = GXv_int3[0] ;
                  consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
                  AV23OpeNom = GXt_char4 ;
               }
               else
               {
                  GXt_char4 = AV23OpeNom ;
                  GXv_char7[0] = A396EmprCod ;
                  GXv_int8[0] = A129BarCod ;
                  GXv_int9[0] = A132BarCodReo ;
                  GXv_char6[0] = A130BarCodPar ;
                  GXv_int3[0] = A194BarOrdLin ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.pjln001(remoteHandle, context).execute( GXv_char7, GXv_int8, GXv_int9, GXv_char6, GXv_int3, GXv_char5) ;
                  consultadeproduccion_fasesfullexport.this.A396EmprCod = GXv_char7[0] ;
                  consultadeproduccion_fasesfullexport.this.A129BarCod = GXv_int8[0] ;
                  consultadeproduccion_fasesfullexport.this.A132BarCodReo = GXv_int9[0] ;
                  consultadeproduccion_fasesfullexport.this.A130BarCodPar = GXv_char6[0] ;
                  consultadeproduccion_fasesfullexport.this.A194BarOrdLin = GXv_int3[0] ;
                  consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
                  AV23OpeNom = GXt_char4 ;
               }
               GXt_char4 = "" ;
               GXv_char7[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV23OpeNom, GXv_char7) ;
               consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char7[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A3836BarFasPri );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      AV82Consultadeproduccion_fasesfullds_1_emprcod = AV57EmprCod ;
      AV83Consultadeproduccion_fasesfullds_2_barcod = AV58BarCod ;
      AV84Consultadeproduccion_fasesfullds_3_barcodreo = AV59BarCodReo ;
      AV85Consultadeproduccion_fasesfullds_4_barcodpar = AV60BarCodPar ;
      AV86Consultadeproduccion_fasesfullds_5_tfbarordlin = AV35TFBarOrdLin ;
      AV87Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV36TFBarOrdLin_To ;
      AV88Consultadeproduccion_fasesfullds_7_tffascod = AV37TFFasCod ;
      AV89Consultadeproduccion_fasesfullds_8_tffascod_sel = AV38TFFasCod_Sel ;
      AV90Consultadeproduccion_fasesfullds_9_tffasdsc = AV39TFFasDsc ;
      AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV40TFFasDsc_Sel ;
      AV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV41TFMaqCodBis ;
      AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV42TFMaqCodBis_Sel ;
      AV94Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV43TFBarFasDTI ;
      AV95Consultadeproduccion_fasesfullds_14_tfbartierea = AV47TFBarTieRea ;
      AV96Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV48TFBarTieRea_To ;
      AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV50TFBarFasEst_Sels ;
      AV98Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV52TFBarFasKgm ;
      AV99Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV53TFBarFasKgm_To ;
      AV100Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV54TFBarFasMtr ;
      AV101Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV55TFBarFasMtr_To ;
      AV102Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV67TFBarFasPri ;
      AV103Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV68TFBarFasPri_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                           Short.valueOf(AV86Consultadeproduccion_fasesfullds_5_tfbarordlin) ,
                                           Short.valueOf(AV87Consultadeproduccion_fasesfullds_6_tfbarordlin_to) ,
                                           AV89Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                           AV88Consultadeproduccion_fasesfullds_7_tffascod ,
                                           AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                           AV90Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                           AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                           AV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                           AV94Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                           AV95Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                           AV96Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                           Integer.valueOf(AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels.size()) ,
                                           AV98Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                           AV99Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                           AV100Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                           AV101Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                           Byte.valueOf(AV102Consultadeproduccion_fasesfullds_21_tfbarfaspri) ,
                                           Byte.valueOf(AV103Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A4442BarFasDTI ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           Byte.valueOf(A3836BarFasPri) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A396EmprCod ,
                                           AV57EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV58BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV59BarCodReo) ,
                                           A130BarCodPar ,
                                           AV60BarCodPar ,
                                           AV82Consultadeproduccion_fasesfullds_1_emprcod ,
                                           Integer.valueOf(AV83Consultadeproduccion_fasesfullds_2_barcod) ,
                                           Byte.valueOf(AV84Consultadeproduccion_fasesfullds_3_barcodreo) ,
                                           AV85Consultadeproduccion_fasesfullds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV88Consultadeproduccion_fasesfullds_7_tffascod = GXutil.padr( GXutil.rtrim( AV88Consultadeproduccion_fasesfullds_7_tffascod), 8, "%") ;
      lV90Consultadeproduccion_fasesfullds_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV90Consultadeproduccion_fasesfullds_9_tffasdsc), 28, "%") ;
      lV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0A3Y4 */
      pr_default.execute(2, new Object[] {AV82Consultadeproduccion_fasesfullds_1_emprcod, Integer.valueOf(AV83Consultadeproduccion_fasesfullds_2_barcod), Byte.valueOf(AV84Consultadeproduccion_fasesfullds_3_barcodreo), AV85Consultadeproduccion_fasesfullds_4_barcodpar, AV57EmprCod, Integer.valueOf(AV58BarCod), Byte.valueOf(AV59BarCodReo), AV60BarCodPar, Short.valueOf(AV86Consultadeproduccion_fasesfullds_5_tfbarordlin), Short.valueOf(AV87Consultadeproduccion_fasesfullds_6_tfbarordlin_to), lV88Consultadeproduccion_fasesfullds_7_tffascod, AV89Consultadeproduccion_fasesfullds_8_tffascod_sel, lV90Consultadeproduccion_fasesfullds_9_tffasdsc, AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel, lV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis, AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel, AV94Consultadeproduccion_fasesfullds_13_tfbarfasdti, AV95Consultadeproduccion_fasesfullds_14_tfbartierea, AV96Consultadeproduccion_fasesfullds_15_tfbartierea_to, AV98Consultadeproduccion_fasesfullds_17_tfbarfaskgm, AV99Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to, AV100Consultadeproduccion_fasesfullds_19_tfbarfasmtr, AV101Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to, Byte.valueOf(AV102Consultadeproduccion_fasesfullds_21_tfbarfaspri), Byte.valueOf(AV103Consultadeproduccion_fasesfullds_22_tfbarfaspri_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P0A3Y4_A396EmprCod[0] ;
         A129BarCod = P0A3Y4_A129BarCod[0] ;
         n129BarCod = P0A3Y4_n129BarCod[0] ;
         A132BarCodReo = P0A3Y4_A132BarCodReo[0] ;
         n132BarCodReo = P0A3Y4_n132BarCodReo[0] ;
         A130BarCodPar = P0A3Y4_A130BarCodPar[0] ;
         n130BarCodPar = P0A3Y4_n130BarCodPar[0] ;
         A3836BarFasPri = P0A3Y4_A3836BarFasPri[0] ;
         A3838BarFasMtr = P0A3Y4_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0A3Y4_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0A3Y4_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0A3Y4_n3837BarFasKgm[0] ;
         A153BarFasEst = P0A3Y4_A153BarFasEst[0] ;
         A215BarTieRea = P0A3Y4_A215BarTieRea[0] ;
         A4442BarFasDTI = P0A3Y4_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0A3Y4_n4442BarFasDTI[0] ;
         A603MaqCodBis = P0A3Y4_A603MaqCodBis[0] ;
         A460FasDsc = P0A3Y4_A460FasDsc[0] ;
         A457FasCod = P0A3Y4_A457FasCod[0] ;
         A194BarOrdLin = P0A3Y4_A194BarOrdLin[0] ;
         A4443BarFasDTF = P0A3Y4_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0A3Y4_n4443BarFasDTF[0] ;
         A2265BarExt = P0A3Y4_A2265BarExt[0] ;
         n2265BarExt = P0A3Y4_n2265BarExt[0] ;
         A148BarEstReo = P0A3Y4_A148BarEstReo[0] ;
         A6173BarFasSec = P0A3Y4_A6173BarFasSec[0] ;
         n6173BarFasSec = P0A3Y4_n6173BarFasSec[0] ;
         A934BarReoCod = P0A3Y4_A934BarReoCod[0] ;
         A936BarReoReo = P0A3Y4_A936BarReoReo[0] ;
         A935BarReoPar = P0A3Y4_A935BarReoPar[0] ;
         A758ProCod = P0A3Y4_A758ProCod[0] ;
         A2265BarExt = P0A3Y4_A2265BarExt[0] ;
         n2265BarExt = P0A3Y4_n2265BarExt[0] ;
         A148BarEstReo = P0A3Y4_A148BarEstReo[0] ;
         A934BarReoCod = P0A3Y4_A934BarReoCod[0] ;
         A936BarReoReo = P0A3Y4_A936BarReoReo[0] ;
         A935BarReoPar = P0A3Y4_A935BarReoPar[0] ;
         A460FasDsc = P0A3Y4_A460FasDsc[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         AV32VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A194BarOrdLin );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char7[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A457FasCod, GXv_char7) ;
            consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char7[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A460FasDsc, GXv_char7) ;
            consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char7[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A603MaqCodBis, GXv_char7) ;
            consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = AV22MaqDsc ;
            GXv_char7[0] = A396EmprCod ;
            GXv_char6[0] = A603MaqCodBis ;
            GXv_char5[0] = GXt_char4 ;
            new app.pmaqdsc(remoteHandle, context).execute( GXv_char7, GXv_char6, GXv_char5) ;
            consultadeproduccion_fasesfullexport.this.A396EmprCod = GXv_char7[0] ;
            consultadeproduccion_fasesfullexport.this.A603MaqCodBis = GXv_char6[0] ;
            consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
            AV22MaqDsc = GXt_char4 ;
            GXt_char4 = "" ;
            GXv_char7[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV22MaqDsc, GXv_char7) ;
            consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setDate( A4442BarFasDTI );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV72BarFasDTF = "" ;
            if ( ( ( A153BarFasEst > 0 ) ) || ( ! (0==A3836BarFasPri) ) )
            {
               if ( ! GXutil.dateCompare(GXutil.nullDate(), A4442BarFasDTI) )
               {
                  AV72BarFasDTF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               }
            }
            if ( ( ( A153BarFasEst >= 2 ) ) || ( ! (0==A3836BarFasPri) ) )
            {
               AV72BarFasDTF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( A2265BarExt != 0 )
            {
               AV76Lexmvh = (short)(0) ;
               /* Using cursor P0A3Y5 */
               pr_default.execute(3, new Object[] {AV57EmprCod, Integer.valueOf(AV58BarCod), Byte.valueOf(AV59BarCodReo), AV60BarCodPar, AV74FasCod});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A396EmprCod = P0A3Y5_A396EmprCod[0] ;
                  A129BarCod = P0A3Y5_A129BarCod[0] ;
                  n129BarCod = P0A3Y5_n129BarCod[0] ;
                  A132BarCodReo = P0A3Y5_A132BarCodReo[0] ;
                  n132BarCodReo = P0A3Y5_n132BarCodReo[0] ;
                  A130BarCodPar = P0A3Y5_A130BarCodPar[0] ;
                  n130BarCodPar = P0A3Y5_n130BarCodPar[0] ;
                  A2689ExHdrFas = P0A3Y5_A2689ExHdrFas[0] ;
                  A2697ExHdrFeE = P0A3Y5_A2697ExHdrFeE[0] ;
                  n2697ExHdrFeE = P0A3Y5_n2697ExHdrFeE[0] ;
                  A2700ExHdrFeR = P0A3Y5_A2700ExHdrFeR[0] ;
                  n2700ExHdrFeR = P0A3Y5_n2700ExHdrFeR[0] ;
                  A2248ManCod = P0A3Y5_A2248ManCod[0] ;
                  A2692ExHdrLin = P0A3Y5_A2692ExHdrLin[0] ;
                  AV75ExHdrFeE = A2697ExHdrFeE ;
                  AV73ExHdrFeR = A2700ExHdrFeR ;
                  AV76Lexmvh = (short)(1) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               AV72BarFasDTF = (!GXutil.dateCompare(GXutil.nullDate(), A4443BarFasDTF) ? localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.dtoc( AV73ExHdrFeR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
            }
            GXt_char4 = "" ;
            GXv_char7[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72BarFasDTF, GXv_char7) ;
            consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A215BarTieRea)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( "" );
            if ( A153BarFasEst == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pendiente", "") );
            }
            else if ( A153BarFasEst == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "En Proceso", "") );
            }
            else if ( A153BarFasEst == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Finalizada", "") );
            }
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3837BarFasKgm)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3838BarFasMtr)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            if ( ( GXutil.strcmp(A6173BarFasSec, httpContext.getMessage( "OR", "")) == 0 ) && ( A148BarEstReo == 1 ) )
            {
               GXt_char4 = AV23OpeNom ;
               GXv_char7[0] = A396EmprCod ;
               GXv_int8[0] = A934BarReoCod ;
               GXv_int9[0] = A936BarReoReo ;
               GXv_char6[0] = A935BarReoPar ;
               GXv_int3[0] = A194BarOrdLin ;
               GXv_char5[0] = GXt_char4 ;
               new app.pjln001(remoteHandle, context).execute( GXv_char7, GXv_int8, GXv_int9, GXv_char6, GXv_int3, GXv_char5) ;
               consultadeproduccion_fasesfullexport.this.A396EmprCod = GXv_char7[0] ;
               consultadeproduccion_fasesfullexport.this.A934BarReoCod = GXv_int8[0] ;
               consultadeproduccion_fasesfullexport.this.A936BarReoReo = GXv_int9[0] ;
               consultadeproduccion_fasesfullexport.this.A935BarReoPar = GXv_char6[0] ;
               consultadeproduccion_fasesfullexport.this.A194BarOrdLin = GXv_int3[0] ;
               consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
               AV23OpeNom = GXt_char4 ;
            }
            else
            {
               GXt_char4 = AV23OpeNom ;
               GXv_char7[0] = A396EmprCod ;
               GXv_int8[0] = A129BarCod ;
               GXv_int9[0] = A132BarCodReo ;
               GXv_char6[0] = A130BarCodPar ;
               GXv_int3[0] = A194BarOrdLin ;
               GXv_char5[0] = GXt_char4 ;
               new app.pjln001(remoteHandle, context).execute( GXv_char7, GXv_int8, GXv_int9, GXv_char6, GXv_int3, GXv_char5) ;
               consultadeproduccion_fasesfullexport.this.A396EmprCod = GXv_char7[0] ;
               consultadeproduccion_fasesfullexport.this.A129BarCod = GXv_int8[0] ;
               consultadeproduccion_fasesfullexport.this.A132BarCodReo = GXv_int9[0] ;
               consultadeproduccion_fasesfullexport.this.A130BarCodPar = GXv_char6[0] ;
               consultadeproduccion_fasesfullexport.this.A194BarOrdLin = GXv_int3[0] ;
               consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char5[0] ;
               AV23OpeNom = GXt_char4 ;
            }
            GXt_char4 = "" ;
            GXv_char7[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV23OpeNom, GXv_char7) ;
            consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A3836BarFasPri );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
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
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarOrdLin", "", "Orden", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasCod", "", "Codigo Fase", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasDsc", "", "Descripcion de Fase", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MaqCodBis", "", "Maquina", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&MaqDsc", "", "Descripcion ", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarFasDTI", "", "Inicio", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&BarFasDTF", "", "Fin", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarTieRea", "", "HhMm", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarFasEst", "", "E", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarFasKgm", "", "Unidades", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarFasMtr", "", "Metros", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&OpeNom", "", "Operario", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarFasPri", "", "PP", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char4 = AV28UserCustomValue ;
      GXv_char7[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultadeProduccion_FasesFullColumnsSelector", GXv_char7) ;
      consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char7[0] ;
      AV28UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV28UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV28UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("ConsultadeProduccion_FasesFullGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultadeProduccion_FasesFullGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("ConsultadeProduccion_FasesFullGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV107GXV3 = 1 ;
      while ( AV107GXV3 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV107GXV3));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV35TFBarOrdLin = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFBarOrdLin_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV37TFFasCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV38TFFasCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV39TFFasDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV40TFFasDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV41TFMaqCodBis = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV42TFMaqCodBis_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTI") == 0 )
         {
            AV43TFBarFasDTI = localUtil.ctot( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV47TFBarTieRea = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFBarTieRea_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV49TFBarFasEst_SelsJson = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV50TFBarFasEst_Sels.fromJSonString(AV49TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV52TFBarFasKgm = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFBarFasKgm_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV54TFBarFasMtr = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFBarFasMtr_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASPRI") == 0 )
         {
            AV67TFBarFasPri = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFBarFasPri_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV57EmprCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV58BarCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV59BarCodReo = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV60BarCodPar = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV107GXV3 = (int)(AV107GXV3+1) ;
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

   public void S211( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char4 = AV69Station ;
      GXv_char7[0] = GXt_char4 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char7) ;
      consultadeproduccion_fasesfullexport.this.GXt_char4 = GXv_char7[0] ;
      AV69Station = GXt_char4 ;
      GXv_char7[0] = AV57EmprCod ;
      GXv_char6[0] = AV71EmprNom ;
      GXv_char5[0] = AV70UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV69Station, GXv_char7, GXv_char6, GXv_char5) ;
      consultadeproduccion_fasesfullexport.this.AV57EmprCod = GXv_char7[0] ;
      consultadeproduccion_fasesfullexport.this.AV71EmprNom = GXv_char6[0] ;
      consultadeproduccion_fasesfullexport.this.AV70UsurCod = GXv_char5[0] ;
   }

   public void S221( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV71EmprNom+" "+"("+AV108Pgmdesc+")"+"." );
   }

   protected void cleanup( )
   {
      this.aP0[0] = consultadeproduccion_fasesfullexport.this.AV11Filename;
      this.aP1[0] = consultadeproduccion_fasesfullexport.this.AV12ErrorMessage;
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
      AV63Var_Hdr = "" ;
      AV61WebSession = httpContext.getWebSession();
      AV57EmprCod = "" ;
      AV60BarCodPar = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV38TFFasCod_Sel = "" ;
      AV37TFFasCod = "" ;
      AV40TFFasDsc_Sel = "" ;
      AV39TFFasDsc = "" ;
      AV42TFMaqCodBis_Sel = "" ;
      AV41TFMaqCodBis = "" ;
      AV43TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV47TFBarTieRea = DecimalUtil.ZERO ;
      AV48TFBarTieRea_To = DecimalUtil.ZERO ;
      AV50TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV52TFBarFasKgm = DecimalUtil.ZERO ;
      AV53TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV54TFBarFasMtr = DecimalUtil.ZERO ;
      AV55TFBarFasMtr_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      AV18Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A396EmprCod = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A215BarTieRea = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A6173BarFasSec = "" ;
      A935BarReoPar = "" ;
      A130BarCodPar = "" ;
      A2697ExHdrFeE = GXutil.nullDate() ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      AV82Consultadeproduccion_fasesfullds_1_emprcod = "" ;
      AV85Consultadeproduccion_fasesfullds_4_barcodpar = "" ;
      AV88Consultadeproduccion_fasesfullds_7_tffascod = "" ;
      AV89Consultadeproduccion_fasesfullds_8_tffascod_sel = "" ;
      AV90Consultadeproduccion_fasesfullds_9_tffasdsc = "" ;
      AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel = "" ;
      AV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis = "" ;
      AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = "" ;
      AV94Consultadeproduccion_fasesfullds_13_tfbarfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV95Consultadeproduccion_fasesfullds_14_tfbartierea = DecimalUtil.ZERO ;
      AV96Consultadeproduccion_fasesfullds_15_tfbartierea_to = DecimalUtil.ZERO ;
      AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV98Consultadeproduccion_fasesfullds_17_tfbarfaskgm = DecimalUtil.ZERO ;
      AV99Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV100Consultadeproduccion_fasesfullds_19_tfbarfasmtr = DecimalUtil.ZERO ;
      AV101Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV88Consultadeproduccion_fasesfullds_7_tffascod = "" ;
      lV90Consultadeproduccion_fasesfullds_9_tffasdsc = "" ;
      lV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis = "" ;
      P0A3Y2_A396EmprCod = new String[] {""} ;
      P0A3Y2_A129BarCod = new int[1] ;
      P0A3Y2_n129BarCod = new boolean[] {false} ;
      P0A3Y2_A132BarCodReo = new byte[1] ;
      P0A3Y2_n132BarCodReo = new boolean[] {false} ;
      P0A3Y2_A130BarCodPar = new String[] {""} ;
      P0A3Y2_n130BarCodPar = new boolean[] {false} ;
      P0A3Y2_A3836BarFasPri = new byte[1] ;
      P0A3Y2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3Y2_n3838BarFasMtr = new boolean[] {false} ;
      P0A3Y2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3Y2_n3837BarFasKgm = new boolean[] {false} ;
      P0A3Y2_A153BarFasEst = new byte[1] ;
      P0A3Y2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3Y2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Y2_n4442BarFasDTI = new boolean[] {false} ;
      P0A3Y2_A603MaqCodBis = new String[] {""} ;
      P0A3Y2_A460FasDsc = new String[] {""} ;
      P0A3Y2_A457FasCod = new String[] {""} ;
      P0A3Y2_A194BarOrdLin = new short[1] ;
      P0A3Y2_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Y2_n4443BarFasDTF = new boolean[] {false} ;
      P0A3Y2_A2265BarExt = new byte[1] ;
      P0A3Y2_n2265BarExt = new boolean[] {false} ;
      P0A3Y2_A148BarEstReo = new byte[1] ;
      P0A3Y2_A6173BarFasSec = new String[] {""} ;
      P0A3Y2_n6173BarFasSec = new boolean[] {false} ;
      P0A3Y2_A934BarReoCod = new int[1] ;
      P0A3Y2_A936BarReoReo = new byte[1] ;
      P0A3Y2_A935BarReoPar = new String[] {""} ;
      P0A3Y2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV22MaqDsc = "" ;
      AV72BarFasDTF = "" ;
      AV74FasCod = "" ;
      P0A3Y3_A396EmprCod = new String[] {""} ;
      P0A3Y3_A129BarCod = new int[1] ;
      P0A3Y3_n129BarCod = new boolean[] {false} ;
      P0A3Y3_A132BarCodReo = new byte[1] ;
      P0A3Y3_n132BarCodReo = new boolean[] {false} ;
      P0A3Y3_A130BarCodPar = new String[] {""} ;
      P0A3Y3_n130BarCodPar = new boolean[] {false} ;
      P0A3Y3_A2689ExHdrFas = new String[] {""} ;
      P0A3Y3_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Y3_n2697ExHdrFeE = new boolean[] {false} ;
      P0A3Y3_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Y3_n2700ExHdrFeR = new boolean[] {false} ;
      P0A3Y3_A2248ManCod = new short[1] ;
      P0A3Y3_A2692ExHdrLin = new int[1] ;
      A2689ExHdrFas = "" ;
      AV75ExHdrFeE = GXutil.nullDate() ;
      AV73ExHdrFeR = GXutil.nullDate() ;
      AV23OpeNom = "" ;
      P0A3Y4_A396EmprCod = new String[] {""} ;
      P0A3Y4_A129BarCod = new int[1] ;
      P0A3Y4_n129BarCod = new boolean[] {false} ;
      P0A3Y4_A132BarCodReo = new byte[1] ;
      P0A3Y4_n132BarCodReo = new boolean[] {false} ;
      P0A3Y4_A130BarCodPar = new String[] {""} ;
      P0A3Y4_n130BarCodPar = new boolean[] {false} ;
      P0A3Y4_A3836BarFasPri = new byte[1] ;
      P0A3Y4_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3Y4_n3838BarFasMtr = new boolean[] {false} ;
      P0A3Y4_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3Y4_n3837BarFasKgm = new boolean[] {false} ;
      P0A3Y4_A153BarFasEst = new byte[1] ;
      P0A3Y4_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3Y4_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Y4_n4442BarFasDTI = new boolean[] {false} ;
      P0A3Y4_A603MaqCodBis = new String[] {""} ;
      P0A3Y4_A460FasDsc = new String[] {""} ;
      P0A3Y4_A457FasCod = new String[] {""} ;
      P0A3Y4_A194BarOrdLin = new short[1] ;
      P0A3Y4_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Y4_n4443BarFasDTF = new boolean[] {false} ;
      P0A3Y4_A2265BarExt = new byte[1] ;
      P0A3Y4_n2265BarExt = new boolean[] {false} ;
      P0A3Y4_A148BarEstReo = new byte[1] ;
      P0A3Y4_A6173BarFasSec = new String[] {""} ;
      P0A3Y4_n6173BarFasSec = new boolean[] {false} ;
      P0A3Y4_A934BarReoCod = new int[1] ;
      P0A3Y4_A936BarReoReo = new byte[1] ;
      P0A3Y4_A935BarReoPar = new String[] {""} ;
      P0A3Y4_A758ProCod = new String[] {""} ;
      P0A3Y5_A396EmprCod = new String[] {""} ;
      P0A3Y5_A129BarCod = new int[1] ;
      P0A3Y5_n129BarCod = new boolean[] {false} ;
      P0A3Y5_A132BarCodReo = new byte[1] ;
      P0A3Y5_n132BarCodReo = new boolean[] {false} ;
      P0A3Y5_A130BarCodPar = new String[] {""} ;
      P0A3Y5_n130BarCodPar = new boolean[] {false} ;
      P0A3Y5_A2689ExHdrFas = new String[] {""} ;
      P0A3Y5_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Y5_n2697ExHdrFeE = new boolean[] {false} ;
      P0A3Y5_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Y5_n2700ExHdrFeR = new boolean[] {false} ;
      P0A3Y5_A2248ManCod = new short[1] ;
      P0A3Y5_A2692ExHdrLin = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int3 = new short[1] ;
      AV28UserCustomValue = "" ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV49TFBarFasEst_SelsJson = "" ;
      AV69Station = "" ;
      GXt_char4 = "" ;
      GXv_char7 = new String[1] ;
      AV71EmprNom = "" ;
      GXv_char6 = new String[1] ;
      AV70UsurCod = "" ;
      GXv_char5 = new String[1] ;
      AV108Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion_fasesfullexport__default(),
         new Object[] {
             new Object[] {
            P0A3Y2_A396EmprCod, P0A3Y2_A129BarCod, P0A3Y2_A132BarCodReo, P0A3Y2_A130BarCodPar, P0A3Y2_A3836BarFasPri, P0A3Y2_A3838BarFasMtr, P0A3Y2_n3838BarFasMtr, P0A3Y2_A3837BarFasKgm, P0A3Y2_n3837BarFasKgm, P0A3Y2_A153BarFasEst,
            P0A3Y2_A215BarTieRea, P0A3Y2_A4442BarFasDTI, P0A3Y2_n4442BarFasDTI, P0A3Y2_A603MaqCodBis, P0A3Y2_A460FasDsc, P0A3Y2_A457FasCod, P0A3Y2_A194BarOrdLin, P0A3Y2_A4443BarFasDTF, P0A3Y2_n4443BarFasDTF, P0A3Y2_A2265BarExt,
            P0A3Y2_n2265BarExt, P0A3Y2_A148BarEstReo, P0A3Y2_A6173BarFasSec, P0A3Y2_n6173BarFasSec, P0A3Y2_A934BarReoCod, P0A3Y2_A936BarReoReo, P0A3Y2_A935BarReoPar, P0A3Y2_A758ProCod
            }
            , new Object[] {
            P0A3Y3_A396EmprCod, P0A3Y3_A129BarCod, P0A3Y3_n129BarCod, P0A3Y3_A132BarCodReo, P0A3Y3_n132BarCodReo, P0A3Y3_A130BarCodPar, P0A3Y3_n130BarCodPar, P0A3Y3_A2689ExHdrFas, P0A3Y3_A2697ExHdrFeE, P0A3Y3_n2697ExHdrFeE,
            P0A3Y3_A2700ExHdrFeR, P0A3Y3_n2700ExHdrFeR, P0A3Y3_A2248ManCod, P0A3Y3_A2692ExHdrLin
            }
            , new Object[] {
            P0A3Y4_A396EmprCod, P0A3Y4_A129BarCod, P0A3Y4_A132BarCodReo, P0A3Y4_A130BarCodPar, P0A3Y4_A3836BarFasPri, P0A3Y4_A3838BarFasMtr, P0A3Y4_n3838BarFasMtr, P0A3Y4_A3837BarFasKgm, P0A3Y4_n3837BarFasKgm, P0A3Y4_A153BarFasEst,
            P0A3Y4_A215BarTieRea, P0A3Y4_A4442BarFasDTI, P0A3Y4_n4442BarFasDTI, P0A3Y4_A603MaqCodBis, P0A3Y4_A460FasDsc, P0A3Y4_A457FasCod, P0A3Y4_A194BarOrdLin, P0A3Y4_A4443BarFasDTF, P0A3Y4_n4443BarFasDTF, P0A3Y4_A2265BarExt,
            P0A3Y4_n2265BarExt, P0A3Y4_A148BarEstReo, P0A3Y4_A6173BarFasSec, P0A3Y4_n6173BarFasSec, P0A3Y4_A934BarReoCod, P0A3Y4_A936BarReoReo, P0A3Y4_A935BarReoPar, P0A3Y4_A758ProCod
            }
            , new Object[] {
            P0A3Y5_A396EmprCod, P0A3Y5_A129BarCod, P0A3Y5_n129BarCod, P0A3Y5_A132BarCodReo, P0A3Y5_n132BarCodReo, P0A3Y5_A130BarCodPar, P0A3Y5_n130BarCodPar, P0A3Y5_A2689ExHdrFas, P0A3Y5_A2697ExHdrFeE, P0A3Y5_n2697ExHdrFeE,
            P0A3Y5_A2700ExHdrFeR, P0A3Y5_n2700ExHdrFeR, P0A3Y5_A2248ManCod, P0A3Y5_A2692ExHdrLin
            }
         }
      );
      AV108Pgmdesc = httpContext.getMessage( "Consulta de Producción", "") ;
      /* GeneXus formulas. */
      AV108Pgmdesc = httpContext.getMessage( "Consulta de Producción", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV59BarCodReo ;
   private byte AV51TFBarFasEst_Sel ;
   private byte AV67TFBarFasPri ;
   private byte AV68TFBarFasPri_To ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte A2265BarExt ;
   private byte A148BarEstReo ;
   private byte A936BarReoReo ;
   private byte A132BarCodReo ;
   private byte AV84Consultadeproduccion_fasesfullds_3_barcodreo ;
   private byte AV102Consultadeproduccion_fasesfullds_21_tfbarfaspri ;
   private byte AV103Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ;
   private byte GXv_int9[] ;
   private short AV35TFBarOrdLin ;
   private short AV36TFBarOrdLin_To ;
   private short A194BarOrdLin ;
   private short AV86Consultadeproduccion_fasesfullds_5_tfbarordlin ;
   private short AV87Consultadeproduccion_fasesfullds_6_tfbarordlin_to ;
   private short AV16OrderedBy ;
   private short AV76Lexmvh ;
   private short A2248ManCod ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int AV58BarCod ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV79GXV1 ;
   private int AV80GXV2 ;
   private int A934BarReoCod ;
   private int A129BarCod ;
   private int AV83Consultadeproduccion_fasesfullds_2_barcod ;
   private int AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ;
   private int A2692ExHdrLin ;
   private int GXv_int8[] ;
   private int AV107GXV3 ;
   private long AV56i ;
   private long AV32VisibleColumnCount ;
   private java.math.BigDecimal AV47TFBarTieRea ;
   private java.math.BigDecimal AV48TFBarTieRea_To ;
   private java.math.BigDecimal AV52TFBarFasKgm ;
   private java.math.BigDecimal AV53TFBarFasKgm_To ;
   private java.math.BigDecimal AV54TFBarFasMtr ;
   private java.math.BigDecimal AV55TFBarFasMtr_To ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV95Consultadeproduccion_fasesfullds_14_tfbartierea ;
   private java.math.BigDecimal AV96Consultadeproduccion_fasesfullds_15_tfbartierea_to ;
   private java.math.BigDecimal AV98Consultadeproduccion_fasesfullds_17_tfbarfaskgm ;
   private java.math.BigDecimal AV99Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ;
   private java.math.BigDecimal AV100Consultadeproduccion_fasesfullds_19_tfbarfasmtr ;
   private java.math.BigDecimal AV101Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ;
   private String AV63Var_Hdr ;
   private String AV57EmprCod ;
   private String AV60BarCodPar ;
   private String AV38TFFasCod_Sel ;
   private String AV37TFFasCod ;
   private String AV40TFFasDsc_Sel ;
   private String AV39TFFasDsc ;
   private String AV42TFMaqCodBis_Sel ;
   private String AV41TFMaqCodBis ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String A396EmprCod ;
   private String A6173BarFasSec ;
   private String A935BarReoPar ;
   private String A130BarCodPar ;
   private String AV82Consultadeproduccion_fasesfullds_1_emprcod ;
   private String AV85Consultadeproduccion_fasesfullds_4_barcodpar ;
   private String AV88Consultadeproduccion_fasesfullds_7_tffascod ;
   private String AV89Consultadeproduccion_fasesfullds_8_tffascod_sel ;
   private String AV90Consultadeproduccion_fasesfullds_9_tffasdsc ;
   private String AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel ;
   private String AV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis ;
   private String AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ;
   private String scmdbuf ;
   private String lV88Consultadeproduccion_fasesfullds_7_tffascod ;
   private String lV90Consultadeproduccion_fasesfullds_9_tffasdsc ;
   private String lV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis ;
   private String A758ProCod ;
   private String AV22MaqDsc ;
   private String AV72BarFasDTF ;
   private String AV74FasCod ;
   private String A2689ExHdrFas ;
   private String AV23OpeNom ;
   private String AV69Station ;
   private String GXt_char4 ;
   private String GXv_char7[] ;
   private String AV71EmprNom ;
   private String GXv_char6[] ;
   private String AV70UsurCod ;
   private String GXv_char5[] ;
   private String AV108Pgmdesc ;
   private java.util.Date AV43TFBarFasDTI ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV94Consultadeproduccion_fasesfullds_13_tfbarfasdti ;
   private java.util.Date A2697ExHdrFeE ;
   private java.util.Date A2700ExHdrFeR ;
   private java.util.Date AV75ExHdrFeE ;
   private java.util.Date AV73ExHdrFeR ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n2265BarExt ;
   private boolean n6173BarFasSec ;
   private boolean n2697ExHdrFeE ;
   private boolean n2700ExHdrFeR ;
   private String AV27ColumnsSelectorXML ;
   private String AV28UserCustomValue ;
   private String AV49TFBarFasEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV50TFBarFasEst_Sels ;
   private GXSimpleCollection<Byte> AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ;
   private com.genexus.webpanels.WebSession AV61WebSession ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A3Y2_A396EmprCod ;
   private int[] P0A3Y2_A129BarCod ;
   private boolean[] P0A3Y2_n129BarCod ;
   private byte[] P0A3Y2_A132BarCodReo ;
   private boolean[] P0A3Y2_n132BarCodReo ;
   private String[] P0A3Y2_A130BarCodPar ;
   private boolean[] P0A3Y2_n130BarCodPar ;
   private byte[] P0A3Y2_A3836BarFasPri ;
   private java.math.BigDecimal[] P0A3Y2_A3838BarFasMtr ;
   private boolean[] P0A3Y2_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0A3Y2_A3837BarFasKgm ;
   private boolean[] P0A3Y2_n3837BarFasKgm ;
   private byte[] P0A3Y2_A153BarFasEst ;
   private java.math.BigDecimal[] P0A3Y2_A215BarTieRea ;
   private java.util.Date[] P0A3Y2_A4442BarFasDTI ;
   private boolean[] P0A3Y2_n4442BarFasDTI ;
   private String[] P0A3Y2_A603MaqCodBis ;
   private String[] P0A3Y2_A460FasDsc ;
   private String[] P0A3Y2_A457FasCod ;
   private short[] P0A3Y2_A194BarOrdLin ;
   private java.util.Date[] P0A3Y2_A4443BarFasDTF ;
   private boolean[] P0A3Y2_n4443BarFasDTF ;
   private byte[] P0A3Y2_A2265BarExt ;
   private boolean[] P0A3Y2_n2265BarExt ;
   private byte[] P0A3Y2_A148BarEstReo ;
   private String[] P0A3Y2_A6173BarFasSec ;
   private boolean[] P0A3Y2_n6173BarFasSec ;
   private int[] P0A3Y2_A934BarReoCod ;
   private byte[] P0A3Y2_A936BarReoReo ;
   private String[] P0A3Y2_A935BarReoPar ;
   private String[] P0A3Y2_A758ProCod ;
   private String[] P0A3Y3_A396EmprCod ;
   private int[] P0A3Y3_A129BarCod ;
   private boolean[] P0A3Y3_n129BarCod ;
   private byte[] P0A3Y3_A132BarCodReo ;
   private boolean[] P0A3Y3_n132BarCodReo ;
   private String[] P0A3Y3_A130BarCodPar ;
   private boolean[] P0A3Y3_n130BarCodPar ;
   private String[] P0A3Y3_A2689ExHdrFas ;
   private java.util.Date[] P0A3Y3_A2697ExHdrFeE ;
   private boolean[] P0A3Y3_n2697ExHdrFeE ;
   private java.util.Date[] P0A3Y3_A2700ExHdrFeR ;
   private boolean[] P0A3Y3_n2700ExHdrFeR ;
   private short[] P0A3Y3_A2248ManCod ;
   private int[] P0A3Y3_A2692ExHdrLin ;
   private String[] P0A3Y4_A396EmprCod ;
   private int[] P0A3Y4_A129BarCod ;
   private boolean[] P0A3Y4_n129BarCod ;
   private byte[] P0A3Y4_A132BarCodReo ;
   private boolean[] P0A3Y4_n132BarCodReo ;
   private String[] P0A3Y4_A130BarCodPar ;
   private boolean[] P0A3Y4_n130BarCodPar ;
   private byte[] P0A3Y4_A3836BarFasPri ;
   private java.math.BigDecimal[] P0A3Y4_A3838BarFasMtr ;
   private boolean[] P0A3Y4_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0A3Y4_A3837BarFasKgm ;
   private boolean[] P0A3Y4_n3837BarFasKgm ;
   private byte[] P0A3Y4_A153BarFasEst ;
   private java.math.BigDecimal[] P0A3Y4_A215BarTieRea ;
   private java.util.Date[] P0A3Y4_A4442BarFasDTI ;
   private boolean[] P0A3Y4_n4442BarFasDTI ;
   private String[] P0A3Y4_A603MaqCodBis ;
   private String[] P0A3Y4_A460FasDsc ;
   private String[] P0A3Y4_A457FasCod ;
   private short[] P0A3Y4_A194BarOrdLin ;
   private java.util.Date[] P0A3Y4_A4443BarFasDTF ;
   private boolean[] P0A3Y4_n4443BarFasDTF ;
   private byte[] P0A3Y4_A2265BarExt ;
   private boolean[] P0A3Y4_n2265BarExt ;
   private byte[] P0A3Y4_A148BarEstReo ;
   private String[] P0A3Y4_A6173BarFasSec ;
   private boolean[] P0A3Y4_n6173BarFasSec ;
   private int[] P0A3Y4_A934BarReoCod ;
   private byte[] P0A3Y4_A936BarReoReo ;
   private String[] P0A3Y4_A935BarReoPar ;
   private String[] P0A3Y4_A758ProCod ;
   private String[] P0A3Y5_A396EmprCod ;
   private int[] P0A3Y5_A129BarCod ;
   private boolean[] P0A3Y5_n129BarCod ;
   private byte[] P0A3Y5_A132BarCodReo ;
   private boolean[] P0A3Y5_n132BarCodReo ;
   private String[] P0A3Y5_A130BarCodPar ;
   private boolean[] P0A3Y5_n130BarCodPar ;
   private String[] P0A3Y5_A2689ExHdrFas ;
   private java.util.Date[] P0A3Y5_A2697ExHdrFeE ;
   private boolean[] P0A3Y5_n2697ExHdrFeE ;
   private java.util.Date[] P0A3Y5_A2700ExHdrFeR ;
   private boolean[] P0A3Y5_n2700ExHdrFeR ;
   private short[] P0A3Y5_A2248ManCod ;
   private int[] P0A3Y5_A2692ExHdrLin ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV26ColumnsSelector_Column ;
}

final  class consultadeproduccion_fasesfullexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A3Y2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                          short AV86Consultadeproduccion_fasesfullds_5_tfbarordlin ,
                                          short AV87Consultadeproduccion_fasesfullds_6_tfbarordlin_to ,
                                          String AV89Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                          String AV88Consultadeproduccion_fasesfullds_7_tffascod ,
                                          String AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                          String AV90Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                          String AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                          String AV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                          java.util.Date AV94Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                          java.math.BigDecimal AV95Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                          java.math.BigDecimal AV96Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                          int AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV98Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                          java.math.BigDecimal AV99Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV100Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                          java.math.BigDecimal AV101Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                          byte AV102Consultadeproduccion_fasesfullds_21_tfbarfaspri ,
                                          byte AV103Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV57EmprCod ,
                                          int A129BarCod ,
                                          int AV58BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV59BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV60BarCodPar ,
                                          String AV82Consultadeproduccion_fasesfullds_1_emprcod ,
                                          int AV83Consultadeproduccion_fasesfullds_2_barcod ,
                                          byte AV84Consultadeproduccion_fasesfullds_3_barcodreo ,
                                          String AV85Consultadeproduccion_fasesfullds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[25];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis, T3.FasDsc," ;
      scmdbuf += " T1.FasCod, T1.BarOrdLin, T1.BarFasDTF, T2.BarExt, T2.BarEstReo, T1.BarFasSec, T2.BarReoCod, T2.BarReoReo, T2.BarReoPar, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN" ;
      scmdbuf += " TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV86Consultadeproduccion_fasesfullds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV87Consultadeproduccion_fasesfullds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV88Consultadeproduccion_fasesfullds_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Consultadeproduccion_fasesfullds_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV94Consultadeproduccion_fasesfullds_13_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Consultadeproduccion_fasesfullds_14_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Consultadeproduccion_fasesfullds_15_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Consultadeproduccion_fasesfullds_17_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Consultadeproduccion_fasesfullds_19_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV102Consultadeproduccion_fasesfullds_21_tfbarfaspri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV103Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.FasDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T3.FasDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCodBis DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasDTI" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasDTI DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieRea" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieRea DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasEst" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasKgm" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasKgm DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasMtr" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasMtr DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasPri" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasPri DESC" ;
      }
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P0A3Y4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                          short AV86Consultadeproduccion_fasesfullds_5_tfbarordlin ,
                                          short AV87Consultadeproduccion_fasesfullds_6_tfbarordlin_to ,
                                          String AV89Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                          String AV88Consultadeproduccion_fasesfullds_7_tffascod ,
                                          String AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                          String AV90Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                          String AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                          String AV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                          java.util.Date AV94Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                          java.math.BigDecimal AV95Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                          java.math.BigDecimal AV96Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                          int AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV98Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                          java.math.BigDecimal AV99Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV100Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                          java.math.BigDecimal AV101Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                          byte AV102Consultadeproduccion_fasesfullds_21_tfbarfaspri ,
                                          byte AV103Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV57EmprCod ,
                                          int A129BarCod ,
                                          int AV58BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV59BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV60BarCodPar ,
                                          String AV82Consultadeproduccion_fasesfullds_1_emprcod ,
                                          int AV83Consultadeproduccion_fasesfullds_2_barcod ,
                                          byte AV84Consultadeproduccion_fasesfullds_3_barcodreo ,
                                          String AV85Consultadeproduccion_fasesfullds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[25];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis, T3.FasDsc," ;
      scmdbuf += " T1.FasCod, T1.BarOrdLin, T1.BarFasDTF, T2.BarExt, T2.BarEstReo, T1.BarFasSec, T2.BarReoCod, T2.BarReoReo, T2.BarReoPar, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN" ;
      scmdbuf += " TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV86Consultadeproduccion_fasesfullds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (0==AV87Consultadeproduccion_fasesfullds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV88Consultadeproduccion_fasesfullds_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Consultadeproduccion_fasesfullds_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV92Consultadeproduccion_fasesfullds_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV94Consultadeproduccion_fasesfullds_13_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Consultadeproduccion_fasesfullds_14_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Consultadeproduccion_fasesfullds_15_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Consultadeproduccion_fasesfullds_16_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Consultadeproduccion_fasesfullds_17_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Consultadeproduccion_fasesfullds_19_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( ! (0==AV102Consultadeproduccion_fasesfullds_21_tfbarfaspri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( ! (0==AV103Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.FasDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T3.FasDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCodBis DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasDTI" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasDTI DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieRea" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieRea DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasEst" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasKgm" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasKgm DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasMtr" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasMtr DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasPri" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasPri DESC" ;
      }
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
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
                  return conditional_P0A3Y2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
            case 2 :
                  return conditional_P0A3Y4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3Y3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas, ExHdrFeE, ExHdrFeR, ManCod, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ExHdrFas = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3Y4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3Y5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas, ExHdrFeE, ExHdrFeR, ManCod, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ExHdrFas = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               ((String[]) buf[14])[0] = rslt.getString(12, 28);
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(19);
               ((byte[]) buf[25])[0] = rslt.getByte(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 1);
               ((String[]) buf[27])[0] = rslt.getString(22, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               ((String[]) buf[14])[0] = rslt.getString(12, 28);
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(19);
               ((byte[]) buf[25])[0] = rslt.getByte(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 1);
               ((String[]) buf[27])[0] = rslt.getString(22, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((int[]) buf[13])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

