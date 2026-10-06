package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class comunicacionkbexterna_cargarobjeto extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      comunicacionkbexterna_cargarobjeto pgm = new comunicacionkbexterna_cargarobjeto (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";
      String aP2 = "";
      String aP3 = "";

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
         aP2 = (String) args[2];
         aP3 = (String) args[3];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3);
   }

   public comunicacionkbexterna_cargarobjeto( )
   {
      super( -1 , new ModelContext( comunicacionkbexterna_cargarobjeto.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public comunicacionkbexterna_cargarobjeto( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( comunicacionkbexterna_cargarobjeto.class ), "" );
   }

   public comunicacionkbexterna_cargarobjeto( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 )
   {
      comunicacionkbexterna_cargarobjeto.this.AV2ClienteVertexEncriptado = aP0;
      comunicacionkbexterna_cargarobjeto.this.AV3KbExternaEncriptada = aP1;
      comunicacionkbexterna_cargarobjeto.this.AV4CadenaEncriptacion = aP2;
      comunicacionkbexterna_cargarobjeto.this.AV5ObjetoEncriptado = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
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
   private String AV2ClienteVertexEncriptado ;
   private String AV3KbExternaEncriptada ;
   private String AV4CadenaEncriptacion ;
   private String AV5ObjetoEncriptado ;
}

