package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtenerversionempresa extends GXProcedure
{
   public obtenerversionempresa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtenerversionempresa.class ), "" );
   }

   public obtenerversionempresa( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( )
   {
      obtenerversionempresa.this.aP0 = new short[] {0};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( short[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( short[] aP0 )
   {
      obtenerversionempresa.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8EmpresaTipoVersion = (short)(1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = obtenerversionempresa.this.AV8EmpresaTipoVersion;
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

   private short AV8EmpresaTipoVersion ;
   private short Gx_err ;
   private short[] aP0 ;
}

