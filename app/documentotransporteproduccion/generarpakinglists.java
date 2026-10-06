package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class generarpakinglists extends GXProcedure
{
   public generarpakinglists( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generarpakinglists.class ), "" );
   }

   public generarpakinglists( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXSimpleCollection<String> executeUdp( GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> aP0 )
   {
      generarpakinglists.this.aP1 = new GXSimpleCollection[] {new GXSimpleCollection<String>(String.class, "internal", "")};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> aP0 ,
                        GXSimpleCollection<String>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> aP0 ,
                             GXSimpleCollection<String>[] aP1 )
   {
      generarpakinglists.this.AV41ImpresionDeGuiawwSDT = aP0;
      generarpakinglists.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Copia[1-1] = httpContext.getMessage( "Original", "") ;
      AV31Copia[2-1] = httpContext.getMessage( "Duplicado", "") ;
      AV31Copia[3-1] = httpContext.getMessage( "Triplicado", "") ;
      AV31Copia[4-1] = httpContext.getMessage( "Quadriplicado", "") ;
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV41ImpresionDeGuiawwSDT.size() )
      {
         AV42ImpresionDeGuiawwSDTItem = (app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem)((app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem)AV41ImpresionDeGuiawwSDT.elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV42ImpresionDeGuiawwSDTItem.getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke(), "S") == 0 )
         {
            AV43Path = "" ;
            GXv_char1[0] = AV44Filename ;
            GXv_char2[0] = AV24ErrorMessage ;
            GXv_char3[0] = AV43Path ;
            GXv_int4[0] = AV45lmetpi ;
            new app.documentotransporteproduccion.documentodetransporteproduccion_6(remoteHandle, context).execute( AV42ImpresionDeGuiawwSDTItem.getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod(), AV42ImpresionDeGuiawwSDTItem.getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod(), AV42ImpresionDeGuiawwSDTItem.getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli(), AV42ImpresionDeGuiawwSDTItem.getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Cod_pais(), AV42ImpresionDeGuiawwSDTItem.getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch(), "", GXv_char1, GXv_char2, GXv_char3, GXv_int4) ;
            generarpakinglists.this.AV44Filename = GXv_char1[0] ;
            generarpakinglists.this.AV24ErrorMessage = GXv_char2[0] ;
            generarpakinglists.this.AV43Path = GXv_char3[0] ;
            generarpakinglists.this.AV45lmetpi = GXv_int4[0] ;
            if ( ! (GXutil.strcmp("", AV24ErrorMessage)==0) )
            {
               System.out.println( AV24ErrorMessage );
            }
            else
            {
               AV40PathXLS.add(AV43Path, 0);
            }
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = generarpakinglists.this.AV40PathXLS;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40PathXLS = new GXSimpleCollection<String>(String.class, "internal", "");
      AV31Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV31Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV42ImpresionDeGuiawwSDTItem = new app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem(remoteHandle, context);
      AV43Path = "" ;
      AV44Filename = "" ;
      GXv_char1 = new String[1] ;
      AV24ErrorMessage = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new short[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV45lmetpi ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int AV48GXV1 ;
   private int GX_I ;
   private String AV31Copia[] ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV43Path ;
   private String AV44Filename ;
   private String AV24ErrorMessage ;
   private GXSimpleCollection<String>[] aP1 ;
   private GXSimpleCollection<String> AV40PathXLS ;
   private GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> AV41ImpresionDeGuiawwSDT ;
   private app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem AV42ImpresionDeGuiawwSDTItem ;
}

