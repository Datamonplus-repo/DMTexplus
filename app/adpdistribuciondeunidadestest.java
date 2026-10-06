package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adpdistribuciondeunidadestest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adpdistribuciondeunidadestest pgm = new adpdistribuciondeunidadestest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      int[] aP2 = new int[] {0};
      java.util.Date[] aP3 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP4 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP5 = new String[] {""};
      String[] aP6 = new String[] {""};
      byte[] aP7 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (int) GXutil.lval( args[2]);
         aP3[0] = (java.util.Date) localUtil.ctod( args[3], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP4[0] = (java.util.Date) localUtil.ctod( args[4], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP5[0] = (String) args[5];
         aP6[0] = (String) args[6];
         aP7[0] = (byte) GXutil.lval( args[7]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   public adpdistribuciondeunidadestest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adpdistribuciondeunidadestest.class ), "" );
   }

   public adpdistribuciondeunidadestest( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           int[] aP2 ,
                           java.util.Date[] aP3 ,
                           java.util.Date[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 )
   {
      adpdistribuciondeunidadestest.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      adpdistribuciondeunidadestest.this.AV12Emprcod = aP0[0];
      this.aP0 = aP0;
      adpdistribuciondeunidadestest.this.AV11ClienteInicial = aP1[0];
      this.aP1 = aP1;
      adpdistribuciondeunidadestest.this.AV10ClienteFinal = aP2[0];
      this.aP2 = aP2;
      adpdistribuciondeunidadestest.this.AV14FechaInicial = aP3[0];
      this.aP3 = aP3;
      adpdistribuciondeunidadestest.this.AV13FechaFinal = aP4[0];
      this.aP4 = aP4;
      adpdistribuciondeunidadestest.this.AV9ArticuloInicial = aP5[0];
      this.aP5 = aP5;
      adpdistribuciondeunidadestest.this.AV8ArticuloFinal = aP6[0];
      this.aP6 = aP6;
      adpdistribuciondeunidadestest.this.AV15Albrest = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13FechaFinal = GXutil.resetTime(GXutil.now( )) ;
      AV14FechaInicial = GXutil.addmth( AV13FechaFinal, (short)(-1)) ;
      AV15Albrest = (byte)(9) ;
      GXt_objcol_SdtSDTDistribuciondeUnidades1 = AV16sdtDistribuciondeUnidadesCollection ;
      GXv_objcol_SdtSDTDistribuciondeUnidades2[0] = GXt_objcol_SdtSDTDistribuciondeUnidades1 ;
      new app.dpdistribuciondeunidades(remoteHandle, context).execute( "001", 1, 1, AV14FechaInicial, AV13FechaFinal, " ", httpContext.getMessage( "zzzzzzzzzzzzzzzz", ""), (byte)(9), GXv_objcol_SdtSDTDistribuciondeUnidades2) ;
      GXt_objcol_SdtSDTDistribuciondeUnidades1 = GXv_objcol_SdtSDTDistribuciondeUnidades2[0] ;
      AV16sdtDistribuciondeUnidadesCollection = GXt_objcol_SdtSDTDistribuciondeUnidades1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV16sdtDistribuciondeUnidadesCollection.toxml(false, true, "SDTDistribuciondeUnidadesCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpdistribuciondeunidadestest.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = adpdistribuciondeunidadestest.this.AV12Emprcod;
      this.aP1[0] = adpdistribuciondeunidadestest.this.AV11ClienteInicial;
      this.aP2[0] = adpdistribuciondeunidadestest.this.AV10ClienteFinal;
      this.aP3[0] = adpdistribuciondeunidadestest.this.AV14FechaInicial;
      this.aP4[0] = adpdistribuciondeunidadestest.this.AV13FechaFinal;
      this.aP5[0] = adpdistribuciondeunidadestest.this.AV9ArticuloInicial;
      this.aP6[0] = adpdistribuciondeunidadestest.this.AV8ArticuloFinal;
      this.aP7[0] = adpdistribuciondeunidadestest.this.AV15Albrest;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16sdtDistribuciondeUnidadesCollection = new GXBaseCollection<app.SdtSDTDistribuciondeUnidades>(app.SdtSDTDistribuciondeUnidades.class, "SDTDistribuciondeUnidades", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTDistribuciondeUnidades1 = new GXBaseCollection<app.SdtSDTDistribuciondeUnidades>(app.SdtSDTDistribuciondeUnidades.class, "SDTDistribuciondeUnidades", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTDistribuciondeUnidades2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Albrest ;
   private short Gx_err ;
   private int AV11ClienteInicial ;
   private int AV10ClienteFinal ;
   private String AV12Emprcod ;
   private String AV9ArticuloInicial ;
   private String AV8ArticuloFinal ;
   private java.util.Date AV14FechaInicial ;
   private java.util.Date AV13FechaFinal ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private GXBaseCollection<app.SdtSDTDistribuciondeUnidades> AV16sdtDistribuciondeUnidadesCollection ;
   private GXBaseCollection<app.SdtSDTDistribuciondeUnidades> GXt_objcol_SdtSDTDistribuciondeUnidades1 ;
   private GXBaseCollection<app.SdtSDTDistribuciondeUnidades> GXv_objcol_SdtSDTDistribuciondeUnidades2[] ;
}

