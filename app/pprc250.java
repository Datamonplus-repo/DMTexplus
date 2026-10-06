package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc250 extends GXProcedure
{
   public pprc250( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc250.class ), "" );
   }

   public pprc250( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( long[] aP0 )
   {
      pprc250.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( long[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long[] aP0 ,
                             long[] aP1 )
   {
      pprc250.this.AV8selected = aP0[0];
      this.aP0 = aP0;
      pprc250.this.AV9ForRgb = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ForRgb = AV8selected ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc250.this.AV8selected;
      this.aP1[0] = pprc250.this.AV9ForRgb;
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
   private long AV8selected ;
   private long AV9ForRgb ;
   private long[] aP1 ;
   private long[] aP0 ;
}

