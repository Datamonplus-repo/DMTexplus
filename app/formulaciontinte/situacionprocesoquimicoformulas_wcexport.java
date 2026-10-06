package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class situacionprocesoquimicoformulas_wcexport extends GXProcedure
{
   public situacionprocesoquimicoformulas_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( situacionprocesoquimicoformulas_wcexport.class ), "" );
   }

   public situacionprocesoquimicoformulas_wcexport( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      situacionprocesoquimicoformulas_wcexport.this.aP1 = new String[] {""};
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
      situacionprocesoquimicoformulas_wcexport.this.aP0 = aP0;
      situacionprocesoquimicoformulas_wcexport.this.aP1 = aP1;
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
      S191 ();
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
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
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
      AV11Filename = "./PrivateTempStorage/" + "SituacionProcesoQuimicoFormulas_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV20FilterFullText, GXv_char5) ;
      situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV25TFCliCod) && (0==AV26TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV25TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV26TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV28TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV28TFCliNom_Sel, GXv_char5) ;
         situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV27TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV27TFCliNom, GXv_char5) ;
            situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV30TFForSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV30TFForSer_Sel, GXv_char5) ;
         situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV29TFForSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV29TFForSer, GXv_char5) ;
            situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV32TFForSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV32TFForSerDsc_Sel, GXv_char5) ;
         situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV31TFForSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV31TFForSerDsc, GXv_char5) ;
            situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV34TFForColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFForColNom_Sel, GXv_char5) ;
         situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV33TFForColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV33TFForColNom, GXv_char5) ;
            situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV35TFForColNum) && (0==AV36TFForColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV35TFForColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV36TFForColNum_To );
      }
      if ( ! ( (0==AV37TFTipColCod) && (0==AV38TFTipColCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tc", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV37TFTipColCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV38TFTipColCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV40TFTipColDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFTipColDsc_Sel, GXv_char5) ;
         situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFTipColDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            situacionprocesoquimicoformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFTipColDsc, GXv_char5) ;
            situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setText( httpContext.getMessage( "Tc", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext = AV20FilterFullText ;
      AV45Formulaciontinte_situacionprocesoquimicoformulas_wcds_2_tfclicod = AV25TFCliCod ;
      AV46Formulaciontinte_situacionprocesoquimicoformulas_wcds_3_tfclicod_to = AV26TFCliCod_To ;
      AV47Formulaciontinte_situacionprocesoquimicoformulas_wcds_4_tfclinom = AV27TFCliNom ;
      AV48Formulaciontinte_situacionprocesoquimicoformulas_wcds_5_tfclinom_sel = AV28TFCliNom_Sel ;
      AV49Formulaciontinte_situacionprocesoquimicoformulas_wcds_6_tfforser = AV29TFForSer ;
      AV50Formulaciontinte_situacionprocesoquimicoformulas_wcds_7_tfforser_sel = AV30TFForSer_Sel ;
      AV51Formulaciontinte_situacionprocesoquimicoformulas_wcds_8_tfforserdsc = AV31TFForSerDsc ;
      AV52Formulaciontinte_situacionprocesoquimicoformulas_wcds_9_tfforserdsc_sel = AV32TFForSerDsc_Sel ;
      AV53Formulaciontinte_situacionprocesoquimicoformulas_wcds_10_tfforcolnom = AV33TFForColNom ;
      AV54Formulaciontinte_situacionprocesoquimicoformulas_wcds_11_tfforcolnom_sel = AV34TFForColNom_Sel ;
      AV55Formulaciontinte_situacionprocesoquimicoformulas_wcds_12_tfforcolnum = AV35TFForColNum ;
      AV56Formulaciontinte_situacionprocesoquimicoformulas_wcds_13_tfforcolnum_to = AV36TFForColNum_To ;
      AV57Formulaciontinte_situacionprocesoquimicoformulas_wcds_14_tftipcolcod = AV37TFTipColCod ;
      AV58Formulaciontinte_situacionprocesoquimicoformulas_wcds_15_tftipcolcod_to = AV38TFTipColCod_To ;
      AV59Formulaciontinte_situacionprocesoquimicoformulas_wcds_16_tftipcoldsc = AV39TFTipColDsc ;
      AV60Formulaciontinte_situacionprocesoquimicoformulas_wcds_17_tftipcoldsc_sel = AV40TFTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV45Formulaciontinte_situacionprocesoquimicoformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV46Formulaciontinte_situacionprocesoquimicoformulas_wcds_3_tfclicod_to) ,
                                           AV48Formulaciontinte_situacionprocesoquimicoformulas_wcds_5_tfclinom_sel ,
                                           AV47Formulaciontinte_situacionprocesoquimicoformulas_wcds_4_tfclinom ,
                                           AV50Formulaciontinte_situacionprocesoquimicoformulas_wcds_7_tfforser_sel ,
                                           AV49Formulaciontinte_situacionprocesoquimicoformulas_wcds_6_tfforser ,
                                           AV52Formulaciontinte_situacionprocesoquimicoformulas_wcds_9_tfforserdsc_sel ,
                                           AV51Formulaciontinte_situacionprocesoquimicoformulas_wcds_8_tfforserdsc ,
                                           AV54Formulaciontinte_situacionprocesoquimicoformulas_wcds_11_tfforcolnom_sel ,
                                           AV53Formulaciontinte_situacionprocesoquimicoformulas_wcds_10_tfforcolnom ,
                                           Integer.valueOf(AV55Formulaciontinte_situacionprocesoquimicoformulas_wcds_12_tfforcolnum) ,
                                           Integer.valueOf(AV56Formulaciontinte_situacionprocesoquimicoformulas_wcds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV57Formulaciontinte_situacionprocesoquimicoformulas_wcds_14_tftipcolcod) ,
                                           Byte.valueOf(AV58Formulaciontinte_situacionprocesoquimicoformulas_wcds_15_tftipcolcod_to) ,
                                           AV60Formulaciontinte_situacionprocesoquimicoformulas_wcds_17_tftipcoldsc_sel ,
                                           AV59Formulaciontinte_situacionprocesoquimicoformulas_wcds_16_tftipcoldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           AV16Emprcod ,
                                           AV17Proforcod ,
                                           A396EmprCod ,
                                           A764ProForCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext), "%", "") ;
      lV47Formulaciontinte_situacionprocesoquimicoformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV47Formulaciontinte_situacionprocesoquimicoformulas_wcds_4_tfclinom), 30, "%") ;
      lV49Formulaciontinte_situacionprocesoquimicoformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV49Formulaciontinte_situacionprocesoquimicoformulas_wcds_6_tfforser), 16, "%") ;
      lV51Formulaciontinte_situacionprocesoquimicoformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_situacionprocesoquimicoformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV53Formulaciontinte_situacionprocesoquimicoformulas_wcds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_situacionprocesoquimicoformulas_wcds_10_tfforcolnom), 13, "%") ;
      lV59Formulaciontinte_situacionprocesoquimicoformulas_wcds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV59Formulaciontinte_situacionprocesoquimicoformulas_wcds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P09TL2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV17Proforcod, lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext, lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext, lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext, lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext, lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext, lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext, lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext, lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext, Integer.valueOf(AV45Formulaciontinte_situacionprocesoquimicoformulas_wcds_2_tfclicod), Integer.valueOf(AV46Formulaciontinte_situacionprocesoquimicoformulas_wcds_3_tfclicod_to), lV47Formulaciontinte_situacionprocesoquimicoformulas_wcds_4_tfclinom, AV48Formulaciontinte_situacionprocesoquimicoformulas_wcds_5_tfclinom_sel, lV49Formulaciontinte_situacionprocesoquimicoformulas_wcds_6_tfforser, AV50Formulaciontinte_situacionprocesoquimicoformulas_wcds_7_tfforser_sel, lV51Formulaciontinte_situacionprocesoquimicoformulas_wcds_8_tfforserdsc, AV52Formulaciontinte_situacionprocesoquimicoformulas_wcds_9_tfforserdsc_sel, lV53Formulaciontinte_situacionprocesoquimicoformulas_wcds_10_tfforcolnom, AV54Formulaciontinte_situacionprocesoquimicoformulas_wcds_11_tfforcolnom_sel, Integer.valueOf(AV55Formulaciontinte_situacionprocesoquimicoformulas_wcds_12_tfforcolnum), Integer.valueOf(AV56Formulaciontinte_situacionprocesoquimicoformulas_wcds_13_tfforcolnum_to), Byte.valueOf(AV57Formulaciontinte_situacionprocesoquimicoformulas_wcds_14_tftipcolcod), Byte.valueOf(AV58Formulaciontinte_situacionprocesoquimicoformulas_wcds_15_tftipcolcod_to), lV59Formulaciontinte_situacionprocesoquimicoformulas_wcds_16_tftipcoldsc, AV60Formulaciontinte_situacionprocesoquimicoformulas_wcds_17_tftipcoldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P09TL2_A764ProForCod[0] ;
         A396EmprCod = P09TL2_A396EmprCod[0] ;
         A832TipColDsc = P09TL2_A832TipColDsc[0] ;
         n832TipColDsc = P09TL2_n832TipColDsc[0] ;
         A831TipColCod = P09TL2_A831TipColCod[0] ;
         A483ForColNum = P09TL2_A483ForColNum[0] ;
         A482ForColNom = P09TL2_A482ForColNom[0] ;
         A5742ForSerDsc = P09TL2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09TL2_n5742ForSerDsc[0] ;
         A494ForSer = P09TL2_A494ForSer[0] ;
         A279CliNom = P09TL2_A279CliNom[0] ;
         A252CliCod = P09TL2_A252CliCod[0] ;
         A1160ProForL = P09TL2_A1160ProForL[0] ;
         A832TipColDsc = P09TL2_A832TipColDsc[0] ;
         n832TipColDsc = P09TL2_n832TipColDsc[0] ;
         A279CliNom = P09TL2_A279CliNom[0] ;
         A5742ForSerDsc = P09TL2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09TL2_n5742ForSerDsc[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( A252CliCod );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
         situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A494ForSer, GXv_char5) ;
         situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( GXt_char4 );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5742ForSerDsc, GXv_char5) ;
         situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( GXt_char4 );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A482ForColNom, GXv_char5) ;
         situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( GXt_char4 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setNumber( A483ForColNum );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setNumber( A831TipColCod );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A832TipColDsc, GXv_char5) ;
         situacionprocesoquimicoformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setText( GXt_char4 );
         /* Execute user subroutine: 'AFTERWRITELINE' */
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
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

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("FormulacionTinte.SituacionProcesoQuimicoFormulas_WCGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.SituacionProcesoQuimicoFormulas_WCGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("FormulacionTinte.SituacionProcesoQuimicoFormulas_WCGridState"), null, null);
      }
      AV18OrderedBy = AV23GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV19OrderedDsc = AV23GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV20FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV25TFCliCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV26TFCliCod_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV27TFCliNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV28TFCliNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV29TFForSer = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV30TFForSer_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV31TFForSerDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV32TFForSerDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV33TFForColNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV34TFForColNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV35TFForColNum = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFForColNum_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV37TFTipColCod = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFTipColCod_To = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV39TFTipColDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV40TFTipColDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV17Proforcod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = situacionprocesoquimicoformulas_wcexport.this.AV11Filename;
      this.aP1[0] = situacionprocesoquimicoformulas_wcexport.this.AV12ErrorMessage;
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
      AV20FilterFullText = "" ;
      AV28TFCliNom_Sel = "" ;
      AV27TFCliNom = "" ;
      AV30TFForSer_Sel = "" ;
      AV29TFForSer = "" ;
      AV32TFForSerDsc_Sel = "" ;
      AV31TFForSerDsc = "" ;
      AV34TFForColNom_Sel = "" ;
      AV33TFForColNom = "" ;
      AV40TFTipColDsc_Sel = "" ;
      AV39TFTipColDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext = "" ;
      AV47Formulaciontinte_situacionprocesoquimicoformulas_wcds_4_tfclinom = "" ;
      AV48Formulaciontinte_situacionprocesoquimicoformulas_wcds_5_tfclinom_sel = "" ;
      AV49Formulaciontinte_situacionprocesoquimicoformulas_wcds_6_tfforser = "" ;
      AV50Formulaciontinte_situacionprocesoquimicoformulas_wcds_7_tfforser_sel = "" ;
      AV51Formulaciontinte_situacionprocesoquimicoformulas_wcds_8_tfforserdsc = "" ;
      AV52Formulaciontinte_situacionprocesoquimicoformulas_wcds_9_tfforserdsc_sel = "" ;
      AV53Formulaciontinte_situacionprocesoquimicoformulas_wcds_10_tfforcolnom = "" ;
      AV54Formulaciontinte_situacionprocesoquimicoformulas_wcds_11_tfforcolnom_sel = "" ;
      AV59Formulaciontinte_situacionprocesoquimicoformulas_wcds_16_tftipcoldsc = "" ;
      AV60Formulaciontinte_situacionprocesoquimicoformulas_wcds_17_tftipcoldsc_sel = "" ;
      scmdbuf = "" ;
      lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext = "" ;
      lV47Formulaciontinte_situacionprocesoquimicoformulas_wcds_4_tfclinom = "" ;
      lV49Formulaciontinte_situacionprocesoquimicoformulas_wcds_6_tfforser = "" ;
      lV51Formulaciontinte_situacionprocesoquimicoformulas_wcds_8_tfforserdsc = "" ;
      lV53Formulaciontinte_situacionprocesoquimicoformulas_wcds_10_tfforcolnom = "" ;
      lV59Formulaciontinte_situacionprocesoquimicoformulas_wcds_16_tftipcoldsc = "" ;
      AV16Emprcod = "" ;
      AV17Proforcod = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      P09TL2_A764ProForCod = new String[] {""} ;
      P09TL2_A396EmprCod = new String[] {""} ;
      P09TL2_A832TipColDsc = new String[] {""} ;
      P09TL2_n832TipColDsc = new boolean[] {false} ;
      P09TL2_A831TipColCod = new byte[1] ;
      P09TL2_A483ForColNum = new int[1] ;
      P09TL2_A482ForColNom = new String[] {""} ;
      P09TL2_A5742ForSerDsc = new String[] {""} ;
      P09TL2_n5742ForSerDsc = new boolean[] {false} ;
      P09TL2_A494ForSer = new String[] {""} ;
      P09TL2_A279CliNom = new String[] {""} ;
      P09TL2_A252CliCod = new int[1] ;
      P09TL2_A1160ProForL = new short[1] ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV21Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.situacionprocesoquimicoformulas_wcexport__default(),
         new Object[] {
             new Object[] {
            P09TL2_A764ProForCod, P09TL2_A396EmprCod, P09TL2_A832TipColDsc, P09TL2_n832TipColDsc, P09TL2_A831TipColCod, P09TL2_A483ForColNum, P09TL2_A482ForColNom, P09TL2_A5742ForSerDsc, P09TL2_n5742ForSerDsc, P09TL2_A494ForSer,
            P09TL2_A279CliNom, P09TL2_A252CliCod, P09TL2_A1160ProForL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV37TFTipColCod ;
   private byte AV38TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV57Formulaciontinte_situacionprocesoquimicoformulas_wcds_14_tftipcolcod ;
   private byte AV58Formulaciontinte_situacionprocesoquimicoformulas_wcds_15_tftipcolcod_to ;
   private short GXv_int3[] ;
   private short AV18OrderedBy ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV25TFCliCod ;
   private int AV26TFCliCod_To ;
   private int AV35TFForColNum ;
   private int AV36TFForColNum_To ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV45Formulaciontinte_situacionprocesoquimicoformulas_wcds_2_tfclicod ;
   private int AV46Formulaciontinte_situacionprocesoquimicoformulas_wcds_3_tfclicod_to ;
   private int AV55Formulaciontinte_situacionprocesoquimicoformulas_wcds_12_tfforcolnum ;
   private int AV56Formulaciontinte_situacionprocesoquimicoformulas_wcds_13_tfforcolnum_to ;
   private int AV61GXV1 ;
   private String AV28TFCliNom_Sel ;
   private String AV27TFCliNom ;
   private String AV30TFForSer_Sel ;
   private String AV29TFForSer ;
   private String AV32TFForSerDsc_Sel ;
   private String AV31TFForSerDsc ;
   private String AV34TFForColNom_Sel ;
   private String AV33TFForColNom ;
   private String AV40TFTipColDsc_Sel ;
   private String AV39TFTipColDsc ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String AV47Formulaciontinte_situacionprocesoquimicoformulas_wcds_4_tfclinom ;
   private String AV48Formulaciontinte_situacionprocesoquimicoformulas_wcds_5_tfclinom_sel ;
   private String AV49Formulaciontinte_situacionprocesoquimicoformulas_wcds_6_tfforser ;
   private String AV50Formulaciontinte_situacionprocesoquimicoformulas_wcds_7_tfforser_sel ;
   private String AV51Formulaciontinte_situacionprocesoquimicoformulas_wcds_8_tfforserdsc ;
   private String AV52Formulaciontinte_situacionprocesoquimicoformulas_wcds_9_tfforserdsc_sel ;
   private String AV53Formulaciontinte_situacionprocesoquimicoformulas_wcds_10_tfforcolnom ;
   private String AV54Formulaciontinte_situacionprocesoquimicoformulas_wcds_11_tfforcolnom_sel ;
   private String AV59Formulaciontinte_situacionprocesoquimicoformulas_wcds_16_tftipcoldsc ;
   private String AV60Formulaciontinte_situacionprocesoquimicoformulas_wcds_17_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV47Formulaciontinte_situacionprocesoquimicoformulas_wcds_4_tfclinom ;
   private String lV49Formulaciontinte_situacionprocesoquimicoformulas_wcds_6_tfforser ;
   private String lV51Formulaciontinte_situacionprocesoquimicoformulas_wcds_8_tfforserdsc ;
   private String lV53Formulaciontinte_situacionprocesoquimicoformulas_wcds_10_tfforcolnom ;
   private String lV59Formulaciontinte_situacionprocesoquimicoformulas_wcds_16_tftipcoldsc ;
   private String AV16Emprcod ;
   private String AV17Proforcod ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV19OrderedDsc ;
   private boolean n832TipColDsc ;
   private boolean n5742ForSerDsc ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV20FilterFullText ;
   private String AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext ;
   private String lV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09TL2_A764ProForCod ;
   private String[] P09TL2_A396EmprCod ;
   private String[] P09TL2_A832TipColDsc ;
   private boolean[] P09TL2_n832TipColDsc ;
   private byte[] P09TL2_A831TipColCod ;
   private int[] P09TL2_A483ForColNum ;
   private String[] P09TL2_A482ForColNom ;
   private String[] P09TL2_A5742ForSerDsc ;
   private boolean[] P09TL2_n5742ForSerDsc ;
   private String[] P09TL2_A494ForSer ;
   private String[] P09TL2_A279CliNom ;
   private int[] P09TL2_A252CliCod ;
   private short[] P09TL2_A1160ProForL ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class situacionprocesoquimicoformulas_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09TL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext ,
                                          int AV45Formulaciontinte_situacionprocesoquimicoformulas_wcds_2_tfclicod ,
                                          int AV46Formulaciontinte_situacionprocesoquimicoformulas_wcds_3_tfclicod_to ,
                                          String AV48Formulaciontinte_situacionprocesoquimicoformulas_wcds_5_tfclinom_sel ,
                                          String AV47Formulaciontinte_situacionprocesoquimicoformulas_wcds_4_tfclinom ,
                                          String AV50Formulaciontinte_situacionprocesoquimicoformulas_wcds_7_tfforser_sel ,
                                          String AV49Formulaciontinte_situacionprocesoquimicoformulas_wcds_6_tfforser ,
                                          String AV52Formulaciontinte_situacionprocesoquimicoformulas_wcds_9_tfforserdsc_sel ,
                                          String AV51Formulaciontinte_situacionprocesoquimicoformulas_wcds_8_tfforserdsc ,
                                          String AV54Formulaciontinte_situacionprocesoquimicoformulas_wcds_11_tfforcolnom_sel ,
                                          String AV53Formulaciontinte_situacionprocesoquimicoformulas_wcds_10_tfforcolnom ,
                                          int AV55Formulaciontinte_situacionprocesoquimicoformulas_wcds_12_tfforcolnum ,
                                          int AV56Formulaciontinte_situacionprocesoquimicoformulas_wcds_13_tfforcolnum_to ,
                                          byte AV57Formulaciontinte_situacionprocesoquimicoformulas_wcds_14_tftipcolcod ,
                                          byte AV58Formulaciontinte_situacionprocesoquimicoformulas_wcds_15_tftipcolcod_to ,
                                          String AV60Formulaciontinte_situacionprocesoquimicoformulas_wcds_17_tftipcoldsc_sel ,
                                          String AV59Formulaciontinte_situacionprocesoquimicoformulas_wcds_16_tftipcoldsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV16Emprcod ,
                                          String AV17Proforcod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[26];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ProForCod, T1.EmprCod, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T4.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod, T1.ProForL FROM (((TXPLFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " INNER JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.ForSer AND T4.ForColNom = T1.ForColNom AND T4.ForColNum = T1.ForColNum" ;
      scmdbuf += " AND T4.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      if ( ! (GXutil.strcmp("", AV44Formulaciontinte_situacionprocesoquimicoformulas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T4.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV45Formulaciontinte_situacionprocesoquimicoformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV46Formulaciontinte_situacionprocesoquimicoformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Formulaciontinte_situacionprocesoquimicoformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV47Formulaciontinte_situacionprocesoquimicoformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Formulaciontinte_situacionprocesoquimicoformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Formulaciontinte_situacionprocesoquimicoformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV49Formulaciontinte_situacionprocesoquimicoformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_situacionprocesoquimicoformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Formulaciontinte_situacionprocesoquimicoformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_situacionprocesoquimicoformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_situacionprocesoquimicoformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_situacionprocesoquimicoformulas_wcds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_situacionprocesoquimicoformulas_wcds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_situacionprocesoquimicoformulas_wcds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV55Formulaciontinte_situacionprocesoquimicoformulas_wcds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_situacionprocesoquimicoformulas_wcds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_situacionprocesoquimicoformulas_wcds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_situacionprocesoquimicoformulas_wcds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Formulaciontinte_situacionprocesoquimicoformulas_wcds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Formulaciontinte_situacionprocesoquimicoformulas_wcds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Formulaciontinte_situacionprocesoquimicoformulas_wcds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV18OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.ProForCod" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ForSerDsc" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ForSerDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipColDsc" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipColDsc DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P09TL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09TL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
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
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               return;
      }
   }

}

