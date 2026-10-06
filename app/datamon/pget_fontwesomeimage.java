package app.datamon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_fontwesomeimage extends GXProcedure
{
   public pget_fontwesomeimage( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_fontwesomeimage.class ), "" );
   }

   public pget_fontwesomeimage( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      pget_fontwesomeimage.this.aP1 = new String[] {""};
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
      pget_fontwesomeimage.this.AV9fontawesome = aP0;
      pget_fontwesomeimage.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8html = httpContext.getMessage( "<i class=\"", "") + AV9fontawesome + httpContext.getMessage( " MPFontIconMenuSystem\"></i>", "") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pget_fontwesomeimage.this.AV8html;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8html = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8html ;
   private String AV9fontawesome ;
   private String[] aP1 ;
}

