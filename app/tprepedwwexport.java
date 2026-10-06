package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprepedwwexport extends GXProcedure
{
   public tprepedwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprepedwwexport.class ), "" );
   }

   public tprepedwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tprepedwwexport.this.aP1 = new String[] {""};
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
      tprepedwwexport.this.aP0 = aP0;
      tprepedwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TPREPEDWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64FilterFullText, GXv_char5) ;
      tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV46TFEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFEmprCod_Sel, GXv_char5) ;
         tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFEmprCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFEmprCod, GXv_char5) ;
            tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV47TFPrePrvNum) && (0==AV48TFPrePrvNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "PrePrvNum", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV47TFPrePrvNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV48TFPrePrvNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV66TFPrePrvDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFPrePrvDsc_Sel, GXv_char5) ;
         tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV65TFPrePrvDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFPrePrvDsc, GXv_char5) ;
            tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFPrdNum_Sel, GXv_char5) ;
         tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFPrdNum, GXv_char5) ;
            tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV51TFPedCod) && (0==AV52TFPedCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Pedido", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV51TFPedCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV52TFPedCod_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPrePedUni)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFPrePedUni_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades Prepedido", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFPrePedUni)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54TFPrePedUni_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV56TFPrePedCon_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Confirmado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFPrePedCon_Sel, GXv_char5) ;
         tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV55TFPrePedCon)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Confirmado", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFPrePedCon, GXv_char5) ;
            tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFPrePedPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFPrePedPre_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFPrePedPre)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFPrePedPre_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFPrePedDto)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFPrePedDto_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descuento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFPrePedDto)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TFPrePedDto_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV62TFPrePedPri_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Prioridad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFPrePedPri_Sel, GXv_char5) ;
         tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV61TFPrePedPri)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Prioridad", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFPrePedPri, GXv_char5) ;
            tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPrdPreAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFPrdPreAct_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio Actual", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TFPrdPreAct)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV68TFPrdPreAct_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFTipDtoDto)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFTipDtoDto_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descuento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV69TFTipDtoDto)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprepedwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV70TFTipDtoDto_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV42VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV30Session.getValue("TPREPEDWWColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV30Session.getValue("TPREPEDWWColumnsSelector") ;
         AV34ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV73GXV1 = 1 ;
      while ( AV73GXV1 <= AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV36ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV73GXV1));
         if ( AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setColor( 11 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         AV73GXV1 = (int)(AV73GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV75Tprepedwwds_1_filterfulltext = AV64FilterFullText ;
      AV76Tprepedwwds_2_tfemprcod = AV45TFEmprCod ;
      AV77Tprepedwwds_3_tfemprcod_sel = AV46TFEmprCod_Sel ;
      AV78Tprepedwwds_4_tfpreprvnum = AV47TFPrePrvNum ;
      AV79Tprepedwwds_5_tfpreprvnum_to = AV48TFPrePrvNum_To ;
      AV80Tprepedwwds_6_tfpreprvdsc = AV65TFPrePrvDsc ;
      AV81Tprepedwwds_7_tfpreprvdsc_sel = AV66TFPrePrvDsc_Sel ;
      AV82Tprepedwwds_8_tfprdnum = AV49TFPrdNum ;
      AV83Tprepedwwds_9_tfprdnum_sel = AV50TFPrdNum_Sel ;
      AV84Tprepedwwds_10_tfpedcod = AV51TFPedCod ;
      AV85Tprepedwwds_11_tfpedcod_to = AV52TFPedCod_To ;
      AV86Tprepedwwds_12_tfprepeduni = AV53TFPrePedUni ;
      AV87Tprepedwwds_13_tfprepeduni_to = AV54TFPrePedUni_To ;
      AV88Tprepedwwds_14_tfprepedcon = AV55TFPrePedCon ;
      AV89Tprepedwwds_15_tfprepedcon_sel = AV56TFPrePedCon_Sel ;
      AV90Tprepedwwds_16_tfprepedpre = AV57TFPrePedPre ;
      AV91Tprepedwwds_17_tfprepedpre_to = AV58TFPrePedPre_To ;
      AV92Tprepedwwds_18_tfprepeddto = AV59TFPrePedDto ;
      AV93Tprepedwwds_19_tfprepeddto_to = AV60TFPrePedDto_To ;
      AV94Tprepedwwds_20_tfprepedpri = AV61TFPrePedPri ;
      AV95Tprepedwwds_21_tfprepedpri_sel = AV62TFPrePedPri_Sel ;
      AV96Tprepedwwds_22_tfprdpreact = AV67TFPrdPreAct ;
      AV97Tprepedwwds_23_tfprdpreact_to = AV68TFPrdPreAct_To ;
      AV98Tprepedwwds_24_tftipdtodto = AV69TFTipDtoDto ;
      AV99Tprepedwwds_25_tftipdtodto_to = AV70TFTipDtoDto_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV77Tprepedwwds_3_tfemprcod_sel ,
                                           AV76Tprepedwwds_2_tfemprcod ,
                                           Integer.valueOf(AV78Tprepedwwds_4_tfpreprvnum) ,
                                           Integer.valueOf(AV79Tprepedwwds_5_tfpreprvnum_to) ,
                                           AV83Tprepedwwds_9_tfprdnum_sel ,
                                           AV82Tprepedwwds_8_tfprdnum ,
                                           Integer.valueOf(AV84Tprepedwwds_10_tfpedcod) ,
                                           Integer.valueOf(AV85Tprepedwwds_11_tfpedcod_to) ,
                                           AV86Tprepedwwds_12_tfprepeduni ,
                                           AV87Tprepedwwds_13_tfprepeduni_to ,
                                           AV89Tprepedwwds_15_tfprepedcon_sel ,
                                           AV88Tprepedwwds_14_tfprepedcon ,
                                           AV90Tprepedwwds_16_tfprepedpre ,
                                           AV91Tprepedwwds_17_tfprepedpre_to ,
                                           AV92Tprepedwwds_18_tfprepeddto ,
                                           AV93Tprepedwwds_19_tfprepeddto_to ,
                                           AV95Tprepedwwds_21_tfprepedpri_sel ,
                                           AV94Tprepedwwds_20_tfprepedpri ,
                                           AV96Tprepedwwds_22_tfprdpreact ,
                                           AV97Tprepedwwds_23_tfprdpreact_to ,
                                           AV98Tprepedwwds_24_tftipdtodto ,
                                           AV99Tprepedwwds_25_tftipdtodto_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A756PrePrvNum) ,
                                           A719PrdNum ,
                                           Integer.valueOf(A658PedCod) ,
                                           A755PrePedUni ,
                                           A751PrePedCon ,
                                           A753PrePedPre ,
                                           A752PrePedDto ,
                                           A754PrePedPri ,
                                           A724PrdPreAct ,
                                           A837TipDtoDto ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV75Tprepedwwds_1_filterfulltext ,
                                           A13791PrePrvDsc ,
                                           AV81Tprepedwwds_7_tfpreprvdsc_sel ,
                                           AV80Tprepedwwds_6_tfpreprvdsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV75Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Tprepedwwds_1_filterfulltext), "%", "") ;
      lV75Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Tprepedwwds_1_filterfulltext), "%", "") ;
      lV75Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Tprepedwwds_1_filterfulltext), "%", "") ;
      lV75Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Tprepedwwds_1_filterfulltext), "%", "") ;
      lV75Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Tprepedwwds_1_filterfulltext), "%", "") ;
      lV75Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Tprepedwwds_1_filterfulltext), "%", "") ;
      lV75Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Tprepedwwds_1_filterfulltext), "%", "") ;
      lV75Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Tprepedwwds_1_filterfulltext), "%", "") ;
      lV75Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Tprepedwwds_1_filterfulltext), "%", "") ;
      lV75Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Tprepedwwds_1_filterfulltext), "%", "") ;
      lV75Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Tprepedwwds_1_filterfulltext), "%", "") ;
      lV75Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Tprepedwwds_1_filterfulltext), "%", "") ;
      lV80Tprepedwwds_6_tfpreprvdsc = GXutil.padr( GXutil.rtrim( AV80Tprepedwwds_6_tfpreprvdsc), 30, "%") ;
      lV76Tprepedwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV76Tprepedwwds_2_tfemprcod), 3, "%") ;
      lV82Tprepedwwds_8_tfprdnum = GXutil.padr( GXutil.rtrim( AV82Tprepedwwds_8_tfprdnum), 6, "%") ;
      lV88Tprepedwwds_14_tfprepedcon = GXutil.padr( GXutil.rtrim( AV88Tprepedwwds_14_tfprepedcon), 1, "%") ;
      lV94Tprepedwwds_20_tfprepedpri = GXutil.padr( GXutil.rtrim( AV94Tprepedwwds_20_tfprepedpri), 1, "%") ;
      /* Using cursor P08RI2 */
      pr_default.execute(0, new Object[] {AV75Tprepedwwds_1_filterfulltext, lV75Tprepedwwds_1_filterfulltext, lV75Tprepedwwds_1_filterfulltext, lV75Tprepedwwds_1_filterfulltext, lV75Tprepedwwds_1_filterfulltext, lV75Tprepedwwds_1_filterfulltext, lV75Tprepedwwds_1_filterfulltext, lV75Tprepedwwds_1_filterfulltext, lV75Tprepedwwds_1_filterfulltext, lV75Tprepedwwds_1_filterfulltext, lV75Tprepedwwds_1_filterfulltext, lV75Tprepedwwds_1_filterfulltext, lV75Tprepedwwds_1_filterfulltext, AV81Tprepedwwds_7_tfpreprvdsc_sel, AV80Tprepedwwds_6_tfpreprvdsc, lV80Tprepedwwds_6_tfpreprvdsc, AV81Tprepedwwds_7_tfpreprvdsc_sel, AV81Tprepedwwds_7_tfpreprvdsc_sel, lV76Tprepedwwds_2_tfemprcod, AV77Tprepedwwds_3_tfemprcod_sel, Integer.valueOf(AV78Tprepedwwds_4_tfpreprvnum), Integer.valueOf(AV79Tprepedwwds_5_tfpreprvnum_to), lV82Tprepedwwds_8_tfprdnum, AV83Tprepedwwds_9_tfprdnum_sel, Integer.valueOf(AV84Tprepedwwds_10_tfpedcod), Integer.valueOf(AV85Tprepedwwds_11_tfpedcod_to), AV86Tprepedwwds_12_tfprepeduni, AV87Tprepedwwds_13_tfprepeduni_to, lV88Tprepedwwds_14_tfprepedcon, AV89Tprepedwwds_15_tfprepedcon_sel, AV90Tprepedwwds_16_tfprepedpre, AV91Tprepedwwds_17_tfprepedpre_to, AV92Tprepedwwds_18_tfprepeddto, AV93Tprepedwwds_19_tfprepeddto_to, lV94Tprepedwwds_20_tfprepedpri, AV95Tprepedwwds_21_tfprepedpri_sel, AV96Tprepedwwds_22_tfprdpreact, AV97Tprepedwwds_23_tfprdpreact_to, AV98Tprepedwwds_24_tftipdtodto, AV99Tprepedwwds_25_tftipdtodto_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A835TipDtoCod = P08RI2_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RI2_n835TipDtoCod[0] ;
         A837TipDtoDto = P08RI2_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RI2_n837TipDtoDto[0] ;
         A724PrdPreAct = P08RI2_A724PrdPreAct[0] ;
         A754PrePedPri = P08RI2_A754PrePedPri[0] ;
         n754PrePedPri = P08RI2_n754PrePedPri[0] ;
         A752PrePedDto = P08RI2_A752PrePedDto[0] ;
         n752PrePedDto = P08RI2_n752PrePedDto[0] ;
         A753PrePedPre = P08RI2_A753PrePedPre[0] ;
         n753PrePedPre = P08RI2_n753PrePedPre[0] ;
         A751PrePedCon = P08RI2_A751PrePedCon[0] ;
         n751PrePedCon = P08RI2_n751PrePedCon[0] ;
         A755PrePedUni = P08RI2_A755PrePedUni[0] ;
         n755PrePedUni = P08RI2_n755PrePedUni[0] ;
         A658PedCod = P08RI2_A658PedCod[0] ;
         n658PedCod = P08RI2_n658PedCod[0] ;
         A719PrdNum = P08RI2_A719PrdNum[0] ;
         A756PrePrvNum = P08RI2_A756PrePrvNum[0] ;
         A396EmprCod = P08RI2_A396EmprCod[0] ;
         A13791PrePrvDsc = P08RI2_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RI2_n13791PrePrvDsc[0] ;
         A835TipDtoCod = P08RI2_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RI2_n835TipDtoCod[0] ;
         A724PrdPreAct = P08RI2_A724PrdPreAct[0] ;
         A837TipDtoDto = P08RI2_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RI2_n837TipDtoDto[0] ;
         A13791PrePrvDsc = P08RI2_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RI2_n13791PrePrvDsc[0] ;
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
         AV42VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A396EmprCod, GXv_char5) ;
            tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A756PrePrvNum );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13791PrePrvDsc, GXv_char5) ;
            tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A658PedCod );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A755PrePedUni)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A751PrePedCon, GXv_char5) ;
            tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A753PrePedPre)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A752PrePedDto)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A754PrePedPri, GXv_char5) ;
            tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A724PrdPreAct)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A837TipDtoDto)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
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
      AV34ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprCod", "", "Código Empresa", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrePrvNum", "", "PrePrvNum", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrePrvDsc", "", "Nombre", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNum", "", "Producto", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PedCod", "", "Nº Pedido", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrePedUni", "", "Unidades Prepedido", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrePedCon", "", "Confirmado", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrePedPre", "", "Precio", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrePedDto", "", "Descuento", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrePedPri", "", "Prioridad", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipDtoDto", "", "Descuento", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV38UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPREPEDWWColumnsSelector", GXv_char5) ;
      tprepedwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV38UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV35ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV35ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV35ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV30Session.getValue("TPREPEDWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPREPEDWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV30Session.getValue("TPREPEDWWGridState"), null, null);
      }
      AV16OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV100GXV2 = 1 ;
      while ( AV100GXV2 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV2));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV64FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV45TFEmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV46TFEmprCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVNUM") == 0 )
         {
            AV47TFPrePrvNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFPrePrvNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVDSC") == 0 )
         {
            AV65TFPrePrvDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVDSC_SEL") == 0 )
         {
            AV66TFPrePrvDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV49TFPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV50TFPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV51TFPedCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFPedCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDUNI") == 0 )
         {
            AV53TFPrePedUni = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFPrePedUni_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDCON") == 0 )
         {
            AV55TFPrePedCon = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDCON_SEL") == 0 )
         {
            AV56TFPrePedCon_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRE") == 0 )
         {
            AV57TFPrePedPre = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFPrePedPre_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDDTO") == 0 )
         {
            AV59TFPrePedDto = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFPrePedDto_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRI") == 0 )
         {
            AV61TFPrePedPri = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRI_SEL") == 0 )
         {
            AV62TFPrePedPri_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV67TFPrdPreAct = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV68TFPrdPreAct_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTODTO") == 0 )
         {
            AV69TFTipDtoDto = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV70TFTipDtoDto_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV100GXV2 = (int)(AV100GXV2+1) ;
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
      this.aP0[0] = tprepedwwexport.this.AV11Filename;
      this.aP1[0] = tprepedwwexport.this.AV12ErrorMessage;
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
      AV64FilterFullText = "" ;
      AV46TFEmprCod_Sel = "" ;
      AV45TFEmprCod = "" ;
      AV66TFPrePrvDsc_Sel = "" ;
      AV65TFPrePrvDsc = "" ;
      AV50TFPrdNum_Sel = "" ;
      AV49TFPrdNum = "" ;
      AV53TFPrePedUni = DecimalUtil.ZERO ;
      AV54TFPrePedUni_To = DecimalUtil.ZERO ;
      AV56TFPrePedCon_Sel = "" ;
      AV55TFPrePedCon = "" ;
      AV57TFPrePedPre = DecimalUtil.ZERO ;
      AV58TFPrePedPre_To = DecimalUtil.ZERO ;
      AV59TFPrePedDto = DecimalUtil.ZERO ;
      AV60TFPrePedDto_To = DecimalUtil.ZERO ;
      AV62TFPrePedPri_Sel = "" ;
      AV61TFPrePedPri = "" ;
      AV67TFPrdPreAct = DecimalUtil.ZERO ;
      AV68TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV69TFTipDtoDto = DecimalUtil.ZERO ;
      AV70TFTipDtoDto_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV30Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      AV34ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV36ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A13791PrePrvDsc = "" ;
      A719PrdNum = "" ;
      A755PrePedUni = DecimalUtil.ZERO ;
      A751PrePedCon = "" ;
      A753PrePedPre = DecimalUtil.ZERO ;
      A752PrePedDto = DecimalUtil.ZERO ;
      A754PrePedPri = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      AV75Tprepedwwds_1_filterfulltext = "" ;
      AV76Tprepedwwds_2_tfemprcod = "" ;
      AV77Tprepedwwds_3_tfemprcod_sel = "" ;
      AV80Tprepedwwds_6_tfpreprvdsc = "" ;
      AV81Tprepedwwds_7_tfpreprvdsc_sel = "" ;
      AV82Tprepedwwds_8_tfprdnum = "" ;
      AV83Tprepedwwds_9_tfprdnum_sel = "" ;
      AV86Tprepedwwds_12_tfprepeduni = DecimalUtil.ZERO ;
      AV87Tprepedwwds_13_tfprepeduni_to = DecimalUtil.ZERO ;
      AV88Tprepedwwds_14_tfprepedcon = "" ;
      AV89Tprepedwwds_15_tfprepedcon_sel = "" ;
      AV90Tprepedwwds_16_tfprepedpre = DecimalUtil.ZERO ;
      AV91Tprepedwwds_17_tfprepedpre_to = DecimalUtil.ZERO ;
      AV92Tprepedwwds_18_tfprepeddto = DecimalUtil.ZERO ;
      AV93Tprepedwwds_19_tfprepeddto_to = DecimalUtil.ZERO ;
      AV94Tprepedwwds_20_tfprepedpri = "" ;
      AV95Tprepedwwds_21_tfprepedpri_sel = "" ;
      AV96Tprepedwwds_22_tfprdpreact = DecimalUtil.ZERO ;
      AV97Tprepedwwds_23_tfprdpreact_to = DecimalUtil.ZERO ;
      AV98Tprepedwwds_24_tftipdtodto = DecimalUtil.ZERO ;
      AV99Tprepedwwds_25_tftipdtodto_to = DecimalUtil.ZERO ;
      lV75Tprepedwwds_1_filterfulltext = "" ;
      lV80Tprepedwwds_6_tfpreprvdsc = "" ;
      scmdbuf = "" ;
      lV76Tprepedwwds_2_tfemprcod = "" ;
      lV82Tprepedwwds_8_tfprdnum = "" ;
      lV88Tprepedwwds_14_tfprepedcon = "" ;
      lV94Tprepedwwds_20_tfprepedpri = "" ;
      P08RI2_A795PrvNum = new int[1] ;
      P08RI2_A835TipDtoCod = new byte[1] ;
      P08RI2_n835TipDtoCod = new boolean[] {false} ;
      P08RI2_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RI2_n837TipDtoDto = new boolean[] {false} ;
      P08RI2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RI2_A754PrePedPri = new String[] {""} ;
      P08RI2_n754PrePedPri = new boolean[] {false} ;
      P08RI2_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RI2_n752PrePedDto = new boolean[] {false} ;
      P08RI2_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RI2_n753PrePedPre = new boolean[] {false} ;
      P08RI2_A751PrePedCon = new String[] {""} ;
      P08RI2_n751PrePedCon = new boolean[] {false} ;
      P08RI2_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RI2_n755PrePedUni = new boolean[] {false} ;
      P08RI2_A658PedCod = new int[1] ;
      P08RI2_n658PedCod = new boolean[] {false} ;
      P08RI2_A719PrdNum = new String[] {""} ;
      P08RI2_A756PrePrvNum = new int[1] ;
      P08RI2_A396EmprCod = new String[] {""} ;
      P08RI2_A13791PrePrvDsc = new String[] {""} ;
      P08RI2_n13791PrePrvDsc = new boolean[] {false} ;
      AV38UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV35ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprepedwwexport__default(),
         new Object[] {
             new Object[] {
            P08RI2_A795PrvNum, P08RI2_A835TipDtoCod, P08RI2_n835TipDtoCod, P08RI2_A837TipDtoDto, P08RI2_n837TipDtoDto, P08RI2_A724PrdPreAct, P08RI2_A754PrePedPri, P08RI2_n754PrePedPri, P08RI2_A752PrePedDto, P08RI2_n752PrePedDto,
            P08RI2_A753PrePedPre, P08RI2_n753PrePedPre, P08RI2_A751PrePedCon, P08RI2_n751PrePedCon, P08RI2_A755PrePedUni, P08RI2_n755PrePedUni, P08RI2_A658PedCod, P08RI2_n658PedCod, P08RI2_A719PrdNum, P08RI2_A756PrePrvNum,
            P08RI2_A396EmprCod, P08RI2_A13791PrePrvDsc, P08RI2_n13791PrePrvDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A835TipDtoCod ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV47TFPrePrvNum ;
   private int AV48TFPrePrvNum_To ;
   private int AV51TFPedCod ;
   private int AV52TFPedCod_To ;
   private int AV73GXV1 ;
   private int A756PrePrvNum ;
   private int A658PedCod ;
   private int AV78Tprepedwwds_4_tfpreprvnum ;
   private int AV79Tprepedwwds_5_tfpreprvnum_to ;
   private int AV84Tprepedwwds_10_tfpedcod ;
   private int AV85Tprepedwwds_11_tfpedcod_to ;
   private int AV100GXV2 ;
   private long AV42VisibleColumnCount ;
   private java.math.BigDecimal AV53TFPrePedUni ;
   private java.math.BigDecimal AV54TFPrePedUni_To ;
   private java.math.BigDecimal AV57TFPrePedPre ;
   private java.math.BigDecimal AV58TFPrePedPre_To ;
   private java.math.BigDecimal AV59TFPrePedDto ;
   private java.math.BigDecimal AV60TFPrePedDto_To ;
   private java.math.BigDecimal AV67TFPrdPreAct ;
   private java.math.BigDecimal AV68TFPrdPreAct_To ;
   private java.math.BigDecimal AV69TFTipDtoDto ;
   private java.math.BigDecimal AV70TFTipDtoDto_To ;
   private java.math.BigDecimal A755PrePedUni ;
   private java.math.BigDecimal A753PrePedPre ;
   private java.math.BigDecimal A752PrePedDto ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A837TipDtoDto ;
   private java.math.BigDecimal AV86Tprepedwwds_12_tfprepeduni ;
   private java.math.BigDecimal AV87Tprepedwwds_13_tfprepeduni_to ;
   private java.math.BigDecimal AV90Tprepedwwds_16_tfprepedpre ;
   private java.math.BigDecimal AV91Tprepedwwds_17_tfprepedpre_to ;
   private java.math.BigDecimal AV92Tprepedwwds_18_tfprepeddto ;
   private java.math.BigDecimal AV93Tprepedwwds_19_tfprepeddto_to ;
   private java.math.BigDecimal AV96Tprepedwwds_22_tfprdpreact ;
   private java.math.BigDecimal AV97Tprepedwwds_23_tfprdpreact_to ;
   private java.math.BigDecimal AV98Tprepedwwds_24_tftipdtodto ;
   private java.math.BigDecimal AV99Tprepedwwds_25_tftipdtodto_to ;
   private String AV46TFEmprCod_Sel ;
   private String AV45TFEmprCod ;
   private String AV66TFPrePrvDsc_Sel ;
   private String AV65TFPrePrvDsc ;
   private String AV50TFPrdNum_Sel ;
   private String AV49TFPrdNum ;
   private String AV56TFPrePedCon_Sel ;
   private String AV55TFPrePedCon ;
   private String AV62TFPrePedPri_Sel ;
   private String AV61TFPrePedPri ;
   private String A396EmprCod ;
   private String A13791PrePrvDsc ;
   private String A719PrdNum ;
   private String A751PrePedCon ;
   private String A754PrePedPri ;
   private String AV76Tprepedwwds_2_tfemprcod ;
   private String AV77Tprepedwwds_3_tfemprcod_sel ;
   private String AV80Tprepedwwds_6_tfpreprvdsc ;
   private String AV81Tprepedwwds_7_tfpreprvdsc_sel ;
   private String AV82Tprepedwwds_8_tfprdnum ;
   private String AV83Tprepedwwds_9_tfprdnum_sel ;
   private String AV88Tprepedwwds_14_tfprepedcon ;
   private String AV89Tprepedwwds_15_tfprepedcon_sel ;
   private String AV94Tprepedwwds_20_tfprepedpri ;
   private String AV95Tprepedwwds_21_tfprepedpri_sel ;
   private String lV80Tprepedwwds_6_tfpreprvdsc ;
   private String scmdbuf ;
   private String lV76Tprepedwwds_2_tfemprcod ;
   private String lV82Tprepedwwds_8_tfprdnum ;
   private String lV88Tprepedwwds_14_tfprepedcon ;
   private String lV94Tprepedwwds_20_tfprepedpri ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n835TipDtoCod ;
   private boolean n837TipDtoDto ;
   private boolean n754PrePedPri ;
   private boolean n752PrePedDto ;
   private boolean n753PrePedPre ;
   private boolean n751PrePedCon ;
   private boolean n755PrePedUni ;
   private boolean n658PedCod ;
   private boolean n13791PrePrvDsc ;
   private String AV37ColumnsSelectorXML ;
   private String AV38UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV64FilterFullText ;
   private String AV75Tprepedwwds_1_filterfulltext ;
   private String lV75Tprepedwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV30Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P08RI2_A795PrvNum ;
   private byte[] P08RI2_A835TipDtoCod ;
   private boolean[] P08RI2_n835TipDtoCod ;
   private java.math.BigDecimal[] P08RI2_A837TipDtoDto ;
   private boolean[] P08RI2_n837TipDtoDto ;
   private java.math.BigDecimal[] P08RI2_A724PrdPreAct ;
   private String[] P08RI2_A754PrePedPri ;
   private boolean[] P08RI2_n754PrePedPri ;
   private java.math.BigDecimal[] P08RI2_A752PrePedDto ;
   private boolean[] P08RI2_n752PrePedDto ;
   private java.math.BigDecimal[] P08RI2_A753PrePedPre ;
   private boolean[] P08RI2_n753PrePedPre ;
   private String[] P08RI2_A751PrePedCon ;
   private boolean[] P08RI2_n751PrePedCon ;
   private java.math.BigDecimal[] P08RI2_A755PrePedUni ;
   private boolean[] P08RI2_n755PrePedUni ;
   private int[] P08RI2_A658PedCod ;
   private boolean[] P08RI2_n658PedCod ;
   private String[] P08RI2_A719PrdNum ;
   private int[] P08RI2_A756PrePrvNum ;
   private String[] P08RI2_A396EmprCod ;
   private String[] P08RI2_A13791PrePrvDsc ;
   private boolean[] P08RI2_n13791PrePrvDsc ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV35ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV36ColumnsSelector_Column ;
}

final  class tprepedwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08RI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Tprepedwwds_3_tfemprcod_sel ,
                                          String AV76Tprepedwwds_2_tfemprcod ,
                                          int AV78Tprepedwwds_4_tfpreprvnum ,
                                          int AV79Tprepedwwds_5_tfpreprvnum_to ,
                                          String AV83Tprepedwwds_9_tfprdnum_sel ,
                                          String AV82Tprepedwwds_8_tfprdnum ,
                                          int AV84Tprepedwwds_10_tfpedcod ,
                                          int AV85Tprepedwwds_11_tfpedcod_to ,
                                          java.math.BigDecimal AV86Tprepedwwds_12_tfprepeduni ,
                                          java.math.BigDecimal AV87Tprepedwwds_13_tfprepeduni_to ,
                                          String AV89Tprepedwwds_15_tfprepedcon_sel ,
                                          String AV88Tprepedwwds_14_tfprepedcon ,
                                          java.math.BigDecimal AV90Tprepedwwds_16_tfprepedpre ,
                                          java.math.BigDecimal AV91Tprepedwwds_17_tfprepedpre_to ,
                                          java.math.BigDecimal AV92Tprepedwwds_18_tfprepeddto ,
                                          java.math.BigDecimal AV93Tprepedwwds_19_tfprepeddto_to ,
                                          String AV95Tprepedwwds_21_tfprepedpri_sel ,
                                          String AV94Tprepedwwds_20_tfprepedpri ,
                                          java.math.BigDecimal AV96Tprepedwwds_22_tfprdpreact ,
                                          java.math.BigDecimal AV97Tprepedwwds_23_tfprdpreact_to ,
                                          java.math.BigDecimal AV98Tprepedwwds_24_tftipdtodto ,
                                          java.math.BigDecimal AV99Tprepedwwds_25_tftipdtodto_to ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum ,
                                          String A719PrdNum ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A755PrePedUni ,
                                          String A751PrePedCon ,
                                          java.math.BigDecimal A753PrePedPre ,
                                          java.math.BigDecimal A752PrePedDto ,
                                          String A754PrePedPri ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A837TipDtoDto ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV75Tprepedwwds_1_filterfulltext ,
                                          String A13791PrePrvDsc ,
                                          String AV81Tprepedwwds_7_tfpreprvdsc_sel ,
                                          String AV80Tprepedwwds_6_tfpreprvdsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[40];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T4.PrvNum, T2.TipDtoCod, T3.TipDtoDto, T2.PrdPreAct, T1.PrePedPri, T1.PrePedDto, T1.PrePedPre, T1.PrePedCon, T1.PrePedUni, T1.PedCod, T1.PrdNum, T1.PrePrvNum," ;
      scmdbuf += " T1.EmprCod, COALESCE( T4.PrvNom, 'Error') AS PrePrvDsc FROM (((TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN" ;
      scmdbuf += " TXPTIPDTO T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDtoCod = T2.TipDtoCod) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrePrvNum)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePrvNum,'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedUni,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePedPre,'999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedDto,'90.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.TipDtoDto,'90.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrvNom, 'Error') = ?))");
      if ( (GXutil.strcmp("", AV77Tprepedwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Tprepedwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Tprepedwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV78Tprepedwwds_4_tfpreprvnum) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV79Tprepedwwds_5_tfpreprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tprepedwwds_9_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV82Tprepedwwds_8_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tprepedwwds_9_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprepedwwds_10_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV85Tprepedwwds_11_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Tprepedwwds_12_tfprepeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Tprepedwwds_13_tfprepeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tprepedwwds_15_tfprepedcon_sel)==0) && ( ! (GXutil.strcmp("", AV88Tprepedwwds_14_tfprepedcon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tprepedwwds_15_tfprepedcon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedCon = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Tprepedwwds_16_tfprepedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Tprepedwwds_17_tfprepedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Tprepedwwds_18_tfprepeddto)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Tprepedwwds_19_tfprepeddto_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprepedwwds_21_tfprepedpri_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprepedwwds_20_tfprepedpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprepedwwds_21_tfprepedpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPri = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Tprepedwwds_22_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Tprepedwwds_23_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Tprepedwwds_24_tftipdtodto)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Tprepedwwds_25_tftipdtodto_to)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePrvNum" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePrvNum DESC" ;
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
         scmdbuf += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedUni" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedUni DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedCon" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedCon DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedPre" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedPre DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedDto" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedDto DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedPri" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedPri DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdPreAct" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdPreAct DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipDtoDto" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipDtoDto DESC" ;
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
                  return conditional_P08RI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Boolean) dynConstraints[34]).booleanValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08RI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 6);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
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
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 3);
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
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
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
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 5);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 5);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
      }
   }

}

