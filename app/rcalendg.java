package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rcalendg extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      rcalendg pgm = new rcalendg (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};
      String[] aP2 = new String[] {""};
      short[] aP3 = new short[] {0};
      short[] aP4 = new short[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
         aP2[0] = (String) args[2];
         aP3[0] = (short) GXutil.lval( args[3]);
         aP4[0] = (short) GXutil.lval( args[4]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4);
   }

   public rcalendg( )
   {
      super( -1 , new ModelContext( rcalendg.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public rcalendg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rcalendg.class ), "" );
   }

   public rcalendg( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 ,
                            short[] aP3 )
   {
      short[] aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 )
   {
      rcalendg.this.AV2EmprCod = aP0[0];
      this.aP0 = aP0;
      rcalendg.this.AV3PMaqCod = aP1[0];
      this.aP1 = aP1;
      rcalendg.this.AV4UMaqCod = aP2[0];
      this.aP2 = aP2;
      rcalendg.this.AV5PAny = aP3[0];
      this.aP3 = aP3;
      rcalendg.this.AV6UAny = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP0[0] = rcalendg.this.AV2EmprCod;
      this.aP1[0] = rcalendg.this.AV3PMaqCod;
      this.aP2[0] = rcalendg.this.AV4UMaqCod;
      this.aP3[0] = rcalendg.this.AV5PAny;
      this.aP4[0] = rcalendg.this.AV6UAny;
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
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

   private short AV5PAny ;
   private short AV6UAny ;
   private short Gx_err ;
   private String AV2EmprCod ;
   private String AV3PMaqCod ;
   private String AV4UMaqCod ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private short[] aP4 ;
}

