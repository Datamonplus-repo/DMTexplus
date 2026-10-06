package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusemp extends GXProcedure
{
   public pbusemp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusemp.class ), "" );
   }

   public pbusemp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pbusemp.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pbusemp.this.AV23TermCod = aP0;
      pbusemp.this.aP1 = aP1;
      pbusemp.this.aP2 = aP2;
      pbusemp.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21CadenaAutenticacion = AV22WebSession.getValue("TexplusNET_Autentication") ;
      AV20SdtAutenticacion.fromJSonString(AV21CadenaAutenticacion, null);
      if ( ! (GXutil.strcmp("", AV20SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena03())==0) )
      {
         AV15EmprCod = httpContext.decrypt64( AV20SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena04(), AV20SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) ;
         AV17UsurCod = httpContext.decrypt64( AV20SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena03(), AV20SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) ;
         if ( GXutil.strcmp("NE"+GXutil.trim( AV17UsurCod), GXutil.trim( AV23TermCod)) == 0 )
         {
            GXt_char1 = AV16EmprNom ;
            GXv_char2[0] = AV15EmprCod ;
            GXv_char3[0] = GXt_char1 ;
            new app.pemprnom(remoteHandle, context).execute( GXv_char2, GXv_char3) ;
            pbusemp.this.AV15EmprCod = GXv_char2[0] ;
            pbusemp.this.GXt_char1 = GXv_char3[0] ;
            AV16EmprNom = GXt_char1 ;
         }
         else
         {
            AV16EmprNom = httpContext.getMessage( "Falla proceso PBUSEMP", "") ;
            callWebObject(formatLink("app.login", new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
      else
      {
         callWebObject(formatLink("app.login", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pbusemp.this.AV15EmprCod;
      this.aP2[0] = pbusemp.this.AV16EmprNom;
      this.aP3[0] = pbusemp.this.AV17UsurCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15EmprCod = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      AV21CadenaAutenticacion = "" ;
      AV22WebSession = httpContext.getWebSession();
      AV20SdtAutenticacion = new app.wwpbaseobjects.SdtSDTAutenticacion(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV23TermCod ;
   private String AV15EmprCod ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV21CadenaAutenticacion ;
   private com.genexus.webpanels.WebSession AV22WebSession ;
   private String[] aP3 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private app.wwpbaseobjects.SdtSDTAutenticacion AV20SdtAutenticacion ;
}

