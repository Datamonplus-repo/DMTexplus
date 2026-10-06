package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumcolm extends GXProcedure
{
   public pnumcolm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumcolm.class ), "" );
   }

   public pnumcolm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( int[] aP0 )
   {
      pnumcolm.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( int[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int[] aP0 ,
                             int[] aP1 )
   {
      pnumcolm.this.AV9Colnum = aP0[0];
      this.aP0 = aP0;
      pnumcolm.this.AV8Forcolnum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Forcolnum = AV9Colnum ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumcolm.this.AV9Colnum;
      this.aP1[0] = pnumcolm.this.AV8Forcolnum;
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
   private int AV9Colnum ;
   private int AV8Forcolnum ;
   private int[] aP1 ;
   private int[] aP0 ;
}

