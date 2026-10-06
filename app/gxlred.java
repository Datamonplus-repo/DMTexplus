package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class gxlred extends GXProcedure
{
   public gxlred( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gxlred.class ), "" );
   }

   public gxlred( int remoteHandle ,
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
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.txpbarcadloadredundancy(remoteHandle, context).execute( ) ;
      new app.txpdevgenloadredundancy(remoteHandle, context).execute( ) ;
      new app.txpdisfasloadredundancy(remoteHandle, context).execute( ) ;
      new app.txpcprdesloadredundancy(remoteHandle, context).execute( ) ;
      new app.txpalbdetloadredundancy(remoteHandle, context).execute( ) ;
      new app.txpcesartloadredundancy(remoteHandle, context).execute( ) ;
      new app.txphojamaloadredundancy(remoteHandle, context).execute( ) ;
      new app.txplalextloadredundancy(remoteHandle, context).execute( ) ;
      new app.txplpastaloadredundancy(remoteHandle, context).execute( ) ;
      new app.txpalrpieloadredundancy(remoteHandle, context).execute( ) ;
      new app.txpalbtetloadredundancy(remoteHandle, context).execute( ) ;
      new app.txpshabloloadredundancy(remoteHandle, context).execute( ) ;
      new app.txpincproloadredundancy(remoteHandle, context).execute( ) ;
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
}

