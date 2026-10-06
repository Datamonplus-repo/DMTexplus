package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class impresionfactura_mail extends GXProcedure
{
   public impresionfactura_mail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionfactura_mail.class ), "" );
   }

   public impresionfactura_mail( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              int aP1 ,
                              java.util.Date aP2 ,
                              java.util.Date aP3 ,
                              int aP4 ,
                              String aP5 ,
                              String aP6 ,
                              byte aP7 ,
                              short aP8 ,
                              byte aP9 ,
                              short aP10 ,
                              String aP11 ,
                              String aP12 ,
                              boolean aP13 )
   {
      impresionfactura_mail.this.aP14 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        int aP4 ,
                        String aP5 ,
                        String aP6 ,
                        byte aP7 ,
                        short aP8 ,
                        byte aP9 ,
                        short aP10 ,
                        String aP11 ,
                        String aP12 ,
                        boolean aP13 ,
                        boolean[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             int aP4 ,
                             String aP5 ,
                             String aP6 ,
                             byte aP7 ,
                             short aP8 ,
                             byte aP9 ,
                             short aP10 ,
                             String aP11 ,
                             String aP12 ,
                             boolean aP13 ,
                             boolean[] aP14 )
   {
      impresionfactura_mail.this.AV16EmprCod = aP0;
      impresionfactura_mail.this.AV18FacCod = aP1;
      impresionfactura_mail.this.AV19FacFch = aP2;
      impresionfactura_mail.this.AV42Fachor = aP3;
      impresionfactura_mail.this.AV10CliCod = aP4;
      impresionfactura_mail.this.AV12CliNom = aP5;
      impresionfactura_mail.this.AV35Var_Output = aP6;
      impresionfactura_mail.this.AV17F_header = aP7;
      impresionfactura_mail.this.AV9Agr_Fases = aP8;
      impresionfactura_mail.this.AV37VerSumLin = aP9;
      impresionfactura_mail.this.AV15Copias2 = aP10;
      impresionfactura_mail.this.AV26PATHPDF = aP11;
      impresionfactura_mail.this.AV11Cliemf = aP12;
      impresionfactura_mail.this.AV36VerMail = aP13;
      impresionfactura_mail.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41Factura_existe = false ;
      AV13Copia[1-1] = httpContext.getMessage( "Original", "") ;
      AV13Copia[2-1] = httpContext.getMessage( "Duplicado", "") ;
      AV13Copia[3-1] = httpContext.getMessage( "Triplicado", "") ;
      AV13Copia[4-1] = httpContext.getMessage( "Quadriplicado", "") ;
      AV33strDate = GXutil.padl( GXutil.trim( GXutil.str( GXutil.year( AV19FacFch), 10, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV19FacFch), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV19FacFch), 10, 0)), (short)(2), "0") ;
      AV32sfaccod = localUtil.format( DecimalUtil.doubleToDec(AV18FacCod), "ZZZZZZZ9") ;
      AV29ReportOutPut = GXutil.format( "%1/##CLIENTE##_%2_%3.pdf", AV26PATHPDF, GXutil.trim( AV32sfaccod), GXutil.trim( AV33strDate), "", "", "", "", "", "") ;
      AV28ReportInPut = GXutil.trim( AV26PATHPDF) ;
      AV20File.setSource( AV29ReportOutPut );
      if ( AV20File.exists() )
      {
         AV20File.delete();
      }
      AV30Sdt_MergePDF.clear();
      AV28ReportInPut = GXutil.trim( AV26PATHPDF) ;
      AV38x = (short)(1) ;
      AV21i = (short)(1) ;
      AV14Copias = AV15Copias2 ;
      while ( AV14Copias > 0 )
      {
         if ( AV21i > 5 )
         {
            AV21i = (short)(5) ;
         }
         AV34TextoCopia = AV13Copia[AV21i-1] ;
         AV25PathFile = GXutil.format( httpContext.getMessage( "%1Report_%2_%3.pdf", ""), AV28ReportInPut, GXutil.trim( AV34TextoCopia), GXutil.trim( GXutil.str( AV38x, 4, 0)), "", "", "", "", "", "") ;
         new app.pwfacm21(remoteHandle, context).execute( AV25PathFile, AV16EmprCod, AV18FacCod, "", DecimalUtil.doubleToDec(0), AV34TextoCopia, AV35Var_Output, AV17F_header, (byte)(AV9Agr_Fases), AV37VerSumLin) ;
         GXv_char1[0] = AV16EmprCod ;
         GXv_int2[0] = AV18FacCod ;
         GXv_dtime3[0] = AV42Fachor ;
         new app.pfiritems(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_dtime3) ;
         impresionfactura_mail.this.AV16EmprCod = GXv_char1[0] ;
         impresionfactura_mail.this.AV18FacCod = GXv_int2[0] ;
         impresionfactura_mail.this.AV42Fachor = GXv_dtime3[0] ;
         AV31Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
         AV31Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV25PathFile );
         AV30Sdt_MergePDF.add(AV31Sdt_MergePDF_Item, 0);
         AV38x = (short)(AV38x+1) ;
         AV21i = (short)(AV21i+1) ;
         AV14Copias = (short)(AV14Copias-1) ;
      }
      AV38x = (short)(AV38x+1) ;
      AV27ReportCliCod = localUtil.format( DecimalUtil.doubleToDec(AV10CliCod), "ZZZZZ9") ;
      AV23ListPdfJson = AV30Sdt_MergePDF.toJSonString(false) ;
      AV29ReportOutPut = GXutil.strReplace( AV29ReportOutPut, httpContext.getMessage( "##CLIENTE##", ""), GXutil.trim( AV27ReportCliCod)) ;
      AV39PathPDFFull = AV8AppTool.merge(AV23ListPdfJson, AV29ReportOutPut, true) ;
      AV41Factura_existe = true ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP14[0] = impresionfactura_mail.this.AV41Factura_existe;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV13Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV33strDate = "" ;
      AV32sfaccod = "" ;
      AV29ReportOutPut = "" ;
      AV28ReportInPut = "" ;
      AV20File = new com.genexus.util.GXFile();
      AV30Sdt_MergePDF = new GXBaseCollection<app.SdtSdt_MergePDF_PDF>(app.SdtSdt_MergePDF_PDF.class, "PDF", "TexplusNET", remoteHandle);
      AV34TextoCopia = "" ;
      AV25PathFile = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_dtime3 = new java.util.Date[1] ;
      AV31Sdt_MergePDF_Item = new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
      AV27ReportCliCod = "" ;
      AV23ListPdfJson = "" ;
      AV39PathPDFFull = "" ;
      AV8AppTool = new app.SdtAppTool(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17F_header ;
   private byte AV37VerSumLin ;
   private short AV9Agr_Fases ;
   private short AV15Copias2 ;
   private short AV38x ;
   private short AV21i ;
   private short AV14Copias ;
   private short Gx_err ;
   private int AV18FacCod ;
   private int AV10CliCod ;
   private int GXv_int2[] ;
   private int GX_I ;
   private String AV16EmprCod ;
   private String AV12CliNom ;
   private String AV35Var_Output ;
   private String AV11Cliemf ;
   private String AV13Copia[] ;
   private String AV34TextoCopia ;
   private String GXv_char1[] ;
   private java.util.Date AV42Fachor ;
   private java.util.Date GXv_dtime3[] ;
   private java.util.Date AV19FacFch ;
   private boolean AV36VerMail ;
   private boolean AV41Factura_existe ;
   private String AV23ListPdfJson ;
   private String AV26PATHPDF ;
   private String AV33strDate ;
   private String AV32sfaccod ;
   private String AV29ReportOutPut ;
   private String AV28ReportInPut ;
   private String AV25PathFile ;
   private String AV27ReportCliCod ;
   private String AV39PathPDFFull ;
   private com.genexus.util.GXFile AV20File ;
   private app.SdtAppTool AV8AppTool ;
   private boolean[] aP14 ;
   private GXBaseCollection<app.SdtSdt_MergePDF_PDF> AV30Sdt_MergePDF ;
   private app.SdtSdt_MergePDF_PDF AV31Sdt_MergePDF_Item ;
}

