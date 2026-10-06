package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plicmod extends GXProcedure
{
   public plicmod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plicmod.class ), "" );
   }

   public plicmod( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( long[] aP0 ,
                           long[] aP1 )
   {
      plicmod.this.aP2 = new long[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long[] aP0 ,
                        long[] aP1 ,
                        long[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long[] aP0 ,
                             long[] aP1 ,
                             long[] aP2 )
   {
      plicmod.this.AV8num1 = aP0[0];
      this.aP0 = aP0;
      plicmod.this.AV9num2 = aP1[0];
      this.aP1 = aP1;
      plicmod.this.AV10modnum = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10modnum = (long)(AV8num1-(GXutil.Int( AV8num1/ (double) (AV9num2))*AV9num2)) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plicmod.this.AV8num1;
      this.aP1[0] = plicmod.this.AV9num2;
      this.aP2[0] = plicmod.this.AV10modnum;
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
   private long AV8num1 ;
   private long AV9num2 ;
   private long AV10modnum ;
   private long[] aP2 ;
   private long[] aP0 ;
   private long[] aP1 ;
}

