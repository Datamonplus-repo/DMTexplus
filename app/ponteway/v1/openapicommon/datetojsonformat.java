package app.ponteway.v1.openapicommon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class datetojsonformat extends GXProcedure
{
   public datetojsonformat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( datetojsonformat.class ), "" );
   }

   public datetojsonformat( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( java.util.Date aP0 )
   {
      datetojsonformat.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( java.util.Date aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( java.util.Date aP0 ,
                             String[] aP1 )
   {
      datetojsonformat.this.AV8Date = aP0;
      datetojsonformat.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8Date)) )
      {
         AV9JsonString = "0000-00-00" ;
      }
      else
      {
         AV9JsonString = GXutil.format( "%1-%2-%3", GXutil.ltrimstr( GXutil.year( AV8Date), 9, 0), GXutil.padl( GXutil.str( GXutil.month( AV8Date), 10, 0), (short)(2), "0"), GXutil.padl( GXutil.str( GXutil.day( AV8Date), 10, 0), (short)(2), "0"), "", "", "", "", "", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = datetojsonformat.this.AV9JsonString;
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
   private String AV9JsonString ;
   private java.util.Date AV8Date ;
   private String[] aP1 ;
}

