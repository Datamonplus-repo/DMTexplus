package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plmtskgs extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      plmtskgs pgm = new plmtskgs (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public plmtskgs( )
   {
      super( -1 , new ModelContext( plmtskgs.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public plmtskgs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plmtskgs.class ), "" );
   }

   public plmtskgs( int remoteHandle ,
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
      new app.aplmtskgs(remoteHandle, context).execute(  );
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

