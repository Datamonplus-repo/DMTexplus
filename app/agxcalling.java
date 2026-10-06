package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class agxcalling extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      agxcalling pgm = new agxcalling (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public agxcalling( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( agxcalling.class ), "" );
   }

   public agxcalling( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV40USURCOD ;
      GXv_boolean2[0] = AV30OkItemRun ;
      GXv_char3[0] = Gx_emsg ;
      new app.facturacion.runimpressionfactura(remoteHandle, context).execute( AV16EmprCod, GXv_char1, AV25ITMID, AV27JOBID, AV14DOCID, AV15DOCLBL, AV26ITMSTS, AV37RETRYQT, AV39BASEPATH, AV38OUTPATH, AV32OUTFILE, AV33OUTURL, AV20FILENM, AV41JobData, GXv_boolean2, GXv_char3) ;
      agxcalling.this.AV40USURCOD = GXv_char1[0] ;
      agxcalling.this.AV30OkItemRun = GXv_boolean2[0] ;
      agxcalling.this.Gx_emsg = GXv_char3[0] ;
      GXv_char3[0] = AV40USURCOD ;
      GXv_boolean2[0] = AV30OkItemRun ;
      GXv_char1[0] = Gx_emsg ;
      new app.facturacion.runimpressionremessa(remoteHandle, context).execute( AV16EmprCod, GXv_char3, AV25ITMID, AV27JOBID, AV14DOCID, AV15DOCLBL, AV26ITMSTS, AV37RETRYQT, AV39BASEPATH, AV38OUTPATH, AV32OUTFILE, AV33OUTURL, AV20FILENM, AV41JobData, GXv_boolean2, GXv_char1) ;
      agxcalling.this.AV40USURCOD = GXv_char3[0] ;
      agxcalling.this.AV30OkItemRun = GXv_boolean2[0] ;
      agxcalling.this.Gx_emsg = GXv_char1[0] ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(gxcalling.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16EmprCod = "" ;
      AV40USURCOD = "" ;
      AV27JOBID = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV15DOCLBL = "" ;
      AV26ITMSTS = "" ;
      AV39BASEPATH = "" ;
      AV38OUTPATH = "" ;
      AV32OUTFILE = "" ;
      AV33OUTURL = "" ;
      AV20FILENM = "" ;
      AV41JobData = new app.asyncbatch.SdtJobParameterData(remoteHandle, context);
      Gx_emsg = "" ;
      GXv_char3 = new String[1] ;
      GXv_boolean2 = new boolean[1] ;
      GXv_char1 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV37RETRYQT ;
   private short Gx_err ;
   private long AV25ITMID ;
   private long AV14DOCID ;
   private String AV16EmprCod ;
   private String AV40USURCOD ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private boolean AV30OkItemRun ;
   private boolean GXv_boolean2[] ;
   private String AV33OUTURL ;
   private String AV15DOCLBL ;
   private String AV26ITMSTS ;
   private String AV39BASEPATH ;
   private String AV38OUTPATH ;
   private String AV32OUTFILE ;
   private String AV20FILENM ;
   private java.util.UUID AV27JOBID ;
   private app.asyncbatch.SdtJobParameterData AV41JobData ;
}

