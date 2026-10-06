package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccivaldsc extends GXProcedure
{
   public pccivaldsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccivaldsc.class ), "" );
   }

   public pccivaldsc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pccivaldsc.this.aP1 = new String[] {""};
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
      pccivaldsc.this.AV8Val = aP0[0];
      this.aP0 = aP0;
      pccivaldsc.this.AV9Dsc = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV8Val, "0") == 0 )
      {
         AV9Dsc = httpContext.getMessage( "Excelente", "") ;
      }
      else if ( GXutil.strcmp(AV8Val, "1") == 0 )
      {
         AV9Dsc = httpContext.getMessage( "Correcto", "") ;
      }
      else if ( GXutil.strcmp(AV8Val, "2") == 0 )
      {
         AV9Dsc = httpContext.getMessage( "Pasado Control", "") ;
      }
      else if ( GXutil.strcmp(AV8Val, "3") == 0 )
      {
         AV9Dsc = httpContext.getMessage( "Límite de Calidad", "") ;
      }
      else if ( GXutil.strcmp(AV8Val, "4") == 0 )
      {
         AV9Dsc = httpContext.getMessage( "Incorrecto", "") ;
      }
      else if ( GXutil.strcmp(AV8Val, "5") == 0 )
      {
         AV9Dsc = httpContext.getMessage( "Retorcedido en el Control", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccivaldsc.this.AV8Val;
      this.aP1[0] = pccivaldsc.this.AV9Dsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8Val ;
   private String AV9Dsc ;
   private String[] aP1 ;
   private String[] aP0 ;
}

