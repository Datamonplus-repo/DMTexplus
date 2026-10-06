package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_process extends GXProcedure
{
   public dp_process( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_process.class ), "" );
   }

   public dp_process( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDT_PROCES_PROCESSO> executeUdp( String aP0 )
   {
      dp_process.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDT_PROCES_PROCESSO>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<app.SdtSDT_PROCES_PROCESSO>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<app.SdtSDT_PROCES_PROCESSO>[] aP1 )
   {
      dp_process.this.AV8EmprCod = aP0;
      dp_process.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dp_process.this.AV9SDT_PROCES;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9SDT_PROCES = new GXBaseCollection<app.SdtSDT_PROCES_PROCESSO>(app.SdtSDT_PROCES_PROCESSO.class, "PROCESSO", "TexplusNET", remoteHandle);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8EmprCod ;
   private GXBaseCollection<app.SdtSDT_PROCES_PROCESSO>[] aP1 ;
   private GXBaseCollection<app.SdtSDT_PROCES_PROCESSO> AV9SDT_PROCES ;
}

