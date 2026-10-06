package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wsocketerror extends GXProcedure
{
   public wsocketerror( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wsocketerror.class ), "" );
   }

   public wsocketerror( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String aP1 )
   {
      wsocketerror.this.AV8clientId = aP0;
      wsocketerror.this.AV11ErrorMessage = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( GXutil.format( "There was an error in the web socket connection: Client %1 Error %2", GXutil.trim( AV8clientId), GXutil.trim( AV11ErrorMessage), "", "", "", "", "", "", "") );
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
   private String AV8clientId ;
   private String AV11ErrorMessage ;
}

