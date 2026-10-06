package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class generarhashconarchviokey extends GXProcedure
{
   public generarhashconarchviokey( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generarhashconarchviokey.class ), "" );
   }

   public generarhashconarchviokey( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String[] aP1 )
   {
      generarhashconarchviokey.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      generarhashconarchviokey.this.AV12CadenaTexto = aP0;
      generarhashconarchviokey.this.aP1 = aP1;
      generarhashconarchviokey.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15HashGenerado = "" ;
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      generarhashconarchviokey.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      GXv_char2[0] = AV9EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV18UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      generarhashconarchviokey.this.AV9EmprCod = GXv_char2[0] ;
      generarhashconarchviokey.this.AV13EmprNom = GXv_char3[0] ;
      generarhashconarchviokey.this.AV18UsurCod = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV9EmprCod)==0) )
      {
         AV8ContCod = "HASKEY" ;
         GXt_char1 = AV17RutaArchivoKey ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pbusdsc2(remoteHandle, context).execute( AV9EmprCod, AV8ContCod, GXv_char4) ;
         generarhashconarchviokey.this.GXt_char1 = GXv_char4[0] ;
         AV17RutaArchivoKey = GXt_char1 ;
         if ( (GXutil.strcmp("", AV17RutaArchivoKey)==0) )
         {
            GXv_char4[0] = AV9EmprCod ;
            new app.registrarparametrohaskey(remoteHandle, context).execute( GXv_char4) ;
            generarhashconarchviokey.this.AV9EmprCod = GXv_char4[0] ;
            GXt_char1 = AV17RutaArchivoKey ;
            GXv_char4[0] = GXt_char1 ;
            new app.core.pbusdsc2(remoteHandle, context).execute( AV9EmprCod, AV8ContCod, GXv_char4) ;
            generarhashconarchviokey.this.GXt_char1 = GXv_char4[0] ;
            AV17RutaArchivoKey = GXt_char1 ;
         }
         if ( ! (GXutil.strcmp("", AV17RutaArchivoKey)==0) )
         {
            AV17RutaArchivoKey = GXutil.trim( AV17RutaArchivoKey) ;
            AV14File.setSource( AV17RutaArchivoKey );
            if ( AV14File.exists() )
            {
               AV16MensajeProcesamiento = "" ;
            }
            else
            {
               AV16MensajeProcesamiento = httpContext.getMessage( "No existe Archivo KEY", "") + AV17RutaArchivoKey ;
            }
         }
         else
         {
            AV16MensajeProcesamiento = httpContext.getMessage( "La parametrización del Código HASKEY, no registra nombre del archivo KEY, por favor ajustar", "") ;
         }
      }
      else
      {
         AV16MensajeProcesamiento = httpContext.getMessage( "No se detecta Terminal de Conexión. Revisar inicio de Sesión", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = generarhashconarchviokey.this.AV15HashGenerado;
      this.aP2[0] = generarhashconarchviokey.this.AV16MensajeProcesamiento;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15HashGenerado = "" ;
      AV16MensajeProcesamiento = "" ;
      AV10Station = "" ;
      AV9EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV18UsurCod = "" ;
      AV8ContCod = "" ;
      AV17RutaArchivoKey = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV14File = new com.genexus.util.GXFile();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV10Station ;
   private String AV9EmprCod ;
   private String GXv_char2[] ;
   private String AV13EmprNom ;
   private String GXv_char3[] ;
   private String AV18UsurCod ;
   private String AV8ContCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String AV12CadenaTexto ;
   private String AV15HashGenerado ;
   private String AV16MensajeProcesamiento ;
   private String AV17RutaArchivoKey ;
   private com.genexus.util.GXFile AV14File ;
   private String[] aP2 ;
   private String[] aP1 ;
}

