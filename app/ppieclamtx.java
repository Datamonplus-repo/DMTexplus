package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppieclamtx extends GXProcedure
{
   public ppieclamtx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppieclamtx.class ), "" );
   }

   public ppieclamtx( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           String aP2 )
   {
      ppieclamtx.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte[] aP3 )
   {
      ppieclamtx.this.A396EmprCod = aP0;
      ppieclamtx.this.A44AlbRecCod = aP1;
      ppieclamtx.this.A2159AlbRecPie = aP2;
      ppieclamtx.this.aP3 = aP3;
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
      this.aP3[0] = ppieclamtx.this.AV8AlRPieCla;
      CloseOpenCursors();
      exitApp();
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

   private byte AV8AlRPieCla ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private byte[] aP3 ;
}

