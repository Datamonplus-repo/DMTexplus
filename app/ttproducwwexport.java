package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttproducwwexport extends GXProcedure
{
   public ttproducwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttproducwwexport.class ), "" );
   }

   public ttproducwwexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ttproducwwexport.this.aP1 = new String[] {""};
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
      ttproducwwexport.this.aP0 = aP0;
      ttproducwwexport.this.aP1 = aP1;
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
      AV11Filename = "TTproducWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (GXutil.strcmp("", AV48TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFPrdNom_Sel, GXv_char5) ;
         ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFPrdNom, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV46TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFPrdNum_Sel, GXv_char5) ;
         ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFPrdNum, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdExiAlm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFPrdExiAlm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Exis Alm", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFPrdExiAlm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFPrdExiAlm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPrdCanRes)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFPrdCanRes_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cant Res", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFPrdCanRes)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54TFPrdCanRes_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102TFPrdDisponible)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103TFPrdDisponible_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disponible", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV102TFPrdDisponible)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103TFPrdDisponible_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFPrdCanPen)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdCanPen_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cant Pdte", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV55TFPrdCanPen)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56TFPrdCanPen_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFPrdPreAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFPrdPreAct_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFPrdPreAct)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFPrdPreAct_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV62TFValDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Validez", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFValDsc_Sel, GXv_char5) ;
         ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV61TFValDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Validez", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFValDsc, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV64TFPrdRec_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Rec?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFPrdRec_Sel, GXv_char5) ;
         ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV63TFPrdRec)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Rec?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFPrdRec, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFPrdAox)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdAox_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "AOX (adsorbable organic halogens)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TFPrdAox)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66TFPrdAox_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV101TFPrdGots_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Global Organic Textile Standar", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV101TFPrdGots_Sel, GXv_char5) ;
         ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV100TFPrdGots)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Global Organic Textile Standar", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV100TFPrdGots, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV68TFPrdReach_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "REACH", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFPrdReach_Sel, GXv_char5) ;
         ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV67TFPrdReach)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "REACH", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFPrdReach, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV94TFPrdOkotex_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Oeko Tex", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV83i = 1 ;
         AV106GXV1 = 1 ;
         while ( AV106GXV1 <= AV94TFPrdOkotex_Sels.size() )
         {
            AV70TFPrdOkotex_Sel = (String)AV94TFPrdOkotex_Sels.elementAt(-1+AV106GXV1) ;
            if ( AV83i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV70TFPrdOkotex_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV70TFPrdOkotex_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "S", "") );
            }
            AV83i = (long)(AV83i+1) ;
            AV106GXV1 = (int)(AV106GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV72TFPrdHm_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "HM", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFPrdHm_Sel, GXv_char5) ;
         ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFPrdHm)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "HM", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFPrdHm, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV96TFPrdZDHC_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "ZDHC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV83i = 1 ;
         AV107GXV2 = 1 ;
         while ( AV107GXV2 <= AV96TFPrdZDHC_Sels.size() )
         {
            AV73TFPrdZDHC_Sel = (String)AV96TFPrdZDHC_Sels.elementAt(-1+AV107GXV2) ;
            if ( AV83i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV73TFPrdZDHC_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV73TFPrdZDHC_Sel), "1") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Nivel 1", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV73TFPrdZDHC_Sel), "2") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Nivel 2", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV73TFPrdZDHC_Sel), "3") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Nivel 3", "") );
            }
            AV83i = (long)(AV83i+1) ;
            AV107GXV2 = (int)(AV107GXV2+1) ;
         }
      }
      if ( ! ( ( AV98TFPrdList_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "List by Inditex ", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV83i = 1 ;
         AV108GXV3 = 1 ;
         while ( AV108GXV3 <= AV98TFPrdList_Sels.size() )
         {
            AV74TFPrdList_Sel = (String)AV98TFPrdList_Sels.elementAt(-1+AV108GXV3) ;
            if ( AV83i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV74TFPrdList_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "S", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV74TFPrdList_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            AV83i = (long)(AV83i+1) ;
            AV108GXV3 = (int)(AV108GXV3+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV76TFPrdTHELIST_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "THELIST", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFPrdTHELIST_Sel, GXv_char5) ;
         ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV75TFPrdTHELIST)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "THELIST", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFPrdTHELIST, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV78TFPrdHS_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hoja Segur", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFPrdHS_Sel, GXv_char5) ;
         ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV77TFPrdHS)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hoja Segur", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFPrdHS, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79TFPrdFHS)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80TFPrdFHS_To)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Hoja Segur", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV79TFPrdFHS );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV80TFPrdFHS_To );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV82TFPrdNum2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto Aux", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV82TFPrdNum2_Sel, GXv_char5) ;
         ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV81TFPrdNum2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto Aux", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttproducwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV81TFPrdNum2, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV42VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV27Session.getValue("TTproducWWColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV27Session.getValue("TTproducWWColumnsSelector") ;
         AV34ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV109GXV4 = 1 ;
      while ( AV109GXV4 <= AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV36ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV109GXV4));
         if ( AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setColor( 11 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         AV109GXV4 = (int)(AV109GXV4+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV111Ttproducwwds_1_tfprdnom = AV47TFPrdNom ;
      AV112Ttproducwwds_2_tfprdnom_sel = AV48TFPrdNom_Sel ;
      AV113Ttproducwwds_3_tfprdnum = AV45TFPrdNum ;
      AV114Ttproducwwds_4_tfprdnum_sel = AV46TFPrdNum_Sel ;
      AV115Ttproducwwds_5_tfprdexialm = AV49TFPrdExiAlm ;
      AV116Ttproducwwds_6_tfprdexialm_to = AV50TFPrdExiAlm_To ;
      AV117Ttproducwwds_7_tfprdcanres = AV53TFPrdCanRes ;
      AV118Ttproducwwds_8_tfprdcanres_to = AV54TFPrdCanRes_To ;
      AV119Ttproducwwds_9_tfprddisponible = AV102TFPrdDisponible ;
      AV120Ttproducwwds_10_tfprddisponible_to = AV103TFPrdDisponible_To ;
      AV121Ttproducwwds_11_tfprdcanpen = AV55TFPrdCanPen ;
      AV122Ttproducwwds_12_tfprdcanpen_to = AV56TFPrdCanPen_To ;
      AV123Ttproducwwds_13_tfprdpreact = AV57TFPrdPreAct ;
      AV124Ttproducwwds_14_tfprdpreact_to = AV58TFPrdPreAct_To ;
      AV125Ttproducwwds_15_tfvaldsc = AV61TFValDsc ;
      AV126Ttproducwwds_16_tfvaldsc_sel = AV62TFValDsc_Sel ;
      AV127Ttproducwwds_17_tfprdrec = AV63TFPrdRec ;
      AV128Ttproducwwds_18_tfprdrec_sel = AV64TFPrdRec_Sel ;
      AV129Ttproducwwds_19_tfprdaox = AV65TFPrdAox ;
      AV130Ttproducwwds_20_tfprdaox_to = AV66TFPrdAox_To ;
      AV131Ttproducwwds_21_tfprdgots = AV100TFPrdGots ;
      AV132Ttproducwwds_22_tfprdgots_sel = AV101TFPrdGots_Sel ;
      AV133Ttproducwwds_23_tfprdreach = AV67TFPrdReach ;
      AV134Ttproducwwds_24_tfprdreach_sel = AV68TFPrdReach_Sel ;
      AV135Ttproducwwds_25_tfprdokotex_sels = AV94TFPrdOkotex_Sels ;
      AV136Ttproducwwds_26_tfprdhm = AV71TFPrdHm ;
      AV137Ttproducwwds_27_tfprdhm_sel = AV72TFPrdHm_Sel ;
      AV138Ttproducwwds_28_tfprdzdhc_sels = AV96TFPrdZDHC_Sels ;
      AV139Ttproducwwds_29_tfprdlist_sels = AV98TFPrdList_Sels ;
      AV140Ttproducwwds_30_tfprdthelist = AV75TFPrdTHELIST ;
      AV141Ttproducwwds_31_tfprdthelist_sel = AV76TFPrdTHELIST_Sel ;
      AV142Ttproducwwds_32_tfprdhs = AV77TFPrdHS ;
      AV143Ttproducwwds_33_tfprdhs_sel = AV78TFPrdHS_Sel ;
      AV144Ttproducwwds_34_tfprdfhs = AV79TFPrdFHS ;
      AV145Ttproducwwds_35_tfprdfhs_to = AV80TFPrdFHS_To ;
      AV146Ttproducwwds_36_tfprdnum2 = AV81TFPrdNum2 ;
      AV147Ttproducwwds_37_tfprdnum2_sel = AV82TFPrdNum2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV135Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV138Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV139Ttproducwwds_29_tfprdlist_sels ,
                                           AV112Ttproducwwds_2_tfprdnom_sel ,
                                           AV111Ttproducwwds_1_tfprdnom ,
                                           AV114Ttproducwwds_4_tfprdnum_sel ,
                                           AV113Ttproducwwds_3_tfprdnum ,
                                           AV115Ttproducwwds_5_tfprdexialm ,
                                           AV116Ttproducwwds_6_tfprdexialm_to ,
                                           AV117Ttproducwwds_7_tfprdcanres ,
                                           AV118Ttproducwwds_8_tfprdcanres_to ,
                                           AV119Ttproducwwds_9_tfprddisponible ,
                                           AV120Ttproducwwds_10_tfprddisponible_to ,
                                           AV121Ttproducwwds_11_tfprdcanpen ,
                                           AV122Ttproducwwds_12_tfprdcanpen_to ,
                                           AV123Ttproducwwds_13_tfprdpreact ,
                                           AV124Ttproducwwds_14_tfprdpreact_to ,
                                           AV126Ttproducwwds_16_tfvaldsc_sel ,
                                           AV125Ttproducwwds_15_tfvaldsc ,
                                           AV128Ttproducwwds_18_tfprdrec_sel ,
                                           AV127Ttproducwwds_17_tfprdrec ,
                                           AV129Ttproducwwds_19_tfprdaox ,
                                           AV130Ttproducwwds_20_tfprdaox_to ,
                                           AV132Ttproducwwds_22_tfprdgots_sel ,
                                           AV131Ttproducwwds_21_tfprdgots ,
                                           AV134Ttproducwwds_24_tfprdreach_sel ,
                                           AV133Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV135Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV137Ttproducwwds_27_tfprdhm_sel ,
                                           AV136Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV138Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV139Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV141Ttproducwwds_31_tfprdthelist_sel ,
                                           AV140Ttproducwwds_30_tfprdthelist ,
                                           AV143Ttproducwwds_33_tfprdhs_sel ,
                                           AV142Ttproducwwds_32_tfprdhs ,
                                           AV144Ttproducwwds_34_tfprdfhs ,
                                           AV145Ttproducwwds_35_tfprdfhs_to ,
                                           AV147Ttproducwwds_37_tfprdnum2_sel ,
                                           AV146Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV111Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV111Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV113Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV113Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV125Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV125Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV127Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV127Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV131Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV131Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV133Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV133Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV136Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV136Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV140Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV140Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV142Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV142Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV146Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV146Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor P08NY2 */
      pr_default.execute(0, new Object[] {lV111Ttproducwwds_1_tfprdnom, AV112Ttproducwwds_2_tfprdnom_sel, lV113Ttproducwwds_3_tfprdnum, AV114Ttproducwwds_4_tfprdnum_sel, AV115Ttproducwwds_5_tfprdexialm, AV116Ttproducwwds_6_tfprdexialm_to, AV117Ttproducwwds_7_tfprdcanres, AV118Ttproducwwds_8_tfprdcanres_to, AV119Ttproducwwds_9_tfprddisponible, AV120Ttproducwwds_10_tfprddisponible_to, AV121Ttproducwwds_11_tfprdcanpen, AV122Ttproducwwds_12_tfprdcanpen_to, AV123Ttproducwwds_13_tfprdpreact, AV124Ttproducwwds_14_tfprdpreact_to, lV125Ttproducwwds_15_tfvaldsc, AV126Ttproducwwds_16_tfvaldsc_sel, lV127Ttproducwwds_17_tfprdrec, AV128Ttproducwwds_18_tfprdrec_sel, AV129Ttproducwwds_19_tfprdaox, AV130Ttproducwwds_20_tfprdaox_to, lV131Ttproducwwds_21_tfprdgots, AV132Ttproducwwds_22_tfprdgots_sel, lV133Ttproducwwds_23_tfprdreach, AV134Ttproducwwds_24_tfprdreach_sel, lV136Ttproducwwds_26_tfprdhm, AV137Ttproducwwds_27_tfprdhm_sel, lV140Ttproducwwds_30_tfprdthelist, AV141Ttproducwwds_31_tfprdthelist_sel, lV142Ttproducwwds_32_tfprdhs, AV143Ttproducwwds_33_tfprdhs_sel, AV144Ttproducwwds_34_tfprdfhs, AV145Ttproducwwds_35_tfprdfhs_to, lV146Ttproducwwds_36_tfprdnum2, AV147Ttproducwwds_37_tfprdnum2_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08NY2_A396EmprCod[0] ;
         A856ValCod = P08NY2_A856ValCod[0] ;
         A4693PrdNum2 = P08NY2_A4693PrdNum2[0] ;
         A9742PrdFHS = P08NY2_A9742PrdFHS[0] ;
         A9741PrdHS = P08NY2_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08NY2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08NY2_n13302PrdTHELIST[0] ;
         A11687PrdList = P08NY2_A11687PrdList[0] ;
         A13301PrdZDHC = P08NY2_A13301PrdZDHC[0] ;
         A11364PrdHm = P08NY2_A11364PrdHm[0] ;
         A5888PrdOkotex = P08NY2_A5888PrdOkotex[0] ;
         A5887PrdReach = P08NY2_A5887PrdReach[0] ;
         A11363PrdGots = P08NY2_A11363PrdGots[0] ;
         A9733PrdAox = P08NY2_A9733PrdAox[0] ;
         A727PrdRec = P08NY2_A727PrdRec[0] ;
         A857ValDsc = P08NY2_A857ValDsc[0] ;
         n857ValDsc = P08NY2_n857ValDsc[0] ;
         A724PrdPreAct = P08NY2_A724PrdPreAct[0] ;
         A684PrdCanPen = P08NY2_A684PrdCanPen[0] ;
         A719PrdNum = P08NY2_A719PrdNum[0] ;
         A718PrdNom = P08NY2_A718PrdNom[0] ;
         A685PrdCanRes = P08NY2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08NY2_A704PrdExiAlm[0] ;
         A857ValDsc = P08NY2_A857ValDsc[0] ;
         n857ValDsc = P08NY2_n857ValDsc[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
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
         AV42VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A704PrdExiAlm)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A685PrdCanRes)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13831PrdDisponi)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A684PrdCanPen)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A724PrdPreAct)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A857ValDsc, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A727PrdRec, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9733PrdAox)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11363PrdGots, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5887PrdReach, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( "" );
            if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "S", "") );
            }
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11364PrdHm, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( "" );
            if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "1") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Nivel 1", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "2") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Nivel 2", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "3") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Nivel 3", "") );
            }
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( "" );
            if ( GXutil.strcmp(GXutil.trim( A11687PrdList), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "S", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( A11687PrdList), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
            }
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13302PrdTHELIST, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9741PrdHS, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A9742PrdFHS );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4693PrdNum2, GXv_char5) ;
            ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
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
      AV34ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNom", "", "Producto", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNum", "", "Producto", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdExiAlm", "", "Exis Alm", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdCanRes", "", "Cant Res", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdDisponible", "", "Disponible", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdCanPen", "", "Cant Pdte", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdPreAct", "", "Precio", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ValDsc", "", "Validez", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdRec", "", "Rec?", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdAox", "", "AOX (adsorbable organic halogens)", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdGots", "", "Global Organic Textile Standar", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdReach", "", "REACH", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdOkotex", "", "Oeko Tex", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdHm", "", "HM", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdZDHC", "", "ZDHC", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdList", "", "List by Inditex ", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdTHELIST", "", "THELIST", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdHS", "", "Hoja Segur", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdFHS", "", "Fecha Hoja Segur", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNum2", "", "Producto Aux", false, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV38UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTproducWWColumnsSelector", GXv_char5) ;
      ttproducwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV38UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV35ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV35ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV35ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("TTproducWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTproducWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TTproducWWGridState"), null, null);
      }
      AV16OrderedBy = AV29GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV29GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV148GXV5 = 1 ;
      while ( AV148GXV5 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV148GXV5));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV47TFPrdNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV48TFPrdNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV45TFPrdNum = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV46TFPrdNum_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV49TFPrdExiAlm = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFPrdExiAlm_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV53TFPrdCanRes = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFPrdCanRes_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV102TFPrdDisponible = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV103TFPrdDisponible_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV55TFPrdCanPen = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV56TFPrdCanPen_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV57TFPrdPreAct = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFPrdPreAct_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV61TFValDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV62TFValDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV63TFPrdRec = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV64TFPrdRec_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV65TFPrdAox = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFPrdAox_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV100TFPrdGots = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV101TFPrdGots_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV67TFPrdReach = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV68TFPrdReach_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV93TFPrdOkotex_SelsJson = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV94TFPrdOkotex_Sels.fromJSonString(AV93TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV71TFPrdHm = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV72TFPrdHm_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV95TFPrdZDHC_SelsJson = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV96TFPrdZDHC_Sels.fromJSonString(AV95TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV97TFPrdList_SelsJson = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV98TFPrdList_Sels.fromJSonString(AV97TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV75TFPrdTHELIST = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV76TFPrdTHELIST_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV77TFPrdHS = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV78TFPrdHS_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV79TFPrdFHS = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV80TFPrdFHS_To = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2") == 0 )
         {
            AV81TFPrdNum2 = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2_SEL") == 0 )
         {
            AV82TFPrdNum2_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV148GXV5 = (int)(AV148GXV5+1) ;
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
      this.aP0[0] = ttproducwwexport.this.AV11Filename;
      this.aP1[0] = ttproducwwexport.this.AV12ErrorMessage;
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
      AV48TFPrdNom_Sel = "" ;
      AV47TFPrdNom = "" ;
      AV46TFPrdNum_Sel = "" ;
      AV45TFPrdNum = "" ;
      AV49TFPrdExiAlm = DecimalUtil.ZERO ;
      AV50TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV53TFPrdCanRes = DecimalUtil.ZERO ;
      AV54TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV102TFPrdDisponible = DecimalUtil.ZERO ;
      AV103TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV55TFPrdCanPen = DecimalUtil.ZERO ;
      AV56TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV57TFPrdPreAct = DecimalUtil.ZERO ;
      AV58TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV62TFValDsc_Sel = "" ;
      AV61TFValDsc = "" ;
      AV64TFPrdRec_Sel = "" ;
      AV63TFPrdRec = "" ;
      AV65TFPrdAox = DecimalUtil.ZERO ;
      AV66TFPrdAox_To = DecimalUtil.ZERO ;
      AV101TFPrdGots_Sel = "" ;
      AV100TFPrdGots = "" ;
      AV68TFPrdReach_Sel = "" ;
      AV67TFPrdReach = "" ;
      AV94TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV70TFPrdOkotex_Sel = "" ;
      AV72TFPrdHm_Sel = "" ;
      AV71TFPrdHm = "" ;
      AV96TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV73TFPrdZDHC_Sel = "" ;
      AV98TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV74TFPrdList_Sel = "" ;
      AV76TFPrdTHELIST_Sel = "" ;
      AV75TFPrdTHELIST = "" ;
      AV78TFPrdHS_Sel = "" ;
      AV77TFPrdHS = "" ;
      AV79TFPrdFHS = GXutil.nullDate() ;
      AV80TFPrdFHS_To = GXutil.nullDate() ;
      AV82TFPrdNum2_Sel = "" ;
      AV81TFPrdNum2 = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV27Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      AV34ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV36ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A727PrdRec = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A11364PrdHm = "" ;
      A13301PrdZDHC = "" ;
      A11687PrdList = "" ;
      A13302PrdTHELIST = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A4693PrdNum2 = "" ;
      AV111Ttproducwwds_1_tfprdnom = "" ;
      AV112Ttproducwwds_2_tfprdnom_sel = "" ;
      AV113Ttproducwwds_3_tfprdnum = "" ;
      AV114Ttproducwwds_4_tfprdnum_sel = "" ;
      AV115Ttproducwwds_5_tfprdexialm = DecimalUtil.ZERO ;
      AV116Ttproducwwds_6_tfprdexialm_to = DecimalUtil.ZERO ;
      AV117Ttproducwwds_7_tfprdcanres = DecimalUtil.ZERO ;
      AV118Ttproducwwds_8_tfprdcanres_to = DecimalUtil.ZERO ;
      AV119Ttproducwwds_9_tfprddisponible = DecimalUtil.ZERO ;
      AV120Ttproducwwds_10_tfprddisponible_to = DecimalUtil.ZERO ;
      AV121Ttproducwwds_11_tfprdcanpen = DecimalUtil.ZERO ;
      AV122Ttproducwwds_12_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV123Ttproducwwds_13_tfprdpreact = DecimalUtil.ZERO ;
      AV124Ttproducwwds_14_tfprdpreact_to = DecimalUtil.ZERO ;
      AV125Ttproducwwds_15_tfvaldsc = "" ;
      AV126Ttproducwwds_16_tfvaldsc_sel = "" ;
      AV127Ttproducwwds_17_tfprdrec = "" ;
      AV128Ttproducwwds_18_tfprdrec_sel = "" ;
      AV129Ttproducwwds_19_tfprdaox = DecimalUtil.ZERO ;
      AV130Ttproducwwds_20_tfprdaox_to = DecimalUtil.ZERO ;
      AV131Ttproducwwds_21_tfprdgots = "" ;
      AV132Ttproducwwds_22_tfprdgots_sel = "" ;
      AV133Ttproducwwds_23_tfprdreach = "" ;
      AV134Ttproducwwds_24_tfprdreach_sel = "" ;
      AV135Ttproducwwds_25_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV136Ttproducwwds_26_tfprdhm = "" ;
      AV137Ttproducwwds_27_tfprdhm_sel = "" ;
      AV138Ttproducwwds_28_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV139Ttproducwwds_29_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV140Ttproducwwds_30_tfprdthelist = "" ;
      AV141Ttproducwwds_31_tfprdthelist_sel = "" ;
      AV142Ttproducwwds_32_tfprdhs = "" ;
      AV143Ttproducwwds_33_tfprdhs_sel = "" ;
      AV144Ttproducwwds_34_tfprdfhs = GXutil.nullDate() ;
      AV145Ttproducwwds_35_tfprdfhs_to = GXutil.nullDate() ;
      AV146Ttproducwwds_36_tfprdnum2 = "" ;
      AV147Ttproducwwds_37_tfprdnum2_sel = "" ;
      scmdbuf = "" ;
      lV111Ttproducwwds_1_tfprdnom = "" ;
      lV113Ttproducwwds_3_tfprdnum = "" ;
      lV125Ttproducwwds_15_tfvaldsc = "" ;
      lV127Ttproducwwds_17_tfprdrec = "" ;
      lV131Ttproducwwds_21_tfprdgots = "" ;
      lV133Ttproducwwds_23_tfprdreach = "" ;
      lV136Ttproducwwds_26_tfprdhm = "" ;
      lV140Ttproducwwds_30_tfprdthelist = "" ;
      lV142Ttproducwwds_32_tfprdhs = "" ;
      lV146Ttproducwwds_36_tfprdnum2 = "" ;
      P08NY2_A396EmprCod = new String[] {""} ;
      P08NY2_A856ValCod = new byte[1] ;
      P08NY2_A4693PrdNum2 = new String[] {""} ;
      P08NY2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08NY2_A9741PrdHS = new String[] {""} ;
      P08NY2_A13302PrdTHELIST = new String[] {""} ;
      P08NY2_n13302PrdTHELIST = new boolean[] {false} ;
      P08NY2_A11687PrdList = new String[] {""} ;
      P08NY2_A13301PrdZDHC = new String[] {""} ;
      P08NY2_A11364PrdHm = new String[] {""} ;
      P08NY2_A5888PrdOkotex = new String[] {""} ;
      P08NY2_A5887PrdReach = new String[] {""} ;
      P08NY2_A11363PrdGots = new String[] {""} ;
      P08NY2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NY2_A727PrdRec = new String[] {""} ;
      P08NY2_A857ValDsc = new String[] {""} ;
      P08NY2_n857ValDsc = new boolean[] {false} ;
      P08NY2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NY2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NY2_A719PrdNum = new String[] {""} ;
      P08NY2_A718PrdNom = new String[] {""} ;
      P08NY2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NY2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV38UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV35ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV93TFPrdOkotex_SelsJson = "" ;
      AV95TFPrdZDHC_SelsJson = "" ;
      AV97TFPrdList_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttproducwwexport__default(),
         new Object[] {
             new Object[] {
            P08NY2_A396EmprCod, P08NY2_A856ValCod, P08NY2_A4693PrdNum2, P08NY2_A9742PrdFHS, P08NY2_A9741PrdHS, P08NY2_A13302PrdTHELIST, P08NY2_n13302PrdTHELIST, P08NY2_A11687PrdList, P08NY2_A13301PrdZDHC, P08NY2_A11364PrdHm,
            P08NY2_A5888PrdOkotex, P08NY2_A5887PrdReach, P08NY2_A11363PrdGots, P08NY2_A9733PrdAox, P08NY2_A727PrdRec, P08NY2_A857ValDsc, P08NY2_n857ValDsc, P08NY2_A724PrdPreAct, P08NY2_A684PrdCanPen, P08NY2_A719PrdNum,
            P08NY2_A718PrdNom, P08NY2_A685PrdCanRes, P08NY2_A704PrdExiAlm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV106GXV1 ;
   private int AV107GXV2 ;
   private int AV108GXV3 ;
   private int AV109GXV4 ;
   private int AV135Ttproducwwds_25_tfprdokotex_sels_size ;
   private int AV138Ttproducwwds_28_tfprdzdhc_sels_size ;
   private int AV139Ttproducwwds_29_tfprdlist_sels_size ;
   private int AV148GXV5 ;
   private long AV83i ;
   private long AV42VisibleColumnCount ;
   private java.math.BigDecimal AV49TFPrdExiAlm ;
   private java.math.BigDecimal AV50TFPrdExiAlm_To ;
   private java.math.BigDecimal AV53TFPrdCanRes ;
   private java.math.BigDecimal AV54TFPrdCanRes_To ;
   private java.math.BigDecimal AV102TFPrdDisponible ;
   private java.math.BigDecimal AV103TFPrdDisponible_To ;
   private java.math.BigDecimal AV55TFPrdCanPen ;
   private java.math.BigDecimal AV56TFPrdCanPen_To ;
   private java.math.BigDecimal AV57TFPrdPreAct ;
   private java.math.BigDecimal AV58TFPrdPreAct_To ;
   private java.math.BigDecimal AV65TFPrdAox ;
   private java.math.BigDecimal AV66TFPrdAox_To ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal AV115Ttproducwwds_5_tfprdexialm ;
   private java.math.BigDecimal AV116Ttproducwwds_6_tfprdexialm_to ;
   private java.math.BigDecimal AV117Ttproducwwds_7_tfprdcanres ;
   private java.math.BigDecimal AV118Ttproducwwds_8_tfprdcanres_to ;
   private java.math.BigDecimal AV119Ttproducwwds_9_tfprddisponible ;
   private java.math.BigDecimal AV120Ttproducwwds_10_tfprddisponible_to ;
   private java.math.BigDecimal AV121Ttproducwwds_11_tfprdcanpen ;
   private java.math.BigDecimal AV122Ttproducwwds_12_tfprdcanpen_to ;
   private java.math.BigDecimal AV123Ttproducwwds_13_tfprdpreact ;
   private java.math.BigDecimal AV124Ttproducwwds_14_tfprdpreact_to ;
   private java.math.BigDecimal AV129Ttproducwwds_19_tfprdaox ;
   private java.math.BigDecimal AV130Ttproducwwds_20_tfprdaox_to ;
   private String AV48TFPrdNom_Sel ;
   private String AV47TFPrdNom ;
   private String AV46TFPrdNum_Sel ;
   private String AV45TFPrdNum ;
   private String AV62TFValDsc_Sel ;
   private String AV61TFValDsc ;
   private String AV64TFPrdRec_Sel ;
   private String AV63TFPrdRec ;
   private String AV101TFPrdGots_Sel ;
   private String AV100TFPrdGots ;
   private String AV68TFPrdReach_Sel ;
   private String AV67TFPrdReach ;
   private String AV70TFPrdOkotex_Sel ;
   private String AV72TFPrdHm_Sel ;
   private String AV71TFPrdHm ;
   private String AV73TFPrdZDHC_Sel ;
   private String AV74TFPrdList_Sel ;
   private String AV76TFPrdTHELIST_Sel ;
   private String AV75TFPrdTHELIST ;
   private String AV78TFPrdHS_Sel ;
   private String AV77TFPrdHS ;
   private String AV82TFPrdNum2_Sel ;
   private String AV81TFPrdNum2 ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A857ValDsc ;
   private String A727PrdRec ;
   private String A11363PrdGots ;
   private String A5887PrdReach ;
   private String A5888PrdOkotex ;
   private String A11364PrdHm ;
   private String A13301PrdZDHC ;
   private String A11687PrdList ;
   private String A13302PrdTHELIST ;
   private String A9741PrdHS ;
   private String A4693PrdNum2 ;
   private String AV111Ttproducwwds_1_tfprdnom ;
   private String AV112Ttproducwwds_2_tfprdnom_sel ;
   private String AV113Ttproducwwds_3_tfprdnum ;
   private String AV114Ttproducwwds_4_tfprdnum_sel ;
   private String AV125Ttproducwwds_15_tfvaldsc ;
   private String AV126Ttproducwwds_16_tfvaldsc_sel ;
   private String AV127Ttproducwwds_17_tfprdrec ;
   private String AV128Ttproducwwds_18_tfprdrec_sel ;
   private String AV131Ttproducwwds_21_tfprdgots ;
   private String AV132Ttproducwwds_22_tfprdgots_sel ;
   private String AV133Ttproducwwds_23_tfprdreach ;
   private String AV134Ttproducwwds_24_tfprdreach_sel ;
   private String AV136Ttproducwwds_26_tfprdhm ;
   private String AV137Ttproducwwds_27_tfprdhm_sel ;
   private String AV140Ttproducwwds_30_tfprdthelist ;
   private String AV141Ttproducwwds_31_tfprdthelist_sel ;
   private String AV142Ttproducwwds_32_tfprdhs ;
   private String AV143Ttproducwwds_33_tfprdhs_sel ;
   private String AV146Ttproducwwds_36_tfprdnum2 ;
   private String AV147Ttproducwwds_37_tfprdnum2_sel ;
   private String scmdbuf ;
   private String lV111Ttproducwwds_1_tfprdnom ;
   private String lV113Ttproducwwds_3_tfprdnum ;
   private String lV125Ttproducwwds_15_tfvaldsc ;
   private String lV127Ttproducwwds_17_tfprdrec ;
   private String lV131Ttproducwwds_21_tfprdgots ;
   private String lV133Ttproducwwds_23_tfprdreach ;
   private String lV136Ttproducwwds_26_tfprdhm ;
   private String lV140Ttproducwwds_30_tfprdthelist ;
   private String lV142Ttproducwwds_32_tfprdhs ;
   private String lV146Ttproducwwds_36_tfprdnum2 ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV79TFPrdFHS ;
   private java.util.Date AV80TFPrdFHS_To ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date AV144Ttproducwwds_34_tfprdfhs ;
   private java.util.Date AV145Ttproducwwds_35_tfprdfhs_to ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n13302PrdTHELIST ;
   private boolean n857ValDsc ;
   private String AV37ColumnsSelectorXML ;
   private String AV38UserCustomValue ;
   private String AV93TFPrdOkotex_SelsJson ;
   private String AV95TFPrdZDHC_SelsJson ;
   private String AV97TFPrdList_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private GXSimpleCollection<String> AV94TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV96TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV98TFPrdList_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08NY2_A396EmprCod ;
   private byte[] P08NY2_A856ValCod ;
   private String[] P08NY2_A4693PrdNum2 ;
   private java.util.Date[] P08NY2_A9742PrdFHS ;
   private String[] P08NY2_A9741PrdHS ;
   private String[] P08NY2_A13302PrdTHELIST ;
   private boolean[] P08NY2_n13302PrdTHELIST ;
   private String[] P08NY2_A11687PrdList ;
   private String[] P08NY2_A13301PrdZDHC ;
   private String[] P08NY2_A11364PrdHm ;
   private String[] P08NY2_A5888PrdOkotex ;
   private String[] P08NY2_A5887PrdReach ;
   private String[] P08NY2_A11363PrdGots ;
   private java.math.BigDecimal[] P08NY2_A9733PrdAox ;
   private String[] P08NY2_A727PrdRec ;
   private String[] P08NY2_A857ValDsc ;
   private boolean[] P08NY2_n857ValDsc ;
   private java.math.BigDecimal[] P08NY2_A724PrdPreAct ;
   private java.math.BigDecimal[] P08NY2_A684PrdCanPen ;
   private String[] P08NY2_A719PrdNum ;
   private String[] P08NY2_A718PrdNom ;
   private java.math.BigDecimal[] P08NY2_A685PrdCanRes ;
   private java.math.BigDecimal[] P08NY2_A704PrdExiAlm ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV135Ttproducwwds_25_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV138Ttproducwwds_28_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV139Ttproducwwds_29_tfprdlist_sels ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV35ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV36ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class ttproducwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08NY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV135Ttproducwwds_25_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV138Ttproducwwds_28_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV139Ttproducwwds_29_tfprdlist_sels ,
                                          String AV112Ttproducwwds_2_tfprdnom_sel ,
                                          String AV111Ttproducwwds_1_tfprdnom ,
                                          String AV114Ttproducwwds_4_tfprdnum_sel ,
                                          String AV113Ttproducwwds_3_tfprdnum ,
                                          java.math.BigDecimal AV115Ttproducwwds_5_tfprdexialm ,
                                          java.math.BigDecimal AV116Ttproducwwds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV117Ttproducwwds_7_tfprdcanres ,
                                          java.math.BigDecimal AV118Ttproducwwds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV119Ttproducwwds_9_tfprddisponible ,
                                          java.math.BigDecimal AV120Ttproducwwds_10_tfprddisponible_to ,
                                          java.math.BigDecimal AV121Ttproducwwds_11_tfprdcanpen ,
                                          java.math.BigDecimal AV122Ttproducwwds_12_tfprdcanpen_to ,
                                          java.math.BigDecimal AV123Ttproducwwds_13_tfprdpreact ,
                                          java.math.BigDecimal AV124Ttproducwwds_14_tfprdpreact_to ,
                                          String AV126Ttproducwwds_16_tfvaldsc_sel ,
                                          String AV125Ttproducwwds_15_tfvaldsc ,
                                          String AV128Ttproducwwds_18_tfprdrec_sel ,
                                          String AV127Ttproducwwds_17_tfprdrec ,
                                          java.math.BigDecimal AV129Ttproducwwds_19_tfprdaox ,
                                          java.math.BigDecimal AV130Ttproducwwds_20_tfprdaox_to ,
                                          String AV132Ttproducwwds_22_tfprdgots_sel ,
                                          String AV131Ttproducwwds_21_tfprdgots ,
                                          String AV134Ttproducwwds_24_tfprdreach_sel ,
                                          String AV133Ttproducwwds_23_tfprdreach ,
                                          int AV135Ttproducwwds_25_tfprdokotex_sels_size ,
                                          String AV137Ttproducwwds_27_tfprdhm_sel ,
                                          String AV136Ttproducwwds_26_tfprdhm ,
                                          int AV138Ttproducwwds_28_tfprdzdhc_sels_size ,
                                          int AV139Ttproducwwds_29_tfprdlist_sels_size ,
                                          String AV141Ttproducwwds_31_tfprdthelist_sel ,
                                          String AV140Ttproducwwds_30_tfprdthelist ,
                                          String AV143Ttproducwwds_33_tfprdhs_sel ,
                                          String AV142Ttproducwwds_32_tfprdhs ,
                                          java.util.Date AV144Ttproducwwds_34_tfprdfhs ,
                                          java.util.Date AV145Ttproducwwds_35_tfprdfhs_to ,
                                          String AV147Ttproducwwds_37_tfprdnum2_sel ,
                                          String AV146Ttproducwwds_36_tfprdnum2 ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[34];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ValCod, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots, T1.PrdAox," ;
      scmdbuf += " T1.PrdRec, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNum, T1.PrdNom, T1.PrdCanRes, T1.PrdExiAlm FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod)" ;
      if ( (GXutil.strcmp("", AV112Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV111Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV113Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV127Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV131Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV133Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( AV135Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV137Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV136Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( AV138Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV138Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV139Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV139Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV141Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV140Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV142Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV146Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
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
                  return conditional_P08NY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , ((Boolean) dynConstraints[60]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08NY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,4);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
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
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               return;
      }
   }

}

