package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rpr0001r extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      rpr0001r pgm = new rpr0001r (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      java.util.Date[] aP1 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP2 = new String[] {""};
      int[] aP3 = new int[] {0};
      java.util.Date[] aP4 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP5 = new String[] {""};
      int[] aP6 = new int[] {0};
      String[] aP7 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (java.util.Date) localUtil.ctod( args[1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP2[0] = (String) args[2];
         aP3[0] = (int) GXutil.lval( args[3]);
         aP4[0] = (java.util.Date) localUtil.ctod( args[4], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP5[0] = (String) args[5];
         aP6[0] = (int) GXutil.lval( args[6]);
         aP7[0] = (String) args[7];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   public rpr0001r( )
   {
      super( -1 , new ModelContext( rpr0001r.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public rpr0001r( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rpr0001r.class ), "" );
   }

   public rpr0001r( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 )
   {
      String[] aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 )
   {
      rpr0001r.this.AV2EmprCod = aP0[0];
      this.aP0 = aP0;
      rpr0001r.this.AV3Pfec = aP1[0];
      this.aP1 = aP1;
      rpr0001r.this.AV4Pmaq = aP2[0];
      this.aP2 = aP2;
      rpr0001r.this.AV5Poper = aP3[0];
      this.aP3 = aP3;
      rpr0001r.this.AV6Ufec = aP4[0];
      this.aP4 = aP4;
      rpr0001r.this.AV7Umaq = aP5[0];
      this.aP5 = aP5;
      rpr0001r.this.AV8Uoper = aP6[0];
      this.aP6 = aP6;
      rpr0001r.this.AV9TipMaqCod = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP0[0] = rpr0001r.this.AV2EmprCod;
      this.aP1[0] = rpr0001r.this.AV3Pfec;
      this.aP2[0] = rpr0001r.this.AV4Pmaq;
      this.aP3[0] = rpr0001r.this.AV5Poper;
      this.aP4[0] = rpr0001r.this.AV6Ufec;
      this.aP5[0] = rpr0001r.this.AV7Umaq;
      this.aP6[0] = rpr0001r.this.AV8Uoper;
      this.aP7[0] = rpr0001r.this.AV9TipMaqCod;
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
   private int AV5Poper ;
   private int AV8Uoper ;
   private String AV2EmprCod ;
   private String AV4Pmaq ;
   private String AV7Umaq ;
   private String AV9TipMaqCod ;
   private java.util.Date AV3Pfec ;
   private java.util.Date AV6Ufec ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
}

