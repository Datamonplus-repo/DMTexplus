package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psavart extends GXProcedure
{
   public psavart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psavart.class ), "" );
   }

   public psavart( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      psavart.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      psavart.this.AV15Opcion = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Leave = " " ;
      while ( GXutil.strcmp(AV16Leave, httpContext.getMessage( "E", "")) != 0 )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psavart.this.AV15Opcion;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Leave = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV15Opcion ;
   private String AV16Leave ;
   private String[] aP0 ;
}

