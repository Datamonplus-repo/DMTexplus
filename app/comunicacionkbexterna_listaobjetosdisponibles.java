package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class comunicacionkbexterna_listaobjetosdisponibles extends GXProcedure
{
   public comunicacionkbexterna_listaobjetosdisponibles( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( comunicacionkbexterna_listaobjetosdisponibles.class ), "" );
   }

   public comunicacionkbexterna_listaobjetosdisponibles( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String aP0 )
   {
      comunicacionkbexterna_listaobjetosdisponibles.this.AV10Programa = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV10Programa, httpContext.getMessage( "tmaqui1ww", "")) == 0 )
      {
         callWebObject(formatLink("app.tmaqui1ww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else if ( GXutil.strcmp(AV10Programa, httpContext.getMessage( "tprocesww", "")) == 0 )
      {
         callWebObject(formatLink("app.ficherosbasicos.tprocesww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else if ( GXutil.strcmp(AV10Programa, httpContext.getMessage( "tfasproww", "")) == 0 )
      {
         callWebObject(formatLink("app.tfasproww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         callWebObject(formatLink("app.mensajeprocesamiento", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "verfique su solicitud, es posible alguna falla en la comunicación... reintente nuevamente ", "")+AV10Programa))}, new String[] {"Mensaje"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
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
   private String AV10Programa ;
}

