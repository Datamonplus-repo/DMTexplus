package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psedimpcar extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      psedimpcar pgm = new psedimpcar (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public psedimpcar( )
   {
      super( -1 , new ModelContext( psedimpcar.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public psedimpcar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psedimpcar.class ), "" );
   }

   public psedimpcar( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      String[] aP1 = new String[] {""};
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
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.apsedimpcar(remoteHandle, context).execute( aP0, aP1 );
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

