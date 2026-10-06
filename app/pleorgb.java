package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pleorgb extends GXProcedure
{
   public pleorgb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pleorgb.class ), "" );
   }

   public pleorgb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( long[] aP0 ,
                            short[] aP1 ,
                            short[] aP2 )
   {
      pleorgb.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( long[] aP0 ,
                        short[] aP1 ,
                        short[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 )
   {
      pleorgb.this.AV8Selected = aP0[0];
      this.aP0 = aP0;
      pleorgb.this.aP1 = aP1;
      pleorgb.this.aP2 = aP2;
      pleorgb.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11B = (short)(GXutil.Int( AV8Selected/ (double) (65536))) ;
      AV10G = (short)(GXutil.Int( (AV8Selected-(AV11B*65536))/ (double) (256))) ;
      AV9R = (short)(GXutil.Int( AV8Selected-(AV11B*65536)-(AV10G*256))) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pleorgb.this.AV8Selected;
      this.aP1[0] = pleorgb.this.AV9R;
      this.aP2[0] = pleorgb.this.AV10G;
      this.aP3[0] = pleorgb.this.AV11B;
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

   private short AV9R ;
   private short AV10G ;
   private short AV11B ;
   private short Gx_err ;
   private long AV8Selected ;
   private short[] aP3 ;
   private long[] aP0 ;
   private short[] aP1 ;
   private short[] aP2 ;
}

