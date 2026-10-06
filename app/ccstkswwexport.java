package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ccstkswwexport extends GXProcedure
{
   public ccstkswwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ccstkswwexport.class ), "" );
   }

   public ccstkswwexport( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ccstkswwexport.this.aP1 = new String[] {""};
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
      ccstkswwexport.this.aP0 = aP0;
      ccstkswwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "CCSTKSWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFEmprCod_Sel, GXv_char5) ;
         ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFEmprCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFEmprCod, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFPrdNum_Sel, GXv_char5) ;
         ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFPrdNum, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV38TFCCStkLin) && (0==AV39TFCCStkLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Linea Movimiento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFCCStkLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFCCStkLin_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFCCStkCanE)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFCCStkCanE_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFCCStkCanE)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41TFCCStkCanE_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFCCStkCanS)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFCCStkCanS_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad Salida", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42TFCCStkCanS)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFCCStkCanS_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFTipMovCc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Tipo Movimiento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFTipMovCc_Sel, GXv_char5) ;
         ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFTipMovCc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Tipo Movimiento", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFTipMovCc, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFTipMovCn_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Tipo Movimiento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFTipMovCn_Sel, GXv_char5) ;
         ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFTipMovCn)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Tipo Movimiento", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFTipMovCn, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFCCStkPri_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "CCStkPri", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFCCStkPri_Sel, GXv_char5) ;
         ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFCCStkPri)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "CCStkPri", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFCCStkPri, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50TFCCStkFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Movimiento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV50TFCCStkFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFCCStkPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFCCStkPre_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFCCStkPre)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFCCStkPre_To)) );
      }
      if ( ! ( (0==AV54TFCCStkBar) && (0==AV55TFCCStkBar_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hoja de Ruta", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFCCStkBar );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFCCStkBar_To );
      }
      if ( ! ( (0==AV56TFCCStkReo) && (0==AV57TFCCStkReo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Reoperado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV56TFCCStkReo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV57TFCCStkReo_To );
      }
      if ( ! ( (GXutil.strcmp("", AV59TFCCStkPar_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Particion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFCCStkPar_Sel, GXv_char5) ;
         ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFCCStkPar)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Particion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFCCStkPar, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV60TFCCStkPed) && (0==AV61TFCCStkPed_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pedido", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV60TFCCStkPed );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV61TFCCStkPed_To );
      }
      if ( ! ( (GXutil.strcmp("", AV63TFCCStkAlb_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Albaran", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFCCStkAlb_Sel, GXv_char5) ;
         ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFCCStkAlb)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Albaran", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFCCStkAlb, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV65TFCCStkUsu_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFCCStkUsu_Sel, GXv_char5) ;
         ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV64TFCCStkUsu)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFCCStkUsu, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV67TFCCStkHor_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFCCStkHor_Sel, GXv_char5) ;
         ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV66TFCCStkHor)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFCCStkHor, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV69TFCCStkDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFCCStkDsc_Sel, GXv_char5) ;
         ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV68TFCCStkDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFCCStkDsc, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV70TFCCStkLen) && (0==AV71TFCCStkLen_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Linea Entrada Almacen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV70TFCCStkLen );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV71TFCCStkLen_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFPrdExiAlm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFPrdExiAlm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Existencias Almacen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV72TFPrdExiAlm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV73TFPrdExiAlm_To)) );
      }
      if ( ! ( (0==AV74TFCcoCod) && (0==AV75TFCcoCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "CcoCod", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV74TFCcoCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV75TFCcoCod_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFValorE)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFValorE_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor Entradas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV76TFValorE)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV77TFValorE_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFValorS)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFValorS_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor salidas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV78TFValorS)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV79TFValorS_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80TFValorEI)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81TFValorEI_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "ValorEI", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV80TFValorEI)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV81TFValorEI_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFValorSI)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83TFValorSI_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "ValorSI", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV82TFValorSI)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ccstkswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV83TFValorSI_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("CCSTKSWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("CCSTKSWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV87GXV1 = 1 ;
      while ( AV87GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV87GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV87GXV1 = (int)(AV87GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV89Ccstkswwds_1_filterfulltext = AV18FilterFullText ;
      AV90Ccstkswwds_2_tfemprcod = AV34TFEmprCod ;
      AV91Ccstkswwds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV92Ccstkswwds_4_tfprdnum = AV36TFPrdNum ;
      AV93Ccstkswwds_5_tfprdnum_sel = AV37TFPrdNum_Sel ;
      AV94Ccstkswwds_6_tfccstklin = AV38TFCCStkLin ;
      AV95Ccstkswwds_7_tfccstklin_to = AV39TFCCStkLin_To ;
      AV96Ccstkswwds_8_tfccstkcane = AV40TFCCStkCanE ;
      AV97Ccstkswwds_9_tfccstkcane_to = AV41TFCCStkCanE_To ;
      AV98Ccstkswwds_10_tfccstkcans = AV42TFCCStkCanS ;
      AV99Ccstkswwds_11_tfccstkcans_to = AV43TFCCStkCanS_To ;
      AV100Ccstkswwds_12_tftipmovcc = AV44TFTipMovCc ;
      AV101Ccstkswwds_13_tftipmovcc_sel = AV45TFTipMovCc_Sel ;
      AV102Ccstkswwds_14_tftipmovcn = AV46TFTipMovCn ;
      AV103Ccstkswwds_15_tftipmovcn_sel = AV47TFTipMovCn_Sel ;
      AV104Ccstkswwds_16_tfccstkpri = AV48TFCCStkPri ;
      AV105Ccstkswwds_17_tfccstkpri_sel = AV49TFCCStkPri_Sel ;
      AV106Ccstkswwds_18_tfccstkfec = AV50TFCCStkFec ;
      AV107Ccstkswwds_19_tfccstkpre = AV52TFCCStkPre ;
      AV108Ccstkswwds_20_tfccstkpre_to = AV53TFCCStkPre_To ;
      AV109Ccstkswwds_21_tfccstkbar = AV54TFCCStkBar ;
      AV110Ccstkswwds_22_tfccstkbar_to = AV55TFCCStkBar_To ;
      AV111Ccstkswwds_23_tfccstkreo = AV56TFCCStkReo ;
      AV112Ccstkswwds_24_tfccstkreo_to = AV57TFCCStkReo_To ;
      AV113Ccstkswwds_25_tfccstkpar = AV58TFCCStkPar ;
      AV114Ccstkswwds_26_tfccstkpar_sel = AV59TFCCStkPar_Sel ;
      AV115Ccstkswwds_27_tfccstkped = AV60TFCCStkPed ;
      AV116Ccstkswwds_28_tfccstkped_to = AV61TFCCStkPed_To ;
      AV117Ccstkswwds_29_tfccstkalb = AV62TFCCStkAlb ;
      AV118Ccstkswwds_30_tfccstkalb_sel = AV63TFCCStkAlb_Sel ;
      AV119Ccstkswwds_31_tfccstkusu = AV64TFCCStkUsu ;
      AV120Ccstkswwds_32_tfccstkusu_sel = AV65TFCCStkUsu_Sel ;
      AV121Ccstkswwds_33_tfccstkhor = AV66TFCCStkHor ;
      AV122Ccstkswwds_34_tfccstkhor_sel = AV67TFCCStkHor_Sel ;
      AV123Ccstkswwds_35_tfccstkdsc = AV68TFCCStkDsc ;
      AV124Ccstkswwds_36_tfccstkdsc_sel = AV69TFCCStkDsc_Sel ;
      AV125Ccstkswwds_37_tfccstklen = AV70TFCCStkLen ;
      AV126Ccstkswwds_38_tfccstklen_to = AV71TFCCStkLen_To ;
      AV127Ccstkswwds_39_tfprdexialm = AV72TFPrdExiAlm ;
      AV128Ccstkswwds_40_tfprdexialm_to = AV73TFPrdExiAlm_To ;
      AV129Ccstkswwds_41_tfccocod = AV74TFCcoCod ;
      AV130Ccstkswwds_42_tfccocod_to = AV75TFCcoCod_To ;
      AV131Ccstkswwds_43_tfvalore = AV76TFValorE ;
      AV132Ccstkswwds_44_tfvalore_to = AV77TFValorE_To ;
      AV133Ccstkswwds_45_tfvalors = AV78TFValorS ;
      AV134Ccstkswwds_46_tfvalors_to = AV79TFValorS_To ;
      AV135Ccstkswwds_47_tfvalorei = AV80TFValorEI ;
      AV136Ccstkswwds_48_tfvalorei_to = AV81TFValorEI_To ;
      AV137Ccstkswwds_49_tfvalorsi = AV82TFValorSI ;
      AV138Ccstkswwds_50_tfvalorsi_to = AV83TFValorSI_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV91Ccstkswwds_3_tfemprcod_sel ,
                                           AV90Ccstkswwds_2_tfemprcod ,
                                           AV93Ccstkswwds_5_tfprdnum_sel ,
                                           AV92Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV94Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV95Ccstkswwds_7_tfccstklin_to) ,
                                           AV96Ccstkswwds_8_tfccstkcane ,
                                           AV97Ccstkswwds_9_tfccstkcane_to ,
                                           AV98Ccstkswwds_10_tfccstkcans ,
                                           AV99Ccstkswwds_11_tfccstkcans_to ,
                                           AV101Ccstkswwds_13_tftipmovcc_sel ,
                                           AV100Ccstkswwds_12_tftipmovcc ,
                                           AV103Ccstkswwds_15_tftipmovcn_sel ,
                                           AV102Ccstkswwds_14_tftipmovcn ,
                                           AV105Ccstkswwds_17_tfccstkpri_sel ,
                                           AV104Ccstkswwds_16_tfccstkpri ,
                                           AV106Ccstkswwds_18_tfccstkfec ,
                                           AV107Ccstkswwds_19_tfccstkpre ,
                                           AV108Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV109Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV110Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV111Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV112Ccstkswwds_24_tfccstkreo_to) ,
                                           AV114Ccstkswwds_26_tfccstkpar_sel ,
                                           AV113Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV115Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV116Ccstkswwds_28_tfccstkped_to) ,
                                           AV118Ccstkswwds_30_tfccstkalb_sel ,
                                           AV117Ccstkswwds_29_tfccstkalb ,
                                           AV120Ccstkswwds_32_tfccstkusu_sel ,
                                           AV119Ccstkswwds_31_tfccstkusu ,
                                           AV122Ccstkswwds_34_tfccstkhor_sel ,
                                           AV121Ccstkswwds_33_tfccstkhor ,
                                           AV124Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV123Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV125Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV126Ccstkswwds_38_tfccstklen_to) ,
                                           AV127Ccstkswwds_39_tfprdexialm ,
                                           AV128Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV129Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV130Ccstkswwds_42_tfccocod_to) ,
                                           AV135Ccstkswwds_47_tfvalorei ,
                                           AV136Ccstkswwds_48_tfvalorei_to ,
                                           AV137Ccstkswwds_49_tfvalorsi ,
                                           AV138Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV89Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV131Ccstkswwds_43_tfvalore ,
                                           AV132Ccstkswwds_44_tfvalore_to ,
                                           AV133Ccstkswwds_45_tfvalors ,
                                           AV134Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV89Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV90Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV92Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV92Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV100Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV100Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV102Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV102Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV104Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV104Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV113Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV113Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV117Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV117Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV119Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV119Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV121Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV121Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV123Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV123Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LF3 */
      pr_default.execute(0, new Object[] {AV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, lV89Ccstkswwds_1_filterfulltext, AV131Ccstkswwds_43_tfvalore, AV131Ccstkswwds_43_tfvalore, AV132Ccstkswwds_44_tfvalore_to, AV132Ccstkswwds_44_tfvalore_to, AV133Ccstkswwds_45_tfvalors, AV133Ccstkswwds_45_tfvalors, AV134Ccstkswwds_46_tfvalors_to, AV134Ccstkswwds_46_tfvalors_to, lV90Ccstkswwds_2_tfemprcod, AV91Ccstkswwds_3_tfemprcod_sel, lV92Ccstkswwds_4_tfprdnum, AV93Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV94Ccstkswwds_6_tfccstklin), Long.valueOf(AV95Ccstkswwds_7_tfccstklin_to), AV96Ccstkswwds_8_tfccstkcane, AV97Ccstkswwds_9_tfccstkcane_to, AV98Ccstkswwds_10_tfccstkcans, AV99Ccstkswwds_11_tfccstkcans_to, lV100Ccstkswwds_12_tftipmovcc, AV101Ccstkswwds_13_tftipmovcc_sel, lV102Ccstkswwds_14_tftipmovcn, AV103Ccstkswwds_15_tftipmovcn_sel, lV104Ccstkswwds_16_tfccstkpri, AV105Ccstkswwds_17_tfccstkpri_sel, AV106Ccstkswwds_18_tfccstkfec, AV107Ccstkswwds_19_tfccstkpre, AV108Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV109Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV110Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV111Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV112Ccstkswwds_24_tfccstkreo_to), lV113Ccstkswwds_25_tfccstkpar, AV114Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV115Ccstkswwds_27_tfccstkped), Integer.valueOf(AV116Ccstkswwds_28_tfccstkped_to), lV117Ccstkswwds_29_tfccstkalb, AV118Ccstkswwds_30_tfccstkalb_sel, lV119Ccstkswwds_31_tfccstkusu, AV120Ccstkswwds_32_tfccstkusu_sel, lV121Ccstkswwds_33_tfccstkhor, AV122Ccstkswwds_34_tfccstkhor_sel, lV123Ccstkswwds_35_tfccstkdsc, AV124Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV125Ccstkswwds_37_tfccstklen), Short.valueOf(AV126Ccstkswwds_38_tfccstklen_to), AV127Ccstkswwds_39_tfprdexialm, AV128Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV129Ccstkswwds_41_tfccocod), Short.valueOf(AV130Ccstkswwds_42_tfccocod_to), AV135Ccstkswwds_47_tfvalorei, AV136Ccstkswwds_48_tfvalorei_to, AV137Ccstkswwds_49_tfvalorsi, AV138Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3917ValorSI = P09LF3_A3917ValorSI[0] ;
         A3916ValorEI = P09LF3_A3916ValorEI[0] ;
         A3839CcoCod = P09LF3_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LF3_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LF3_A3358CCStkLen[0] ;
         A3357CCStkDsc = P09LF3_A3357CCStkDsc[0] ;
         A3356CCStkHor = P09LF3_A3356CCStkHor[0] ;
         A3355CCStkUsu = P09LF3_A3355CCStkUsu[0] ;
         A3354CCStkAlb = P09LF3_A3354CCStkAlb[0] ;
         A3353CCStkPed = P09LF3_A3353CCStkPed[0] ;
         A3352CCStkPar = P09LF3_A3352CCStkPar[0] ;
         A3351CCStkReo = P09LF3_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LF3_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LF3_A3348CCStkFec[0] ;
         A3347CCStkPri = P09LF3_A3347CCStkPri[0] ;
         A3346TipMovCn = P09LF3_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LF3_n3346TipMovCn[0] ;
         A3345TipMovCc = P09LF3_A3345TipMovCc[0] ;
         A3342CCStkLin = P09LF3_A3342CCStkLin[0] ;
         A719PrdNum = P09LF3_A719PrdNum[0] ;
         A396EmprCod = P09LF3_A396EmprCod[0] ;
         A3344CCStkCanS = P09LF3_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LF3_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LF3_A3343CCStkCanE[0] ;
         A3910ValorS = P09LF3_A3910ValorS[0] ;
         A3909ValorE = P09LF3_A3909ValorE[0] ;
         A704PrdExiAlm = P09LF3_A704PrdExiAlm[0] ;
         A3346TipMovCn = P09LF3_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LF3_n3346TipMovCn[0] ;
         A3910ValorS = P09LF3_A3910ValorS[0] ;
         A3909ValorE = P09LF3_A3909ValorE[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A396EmprCod, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A3342CCStkLin );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3343CCStkCanE)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3344CCStkCanS)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3345TipMovCc, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3346TipMovCn, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3347CCStkPri, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A3348CCStkFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3349CCStkPre)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A3350CCStkBar );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A3351CCStkReo );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3352CCStkPar, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A3353CCStkPed );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3354CCStkAlb, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3355CCStkUsu, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3356CCStkHor, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3357CCStkDsc, GXv_char5) ;
            ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A3358CCStkLen );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A704PrdExiAlm)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A3839CcoCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3909ValorE)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3910ValorS)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3916ValorEI)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3917ValorSI)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "EmprCod", "", "Código Empresa", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNum", "", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkLin", "", "Linea Movimiento", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkCanE", "", "Cantidad Entrada", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkCanS", "", "Cantidad Salida", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipMovCc", "", "Codigo Tipo Movimiento", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipMovCn", "", "Descripcion Tipo Movimiento", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkPri", "", "CCStkPri", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkFec", "", "Fecha Movimiento", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkPre", "", "Precio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkBar", "", "Hoja de Ruta", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkReo", "", "Reoperado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkPar", "", "Particion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkPed", "", "Pedido", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkAlb", "", "Albaran", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkUsu", "", "Usuario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkHor", "", "Hora", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CCStkLen", "", "Linea Entrada Almacen", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdExiAlm", "", "Existencias Almacen", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CcoCod", "", "CcoCod", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ValorE", "", "Valor Entradas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ValorS", "", "Valor salidas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ValorEI", "", "ValorEI", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ValorSI", "", "ValorSI", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CCSTKSWWColumnsSelector", GXv_char5) ;
      ccstkswwexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("CCSTKSWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CCSTKSWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("CCSTKSWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV139GXV2 = 1 ;
      while ( AV139GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV139GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV34TFEmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV35TFEmprCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV36TFPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV37TFPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLIN") == 0 )
         {
            AV38TFCCStkLin = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV39TFCCStkLin_To = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKCANE") == 0 )
         {
            AV40TFCCStkCanE = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFCCStkCanE_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKCANS") == 0 )
         {
            AV42TFCCStkCanS = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFCCStkCanS_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC") == 0 )
         {
            AV44TFTipMovCc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC_SEL") == 0 )
         {
            AV45TFTipMovCc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCN") == 0 )
         {
            AV46TFTipMovCn = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCN_SEL") == 0 )
         {
            AV47TFTipMovCn_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRI") == 0 )
         {
            AV48TFCCStkPri = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRI_SEL") == 0 )
         {
            AV49TFCCStkPri_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKFEC") == 0 )
         {
            AV50TFCCStkFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRE") == 0 )
         {
            AV52TFCCStkPre = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFCCStkPre_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKBAR") == 0 )
         {
            AV54TFCCStkBar = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFCCStkBar_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKREO") == 0 )
         {
            AV56TFCCStkReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFCCStkReo_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPAR") == 0 )
         {
            AV58TFCCStkPar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPAR_SEL") == 0 )
         {
            AV59TFCCStkPar_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPED") == 0 )
         {
            AV60TFCCStkPed = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFCCStkPed_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKALB") == 0 )
         {
            AV62TFCCStkAlb = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKALB_SEL") == 0 )
         {
            AV63TFCCStkAlb_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU") == 0 )
         {
            AV64TFCCStkUsu = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU_SEL") == 0 )
         {
            AV65TFCCStkUsu_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR") == 0 )
         {
            AV66TFCCStkHor = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR_SEL") == 0 )
         {
            AV67TFCCStkHor_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC") == 0 )
         {
            AV68TFCCStkDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC_SEL") == 0 )
         {
            AV69TFCCStkDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLEN") == 0 )
         {
            AV70TFCCStkLen = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFCCStkLen_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV72TFPrdExiAlm = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV73TFPrdExiAlm_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCOCOD") == 0 )
         {
            AV74TFCcoCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV75TFCcoCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORE") == 0 )
         {
            AV76TFValorE = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV77TFValorE_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORS") == 0 )
         {
            AV78TFValorS = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV79TFValorS_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALOREI") == 0 )
         {
            AV80TFValorEI = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV81TFValorEI_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORSI") == 0 )
         {
            AV82TFValorSI = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV83TFValorSI_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV139GXV2 = (int)(AV139GXV2+1) ;
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
      this.aP0[0] = ccstkswwexport.this.AV11Filename;
      this.aP1[0] = ccstkswwexport.this.AV12ErrorMessage;
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
      AV35TFEmprCod_Sel = "" ;
      AV34TFEmprCod = "" ;
      AV37TFPrdNum_Sel = "" ;
      AV36TFPrdNum = "" ;
      AV40TFCCStkCanE = DecimalUtil.ZERO ;
      AV41TFCCStkCanE_To = DecimalUtil.ZERO ;
      AV42TFCCStkCanS = DecimalUtil.ZERO ;
      AV43TFCCStkCanS_To = DecimalUtil.ZERO ;
      AV45TFTipMovCc_Sel = "" ;
      AV44TFTipMovCc = "" ;
      AV47TFTipMovCn_Sel = "" ;
      AV46TFTipMovCn = "" ;
      AV49TFCCStkPri_Sel = "" ;
      AV48TFCCStkPri = "" ;
      AV50TFCCStkFec = GXutil.nullDate() ;
      AV52TFCCStkPre = DecimalUtil.ZERO ;
      AV53TFCCStkPre_To = DecimalUtil.ZERO ;
      AV59TFCCStkPar_Sel = "" ;
      AV58TFCCStkPar = "" ;
      AV63TFCCStkAlb_Sel = "" ;
      AV62TFCCStkAlb = "" ;
      AV65TFCCStkUsu_Sel = "" ;
      AV64TFCCStkUsu = "" ;
      AV67TFCCStkHor_Sel = "" ;
      AV66TFCCStkHor = "" ;
      AV69TFCCStkDsc_Sel = "" ;
      AV68TFCCStkDsc = "" ;
      AV72TFPrdExiAlm = DecimalUtil.ZERO ;
      AV73TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV76TFValorE = DecimalUtil.ZERO ;
      AV77TFValorE_To = DecimalUtil.ZERO ;
      AV78TFValorS = DecimalUtil.ZERO ;
      AV79TFValorS_To = DecimalUtil.ZERO ;
      AV80TFValorEI = DecimalUtil.ZERO ;
      AV81TFValorEI_To = DecimalUtil.ZERO ;
      AV82TFValorSI = DecimalUtil.ZERO ;
      AV83TFValorSI_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3346TipMovCn = "" ;
      A3347CCStkPri = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3354CCStkAlb = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      A3357CCStkDsc = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A3909ValorE = DecimalUtil.ZERO ;
      A3910ValorS = DecimalUtil.ZERO ;
      A3916ValorEI = DecimalUtil.ZERO ;
      A3917ValorSI = DecimalUtil.ZERO ;
      AV89Ccstkswwds_1_filterfulltext = "" ;
      AV90Ccstkswwds_2_tfemprcod = "" ;
      AV91Ccstkswwds_3_tfemprcod_sel = "" ;
      AV92Ccstkswwds_4_tfprdnum = "" ;
      AV93Ccstkswwds_5_tfprdnum_sel = "" ;
      AV96Ccstkswwds_8_tfccstkcane = DecimalUtil.ZERO ;
      AV97Ccstkswwds_9_tfccstkcane_to = DecimalUtil.ZERO ;
      AV98Ccstkswwds_10_tfccstkcans = DecimalUtil.ZERO ;
      AV99Ccstkswwds_11_tfccstkcans_to = DecimalUtil.ZERO ;
      AV100Ccstkswwds_12_tftipmovcc = "" ;
      AV101Ccstkswwds_13_tftipmovcc_sel = "" ;
      AV102Ccstkswwds_14_tftipmovcn = "" ;
      AV103Ccstkswwds_15_tftipmovcn_sel = "" ;
      AV104Ccstkswwds_16_tfccstkpri = "" ;
      AV105Ccstkswwds_17_tfccstkpri_sel = "" ;
      AV106Ccstkswwds_18_tfccstkfec = GXutil.nullDate() ;
      AV107Ccstkswwds_19_tfccstkpre = DecimalUtil.ZERO ;
      AV108Ccstkswwds_20_tfccstkpre_to = DecimalUtil.ZERO ;
      AV113Ccstkswwds_25_tfccstkpar = "" ;
      AV114Ccstkswwds_26_tfccstkpar_sel = "" ;
      AV117Ccstkswwds_29_tfccstkalb = "" ;
      AV118Ccstkswwds_30_tfccstkalb_sel = "" ;
      AV119Ccstkswwds_31_tfccstkusu = "" ;
      AV120Ccstkswwds_32_tfccstkusu_sel = "" ;
      AV121Ccstkswwds_33_tfccstkhor = "" ;
      AV122Ccstkswwds_34_tfccstkhor_sel = "" ;
      AV123Ccstkswwds_35_tfccstkdsc = "" ;
      AV124Ccstkswwds_36_tfccstkdsc_sel = "" ;
      AV127Ccstkswwds_39_tfprdexialm = DecimalUtil.ZERO ;
      AV128Ccstkswwds_40_tfprdexialm_to = DecimalUtil.ZERO ;
      AV131Ccstkswwds_43_tfvalore = DecimalUtil.ZERO ;
      AV132Ccstkswwds_44_tfvalore_to = DecimalUtil.ZERO ;
      AV133Ccstkswwds_45_tfvalors = DecimalUtil.ZERO ;
      AV134Ccstkswwds_46_tfvalors_to = DecimalUtil.ZERO ;
      AV135Ccstkswwds_47_tfvalorei = DecimalUtil.ZERO ;
      AV136Ccstkswwds_48_tfvalorei_to = DecimalUtil.ZERO ;
      AV137Ccstkswwds_49_tfvalorsi = DecimalUtil.ZERO ;
      AV138Ccstkswwds_50_tfvalorsi_to = DecimalUtil.ZERO ;
      lV89Ccstkswwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV90Ccstkswwds_2_tfemprcod = "" ;
      lV92Ccstkswwds_4_tfprdnum = "" ;
      lV100Ccstkswwds_12_tftipmovcc = "" ;
      lV102Ccstkswwds_14_tftipmovcn = "" ;
      lV104Ccstkswwds_16_tfccstkpri = "" ;
      lV113Ccstkswwds_25_tfccstkpar = "" ;
      lV117Ccstkswwds_29_tfccstkalb = "" ;
      lV119Ccstkswwds_31_tfccstkusu = "" ;
      lV121Ccstkswwds_33_tfccstkhor = "" ;
      lV123Ccstkswwds_35_tfccstkdsc = "" ;
      P09LF3_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LF3_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LF3_A3839CcoCod = new short[1] ;
      P09LF3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LF3_A3358CCStkLen = new short[1] ;
      P09LF3_A3357CCStkDsc = new String[] {""} ;
      P09LF3_A3356CCStkHor = new String[] {""} ;
      P09LF3_A3355CCStkUsu = new String[] {""} ;
      P09LF3_A3354CCStkAlb = new String[] {""} ;
      P09LF3_A3353CCStkPed = new int[1] ;
      P09LF3_A3352CCStkPar = new String[] {""} ;
      P09LF3_A3351CCStkReo = new byte[1] ;
      P09LF3_A3350CCStkBar = new int[1] ;
      P09LF3_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LF3_A3347CCStkPri = new String[] {""} ;
      P09LF3_A3346TipMovCn = new String[] {""} ;
      P09LF3_n3346TipMovCn = new boolean[] {false} ;
      P09LF3_A3345TipMovCc = new String[] {""} ;
      P09LF3_A3342CCStkLin = new long[1] ;
      P09LF3_A719PrdNum = new String[] {""} ;
      P09LF3_A396EmprCod = new String[] {""} ;
      P09LF3_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LF3_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LF3_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LF3_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LF3_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ccstkswwexport__default(),
         new Object[] {
             new Object[] {
            P09LF3_A3917ValorSI, P09LF3_A3916ValorEI, P09LF3_A3839CcoCod, P09LF3_A704PrdExiAlm, P09LF3_A3358CCStkLen, P09LF3_A3357CCStkDsc, P09LF3_A3356CCStkHor, P09LF3_A3355CCStkUsu, P09LF3_A3354CCStkAlb, P09LF3_A3353CCStkPed,
            P09LF3_A3352CCStkPar, P09LF3_A3351CCStkReo, P09LF3_A3350CCStkBar, P09LF3_A3348CCStkFec, P09LF3_A3347CCStkPri, P09LF3_A3346TipMovCn, P09LF3_n3346TipMovCn, P09LF3_A3345TipMovCc, P09LF3_A3342CCStkLin, P09LF3_A719PrdNum,
            P09LF3_A396EmprCod, P09LF3_A3344CCStkCanS, P09LF3_A3349CCStkPre, P09LF3_A3343CCStkCanE, P09LF3_A3910ValorS, P09LF3_A3909ValorE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV56TFCCStkReo ;
   private byte AV57TFCCStkReo_To ;
   private byte A3351CCStkReo ;
   private byte AV111Ccstkswwds_23_tfccstkreo ;
   private byte AV112Ccstkswwds_24_tfccstkreo_to ;
   private short AV70TFCCStkLen ;
   private short AV71TFCCStkLen_To ;
   private short AV74TFCcoCod ;
   private short AV75TFCcoCod_To ;
   private short GXv_int3[] ;
   private short A3358CCStkLen ;
   private short A3839CcoCod ;
   private short AV125Ccstkswwds_37_tfccstklen ;
   private short AV126Ccstkswwds_38_tfccstklen_to ;
   private short AV129Ccstkswwds_41_tfccocod ;
   private short AV130Ccstkswwds_42_tfccocod_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV54TFCCStkBar ;
   private int AV55TFCCStkBar_To ;
   private int AV60TFCCStkPed ;
   private int AV61TFCCStkPed_To ;
   private int AV87GXV1 ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int AV109Ccstkswwds_21_tfccstkbar ;
   private int AV110Ccstkswwds_22_tfccstkbar_to ;
   private int AV115Ccstkswwds_27_tfccstkped ;
   private int AV116Ccstkswwds_28_tfccstkped_to ;
   private int AV139GXV2 ;
   private long AV38TFCCStkLin ;
   private long AV39TFCCStkLin_To ;
   private long AV31VisibleColumnCount ;
   private long A3342CCStkLin ;
   private long AV94Ccstkswwds_6_tfccstklin ;
   private long AV95Ccstkswwds_7_tfccstklin_to ;
   private java.math.BigDecimal AV40TFCCStkCanE ;
   private java.math.BigDecimal AV41TFCCStkCanE_To ;
   private java.math.BigDecimal AV42TFCCStkCanS ;
   private java.math.BigDecimal AV43TFCCStkCanS_To ;
   private java.math.BigDecimal AV52TFCCStkPre ;
   private java.math.BigDecimal AV53TFCCStkPre_To ;
   private java.math.BigDecimal AV72TFPrdExiAlm ;
   private java.math.BigDecimal AV73TFPrdExiAlm_To ;
   private java.math.BigDecimal AV76TFValorE ;
   private java.math.BigDecimal AV77TFValorE_To ;
   private java.math.BigDecimal AV78TFValorS ;
   private java.math.BigDecimal AV79TFValorS_To ;
   private java.math.BigDecimal AV80TFValorEI ;
   private java.math.BigDecimal AV81TFValorEI_To ;
   private java.math.BigDecimal AV82TFValorSI ;
   private java.math.BigDecimal AV83TFValorSI_To ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A3909ValorE ;
   private java.math.BigDecimal A3910ValorS ;
   private java.math.BigDecimal A3916ValorEI ;
   private java.math.BigDecimal A3917ValorSI ;
   private java.math.BigDecimal AV96Ccstkswwds_8_tfccstkcane ;
   private java.math.BigDecimal AV97Ccstkswwds_9_tfccstkcane_to ;
   private java.math.BigDecimal AV98Ccstkswwds_10_tfccstkcans ;
   private java.math.BigDecimal AV99Ccstkswwds_11_tfccstkcans_to ;
   private java.math.BigDecimal AV107Ccstkswwds_19_tfccstkpre ;
   private java.math.BigDecimal AV108Ccstkswwds_20_tfccstkpre_to ;
   private java.math.BigDecimal AV127Ccstkswwds_39_tfprdexialm ;
   private java.math.BigDecimal AV128Ccstkswwds_40_tfprdexialm_to ;
   private java.math.BigDecimal AV131Ccstkswwds_43_tfvalore ;
   private java.math.BigDecimal AV132Ccstkswwds_44_tfvalore_to ;
   private java.math.BigDecimal AV133Ccstkswwds_45_tfvalors ;
   private java.math.BigDecimal AV134Ccstkswwds_46_tfvalors_to ;
   private java.math.BigDecimal AV135Ccstkswwds_47_tfvalorei ;
   private java.math.BigDecimal AV136Ccstkswwds_48_tfvalorei_to ;
   private java.math.BigDecimal AV137Ccstkswwds_49_tfvalorsi ;
   private java.math.BigDecimal AV138Ccstkswwds_50_tfvalorsi_to ;
   private String AV35TFEmprCod_Sel ;
   private String AV34TFEmprCod ;
   private String AV37TFPrdNum_Sel ;
   private String AV36TFPrdNum ;
   private String AV45TFTipMovCc_Sel ;
   private String AV44TFTipMovCc ;
   private String AV47TFTipMovCn_Sel ;
   private String AV46TFTipMovCn ;
   private String AV49TFCCStkPri_Sel ;
   private String AV48TFCCStkPri ;
   private String AV59TFCCStkPar_Sel ;
   private String AV58TFCCStkPar ;
   private String AV63TFCCStkAlb_Sel ;
   private String AV62TFCCStkAlb ;
   private String AV65TFCCStkUsu_Sel ;
   private String AV64TFCCStkUsu ;
   private String AV67TFCCStkHor_Sel ;
   private String AV66TFCCStkHor ;
   private String AV69TFCCStkDsc_Sel ;
   private String AV68TFCCStkDsc ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A3346TipMovCn ;
   private String A3347CCStkPri ;
   private String A3352CCStkPar ;
   private String A3354CCStkAlb ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String A3357CCStkDsc ;
   private String AV90Ccstkswwds_2_tfemprcod ;
   private String AV91Ccstkswwds_3_tfemprcod_sel ;
   private String AV92Ccstkswwds_4_tfprdnum ;
   private String AV93Ccstkswwds_5_tfprdnum_sel ;
   private String AV100Ccstkswwds_12_tftipmovcc ;
   private String AV101Ccstkswwds_13_tftipmovcc_sel ;
   private String AV102Ccstkswwds_14_tftipmovcn ;
   private String AV103Ccstkswwds_15_tftipmovcn_sel ;
   private String AV104Ccstkswwds_16_tfccstkpri ;
   private String AV105Ccstkswwds_17_tfccstkpri_sel ;
   private String AV113Ccstkswwds_25_tfccstkpar ;
   private String AV114Ccstkswwds_26_tfccstkpar_sel ;
   private String AV117Ccstkswwds_29_tfccstkalb ;
   private String AV118Ccstkswwds_30_tfccstkalb_sel ;
   private String AV119Ccstkswwds_31_tfccstkusu ;
   private String AV120Ccstkswwds_32_tfccstkusu_sel ;
   private String AV121Ccstkswwds_33_tfccstkhor ;
   private String AV122Ccstkswwds_34_tfccstkhor_sel ;
   private String AV123Ccstkswwds_35_tfccstkdsc ;
   private String AV124Ccstkswwds_36_tfccstkdsc_sel ;
   private String scmdbuf ;
   private String lV90Ccstkswwds_2_tfemprcod ;
   private String lV92Ccstkswwds_4_tfprdnum ;
   private String lV100Ccstkswwds_12_tftipmovcc ;
   private String lV102Ccstkswwds_14_tftipmovcn ;
   private String lV104Ccstkswwds_16_tfccstkpri ;
   private String lV113Ccstkswwds_25_tfccstkpar ;
   private String lV117Ccstkswwds_29_tfccstkalb ;
   private String lV119Ccstkswwds_31_tfccstkusu ;
   private String lV121Ccstkswwds_33_tfccstkhor ;
   private String lV123Ccstkswwds_35_tfccstkdsc ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV50TFCCStkFec ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV106Ccstkswwds_18_tfccstkfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n3346TipMovCn ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV89Ccstkswwds_1_filterfulltext ;
   private String lV89Ccstkswwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09LF3_A3917ValorSI ;
   private java.math.BigDecimal[] P09LF3_A3916ValorEI ;
   private short[] P09LF3_A3839CcoCod ;
   private java.math.BigDecimal[] P09LF3_A704PrdExiAlm ;
   private short[] P09LF3_A3358CCStkLen ;
   private String[] P09LF3_A3357CCStkDsc ;
   private String[] P09LF3_A3356CCStkHor ;
   private String[] P09LF3_A3355CCStkUsu ;
   private String[] P09LF3_A3354CCStkAlb ;
   private int[] P09LF3_A3353CCStkPed ;
   private String[] P09LF3_A3352CCStkPar ;
   private byte[] P09LF3_A3351CCStkReo ;
   private int[] P09LF3_A3350CCStkBar ;
   private java.util.Date[] P09LF3_A3348CCStkFec ;
   private String[] P09LF3_A3347CCStkPri ;
   private String[] P09LF3_A3346TipMovCn ;
   private boolean[] P09LF3_n3346TipMovCn ;
   private String[] P09LF3_A3345TipMovCc ;
   private long[] P09LF3_A3342CCStkLin ;
   private String[] P09LF3_A719PrdNum ;
   private String[] P09LF3_A396EmprCod ;
   private java.math.BigDecimal[] P09LF3_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LF3_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LF3_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LF3_A3910ValorS ;
   private java.math.BigDecimal[] P09LF3_A3909ValorE ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class ccstkswwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LF3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Ccstkswwds_3_tfemprcod_sel ,
                                          String AV90Ccstkswwds_2_tfemprcod ,
                                          String AV93Ccstkswwds_5_tfprdnum_sel ,
                                          String AV92Ccstkswwds_4_tfprdnum ,
                                          long AV94Ccstkswwds_6_tfccstklin ,
                                          long AV95Ccstkswwds_7_tfccstklin_to ,
                                          java.math.BigDecimal AV96Ccstkswwds_8_tfccstkcane ,
                                          java.math.BigDecimal AV97Ccstkswwds_9_tfccstkcane_to ,
                                          java.math.BigDecimal AV98Ccstkswwds_10_tfccstkcans ,
                                          java.math.BigDecimal AV99Ccstkswwds_11_tfccstkcans_to ,
                                          String AV101Ccstkswwds_13_tftipmovcc_sel ,
                                          String AV100Ccstkswwds_12_tftipmovcc ,
                                          String AV103Ccstkswwds_15_tftipmovcn_sel ,
                                          String AV102Ccstkswwds_14_tftipmovcn ,
                                          String AV105Ccstkswwds_17_tfccstkpri_sel ,
                                          String AV104Ccstkswwds_16_tfccstkpri ,
                                          java.util.Date AV106Ccstkswwds_18_tfccstkfec ,
                                          java.math.BigDecimal AV107Ccstkswwds_19_tfccstkpre ,
                                          java.math.BigDecimal AV108Ccstkswwds_20_tfccstkpre_to ,
                                          int AV109Ccstkswwds_21_tfccstkbar ,
                                          int AV110Ccstkswwds_22_tfccstkbar_to ,
                                          byte AV111Ccstkswwds_23_tfccstkreo ,
                                          byte AV112Ccstkswwds_24_tfccstkreo_to ,
                                          String AV114Ccstkswwds_26_tfccstkpar_sel ,
                                          String AV113Ccstkswwds_25_tfccstkpar ,
                                          int AV115Ccstkswwds_27_tfccstkped ,
                                          int AV116Ccstkswwds_28_tfccstkped_to ,
                                          String AV118Ccstkswwds_30_tfccstkalb_sel ,
                                          String AV117Ccstkswwds_29_tfccstkalb ,
                                          String AV120Ccstkswwds_32_tfccstkusu_sel ,
                                          String AV119Ccstkswwds_31_tfccstkusu ,
                                          String AV122Ccstkswwds_34_tfccstkhor_sel ,
                                          String AV121Ccstkswwds_33_tfccstkhor ,
                                          String AV124Ccstkswwds_36_tfccstkdsc_sel ,
                                          String AV123Ccstkswwds_35_tfccstkdsc ,
                                          short AV125Ccstkswwds_37_tfccstklen ,
                                          short AV126Ccstkswwds_38_tfccstklen_to ,
                                          java.math.BigDecimal AV127Ccstkswwds_39_tfprdexialm ,
                                          java.math.BigDecimal AV128Ccstkswwds_40_tfprdexialm_to ,
                                          short AV129Ccstkswwds_41_tfccocod ,
                                          short AV130Ccstkswwds_42_tfccocod_to ,
                                          java.math.BigDecimal AV135Ccstkswwds_47_tfvalorei ,
                                          java.math.BigDecimal AV136Ccstkswwds_48_tfvalorei_to ,
                                          java.math.BigDecimal AV137Ccstkswwds_49_tfvalorsi ,
                                          java.math.BigDecimal AV138Ccstkswwds_50_tfvalorsi_to ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          long A3342CCStkLin ,
                                          java.math.BigDecimal A3343CCStkCanE ,
                                          java.math.BigDecimal A3344CCStkCanS ,
                                          String A3345TipMovCc ,
                                          String A3346TipMovCn ,
                                          String A3347CCStkPri ,
                                          java.util.Date A3348CCStkFec ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          int A3350CCStkBar ,
                                          byte A3351CCStkReo ,
                                          String A3352CCStkPar ,
                                          int A3353CCStkPed ,
                                          String A3354CCStkAlb ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          String A3357CCStkDsc ,
                                          short A3358CCStkLen ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          short A3839CcoCod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV89Ccstkswwds_1_filterfulltext ,
                                          java.math.BigDecimal A3909ValorE ,
                                          java.math.BigDecimal A3910ValorS ,
                                          java.math.BigDecimal A3916ValorEI ,
                                          java.math.BigDecimal A3917ValorSI ,
                                          java.math.BigDecimal AV131Ccstkswwds_43_tfvalore ,
                                          java.math.BigDecimal AV132Ccstkswwds_44_tfvalore_to ,
                                          java.math.BigDecimal AV133Ccstkswwds_45_tfvalors ,
                                          java.math.BigDecimal AV134Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[78];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T2.PrdExiAlm, T1.CCStkLen," ;
      scmdbuf += " T1.CCStkDsc, T1.CCStkHor, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T3.TipMovCn, T1.TipMovCc, T1.CCStkLin," ;
      scmdbuf += " T1.PrdNum, T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV91Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV90Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV92Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (0==AV94Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (0==AV95Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV100Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV102Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV104Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int9[51] = (byte)(1) ;
      }
      if ( ! (0==AV109Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int9[52] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int9[53] = (byte)(1) ;
      }
      if ( ! (0==AV111Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int9[54] = (byte)(1) ;
      }
      if ( ! (0==AV112Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int9[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV113Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int9[57] = (byte)(1) ;
      }
      if ( ! (0==AV115Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int9[58] = (byte)(1) ;
      }
      if ( ! (0==AV116Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int9[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV117Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int9[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV119Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int9[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV121Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int9[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV123Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int9[67] = (byte)(1) ;
      }
      if ( ! (0==AV125Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int9[68] = (byte)(1) ;
      }
      if ( ! (0==AV126Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int9[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int9[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int9[71] = (byte)(1) ;
      }
      if ( ! (0==AV129Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int9[72] = (byte)(1) ;
      }
      if ( ! (0==AV130Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int9[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int9[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int9[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int9[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int9[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkCanE" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkCanE DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkLin" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkCanS" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkCanS DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipMovCc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipMovCc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipMovCn" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipMovCn DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkPri" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkPri DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkFec" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkPre" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkPre DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkBar" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkBar DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkReo" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkReo DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkPar" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkPar DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkPed" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkPed DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkAlb" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkAlb DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkUsu" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkUsu DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkHor" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkHor DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkDsc" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkLen" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkLen DESC" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdExiAlm" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdExiAlm DESC" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CcoCod" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CcoCod DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P09LF3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , ((Number) dynConstraints[66]).shortValue() , ((Boolean) dynConstraints[67]).booleanValue() , (String)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LF3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 2);
               ((long[]) buf[18])[0] = rslt.getLong(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
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
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
      }
   }

}

