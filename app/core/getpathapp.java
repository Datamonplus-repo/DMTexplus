package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getpathapp extends GXProcedure
{
   public getpathapp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getpathapp.class ), "" );
   }

   public getpathapp( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      getpathapp.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      getpathapp.this.AV9Lenguaje = aP0;
      getpathapp.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV9Lenguaje, "java") == 0 )
      {
         /* User Code */
          AV8PathApp = httpContext.getDefaultPath();
      }
      if ( GXutil.strcmp(AV9Lenguaje, "csharp") == 0 )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = getpathapp.this.AV8PathApp;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8PathApp = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV9Lenguaje ;
   private String AV8PathApp ;
   private String[] aP1 ;
}

