package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cctarc extends GXProcedure
{
   public cctarc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cctarc.class ), "" );
   }

   public cctarc( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      cctarc.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      cctarc.this.AV9CCTArc_IN = aP0;
      cctarc.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8CCTArc = AV9CCTArc_IN ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = cctarc.this.AV8CCTArc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8CCTArc = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV9CCTArc_IN ;
   private String AV8CCTArc ;
   private String[] aP1 ;
}

