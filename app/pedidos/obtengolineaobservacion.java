package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengolineaobservacion extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      obtengolineaobservacion pgm = new obtengolineaobservacion (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      int aP1 = 0;
      byte aP2 = 0;
      String[] aP3 = new String[] {""};

      try
      {
         aP0 = (String) args[0];
         aP1 = (int) GXutil.lval( args[1]);
         aP2 = (byte) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3);
   }

   public obtengolineaobservacion( )
   {
      super( -1 , new ModelContext( obtengolineaobservacion.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public obtengolineaobservacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengolineaobservacion.class ), "" );
   }

   public obtengolineaobservacion( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 )
   {
      String[] aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String[] aP3 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.pedidos.aobtengolineaobservacion(remoteHandle, context).execute( aP0, aP1, aP2, aP3 );
      cleanup();
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
}

