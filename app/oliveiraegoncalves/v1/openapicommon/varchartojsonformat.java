package app.oliveiraegoncalves.v1.openapicommon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class varchartojsonformat extends GXProcedure
{
   public varchartojsonformat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( varchartojsonformat.class ), "" );
   }

   public varchartojsonformat( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      varchartojsonformat.this.aP1 = new String[] {""};
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
      varchartojsonformat.this.AV8Character = aP0;
      varchartojsonformat.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9JsonString = AV8Character ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = varchartojsonformat.this.AV9JsonString;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9JsonString = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8Character ;
   private String AV9JsonString ;
   private String[] aP1 ;
}

