package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class atxml extends GXProcedure
{
   public atxml( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( atxml.class ), "" );
   }

   public atxml( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String aP0 ,
                           String aP1 ,
                           long aP2 )
   {
      atxml.this.aP3 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long aP2 ,
                        long[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             long[] aP3 )
   {
      atxml.this.AV10InString1 = aP0;
      atxml.this.AV11InString2 = aP1;
      atxml.this.AV8InInt = aP2;
      atxml.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12OutInt = (long)(GXutil.strSearch( AV10InString1, AV11InString2, 1)+AV8InInt) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = atxml.this.AV12OutInt;
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
   private long AV8InInt ;
   private long AV12OutInt ;
   private String AV10InString1 ;
   private String AV11InString2 ;
   private long[] aP3 ;
}

