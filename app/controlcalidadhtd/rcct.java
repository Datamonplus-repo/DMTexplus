package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rcct extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      rcct pgm = new rcct (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      int[] aP2 = new int[] {0};
      String[] aP3 = new String[] {""};
      String[] aP4 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (int) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (String) args[4];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4);
   }

   public rcct( )
   {
      super( -1 , new ModelContext( rcct.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public rcct( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rcct.class ), "" );
   }

   public rcct( int remoteHandle ,
                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      String[] aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      rcct.this.AV2EmprCod = aP0[0];
      this.aP0 = aP0;
      rcct.this.AV3CCTIni = aP1[0];
      this.aP1 = aP1;
      rcct.this.AV4CCTFin = aP2[0];
      this.aP2 = aP2;
      rcct.this.AV5Det = aP3[0];
      this.aP3 = aP3;
      rcct.this.AV6Tipo = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP0[0] = rcct.this.AV2EmprCod;
      this.aP1[0] = rcct.this.AV3CCTIni;
      this.aP2[0] = rcct.this.AV4CCTFin;
      this.aP3[0] = rcct.this.AV5Det;
      this.aP4[0] = rcct.this.AV6Tipo;
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

   private short Gx_err ;
   private int AV3CCTIni ;
   private int AV4CCTFin ;
   private String AV2EmprCod ;
   private String AV5Det ;
   private String AV6Tipo ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
}

