package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prdftfsdoc extends GXProcedure
{
   public prdftfsdoc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prdftfsdoc.class ), "" );
   }

   public prdftfsdoc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      prdftfsdoc.this.aP1 = new String[] {""};
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
      prdftfsdoc.this.AV11PrdFTFSdocin = aP0;
      prdftfsdoc.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12PrdFTFSdocout = AV11PrdFTFSdocin ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = prdftfsdoc.this.AV12PrdFTFSdocout;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12PrdFTFSdocout = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV11PrdFTFSdocin ;
   private String AV12PrdFTFSdocout ;
   private String[] aP1 ;
}

