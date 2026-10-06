package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class fputs extends GXProcedure
{
   public fputs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( fputs.class ), "" );
   }

   public fputs( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( long aP0 ,
                           String aP1 )
   {
      fputs.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             byte[] aP2 )
   {
      fputs.this.AV10InParam1 = aP0;
      fputs.this.AV9InParam2 = aP1;
      fputs.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = fputs.this.AV8IsOk;
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

   private byte AV8IsOk ;
   private short Gx_err ;
   private long AV10InParam1 ;
   private String AV9InParam2 ;
   private byte[] aP2 ;
}

