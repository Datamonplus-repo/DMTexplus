package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetasdeacabado03_wpexport extends GXProcedure
{
   public recetasdeacabado03_wpexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdeacabado03_wpexport.class ), "" );
   }

   public recetasdeacabado03_wpexport( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      recetasdeacabado03_wpexport.this.aP1 = new String[] {""};
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
      recetasdeacabado03_wpexport.this.aP0 = aP0;
      recetasdeacabado03_wpexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "RecetasdeAcabado03_WPExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFBarNHdr_Sel, GXv_char5) ;
         recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFBarNHdr, GXv_char5) ;
            recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFBarSer_Sel, GXv_char5) ;
         recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFBarSer, GXv_char5) ;
            recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFBarSerDsc_Sel, GXv_char5) ;
         recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFBarSerDsc, GXv_char5) ;
            recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV50TFRecLinMaq) && (0==AV51TFRecLinMaq_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFRecLinMaq );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFRecLinMaq_To );
      }
      if ( ! ( (GXutil.strcmp("", AV53TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFMaqCod_Sel, GXv_char5) ;
         recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFMaqCod, GXv_char5) ;
            recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFRecTotKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFRecTotKgs_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TFRecTotKgs)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66TFRecTotKgs_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFRecFA)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFRecFA_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fact.Abs.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TFRecFA)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV68TFRecFA_To)) );
      }
      if ( ! ( (0==AV54TFRecVolPrd) && (0==AV55TFRecVolPrd_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Volumen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFRecVolPrd );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFRecVolPrd_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV56TFRecFecAlt) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV56TFRecFecAlt );
      }
      if ( ! ( (GXutil.strcmp("", AV59TFRecUsrCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFRecUsrCod_Sel, GXv_char5) ;
         recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFRecUsrCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFRecUsrCod, GXv_char5) ;
            recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV60TFRecFecMod) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV60TFRecFecMod );
      }
      if ( ! ( (GXutil.strcmp("", AV63TFRecUsrMod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFRecUsrMod_Sel, GXv_char5) ;
         recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFRecUsrMod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetasdeacabado03_wpexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFRecUsrMod, GXv_char5) ;
            recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("RecetasdeAcabado03_WPColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("RecetasdeAcabado03_WPColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV71GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV73Recetasdeacabado03_wpds_1_filterfulltext = AV18FilterFullText ;
      AV74Recetasdeacabado03_wpds_2_tfbarnhdr = AV34TFBarNHdr ;
      AV75Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV76Recetasdeacabado03_wpds_4_tfbarser = AV36TFBarSer ;
      AV77Recetasdeacabado03_wpds_5_tfbarser_sel = AV37TFBarSer_Sel ;
      AV78Recetasdeacabado03_wpds_6_tfbarserdsc = AV38TFBarSerDsc ;
      AV79Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV39TFBarSerDsc_Sel ;
      AV80Recetasdeacabado03_wpds_8_tfreclinmaq = AV50TFRecLinMaq ;
      AV81Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV51TFRecLinMaq_To ;
      AV82Recetasdeacabado03_wpds_10_tfmaqcod = AV52TFMaqCod ;
      AV83Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV53TFMaqCod_Sel ;
      AV84Recetasdeacabado03_wpds_12_tfrectotkgs = AV65TFRecTotKgs ;
      AV85Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV66TFRecTotKgs_To ;
      AV86Recetasdeacabado03_wpds_14_tfrecfa = AV67TFRecFA ;
      AV87Recetasdeacabado03_wpds_15_tfrecfa_to = AV68TFRecFA_To ;
      AV88Recetasdeacabado03_wpds_16_tfrecvolprd = AV54TFRecVolPrd ;
      AV89Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV55TFRecVolPrd_To ;
      AV90Recetasdeacabado03_wpds_18_tfrecfecalt = AV56TFRecFecAlt ;
      AV91Recetasdeacabado03_wpds_19_tfrecusrcod = AV58TFRecUsrCod ;
      AV92Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV59TFRecUsrCod_Sel ;
      AV93Recetasdeacabado03_wpds_21_tfrecfecmod = AV60TFRecFecMod ;
      AV94Recetasdeacabado03_wpds_22_tfrecusrmod = AV62TFRecUsrMod ;
      AV95Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV63TFRecUsrMod_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV73Recetasdeacabado03_wpds_1_filterfulltext ,
                                           AV75Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                           AV74Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                           AV77Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                           AV76Recetasdeacabado03_wpds_4_tfbarser ,
                                           AV79Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                           AV78Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                           Short.valueOf(AV80Recetasdeacabado03_wpds_8_tfreclinmaq) ,
                                           Short.valueOf(AV81Recetasdeacabado03_wpds_9_tfreclinmaq_to) ,
                                           AV83Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                           AV82Recetasdeacabado03_wpds_10_tfmaqcod ,
                                           AV84Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                           AV85Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                           AV86Recetasdeacabado03_wpds_14_tfrecfa ,
                                           AV87Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                           Integer.valueOf(AV88Recetasdeacabado03_wpds_16_tfrecvolprd) ,
                                           Integer.valueOf(AV89Recetasdeacabado03_wpds_17_tfrecvolprd_to) ,
                                           AV90Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                           AV92Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                           AV91Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                           AV93Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                           AV95Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                           AV94Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A4259RecTotKgs ,
                                           A2806RecFA ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           A4866RecFecAlt ,
                                           A4867RecFecMod ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A6039RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV73Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV73Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV73Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV73Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV73Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV73Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV73Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV73Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV73Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV73Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV74Recetasdeacabado03_wpds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Recetasdeacabado03_wpds_2_tfbarnhdr), 11, "%") ;
      lV76Recetasdeacabado03_wpds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV76Recetasdeacabado03_wpds_4_tfbarser), 16, "%") ;
      lV78Recetasdeacabado03_wpds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV78Recetasdeacabado03_wpds_6_tfbarserdsc), 26, "%") ;
      lV82Recetasdeacabado03_wpds_10_tfmaqcod = GXutil.padr( GXutil.rtrim( AV82Recetasdeacabado03_wpds_10_tfmaqcod), 6, "%") ;
      lV91Recetasdeacabado03_wpds_19_tfrecusrcod = GXutil.padr( GXutil.rtrim( AV91Recetasdeacabado03_wpds_19_tfrecusrcod), 8, "%") ;
      lV94Recetasdeacabado03_wpds_22_tfrecusrmod = GXutil.padr( GXutil.rtrim( AV94Recetasdeacabado03_wpds_22_tfrecusrmod), 8, "%") ;
      /* Using cursor P09BF2 */
      pr_default.execute(0, new Object[] {lV73Recetasdeacabado03_wpds_1_filterfulltext, lV73Recetasdeacabado03_wpds_1_filterfulltext, lV73Recetasdeacabado03_wpds_1_filterfulltext, lV73Recetasdeacabado03_wpds_1_filterfulltext, lV73Recetasdeacabado03_wpds_1_filterfulltext, lV73Recetasdeacabado03_wpds_1_filterfulltext, lV73Recetasdeacabado03_wpds_1_filterfulltext, lV73Recetasdeacabado03_wpds_1_filterfulltext, lV73Recetasdeacabado03_wpds_1_filterfulltext, lV73Recetasdeacabado03_wpds_1_filterfulltext, lV74Recetasdeacabado03_wpds_2_tfbarnhdr, AV75Recetasdeacabado03_wpds_3_tfbarnhdr_sel, lV76Recetasdeacabado03_wpds_4_tfbarser, AV77Recetasdeacabado03_wpds_5_tfbarser_sel, lV78Recetasdeacabado03_wpds_6_tfbarserdsc, AV79Recetasdeacabado03_wpds_7_tfbarserdsc_sel, Short.valueOf(AV80Recetasdeacabado03_wpds_8_tfreclinmaq), Short.valueOf(AV81Recetasdeacabado03_wpds_9_tfreclinmaq_to), lV82Recetasdeacabado03_wpds_10_tfmaqcod, AV83Recetasdeacabado03_wpds_11_tfmaqcod_sel, AV84Recetasdeacabado03_wpds_12_tfrectotkgs, AV85Recetasdeacabado03_wpds_13_tfrectotkgs_to, AV86Recetasdeacabado03_wpds_14_tfrecfa, AV87Recetasdeacabado03_wpds_15_tfrecfa_to, Integer.valueOf(AV88Recetasdeacabado03_wpds_16_tfrecvolprd), Integer.valueOf(AV89Recetasdeacabado03_wpds_17_tfrecvolprd_to), AV90Recetasdeacabado03_wpds_18_tfrecfecalt, lV91Recetasdeacabado03_wpds_19_tfrecusrcod, AV92Recetasdeacabado03_wpds_20_tfrecusrcod_sel, AV93Recetasdeacabado03_wpds_21_tfrecfecmod, lV94Recetasdeacabado03_wpds_22_tfrecusrmod, AV95Recetasdeacabado03_wpds_23_tfrecusrmod_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09BF2_A396EmprCod[0] ;
         A6039RecAcab = P09BF2_A6039RecAcab[0] ;
         n6039RecAcab = P09BF2_n6039RecAcab[0] ;
         A4868RecUsrMod = P09BF2_A4868RecUsrMod[0] ;
         n4868RecUsrMod = P09BF2_n4868RecUsrMod[0] ;
         A4867RecFecMod = P09BF2_A4867RecFecMod[0] ;
         n4867RecFecMod = P09BF2_n4867RecFecMod[0] ;
         A4402RecUsrCod = P09BF2_A4402RecUsrCod[0] ;
         A4866RecFecAlt = P09BF2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BF2_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BF2_A2805RecVolPrd[0] ;
         A2806RecFA = P09BF2_A2806RecFA[0] ;
         A4259RecTotKgs = P09BF2_A4259RecTotKgs[0] ;
         A602MaqCod = P09BF2_A602MaqCod[0] ;
         A2804RecLinMaq = P09BF2_A2804RecLinMaq[0] ;
         A1652BarSerDsc = P09BF2_A1652BarSerDsc[0] ;
         A212BarSer = P09BF2_A212BarSer[0] ;
         A130BarCodPar = P09BF2_A130BarCodPar[0] ;
         A132BarCodReo = P09BF2_A132BarCodReo[0] ;
         A129BarCod = P09BF2_A129BarCod[0] ;
         A1652BarSerDsc = P09BF2_A1652BarSerDsc[0] ;
         A212BarSer = P09BF2_A212BarSer[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
            recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
            recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
            recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2804RecLinMaq );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
            recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4259RecTotKgs)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2806RecFA)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2805RecVolPrd );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A4866RecFecAlt );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4402RecUsrCod, GXv_char5) ;
            recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A4867RecFecMod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4868RecUsrMod, GXv_char5) ;
            recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNHdr", "", "N Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSer", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSerDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLinMaq", "", "#", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqCod", "", "Código Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecTotKgs", "Total", "Kilos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecFA", "", "Fact.Abs.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecVolPrd", "", "Volumen", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecFecAlt", "Alta", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecUsrCod", "Alta", "Usuario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecFecMod", "Modificacion", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecUsrMod", "Modificacion", "Usuario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "RecetasdeAcabado03_WPColumnsSelector", GXv_char5) ;
      recetasdeacabado03_wpexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("RecetasdeAcabado03_WPGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetasdeAcabado03_WPGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("RecetasdeAcabado03_WPGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV96GXV2 = 1 ;
      while ( AV96GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV96GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV34TFBarNHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV35TFBarNHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV36TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV37TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV38TFBarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV39TFBarSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV50TFRecLinMaq = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFRecLinMaq_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV52TFMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV53TFMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGS") == 0 )
         {
            AV65TFRecTotKgs = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFRecTotKgs_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFA") == 0 )
         {
            AV67TFRecFA = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV68TFRecFA_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV54TFRecVolPrd = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFRecVolPrd_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV56TFRecFecAlt = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRCOD") == 0 )
         {
            AV58TFRecUsrCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRCOD_SEL") == 0 )
         {
            AV59TFRecUsrCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECMOD") == 0 )
         {
            AV60TFRecFecMod = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRMOD") == 0 )
         {
            AV62TFRecUsrMod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRMOD_SEL") == 0 )
         {
            AV63TFRecUsrMod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV96GXV2 = (int)(AV96GXV2+1) ;
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
      this.aP0[0] = recetasdeacabado03_wpexport.this.AV11Filename;
      this.aP1[0] = recetasdeacabado03_wpexport.this.AV12ErrorMessage;
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
      AV35TFBarNHdr_Sel = "" ;
      AV34TFBarNHdr = "" ;
      AV37TFBarSer_Sel = "" ;
      AV36TFBarSer = "" ;
      AV39TFBarSerDsc_Sel = "" ;
      AV38TFBarSerDsc = "" ;
      AV53TFMaqCod_Sel = "" ;
      AV52TFMaqCod = "" ;
      AV65TFRecTotKgs = DecimalUtil.ZERO ;
      AV66TFRecTotKgs_To = DecimalUtil.ZERO ;
      AV67TFRecFA = DecimalUtil.ZERO ;
      AV68TFRecFA_To = DecimalUtil.ZERO ;
      AV56TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV59TFRecUsrCod_Sel = "" ;
      AV58TFRecUsrCod = "" ;
      AV60TFRecFecMod = GXutil.resetTime( GXutil.nullDate() );
      AV63TFRecUsrMod_Sel = "" ;
      AV62TFRecUsrMod = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A602MaqCod = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A2806RecFA = DecimalUtil.ZERO ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4402RecUsrCod = "" ;
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4868RecUsrMod = "" ;
      AV73Recetasdeacabado03_wpds_1_filterfulltext = "" ;
      AV74Recetasdeacabado03_wpds_2_tfbarnhdr = "" ;
      AV75Recetasdeacabado03_wpds_3_tfbarnhdr_sel = "" ;
      AV76Recetasdeacabado03_wpds_4_tfbarser = "" ;
      AV77Recetasdeacabado03_wpds_5_tfbarser_sel = "" ;
      AV78Recetasdeacabado03_wpds_6_tfbarserdsc = "" ;
      AV79Recetasdeacabado03_wpds_7_tfbarserdsc_sel = "" ;
      AV82Recetasdeacabado03_wpds_10_tfmaqcod = "" ;
      AV83Recetasdeacabado03_wpds_11_tfmaqcod_sel = "" ;
      AV84Recetasdeacabado03_wpds_12_tfrectotkgs = DecimalUtil.ZERO ;
      AV85Recetasdeacabado03_wpds_13_tfrectotkgs_to = DecimalUtil.ZERO ;
      AV86Recetasdeacabado03_wpds_14_tfrecfa = DecimalUtil.ZERO ;
      AV87Recetasdeacabado03_wpds_15_tfrecfa_to = DecimalUtil.ZERO ;
      AV90Recetasdeacabado03_wpds_18_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      AV91Recetasdeacabado03_wpds_19_tfrecusrcod = "" ;
      AV92Recetasdeacabado03_wpds_20_tfrecusrcod_sel = "" ;
      AV93Recetasdeacabado03_wpds_21_tfrecfecmod = GXutil.resetTime( GXutil.nullDate() );
      AV94Recetasdeacabado03_wpds_22_tfrecusrmod = "" ;
      AV95Recetasdeacabado03_wpds_23_tfrecusrmod_sel = "" ;
      scmdbuf = "" ;
      lV73Recetasdeacabado03_wpds_1_filterfulltext = "" ;
      lV74Recetasdeacabado03_wpds_2_tfbarnhdr = "" ;
      lV76Recetasdeacabado03_wpds_4_tfbarser = "" ;
      lV78Recetasdeacabado03_wpds_6_tfbarserdsc = "" ;
      lV82Recetasdeacabado03_wpds_10_tfmaqcod = "" ;
      lV91Recetasdeacabado03_wpds_19_tfrecusrcod = "" ;
      lV94Recetasdeacabado03_wpds_22_tfrecusrmod = "" ;
      A130BarCodPar = "" ;
      A6039RecAcab = "" ;
      P09BF2_A396EmprCod = new String[] {""} ;
      P09BF2_A6039RecAcab = new String[] {""} ;
      P09BF2_n6039RecAcab = new boolean[] {false} ;
      P09BF2_A4868RecUsrMod = new String[] {""} ;
      P09BF2_n4868RecUsrMod = new boolean[] {false} ;
      P09BF2_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09BF2_n4867RecFecMod = new boolean[] {false} ;
      P09BF2_A4402RecUsrCod = new String[] {""} ;
      P09BF2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BF2_n4866RecFecAlt = new boolean[] {false} ;
      P09BF2_A2805RecVolPrd = new int[1] ;
      P09BF2_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BF2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BF2_A602MaqCod = new String[] {""} ;
      P09BF2_A2804RecLinMaq = new short[1] ;
      P09BF2_A1652BarSerDsc = new String[] {""} ;
      P09BF2_A212BarSer = new String[] {""} ;
      P09BF2_A130BarCodPar = new String[] {""} ;
      P09BF2_A132BarCodReo = new byte[1] ;
      P09BF2_A129BarCod = new int[1] ;
      A396EmprCod = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado03_wpexport__default(),
         new Object[] {
             new Object[] {
            P09BF2_A396EmprCod, P09BF2_A6039RecAcab, P09BF2_n6039RecAcab, P09BF2_A4868RecUsrMod, P09BF2_n4868RecUsrMod, P09BF2_A4867RecFecMod, P09BF2_n4867RecFecMod, P09BF2_A4402RecUsrCod, P09BF2_A4866RecFecAlt, P09BF2_n4866RecFecAlt,
            P09BF2_A2805RecVolPrd, P09BF2_A2806RecFA, P09BF2_A4259RecTotKgs, P09BF2_A602MaqCod, P09BF2_A2804RecLinMaq, P09BF2_A1652BarSerDsc, P09BF2_A212BarSer, P09BF2_A130BarCodPar, P09BF2_A132BarCodReo, P09BF2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV50TFRecLinMaq ;
   private short AV51TFRecLinMaq_To ;
   private short GXv_int3[] ;
   private short A2804RecLinMaq ;
   private short AV80Recetasdeacabado03_wpds_8_tfreclinmaq ;
   private short AV81Recetasdeacabado03_wpds_9_tfreclinmaq_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV54TFRecVolPrd ;
   private int AV55TFRecVolPrd_To ;
   private int AV71GXV1 ;
   private int A2805RecVolPrd ;
   private int AV88Recetasdeacabado03_wpds_16_tfrecvolprd ;
   private int AV89Recetasdeacabado03_wpds_17_tfrecvolprd_to ;
   private int A129BarCod ;
   private int AV96GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV65TFRecTotKgs ;
   private java.math.BigDecimal AV66TFRecTotKgs_To ;
   private java.math.BigDecimal AV67TFRecFA ;
   private java.math.BigDecimal AV68TFRecFA_To ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal AV84Recetasdeacabado03_wpds_12_tfrectotkgs ;
   private java.math.BigDecimal AV85Recetasdeacabado03_wpds_13_tfrectotkgs_to ;
   private java.math.BigDecimal AV86Recetasdeacabado03_wpds_14_tfrecfa ;
   private java.math.BigDecimal AV87Recetasdeacabado03_wpds_15_tfrecfa_to ;
   private String AV35TFBarNHdr_Sel ;
   private String AV34TFBarNHdr ;
   private String AV37TFBarSer_Sel ;
   private String AV36TFBarSer ;
   private String AV39TFBarSerDsc_Sel ;
   private String AV38TFBarSerDsc ;
   private String AV53TFMaqCod_Sel ;
   private String AV52TFMaqCod ;
   private String AV59TFRecUsrCod_Sel ;
   private String AV58TFRecUsrCod ;
   private String AV63TFRecUsrMod_Sel ;
   private String AV62TFRecUsrMod ;
   private String A13696BarNHdr ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A602MaqCod ;
   private String A4402RecUsrCod ;
   private String A4868RecUsrMod ;
   private String AV74Recetasdeacabado03_wpds_2_tfbarnhdr ;
   private String AV75Recetasdeacabado03_wpds_3_tfbarnhdr_sel ;
   private String AV76Recetasdeacabado03_wpds_4_tfbarser ;
   private String AV77Recetasdeacabado03_wpds_5_tfbarser_sel ;
   private String AV78Recetasdeacabado03_wpds_6_tfbarserdsc ;
   private String AV79Recetasdeacabado03_wpds_7_tfbarserdsc_sel ;
   private String AV82Recetasdeacabado03_wpds_10_tfmaqcod ;
   private String AV83Recetasdeacabado03_wpds_11_tfmaqcod_sel ;
   private String AV91Recetasdeacabado03_wpds_19_tfrecusrcod ;
   private String AV92Recetasdeacabado03_wpds_20_tfrecusrcod_sel ;
   private String AV94Recetasdeacabado03_wpds_22_tfrecusrmod ;
   private String AV95Recetasdeacabado03_wpds_23_tfrecusrmod_sel ;
   private String scmdbuf ;
   private String lV74Recetasdeacabado03_wpds_2_tfbarnhdr ;
   private String lV76Recetasdeacabado03_wpds_4_tfbarser ;
   private String lV78Recetasdeacabado03_wpds_6_tfbarserdsc ;
   private String lV82Recetasdeacabado03_wpds_10_tfmaqcod ;
   private String lV91Recetasdeacabado03_wpds_19_tfrecusrcod ;
   private String lV94Recetasdeacabado03_wpds_22_tfrecusrmod ;
   private String A130BarCodPar ;
   private String A6039RecAcab ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV56TFRecFecAlt ;
   private java.util.Date AV60TFRecFecMod ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A4867RecFecMod ;
   private java.util.Date AV90Recetasdeacabado03_wpds_18_tfrecfecalt ;
   private java.util.Date AV93Recetasdeacabado03_wpds_21_tfrecfecmod ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n6039RecAcab ;
   private boolean n4868RecUsrMod ;
   private boolean n4867RecFecMod ;
   private boolean n4866RecFecAlt ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV73Recetasdeacabado03_wpds_1_filterfulltext ;
   private String lV73Recetasdeacabado03_wpds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09BF2_A396EmprCod ;
   private String[] P09BF2_A6039RecAcab ;
   private boolean[] P09BF2_n6039RecAcab ;
   private String[] P09BF2_A4868RecUsrMod ;
   private boolean[] P09BF2_n4868RecUsrMod ;
   private java.util.Date[] P09BF2_A4867RecFecMod ;
   private boolean[] P09BF2_n4867RecFecMod ;
   private String[] P09BF2_A4402RecUsrCod ;
   private java.util.Date[] P09BF2_A4866RecFecAlt ;
   private boolean[] P09BF2_n4866RecFecAlt ;
   private int[] P09BF2_A2805RecVolPrd ;
   private java.math.BigDecimal[] P09BF2_A2806RecFA ;
   private java.math.BigDecimal[] P09BF2_A4259RecTotKgs ;
   private String[] P09BF2_A602MaqCod ;
   private short[] P09BF2_A2804RecLinMaq ;
   private String[] P09BF2_A1652BarSerDsc ;
   private String[] P09BF2_A212BarSer ;
   private String[] P09BF2_A130BarCodPar ;
   private byte[] P09BF2_A132BarCodReo ;
   private int[] P09BF2_A129BarCod ;
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

final  class recetasdeacabado03_wpexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09BF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Recetasdeacabado03_wpds_1_filterfulltext ,
                                          String AV75Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                          String AV74Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                          String AV77Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                          String AV76Recetasdeacabado03_wpds_4_tfbarser ,
                                          String AV79Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                          String AV78Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                          short AV80Recetasdeacabado03_wpds_8_tfreclinmaq ,
                                          short AV81Recetasdeacabado03_wpds_9_tfreclinmaq_to ,
                                          String AV83Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                          String AV82Recetasdeacabado03_wpds_10_tfmaqcod ,
                                          java.math.BigDecimal AV84Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                          java.math.BigDecimal AV85Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                          java.math.BigDecimal AV86Recetasdeacabado03_wpds_14_tfrecfa ,
                                          java.math.BigDecimal AV87Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                          int AV88Recetasdeacabado03_wpds_16_tfrecvolprd ,
                                          int AV89Recetasdeacabado03_wpds_17_tfrecvolprd_to ,
                                          java.util.Date AV90Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                          String AV92Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                          String AV91Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                          java.util.Date AV93Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                          String AV95Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                          String AV94Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A4259RecTotKgs ,
                                          java.math.BigDecimal A2806RecFA ,
                                          int A2805RecVolPrd ,
                                          String A4402RecUsrCod ,
                                          String A4868RecUsrMod ,
                                          java.util.Date A4866RecFecAlt ,
                                          java.util.Date A4867RecFecMod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[32];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T1.RecUsrMod, T1.RecFecMod, T1.RecUsrCod, T1.RecFecAlt, T1.RecVolPrd, T1.RecFA, T1.RecTotKgs, T1.MaqCod, T1.RecLinMaq, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecTotKgs,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecFA,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( UPPER(T1.RecUsrCod) like '%' || UPPER(?)) or ( UPPER(T1.RecUsrMod) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV75Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetasdeacabado03_wpds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetasdeacabado03_wpds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Recetasdeacabado03_wpds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV80Recetasdeacabado03_wpds_8_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV81Recetasdeacabado03_wpds_9_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV82Recetasdeacabado03_wpds_10_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Recetasdeacabado03_wpds_12_tfrectotkgs)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Recetasdeacabado03_wpds_13_tfrectotkgs_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Recetasdeacabado03_wpds_14_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Recetasdeacabado03_wpds_15_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV88Recetasdeacabado03_wpds_16_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV89Recetasdeacabado03_wpds_17_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV90Recetasdeacabado03_wpds_18_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV91Recetasdeacabado03_wpds_19_tfrecusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrCod = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Recetasdeacabado03_wpds_21_tfrecfecmod) )
      {
         addWhere(sWhereString, "(T1.RecFecMod >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) && ( ! (GXutil.strcmp("", AV94Recetasdeacabado03_wpds_22_tfrecusrmod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrMod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrMod = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecTotKgs" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecTotKgs DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFA" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFA DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecUsrCod" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecUsrCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFecMod" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFecMod DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecUsrMod" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecUsrMod DESC" ;
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
                  return conditional_P09BF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Boolean) dynConstraints[38]).booleanValue() , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09BF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((String[]) buf[16])[0] = rslt.getString(13, 16);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((int[]) buf[19])[0] = rslt.getInt(16);
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
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[58], false);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               return;
      }
   }

}

