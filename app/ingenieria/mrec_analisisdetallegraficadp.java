package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_analisisdetallegraficadp extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      mrec_analisisdetallegraficadp pgm = new mrec_analisisdetallegraficadp (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      java.util.Date aP1 = GXutil.nullDate();
      java.util.Date aP2 = GXutil.nullDate();
      GXSimpleCollection<String> aP3 = new GXSimpleCollection<String>(String.class, "internal", "");
      GXSimpleCollection<String> aP4 = new GXSimpleCollection<String>(String.class, "internal", "");
      GXSimpleCollection<String> aP5 = new GXSimpleCollection<String>(String.class, "internal", "");
      GXSimpleCollection<Short> aP6 = new GXSimpleCollection<Short>(Short.class, "internal", "");
      boolean aP7 = false;
      String aP8 = "";
      String aP9 = "";
      java.util.Date aP10 = GXutil.nullDate();
      String aP11 = "";
      @SuppressWarnings("unchecked")
      GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>[] aP12 = new GXBaseCollection[] {new GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>()};

      try
      {
         aP0 = (String) args[0];
         aP1 = (java.util.Date) localUtil.ctot( args[1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP2 = (java.util.Date) localUtil.ctot( args[2], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP7 = (boolean) GXutil.boolval( args[7]);
         aP8 = (String) args[8];
         aP9 = (String) args[9];
         aP10 = (java.util.Date) localUtil.ctot( args[10], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP11 = (String) args[11];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   public mrec_analisisdetallegraficadp( )
   {
      super( -1 , new ModelContext( mrec_analisisdetallegraficadp.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public mrec_analisisdetallegraficadp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_analisisdetallegraficadp.class ), "" );
   }

   public mrec_analisisdetallegraficadp( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT> executeUdp( String aP0 ,
                                                                                java.util.Date aP1 ,
                                                                                java.util.Date aP2 ,
                                                                                GXSimpleCollection<String> aP3 ,
                                                                                GXSimpleCollection<String> aP4 ,
                                                                                GXSimpleCollection<String> aP5 ,
                                                                                GXSimpleCollection<Short> aP6 ,
                                                                                boolean aP7 ,
                                                                                String aP8 ,
                                                                                String aP9 ,
                                                                                java.util.Date aP10 ,
                                                                                String aP11 )
   {
      GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>[] aP12 = new GXBaseCollection[] {new GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        GXSimpleCollection<String> aP3 ,
                        GXSimpleCollection<String> aP4 ,
                        GXSimpleCollection<String> aP5 ,
                        GXSimpleCollection<Short> aP6 ,
                        boolean aP7 ,
                        String aP8 ,
                        String aP9 ,
                        java.util.Date aP10 ,
                        String aP11 ,
                        GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             GXSimpleCollection<String> aP3 ,
                             GXSimpleCollection<String> aP4 ,
                             GXSimpleCollection<String> aP5 ,
                             GXSimpleCollection<Short> aP6 ,
                             boolean aP7 ,
                             String aP8 ,
                             String aP9 ,
                             java.util.Date aP10 ,
                             String aP11 ,
                             GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>[] aP12 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.ingenieria.amrec_analisisdetallegraficadp(remoteHandle, context).execute( aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12 );
      cleanup();
   }

   protected void cleanup( )
   {
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
}

