package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodiferenciasinv extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      listadodiferenciasinv pgm = new listadodiferenciasinv (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};
      java.util.Date[] aP2 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP3 = new String[] {""};
      String[] aP4 = new String[] {""};
      String[] aP5 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
         aP2[0] = (java.util.Date) localUtil.ctod( args[2], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP3[0] = (String) args[3];
         aP4[0] = (String) args[4];
         aP5[0] = (String) args[5];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   public listadodiferenciasinv( )
   {
      super( -1 , new ModelContext( listadodiferenciasinv.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public listadodiferenciasinv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodiferenciasinv.class ), "" );
   }

   public listadodiferenciasinv( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      String[] aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      listadodiferenciasinv.this.AV2EmprCod = aP0[0];
      this.aP0 = aP0;
      listadodiferenciasinv.this.AV3ImpCod = aP1[0];
      this.aP1 = aP1;
      listadodiferenciasinv.this.AV4UFecha = aP2[0];
      this.aP2 = aP2;
      listadodiferenciasinv.this.AV5Prdnum1 = aP3[0];
      this.aP3 = aP3;
      listadodiferenciasinv.this.AV6Prdnum2 = aP4[0];
      this.aP4 = aP4;
      listadodiferenciasinv.this.AV7desvios = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP0[0] = listadodiferenciasinv.this.AV2EmprCod;
      this.aP1[0] = listadodiferenciasinv.this.AV3ImpCod;
      this.aP2[0] = listadodiferenciasinv.this.AV4UFecha;
      this.aP3[0] = listadodiferenciasinv.this.AV5Prdnum1;
      this.aP4[0] = listadodiferenciasinv.this.AV6Prdnum2;
      this.aP5[0] = listadodiferenciasinv.this.AV7desvios;
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
   private String AV2EmprCod ;
   private String AV3ImpCod ;
   private String AV5Prdnum1 ;
   private String AV6Prdnum2 ;
   private String AV7desvios ;
   private java.util.Date AV4UFecha ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
}

