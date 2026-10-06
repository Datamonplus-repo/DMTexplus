package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plecbroa extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      plecbroa pgm = new plecbroa (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public plecbroa( )
   {
      super( -1 , new ModelContext( plecbroa.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public plecbroa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plecbroa.class ), "" );
   }

   public plecbroa( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.aplecbroa(remoteHandle, context).execute(  );
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

