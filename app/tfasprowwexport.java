package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tfasprowwexport extends GXProcedure
{
   public tfasprowwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfasprowwexport.class ), "" );
   }

   public tfasprowwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tfasprowwexport.this.aP1 = new String[] {""};
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
      tfasprowwexport.this.aP0 = aP0;
      tfasprowwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TFASPROWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV90FilterFullText, GXv_char5) ;
      tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV94TFFasActiva_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Activa?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         if ( GXutil.strcmp(AV94TFFasActiva_Sel, httpContext.getMessage( "S", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( GXutil.strcmp(AV94TFFasActiva_Sel, httpContext.getMessage( "N", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV52TFFasCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFFasCod_Sel, GXv_char5) ;
         tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFFasCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFFasCod, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV54TFFasDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFFasDsc_Sel, GXv_char5) ;
         tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFFasDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFFasDsc, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV56TFFasSigla_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Siglas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFFasSigla_Sel, GXv_char5) ;
         tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV55TFFasSigla)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Siglas", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFFasSigla, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV58TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFMaqCod_Sel, GXv_char5) ;
         tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFMaqCod, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV60TFMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFMaqDsc_Sel, GXv_char5) ;
         tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV59TFMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFMaqDsc, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFFasDec)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFFasDec_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Decalage ", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFFasDec)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TFFasDec_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFFasDec2)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFFasDec2_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Decalage 2", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV63TFFasDec2)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV64TFFasDec2_To)) );
      }
      if ( ! ( (0==AV65TFFasPreSal) && (0==AV66TFFasPreSal_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T prepysal", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV65TFFasPreSal );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV66TFFasPreSal_To );
      }
      if ( ! ( (0==AV67TFFasPrePie) && (0==AV68TFFasPrePie_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T prepppza", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV67TFFasPrePie );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV68TFFasPrePie_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFFasVelPro)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFFasVelPro_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Vel (mts/m)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV69TFFasVelPro)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV70TFFasVelPro_To)) );
      }
      if ( ! ( (0==AV71TFFasNumPas) && (0==AV72TFFasNumPas_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N pases", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV71TFFasNumPas );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV72TFFasNumPas_To );
      }
      if ( ! ( (GXutil.strcmp("", AV74TFFasActTin_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFFasActTin_Sel, GXv_char5) ;
         tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV73TFFasActTin)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFFasActTin, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV76TFFasCon_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFFasCon_Sel, GXv_char5) ;
         tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV75TFFasCon)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFFasCon, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV78TFFasAcab_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "A?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFFasAcab_Sel, GXv_char5) ;
         tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV77TFFasAcab)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "A?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFFasAcab, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV80TFFasForMul_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "F?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFFasForMul_Sel, GXv_char5) ;
         tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV79TFFasForMul)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "F?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79TFFasForMul, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV82TFFasConPla_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV82TFFasConPla_Sel, GXv_char5) ;
         tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV81TFFasConPla)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tfasprowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV81TFFasConPla, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV48VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV36Session.getValue("TFASPROWWColumnsSelector"), "") != 0 )
      {
         AV43ColumnsSelectorXML = AV36Session.getValue("TFASPROWWColumnsSelector") ;
         AV40ColumnsSelector.fromxml(AV43ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV97GXV1 = 1 ;
      while ( AV97GXV1 <= AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV42ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV97GXV1));
         if ( AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setColor( 11 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         AV97GXV1 = (int)(AV97GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV99Tfasprowwds_1_filterfulltext = AV90FilterFullText ;
      AV100Tfasprowwds_2_tffasactiva_sel = AV94TFFasActiva_Sel ;
      AV101Tfasprowwds_3_tffascod = AV51TFFasCod ;
      AV102Tfasprowwds_4_tffascod_sel = AV52TFFasCod_Sel ;
      AV103Tfasprowwds_5_tffasdsc = AV53TFFasDsc ;
      AV104Tfasprowwds_6_tffasdsc_sel = AV54TFFasDsc_Sel ;
      AV105Tfasprowwds_7_tffassigla = AV55TFFasSigla ;
      AV106Tfasprowwds_8_tffassigla_sel = AV56TFFasSigla_Sel ;
      AV107Tfasprowwds_9_tfmaqcod = AV57TFMaqCod ;
      AV108Tfasprowwds_10_tfmaqcod_sel = AV58TFMaqCod_Sel ;
      AV109Tfasprowwds_11_tfmaqdsc = AV59TFMaqDsc ;
      AV110Tfasprowwds_12_tfmaqdsc_sel = AV60TFMaqDsc_Sel ;
      AV111Tfasprowwds_13_tffasdec = AV61TFFasDec ;
      AV112Tfasprowwds_14_tffasdec_to = AV62TFFasDec_To ;
      AV113Tfasprowwds_15_tffasdec2 = AV63TFFasDec2 ;
      AV114Tfasprowwds_16_tffasdec2_to = AV64TFFasDec2_To ;
      AV115Tfasprowwds_17_tffaspresal = AV65TFFasPreSal ;
      AV116Tfasprowwds_18_tffaspresal_to = AV66TFFasPreSal_To ;
      AV117Tfasprowwds_19_tffasprepie = AV67TFFasPrePie ;
      AV118Tfasprowwds_20_tffasprepie_to = AV68TFFasPrePie_To ;
      AV119Tfasprowwds_21_tffasvelpro = AV69TFFasVelPro ;
      AV120Tfasprowwds_22_tffasvelpro_to = AV70TFFasVelPro_To ;
      AV121Tfasprowwds_23_tffasnumpas = AV71TFFasNumPas ;
      AV122Tfasprowwds_24_tffasnumpas_to = AV72TFFasNumPas_To ;
      AV123Tfasprowwds_25_tffasacttin = AV73TFFasActTin ;
      AV124Tfasprowwds_26_tffasacttin_sel = AV74TFFasActTin_Sel ;
      AV125Tfasprowwds_27_tffascon = AV75TFFasCon ;
      AV126Tfasprowwds_28_tffascon_sel = AV76TFFasCon_Sel ;
      AV127Tfasprowwds_29_tffasacab = AV77TFFasAcab ;
      AV128Tfasprowwds_30_tffasacab_sel = AV78TFFasAcab_Sel ;
      AV129Tfasprowwds_31_tffasformul = AV79TFFasForMul ;
      AV130Tfasprowwds_32_tffasformul_sel = AV80TFFasForMul_Sel ;
      AV131Tfasprowwds_33_tffasconpla = AV81TFFasConPla ;
      AV132Tfasprowwds_34_tffasconpla_sel = AV82TFFasConPla_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV99Tfasprowwds_1_filterfulltext ,
                                           AV100Tfasprowwds_2_tffasactiva_sel ,
                                           AV102Tfasprowwds_4_tffascod_sel ,
                                           AV101Tfasprowwds_3_tffascod ,
                                           AV104Tfasprowwds_6_tffasdsc_sel ,
                                           AV103Tfasprowwds_5_tffasdsc ,
                                           AV106Tfasprowwds_8_tffassigla_sel ,
                                           AV105Tfasprowwds_7_tffassigla ,
                                           AV108Tfasprowwds_10_tfmaqcod_sel ,
                                           AV107Tfasprowwds_9_tfmaqcod ,
                                           AV110Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV109Tfasprowwds_11_tfmaqdsc ,
                                           AV111Tfasprowwds_13_tffasdec ,
                                           AV112Tfasprowwds_14_tffasdec_to ,
                                           AV113Tfasprowwds_15_tffasdec2 ,
                                           AV114Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV115Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV116Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV117Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV118Tfasprowwds_20_tffasprepie_to) ,
                                           AV119Tfasprowwds_21_tffasvelpro ,
                                           AV120Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV121Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV122Tfasprowwds_24_tffasnumpas_to) ,
                                           AV124Tfasprowwds_26_tffasacttin_sel ,
                                           AV123Tfasprowwds_25_tffasacttin ,
                                           AV126Tfasprowwds_28_tffascon_sel ,
                                           AV125Tfasprowwds_27_tffascon ,
                                           AV128Tfasprowwds_30_tffasacab_sel ,
                                           AV127Tfasprowwds_29_tffasacab ,
                                           AV130Tfasprowwds_32_tffasformul_sel ,
                                           AV129Tfasprowwds_31_tffasformul ,
                                           AV132Tfasprowwds_34_tffasconpla_sel ,
                                           AV131Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV99Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tfasprowwds_1_filterfulltext), "%", "") ;
      lV101Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV101Tfasprowwds_3_tffascod), 8, "%") ;
      lV103Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV103Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV105Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV105Tfasprowwds_7_tffassigla), 4, "%") ;
      lV107Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV107Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV109Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV109Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV123Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV123Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV125Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV125Tfasprowwds_27_tffascon), 1, "%") ;
      lV127Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV127Tfasprowwds_29_tffasacab), 1, "%") ;
      lV129Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV129Tfasprowwds_31_tffasformul), 1, "%") ;
      lV131Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV131Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081W2 */
      pr_default.execute(0, new Object[] {lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, lV99Tfasprowwds_1_filterfulltext, AV100Tfasprowwds_2_tffasactiva_sel, lV101Tfasprowwds_3_tffascod, AV102Tfasprowwds_4_tffascod_sel, lV103Tfasprowwds_5_tffasdsc, AV104Tfasprowwds_6_tffasdsc_sel, lV105Tfasprowwds_7_tffassigla, AV106Tfasprowwds_8_tffassigla_sel, lV107Tfasprowwds_9_tfmaqcod, AV108Tfasprowwds_10_tfmaqcod_sel, lV109Tfasprowwds_11_tfmaqdsc, AV110Tfasprowwds_12_tfmaqdsc_sel, AV111Tfasprowwds_13_tffasdec, AV112Tfasprowwds_14_tffasdec_to, AV113Tfasprowwds_15_tffasdec2, AV114Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV115Tfasprowwds_17_tffaspresal), Short.valueOf(AV116Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV117Tfasprowwds_19_tffasprepie), Short.valueOf(AV118Tfasprowwds_20_tffasprepie_to), AV119Tfasprowwds_21_tffasvelpro, AV120Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV121Tfasprowwds_23_tffasnumpas), Short.valueOf(AV122Tfasprowwds_24_tffasnumpas_to), lV123Tfasprowwds_25_tffasacttin, AV124Tfasprowwds_26_tffasacttin_sel, lV125Tfasprowwds_27_tffascon, AV126Tfasprowwds_28_tffascon_sel, lV127Tfasprowwds_29_tffasacab, AV128Tfasprowwds_30_tffasacab_sel, lV129Tfasprowwds_31_tffasformul, AV130Tfasprowwds_32_tffasformul_sel, lV131Tfasprowwds_33_tffasconpla, AV132Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P081W2_A396EmprCod[0] ;
         A4299FasConPla = P081W2_A4299FasConPla[0] ;
         n4299FasConPla = P081W2_n4299FasConPla[0] ;
         A4286FasForMul = P081W2_A4286FasForMul[0] ;
         n4286FasForMul = P081W2_n4286FasForMul[0] ;
         A4903FasAcab = P081W2_A4903FasAcab[0] ;
         n4903FasAcab = P081W2_n4903FasAcab[0] ;
         A458FasCon = P081W2_A458FasCon[0] ;
         n458FasCon = P081W2_n458FasCon[0] ;
         A456FasActTin = P081W2_A456FasActTin[0] ;
         n456FasActTin = P081W2_n456FasActTin[0] ;
         A464FasNumPas = P081W2_A464FasNumPas[0] ;
         n464FasNumPas = P081W2_n464FasNumPas[0] ;
         A472FasVelPro = P081W2_A472FasVelPro[0] ;
         n472FasVelPro = P081W2_n472FasVelPro[0] ;
         A468FasPrePie = P081W2_A468FasPrePie[0] ;
         n468FasPrePie = P081W2_n468FasPrePie[0] ;
         A469FasPreSal = P081W2_A469FasPreSal[0] ;
         n469FasPreSal = P081W2_n469FasPreSal[0] ;
         A5990FasDec2 = P081W2_A5990FasDec2[0] ;
         n5990FasDec2 = P081W2_n5990FasDec2[0] ;
         A459FasDec = P081W2_A459FasDec[0] ;
         n459FasDec = P081W2_n459FasDec[0] ;
         A606MaqDsc = P081W2_A606MaqDsc[0] ;
         n606MaqDsc = P081W2_n606MaqDsc[0] ;
         A602MaqCod = P081W2_A602MaqCod[0] ;
         n602MaqCod = P081W2_n602MaqCod[0] ;
         A7070FasSigla = P081W2_A7070FasSigla[0] ;
         n7070FasSigla = P081W2_n7070FasSigla[0] ;
         A460FasDsc = P081W2_A460FasDsc[0] ;
         A457FasCod = P081W2_A457FasCod[0] ;
         A14042FasActiva = P081W2_A14042FasActiva[0] ;
         A606MaqDsc = P081W2_A606MaqDsc[0] ;
         n606MaqDsc = P081W2_n606MaqDsc[0] ;
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
         AV48VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14042FasActiva, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A457FasCod, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A460FasDsc, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A7070FasSigla, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A606MaqDsc, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A459FasDec)) );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A5990FasDec2)) );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A469FasPreSal );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A468FasPrePie );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A472FasVelPro)) );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A464FasNumPas );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A456FasActTin, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A458FasCon, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4903FasAcab, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4286FasForMul, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4299FasConPla, GXv_char5) ;
            tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
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
      AV40ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasActiva", "", "Activa?", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasCod", "", "Fase", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasDsc", "", "Descripcion", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasSigla", "", "Siglas", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqCod", "", "Maquina", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqDsc", "", "Descripcion", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasDec", "", "Decalage ", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasDec2", "", "Decalage 2", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasPreSal", "", "T prepysal", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasPrePie", "", "T prepppza", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasVelPro", "", "Vel (mts/m)", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasNumPas", "", "N pases", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasActTin", "", "T?", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasCon", "", "C?", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasAcab", "", "A?", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasForMul", "", "F?", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasConPla", "", "P?", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV44UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TFASPROWWColumnsSelector", GXv_char5) ;
      tfasprowwexport.this.GXt_char4 = GXv_char5[0] ;
      AV44UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV44UserCustomValue)==0) ) )
      {
         AV41ColumnsSelectorAux.fromxml(AV44UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV41ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV41ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue("TFASPROWWGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TFASPROWWGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("TFASPROWWGridState"), null, null);
      }
      AV16OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV133GXV2 = 1 ;
      while ( AV133GXV2 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV133GXV2));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV90FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTIVA_SEL") == 0 )
         {
            AV94TFFasActiva_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV51TFFasCod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV52TFFasCod_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV53TFFasDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV54TFFasDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASSIGLA") == 0 )
         {
            AV55TFFasSigla = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASSIGLA_SEL") == 0 )
         {
            AV56TFFasSigla_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV57TFMaqCod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV58TFMaqCod_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV59TFMaqDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV60TFMaqDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC") == 0 )
         {
            AV61TFFasDec = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFFasDec_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC2") == 0 )
         {
            AV63TFFasDec2 = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFFasDec2_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPRESAL") == 0 )
         {
            AV65TFFasPreSal = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFFasPreSal_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREPIE") == 0 )
         {
            AV67TFFasPrePie = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFFasPrePie_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASVELPRO") == 0 )
         {
            AV69TFFasVelPro = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV70TFFasVelPro_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASNUMPAS") == 0 )
         {
            AV71TFFasNumPas = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV72TFFasNumPas_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN") == 0 )
         {
            AV73TFFasActTin = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN_SEL") == 0 )
         {
            AV74TFFasActTin_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON") == 0 )
         {
            AV75TFFasCon = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON_SEL") == 0 )
         {
            AV76TFFasCon_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB") == 0 )
         {
            AV77TFFasAcab = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB_SEL") == 0 )
         {
            AV78TFFasAcab_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV79TFFasForMul = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV80TFFasForMul_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA") == 0 )
         {
            AV81TFFasConPla = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA_SEL") == 0 )
         {
            AV82TFFasConPla_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV133GXV2 = (int)(AV133GXV2+1) ;
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
      this.aP0[0] = tfasprowwexport.this.AV11Filename;
      this.aP1[0] = tfasprowwexport.this.AV12ErrorMessage;
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
      AV90FilterFullText = "" ;
      AV94TFFasActiva_Sel = "" ;
      AV52TFFasCod_Sel = "" ;
      AV51TFFasCod = "" ;
      AV54TFFasDsc_Sel = "" ;
      AV53TFFasDsc = "" ;
      AV56TFFasSigla_Sel = "" ;
      AV55TFFasSigla = "" ;
      AV58TFMaqCod_Sel = "" ;
      AV57TFMaqCod = "" ;
      AV60TFMaqDsc_Sel = "" ;
      AV59TFMaqDsc = "" ;
      AV61TFFasDec = DecimalUtil.ZERO ;
      AV62TFFasDec_To = DecimalUtil.ZERO ;
      AV63TFFasDec2 = DecimalUtil.ZERO ;
      AV64TFFasDec2_To = DecimalUtil.ZERO ;
      AV69TFFasVelPro = DecimalUtil.ZERO ;
      AV70TFFasVelPro_To = DecimalUtil.ZERO ;
      AV74TFFasActTin_Sel = "" ;
      AV73TFFasActTin = "" ;
      AV76TFFasCon_Sel = "" ;
      AV75TFFasCon = "" ;
      AV78TFFasAcab_Sel = "" ;
      AV77TFFasAcab = "" ;
      AV80TFFasForMul_Sel = "" ;
      AV79TFFasForMul = "" ;
      AV82TFFasConPla_Sel = "" ;
      AV81TFFasConPla = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV36Session = httpContext.getWebSession();
      AV43ColumnsSelectorXML = "" ;
      AV40ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV42ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A14042FasActiva = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A7070FasSigla = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A5990FasDec2 = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      AV99Tfasprowwds_1_filterfulltext = "" ;
      AV100Tfasprowwds_2_tffasactiva_sel = "" ;
      AV101Tfasprowwds_3_tffascod = "" ;
      AV102Tfasprowwds_4_tffascod_sel = "" ;
      AV103Tfasprowwds_5_tffasdsc = "" ;
      AV104Tfasprowwds_6_tffasdsc_sel = "" ;
      AV105Tfasprowwds_7_tffassigla = "" ;
      AV106Tfasprowwds_8_tffassigla_sel = "" ;
      AV107Tfasprowwds_9_tfmaqcod = "" ;
      AV108Tfasprowwds_10_tfmaqcod_sel = "" ;
      AV109Tfasprowwds_11_tfmaqdsc = "" ;
      AV110Tfasprowwds_12_tfmaqdsc_sel = "" ;
      AV111Tfasprowwds_13_tffasdec = DecimalUtil.ZERO ;
      AV112Tfasprowwds_14_tffasdec_to = DecimalUtil.ZERO ;
      AV113Tfasprowwds_15_tffasdec2 = DecimalUtil.ZERO ;
      AV114Tfasprowwds_16_tffasdec2_to = DecimalUtil.ZERO ;
      AV119Tfasprowwds_21_tffasvelpro = DecimalUtil.ZERO ;
      AV120Tfasprowwds_22_tffasvelpro_to = DecimalUtil.ZERO ;
      AV123Tfasprowwds_25_tffasacttin = "" ;
      AV124Tfasprowwds_26_tffasacttin_sel = "" ;
      AV125Tfasprowwds_27_tffascon = "" ;
      AV126Tfasprowwds_28_tffascon_sel = "" ;
      AV127Tfasprowwds_29_tffasacab = "" ;
      AV128Tfasprowwds_30_tffasacab_sel = "" ;
      AV129Tfasprowwds_31_tffasformul = "" ;
      AV130Tfasprowwds_32_tffasformul_sel = "" ;
      AV131Tfasprowwds_33_tffasconpla = "" ;
      AV132Tfasprowwds_34_tffasconpla_sel = "" ;
      scmdbuf = "" ;
      lV99Tfasprowwds_1_filterfulltext = "" ;
      lV101Tfasprowwds_3_tffascod = "" ;
      lV103Tfasprowwds_5_tffasdsc = "" ;
      lV105Tfasprowwds_7_tffassigla = "" ;
      lV107Tfasprowwds_9_tfmaqcod = "" ;
      lV109Tfasprowwds_11_tfmaqdsc = "" ;
      lV123Tfasprowwds_25_tffasacttin = "" ;
      lV125Tfasprowwds_27_tffascon = "" ;
      lV127Tfasprowwds_29_tffasacab = "" ;
      lV129Tfasprowwds_31_tffasformul = "" ;
      lV131Tfasprowwds_33_tffasconpla = "" ;
      P081W2_A396EmprCod = new String[] {""} ;
      P081W2_A4299FasConPla = new String[] {""} ;
      P081W2_n4299FasConPla = new boolean[] {false} ;
      P081W2_A4286FasForMul = new String[] {""} ;
      P081W2_n4286FasForMul = new boolean[] {false} ;
      P081W2_A4903FasAcab = new String[] {""} ;
      P081W2_n4903FasAcab = new boolean[] {false} ;
      P081W2_A458FasCon = new String[] {""} ;
      P081W2_n458FasCon = new boolean[] {false} ;
      P081W2_A456FasActTin = new String[] {""} ;
      P081W2_n456FasActTin = new boolean[] {false} ;
      P081W2_A464FasNumPas = new short[1] ;
      P081W2_n464FasNumPas = new boolean[] {false} ;
      P081W2_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081W2_n472FasVelPro = new boolean[] {false} ;
      P081W2_A468FasPrePie = new short[1] ;
      P081W2_n468FasPrePie = new boolean[] {false} ;
      P081W2_A469FasPreSal = new short[1] ;
      P081W2_n469FasPreSal = new boolean[] {false} ;
      P081W2_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081W2_n5990FasDec2 = new boolean[] {false} ;
      P081W2_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081W2_n459FasDec = new boolean[] {false} ;
      P081W2_A606MaqDsc = new String[] {""} ;
      P081W2_n606MaqDsc = new boolean[] {false} ;
      P081W2_A602MaqCod = new String[] {""} ;
      P081W2_n602MaqCod = new boolean[] {false} ;
      P081W2_A7070FasSigla = new String[] {""} ;
      P081W2_n7070FasSigla = new boolean[] {false} ;
      P081W2_A460FasDsc = new String[] {""} ;
      P081W2_A457FasCod = new String[] {""} ;
      P081W2_A14042FasActiva = new String[] {""} ;
      A396EmprCod = "" ;
      AV44UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV41ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasprowwexport__default(),
         new Object[] {
             new Object[] {
            P081W2_A396EmprCod, P081W2_A4299FasConPla, P081W2_n4299FasConPla, P081W2_A4286FasForMul, P081W2_n4286FasForMul, P081W2_A4903FasAcab, P081W2_n4903FasAcab, P081W2_A458FasCon, P081W2_n458FasCon, P081W2_A456FasActTin,
            P081W2_n456FasActTin, P081W2_A464FasNumPas, P081W2_n464FasNumPas, P081W2_A472FasVelPro, P081W2_n472FasVelPro, P081W2_A468FasPrePie, P081W2_n468FasPrePie, P081W2_A469FasPreSal, P081W2_n469FasPreSal, P081W2_A5990FasDec2,
            P081W2_n5990FasDec2, P081W2_A459FasDec, P081W2_n459FasDec, P081W2_A606MaqDsc, P081W2_n606MaqDsc, P081W2_A602MaqCod, P081W2_n602MaqCod, P081W2_A7070FasSigla, P081W2_n7070FasSigla, P081W2_A460FasDsc,
            P081W2_A457FasCod, P081W2_A14042FasActiva
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV65TFFasPreSal ;
   private short AV66TFFasPreSal_To ;
   private short AV67TFFasPrePie ;
   private short AV68TFFasPrePie_To ;
   private short AV71TFFasNumPas ;
   private short AV72TFFasNumPas_To ;
   private short GXv_int3[] ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short AV115Tfasprowwds_17_tffaspresal ;
   private short AV116Tfasprowwds_18_tffaspresal_to ;
   private short AV117Tfasprowwds_19_tffasprepie ;
   private short AV118Tfasprowwds_20_tffasprepie_to ;
   private short AV121Tfasprowwds_23_tffasnumpas ;
   private short AV122Tfasprowwds_24_tffasnumpas_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV97GXV1 ;
   private int AV133GXV2 ;
   private long AV48VisibleColumnCount ;
   private java.math.BigDecimal AV61TFFasDec ;
   private java.math.BigDecimal AV62TFFasDec_To ;
   private java.math.BigDecimal AV63TFFasDec2 ;
   private java.math.BigDecimal AV64TFFasDec2_To ;
   private java.math.BigDecimal AV69TFFasVelPro ;
   private java.math.BigDecimal AV70TFFasVelPro_To ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A5990FasDec2 ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal AV111Tfasprowwds_13_tffasdec ;
   private java.math.BigDecimal AV112Tfasprowwds_14_tffasdec_to ;
   private java.math.BigDecimal AV113Tfasprowwds_15_tffasdec2 ;
   private java.math.BigDecimal AV114Tfasprowwds_16_tffasdec2_to ;
   private java.math.BigDecimal AV119Tfasprowwds_21_tffasvelpro ;
   private java.math.BigDecimal AV120Tfasprowwds_22_tffasvelpro_to ;
   private String AV94TFFasActiva_Sel ;
   private String AV52TFFasCod_Sel ;
   private String AV51TFFasCod ;
   private String AV54TFFasDsc_Sel ;
   private String AV53TFFasDsc ;
   private String AV56TFFasSigla_Sel ;
   private String AV55TFFasSigla ;
   private String AV58TFMaqCod_Sel ;
   private String AV57TFMaqCod ;
   private String AV60TFMaqDsc_Sel ;
   private String AV59TFMaqDsc ;
   private String AV74TFFasActTin_Sel ;
   private String AV73TFFasActTin ;
   private String AV76TFFasCon_Sel ;
   private String AV75TFFasCon ;
   private String AV78TFFasAcab_Sel ;
   private String AV77TFFasAcab ;
   private String AV80TFFasForMul_Sel ;
   private String AV79TFFasForMul ;
   private String AV82TFFasConPla_Sel ;
   private String AV81TFFasConPla ;
   private String A14042FasActiva ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A7070FasSigla ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A4299FasConPla ;
   private String AV100Tfasprowwds_2_tffasactiva_sel ;
   private String AV101Tfasprowwds_3_tffascod ;
   private String AV102Tfasprowwds_4_tffascod_sel ;
   private String AV103Tfasprowwds_5_tffasdsc ;
   private String AV104Tfasprowwds_6_tffasdsc_sel ;
   private String AV105Tfasprowwds_7_tffassigla ;
   private String AV106Tfasprowwds_8_tffassigla_sel ;
   private String AV107Tfasprowwds_9_tfmaqcod ;
   private String AV108Tfasprowwds_10_tfmaqcod_sel ;
   private String AV109Tfasprowwds_11_tfmaqdsc ;
   private String AV110Tfasprowwds_12_tfmaqdsc_sel ;
   private String AV123Tfasprowwds_25_tffasacttin ;
   private String AV124Tfasprowwds_26_tffasacttin_sel ;
   private String AV125Tfasprowwds_27_tffascon ;
   private String AV126Tfasprowwds_28_tffascon_sel ;
   private String AV127Tfasprowwds_29_tffasacab ;
   private String AV128Tfasprowwds_30_tffasacab_sel ;
   private String AV129Tfasprowwds_31_tffasformul ;
   private String AV130Tfasprowwds_32_tffasformul_sel ;
   private String AV131Tfasprowwds_33_tffasconpla ;
   private String AV132Tfasprowwds_34_tffasconpla_sel ;
   private String scmdbuf ;
   private String lV101Tfasprowwds_3_tffascod ;
   private String lV103Tfasprowwds_5_tffasdsc ;
   private String lV105Tfasprowwds_7_tffassigla ;
   private String lV107Tfasprowwds_9_tfmaqcod ;
   private String lV109Tfasprowwds_11_tfmaqdsc ;
   private String lV123Tfasprowwds_25_tffasacttin ;
   private String lV125Tfasprowwds_27_tffascon ;
   private String lV127Tfasprowwds_29_tffasacab ;
   private String lV129Tfasprowwds_31_tffasformul ;
   private String lV131Tfasprowwds_33_tffasconpla ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n4299FasConPla ;
   private boolean n4286FasForMul ;
   private boolean n4903FasAcab ;
   private boolean n458FasCon ;
   private boolean n456FasActTin ;
   private boolean n464FasNumPas ;
   private boolean n472FasVelPro ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n5990FasDec2 ;
   private boolean n459FasDec ;
   private boolean n606MaqDsc ;
   private boolean n602MaqCod ;
   private boolean n7070FasSigla ;
   private String AV43ColumnsSelectorXML ;
   private String AV44UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV90FilterFullText ;
   private String AV99Tfasprowwds_1_filterfulltext ;
   private String lV99Tfasprowwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P081W2_A396EmprCod ;
   private String[] P081W2_A4299FasConPla ;
   private boolean[] P081W2_n4299FasConPla ;
   private String[] P081W2_A4286FasForMul ;
   private boolean[] P081W2_n4286FasForMul ;
   private String[] P081W2_A4903FasAcab ;
   private boolean[] P081W2_n4903FasAcab ;
   private String[] P081W2_A458FasCon ;
   private boolean[] P081W2_n458FasCon ;
   private String[] P081W2_A456FasActTin ;
   private boolean[] P081W2_n456FasActTin ;
   private short[] P081W2_A464FasNumPas ;
   private boolean[] P081W2_n464FasNumPas ;
   private java.math.BigDecimal[] P081W2_A472FasVelPro ;
   private boolean[] P081W2_n472FasVelPro ;
   private short[] P081W2_A468FasPrePie ;
   private boolean[] P081W2_n468FasPrePie ;
   private short[] P081W2_A469FasPreSal ;
   private boolean[] P081W2_n469FasPreSal ;
   private java.math.BigDecimal[] P081W2_A5990FasDec2 ;
   private boolean[] P081W2_n5990FasDec2 ;
   private java.math.BigDecimal[] P081W2_A459FasDec ;
   private boolean[] P081W2_n459FasDec ;
   private String[] P081W2_A606MaqDsc ;
   private boolean[] P081W2_n606MaqDsc ;
   private String[] P081W2_A602MaqCod ;
   private boolean[] P081W2_n602MaqCod ;
   private String[] P081W2_A7070FasSigla ;
   private boolean[] P081W2_n7070FasSigla ;
   private String[] P081W2_A460FasDsc ;
   private String[] P081W2_A457FasCod ;
   private String[] P081W2_A14042FasActiva ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV41ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV42ColumnsSelector_Column ;
}

final  class tfasprowwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P081W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV99Tfasprowwds_1_filterfulltext ,
                                          String AV100Tfasprowwds_2_tffasactiva_sel ,
                                          String AV102Tfasprowwds_4_tffascod_sel ,
                                          String AV101Tfasprowwds_3_tffascod ,
                                          String AV104Tfasprowwds_6_tffasdsc_sel ,
                                          String AV103Tfasprowwds_5_tffasdsc ,
                                          String AV106Tfasprowwds_8_tffassigla_sel ,
                                          String AV105Tfasprowwds_7_tffassigla ,
                                          String AV108Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV107Tfasprowwds_9_tfmaqcod ,
                                          String AV110Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV109Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV111Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV112Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV113Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV114Tfasprowwds_16_tffasdec2_to ,
                                          short AV115Tfasprowwds_17_tffaspresal ,
                                          short AV116Tfasprowwds_18_tffaspresal_to ,
                                          short AV117Tfasprowwds_19_tffasprepie ,
                                          short AV118Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV119Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV120Tfasprowwds_22_tffasvelpro_to ,
                                          short AV121Tfasprowwds_23_tffasnumpas ,
                                          short AV122Tfasprowwds_24_tffasnumpas_to ,
                                          String AV124Tfasprowwds_26_tffasacttin_sel ,
                                          String AV123Tfasprowwds_25_tffasacttin ,
                                          String AV126Tfasprowwds_28_tffascon_sel ,
                                          String AV125Tfasprowwds_27_tffascon ,
                                          String AV128Tfasprowwds_30_tffasacab_sel ,
                                          String AV127Tfasprowwds_29_tffasacab ,
                                          String AV130Tfasprowwds_32_tffasformul_sel ,
                                          String AV129Tfasprowwds_31_tffasformul ,
                                          String AV132Tfasprowwds_34_tffasconpla_sel ,
                                          String AV131Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[49];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasConPla, T1.FasForMul, T1.FasAcab, T1.FasCon, T1.FasActTin, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2, T1.FasDec," ;
      scmdbuf += " T2.MaqDsc, T1.MaqCod, T1.FasSigla, T1.FasDsc, T1.FasCod, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV99Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
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
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV101Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV103Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV105Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV107Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV109Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV115Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV117Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV118Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV121Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV122Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV123Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV125Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV127Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV129Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV131Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasDsc" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasActiva" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasActiva DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasSigla" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasSigla DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasDec" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasDec DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasDec2" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasDec2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasPreSal" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasPreSal DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasPrePie" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasPrePie DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasVelPro" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasVelPro DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasNumPas" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasNumPas DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasActTin" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasActTin DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCon" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCon DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasAcab" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasAcab DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasForMul" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasForMul DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasConPla" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasConPla DESC" ;
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
                  return conditional_P081W2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Boolean) dynConstraints[52]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P081W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 28);
               ((String[]) buf[30])[0] = rslt.getString(17, 8);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
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
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
      }
   }

}

