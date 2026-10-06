package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tiempotranscurrido extends GXProcedure
{
   public tiempotranscurrido( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tiempotranscurrido.class ), "" );
   }

   public tiempotranscurrido( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( java.util.Date aP0 ,
                             java.util.Date aP1 )
   {
      tiempotranscurrido.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( java.util.Date aP0 ,
                        java.util.Date aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.util.Date aP0 ,
                             java.util.Date aP1 ,
                             String[] aP2 )
   {
      tiempotranscurrido.this.AV12FechaHoraDesde = aP0;
      tiempotranscurrido.this.AV13FechaHoraHasta = aP1;
      tiempotranscurrido.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Segundos = GXutil.dtdiff( AV13FechaHoraHasta, AV12FechaHoraDesde) ;
      if ( AV9Segundos < 3600 )
      {
         AV8mhda = (long)(GXutil.Int( AV9Segundos*60/ (double) (3600))) ;
         AV10texto = ((AV8mhda==1) ? httpContext.getMessage( "min.", "") : httpContext.getMessage( "mins.", "")) ;
      }
      else if ( AV9Segundos < 86400 )
      {
         AV8mhda = (long)(GXutil.Int( AV9Segundos*24/ (double) (86400))) ;
         AV10texto = ((AV8mhda==1) ? httpContext.getMessage( "hora", "") : httpContext.getMessage( "hrs.", "")) ;
      }
      else if ( AV9Segundos < 2592000 )
      {
         AV8mhda = (long)(GXutil.Int( AV9Segundos*30/ (double) (2592000))) ;
         AV10texto = ((AV8mhda==1) ? httpContext.getMessage( "día", "") : httpContext.getMessage( "días", "")) ;
      }
      else if ( AV9Segundos < 31104000 )
      {
         AV8mhda = (long)(GXutil.Int( AV9Segundos*12/ (double) (31104000))) ;
         AV10texto = ((AV8mhda==1) ? httpContext.getMessage( "mes", "") : httpContext.getMessage( "meses", "")) ;
      }
      else
      {
         AV8mhda = (long)(GXutil.Int( AV9Segundos/ (double) (31104000))) ;
         AV10texto = ((AV8mhda==1) ? httpContext.getMessage( "año", "") : httpContext.getMessage( "años", "")) ;
      }
      AV11TiempoTranscurrido = GXutil.trim( GXutil.str( AV8mhda, 12, 0)) + " " + AV10texto ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = tiempotranscurrido.this.AV11TiempoTranscurrido;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11TiempoTranscurrido = "" ;
      AV10texto = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV9Segundos ;
   private long AV8mhda ;
   private java.util.Date AV12FechaHoraDesde ;
   private java.util.Date AV13FechaHoraHasta ;
   private String AV11TiempoTranscurrido ;
   private String AV10texto ;
   private String[] aP2 ;
}

