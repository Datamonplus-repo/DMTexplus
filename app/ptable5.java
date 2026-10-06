package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptable5 extends GXProcedure
{
   public ptable5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptable5.class ), "" );
   }

   public ptable5( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      ptable5.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      ptable5.this.AV8Tb2_file = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV8Tb2_file ;
      GXv_char2[0] = "" ;
      new app.core.getfile(remoteHandle, context).execute( httpContext.getMessage( "Microsoft Word:DOC", ""), GXt_char1, GXv_char2) ;
      AV8Tb2_file = GXt_char1 ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptable5.this.AV8Tb2_file;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8Tb2_file ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String[] aP0 ;
}

